package n74;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FollowUserEvent f335309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n74.d f335310e;

    public c(com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener actionBtnFollowFinderHelper$FollowUserEventListener, com.tencent.mm.autogen.events.FollowUserEvent followUserEvent, n74.d dVar) {
        this.f335309d = followUserEvent;
        this.f335310e = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener$1");
        boolean z17 = this.f335309d.f54346g.f8553c;
        n74.d dVar = this.f335310e;
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = dVar.f335327d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            n74.s.a(snsInfo, dVar.b(), 0, 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshActionBtn", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            w64.k kVar = dVar.f335339p;
            if (kVar != null) {
                kVar.a(dVar.f335328e);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshActionBtn", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = dVar.f335327d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
            n74.s.a(snsInfo2, dVar.b(), 1, 1);
        }
        dVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = dVar.f335325b;
        if (k0Var != null && k0Var.i()) {
            dVar.f335325b.u();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideBottomSheet", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper");
        dVar.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.ActionBtnFollowFinderHelper$FollowUserEventListener$1");
    }
}
