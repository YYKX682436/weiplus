package cw2;

/* loaded from: classes15.dex */
public final class t5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f224022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(cw2.z5 z5Var) {
        super(0);
        this.f224022d = z5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mmpostprocessing.MMPostProcessing mMPostProcessing;
        com.tencent.mm.mmpostprocessing.MMPostProcessing mMPostProcessing2;
        cw2.z5 z5Var = this.f224022d;
        cw2.b6 b6Var = z5Var.f224135c;
        cw2.c6 c6Var = z5Var.f224134b;
        if (z5Var.f224136d != 0 && b6Var != null && c6Var != null) {
            synchronized (cw2.d6.f223644f) {
                cw2.z5.a(z5Var);
                cw2.d6 d6Var = cw2.d6.f223645g;
                if (d6Var != null && (mMPostProcessing2 = d6Var.f223649c) != null) {
                    mMPostProcessing2.updatePostProcessorParam(c6Var.f223618b, "strength", java.lang.Integer.valueOf(b6Var.f223601g));
                }
                cw2.d6 d6Var2 = cw2.d6.f223645g;
                if (d6Var2 != null && (mMPostProcessing = d6Var2.f223649c) != null) {
                    mMPostProcessing.onFrameAvailable(c6Var.f223618b, z5Var.f224136d, b6Var.f223595a, b6Var.f223599e, b6Var.f223600f, 2, true);
                }
                if (!z5Var.f224139g) {
                    z5Var.f224139g = true;
                    yz5.a aVar = z5Var.f224140h;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
