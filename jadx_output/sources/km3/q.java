package km3;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km3.t f309257d;

    public q(km3.t tVar) {
        this.f309257d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        km3.k kVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f485389hj2);
        int intValue = tag instanceof java.lang.Integer ? ((java.lang.Number) tag).intValue() : -1;
        java.lang.Object tag2 = view.getTag(com.tencent.mm.R.id.hjv);
        int intValue2 = tag2 instanceof java.lang.Integer ? ((java.lang.Number) tag2).intValue() : -1;
        if (intValue != -1 && intValue2 != -1 && (kVar = this.f309257d.f309268o) != null) {
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = ((com.tencent.mm.plugin.mv.ui.view.r0) kVar).f151932a;
            if (intValue2 == 1) {
                km3.t tVar = musicMVCardChooseView.f151621f;
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem x17 = tVar != null ? tVar.x(intValue) : null;
                if (x17 == null || com.tencent.mm.sdk.platformtools.t8.K0(x17.f138430e)) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Boolean.valueOf(x17 == null);
                    com.tencent.mars.xlog.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "item is null %s, item original path is null", objArr);
                } else if (musicMVCardChooseView.h()) {
                    if (x17 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) {
                        int i17 = ((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) x17).f138446x;
                        if (lm3.d0.a(i17) < lm3.d0.c(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.C1)) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "durationMs:" + i17 + " is not in range of choose to mv ");
                            db5.t7.m(musicMVCardChooseView.getContext(), musicMVCardChooseView.getContext().getString(com.tencent.mm.R.string.h5b, java.lang.Integer.valueOf(lm3.d0.c(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.C1))));
                        }
                    }
                    java.lang.String str = "local_" + x17.f138434i;
                    r45.oc5 oc5Var = com.tencent.mm.plugin.mv.ui.MusicMvAlbumPreviewUI.f150859d;
                    com.tencent.mm.plugin.mv.ui.MusicMvAlbumPreviewUI.f150859d = musicMVCardChooseView.f(str, "0");
                    android.content.Intent intent = new android.content.Intent(musicMVCardChooseView.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvAlbumPreviewUI.class);
                    if (musicMVCardChooseView.getContext() instanceof android.app.Activity) {
                        android.content.Context context = musicMVCardChooseView.getContext();
                        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                        android.app.Activity activity = (android.app.Activity) context;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList2.add(10041);
                        arrayList2.add(intent);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView", "onMediaClick", "(ILandroid/view/View;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    }
                } else {
                    if (x17 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) {
                        int i18 = ((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) x17).f138446x;
                        if (lm3.d0.a(i18) < lm3.d0.c(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.B1)) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "durationMs:" + i18 + " is not in range of choose to mv ");
                            db5.t7.m(musicMVCardChooseView.getContext(), musicMVCardChooseView.getContext().getString(com.tencent.mm.R.string.h5b, java.lang.Integer.valueOf(lm3.d0.c(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.B1))));
                        }
                    }
                    boolean z17 = musicMVCardChooseView.f151644y1;
                    kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                    kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
                    if (!z17) {
                        androidx.recyclerview.widget.RecyclerView recyclerView = musicMVCardChooseView.f151620e;
                        kotlin.jvm.internal.o.d(recyclerView);
                        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                        kotlin.jvm.internal.o.d(layoutManager);
                        int decoratedTop = layoutManager.getDecoratedTop(view) - layoutManager.getPaddingTop();
                        androidx.recyclerview.widget.RecyclerView recyclerView2 = musicMVCardChooseView.f151620e;
                        kotlin.jvm.internal.o.d(recyclerView2);
                        int computeVerticalScrollRange = recyclerView2.computeVerticalScrollRange();
                        androidx.recyclerview.widget.RecyclerView recyclerView3 = musicMVCardChooseView.f151620e;
                        kotlin.jvm.internal.o.d(recyclerView3);
                        int computeVerticalScrollOffset = recyclerView3.computeVerticalScrollOffset();
                        androidx.recyclerview.widget.RecyclerView recyclerView4 = musicMVCardChooseView.f151620e;
                        kotlin.jvm.internal.o.d(recyclerView4);
                        int height = recyclerView4.getHeight();
                        view.getHeight();
                        f0Var.f310116d = java.lang.Math.max(0, java.lang.Math.min(decoratedTop, ((computeVerticalScrollRange - computeVerticalScrollOffset) - height) + (musicMVCardChooseView.f151631p1 - musicMVCardChooseView.f151625l1)));
                    }
                    musicMVCardChooseView.i(true, new com.tencent.mm.plugin.mv.ui.view.u0(z17, f0Var, f0Var2, musicMVCardChooseView), new com.tencent.mm.plugin.mv.ui.view.v0(view, musicMVCardChooseView, x17));
                }
            } else if (intValue2 == 2) {
                if (musicMVCardChooseView.P) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Mv.MusicMVCardChooseView", "click open camera, but camera is opening");
                } else {
                    musicMVCardChooseView.P = true;
                    if (musicMVCardChooseView.h()) {
                        com.tencent.mm.plugin.mv.ui.view.b0 b0Var = musicMVCardChooseView.G;
                        if (b0Var != null) {
                            ((com.tencent.mm.plugin.mv.ui.MusicMvMakerUI) b0Var).b7(2000);
                        }
                    } else {
                        com.tencent.mm.plugin.mv.ui.view.b0 b0Var2 = musicMVCardChooseView.G;
                        if (b0Var2 != null) {
                            ((com.tencent.mm.plugin.mv.ui.MusicMvMakerUI) b0Var2).b7((lm3.d0.c(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.B1) * 1000) + 500);
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$mOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
