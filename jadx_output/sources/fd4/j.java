package fd4;

/* loaded from: classes4.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f261314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fd4.k f261315e;

    public j(fd4.k kVar, boolean z17) {
        this.f261315e = kVar;
        this.f261314d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$2");
        fd4.k kVar = this.f261315e;
        if (fd4.k.s(kVar) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$2");
            return;
        }
        if (!this.f261314d) {
            com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView.b(1, 2, kVar.f261292i);
        }
        fd4.k.s(kVar).setVisibility(8);
        fd4.k.s(kVar).setBackgroundColor(0);
        fd4.k.s(kVar).a();
        fd4.k.s(kVar).setOnGestureListener(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$2");
    }
}
