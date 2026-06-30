package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class z1 extends com.tencent.mm.ui.component.UIComponent implements ed0.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final qx3.o f158560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f158560d = new qx3.o(getLifecycleScope());
    }

    public void O6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayUIC", "onPauseRingtone");
        this.f158560d.Q6();
    }

    public final void P6(vx3.i item, long j17, boolean z17, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayUIC", "on play ringtone " + item.n() + ",and id is " + j17 + " with action is play " + z17);
        this.f158560d.P6(item, j17, z17, z18, z19);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayUIC", "release");
        qx3.o oVar = this.f158560d;
        oVar.Q6();
        ((kotlinx.coroutines.flow.h3) oVar.f367377g).k(new qx3.f(0L, null, 3));
        oVar.N6();
        kotlinx.coroutines.r2 r2Var = oVar.f367383p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayUIC", "release");
        qx3.o oVar = this.f158560d;
        oVar.Q6();
        ((kotlinx.coroutines.flow.h3) oVar.f367377g).k(new qx3.f(0L, null, 3));
        oVar.N6();
        kotlinx.coroutines.r2 r2Var = oVar.f367383p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayUIC", "release");
        qx3.o oVar = this.f158560d;
        oVar.Q6();
        ((kotlinx.coroutines.flow.h3) oVar.f367377g).k(new qx3.f(0L, null, 3));
        oVar.N6();
        kotlinx.coroutines.r2 r2Var = oVar.f367383p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        qx3.o oVar = this.f158560d;
        kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(oVar.f367374d, null, null, new qx3.n(oVar, null), 3, null);
        oVar.f367383p = d17;
        ((kotlinx.coroutines.c3) d17).start();
    }
}
