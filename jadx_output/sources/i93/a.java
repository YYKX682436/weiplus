package i93;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f289718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f289718d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f289718d;
        return java.lang.Float.valueOf(i65.a.B(appCompatActivity) - i65.a.b(appCompatActivity, 32));
    }
}
