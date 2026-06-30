package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qu implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f114049d;

    public qu(com.tencent.mm.plugin.finder.live.plugin.iv ivVar) {
        this.f114049d = ivVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f114049d;
        if (integer != 0) {
            db5.t7.makeText(ivVar.R0().getContext(), ivVar.B.getString(com.tencent.mm.R.string.e7h), 0).show();
            com.tencent.mars.xlog.Log.i(ivVar.f113016r, "kicked member failed:" + ret.getInteger(1));
            return;
        }
        java.lang.String str = null;
        qo0.c.a(ivVar.f113015q, qo0.b.f365339d2, null, 2, null);
        db5.t7.makeText(ivVar.R0().getContext(), ivVar.B.getString(com.tencent.mm.R.string.e7g), 0).show();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kicked member succ");
        r45.xn1 xn1Var = ivVar.f113026y0;
        if (xn1Var != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
            str = finderContact.getUsername();
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i(ivVar.f113016r, sb6.toString());
    }
}
