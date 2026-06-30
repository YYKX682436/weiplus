package k61;

/* loaded from: classes9.dex */
public class t implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k61.w f304516a;

    public t(k61.w wVar) {
        this.f304516a = wVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        k61.p pVar = this.f304516a.f304519a;
        java.lang.String b17 = pVar.f255224n.b("bill_no");
        int a17 = pVar.f255224n.a("enter_scene", 0);
        java.lang.String b18 = pVar.f255224n.b("chatroom");
        java.lang.String b19 = pVar.f255224n.b("key_sign");
        int a18 = pVar.f255224n.a("key_ver", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.PaylistAAInteractor", "getPayListDetail, billNo: %s, scene: %s, chatRoom: %s", b17, java.lang.Integer.valueOf(a17), b18);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(a17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(a18);
        km5.q qVar = new km5.q();
        qVar.y(b17, valueOf, b18, b19, valueOf2);
        qVar.n(pVar.f304510o.f279143b);
        km5.u.a(qVar);
        return null;
    }
}
