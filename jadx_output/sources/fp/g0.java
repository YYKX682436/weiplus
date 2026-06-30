package fp;

/* loaded from: classes7.dex */
public abstract class g0 {
    public static int a(int i17) {
        return (android.os.Build.VERSION.SDK_INT >= 31 || androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH.equalsIgnoreCase(android.os.Build.VERSION.CODENAME)) ? i17 | 67108864 : i17;
    }

    public static int b(int i17) {
        return (android.os.Build.VERSION.SDK_INT >= 31 || androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH.equalsIgnoreCase(android.os.Build.VERSION.CODENAME)) ? i17 | com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62 : i17;
    }
}
