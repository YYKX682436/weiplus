package xs2;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xs2.m f456335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f456336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xs2.m mVar, float f17) {
        super(0);
        this.f456335d = mVar;
        this.f456336e = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xs2.m mVar = this.f456335d;
        xs2.o oVar = mVar.f456351f;
        if (oVar != null) {
            oVar.e(this.f456336e, mVar.f456349d.getResources().getConfiguration().orientation == 2);
        }
        return jz5.f0.f302826a;
    }
}
