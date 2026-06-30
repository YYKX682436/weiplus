package or1;

/* loaded from: classes9.dex */
public class r1 {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.ImageView f347565a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f347566b;

    public r1(or1.s1 s1Var) {
    }

    public void a() {
        android.widget.ImageView imageView = this.f347565a;
        if (imageView != null) {
            imageView.setImageDrawable(null);
            this.f347565a.setVisibility(8);
        }
        android.widget.TextView textView = this.f347566b;
        if (textView != null) {
            textView.setText("");
            this.f347566b.setVisibility(8);
        }
    }
}
