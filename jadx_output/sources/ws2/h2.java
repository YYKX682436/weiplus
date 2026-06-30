package ws2;

/* loaded from: classes3.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.j2 f449051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f449052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(ws2.j2 j2Var, gk2.e eVar) {
        super(0);
        this.f449051d = j2Var;
        this.f449052e = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ws2.j2 j2Var = this.f449051d;
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(j2Var.f449059f, (com.tencent.mm.sdk.platformtools.a4) new ws2.g2(j2Var, this.f449052e), true);
        b4Var.setLogging(false);
        return b4Var;
    }
}
