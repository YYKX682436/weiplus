package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes11.dex */
public class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xv5 f184091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI f184092e;

    public d2(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI, r45.xv5 xv5Var) {
        this.f184092e = sDKOAuthUI;
        this.f184091d = xv5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "fillNewOauthPage click CreateAvatar");
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI = this.f184092e;
        android.content.Intent intent = new android.content.Intent(sDKOAuthUI, (java.lang.Class<?>) com.tencent.mm.plugin.webview.ui.tools.CreateAvatarUI.class);
        intent.putExtra("0", sDKOAuthUI.f183718d);
        intent.putExtra("default_fileid", sDKOAuthUI.f183735x);
        r45.xv5 xv5Var = this.f184091d;
        r45.qx4 qx4Var = xv5Var.f390531y;
        if (qx4Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(qx4Var.f384336e)) {
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, xv5Var.f390531y.f384336e);
        }
        sDKOAuthUI.startActivityForResult(intent, 6);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
