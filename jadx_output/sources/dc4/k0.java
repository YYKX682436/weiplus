package dc4;

/* loaded from: classes4.dex */
public class k0 implements u74.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.l0 f228767a;

    public k0(dc4.l0 l0Var) {
        this.f228767a = l0Var;
    }

    @Override // u74.e
    public void a(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
        dc4.l0 l0Var = this.f228767a;
        int duration = z17 ? dc4.l0.l(l0Var).f425162w.getDuration() / 1000 : dc4.l0.l(l0Var).f425154o.f168417g.getDurationMs() / 1000;
        l0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnVideoPlaying", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        long j17 = l0Var.f228832e.field_snsId;
        i64.b1 b1Var = l0Var.f228771r;
        if (b1Var != null) {
            b1Var.s(j17);
            b1Var.v(j17, i17);
            if (!b1Var.m(j17)) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                b1Var.w(j17, android.os.SystemClock.elapsedRealtime());
                b1Var.x(j17, duration, true);
                b1Var.d(j17, j17);
            }
        }
        com.tencent.mm.plugin.sns.storage.n nVar = l0Var.f228770q;
        u74.d dVar = l0Var.f228773t;
        n74.i1.c(nVar, i17, dVar.f425152m, dVar.f425153n);
        k84.f4.c(i17, l0Var.f228773t, l0Var.f228832e);
        p84.e eVar = l0Var.f228774u.f425173h;
        if (eVar != null) {
            eVar.c(i17);
        }
        long j18 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        fd4.l lVar = l0Var.f228775v;
        if (lVar != null) {
            lVar.g(j18, duration);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnVideoPlaying", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
    }

    @Override // u74.e
    public void b(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdDetailItemNew", "onStart, isOnlineVideoView=" + z17 + ", duration=" + i17 + ", hash=" + this.f228767a.hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
    }

    @Override // u74.e
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
    }

    @Override // u74.e
    public void d(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCompletion, isOnlineVideoView=");
        sb6.append(z17);
        sb6.append(", hash=");
        dc4.l0 l0Var = this.f228767a;
        sb6.append(l0Var.hashCode());
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdDetailItemNew", sb6.toString());
        l0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnVideoCompletion", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        u74.f fVar = l0Var.f228774u;
        p84.e eVar = fVar.f425173h;
        if (eVar != null) {
            eVar.b();
        }
        if (l0Var.f228770q.endCoverViewInfo == null) {
            fVar.j(l0Var.f228773t.T.f425133c);
        }
        l0Var.f228771r.b(l0Var.f228832e.field_snsId);
        com.tencent.mm.sdk.platformtools.u3.h(new dc4.h0(l0Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnVideoCompletion", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$7");
    }
}
