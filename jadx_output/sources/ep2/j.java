package ep2;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ep2.k f255722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255723e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ep2.k kVar, java.lang.String str) {
        super(1);
        this.f255722d = kVar;
        this.f255723e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        ep2.k kVar = this.f255722d;
        if (booleanValue) {
            java.lang.String valueOf = java.lang.String.valueOf(kVar.f255724m);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            ml2.u1 u1Var = ml2.u1.f328040e;
            a4Var.a(valueOf, "", b17, "square_card_friend_like_avatar_half", this.f255723e);
        } else {
            java.lang.String valueOf2 = java.lang.String.valueOf(kVar.f255724m);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b18 = b52.b.b();
            ml2.t1 t1Var = ml2.t1.f327942e;
            a4Var.b(valueOf2, b18, "square_card_friend_like_avatar_half", this.f255723e);
        }
        return jz5.f0.f302826a;
    }
}
