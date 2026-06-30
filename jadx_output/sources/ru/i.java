package ru;

/* loaded from: classes12.dex */
public final class i implements com.tencent.mm.modelcdntran.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ru.j f399579a;

    public i(ru.j jVar) {
        this.f399579a = jVar;
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void b(com.tencent.mm.modelcdntran.n1 n1Var) {
        if (n1Var != null) {
            if (n1Var.f71103a == com.tencent.mm.modelcdntran.m1.f71080i) {
                java.lang.Integer e17 = qi3.c.e(this.f399579a, false, 1, null);
                if (e17 != null) {
                    e17.intValue();
                    sx.b0 b0Var = (sx.b0) i95.n0.c(sx.b0.class);
                    dn.m mVar = n1Var.f71106d;
                    java.lang.String str = mVar != null ? mVar.field_mediaId : null;
                    if (str == null) {
                        str = "";
                    }
                    ((rx.f) b0Var).Bi(str);
                    e17.intValue();
                }
            }
        }
    }
}
