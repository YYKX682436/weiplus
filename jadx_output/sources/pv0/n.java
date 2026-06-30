package pv0;

/* loaded from: classes5.dex */
public final class n implements pv0.b {

    /* renamed from: a, reason: collision with root package name */
    public final pv0.a f358538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pv0.y f358539b;

    public n(pv0.y yVar, pv0.a timbreCallback) {
        kotlin.jvm.internal.o.g(timbreCallback, "timbreCallback");
        this.f358539b = yVar;
        this.f358538a = timbreCallback;
    }

    public void a(com.tencent.maas.base.MJID segmentID, java.lang.String roleID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(roleID, "roleID");
        this.f358538a.a(segmentID, roleID);
        pv0.y yVar = this.f358539b;
        yVar.f358565s.f358540a.decrementAndGet();
        dw0.c l76 = yVar.l7(roleID);
        if (l76 != null) {
            yVar.r7(l76, true);
        }
    }

    public void b(ru0.e roleResult) {
        kotlin.jvm.internal.o.g(roleResult, "roleResult");
        this.f358538a.e(roleResult);
        pv0.y yVar = this.f358539b;
        yVar.f358565s.f358540a.decrementAndGet();
        dw0.c l76 = yVar.l7(roleResult.f399663b);
        if (l76 != null) {
            yVar.r7(l76, false);
        }
    }
}
