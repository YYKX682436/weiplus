package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class y0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f206019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.i1 f206021f;

    public y0(com.tencent.mm.ui.chatting.viewitems.i1 i1Var, android.view.View view, java.lang.String str) {
        this.f206021f = i1Var;
        this.f206019d = view;
        this.f206020e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        c01.d9.e().q(1198, this);
        com.tencent.mm.ui.chatting.viewitems.i1 i1Var = this.f206021f;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = i1Var.f204151u;
        if (u3Var != null) {
            u3Var.dismiss();
            i1Var.f204151u = null;
        }
        android.view.View view = this.f206019d;
        if (i17 != 0 || i18 != 0) {
            db5.t7.makeText(view.getContext(), com.tencent.mm.R.string.hcq, 0).show();
            return;
        }
        com.tencent.mm.modelbase.o oVar = ((k01.b1) ((k01.p0) m1Var)).f303004d;
        r45.tf7 tf7Var = oVar != null ? (r45.tf7) oVar.f70711b.f70700a : null;
        if (tf7Var == null) {
            db5.t7.makeText(view.getContext(), com.tencent.mm.R.string.hcq, 0).show();
            return;
        }
        java.lang.String str2 = tf7Var.f386387d;
        java.lang.String str3 = this.f206020e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppBrandNotifyMsg", "more view clicked, menu item COMPLAIN_APP_BRAND selected, sync attr username %s", str3);
        if (android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppBrandNotifyMsg", "appId(%s) or msgId(%s) is null or nil.", str3, str2);
            db5.t7.makeText(view.getContext(), com.tencent.mm.R.string.f492652hd0, 0).show();
            return;
        }
        try {
            java.lang.String format = java.lang.String.format(java.util.Locale.US, com.tencent.mm.ui.chatting.viewitems.i1.D, java.net.URLEncoder.encode(str3, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), java.net.URLEncoder.encode(str2, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), 13);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            com.tencent.mm.ui.chatting.viewitems.a0.h(intent, i1Var.f204150t.x());
            j45.l.j(i1Var.f204150t.g(), "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.io.UnsupportedEncodingException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppBrandNotifyMsg", "Error occurred when encode url.");
            db5.t7.makeText(view.getContext(), com.tencent.mm.R.string.f492652hd0, 0).show();
        }
    }
}
