package hc2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f280314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.app.Activity activity) {
        super(0);
        this.f280314d = activity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity = this.f280314d;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            activity.finish();
        }
        return jz5.f0.f302826a;
    }
}
