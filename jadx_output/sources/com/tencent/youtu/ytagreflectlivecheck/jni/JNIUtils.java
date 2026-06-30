package com.tencent.youtu.ytagreflectlivecheck.jni;

/* loaded from: classes14.dex */
public class JNIUtils {
    private static final java.lang.String TAG = "LightLiveCheck";

    public static com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.Timeval getTimeval(long j17) {
        return new com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.Timeval(j17 / 1000, (int) ((j17 * 1000) % 1000000));
    }
}
