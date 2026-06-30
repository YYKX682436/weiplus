package org.chromium.base;

/* loaded from: classes13.dex */
public class LocaleUtils {

    /* loaded from: classes13.dex */
    public static class ApisN {
        public static android.os.LocaleList prependToLocaleList(java.lang.String str, android.os.LocaleList localeList) {
            return android.os.LocaleList.forLanguageTags(java.lang.String.format("%1$s,%2$s", str, localeList.toLanguageTags().replaceFirst(java.lang.String.format("(^|,)%1$s$|%1$s,", str), "")));
        }

        public static void setConfigLocales(android.content.Context context, android.content.res.Configuration configuration, java.lang.String str) {
            configuration.setLocales(prependToLocaleList(str, context.getResources().getConfiguration().getLocales()));
        }

        public static void setLocaleList(android.content.res.Configuration configuration) {
            android.os.LocaleList.setDefault(configuration.getLocales());
        }
    }

    private LocaleUtils() {
    }

    public static java.util.Locale forLanguageTag(java.lang.String str) {
        return getUpdatedLocaleForAndroid(java.util.Locale.forLanguageTag(str));
    }

    public static java.lang.String getConfigurationLanguage(android.content.res.Configuration configuration) {
        java.util.Locale locale = configuration.locale;
        return locale != null ? locale.toLanguageTag() : "";
    }

    public static java.lang.String getContextLanguage(android.content.Context context) {
        return getConfigurationLanguage(context.getResources().getConfiguration());
    }

    private static java.lang.String getDefaultCountryCode() {
        org.chromium.base.CommandLine commandLine = org.chromium.base.CommandLine.getInstance();
        return commandLine.hasSwitch(org.chromium.base.BaseSwitches.DEFAULT_COUNTRY_CODE_AT_INSTALL) ? commandLine.getSwitchValue(org.chromium.base.BaseSwitches.DEFAULT_COUNTRY_CODE_AT_INSTALL) : java.util.Locale.getDefault().getCountry();
    }

    public static java.lang.String getDefaultLocaleListString() {
        return toLanguageTags(android.os.LocaleList.getDefault());
    }

    public static java.lang.String getDefaultLocaleString() {
        return toLanguageTag(java.util.Locale.getDefault());
    }

    public static java.lang.String getUpdatedLanguageForAndroid(java.lang.String str) {
        str.getClass();
        return !str.equals("fil") ? !str.equals("und") ? str : "" : "tl";
    }

    public static java.lang.String getUpdatedLanguageForChromium(java.lang.String str) {
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case 3365:
                if (str.equals("in")) {
                    c17 = 0;
                    break;
                }
                break;
            case 3374:
                if (str.equals("iw")) {
                    c17 = 1;
                    break;
                }
                break;
            case 3391:
                if (str.equals("ji")) {
                    c17 = 2;
                    break;
                }
                break;
            case 3405:
                if (str.equals("jw")) {
                    c17 = 3;
                    break;
                }
                break;
            case 3704:
                if (str.equals("tl")) {
                    c17 = 4;
                    break;
                }
                break;
            case 102533:
                if (str.equals("gom")) {
                    c17 = 5;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                return dm.i4.COL_ID;
            case 1:
                return "he";
            case 2:
                return "yi";
            case 3:
                return "jv";
            case 4:
                return "fil";
            case 5:
                return "kok";
            default:
                return str;
        }
    }

    public static java.util.Locale getUpdatedLocaleForAndroid(java.util.Locale locale) {
        java.lang.String language = locale.getLanguage();
        java.lang.String updatedLanguageForAndroid = getUpdatedLanguageForAndroid(language);
        return updatedLanguageForAndroid.equals(language) ? locale : new java.util.Locale.Builder().setLocale(locale).setLanguage(updatedLanguageForAndroid).build();
    }

    public static java.util.Locale getUpdatedLocaleForChromium(java.util.Locale locale) {
        java.lang.String language = locale.getLanguage();
        java.lang.String updatedLanguageForChromium = getUpdatedLanguageForChromium(language);
        return updatedLanguageForChromium.equals(language) ? locale : new java.util.Locale.Builder().setLocale(locale).setLanguage(updatedLanguageForChromium).build();
    }

    public static boolean isBaseLanguageEqual(java.lang.String str, java.lang.String str2) {
        return android.text.TextUtils.equals(toBaseLanguage(str), toBaseLanguage(str2));
    }

    public static void setDefaultLocalesFromConfiguration(android.content.res.Configuration configuration) {
        org.chromium.base.LocaleUtils.ApisN.setLocaleList(configuration);
    }

    public static java.lang.String toBaseLanguage(java.lang.String str) {
        int indexOf = str.indexOf(45);
        return indexOf < 0 ? str : str.substring(0, indexOf);
    }

    public static java.lang.String toLanguageTag(java.util.Locale locale) {
        java.lang.String updatedLanguageForChromium = getUpdatedLanguageForChromium(locale.getLanguage());
        java.lang.String country = locale.getCountry();
        if (updatedLanguageForChromium.equals("no") && country.equals("NO") && locale.getVariant().equals("NY")) {
            return "nn-NO";
        }
        if (country.isEmpty()) {
            return updatedLanguageForChromium;
        }
        return updatedLanguageForChromium + "-" + country;
    }

    public static java.lang.String toLanguageTags(android.os.LocaleList localeList) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < localeList.size(); i17++) {
            arrayList.add(toLanguageTag(getUpdatedLocaleForChromium(localeList.get(i17))));
        }
        return android.text.TextUtils.join(",", arrayList);
    }

    public static void updateConfig(android.content.Context context, android.content.res.Configuration configuration, java.lang.String str) {
        org.chromium.base.LocaleUtils.ApisN.setConfigLocales(context, configuration, str);
    }
}
