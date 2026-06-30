package f53;

/* loaded from: classes15.dex */
public class k implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f53.m f259663b;

    public k(f53.m mVar, java.lang.String str) {
        this.f259663b = mVar;
        this.f259662a = str;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        ((jt0.i) this.f259663b.f259677g.f139977j2).put(this.f259662a, bitmap);
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
