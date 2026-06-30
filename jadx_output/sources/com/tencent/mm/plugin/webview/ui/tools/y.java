package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class y implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.z f187684d;

    public y(com.tencent.mm.plugin.webview.ui.tools.z zVar) {
        this.f187684d = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.z zVar = this.f187684d;
        zVar.f187710d.f184166f.setResult(1);
        zVar.f187710d.f184166f.finish();
    }
}
