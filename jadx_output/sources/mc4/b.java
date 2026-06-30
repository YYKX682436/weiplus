package mc4;

/* loaded from: classes4.dex */
public final class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f325643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mc4.d f325644e;

    public b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, mc4.d dVar) {
        this.f325643d = snsInfo;
        this.f325644e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper$showRetryPostAlert$1$1");
        mc4.c cVar = mc4.c.f325645a;
        java.lang.String localid = this.f325643d.getLocalid();
        kotlin.jvm.internal.o.f(localid, "getLocalid(...)");
        mc4.c.a(cVar, localid);
        mc4.d dVar = this.f325644e;
        if (dVar != null) {
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$g snsCommentDetailUI$$g = (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$g) dVar;
            int i18 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = snsCommentDetailUI$$g.f166922a;
            snsCommentDetailUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$refreshSnsSecurityErrorView$4", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            snsCommentDetailUI.S7(snsCommentDetailUI$$g.f166923b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$refreshSnsSecurityErrorView$4", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        }
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
        }
        zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
        long j17 = this.f325643d.localid;
        o75.b bVar = o75.b.f343581b;
        gVar.h7(j17, o75.b.f343583d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper$showRetryPostAlert$1$1");
    }
}
