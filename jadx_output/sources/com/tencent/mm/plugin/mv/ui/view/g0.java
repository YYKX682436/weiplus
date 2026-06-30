package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class g0 implements com.tencent.mm.plugin.mv.ui.view.o3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151829a;

    public g0(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView) {
        this.f151829a = musicMVCardChooseView;
    }

    public void a(int i17, com.tencent.mm.plugin.mv.ui.view.t3 data, int i18, android.view.View itemView, androidx.recyclerview.widget.RecyclerView recyclerView, int i19) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        int i27 = com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.B1;
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = this.f151829a;
        if (!musicMVCardChooseView.h()) {
            boolean z17 = musicMVCardChooseView.f151644y1;
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            if (!z17) {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                kotlin.jvm.internal.o.d(layoutManager);
                int decoratedTop = layoutManager.getDecoratedTop(itemView) - layoutManager.getPaddingTop();
                int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int height = recyclerView.getHeight();
                itemView.getHeight();
                f0Var.f310116d = java.lang.Math.max(0, java.lang.Math.min(decoratedTop, ((computeVerticalScrollRange - computeVerticalScrollOffset) - height) + (musicMVCardChooseView.f151631p1 - musicMVCardChooseView.f151625l1)));
            }
            musicMVCardChooseView.i(true, new com.tencent.mm.plugin.mv.ui.view.e0(f0Var, f0Var2, recyclerView), new com.tencent.mm.plugin.mv.ui.view.f0(itemView, musicMVCardChooseView, data));
            return;
        }
        r45.oc5 oc5Var = com.tencent.mm.plugin.mv.ui.MusicMvAlbumPreviewUI.f150859d;
        com.tencent.mm.plugin.mv.ui.MusicMvAlbumPreviewUI.f150859d = musicMVCardChooseView.f(pm0.v.u(data.f151951a), java.lang.String.valueOf(i19));
        android.content.Intent intent = new android.content.Intent(musicMVCardChooseView.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvAlbumPreviewUI.class);
        if (musicMVCardChooseView.getContext() instanceof android.app.Activity) {
            android.content.Context context = musicMVCardChooseView.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(10041);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$fragmentItemClickedListener$1", "onItemClicked", "(ILcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsItemData;ILandroid/view/View;Landroidx/recyclerview/widget/RecyclerView;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }
}
