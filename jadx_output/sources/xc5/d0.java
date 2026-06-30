package xc5;

/* loaded from: classes12.dex */
public final class d0 implements com.tencent.mm.modelcdntran.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f453410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mf3.k f453411b;

    public d0(xc5.h0 h0Var, mf3.k kVar) {
        this.f453410a = h0Var;
        this.f453411b = kVar;
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void b(com.tencent.mm.modelcdntran.n1 n1Var) {
        dn.g gVar;
        dn.g gVar2;
        long j17 = (n1Var == null || (gVar2 = n1Var.f71107e) == null) ? 0L : gVar2.field_finishedLength;
        long j18 = (n1Var == null || (gVar = n1Var.f71107e) == null) ? 0L : gVar.field_toltalLength;
        if (j18 <= 0) {
            return;
        }
        float f17 = ((float) j17) / ((float) j18);
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        xc5.h0 h0Var = this.f453410a;
        kotlinx.coroutines.l.d(h0Var.f453468z, null, null, new xc5.c0(h0Var, this.f453411b, f17, null), 3, null);
    }
}
