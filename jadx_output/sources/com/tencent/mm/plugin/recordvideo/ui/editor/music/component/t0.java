package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class t0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 f156314d;

    public t0(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var) {
        this.f156314d = b1Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1 b1Var = this.f156314d;
        if (3 != i17) {
            boolean z17 = false;
            if (6 != i17) {
                return false;
            }
            if (b1Var.f156174o != null) {
                com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1.q(b1Var, false);
                android.widget.EditText editText = b1Var.f156174o;
                if (editText != null && true == editText.hasFocus()) {
                    z17 = true;
                }
                if (z17) {
                    editText.clearFocus();
                }
            }
            return true;
        }
        java.lang.String str = b1Var.f156181v;
        if (str != null) {
            java.lang.CharSequence text = textView.getText();
            if (!com.tencent.mm.sdk.platformtools.t8.D0(str, text != null ? text.toString() : null)) {
                wt3.u uVar = wt3.v.f449504h;
                wt3.v.f449506j.f61552e = 2L;
                uVar.a();
                wt3.v.f449506j.f61556i = 0L;
            }
        }
        java.lang.CharSequence text2 = textView.getText();
        java.lang.String obj = text2 != null ? text2.toString() : null;
        b1Var.f156181v = obj;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            b1Var.A();
        }
        return true;
    }
}
