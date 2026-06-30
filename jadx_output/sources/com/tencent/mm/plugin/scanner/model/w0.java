package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public final class w0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.x0 f159084d;

    public w0(com.tencent.mm.plugin.scanner.model.x0 x0Var) {
        this.f159084d = x0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeGalleryHelper", "scanCodeFromGallery user cancel");
        com.tencent.mm.plugin.scanner.model.x0 x0Var = this.f159084d;
        x0Var.f159095b = 0L;
        android.content.DialogInterface.OnCancelListener onCancelListener = x0Var.f159097d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
