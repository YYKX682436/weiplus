package dt2;

/* loaded from: classes3.dex */
public final class g implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dt2.h f243177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.w94 f243178b;

    public g(dt2.h hVar, r45.w94 w94Var) {
        this.f243177a = hVar;
        this.f243178b = w94Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new dt2.f(this.f243177a, bitmap, this.f243178b));
        }
    }
}
