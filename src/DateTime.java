import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateTime {

	@SuppressWarnings("deprecation")
	public static void test_UtilDate() throws ParseException {
		String beforeDate = "2016/04/26";
		String afterDate = "2021/04/26";
		Date date = new Date();
		System.out.println("Today's Date is: " + date);
		// Returns the number of milliseconds since January 1, 1970
		System.out.println("date.getTime(): " + date.getTime());
		System.out.println("date.getDay(): " + date.getDay());
		// Returns a value that is the result of subtracting 1900 from the year
		System.out.println("date.getYear(): " + date.getYear());
		SimpleDateFormat format = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss_zz");
		System.out.println("Formatted Date: " + format.format(date));
		SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("date.after: " + date.before(formater.parse(afterDate)));
		System.err.println("date.before: " + date.after(formater.parse(beforeDate)));

	}

	public static void test_LocalDate() {
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate: " + localDate);
		System.out.println("localDate.minusDays(5): " + localDate.minusDays(5));
		System.out.println("localDate.minusMonths(4): " + localDate.minusMonths(4));
		System.out.println("localDate.minusWeeks(3): " + localDate.minusWeeks(3));
		System.out.println("localDate.minusYears(2): " + localDate.minusYears(2));
		System.out.println(
				"localDate.minusYears().getDayOfWeek().name(): " + localDate.minusYears(2).getDayOfWeek().name());

		System.out.println("localDate.getMonth(): " + localDate.getMonth());
		System.out.println("localDate.getMonth().name(): " + localDate.getMonth().name());
		System.out.println("localDate.getMonth().getValue(): " + localDate.getMonth().getValue());
		System.out.println("localDate.getMonth().maxLength(): " + localDate.getMonth().maxLength());
		System.out.println("localDate.getMonth().minus(): " + localDate.getMonth().minus(2));
		System.out.println("localDate.getMonth().plus(): " + localDate.getMonth().plus(4));

		System.out.println("localDate.getYear(): " + localDate.getYear());
		System.out.println("localDate.getDayOfYear(): " + localDate.getDayOfYear());

		System.out.println("localDate.getDayOfMonth(): " + localDate.getDayOfMonth());
		System.out.println("localDate.getDayOfWeek(): " + localDate.getDayOfWeek());
		System.out.println("localDate.getDayOfWeek().name(): " + localDate.getDayOfWeek().name());
		System.out.println("localDate.getDayOfWeek().getValue(): " + localDate.getDayOfWeek().getValue());
		System.out.println("localDate.getDayOfWeek().minus(): " + localDate.getDayOfWeek().minus(2));
		System.out.println("localDate.getDayOfWeek().plus(): " + localDate.getDayOfWeek().plus(2));
	}

	public static void test_LocalDateTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime: " + localDateTime);
		System.out.println("localDateTime.toLocalDate(): " + localDateTime.toLocalDate());
		System.out.println("localDateTime.toLocalTime(): " + localDateTime.toLocalTime());
		System.out.println("localDateTime.withDayOfMonth(): " + localDateTime.withDayOfMonth(27));
		System.out.println("localDateTime.plusDays(): " + localDateTime.plusDays(15));

		System.out.println("1st Option: localDateTime.getDayOfYear(): " + localDateTime.getDayOfYear());
		System.out.println("2nd Option: localDateTime.get(ChronoField.DAY_OF_YEAR): "
				+ localDateTime.get(ChronoField.DAY_OF_YEAR));

		System.out.println("1st Option: localDateTime.getMinute(): " + localDateTime.getMinute());
		System.out.println("2nd Option: localDateTime.get(ChronoField.MINUTE_OF_HOUR): "
				+ localDateTime.get(ChronoField.MINUTE_OF_HOUR));

		System.out.println(localDateTime.plus(2, ChronoUnit.DAYS));

	}

	//Clock Class
	public static void test_Clock() {
		System.out.println(Clock.systemDefaultZone().getZone());
		System.out.println(Clock.systemDefaultZone().instant());
	}

	public static void test_YearAndYearMonth() {
		System.out.println("Year.now(): " + Year.now());
		System.out.println("Year.isLeap(): " + Year.isLeap(Year.now().getValue()));
		System.out.println("Year.of().length(): " + Year.of(2020).length());
		System.out.println("Year.of().atMonth(): " + Year.of(2020).atMonth(5));

		System.out.println("YearMonth.now(): " + YearMonth.now());
		System.out.println("YearMonth.now().getMonthValue(): " + YearMonth.now().getMonthValue());
		System.out.println("YearMonth.now().getYear(): " + YearMonth.now().getYear());
		System.out.println("YearMonth.of: " + YearMonth.of(1992, 07));
		System.out.println("YearMonth.of().lengthOfMonth(): " + YearMonth.of(1992, 07).lengthOfMonth());
		System.out.println("YearMonth.of().lengthOfYear(): " + YearMonth.of(1992, 07).lengthOfYear());
		System.out.println("YearMonth.of().atEndOfMonth(): " + YearMonth.of(1992, 07).atEndOfMonth());
	}

	public static void test_Period() {
		System.out.println("Period.ofMonths().getMonths(): " + Period.ofMonths(2).getMonths());
		System.out.println("Period.of: " + Period.of(2020, 07, 15));
		System.out.println("Period.of().minusMonths(): " + Period.of(2020, 07, 15).minusMonths(5));
		System.out.println("Duration.ofDays(): " + Duration.ofDays(3));
	}

	public static void test_LocaleAndNumberFormat() {
		Locale locale = Locale.GERMANY;
		System.out.println("Locale: " + locale);

		NumberFormat formater = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		System.out.println("NumberFormat: formater.format(435436757): " + formater.format(435436757));

		System.out.println(
				"NumberFormat: formater.getCurrency().getDisplayName(): " + formater.getCurrency().getDisplayName());

		System.out.println("NumberFormat.getPercentInstance(Locale.KOREAN).format(12): "
				+ NumberFormat.getPercentInstance(Locale.GERMANY).format(12));

	}

	public static void test_SimpleDateFormat() {
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		try {
			Date date = simpleDateFormat.parse("05-10-2019");
			System.out.println(" simpleDateFormat.parse(\"05-10-2019\") Date after Parsing: " + date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String pattern1 = "EEEEE dd MMMMM yyyy HH:mm:ss.SSSZ";
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1, Locale.GERMANY);
		System.out.println("new SimpleDateFormat(pattern1, Locale.GERMANY): " + simpleDateFormat1.format(new Date()));

		Date now = new Date();
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss z");

		simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println(simpleDateFormat2.format(now));

		simpleDateFormat2.setTimeZone(TimeZone.getTimeZone(ZoneId.systemDefault().getId()));
		System.out.println(simpleDateFormat2.format(now));

	}

	public static void test_DateTimeFormatter() {
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate: " + localDate);
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime: " + localTime);
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime: " + localDateTime);
		System.out.println("ZonedDateTime.now(): " + ZonedDateTime.now());

		/*
		 * System.out.println("DateTimeFormatter.BASIC_ISO_DATE.format(localDate): " +
		 * DateTimeFormatter.BASIC_ISO_DATE.format(localDate));
		 * System.out.println("DateTimeFormatter.ISO_LOCAL_DATE.format(localDate): " +
		 * DateTimeFormatter.ISO_LOCAL_DATE.format(localDate));
		 * System.out.println("DateTimeFormatter.ISO_LOCAL_TIME.format(localTime): " +
		 * DateTimeFormatter.ISO_LOCAL_TIME.format(localTime)); System.out.
		 * println("DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(localDateTime): " +
		 * DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(localDateTime)); System.out.
		 * println("DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ZonedDateTime.now()): "
		 * + DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ZonedDateTime.now()));
		 * System.out.println( "DateTimeFormatter.ISO_DATE.format(localDate): " +
		 * DateTimeFormatter.ISO_DATE.format(localDate)); System.out.println(
		 * "DateTimeFormatter.ISO_TIME.format(localTime): " +
		 * DateTimeFormatter.ISO_TIME.format(localTime));
		 * System.out.println("DateTimeFormatter.ISO_DATE_TIME.format(localDateTime): "
		 * + DateTimeFormatter.ISO_DATE_TIME.format(localDateTime));
		 * System.out.println("DateTimeFormatter.ISO_WEEK_DATE.format(localDate): " +
		 * DateTimeFormatter.ISO_WEEK_DATE.format(localDate));
		 */

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd_MMM_yyyy_hh_mm");
		System.out.println("dateTimeFormatter.format: " + dateTimeFormatter.format(ZonedDateTime.now()));

		String date = "2019-10-05";
		LocalDate ld = LocalDate.parse(date);
		System.out.println("LocalDate.parse: " + ld);

		String dateInString = "Wed, 25/12/2019";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, d/MM/yyyy", Locale.ENGLISH);
		LocalDate dateTime = LocalDate.parse(dateInString, formatter);
		System.out.println("LocalDate: " + dateTime);
	}

	public static void main(String[] args) throws ParseException {
		 //test_UtilDate();
		//test_LocalDate();
		// test_LocalDateTime();
		// test_Clock();
		// test_YearAndYearMonth();
		// test_Period();
		// test_LocaleAndNumberFormat();
		// test_SimpleDateFormat();
		//test_DateTimeFormatter();
	}

}
