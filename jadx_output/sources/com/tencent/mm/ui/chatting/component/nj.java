package com.tencent.mm.ui.chatting.component;

/* loaded from: classes4.dex */
public class nj implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f199594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.oj f199595e;

    public nj(com.tencent.mm.ui.chatting.component.oj ojVar, com.tencent.mm.modelbase.f fVar) {
        this.f199595e = ojVar;
        this.f199594d = fVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.app.Activity g17 = this.f199595e.f199647b.f198580d.g();
        java.lang.String str = ((r45.vx) this.f199594d.f70618d).f388633g.f387922f;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", true);
        intent.putExtra("allow_mix_content_mode", false);
        j45.l.j(g17, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }
}
