package ef3;

@j95.b
/* loaded from: classes4.dex */
public class r extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f252428d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f252429e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public boolean f252430f = false;

    public static ef3.r wi() {
        return (ef3.r) i95.n0.c(ef3.r.class);
    }

    public java.util.ArrayList Ai(int i17) {
        return Bi(i17).f13823x;
    }

    public final at4.d1 Bi(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f252428d;
        if (!concurrentHashMap.contains(java.lang.Integer.valueOf(i17))) {
            pg0.a3 a3Var = (pg0.a3) i95.n0.c(pg0.a3.class);
            a3Var.getClass();
            if (!gm0.j1.a()) {
                throw new c01.c();
            }
            dt4.f fVar = (dt4.f) a3Var.f353962p.a();
            fVar.getClass();
            java.lang.String str = "select * from WalletFunciontList where wallet_region = " + i17;
            at4.d1 d1Var = null;
            android.database.Cursor f17 = fVar.f243239d.f(str, null, 2);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletFunctionListStg", "getWalletFunciontListInfo " + str);
            if (f17 != null) {
                if (f17.moveToNext()) {
                    d1Var = new at4.d1();
                    d1Var.convertFrom(f17);
                }
                f17.close();
            }
            if (d1Var != null) {
                concurrentHashMap.put(java.lang.Integer.valueOf(i17), d1Var);
            }
        }
        at4.d1 d1Var2 = (at4.d1) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        return d1Var2 == null ? new at4.d1() : d1Var2;
    }
}
