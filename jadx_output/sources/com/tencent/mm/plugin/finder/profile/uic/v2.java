package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes.dex */
public final class v2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f124277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f124278b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j3 f124279c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f124280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ss4 f124281e;

    public v2(kotlin.jvm.internal.c0 c0Var, java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.profile.uic.j3 j3Var, yz5.l lVar, r45.ss4 ss4Var) {
        this.f124277a = c0Var;
        this.f124278b = linkedList;
        this.f124279c = j3Var;
        this.f124280d = lVar;
        this.f124281e = ss4Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList list;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cgi ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(", ");
        sb6.append(fVar.f70616b);
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileDraftUIC", sb6.toString());
        int i17 = fVar.f70615a;
        kotlin.jvm.internal.c0 c0Var = this.f124277a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.h51 h51Var = (r45.h51) fVar.f70618d;
            if ((h51Var != null ? (com.tencent.mm.protocal.protobuf.FinderObject) h51Var.getCustom(2) : null) != null) {
                r45.h51 h51Var2 = (r45.h51) fVar.f70618d;
                if (h51Var2 != null && (list = h51Var2.getList(10)) != null) {
                    this.f124278b.addAll(list);
                }
                pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.u2(c0Var, this.f124279c, this.f124280d, this.f124281e));
                return jz5.f0.f302826a;
            }
        }
        c0Var.f310112d = false;
        pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.u2(c0Var, this.f124279c, this.f124280d, this.f124281e));
        return jz5.f0.f302826a;
    }
}
