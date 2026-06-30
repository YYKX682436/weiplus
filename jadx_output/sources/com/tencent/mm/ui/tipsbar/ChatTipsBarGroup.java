package com.tencent.mm.ui.tipsbar;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003-./B\u001d\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00060"}, d2 = {"Lcom/tencent/mm/ui/tipsbar/ChatTipsBarGroup;", "Landroid/widget/FrameLayout;", "", "paddingTopToSet", "Ljz5/f0;", "setListViewPaddingTop", "visibility", "setVisibility", "Ljava/util/ArrayList;", "Lin5/c;", "Lkotlin/collections/ArrayList;", "q", "Ljava/util/ArrayList;", "getDataList", "()Ljava/util/ArrayList;", "dataList", "Ljava/lang/ref/WeakReference;", "Lyb5/d;", "r", "Ljava/lang/ref/WeakReference;", "getChattingContextRef", "()Ljava/lang/ref/WeakReference;", "setChattingContextRef", "(Ljava/lang/ref/WeakReference;)V", "chattingContextRef", "Landroid/view/View$OnClickListener;", "s", "Landroid/view/View$OnClickListener;", "getSelfClickListener", "()Landroid/view/View$OnClickListener;", "selfClickListener", "", "t", "Ljava/lang/String;", "getCurTalkerName", "()Ljava/lang/String;", "setCurTalkerName", "(Ljava/lang/String;)V", "curTalkerName", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/ui/tipsbar/c", "com/tencent/mm/ui/tipsbar/d", "com/tencent/mm/ui/tipsbar/e", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ChatTipsBarGroup extends android.widget.FrameLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f209904v = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView f209905d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.RelativeLayout f209906e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f209907f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f209908g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f209909h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f209910i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f209911m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f209912n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f209913o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.ui.tipsbar.d f209914p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final java.util.ArrayList dataList;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public java.lang.ref.WeakReference chattingContextRef;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final android.view.View.OnClickListener selfClickListener;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public java.lang.String curTalkerName;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.ui.tipsbar.o f209919u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTipsBarGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.tipsbar.d dVar = new com.tencent.mm.ui.tipsbar.d();
        this.f209914p = dVar;
        this.dataList = dVar.f209927c;
        com.tencent.mm.ui.tipsbar.p pVar = new com.tencent.mm.ui.tipsbar.p(this);
        this.selfClickListener = pVar;
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488393s3, this);
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479738dv);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m98);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView = (com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView) findViewById;
        this.f209905d = maxHeightWxRecyclerView;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.hyi);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f209906e = (android.widget.RelativeLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.b1n);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f209907f = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ovu);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f209908g = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.ovt);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f209909h = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f487530ow1);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f209910i = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.ovv);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f209911m = findViewById7;
        maxHeightWxRecyclerView.N(new com.tencent.mm.ui.tipsbar.a(h17));
        maxHeightWxRecyclerView.P(new com.tencent.mm.ui.tipsbar.b(this));
        maxHeightWxRecyclerView.setLayoutManager(new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(getContext()));
        setOnClickListener(pVar);
        this.curTalkerName = "";
        this.f209919u = new com.tencent.mm.ui.tipsbar.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setListViewPaddingTop(int i17) {
        yb5.d dVar;
        java.lang.ref.WeakReference weakReference = this.chattingContextRef;
        if (weakReference == null || (dVar = (yb5.d) weakReference.get()) == null) {
            return;
        }
        android.view.ViewGroup f17 = dVar.p().f();
        java.lang.Object tag = f17.getTag(com.tencent.mm.R.id.bgd);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        if (i17 != intValue) {
            f17.setTag(com.tencent.mm.R.id.bgd, java.lang.Integer.valueOf(i17));
            f17.setPadding(f17.getPaddingLeft(), f17.getPaddingTop() + (i17 - intValue), f17.getPaddingRight(), f17.getPaddingBottom());
        }
    }

    public final void b() {
        if (!this.f209912n && !this.f209913o && this.f209914p.f209925a == com.tencent.mm.ui.tipsbar.c.f209923e) {
            d();
        }
        setVisibility(8);
        setListViewPaddingTop(0);
        this.f209905d.setAdapter(null);
    }

    public final void c() {
        yb5.d dVar;
        sb5.s0 s0Var;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter;
        com.tencent.mm.ui.tipsbar.c cVar = com.tencent.mm.ui.tipsbar.c.f209923e;
        com.tencent.mm.ui.tipsbar.d dVar2 = this.f209914p;
        dVar2.getClass();
        dVar2.f209925a = cVar;
        androidx.recyclerview.widget.f2 adapter = this.f209905d.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        int color = getContext().getResources().getColor(com.tencent.mm.R.color.a07);
        android.widget.RelativeLayout relativeLayout = this.f209906e;
        relativeLayout.setBackgroundColor(color);
        relativeLayout.setBackgroundResource(com.tencent.mm.R.drawable.afn);
        android.view.View view = this.f209907f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f209908g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f209909h;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f209910i;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f209910i;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view5.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
        yj0.a.f(view5, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toExpandMode", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.lang.ref.WeakReference weakReference = this.chattingContextRef;
        if (weakReference != null && (dVar = (yb5.d) weakReference.get()) != null && (s0Var = (sb5.s0) dVar.f460708c.a(sb5.s0.class)) != null && (chatFooter = ((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e) != null) {
            chatFooter.w0(true);
        }
        e();
        if (com.tencent.mm.storage.z3.T4(this.curTalkerName)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27193, 1, 4);
        }
    }

    public final void d() {
        com.tencent.mm.ui.tipsbar.c cVar = com.tencent.mm.ui.tipsbar.c.f209922d;
        com.tencent.mm.ui.tipsbar.d dVar = this.f209914p;
        dVar.getClass();
        dVar.f209925a = cVar;
        androidx.recyclerview.widget.f2 adapter = this.f209905d.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        this.f209906e.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.a07));
        android.view.View view = this.f209907f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f209908g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f209908g;
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        java.util.ArrayList arrayList3 = dVar.f209927c;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = arrayList3.size() > 1 ? i65.a.h(getContext(), com.tencent.mm.R.dimen.f479648bn) : 0;
            view3.setLayoutParams(marginLayoutParams);
        }
        android.view.View view4 = this.f209909h;
        int i17 = arrayList3.size() > 1 ? 0 : 8;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f209910i;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "toFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        e();
    }

    public final void e() {
        java.lang.String str;
        com.tencent.mm.ui.tipsbar.d dVar = this.f209914p;
        boolean a17 = dVar.a();
        java.util.ArrayList arrayList = dVar.f209927c;
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView = this.f209905d;
        if (a17) {
            maxHeightWxRecyclerView.setImportantForAccessibility(4);
            str = getContext().getString(com.tencent.mm.R.string.jzd, java.lang.Integer.valueOf(arrayList.size()));
        } else {
            if (dVar.f209925a == com.tencent.mm.ui.tipsbar.c.f209923e) {
                maxHeightWxRecyclerView.setImportantForAccessibility(1);
                getContext().getString(com.tencent.mm.R.string.jzc, java.lang.Integer.valueOf(arrayList.size()));
                str = null;
            } else {
                str = "";
            }
        }
        if (str == null || r26.n0.N(str)) {
            setContentDescription(null);
        } else {
            setContentDescription(str);
        }
        this.f209910i.setContentDescription(null);
    }

    public final java.lang.ref.WeakReference<yb5.d> getChattingContextRef() {
        return this.chattingContextRef;
    }

    public final java.lang.String getCurTalkerName() {
        return this.curTalkerName;
    }

    public final java.util.ArrayList<in5.c> getDataList() {
        return this.dataList;
    }

    public final android.view.View.OnClickListener getSelfClickListener() {
        return this.selfClickListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if ((r0.f209927c.size() > 1) != false) goto L14;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.tencent.mm.ui.tipsbar.d r0 = r5.f209914p
            com.tencent.mm.ui.tipsbar.c r1 = r0.f209925a
            com.tencent.mm.ui.tipsbar.c r2 = com.tencent.mm.ui.tipsbar.c.f209922d
            r3 = 1
            r4 = 0
            if (r1 != r2) goto Lc
            r1 = r3
            goto Ld
        Lc:
            r1 = r4
        Ld:
            if (r1 == 0) goto L1d
            java.util.ArrayList r0 = r0.f209927c
            int r0 = r0.size()
            if (r0 <= r3) goto L19
            r0 = r3
            goto L1a
        L19:
            r0 = r4
        L1a:
            if (r0 == 0) goto L1d
            goto L1e
        L1d:
            r3 = r4
        L1e:
            if (r6 == 0) goto L25
            int r6 = r6.getAction()
            goto L26
        L25:
            r6 = -1
        L26:
            android.view.MotionEvent.actionToString(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tipsbar.ChatTipsBarGroup.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final void setChattingContextRef(java.lang.ref.WeakReference<yb5.d> weakReference) {
        this.chattingContextRef = weakReference;
    }

    public final void setCurTalkerName(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.curTalkerName = str;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        int visibility = getVisibility();
        boolean z17 = visibility == 8 || visibility == 4;
        if (i17 != 0 || !z17) {
            super.setVisibility(i17);
            return;
        }
        setAlpha(0.0f);
        super.setVisibility(i17);
        post(new com.tencent.mm.ui.tipsbar.q(this));
    }
}
