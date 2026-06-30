package gd4;

/* loaded from: classes4.dex */
public final class j0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd4.v0 f270725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f270726e;

    public j0(gd4.v0 v0Var, float f17) {
        this.f270725d = v0Var;
        this.f270726e = f17;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1$1");
        ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1$1");
        gd4.v0 v0Var = this.f270725d;
        if (gd4.v0.n(v0Var)) {
            int m17 = gd4.v0.m(v0Var);
            gd4.x0 f17 = v0Var.f();
            gd4.v0.o(v0Var, m17 + (((int) (f17 != null ? f17.getCurrentPosInMills() : 0L)) - ((int) this.f270726e)));
        } else {
            int m18 = gd4.v0.m(v0Var);
            gd4.x0 f18 = v0Var.f();
            gd4.v0.o(v0Var, m18 + ((int) (f18 != null ? f18.getCurrentPosInMills() : 0L)));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setFirstPlayed$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        v0Var.f270860m = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setFirstPlayed$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setHasBreakVideoStarted$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        v0Var.f270862o = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setHasBreakVideoStarted$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setHasPrepared$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        v0Var.f270861n = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setHasPrepared$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        gd4.x0 f19 = v0Var.f();
        if (f19 != null) {
            f19.pause();
        }
        gd4.x0 f27 = v0Var.f();
        if (f27 != null) {
            f27.stop();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$restartPlayJob$1$1");
        return f0Var;
    }
}
