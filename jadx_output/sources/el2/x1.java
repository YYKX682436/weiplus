package el2;

/* loaded from: classes3.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.b0 f253942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f253943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f253944f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(cm2.b0 b0Var, el2.c2 c2Var, com.tencent.mm.protobuf.g gVar) {
        super(0);
        this.f253942d = b0Var;
        this.f253943e = c2Var;
        this.f253944f = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        com.tencent.mm.protobuf.g gVar = this.f253944f;
        byte[] g17 = gVar != null ? gVar.g() : null;
        if (g17 != null) {
            try {
                finderJumpInfo.parseFrom(g17);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        cm2.b0 b0Var = this.f253942d;
        b0Var.getClass();
        b0Var.f43331v = finderJumpInfo;
        com.tencent.mm.plugin.finder.live.plugin.y30 y30Var = com.tencent.mm.plugin.finder.live.plugin.c40.f112107m;
        android.content.Context m17 = this.f253943e.m();
        kotlin.jvm.internal.o.f(m17, "access$getContext(...)");
        y30Var.a(m17, new cm2.b0(b0Var.f43331v, b0Var.f43332w));
        return jz5.f0.f302826a;
    }
}
