package h61;

/* loaded from: classes9.dex */
public class d implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h61.e f279141a;

    public d(h61.e eVar) {
        this.f279141a = eVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.e eVar = (nm5.e) obj;
        h61.c cVar = this.f279141a.f279142a;
        java.lang.String str = (java.lang.String) eVar.a(0);
        int intValue = ((java.lang.Integer) eVar.a(1)).intValue();
        java.lang.String str2 = (java.lang.String) eVar.a(2);
        java.lang.String str3 = (java.lang.String) eVar.a(3);
        int intValue2 = ((java.lang.Integer) eVar.a(4)).intValue();
        cVar.getClass();
        i61.k kVar = new i61.k(str, intValue, str2, str3, intValue2);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(kVar);
        cVar.f279140d = km5.u.c();
        return null;
    }
}
