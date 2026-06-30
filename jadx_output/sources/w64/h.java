package w64;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w64.i f443302d;

    public h(w64.i iVar) {
        this.f443302d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$4$2");
        w64.i iVar = this.f443302d;
        int c17 = l44.s4.c(w64.n.a(iVar.f443304b).f162569a);
        w64.n nVar = iVar.f443304b;
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = w64.n.b(nVar).getAdInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        android.content.Context context = nVar.f443312e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        l44.s4.f(context, w64.n.b(nVar).getUxinfo(), w64.n.a(nVar).finderUsername, w64.n.a(nVar).f162584h0, w64.n.a(nVar).f162586i0, w64.n.b(nVar).field_snsId, adInfo.preloadFinderFeed, c17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$4$2");
    }
}
