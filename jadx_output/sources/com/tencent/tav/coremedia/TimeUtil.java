package com.tencent.tav.coremedia;

/* loaded from: classes13.dex */
public class TimeUtil {
    private static final long DEVIATION = 10000;
    public static final long SECOND_TO_US = 1000000;
    public static final java.lang.String YYYY2MM2DD_HH1MM1SS = "yyyy-MM-dd HH:mm:ss";

    public static boolean equals(long j17, long j18) {
        return java.lang.Math.abs(j17 - j18) < 10000;
    }

    public static long getAudioDuration(long j17, int i17, int i18) {
        return (j17 * 1000000) / ((i17 * 2) * i18);
    }

    public static java.lang.String long2str(long j17, java.lang.String str) {
        if (str == null) {
            str = "yyyy-M-d  HH:mm";
        }
        return new java.text.SimpleDateFormat(str, java.util.Locale.getDefault()).format(new java.util.Date(j17));
    }

    public static float milli2Second(long j17) {
        return (((float) j17) * 1.0f) / 1000.0f;
    }

    public static long milli2Us(long j17) {
        return j17 * 1000;
    }

    public static java.lang.String milliToSecond(long j17) {
        return java.lang.String.format(java.util.Locale.CHINA, "%1$.1f", java.lang.Float.valueOf(java.lang.Math.round(milli2Second(j17) * 10.0f) / 10.0f));
    }

    public static long second2Ms(float f17) {
        return f17 * 1000.0f;
    }

    public static java.lang.String second2String(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i18 = i17 / 60;
        if (i18 > 0) {
            sb6.append(i18 + "'");
        }
        int i19 = i17 % 60;
        if (i19 >= 10) {
            sb6.append(i19 + "\"");
        } else if (i19 >= 0) {
            sb6.append("0" + i19 + "\"");
        }
        return sb6.toString();
    }

    public static long second2Us(float f17) {
        return f17 * 1000000.0f;
    }

    public static com.tencent.tav.coremedia.CMTime us2CMTime(long j17) {
        return new com.tencent.tav.coremedia.CMTime(us2Second(j17) * 600.0f);
    }

    public static long us2Milli(long j17) {
        return j17 / 1000;
    }

    public static float us2Second(long j17) {
        return (((float) j17) * 1.0f) / 1000000.0f;
    }

    public static java.lang.String usToSecond(long j17) {
        return java.lang.String.format(java.util.Locale.CHINA, "%1$.1f", java.lang.Float.valueOf(java.lang.Math.round(us2Second(j17) * 10.0f) / 10.0f));
    }
}
