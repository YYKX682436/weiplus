package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class o3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.p3 f179454d;

    public o3(com.tencent.mm.plugin.wallet_core.id_verify.p3 p3Var) {
        this.f179454d = p3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.mj5 mj5Var;
        com.tencent.mm.plugin.wallet_core.id_verify.p3 p3Var = this.f179454d;
        if ((com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) p3Var.f179459d.getValue()) || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) p3Var.f179462g.getValue()) || (mj5Var = (r45.mj5) p3Var.f179461f.getValue()) == null || (mj5Var.f380589m && com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) p3Var.f179475w.getValue())) || ((mj5Var.f380585f && com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) p3Var.f179464i.getValue()) && com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) p3Var.f179465m.getValue()) && com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) p3Var.f179466n.getValue()) && com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) p3Var.f179468p.getValue())) || ((mj5Var.f380584e && p3Var.f179469q.getValue() == null) || ((mj5Var.f380587h && p3Var.f179473u.getValue() == null) || ((mj5Var.f380586g && com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) p3Var.f179472t.getValue())) || ((mj5Var.f380590n && com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) p3Var.f179471s.getValue())) || ((mj5Var.f380588i && com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) p3Var.f179474v.getValue())) || (mj5Var.f380591o && com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) p3Var.f179477y.getValue()))))))))) ? false : true) {
            p3Var.f179470r.setValue(java.lang.Boolean.TRUE);
        } else {
            p3Var.f179470r.setValue(java.lang.Boolean.FALSE);
        }
    }
}
