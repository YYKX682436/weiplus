package wu;

/* loaded from: classes9.dex */
public final class g1 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f449580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f449581e;

    public g1(android.widget.TextView textView, android.text.SpannableString spannableString) {
        this.f449580d = textView;
        this.f449581e = spannableString;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f449580d.setText(this.f449581e);
    }
}
