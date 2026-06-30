package s7;

/* loaded from: classes16.dex */
public class c3 extends s7.d3 {

    /* renamed from: a, reason: collision with root package name */
    public float f403618a;

    /* renamed from: b, reason: collision with root package name */
    public final float f403619b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f403620c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s7.f3 f403621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(s7.f3 f3Var, float f17, float f18) {
        super(f3Var, null);
        this.f403621d = f3Var;
        this.f403620c = new android.graphics.RectF();
        this.f403618a = f17;
        this.f403619b = f18;
    }

    @Override // s7.d3
    public boolean a(s7.l2 l2Var) {
        if (!(l2Var instanceof s7.m2)) {
            return true;
        }
        s7.m2 m2Var = (s7.m2) l2Var;
        s7.a2 h17 = l2Var.f403585a.h(m2Var.f403724n);
        if (h17 == null) {
            java.lang.String.format("TextPath path reference '%s' not found", m2Var.f403724n);
            return false;
        }
        s7.z0 z0Var = (s7.z0) h17;
        android.graphics.Path path = new s7.x2(z0Var.f403908o).f403891a;
        android.graphics.Matrix matrix = z0Var.f403765n;
        if (matrix != null) {
            path.transform(matrix);
        }
        android.graphics.RectF rectF = new android.graphics.RectF();
        path.computeBounds(rectF, true);
        this.f403620c.union(rectF);
        return false;
    }

    @Override // s7.d3
    public void b(java.lang.String str) {
        s7.f3 f3Var = this.f403621d;
        if (f3Var.W()) {
            android.graphics.Rect rect = new android.graphics.Rect();
            f3Var.f403657d.f403597d.getTextBounds(str, 0, str.length(), rect);
            android.graphics.RectF rectF = new android.graphics.RectF(rect);
            rectF.offset(this.f403618a, this.f403619b);
            this.f403620c.union(rectF);
        }
        this.f403618a += f3Var.f403657d.f403597d.measureText(str);
    }
}
