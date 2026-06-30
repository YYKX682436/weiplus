package fd4;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f261310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s34.l0 f261311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u74.d f261312f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fd4.k f261313g;

    public i(fd4.k kVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s34.l0 l0Var, u74.d dVar) {
        this.f261313g = kVar;
        this.f261310d = snsInfo;
        this.f261311e = l0Var;
        this.f261312f = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1");
        fd4.k kVar = this.f261313g;
        if (fd4.k.s(kVar) == null || (snsInfo = this.f261310d) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1");
            return;
        }
        com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView.b(1, 1, snsInfo);
        fd4.k.s(kVar).setVisibility(0);
        fd4.k.s(kVar).a();
        fd4.k.s(kVar).setPaintColor(this.f261311e.f402701c);
        fd4.k.s(kVar).setOnGestureListener(new fd4.h(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1");
    }
}
