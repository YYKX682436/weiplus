package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class y7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a8 f115160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f115161e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(com.tencent.mm.plugin.finder.live.plugin.a8 a8Var, boolean z17) {
        super(0);
        this.f115160d = a8Var;
        this.f115161e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        boolean z18;
        com.tencent.mm.view.MMPAGView mMPAGView;
        com.tencent.mm.plugin.finder.live.plugin.a8 a8Var = this.f115160d;
        java.lang.String str = a8Var.f111820p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyAnchorVolumeChange isTalking:");
        boolean z19 = this.f115161e;
        sb6.append(z19);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        xh2.c cVar = (xh2.c) ((mm2.o4) a8Var.P0(mm2.o4.class)).A.getValue();
        if (cVar != null) {
            int i17 = cVar.f454534d;
            if ((i17 == 0 && cVar.f454536f == 1) || (i17 == 2 && cVar.f454535e == 1)) {
                z17 = true;
                z18 = pm0.v.z(a8Var.f111828x, 1);
                mMPAGView = a8Var.f111824t;
                if (z18 || pm0.v.z(a8Var.f111828x, 4) || z17) {
                    mMPAGView.setVisibility(8);
                    mMPAGView.n();
                } else if (z19) {
                    mMPAGView.setVisibility(0);
                    if (!mMPAGView.f()) {
                        mMPAGView.g();
                    }
                } else {
                    mMPAGView.setVisibility(8);
                    mMPAGView.n();
                }
                return jz5.f0.f302826a;
            }
        }
        z17 = false;
        z18 = pm0.v.z(a8Var.f111828x, 1);
        mMPAGView = a8Var.f111824t;
        if (z18) {
        }
        mMPAGView.setVisibility(8);
        mMPAGView.n();
        return jz5.f0.f302826a;
    }
}
