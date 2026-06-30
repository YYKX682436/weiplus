package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.t1 f119696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.plugin.finder.live.widget.t1 t1Var) {
        super(0);
        this.f119696d = t1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.plugin.finder.live.widget.t1 t1Var = this.f119696d;
        return new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.live.widget.BaseLbsBottomPanelSheet$lifeObserver$2$1

            /* renamed from: d, reason: collision with root package name */
            public boolean f117579d;

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
            public final void onPause() {
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.live.widget.t1.this.i0(), "onPause");
                this.f117579d = true;
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
            public final void onResume() {
                com.tencent.mm.plugin.finder.live.widget.t1 t1Var2 = com.tencent.mm.plugin.finder.live.widget.t1.this;
                com.tencent.mars.xlog.Log.i(t1Var2.i0(), "onResume hadPause: " + this.f117579d);
                if (this.f117579d) {
                    this.f117579d = false;
                    t1Var2.n0(t1Var2.j0());
                }
            }
        };
    }
}
