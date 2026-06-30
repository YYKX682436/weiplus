package r01;

/* loaded from: classes4.dex */
public abstract class e3 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protobuf.f f368057d;

    public e3(com.tencent.mm.protobuf.f fVar) {
        this.f368057d = fVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.f fVar = this.f368057d;
        if (m1Var == null || !(m1Var instanceof r01.f3)) {
            return;
        }
        try {
            fVar.parseFrom(((r45.xm) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a).f390221e.f192156a);
        } catch (java.lang.Throwable unused) {
        }
        r01.v1 v1Var = (r01.v1) this;
        r45.c67 c67Var = (r45.c67) fVar;
        if (c67Var.f371339d != null) {
            try {
                com.tencent.mm.sdk.platformtools.o4.N("brandService", 1, null).H(r01.w1.a(v1Var.f368264e, 2, null), c67Var.f371339d.toByteArray());
            } catch (java.lang.Throwable unused2) {
            }
        }
    }
}
