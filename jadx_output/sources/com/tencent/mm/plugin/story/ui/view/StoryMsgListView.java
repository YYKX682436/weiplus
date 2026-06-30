package com.tencent.mm.plugin.story.ui.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010!\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#B\u001b\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010$R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\nR*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006%"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryMsgListView;", "Landroid/widget/RelativeLayout;", "Lkotlin/Function1;", "Lgf4/a;", "Ljz5/f0;", "h", "Lyz5/l;", "getOnCommentItemClick", "()Lyz5/l;", "setOnCommentItemClick", "(Lyz5/l;)V", "onCommentItemClick", "Lkotlin/Function0;", "i", "Lyz5/a;", "getOnBlankClick", "()Lyz5/a;", "setOnBlankClick", "(Lyz5/a;)V", "onBlankClick", "", "m", "getOnContentTopOverScroll", "setOnContentTopOverScroll", "onContentTopOverScroll", "n", "getOnContentTopOverScrollStop", "setOnContentTopOverScrollStop", "onContentTopOverScrollStop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StoryMsgListView extends android.widget.RelativeLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f172000o = 0;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f172001d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f172002e;

    /* renamed from: f, reason: collision with root package name */
    public int f172003f;

    /* renamed from: g, reason: collision with root package name */
    public int f172004g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.l onCommentItemClick;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public yz5.a onBlankClick;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public yz5.l onContentTopOverScroll;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public yz5.a onContentTopOverScrollStop;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryMsgListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f172003f = -1;
        android.view.View.inflate(context, com.tencent.mm.R.layout.cwy, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.npa);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f172001d = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.np8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f172002e = (android.widget.TextView) findViewById2;
        kotlin.jvm.internal.o.f(android.view.ViewConfiguration.get(context), "get(...)");
        setOnClickListener(new rf4.n1(this));
    }

    public final java.util.ArrayList a(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new gf4.a((gf4.a) it.next()));
        }
        return arrayList;
    }

    public final void b(int i17, java.util.ArrayList comments, java.util.ArrayList bubbles, nf4.j jVar) {
        kotlin.jvm.internal.o.g(comments, "comments");
        kotlin.jvm.internal.o.g(bubbles, "bubbles");
        this.f172003f = i17;
        android.widget.TextView textView = this.f172002e;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f172001d;
        if (i17 == 0) {
            pf4.f0 f0Var = new pf4.f0(a(bubbles));
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(getContext(), 4));
            recyclerView.setAdapter(f0Var);
            android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(com.tencent.mm.ui.zk.a(getContext(), 40));
            android.view.ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(com.tencent.mm.ui.zk.a(getContext(), 40));
            textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.jmn));
            if (bubbles.isEmpty()) {
                textView.setVisibility(0);
                recyclerView.setVisibility(8);
            } else {
                textView.setVisibility(8);
                recyclerView.setVisibility(0);
            }
        } else if (i17 == 1) {
            pf4.w wVar = new pf4.w(a(comments));
            wVar.f353904g = jVar;
            wVar.f353905h = this.onCommentItemClick;
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
            recyclerView.setAdapter(wVar);
            textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.jmq));
            if (comments.isEmpty()) {
                textView.setVisibility(0);
                recyclerView.setVisibility(8);
            } else {
                textView.setVisibility(8);
                recyclerView.setVisibility(0);
            }
        }
        recyclerView.post(new rf4.o1(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[EDGE_INSN: B:20:0x008a->B:21:0x008a BREAK  A[LOOP:0: B:11:0x003a->B:26:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[LOOP:0: B:11:0x003a->B:26:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.List r11) {
        /*
            r10 = this;
            java.lang.String r0 = "datas"
            kotlin.jvm.internal.o.g(r11, r0)
            boolean r0 = r11.isEmpty()
            r1 = 8
            android.widget.TextView r2 = r10.f172002e
            r3 = 0
            androidx.recyclerview.widget.RecyclerView r4 = r10.f172001d
            if (r0 == 0) goto L19
            r2.setVisibility(r3)
            r4.setVisibility(r1)
            return
        L19:
            r2.setVisibility(r1)
            r4.setVisibility(r3)
            int r0 = r10.f172003f
            r1 = 1
            if (r0 != 0) goto Lb2
            androidx.recyclerview.widget.f2 r0 = r4.getAdapter()
            if (r0 == 0) goto Lcb
            pf4.f0 r0 = (pf4.f0) r0
            java.util.ArrayList r2 = r10.a(r11)
            java.util.HashMap r5 = r0.f353868f
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L3a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L89
            java.lang.Object r6 = r5.next()
            java.lang.String r7 = "next(...)"
            kotlin.jvm.internal.o.f(r6, r7)
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            ef4.v r7 = ef4.w.f252468t
            java.lang.String r8 = r7.e()
            java.lang.Object r9 = r6.getKey()
            java.lang.String r9 = (java.lang.String) r9
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.D0(r8, r9)
            if (r8 != 0) goto L79
            nf4.g r7 = r7.g()
            java.lang.Object r8 = r6.getKey()
            java.lang.String r9 = "<get-key>(...)"
            kotlin.jvm.internal.o.f(r8, r9)
            java.lang.String r8 = (java.lang.String) r8
            nf4.f r7 = r7.P0(r8)
            boolean r7 = r7.t0()
            if (r7 == 0) goto L79
            r7 = r1
            goto L7a
        L79:
            r7 = r3
        L7a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.Object r6 = r6.getValue()
            boolean r6 = kotlin.jvm.internal.o.b(r7, r6)
            if (r6 != 0) goto L3a
            goto L8a
        L89:
            r1 = r3
        L8a:
            if (r1 == 0) goto L98
            java.util.ArrayList r1 = r0.f353866d
            r1.clear()
            r1.addAll(r2)
            r0.notifyDataSetChanged()
            goto La9
        L98:
            pf4.e0 r1 = new pf4.e0
            r1.<init>(r0, r2)
            androidx.recyclerview.widget.c0 r1 = androidx.recyclerview.widget.h0.a(r1, r3)
            pf4.d0 r3 = new pf4.d0
            r3.<init>(r0, r2)
            r1.a(r3)
        La9:
            rf4.p1 r0 = new rf4.p1
            r0.<init>(r10, r11)
            r4.post(r0)
            goto Lcb
        Lb2:
            if (r0 != r1) goto Lcb
            androidx.recyclerview.widget.f2 r0 = r4.getAdapter()
            if (r0 == 0) goto Lcb
            pf4.w r0 = (pf4.w) r0
            java.util.ArrayList r1 = r10.a(r11)
            r0.x(r1)
            rf4.q1 r0 = new rf4.q1
            r0.<init>(r10, r11)
            r4.post(r0)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.story.ui.view.StoryMsgListView.c(java.util.List):void");
    }

    public final yz5.a getOnBlankClick() {
        return this.onBlankClick;
    }

    public final yz5.l getOnCommentItemClick() {
        return this.onCommentItemClick;
    }

    public final yz5.l getOnContentTopOverScroll() {
        return this.onContentTopOverScroll;
    }

    public final yz5.a getOnContentTopOverScrollStop() {
        return this.onContentTopOverScrollStop;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View target, int i17, int i18, int[] consumed) {
        int i19;
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(consumed, "consumed");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f172001d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            i19 = ((androidx.recyclerview.widget.GridLayoutManager) layoutManager2).t();
        } else if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            i19 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager3).t();
        } else {
            i19 = -1;
        }
        if (i18 > 0) {
            int i27 = this.f172004g;
            if (i27 != 0) {
                this.f172004g = i27 + i18;
                yz5.l lVar = this.onContentTopOverScroll;
                if (lVar != null) {
                    lVar.invoke(java.lang.Integer.valueOf(i18));
                }
                consumed[0] = i17;
                consumed[1] = i18;
                return;
            }
            return;
        }
        if (i18 >= 0 || i19 != 0) {
            return;
        }
        this.f172004g += i18;
        yz5.l lVar2 = this.onContentTopOverScroll;
        if (lVar2 != null) {
            lVar2.invoke(java.lang.Integer.valueOf(i18));
        }
        consumed[0] = i17;
        consumed[1] = i18;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View child, android.view.View target, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        this.f172004g = 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View child, android.view.View target, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        return (i17 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View child) {
        int i17;
        yz5.a aVar;
        kotlin.jvm.internal.o.g(child, "child");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f172001d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            i17 = ((androidx.recyclerview.widget.GridLayoutManager) layoutManager2).t();
        } else if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            i17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager3).t();
        } else {
            i17 = -1;
        }
        if (i17 != 0 || (aVar = this.onContentTopOverScrollStop) == null) {
            return;
        }
        aVar.invoke();
    }

    public final void setOnBlankClick(yz5.a aVar) {
        this.onBlankClick = aVar;
    }

    public final void setOnCommentItemClick(yz5.l lVar) {
        this.onCommentItemClick = lVar;
    }

    public final void setOnContentTopOverScroll(yz5.l lVar) {
        this.onContentTopOverScroll = lVar;
    }

    public final void setOnContentTopOverScrollStop(yz5.a aVar) {
        this.onContentTopOverScrollStop = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryMsgListView(android.content.Context context) {
        this(context, null, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryMsgListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
