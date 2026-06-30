package dk2;

/* loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek2.f f234087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f234088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f234089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234090g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ek2.f fVar, int i17, int i18, java.lang.String str) {
        super(0);
        this.f234087d = fVar;
        this.f234088e = i17;
        this.f234089f = i18;
        this.f234090g = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ek2.f fVar = this.f234087d;
        if (fVar != null) {
            fVar.b(this.f234088e, this.f234089f, this.f234090g);
        }
        return jz5.f0.f302826a;
    }
}
