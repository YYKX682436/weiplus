package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes15.dex */
public class o0 implements bb5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.q0 f152194a;

    public o0(com.tencent.mm.plugin.nearby.ui.q0 q0Var) {
        this.f152194a = q0Var;
    }

    @Override // bb5.e
    public int a() {
        return this.f152194a.getCount();
    }

    @Override // bb5.e
    public java.lang.String b(int i17) {
        if (i17 >= 0) {
            com.tencent.mm.plugin.nearby.ui.q0 q0Var = this.f152194a;
            if (i17 < q0Var.getCount()) {
                r45.b64 b64Var = (r45.b64) ((java.util.LinkedList) q0Var.f152202g.f152093m).get(i17);
                if (b64Var == null) {
                    return null;
                }
                return b64Var.f370550d;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NearbyFriend", "pos is invalid");
        return null;
    }
}
