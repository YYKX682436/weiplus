package o90;

/* loaded from: classes11.dex */
public final class s implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        lh3.k kVar;
        java.util.List list = lh3.k.f318680d;
        synchronized (lh3.k.class) {
            kVar = (lh3.k) i95.n0.c(lh3.k.class);
        }
        kVar.getClass();
        if (str == null || !str.startsWith("autoauth_errmsg_")) {
            ((ku5.t0) ku5.t0.f312615d).h(new lh3.i(kVar, m1Var, i17, i18), "NetworkOptReport");
        }
    }
}
