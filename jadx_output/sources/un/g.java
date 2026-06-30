package un;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f429254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f429254d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f429254d;
        sb6.append(appCompatActivity.getPackageName());
        sb6.append("_preferences");
        return appCompatActivity.getSharedPreferences(sb6.toString(), 0);
    }
}
