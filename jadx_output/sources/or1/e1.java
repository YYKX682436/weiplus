package or1;

/* loaded from: classes9.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.ImageView f347482a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f347483b;

    public e1(or1.f1 f1Var) {
    }

    public void a() {
        android.widget.ImageView imageView = this.f347482a;
        if (imageView != null) {
            imageView.setImageDrawable(null);
            this.f347482a.setVisibility(8);
        }
        android.widget.TextView textView = this.f347483b;
        if (textView != null) {
            textView.setText("");
            this.f347483b.setVisibility(8);
        }
    }
}
