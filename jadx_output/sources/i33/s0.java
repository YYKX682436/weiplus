package i33;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f288243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f288243d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f288243d.getSystemService("vibrator");
        if (systemService instanceof android.os.Vibrator) {
            return (android.os.Vibrator) systemService;
        }
        return null;
    }
}
