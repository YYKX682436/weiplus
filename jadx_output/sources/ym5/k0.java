package ym5;

/* loaded from: classes15.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ym5.k0 f463412d = new ym5.k0();

    public k0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ym5.r0.b(ym5.r0.f463485a, com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context).registerActivityLifecycleCallbacks(new ym5.j0());
        return jz5.f0.f302826a;
    }
}
