package fd4;

/* loaded from: classes4.dex */
public class d implements s84.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd4.f f261297a;

    public d(fd4.f fVar) {
        this.f261297a = fVar;
    }

    @Override // s84.j
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDragHit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
        com.tencent.mars.xlog.Log.i("DragAdBusiness", "onDragHit");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDragHit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
    }

    @Override // s84.j
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDragStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
        fd4.f fVar = this.f261297a;
        fd4.f.s(fVar).f404890b++;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        fVar.D = currentTimeMillis;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        com.tencent.mars.xlog.Log.i("DragAdBusiness", "onDragStart, dragCount=" + fd4.f.s(fVar).f404890b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        boolean z17 = fVar.f261308z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            fVar.f261308z = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            long j17 = fVar.B;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
            if (j17 > 0) {
                s84.a s17 = fd4.f.s(fVar);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
                long j18 = fVar.B;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness");
                s17.f404892d = ((int) (currentTimeMillis2 - j18)) + 500;
            } else {
                com.tencent.mars.xlog.Log.e("DragAdBusiness", "mVideoStartPlayTime==0");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDragStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
    }

    @Override // s84.j
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDragSucc", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
        fd4.f fVar = this.f261297a;
        fVar.r(null);
        ca4.z0.I0(new long[]{20, 100});
        fVar.l();
        fVar.k(42);
        fd4.f.s(fVar).f404891c++;
        com.tencent.mars.xlog.Log.i("DragAdBusiness", "onDragSucc=" + fd4.f.s(fVar).f404891c + ", duration=" + fd4.f.t(fVar) + ", totalDuration=" + fd4.f.s(fVar).f404889a + ", firstJumplayTime=" + fd4.f.s(fVar).f404892d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDragSucc", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
    }

    @Override // s84.j
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDragCancel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
        fd4.f fVar = this.f261297a;
        com.tencent.mars.xlog.Log.i("DragAdBusiness", "onDragCancel, duration=" + fd4.f.t(fVar) + ", totalDuration=" + fd4.f.s(fVar).f404889a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDragCancel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.DragAdBusiness$1");
    }
}
