package vd0;

/* loaded from: classes5.dex */
public final class b2 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd0.d2 f435370a;

    public b2(vd0.d2 d2Var) {
        this.f435370a = d2Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MuteModeService", "onEnterForeground");
        if (j65.e.b() && j65.e.g()) {
            vd0.d2 d2Var = this.f435370a;
            d2Var.wi();
            d2Var.Ni();
            d2Var.Ri(0);
            if (j65.e.h()) {
                j65.e.m(false);
                d75.b.g(vd0.a2.f435366d);
            }
        }
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("MuteModeService", "onExitForeground");
        vd0.d2 d2Var = this.f435370a;
        d2Var.Ui();
        if (j65.e.b() && j65.e.g() && j65.e.h()) {
            d2Var.Bi(false);
        }
        if (j65.e.b() && j65.e.g()) {
            d2Var.Di();
        }
    }
}
