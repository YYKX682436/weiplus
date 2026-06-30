package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class o9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f117308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117309e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(int i17, com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var) {
        super(0);
        this.f117308d = i17;
        this.f117309e = v9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f117308d;
        com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = this.f117309e;
        if (i17 == -200067) {
            v9Var.R6();
            r45.of1 of1Var = (r45.of1) kz5.n0.Z(v9Var.f117496r);
            if (of1Var != null) {
                v9Var.f117497s = of1Var.getInteger(2);
            }
            v9Var.Q6(v9Var.f117497s);
        } else {
            db5.t7.makeText(v9Var.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eig), 0).show();
        }
        return jz5.f0.f302826a;
    }
}
