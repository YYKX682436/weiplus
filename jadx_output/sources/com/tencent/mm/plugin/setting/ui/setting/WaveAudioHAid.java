package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class WaveAudioHAid {
    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("voipCodec");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/WaveAudioHAid", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/setting/ui/setting/WaveAudioHAid", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native long CreateInst();

    public static native void DestroyInst(long j17);

    public static native int EstAmbSoundLevel(long j17, byte[] bArr, int i17, int i18, int i19);

    public static native int Init(long j17, int i17, int i18, int i19, int i27, int i28);

    public static native boolean IsAmbSoundTooNoisy(long j17, float f17);

    public static native int Process(long j17, byte[] bArr, byte[] bArr2, int i17);
}
