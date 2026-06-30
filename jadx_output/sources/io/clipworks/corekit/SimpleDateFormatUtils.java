package io.clipworks.corekit;

/* loaded from: classes12.dex */
public class SimpleDateFormatUtils {
    public static java.lang.String getTimeStringByFormatAndLocale(java.lang.String str, java.lang.String format, java.lang.String localeStr) {
        dz5.a aVar = dz5.a.f245481a;
        long parseLong = java.lang.Long.parseLong(str);
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(localeStr, "localeStr");
        java.util.Date date = new java.util.Date(parseLong);
        try {
            java.util.Locale locale = kotlin.jvm.internal.o.b(localeStr, "zh_CN") ? java.util.Locale.CHINA : kotlin.jvm.internal.o.b(localeStr, "en_US") ? java.util.Locale.US : null;
            java.lang.String format2 = new java.text.SimpleDateFormat(format, locale == null ? java.util.Locale.CHINA : locale).format(date);
            return !kotlin.jvm.internal.o.b(locale, java.util.Locale.CHINA) ? format2 : aVar.a(format2);
        } catch (java.lang.Exception e17) {
            kotlin.jvm.internal.o.m("formatTimestamp: ", e17);
            return null;
        }
    }
}
