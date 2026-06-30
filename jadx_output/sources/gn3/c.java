package gn3;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgn3/c;", "Lfn3/b;", "Lr45/tu4;", "Lr45/uu4;", "", "cmdId", "<init>", "(Ljava/lang/String;)V", "plugin-newlife_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class c extends fn3.b<r45.tu4, r45.uu4> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String cmdId) {
        super(cmdId);
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
    }

    @Override // fn3.b
    public fn3.h a(com.tencent.mm.protobuf.f fVar) {
        r45.tu4 tu4Var = (r45.tu4) fVar;
        r45.uu4 uu4Var = new r45.uu4();
        if (kotlin.jvm.internal.o.b(tu4Var != null ? tu4Var.getString(0) : null, "openDiscoverEntry")) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
            java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
            kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.String");
            u11.c.f((java.lang.String) l17);
            ((ra0.v) i95.n0.c(ra0.v.class)).getClass();
            uu4Var.set(0, 0);
        } else {
            uu4Var.set(0, 0);
        }
        return new fn3.h(uu4Var, 0, null, 6, null);
    }
}
