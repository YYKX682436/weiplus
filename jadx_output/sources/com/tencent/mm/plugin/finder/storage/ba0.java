package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class ba0 extends com.tencent.mm.plugin.finder.convert.zk {

    /* renamed from: r, reason: collision with root package name */
    public final boolean f126513r;

    /* renamed from: s, reason: collision with root package name */
    public final int f126514s;

    /* renamed from: t, reason: collision with root package name */
    public final int f126515t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.ViewOutlineProvider f126516u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ba0(boolean r8, int r9, int r10) {
        /*
            r7 = this;
            r1 = 0
            tu2.b r2 = new tu2.b
            r2.<init>()
            r0 = 0
            r2.f422131a = r0
            r3 = 0
            r4 = 0
            r5 = 13
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f126513r = r8
            r7.f126514s = r9
            r7.f126515t = r10
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            com.tencent.mm.plugin.finder.storage.aa0 r8 = new com.tencent.mm.plugin.finder.storage.aa0
            r8.<init>()
            r7.f126516u = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.storage.ba0.<init>(boolean, int, int):void");
    }

    @Override // com.tencent.mm.plugin.finder.convert.ck, in5.r
    public int e() {
        return com.tencent.mm.R.layout.aic;
    }

    @Override // com.tencent.mm.plugin.finder.convert.zk, in5.r
    /* renamed from: q */
    public void h(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f487295o70);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i19 = this.f126514s;
        layoutParams.width = i19;
        layoutParams.height = this.f126515t;
        imageView.setLayoutParams(layoutParams);
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(this.f126516u);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.e_e);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/storage/FinderMemberPreviewVideoConfig$FinderFeedPreviewVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/storage/FinderMemberPreviewVideoConfig$FinderFeedPreviewVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.tencent.mm.R.id.fuv);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/storage/FinderMemberPreviewVideoConfig$FinderFeedPreviewVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/storage/FinderMemberPreviewVideoConfig$FinderFeedPreviewVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p19 = holder.p(com.tencent.mm.R.id.f483299a85);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/storage/FinderMemberPreviewVideoConfig$FinderFeedPreviewVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/storage/FinderMemberPreviewVideoConfig$FinderFeedPreviewVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p27 = holder.p(com.tencent.mm.R.id.f484870fs4);
        android.view.ViewGroup.LayoutParams layoutParams2 = p27.getLayoutParams();
        layoutParams2.width = i19;
        p27.setLayoutParams(layoutParams2);
        y(holder, item);
        com.tencent.mm.plugin.finder.convert.ck.w(this, holder, item, 0.0f, 4, null);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.l1s);
        if (textView != null) {
            textView.setPadding(0, 0, 0, 0);
        }
        if (com.tencent.mm.ui.bk.C()) {
            holder.p(com.tencent.mm.R.id.f484870fs4).setBackgroundColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478491c));
        }
    }

    @Override // com.tencent.mm.plugin.finder.convert.ck
    public void s(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.s(holder, item);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv);
        android.view.ViewGroup.LayoutParams layoutParams = textView != null ? textView.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.leftMargin = 0;
    }

    @Override // com.tencent.mm.plugin.finder.convert.ck
    public void t(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (!this.f126513r) {
            super.t(holder, item);
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.i1g);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.i1n);
        textView.setVisibility(8);
        imageView.setVisibility(8);
    }
}
