package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class i0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI f184817d;

    public i0(com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI) {
        this.f184817d = openFileChooserUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.f(1, this.f184817d.getString(com.tencent.mm.R.string.l6h));
    }
}
