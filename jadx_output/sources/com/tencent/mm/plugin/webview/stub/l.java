package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.m f183541d;

    public l(com.tencent.mm.plugin.webview.stub.m mVar) {
        this.f183541d = mVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f183541d.f183544b.finish();
    }
}
