package d7;

/* loaded from: classes13.dex */
public class k0 implements d7.x {

    /* renamed from: a, reason: collision with root package name */
    public final d7.i0 f226819a;

    /* renamed from: b, reason: collision with root package name */
    public final q7.f f226820b;

    public k0(d7.i0 i0Var, q7.f fVar) {
        this.f226819a = i0Var;
        this.f226820b = fVar;
    }

    @Override // d7.x
    public void a() {
        d7.i0 i0Var = this.f226819a;
        synchronized (i0Var) {
            i0Var.f226811f = i0Var.f226809d.length;
        }
    }

    @Override // d7.x
    public void b(x6.d dVar, android.graphics.Bitmap bitmap) {
        java.io.IOException iOException = this.f226820b.f360296e;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            dVar.b(bitmap);
            throw iOException;
        }
    }
}
