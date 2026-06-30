package vv4;

/* loaded from: classes8.dex */
public abstract class e1 {
    public static java.lang.String a(long j17) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(j17 < 3600000 ? "mm:ss" : "HH:mm:ss");
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT+0:00"));
        return simpleDateFormat.format(java.lang.Long.valueOf(j17));
    }

    public static float b(android.content.Context context) {
        float f17 = ((android.app.Activity) context).getWindow().getAttributes().screenBrightness;
        if (f17 >= 0.0f) {
            return f17;
        }
        try {
            return android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness") / 255.0f;
        } catch (java.lang.Exception unused) {
            return 0.0f;
        }
    }
}
