package zl2;

/* loaded from: classes.dex */
public final class k3 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f473860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f473861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f473862f;

    public k3(android.widget.TextView textView, int i17, yz5.a aVar) {
        this.f473860d = textView;
        this.f473861e = i17;
        this.f473862f = aVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        int f17 = com.tencent.mm.ui.tools.v4.f(java.lang.String.valueOf(editable)) / 2;
        android.widget.TextView textView = this.f473860d;
        if (textView != null) {
            int i17 = this.f473861e;
            if (f17 >= 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(f17);
                sb6.append('/');
                sb6.append(i17);
                str = sb6.toString();
            } else {
                str = "0/" + i17;
            }
            textView.setText(str);
        }
        yz5.a aVar = this.f473862f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
