package sk4;

/* loaded from: classes15.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f408975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sk4.p f408976e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.l lVar, sk4.p pVar) {
        super(0);
        this.f408975d = lVar;
        this.f408976e = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.MICRO_PHONE, d85.f0.R, sk4.f.f408974a)) {
            yz5.l lVar = this.f408975d;
            if (lVar != null) {
                lVar.invoke("permission_denied");
            }
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new sk4.e(this.f408976e, this.f408975d), "MicroMsg.AudioRecorderImpl");
        }
        return jz5.f0.f302826a;
    }
}
