package ep2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str) {
        super(1);
        this.f255698d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        if (booleanValue) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            ml2.u1 u1Var = ml2.u1.f328040e;
            a4Var.a("94", "", b17, "square_card_friend_like_avatar_half", this.f255698d);
        } else {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b18 = b52.b.b();
            ml2.t1 t1Var = ml2.t1.f327942e;
            a4Var.b("94", b18, "square_card_friend_like_avatar_half", this.f255698d);
        }
        return jz5.f0.f302826a;
    }
}
