package hr3;

/* loaded from: classes11.dex */
public class p9 implements hr3.t9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f283881a;

    public p9(com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference, android.widget.TextView textView) {
        this.f283881a = textView;
    }

    @Override // hr3.t9
    public java.lang.CharSequence getText() {
        return this.f283881a.getText();
    }

    @Override // hr3.t9
    public android.view.View getView() {
        return this.f283881a;
    }

    @Override // hr3.t9
    public void setText(java.lang.CharSequence charSequence) {
        this.f283881a.setText(charSequence);
    }
}
