package o25;

/* loaded from: classes.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f342557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f342558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f342559f;

    public m1(androidx.appcompat.app.AppCompatActivity appCompatActivity, int i17, android.view.View view) {
        this.f342557d = appCompatActivity;
        this.f342558e = i17;
        this.f342559f = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f342557d;
        appCompatActivity.getWindow().getDecorView().setSystemUiVisibility(appCompatActivity.getWindow().getDecorView().getSystemUiVisibility() | 256);
        int i17 = this.f342558e;
        com.tencent.mars.xlog.Log.i("MicroMsg.FullScreenHelper", "setFullScreenAfterSetContentView to contentView, height: %s", java.lang.Integer.valueOf(i17));
        android.view.View view = this.f342559f;
        if (view != null) {
            view.setPadding(0, i17, 0, 0);
        }
    }
}
