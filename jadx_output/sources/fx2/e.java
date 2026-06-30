package fx2;

/* loaded from: classes8.dex */
public final class e implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fx2.f f267124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fx2.f f267125b;

    public e(fx2.f fVar, fx2.f fVar2) {
        this.f267124a = fVar;
        this.f267125b = fVar2;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            if (!(!bitmap.isRecycled())) {
                bitmap = null;
            }
            if (bitmap != null) {
                fx2.f fVar = this.f267124a;
                java.lang.String str = fVar.f267128c;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loaded, view:");
                java.lang.ref.WeakReference weakReference = fVar.f267129d;
                android.view.View view = (android.view.View) weakReference.get();
                sb6.append(view != null ? java.lang.Integer.valueOf(view.hashCode()) : null);
                sb6.append(", ");
                fx2.f fVar2 = this.f267125b;
                sb6.append(fVar2.f267126a);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                android.view.View view2 = (android.view.View) weakReference.get();
                java.lang.Object tag = view2 != null ? view2.getTag(fVar.f267127b) : null;
                java.lang.String str2 = tag instanceof java.lang.String ? (java.lang.String) tag : null;
                if (kotlin.jvm.internal.o.b(fVar2.f267126a, str2)) {
                    pm0.v.X(new fx2.d(fVar, bitmap));
                    return;
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("loaded not match, view:");
                android.view.View view3 = (android.view.View) weakReference.get();
                sb7.append(view3 != null ? java.lang.Integer.valueOf(view3.hashCode()) : null);
                sb7.append(", lastUrl:");
                sb7.append(str2);
                com.tencent.mars.xlog.Log.i(fVar.f267128c, sb7.toString());
            }
        }
    }
}
