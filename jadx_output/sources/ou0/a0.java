package ou0;

/* loaded from: classes5.dex */
public final class a0 extends ou0.b {

    /* renamed from: g, reason: collision with root package name */
    public final float f348882g;

    public a0(float f17, float f18, float f19) {
        super(f17, f19);
        this.f348882g = f18;
    }

    @Override // ou0.b
    public void a(float f17) {
        this.f348885c *= f17;
    }

    @Override // ou0.b
    public float b(float f17, float f18, float f19) {
        return (this.f348882g / f17) * f19;
    }

    @Override // ou0.b
    public boolean c() {
        float f17 = this.f348885c;
        float f18 = this.f348882g;
        float f19 = f17 * f18;
        float f27 = this.f348883a;
        return f19 >= f18 - f27 && f17 * f18 <= f18 + f27;
    }
}
