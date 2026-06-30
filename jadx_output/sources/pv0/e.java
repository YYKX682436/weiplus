package pv0;

/* loaded from: classes5.dex */
public final class e implements xu0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pv0.g f358518a;

    public e(pv0.g gVar) {
        this.f358518a = gVar;
    }

    @Override // xu0.a
    public void a(com.tencent.maas.base.MJID segmentID, java.lang.String roleID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(roleID, "roleID");
        segmentID.toString();
        ((pv0.n) this.f358518a.f358520a).a(segmentID, roleID);
    }

    @Override // xu0.a
    public void b(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        segmentID.toString();
        pv0.n nVar = (pv0.n) this.f358518a.f358520a;
        nVar.getClass();
        nVar.f358538a.b(segmentID);
    }

    @Override // xu0.a
    public void c(ru0.e roleResult) {
        kotlin.jvm.internal.o.g(roleResult, "roleResult");
        com.tencent.mm.vfs.r6 r6Var = roleResult.f399665d;
        if (r6Var != null) {
            r6Var.o();
        }
        ((pv0.n) this.f358518a.f358520a).b(roleResult);
    }
}
