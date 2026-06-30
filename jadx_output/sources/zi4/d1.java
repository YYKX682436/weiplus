package zi4;

/* loaded from: classes11.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.e1 f473204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(zi4.e1 e1Var) {
        super(0);
        this.f473204d = e1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zi4.e1 e1Var = this.f473204d;
        java.lang.ref.WeakReference weakReference = e1Var.f473181e;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        if (context == null || !(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e(e1Var.f473207g, "jumpSelectStatusIconPage: failed");
        } else {
            bi4.d1 d1Var = new bi4.d1();
            d1Var.f354942i = 17L;
            bi4.o1.f21075a.b((android.app.Activity) context, d1Var, 1001);
        }
        return jz5.f0.f302826a;
    }
}
