package k61;

/* loaded from: classes9.dex */
public class v implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k61.w f304518a;

    public v(k61.w wVar) {
        this.f304518a = wVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        k61.p pVar = this.f304518a.f304519a;
        java.lang.String b17 = pVar.f255224n.b("bill_no");
        java.lang.String b18 = pVar.f255224n.b("chatroom");
        int a17 = pVar.f255224n.a("enter_scene", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.PaylistAAInteractor", "urgeAAPay");
        km5.b b19 = km5.u.b();
        b19.b();
        new i61.b(b17, b18, a17).l().q(new k61.o(pVar, b19));
        return null;
    }
}
