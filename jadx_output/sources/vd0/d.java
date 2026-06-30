package vd0;

/* loaded from: classes12.dex */
public final class d extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd0.e f435385a;

    public d(vd0.e eVar) {
        this.f435385a = eVar;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckDensityService", "onEnterForeground !!");
        vd0.e.wi(this.f435385a, true);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckDensityService", "onExitForeground !!");
        vd0.e.wi(this.f435385a, false);
    }
}
