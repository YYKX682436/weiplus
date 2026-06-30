package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f116492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f116493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i17, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(0);
        this.f116492d = i17;
        this.f116493e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.live.view.k0.Companion.getClass();
        str = com.tencent.mm.plugin.finder.live.view.k0.TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleRecvLuckyMoneyErr errCode:");
        int i17 = this.f116492d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f116493e;
        if (i17 == 1) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 1);
            k0Var.statusChange(qo0.b.f365332b4, bundle);
        } else if (i17 == 2) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 2);
            k0Var.statusChange(qo0.b.f365332b4, bundle2);
        }
        return jz5.f0.f302826a;
    }
}
