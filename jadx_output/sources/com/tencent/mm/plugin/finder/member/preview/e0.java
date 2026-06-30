package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.f0 f121211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.member.preview.f0 f0Var) {
        super(1);
        this.f121211d = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.app.Activity context = this.f121211d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/XUitUE77PrSs1E17");
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f302826a;
    }
}
