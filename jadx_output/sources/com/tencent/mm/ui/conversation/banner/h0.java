package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.k0 f207511d;

    public h0(com.tencent.mm.ui.conversation.banner.k0 k0Var) {
        this.f207511d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/NetWarnBanner$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.conversation.banner.k0 k0Var = this.f207511d;
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, ((android.content.Context) k0Var.f402842g.get()).getString(com.tencent.mm.R.string.f490500wu));
        intent.putExtra("rawUrl", ((android.content.Context) k0Var.f402842g.get()).getString(com.tencent.mm.R.string.h7h));
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("showShare", false);
        j45.l.j((android.content.Context) k0Var.f402842g.get(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/NetWarnBanner$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
