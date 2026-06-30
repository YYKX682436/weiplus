package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f185771e;

    public f(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView, android.content.Context context) {
        this.f185770d = mPVideoPlayFullScreenView;
        this.f185771e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ot0.m1 m1Var = this.f185770d.f185725x;
        if (m1Var != null) {
            com.tencent.mm.plugin.webview.ui.tools.media.v0.f185829a.a(this.f185771e, m1Var, 4);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
