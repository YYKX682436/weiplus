package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xx implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f115133d;

    public xx(com.tencent.mm.plugin.finder.live.plugin.ty tyVar) {
        this.f115133d = tyVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f115133d;
        if (integer != 0) {
            db5.t7.makeText(tyVar.R0().getContext(), tyVar.A.getString(com.tencent.mm.R.string.e7h), 0).show();
            com.tencent.mars.xlog.Log.i(tyVar.f114488q, "kicked member failed:" + ret.getInteger(1));
            return;
        }
        java.lang.String str = null;
        qo0.c.a(tyVar.f114485p, qo0.b.f365339d2, null, 2, null);
        db5.t7.makeText(tyVar.R0().getContext(), tyVar.A.getString(com.tencent.mm.R.string.e7g), 0).show();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kicked member succ");
        r45.xn1 xn1Var = tyVar.V;
        if (xn1Var != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
            str = finderContact.getUsername();
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i(tyVar.f114488q, sb6.toString());
    }
}
