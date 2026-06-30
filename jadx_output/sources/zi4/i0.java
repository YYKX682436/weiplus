package zi4;

/* loaded from: classes11.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.j0 f473226d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(zi4.j0 j0Var) {
        super(0);
        this.f473226d = j0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zi4.j0 j0Var = this.f473226d;
        java.lang.ref.WeakReference weakReference = j0Var.f473181e;
        java.lang.Object obj = weakReference != null ? (android.content.Context) weakReference.get() : null;
        android.app.Activity activity = obj instanceof android.app.Activity ? (android.app.Activity) obj : null;
        if (activity != null) {
            activity.finish();
        }
        com.tencent.mars.xlog.Log.i(j0Var.f473228g, "handleRequest: " + activity);
        return jz5.f0.f302826a;
    }
}
