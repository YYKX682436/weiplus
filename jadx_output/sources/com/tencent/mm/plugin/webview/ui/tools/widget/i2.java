package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class i2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f187261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p2 f187262e;

    public i2(com.tencent.mm.plugin.webview.ui.tools.widget.p2 p2Var, com.tencent.xweb.z zVar) {
        this.f187262e = p2Var;
        this.f187261d = zVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f187261d.a();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this.f187262e.s();
    }
}
