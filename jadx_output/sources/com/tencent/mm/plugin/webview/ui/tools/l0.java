package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class l0 implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI f185622a;

    public l0(com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI) {
        this.f185622a = openFileChooserUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public void a() {
        com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI = this.f185622a;
        openFileChooserUI.setResult(0);
        openFileChooserUI.finish();
    }
}
