package xc1;

/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final xc1.s f453057a = new xc1.s();

    /* renamed from: b, reason: collision with root package name */
    public static final ik1.x f453058b = new ik1.x();

    public final void a(java.lang.String appId, java.lang.String data) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaToNativeCallbacksRegistry", "appId:" + appId + ", data:" + data);
        f453058b.b(appId, new xc1.r(appId, data));
    }
}
