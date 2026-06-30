package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class p implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.q f127337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.tj0 f127338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f127339f;

    public p(com.tencent.mm.plugin.finder.storage.q qVar, com.tencent.mm.plugin.finder.storage.tj0 tj0Var, com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        this.f127337d = qVar;
        this.f127338e = tj0Var;
        this.f127339f = finderContact;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        ya2.g gVar;
        ya2.b2 b17;
        r45.lh2 req = (r45.lh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        this.f127337d.f127398b.remove(this);
        com.tencent.mm.plugin.finder.storage.tj0 tj0Var = this.f127338e;
        if (tj0Var != null) {
            tj0Var.a(ret.getInteger(1) == 0);
        }
        if (ret.getInteger(1) == 0 && req.getInteger(1) == 0 && (b17 = (gVar = ya2.h.f460484a).b(this.f127339f.getUsername())) != null) {
            b17.field_extFlag &= -16385;
            gVar.o(b17);
        }
    }
}
