package lu1;

/* loaded from: classes5.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f321338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f321339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f321340f;

    public e0(android.widget.ImageView imageView, int i17, int i18) {
        this.f321338d = imageView;
        this.f321339e = i17;
        this.f321340f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f321339e;
        android.widget.ImageView imageView = this.f321338d;
        imageView.setImageResource(i17);
        imageView.setColorFilter(this.f321340f, android.graphics.PorterDuff.Mode.SRC_IN);
    }
}
