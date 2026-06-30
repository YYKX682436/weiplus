package gc0;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270236d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.lang.String str) {
        super(0);
        this.f270236d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap = gc0.y0.f270366b;
        java.lang.String str = this.f270236d;
        r45.nl5 nl5Var = (r45.nl5) hashMap.get(str);
        if (nl5Var == null) {
            nl5Var = gc0.f0.f270167a.a(str);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("view_id", "sys_msg_note_add");
        hashMap2.put("add_username", str);
        hashMap2.putAll(gc0.m1.e(nl5Var));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap2, 33926);
        return jz5.f0.f302826a;
    }
}
