package org.chromium.base;

/* loaded from: classes13.dex */
public class PiiElider {
    private static final java.lang.String CHROME_VARIANT_INFO = "chromium-[^\\.]+\\.aab";
    private static final java.lang.String CONSOLE_ELISION = "[ELIDED:CONSOLE(0)] ELIDED CONSOLE MESSAGE";
    private static final java.lang.String DOMAIN_NAME = "(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))";
    private static final java.lang.String EMAIL_ELISION = "XXX@EMAIL.ELIDED";
    private static final java.lang.String GOOD_GTLD_CHAR = "a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef";
    private static final java.lang.String GOOD_IRI_CHAR = "a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef";
    private static final java.lang.String GTLD = "[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}";
    private static final java.lang.String HOST_NAME = "([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}";
    private static final java.lang.String INTENT = "([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+))";
    private static final java.lang.String INTENT_SCHEME = "[a-zA-Z][a-zA-Z0-9+.-]+://";
    private static final java.lang.String IP_ADDRESS = "((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))";
    private static final java.lang.String IP_ELISION = "1.2.3.4";
    private static final java.lang.String IRI = "[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}";
    private static final java.lang.String MAC_ELISION = "01:23:45:67:89:AB";
    private static final java.lang.String PATH_CHAR = "(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))";
    private static final java.lang.String PATH_COMPONENT = "((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+)";
    private static final java.lang.String PORT = "(:\\d{1,5})";
    private static final java.lang.String URI_CHAR = "([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2}))";
    private static final java.lang.String URI_ENCODED_CHAR = "(%[a-fA-F0-9]{2})";
    private static final java.lang.String URI_SCHEME = "((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)";
    private static final java.lang.String URL_ELISION = "HTTP://WEBADDRESS.ELIDED";
    private static final java.lang.String URL_OR_INTENT = "((((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)|([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+)))";
    private static final java.lang.String URL_WITH_OPTIONAL_SCHEME_AND_PORT = "(((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)";
    private static final java.util.regex.Pattern WEB_URL = java.util.regex.Pattern.compile("(\\b|^)(((((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)|([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+))))(/(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))*)?(\\b|$)");
    private static final java.util.regex.Pattern LIKELY_EXCEPTION_LOG = java.util.regex.Pattern.compile("\\sat\\s(org\\.chromium|com\\.google|java|android|com\\.android)\\.[^ ]+.|\\(chromium-[^\\.]+\\.aab[^:]+:\\d+\\)|Caused by: java\\.lang\\.(ClassNotFoundException|NoClassDefFoundError):");
    private static final java.util.regex.Pattern MAC_ADDRESS = java.util.regex.Pattern.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");
    private static final java.util.regex.Pattern CONSOLE_MSG = java.util.regex.Pattern.compile("\\[\\w*:CONSOLE.*\\].*");
    private static final java.lang.String[] APP_NAMESPACE = {"org.chromium.", "com.google.", "com.chrome."};
    private static final java.lang.String[] SYSTEM_NAMESPACE = {"android.", "com.android.", "dalvik.", "java.", "javax.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull.", "System."};

    public static java.lang.String elideConsole(java.lang.String str) {
        return CONSOLE_MSG.matcher(str).replaceAll(CONSOLE_ELISION);
    }

    public static java.lang.String elideEmail(java.lang.String str) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(str).replaceAll(EMAIL_ELISION);
    }

    public static java.lang.String elideIp(java.lang.String str) {
        return android.util.Patterns.IP_ADDRESS.matcher(str).replaceAll(IP_ELISION);
    }

    public static java.lang.String elideMac(java.lang.String str) {
        return MAC_ADDRESS.matcher(str).replaceAll(MAC_ELISION);
    }

    public static java.lang.String elideUrl(java.lang.String str) {
        if (LIKELY_EXCEPTION_LOG.matcher(str).find()) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        java.util.regex.Matcher matcher = WEB_URL.matcher(sb6);
        int i17 = 0;
        while (matcher.find(i17)) {
            int start = matcher.start();
            int end = matcher.end();
            java.lang.String substring = sb6.substring(start, end);
            if (likelyToBeAppNamespace(substring) || likelyToBeSystemNamespace(substring) || likelyToBeClassOrMethodName(substring)) {
                i17 = end;
            } else {
                sb6.replace(start, end, URL_ELISION);
                i17 = start + 24;
                matcher = WEB_URL.matcher(sb6);
            }
        }
        return sb6.toString();
    }

    public static java.lang.String getSanitizedStacktrace(java.lang.Throwable th6) {
        return sanitizeStacktrace(org.chromium.base.Log.getStackTraceString(th6));
    }

    private static boolean isClassName(java.lang.String str) {
        try {
            java.lang.Class.forName(str, false, org.chromium.base.ContextUtils.getApplicationContext().getClassLoader());
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    private static boolean likelyToBeAppNamespace(java.lang.String str) {
        for (java.lang.String str2 : APP_NAMESPACE) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean likelyToBeClassOrMethodName(java.lang.String str) {
        if (isClassName(str)) {
            return true;
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return false;
        }
        return isClassName(str.substring(0, lastIndexOf));
    }

    private static boolean likelyToBeSystemNamespace(java.lang.String str) {
        for (java.lang.String str2 : SYSTEM_NAMESPACE) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static java.lang.String sanitizeStacktrace(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        java.lang.String[] split = str.split("\\n");
        split[0] = elideUrl(split[0]);
        for (int i17 = 1; i17 < split.length; i17++) {
            if (split[i17].startsWith("Caused by:")) {
                split[i17] = elideUrl(split[i17]);
            }
        }
        return android.text.TextUtils.join("\n", split);
    }
}
