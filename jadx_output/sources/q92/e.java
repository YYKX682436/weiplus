package q92;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q92.h f360897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q92.h hVar) {
        super(0);
        this.f360897d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f360897d.getClass();
        d95.b0 b0Var = new d95.b0();
        java.lang.String str = gm0.j1.u().h() + "FinderAccounts_01.db";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(-1527282937, q92.g.f360899a);
        if (!b0Var.S(str, hashMap, true, true)) {
            throw new com.tencent.wcdb.database.SQLiteException("finder db init failed");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderAccountFeatureService", "[initAccountDb] path=".concat(str));
        return b0Var;
    }
}
