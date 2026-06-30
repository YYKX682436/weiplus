package fx2;

/* loaded from: classes8.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fx2.f f267122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f267123e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fx2.f fVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f267122d = fVar;
        this.f267123e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fx2.f fVar = this.f267122d;
        java.lang.String str = fVar.f267128c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loaded match, view:");
        java.lang.ref.WeakReference weakReference = fVar.f267129d;
        android.view.View view = (android.view.View) weakReference.get();
        sb6.append(view != null ? java.lang.Integer.valueOf(view.hashCode()) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        fVar.f267130e = this.f267123e;
        android.view.View view2 = (android.view.View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
        return jz5.f0.f302826a;
    }
}
