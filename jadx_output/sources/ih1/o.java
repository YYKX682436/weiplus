package ih1;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ih1.u f291518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ih1.u uVar) {
        super(0);
        this.f291518d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.plugin.appbrand.service.i0 i0Var = (com.tencent.mm.plugin.appbrand.service.i0) this.f291518d.f291531b;
        i0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceWC", "[MBAd] getGlobalNativeWidgetHandler");
        com.tencent.mm.plugin.appbrand.o6 t37 = i0Var.f88685a.t3();
        com.tencent.mm.plugin.appbrand.page.z zVar = (t37 == null || !t37.J0()) ? null : t37.D1;
        if (zVar != null) {
            zVar.B(frameLayout);
        }
        return frameLayout;
    }
}
