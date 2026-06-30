package ed4;

/* loaded from: classes4.dex */
public class o implements u74.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew f251317a;

    public o(com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew fullCardAdTimeLineItemNew) {
        this.f251317a = fullCardAdTimeLineItemNew;
    }

    @Override // u74.e
    public void a(int i17, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView snsAdCardVideoEndView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$8");
        com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew fullCardAdTimeLineItemNew = this.f251317a;
        int duration = z17 ? fullCardAdTimeLineItemNew.f169311r.D0.f425162w.getDuration() / 1000 : fullCardAdTimeLineItemNew.f169311r.D0.f425154o.f168417g.getDurationMs() / 1000;
        long j17 = fullCardAdTimeLineItemNew.f169314u.field_snsId;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.storage.n nVar = fullCardAdTimeLineItemNew.f169317x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = fullCardAdTimeLineItemNew.f169314u;
        long j18 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.ui.bs bsVar = fullCardAdTimeLineItemNew.f169251h;
        if (bsVar == null || (l1Var = bsVar.f168036b) == null || l1Var.f169702c == null || snsInfo == null) {
            str = dm.i4.COL_UPDATETIME;
            str2 = "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$8";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        } else {
            if ((nVar == null || nVar.endCoverViewInfo == null) && (snsAdCardVideoEndView = fullCardAdTimeLineItemNew.f169311r.D0.f425155p) != null && snsAdCardVideoEndView.getVisibility() == 0) {
                fullCardAdTimeLineItemNew.f169311r.D0.f425155p.c(false);
            }
            i64.b1 b1Var = fullCardAdTimeLineItemNew.f169251h.f168036b.f169702c;
            str = dm.i4.COL_UPDATETIME;
            str2 = "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$8";
            b1Var.s(snsInfo.field_snsId);
            fullCardAdTimeLineItemNew.f169251h.f168036b.f169702c.v(snsInfo.field_snsId, j18);
            if (!fullCardAdTimeLineItemNew.f169251h.f168036b.f169702c.m(j17)) {
                i64.b1 b1Var2 = fullCardAdTimeLineItemNew.f169251h.f168036b.f169702c;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                b1Var2.w(j17, android.os.SystemClock.elapsedRealtime());
                fullCardAdTimeLineItemNew.f169251h.f168036b.f169702c.x(j17, duration, true);
                fullCardAdTimeLineItemNew.f169251h.f168036b.f169702c.d(j17, j17);
            }
            int i18 = (int) j18;
            u74.d dVar = fullCardAdTimeLineItemNew.f169311r.D0;
            n74.i1.c(nVar, i18, dVar.f425152m, dVar.f425153n);
            k84.f4.c(i18, fullCardAdTimeLineItemNew.f169311r.D0, snsInfo);
            p84.e eVar = fullCardAdTimeLineItemNew.f169316w.f425173h;
            if (eVar != null) {
                eVar.c(j18);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            fd4.l lVar = fullCardAdTimeLineItemNew.E;
            if (lVar != null) {
                lVar.g(j18, duration);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    @Override // u74.e
    public void b(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$8");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "onStart, isOnlineVideoView=" + z17 + ", duration=" + i17 + ", hash=" + this.f251317a.hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$8");
    }

    @Override // u74.e
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$8");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        this.f251317a.I();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$8");
    }

    @Override // u74.e
    public void d(boolean z17) {
        boolean z18;
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$8");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "onCompletion, isOnlineVideoView=" + z17 + ", hash=" + this.f251317a.hashCode());
        com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew fullCardAdTimeLineItemNew = this.f251317a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.storage.n nVar = fullCardAdTimeLineItemNew.f169317x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedReplayVideo", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        if (fullCardAdTimeLineItemNew.f169312s && nVar != null && nVar.endCoverViewInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedReplayVideo", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            z18 = true;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedReplayVideo", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            z18 = false;
        }
        if (z18) {
            this.f251317a.f169316w.j(z17);
        }
        com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew fullCardAdTimeLineItemNew2 = this.f251317a;
        com.tencent.mm.plugin.sns.ui.bs bsVar = fullCardAdTimeLineItemNew2.f169251h;
        long j17 = fullCardAdTimeLineItemNew2.f169314u.field_snsId;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.storage.n nVar2 = fullCardAdTimeLineItemNew2.f169317x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doOnVideoCompletion", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        com.tencent.mars.xlog.Log.i("MicroMsg.FullCardAdTimeLineItemNew", "doOnVideoCompletion, ret=0");
        p84.e eVar = fullCardAdTimeLineItemNew2.f169316w.f425173h;
        if (eVar != null) {
            eVar.b();
        }
        com.tencent.mm.sdk.platformtools.u3.h(new ed4.n(fullCardAdTimeLineItemNew2, nVar2));
        if (bsVar == null || (l1Var = bsVar.f168036b) == null || (b1Var = l1Var.f169702c) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnVideoCompletion", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        } else {
            b1Var.b(j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doOnVideoCompletion", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$8");
    }
}
