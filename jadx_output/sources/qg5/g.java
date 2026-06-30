package qg5;

/* loaded from: classes8.dex */
public final class g implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.p f362985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f362986b;

    public g(qg5.p pVar, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f362985a = pVar;
        this.f362986b = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        qg5.p pVar = this.f362985a;
        pVar.f363129k = true;
        this.f362986b.B();
        yz5.a aVar = pVar.f363122d;
        if (aVar != null) {
            aVar.invoke();
        }
        vh0.o1 o1Var = (vh0.o1) ((jz5.n) pVar.f363123e).getValue();
        com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo agreement = (com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo) ((jz5.n) pVar.f363127i).getValue();
        vh0.p3 p3Var = (vh0.p3) o1Var;
        p3Var.getClass();
        kotlin.jvm.internal.o.g(agreement, "agreement");
        com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoUnifiedAgreementFeatureService", "accept unified agreement, version: " + agreement.f67868g + ", url: " + agreement.f67867f);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new vh0.i3(p3Var, agreement, null), 3, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRecordsAnalyzeStagingDialog", "User clicked continue button");
        qg5.p.a(pVar, pVar.b() ? 2 : 4, pVar.b());
    }
}
