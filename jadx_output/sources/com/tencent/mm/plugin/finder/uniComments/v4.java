package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class v4 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f130437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.a5 f130438e;

    public v4(com.tencent.mm.plugin.finder.uniComments.a5 a5Var) {
        this.f130438e = a5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r8 != 5) goto L25;
     */
    @Override // androidx.recyclerview.widget.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder$onBuildDrawerBody$1"
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
            com.tencent.mm.plugin.finder.uniComments.a5 r0 = r6.f130438e
            if (r8 == 0) goto L50
            r1 = 1
            r2 = 3
            if (r8 == r1) goto L38
            if (r8 == r2) goto L38
            r1 = 4
            if (r8 == r1) goto L50
            r1 = 5
            if (r8 == r1) goto L50
            goto La0
        L38:
            int r7 = r6.f130437d
            if (r7 == r2) goto La0
            com.tencent.mm.plugin.finder.uniComments.UniCommentFooter r7 = r0.l()
            int r0 = r7.footerMode
            if (r0 != r1) goto L48
            r7.j(r1)
            goto La0
        L48:
            r1 = 2
            if (r0 != r1) goto La0
            r0 = 0
            r7.m(r0)
            goto La0
        L50:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r7 = r7.getLayoutManager()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            kotlin.jvm.internal.o.e(r7, r1)
            androidx.recyclerview.widget.LinearLayoutManager r7 = (androidx.recyclerview.widget.LinearLayoutManager) r7
            com.tencent.mm.plugin.finder.uniComments.g2 r0 = r0.f130188d
            int r7 = r7.y()
            com.tencent.mm.plugin.finder.uniComments.q3 r0 = (com.tencent.mm.plugin.finder.uniComments.q3) r0
            com.tencent.mm.plugin.finder.uniComments.p4 r1 = r0.f130369f
            java.util.ArrayList r1 = r1.f130360a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "preloadNextPage, onScrollIdle, lastVisiblePosition:"
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r3 = ", dataList size:"
            r2.append(r3)
            int r3 = r1.size()
            r2.append(r3)
            java.lang.String r3 = ", canPreload:"
            r2.append(r3)
            boolean r0 = r0.f130385y
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "MicroMsg.MusicUni.DrawerPresenter"
            com.tencent.mars.xlog.Log.i(r2, r0)
            if (r7 < 0) goto La0
            int r0 = r1.size()
            if (r7 >= r0) goto La0
            r1.size()
            com.tencent.mm.plugin.finder.storage.t70 r7 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            r7.s()
        La0:
            r6.f130437d = r8
            java.lang.String r7 = "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder$onBuildDrawerBody$1"
            java.lang.String r8 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r0 = "onScrollStateChanged"
            java.lang.String r1 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
            yj0.a.h(r6, r7, r8, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.uniComments.v4.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder$onBuildDrawerBody$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder$onBuildDrawerBody$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
