package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes5.dex */
public class f implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI f184163d;

    public f(com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI) {
        this.f184163d = createAvatarUI;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (i17 == 4) {
            com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI createAvatarUI = this.f184163d;
            createAvatarUI.f183584d = (android.view.inputmethod.InputMethodManager) createAvatarUI.getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = createAvatarUI.f183584d;
            if (inputMethodManager != null && inputMethodManager.isActive()) {
                createAvatarUI.f183584d.hideSoftInputFromWindow(createAvatarUI.getCurrentFocus().getWindowToken(), 0);
                createAvatarUI.f183585e.setCursorVisible(false);
                createAvatarUI.getWindow().getDecorView().requestFocus();
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
