package fc4;

/* loaded from: classes10.dex */
public final class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f261184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fc4.p f261186f;

    public m(boolean z17, java.lang.String str, fc4.p pVar) {
        this.f261184d = z17;
        this.f261185e = str;
        this.f261186f = pVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC$dealSecondCutJumpClick$1$1");
        boolean z17 = this.f261184d;
        fc4.p pVar = this.f261186f;
        if (z17) {
            dw3.u0 u0Var = dw3.u0.f244283a;
            u0Var.h(pVar.getContext(), u0Var.e("moments", this.f261185e, dw3.j0.f244218a.b()));
        } else {
            android.app.Activity context = pVar.getContext();
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_phoneix_download_url, "https://miaojian.weixin.qq.com/download/apps?channel=", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.SecondCutConfig", "SecondCutDownloadUrl: " + Zi);
            kotlin.jvm.internal.o.d(Zi);
            java.lang.String downloadUrl = Zi.concat("1106");
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(downloadUrl, "downloadUrl");
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckDownloadUtil", "download SecondCut url ".concat(downloadUrl));
            gw4.f fVar = new gw4.f(context);
            fVar.f276157b = "mmdownloadapp_zJ3ZCIGTevklRQPhnw";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        }
        pVar.getActivity().onBackPressed();
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPublishId$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        java.lang.String str = pVar.f261197i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPublishId$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        s0Var.e(str, 3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC$dealSecondCutJumpClick$1$1");
    }
}
