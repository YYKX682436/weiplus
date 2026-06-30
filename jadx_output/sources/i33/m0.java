package i33;

/* loaded from: classes10.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.t0 f288224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f288225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f288226f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(i33.t0 t0Var, float f17, float f18) {
        super(1);
        this.f288224d = t0Var;
        this.f288225e = f17;
        this.f288226f = f18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f288224d.a7().setTranslationY(this.f288225e + (((java.lang.Number) obj).floatValue() * this.f288226f));
        return jz5.f0.f302826a;
    }
}
