package h61;

/* loaded from: classes4.dex */
public class r implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h61.s f279166a;

    public r(h61.s sVar) {
        this.f279166a = sVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.c cVar = (nm5.c) obj;
        h61.p pVar = this.f279166a.f279167a;
        java.lang.String str = (java.lang.String) cVar.a(0);
        int intValue = ((java.lang.Integer) cVar.a(1)).intValue();
        java.lang.String str2 = (java.lang.String) cVar.a(2);
        pVar.getClass();
        pVar.f279162d = km5.u.b();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            pVar.f279162d.a(java.lang.Boolean.FALSE);
            return null;
        }
        i61.e eVar = new i61.e(str, intValue, str2);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(eVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.CloseAALogic", "closeAA, billNo: %s, scene: %s", str, java.lang.Integer.valueOf(intValue));
        pVar.f279162d = km5.u.c();
        return null;
    }
}
