package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public class g implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI f184743d;

    public g(com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI) {
        this.f184743d = createAvatarUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI = this.f184743d;
        if (!createAvatarUI.f183596s) {
            if (createAvatarUI.f183585e.getText().toString().equals("")) {
                createAvatarUI.enableOptionMenu(false);
                return;
            } else {
                createAvatarUI.enableOptionMenu(true);
                return;
            }
        }
        if (!createAvatarUI.f183585e.getText().toString().equals(createAvatarUI.f183598u) || createAvatarUI.f183599v) {
            createAvatarUI.enableOptionMenu(true);
        } else {
            createAvatarUI.enableOptionMenu(false);
        }
    }
}
