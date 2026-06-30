package r92;

/* loaded from: classes10.dex */
public final class b extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f393450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, m92.b.T1, "FinderAccount", dm.v3.Q);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = m92.b.T1;
        this.f393450d = db6;
    }

    public final long y0(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String str = new m92.b(username).field_username;
        p75.i0 i17 = dm.v3.N.i();
        i17.f352657d = dm.v3.P.j(str);
        i17.f352656c = "MicroMsg.SDK.BaseFinderAccount";
        m92.b bVar = (m92.b) i17.a().o(this.f393450d, m92.b.class);
        if (bVar != null) {
            return bVar.systemRowid;
        }
        return -1L;
    }
}
