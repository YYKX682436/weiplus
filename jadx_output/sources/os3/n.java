package os3;

/* loaded from: classes8.dex */
public class n implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f348154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ComposeUI f348155e;

    public n(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI, android.widget.ImageView imageView) {
        this.f348155e = composeUI;
        this.f348154d = imageView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348155e;
        boolean z17 = composeUI.G;
        android.widget.ImageView imageView = this.f348154d;
        if (z17) {
            imageView.setVisibility(composeUI.f154844q.getText().length() > 0 ? 0 : 4);
        } else {
            imageView.setVisibility(4);
        }
    }
}
