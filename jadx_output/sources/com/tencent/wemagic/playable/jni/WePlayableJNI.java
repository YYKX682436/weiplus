package com.tencent.wemagic.playable.jni;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0086 J\u0019\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0086 J\u0006\u0010\u0011\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tencent/wemagic/playable/jni/WePlayableJNI;", "", "<init>", "()V", "TAG", "", "initApi", "", "context", "Landroid/content/Context;", "cachePath", "playableCoverPackagePath", "playableBasicPackagePath", "kvReportForApp", "logId", "", "params", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "playable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WePlayableJNI {
    public static final com.tencent.wemagic.playable.jni.WePlayableJNI INSTANCE = new com.tencent.wemagic.playable.jni.WePlayableJNI();
    private static final java.lang.String TAG = "WePlayableJNI";

    static {
        uw5.a.f431764a.a("weplayable");
    }

    private WePlayableJNI() {
    }

    public final void init() {
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        boolean z17 = copyOf.length == 0;
        java.lang.String str = com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT;
        if (!z17) {
            str = java.lang.String.format(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(str);
    }

    public final native void initApi(android.content.Context context, java.lang.String cachePath, java.lang.String playableCoverPackagePath, java.lang.String playableBasicPackagePath);

    public final native void kvReportForApp(int logId, java.lang.String params);
}
