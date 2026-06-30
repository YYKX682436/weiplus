package io.flutter.plugin.localization;

/* loaded from: classes13.dex */
public class LocalizationPlugin {
    private final android.content.Context context;
    private final io.flutter.embedding.engine.systemchannels.LocalizationChannel localizationChannel;
    final io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler localizationMessageHandler;

    public LocalizationPlugin(android.content.Context context, io.flutter.embedding.engine.systemchannels.LocalizationChannel localizationChannel) {
        io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler localizationMessageHandler = new io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler() { // from class: io.flutter.plugin.localization.LocalizationPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler
            public java.lang.String getStringResource(java.lang.String str, java.lang.String str2) {
                android.content.Context context2 = io.flutter.plugin.localization.LocalizationPlugin.this.context;
                if (str2 != null) {
                    java.util.Locale localeFromString = io.flutter.plugin.localization.LocalizationPlugin.localeFromString(str2);
                    android.content.res.Configuration configuration = new android.content.res.Configuration(io.flutter.plugin.localization.LocalizationPlugin.this.context.getResources().getConfiguration());
                    configuration.setLocale(localeFromString);
                    context2 = io.flutter.plugin.localization.LocalizationPlugin.this.context.createConfigurationContext(configuration);
                }
                int identifier = context2.getResources().getIdentifier(str, "string", io.flutter.plugin.localization.LocalizationPlugin.this.context.getPackageName());
                if (identifier != 0) {
                    return context2.getResources().getString(identifier);
                }
                return null;
            }
        };
        this.localizationMessageHandler = localizationMessageHandler;
        this.context = context;
        this.localizationChannel = localizationChannel;
        localizationChannel.setLocalizationMessageHandler(localizationMessageHandler);
    }

    public static java.util.Locale localeFromString(java.lang.String str) {
        java.util.Locale.Builder builder = new java.util.Locale.Builder();
        java.lang.String[] split = str.replace('_', '-').split("-");
        builder.setLanguage(split[0]);
        int i17 = 1;
        if (split.length > 1 && split[1].length() == 4) {
            builder.setScript(split[1]);
            i17 = 2;
        }
        if (split.length > i17 && split[i17].length() >= 2 && split[i17].length() <= 3) {
            builder.setRegion(split[i17]);
        }
        return builder.build();
    }

    public java.util.Locale resolveNativeLocale(java.util.List<java.util.Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT < 26) {
            android.os.LocaleList locales = this.context.getResources().getConfiguration().getLocales();
            for (int i17 = 0; i17 < locales.size(); i17++) {
                java.util.Locale locale = locales.get(i17);
                for (java.util.Locale locale2 : list) {
                    if (locale.equals(locale2)) {
                        return locale2;
                    }
                }
                for (java.util.Locale locale3 : list) {
                    if (locale.getLanguage().equals(locale3.toLanguageTag())) {
                        return locale3;
                    }
                }
                for (java.util.Locale locale4 : list) {
                    if (locale.getLanguage().equals(locale4.getLanguage())) {
                        return locale4;
                    }
                }
            }
            return list.get(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.LocaleList locales2 = this.context.getResources().getConfiguration().getLocales();
        int size = locales2.size();
        for (int i18 = 0; i18 < size; i18++) {
            java.util.Locale locale5 = locales2.get(i18);
            java.lang.String language = locale5.getLanguage();
            if (!locale5.getScript().isEmpty()) {
                language = language + "-" + locale5.getScript();
            }
            if (!locale5.getCountry().isEmpty()) {
                language = language + "-" + locale5.getCountry();
            }
            arrayList.add(new java.util.Locale.LanguageRange(language));
            arrayList.add(new java.util.Locale.LanguageRange(locale5.getLanguage()));
            arrayList.add(new java.util.Locale.LanguageRange(locale5.getLanguage() + "-*"));
        }
        java.util.Locale lookup = java.util.Locale.lookup(arrayList, list);
        return lookup != null ? lookup : list.get(0);
    }

    public void sendLocalesToFlutter(android.content.res.Configuration configuration) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(locales.get(i17));
        }
        this.localizationChannel.sendLocales(arrayList);
    }
}
