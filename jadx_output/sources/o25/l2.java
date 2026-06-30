package o25;

/* loaded from: classes13.dex */
public abstract class l2 {
    public static double a(double d17, double d18, double d19, double d27) {
        double d28 = (d17 * 3.141592653589793d) / 180.0d;
        double d29 = (d19 * 3.141592653589793d) / 180.0d;
        return java.lang.Math.round(((java.lang.Math.asin(java.lang.Math.sqrt(java.lang.Math.pow(java.lang.Math.sin((d28 - d29) / 2.0d), 2.0d) + ((java.lang.Math.cos(d28) * java.lang.Math.cos(d29)) * java.lang.Math.pow(java.lang.Math.sin((((d18 - d27) * 3.141592653589793d) / 180.0d) / 2.0d), 2.0d)))) * 2.0d) * 6378137.0d) * 10000.0d) / com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
    }
}
