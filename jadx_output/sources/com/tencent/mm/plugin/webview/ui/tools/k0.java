package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class k0 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI f185597d;

    public k0(com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI) {
        this.f185597d = openFileChooserUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI = this.f185597d;
        openFileChooserUI.setResult(0);
        openFileChooserUI.finish();
    }
}
