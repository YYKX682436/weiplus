package k61;

/* loaded from: classes9.dex */
public class r implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k61.w f304514a;

    public r(k61.w wVar) {
        this.f304514a = wVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        k61.p pVar = this.f304514a.f304519a;
        java.lang.String b17 = pVar.f255224n.b("bill_no");
        int a17 = pVar.f255224n.a("enter_scene", 0);
        km5.u.a(((km5.q) km5.u.g(b17, java.lang.Integer.valueOf(a17), pVar.f255224n.b("chatroom"))).n(pVar.f304512q.f279168b));
        return null;
    }
}
