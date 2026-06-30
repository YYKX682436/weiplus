package mm3;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f329614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f329615e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j17, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f329614d = j17;
        this.f329615e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kl3.t.g().a().c((int) this.f329614d);
        kl3.t.g().a().pause();
        mm3.w wVar = (mm3.w) this.f329615e.f310123d;
        if (wVar != null) {
            wVar.E(true);
        }
        return jz5.f0.f302826a;
    }
}
