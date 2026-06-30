package la;

/* loaded from: classes15.dex */
public class e extends la.f {

    /* renamed from: b, reason: collision with root package name */
    public float f317449b;

    /* renamed from: c, reason: collision with root package name */
    public float f317450c;

    @Override // la.f
    public void a(android.graphics.Matrix matrix, android.graphics.Path path) {
        android.graphics.Matrix matrix2 = this.f317451a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f317449b, this.f317450c);
        path.transform(matrix);
    }
}
