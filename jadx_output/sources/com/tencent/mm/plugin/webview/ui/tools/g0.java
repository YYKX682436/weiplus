package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class g0 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI f184744a;

    public g0(com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI) {
        this.f184744a = openFileChooserUI;
    }

    @Override // d85.k0
    public void onOp(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        d85.g0 g0Var = d85.g0.CAMERA;
        com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI openFileChooserUI = this.f184744a;
        if (booleanValue) {
            openFileChooserUI.onBusinessPermissionGranted(g0Var.f227192d);
        } else {
            openFileChooserUI.onBusinessPermissionDenied(g0Var.f227192d);
        }
    }
}
