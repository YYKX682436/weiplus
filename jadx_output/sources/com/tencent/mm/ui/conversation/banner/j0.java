package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.k0 f207524d;

    public j0(com.tencent.mm.ui.conversation.banner.k0 k0Var) {
        this.f207524d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/NetWarnBanner$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.conversation.banner.k0 k0Var = this.f207524d;
        if (!com.tencent.mm.sdk.platformtools.t8.b1((android.content.Context) k0Var.f402842g.get(), k0Var.f207536w)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, ((android.content.Context) k0Var.f402842g.get()).getString(com.tencent.mm.R.string.h7m));
            intent.putExtra("rawUrl", ((android.content.Context) k0Var.f402842g.get()).getString(com.tencent.mm.R.string.h7h));
            intent.putExtra("showShare", false);
            j45.l.j((android.content.Context) k0Var.f402842g.get(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/NetWarnBanner$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
