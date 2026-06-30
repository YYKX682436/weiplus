package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public class e implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI f184112d;

    public e(com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI) {
        this.f184112d = createAvatarUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 6 || (keyEvent != null && keyEvent.getKeyCode() == 66)) {
            com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI = this.f184112d;
            createAvatarUI.f183584d = (android.view.inputmethod.InputMethodManager) createAvatarUI.getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = createAvatarUI.f183584d;
            if (inputMethodManager != null && inputMethodManager.isActive()) {
                createAvatarUI.f183584d.hideSoftInputFromWindow(createAvatarUI.getCurrentFocus().getWindowToken(), 0);
                createAvatarUI.f183585e.setCursorVisible(false);
                createAvatarUI.getWindow().getDecorView().requestFocus();
            }
        }
        return false;
    }
}
