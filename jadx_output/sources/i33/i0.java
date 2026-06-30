package i33;

/* loaded from: classes10.dex */
public final class i0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.t0 f288201d;

    public i0(i33.t0 t0Var) {
        this.f288201d = t0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    @Override // androidx.recyclerview.widget.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollBarUIC$handleScrollBarFollowGalleryScroll$1$1"
            java.lang.String r1 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r2 = "onScrollStateChanged"
            java.lang.String r3 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4.add(r5)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.g(r7, r0)
            i33.t0 r7 = r6.f288201d
            java.lang.String r0 = r7.f288247f
            k33.d r0 = r7.Z6()
            r0.getF138672e()
            r7.X6()
            if (r8 != 0) goto L64
            k33.d r8 = r7.Z6()
            com.tencent.mm.ui.q2 r8 = r8.getF138672e()
            com.tencent.mm.ui.q2 r0 = com.tencent.mm.ui.q2.FULL_SCREEN_FOCUS
            if (r8 != r0) goto L52
            jz5.g r8 = r7.f288258t
            jz5.n r8 = (jz5.n) r8
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            long r0 = r8.longValue()
            goto L60
        L52:
            jz5.g r8 = r7.f288257s
            jz5.n r8 = (jz5.n) r8
            java.lang.Object r8 = r8.getValue()
            java.lang.Number r8 = (java.lang.Number) r8
            long r0 = r8.longValue()
        L60:
            r7.c7(r0)
            goto L90
        L64:
            boolean r8 = r7.f288263y
            if (r8 != 0) goto L8a
            j33.w r8 = r7.b7()
            androidx.recyclerview.widget.RecyclerView r0 = r8.f297460a
            int r0 = r0.computeVerticalScrollRange()
            float r0 = (float) r0
            androidx.recyclerview.widget.RecyclerView r1 = r8.f297460a
            int r1 = r1.getHeight()
            int r2 = r8.f297464e
            int r1 = r1 - r2
            int r8 = r8.f297465f
            int r1 = r1 - r8
            float r8 = (float) r1
            float r0 = r0 / r8
            int r8 = r7.f288250i
            float r8 = (float) r8
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 < 0) goto L8a
            r8 = 1
            goto L8b
        L8a:
            r8 = 0
        L8b:
            if (r8 == 0) goto L90
            r7.d7()
        L90:
            java.lang.String r7 = "com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollBarUIC$handleScrollBarFollowGalleryScroll$1$1"
            java.lang.String r8 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r0 = "onScrollStateChanged"
            java.lang.String r1 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            yj0.a.h(r6, r7, r8, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i33.i0.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollBarUIC$handleScrollBarFollowGalleryScroll$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        i33.t0 t0Var = this.f288201d;
        if (t0Var.f288248g) {
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollBarUIC$handleScrollBarFollowGalleryScroll$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        j33.w b76 = t0Var.b7();
        int b17 = b76.b();
        com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar touchableGalleryScrollBar = (com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar) b76.f297461b;
        t0Var.a7().setTranslationY(b76.a(touchableGalleryScrollBar.c(b17, touchableGalleryScrollBar.f138672e)));
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/uic/AlbumScrollBarUIC$handleScrollBarFollowGalleryScroll$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
