package ss2;

/* loaded from: classes10.dex */
public final class c implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.d f411929d;

    public c(ss2.d dVar) {
        this.f411929d = dVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        ss2.d dVar = this.f411929d;
        if (editable != null && dVar.b().getSelectionStart() > 0) {
            dVar.b().getSelectionStart();
        }
        int b17 = com.tencent.mm.ui.tools.v4.b(dVar.f411936i * 2, java.lang.String.valueOf(editable)) / 2;
        int i17 = dVar.f411936i - b17;
        dVar.f411935h = i17;
        dVar.f411934g = i17 != 0;
        if (i17 / r1 >= 0.95d) {
            android.widget.TextView c17 = dVar.c();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(dVar.f411935h);
            sb6.append('/');
            sb6.append(dVar.f411936i);
            c17.setText(sb6.toString());
            if (dVar.f411935h > dVar.f411936i) {
                dVar.c().setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.Red_100));
                dVar.f411934g = false;
            } else {
                dVar.c().setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.FG_1));
            }
            dVar.c().setVisibility(0);
        } else {
            dVar.c().setText("");
            dVar.c().setVisibility(8);
        }
        dVar.a();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
