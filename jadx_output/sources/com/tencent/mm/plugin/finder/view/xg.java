package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class xg implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostFooter f133328a;

    public xg(com.tencent.mm.plugin.finder.view.FinderPostFooter finderPostFooter) {
        this.f133328a = finderPostFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.finder.view.FinderPostFooter finderPostFooter = this.f133328a;
        com.tencent.mm.ui.widget.MMEditText shortTitleEt = finderPostFooter.getShortTitleEt();
        boolean z17 = false;
        if (shortTitleEt != null && shortTitleEt.hasFocus()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.ui.widget.MMEditText shortTitleEt2 = finderPostFooter.getShortTitleEt();
            if (shortTitleEt2 != null) {
                shortTitleEt2.n(str);
                return;
            }
            return;
        }
        com.tencent.mm.ui.widget.MMEditText editText = finderPostFooter.getEditText();
        if (editText != null) {
            editText.n(str);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        android.view.inputmethod.InputConnection inputConnection;
        android.view.inputmethod.InputConnection inputConnection2;
        android.view.inputmethod.InputConnection inputConnection3;
        android.view.inputmethod.InputConnection inputConnection4;
        com.tencent.mm.plugin.finder.view.FinderPostFooter finderPostFooter = this.f133328a;
        com.tencent.mm.ui.widget.MMEditText shortTitleEt = finderPostFooter.getShortTitleEt();
        if (shortTitleEt != null && shortTitleEt.hasFocus()) {
            com.tencent.mm.ui.widget.MMEditText shortTitleEt2 = finderPostFooter.getShortTitleEt();
            if (shortTitleEt2 != null && (inputConnection4 = shortTitleEt2.getInputConnection()) != null) {
                inputConnection4.sendKeyEvent(new android.view.KeyEvent(0, 67));
            }
            com.tencent.mm.ui.widget.MMEditText shortTitleEt3 = finderPostFooter.getShortTitleEt();
            if (shortTitleEt3 == null || (inputConnection3 = shortTitleEt3.getInputConnection()) == null) {
                return;
            }
            inputConnection3.sendKeyEvent(new android.view.KeyEvent(1, 67));
            return;
        }
        com.tencent.mm.ui.widget.MMEditText editText = finderPostFooter.getEditText();
        if (editText != null && (inputConnection2 = editText.getInputConnection()) != null) {
            inputConnection2.sendKeyEvent(new android.view.KeyEvent(0, 67));
        }
        com.tencent.mm.ui.widget.MMEditText editText2 = finderPostFooter.getEditText();
        if (editText2 == null || (inputConnection = editText2.getInputConnection()) == null) {
            return;
        }
        inputConnection.sendKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
