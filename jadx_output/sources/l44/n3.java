package l44;

/* loaded from: classes4.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f316275d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f316275d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$2");
        l44.p3 p3Var = l44.p3.f316299a;
        p3Var.c();
        com.tencent.mars.xlog.Log.i("AdQrClickHelper", "openQr() called end! " + ((java.lang.Throwable) obj));
        l44.p3.a(p3Var, (com.tencent.mm.ui.widget.dialog.u3) this.f316275d.f310123d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$openQr$2");
        return f0Var;
    }
}
