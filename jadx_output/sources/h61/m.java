package h61;

/* loaded from: classes9.dex */
public class m implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h61.n f279159a;

    public m(h61.n nVar) {
        this.f279159a = nVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.f fVar = (nm5.f) obj;
        h61.l lVar = this.f279159a.f279160a;
        java.lang.String str = (java.lang.String) fVar.a(0);
        long longValue = ((java.lang.Long) fVar.a(1)).longValue();
        int intValue = ((java.lang.Integer) fVar.a(2)).intValue();
        java.lang.String str2 = (java.lang.String) fVar.a(3);
        java.lang.String str3 = (java.lang.String) fVar.a(4);
        java.lang.String str4 = (java.lang.String) fVar.a(5);
        if (lVar.f279158e) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AAPayLogic", "aaPay, isPaying!");
            return null;
        }
        i61.j jVar = new i61.j(str, longValue, intValue, str2, str3, str4);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(jVar);
        lVar.f279157d = km5.u.c();
        lVar.f279158e = true;
        return null;
    }
}
