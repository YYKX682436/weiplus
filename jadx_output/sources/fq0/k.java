package fq0;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.n f265453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(fq0.n nVar) {
        super(0);
        this.f265453d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f265453d.getClass();
        d95.b0 b0Var = new d95.b0();
        java.lang.String str = gm0.j1.u().h() + "MagicBrushScl.db";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(166680306, fq0.j.f265452a);
        if (!b0Var.S(str, hashMap, true, true)) {
            throw new com.tencent.wcdb.database.SQLiteException("mb scl db init failed");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushSclFeatureService", "[initMbSclDb path=" + str + ']');
        return b0Var;
    }
}
