package mc3;

/* loaded from: classes7.dex */
public final class d extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc3.f f325623a;

    public d(mc3.f fVar) {
        this.f325623a = fVar;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        mc3.f fVar = this.f325623a;
        com.tencent.mars.xlog.Log.i(fVar.f325640v, "onEnterForeground");
        rp0.e eVar = (rp0.e) fVar.C0();
        eVar.f398346f = true;
        java.lang.Runnable runnable = eVar.f398351k;
        if (runnable != null) {
            runnable.run();
        }
        eVar.e(false);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        mc3.f fVar = this.f325623a;
        com.tencent.mars.xlog.Log.i(fVar.f325640v, "onExitForeground");
        rp0.e eVar = (rp0.e) fVar.C0();
        eVar.f398346f = false;
        eVar.d();
    }
}
