package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class s0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.w0 f138322d;

    public s0(com.tencent.mm.plugin.fts.ui.widget.w0 w0Var) {
        this.f138322d = w0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl = ((com.tencent.mm.plugin.fts.ui.widget.b1) ((jz5.n) this.f138322d.f138342t).getValue()).f138249d;
        if (fTSVoiceInputLayoutImpl != null) {
            fTSVoiceInputLayoutImpl.c();
            com.tencent.mm.sdk.platformtools.n3 n3Var = fTSVoiceInputLayoutImpl.f138238n;
            if (n3Var != null) {
                n3Var.removeCallbacksAndMessages(null);
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = fTSVoiceInputLayoutImpl.f138239o;
            if (n3Var2 != null) {
                n3Var2.removeCallbacksAndMessages(null);
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var = fTSVoiceInputLayoutImpl.f138240p;
            if (b4Var != null) {
                b4Var.d();
            }
        }
    }
}
