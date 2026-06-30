package x51;

/* loaded from: classes8.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f452086a = 0;

    static {
        java.util.TimeZone.getTimeZone("GMT");
    }

    public static java.lang.String a(long j17) {
        if ((j17 >> 20) > 0) {
            return "" + (java.lang.Math.round((((float) j17) * 10.0f) / 1048576.0f) / 10.0f) + "MB";
        }
        if ((j17 >> 9) <= 0) {
            return "" + j17 + "B";
        }
        return "" + (java.lang.Math.round((((float) j17) * 10.0f) / 1024.0f) / 10.0f) + "KB";
    }

    public static boolean b(java.lang.String str) {
        return str == null || str.length() <= 0;
    }

    public static java.util.List c(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(str2).matcher(str);
        int groupCount = matcher.groupCount();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!matcher.find()) {
            return arrayList;
        }
        for (int i17 = 1; i17 <= groupCount; i17++) {
            arrayList.add(matcher.group(i17));
        }
        return arrayList;
    }
}
