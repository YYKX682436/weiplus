package s7;

/* loaded from: classes16.dex */
public class x2 implements s7.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f403891a = new android.graphics.Path();

    /* renamed from: b, reason: collision with root package name */
    public float f403892b;

    /* renamed from: c, reason: collision with root package name */
    public float f403893c;

    public x2(s7.a1 a1Var) {
        if (a1Var == null) {
            return;
        }
        a1Var.h(this);
    }

    @Override // s7.b1
    public void a(float f17, float f18) {
        this.f403891a.moveTo(f17, f18);
        this.f403892b = f17;
        this.f403893c = f18;
    }

    @Override // s7.b1
    public void b(float f17, float f18) {
        this.f403891a.lineTo(f17, f18);
        this.f403892b = f17;
        this.f403893c = f18;
    }

    @Override // s7.b1
    public void c(float f17, float f18, float f19, float f27) {
        this.f403891a.quadTo(f17, f18, f19, f27);
        this.f403892b = f19;
        this.f403893c = f27;
    }

    @Override // s7.b1
    public void close() {
        this.f403891a.close();
    }

    @Override // s7.b1
    public void d(float f17, float f18, float f19, float f27, float f28, float f29) {
        this.f403891a.cubicTo(f17, f18, f19, f27, f28, f29);
        this.f403892b = f28;
        this.f403893c = f29;
    }

    @Override // s7.b1
    public void e(float f17, float f18, float f19, boolean z17, boolean z18, float f27, float f28) {
        s7.f3.a(this.f403892b, this.f403893c, f17, f18, f19, z17, z18, f27, f28, this);
        this.f403892b = f27;
        this.f403893c = f28;
    }
}
