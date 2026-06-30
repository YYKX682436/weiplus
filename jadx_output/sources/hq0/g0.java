package hq0;

/* loaded from: classes7.dex */
public final class g0 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hq0.i0 f282991a;

    public g0(hq0.i0 i0Var) {
        this.f282991a = i0Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        hq0.i0 i0Var = this.f282991a;
        com.tencent.mars.xlog.Log.i(i0Var.getTag(), "onEnterForeground");
        i0Var.m1();
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        hq0.i0 i0Var = this.f282991a;
        com.tencent.mars.xlog.Log.i(i0Var.getTag(), "onExitForeground");
        kc3.f fVar = i0Var.f283004s;
        if (fVar != null) {
            ym5.a1.f(new com.tencent.mm.plugin.magicbrush.o5((com.tencent.mm.plugin.magicbrush.s5) fVar));
        } else {
            kotlin.jvm.internal.o.o("autoPauseExt");
            throw null;
        }
    }
}
