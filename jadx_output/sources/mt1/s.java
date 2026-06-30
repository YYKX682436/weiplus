package mt1;

/* loaded from: classes12.dex */
public final class s implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt1.c f331261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f331262e;

    public s(nt1.c cVar, com.tencent.mm.storage.f9 f9Var) {
        this.f331261d = cVar;
        this.f331262e = f9Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        kz5.p0 p0Var = kz5.p0.f313996d;
        com.tencent.mm.storage.f9 f9Var = this.f331262e;
        try {
            d95.f.q();
            java.util.List b17 = this.f331261d.b(f9Var);
            java.lang.Long valueOf = java.lang.Long.valueOf(f9Var.getMsgId());
            java.lang.String Q0 = f9Var.Q0();
            kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
            if (b17 == null) {
                b17 = p0Var;
            }
            return new jz5.o(valueOf, Q0, b17);
        } catch (com.tencent.wcdb.database.SQLiteDatabaseCorruptException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CalcWxNewService", "getIndicesByMsgInfo DB Corrupt");
            java.lang.Long valueOf2 = java.lang.Long.valueOf(f9Var.getMsgId());
            java.lang.String Q02 = f9Var.Q0();
            kotlin.jvm.internal.o.f(Q02, "getTalker(...)");
            return new jz5.o(valueOf2, Q02, p0Var);
        }
    }
}
