package nl4;

/* loaded from: classes11.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl4.r f338214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f338215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f338216f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(nl4.r rVar, long j17, float f17) {
        super(1);
        this.f338214d = rVar;
        this.f338215e = j17;
        this.f338216f = f17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        nl4.r rVar = this.f338214d;
        com.tencent.mars.xlog.Log.i(rVar.f338242l, "call onPrepared");
        if (rVar.f338236f || rVar.f338235e) {
            com.tencent.mars.xlog.Log.w(rVar.f338242l, "has call stop " + rVar.f338235e + ", has call pause " + rVar.f338236f);
        } else {
            yz5.l lVar = rVar.f338243m;
            if (lVar != null) {
                lVar.invoke(rVar);
            }
            boolean z17 = rVar.f338234d;
            kk4.b bVar = rVar.f338240j;
            if (!z17) {
                long j17 = this.f338215e;
                if (j17 > 0) {
                    rVar.seek(j17);
                }
                kk4.v vVar = (kk4.v) bVar;
                float f17 = this.f338216f;
                vVar.f308587l = f17;
                kk4.c cVar = vVar.f308577b;
                if (cVar != null) {
                    cVar.setPlaySpeedRatio(f17);
                }
                rVar.f338234d = true;
            }
            ((kk4.v) bVar).x(0);
        }
        return jz5.f0.f302826a;
    }
}
