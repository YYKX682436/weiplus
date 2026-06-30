package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes10.dex */
public class ao implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f167778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.co f167779e;

    public ao(com.tencent.mm.plugin.sns.ui.co coVar, boolean z17) {
        this.f167779e = coVar;
        this.f167778d = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$8$1");
        boolean z17 = this.f167778d;
        com.tencent.mm.plugin.sns.ui.co coVar = this.f167779e;
        if (z17) {
            dw3.u0 u0Var = dw3.u0.f244283a;
            u0Var.h(coVar.f168139e.getContext(), u0Var.e("moments", coVar.f168138d, dw3.j0.f244218a.b()));
        } else {
            androidx.appcompat.app.AppCompatActivity context = coVar.f168139e.getContext();
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
        coVar.f168139e.l7();
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        java.lang.String str = coVar.f168139e.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        s0Var.e(str, 3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$8$1");
    }
}
