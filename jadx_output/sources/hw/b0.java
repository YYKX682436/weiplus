package hw;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f285360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.app.Activity activity) {
        super(0);
        this.f285360d = activity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.Toast.makeText(this.f285360d, "SCL PROCESS DEAD! RECREATION START! (Only show in debug env)", 1).show();
        return jz5.f0.f302826a;
    }
}
