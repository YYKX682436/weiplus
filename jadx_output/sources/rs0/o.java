package rs0;

/* loaded from: classes10.dex */
public abstract class o {
    public static final int a(android.media.MediaFormat mediaFormat, java.lang.String key, int i17) {
        kotlin.jvm.internal.o.g(mediaFormat, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        try {
            return mediaFormat.getInteger(key);
        } catch (java.lang.Exception unused) {
            return i17;
        }
    }
}
