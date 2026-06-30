package xs2;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xs2.m f456331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f456332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f456333f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xs2.m mVar, int i17, int i18) {
        super(0);
        this.f456331d = mVar;
        this.f456332e = i17;
        this.f456333f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xs2.o oVar = this.f456331d.f456351f;
        if (oVar != null) {
            oVar.f(this.f456332e * 1000, this.f456333f * 1000);
        }
        return jz5.f0.f302826a;
    }
}
