package k61;

/* loaded from: classes9.dex */
public class c implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k61.d f304490a;

    public c(k61.d dVar) {
        this.f304490a = dVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.ANY";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        int i17;
        nm5.b bVar = (nm5.b) obj;
        k61.b bVar2 = this.f304490a.f304491a;
        boolean booleanValue = ((java.lang.Boolean) bVar.a(0)).booleanValue();
        int intValue = ((java.lang.Integer) bVar.a(1)).intValue();
        if (!booleanValue || (i17 = bVar2.f304483o) <= 0) {
            i17 = 20;
        } else {
            bVar2.f304483o = 0;
            bVar2.f304488t = false;
        }
        int i18 = (bVar2.f304489u != intValue || i17 > 20) ? 20 : i17;
        bVar2.f304489u = intValue;
        com.tencent.mars.xlog.Log.i("MicroMsg.AAQueryListInteractor", "getNextAAQueryPage, currentPageOffset: %s, force: %s", java.lang.Integer.valueOf(bVar2.f304483o), java.lang.Boolean.valueOf(booleanValue));
        km5.b b17 = km5.u.b();
        b17.b();
        (bVar2.f304488t ? new i61.c(i18, bVar2.f304483o, intValue, bVar2.f304484p, bVar2.f304485q, bVar2.f304486r, bVar2.f304487s) : new i61.c(i18, bVar2.f304483o, intValue)).l().q(new k61.a(bVar2, b17));
        return null;
    }
}
