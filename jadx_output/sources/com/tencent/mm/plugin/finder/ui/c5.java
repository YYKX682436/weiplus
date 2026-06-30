package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class c5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.d5 f128977d;

    public c5(com.tencent.mm.plugin.finder.ui.d5 d5Var) {
        this.f128977d = d5Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ro4 req = (r45.ro4) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i("Finder.FinderDataPermissionSetting", "modReferenceSwitchCallback req.reference_type=" + req.getInteger(1) + ", req.op_type=" + req.getInteger(0) + ", ret.retCode=" + ret.getInteger(1));
        pm0.v.X(new com.tencent.mm.plugin.finder.ui.b5(ret, this.f128977d, req));
    }
}
