package el2;

/* loaded from: classes3.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f253913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f253914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.y42 f253915f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(el2.c2 c2Var, com.tencent.mm.protobuf.g gVar, r45.y42 y42Var) {
        super(0);
        this.f253913d = c2Var;
        this.f253914e = gVar;
        this.f253915f = y42Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.m mVar = com.tencent.mm.plugin.finder.live.plugin.r.f114059n;
        el2.c2 c2Var = this.f253913d;
        android.content.Context m17 = c2Var.m();
        kotlin.jvm.internal.o.f(m17, "access$getContext(...)");
        gk2.e S0 = c2Var.f253762e.S0();
        r45.k92 k92Var = new r45.k92();
        com.tencent.mm.protobuf.g gVar = this.f253914e;
        byte[] g17 = gVar != null ? gVar.g() : null;
        if (g17 != null) {
            try {
                k92Var.parseFrom(g17);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        cm2.h0 h0Var = new cm2.h0(k92Var);
        r45.y42 y42Var = this.f253915f;
        h0Var.f43397s = y42Var.getByteString(5);
        h0Var.f43398t = y42Var.getByteString(6);
        java.lang.String string = y42Var.getString(4);
        h0Var.f43387f = string != null ? string : "";
        mVar.a(m17, S0, c2Var.f253763f, h0Var);
        return jz5.f0.f302826a;
    }
}
