package iy4;

/* loaded from: classes11.dex */
public final class c implements com.tencent.wechat.aff.ext_device.c {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.ext_device.b f295935a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f295936b = new android.os.Handler(android.os.Looper.getMainLooper());

    public final void a(int i17) {
        java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            obj = com.tencent.mm.sdk.platformtools.m2.e();
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        c71.b.c(context, context.getString(i17, com.tencent.mm.sdk.platformtools.m2.d(), obj), 0, true);
    }
}
