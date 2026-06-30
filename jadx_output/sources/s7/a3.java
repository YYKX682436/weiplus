package s7;

/* loaded from: classes16.dex */
public class a3 extends s7.d3 {

    /* renamed from: a, reason: collision with root package name */
    public float f403587a;

    /* renamed from: b, reason: collision with root package name */
    public final float f403588b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Path f403589c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s7.f3 f403590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(s7.f3 f3Var, float f17, float f18, android.graphics.Path path) {
        super(f3Var, null);
        this.f403590d = f3Var;
        this.f403587a = f17;
        this.f403588b = f18;
        this.f403589c = path;
    }

    @Override // s7.d3
    public boolean a(s7.l2 l2Var) {
        if (!(l2Var instanceof s7.m2)) {
            return true;
        }
        java.lang.String.format("Using <textPath> elements in a clip path is not supported.", new java.lang.Object[0]);
        return false;
    }

    @Override // s7.d3
    public void b(java.lang.String str) {
        s7.f3 f3Var = this.f403590d;
        if (f3Var.W()) {
            android.graphics.Path path = new android.graphics.Path();
            f3Var.f403657d.f403597d.getTextPath(str, 0, str.length(), this.f403587a, this.f403588b, path);
            this.f403589c.addPath(path);
        }
        this.f403587a += f3Var.f403657d.f403597d.measureText(str);
    }
}
