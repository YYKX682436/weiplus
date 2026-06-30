package com.tencent.mm.plugin.story.ui.view;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020\f¢\u0006\u0004\b#\u0010$B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b#\u0010%R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryCommentView;", "Landroid/widget/RelativeLayout;", "", "", "r", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "setSessionId", "(Ljava/lang/String;)V", com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "Lkotlin/Function1;", "", "Ljz5/f0;", "J", "Lyz5/l;", "getStateChangeCallback", "()Lyz5/l;", "setStateChangeCallback", "(Lyz5/l;)V", "stateChangeCallback", "Lkotlin/Function0;", "", "K", "Lyz5/a;", "getOutsideClickListener", "()Lyz5/a;", "setOutsideClickListener", "(Lyz5/a;)V", "outsideClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StoryCommentView extends android.widget.RelativeLayout {
    public static final int[] N = {-372399, -352965, -15616, -7220480, -16268960, -15683841, -15432210, -10197008};
    public java.lang.CharSequence A;
    public final java.util.LinkedHashMap B;
    public java.lang.String C;
    public int D;
    public int E;
    public final java.util.LinkedHashMap F;
    public final java.lang.Runnable G;
    public final rf4.h2 H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public yz5.l stateChangeCallback;

    /* renamed from: K, reason: from kotlin metadata */
    public yz5.a outsideClickListener;
    public final yz5.p L;
    public final yz5.p M;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.ui.view.CommentsContainer f171955d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f171956e;

    /* renamed from: f, reason: collision with root package name */
    public final pf4.q f171957f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f171958g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f171959h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f171960i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f171961m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f171962n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f171963o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f171964p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f171965q;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public java.lang.String sessionId;

    /* renamed from: s, reason: collision with root package name */
    public if4.a f171967s;

    /* renamed from: t, reason: collision with root package name */
    public long f171968t;

    /* renamed from: u, reason: collision with root package name */
    public int f171969u;

    /* renamed from: v, reason: collision with root package name */
    public int f171970v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f171971w;

    /* renamed from: x, reason: collision with root package name */
    public rf4.a f171972x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f171973y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f171974z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryCommentView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f171965q = "";
        this.f171967s = new if4.a();
        this.f171969u = 2;
        this.f171970v = 2;
        this.B = new java.util.LinkedHashMap();
        this.C = "";
        this.E = -1;
        this.F = new java.util.LinkedHashMap();
        android.view.View.inflate(context, com.tencent.mm.R.layout.cwc, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487123nl1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.story.ui.view.CommentsContainer commentsContainer = (com.tencent.mm.plugin.story.ui.view.CommentsContainer) findViewById;
        this.f171955d = commentsContainer;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.nld);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        this.f171956e = recyclerView;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.nl9);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f171958g = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.nkp);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f171959h = textView;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.nle);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f171960i = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.nlg);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.plugin.story.ui.view.StoryCommentBubbleView storyCommentBubbleView = (com.tencent.mm.plugin.story.ui.view.StoryCommentBubbleView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.nla);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        com.tencent.mm.plugin.story.ui.view.StoryCommentBubbleView storyCommentBubbleView2 = (com.tencent.mm.plugin.story.ui.view.StoryCommentBubbleView) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.nlb);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        com.tencent.mm.plugin.story.ui.view.StoryCommentBubbleView storyCommentBubbleView3 = (com.tencent.mm.plugin.story.ui.view.StoryCommentBubbleView) findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.nlf);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f171961m = findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.nl_);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f171962n = findViewById10;
        pm0.v.c(textView);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        commentsContainer.setItemClickListener(new rf4.n0(this));
        storyCommentBubbleView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_chats, -1));
        storyCommentBubbleView3.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_chats, -1));
        pf4.q qVar = new pf4.q();
        this.f171957f = qVar;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        recyclerView.setAdapter(qVar);
        recyclerView.setVisibility(8);
        recyclerView.setFocusable(false);
        qVar.f353887g = new rf4.o0(this);
        qVar.f353886f = new rf4.q0(this, context);
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.bnj));
        arrayList2.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        int b17 = i65.a.b(context, 48);
        kotlin.jvm.internal.o.f(android.graphics.Bitmap.createScaledBitmap(decodeResource, b17, b17, true), "createScaledBitmap(...)");
        this.G = new rf4.s0(this);
        storyCommentBubbleView.setOnClickListener(new rf4.t0(this));
        storyCommentBubbleView2.setOnClickListener(new rf4.u0(this));
        storyCommentBubbleView3.setOnClickListener(new rf4.j0(this));
        rf4.h2 h2Var = new rf4.h2(this);
        this.H = h2Var;
        h2Var.f395061b = new rf4.k0(this);
        setOnClickListener(new rf4.l0(this));
        setOnLongClickListener(new rf4.m0(this));
        int c17 = com.tencent.mm.ui.bl.c(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCommentView", "LogStory: navigationHeight " + c17);
        findViewById(com.tencent.mm.R.id.nkl).setPadding(0, 0, 0, c17);
        this.L = new rf4.v0(this);
        this.M = new rf4.x0(this, context);
    }

    public static final void a(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView, gf4.a aVar) {
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView;
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView2;
        storyCommentView.getClass();
        gf4.l.f271354d.e(aVar.f271333d, aVar.f271334e, storyCommentView.sessionId, aVar.f271331b);
        java.util.Iterator it = storyCommentView.f171967s.f291239g.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            gf4.a aVar2 = (gf4.a) it.next();
            int i18 = aVar2.f271334e;
            if (i18 == 0 ? com.tencent.mm.sdk.platformtools.t8.D0(aVar2.f271331b, aVar.f271331b) : i18 == aVar.f271334e) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 != -1) {
            storyCommentView.f171967s.f291239g.remove(i17);
            com.tencent.mm.plugin.story.ui.view.CommentsContainer.d(storyCommentView.f171955d, storyCommentView.f171967s.f291239g, false, 2, null);
            java.util.LinkedList linkedList = storyCommentView.f171967s.f291239g;
            pf4.q qVar = storyCommentView.f171957f;
            qVar.x(linkedList);
            rf4.a aVar3 = storyCommentView.f171972x;
            if (aVar3 != null && (storyCommentInputView2 = aVar3.f395015f) != null) {
                java.util.LinkedList storyComments = storyCommentView.f171967s.f291239g;
                kotlin.jvm.internal.o.g(storyComments, "storyComments");
                storyCommentInputView2.f171943p.x(storyComments);
            }
            rf4.a aVar4 = storyCommentView.f171972x;
            if (aVar4 != null && (storyCommentInputView = aVar4.f395015f) != null) {
                storyCommentInputView.f171943p.notifyDataSetChanged();
            }
            qVar.notifyItemRemoved(i17);
        }
    }

    public static final void b(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView, boolean z17) {
        if (storyCommentView.f171964p || !storyCommentView.f171963o || storyCommentView.f171971w) {
            if (z17) {
                mf4.d.f326160a.a(6);
                return;
            }
            return;
        }
        storyCommentView.f171971w = true;
        gf4.l lVar = gf4.l.f271354d;
        long j17 = storyCommentView.f171968t;
        java.lang.String toUsername = storyCommentView.C;
        boolean z18 = !z17;
        java.lang.String str = storyCommentView.sessionId;
        java.lang.String storyOwner = storyCommentView.f171965q;
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        kotlin.jvm.internal.o.g(storyOwner, "storyOwner");
        com.tencent.mars.xlog.Log.i(gf4.l.f271358h, "postBubble: " + j17 + "  " + toUsername + ", " + z18);
        gf4.a i17 = gf4.l.i(lVar, j17, toUsername, "", false, z18, str, storyOwner, 0, 0, 384, null);
        i17.f271337h = true;
        storyCommentView.f171967s.f291239g.add(i17);
        java.util.LinkedList linkedList = storyCommentView.f171967s.f291239g;
        com.tencent.mm.plugin.story.ui.view.CommentsContainer commentsContainer = storyCommentView.f171955d;
        com.tencent.mm.plugin.story.ui.view.CommentsContainer.d(commentsContainer, linkedList, false, 2, null);
        commentsContainer.b();
        if (z17) {
            mf4.d.f326160a.a(5);
        } else {
            mf4.d.f326160a.a(7);
        }
    }

    public static final void c(com.tencent.mm.plugin.story.ui.view.StoryCommentView storyCommentView) {
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView;
        java.util.LinkedHashMap linkedHashMap = storyCommentView.B;
        java.lang.String str = storyCommentView.C;
        rf4.a aVar = storyCommentView.f171972x;
        linkedHashMap.put(str, (aVar == null || (storyCommentInputView = aVar.f395015f) == null) ? null : storyCommentInputView.getContent());
        if (linkedHashMap.size() > 3) {
            java.util.Set keySet = linkedHashMap.keySet();
            kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
            java.lang.String str2 = (java.lang.String) kz5.n0.Y(keySet);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.remove(str2);
        }
    }

    public void d() {
        this.f171955d.a();
        android.view.View view = this.f171960i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void e() {
        android.view.View view = this.f171960i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = this.f171970v;
        if (i17 != 2) {
            if (i17 == 3) {
                f(3);
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f171956e.getLayoutManager();
                if (layoutManager != null) {
                    int size = this.f171967s.f291239g.size() - 1;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Integer.valueOf(size));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(layoutManager, arrayList2.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "show", "()V", "Undefined", "scrollToPosition", "(I)V");
                    layoutManager.scrollToPosition(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(layoutManager, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "show", "()V", "Undefined", "scrollToPosition", "(I)V");
                    return;
                }
                return;
            }
            return;
        }
        if (this.f171960i.getVisibility() == 0 && this.f171969u == 2) {
            com.tencent.mm.plugin.story.ui.view.CommentsContainer commentsContainer = this.f171955d;
            if (commentsContainer.isPause) {
                this.f171967s.f291236d = false;
                commentsContainer.c();
                if (this.f171964p || !this.f171963o) {
                    return;
                }
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_STORY_BUBBLE_COUNT_INT;
                int r17 = c17.r(u3Var, 0);
                if (r17 < 3) {
                    gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
                    android.widget.TextView textView = this.f171959h;
                    textView.animate().cancel();
                    textView.setVisibility(0);
                    textView.animate().alpha(1.0f).start();
                    java.lang.Runnable runnable = this.G;
                    com.tencent.mm.sdk.platformtools.u3.l(runnable);
                    com.tencent.mm.sdk.platformtools.u3.i(runnable, 3000L);
                }
            }
        }
    }

    public void f(int i17) {
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView;
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView2;
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView3;
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView4;
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView5;
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView6;
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView7;
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView8;
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView9;
        com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView10;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchState ");
        sb6.append(i17);
        sb6.append(' ');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCommentView", sb6.toString());
        if (this.f171969u == i17) {
            return;
        }
        this.f171969u = i17;
        this.f171970v = i17;
        yz5.p pVar = this.M;
        yz5.p pVar2 = this.L;
        pf4.q qVar = this.f171957f;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f171956e;
        com.tencent.mm.plugin.story.ui.view.CommentsContainer commentsContainer = this.f171955d;
        if (i17 != 1) {
            android.view.View view = this.f171958g;
            if (i17 == 2) {
                this.C = this.f171965q;
                this.D = 0;
                if (this.f171964p) {
                    android.view.View view2 = this.f171961m;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = this.f171962n;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View view4 = this.f171961m;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view5 = this.f171962n;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                view.animate().cancel();
                view.animate().alpha(0.0f).start();
                recyclerView.animate().alpha(0.0f).withEndAction(new rf4.d1(this)).start();
                commentsContainer.animate().cancel();
                commentsContainer.setVisibility(0);
                commentsContainer.setAlpha(1.0f);
                if (this.I) {
                    commentsContainer.c();
                }
                rf4.a aVar = this.f171972x;
                if (aVar != null) {
                    aVar.dismiss();
                }
            } else if (i17 == 3) {
                this.C = this.f171965q;
                this.D = 0;
                view.animate().cancel();
                android.view.View view6 = this.f171958g;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.animate().alpha(1.0f).start();
                commentsContainer.animate().alpha(0.0f).withEndAction(new rf4.e1(this)).start();
                recyclerView.animate().cancel();
                recyclerView.setVisibility(0);
                recyclerView.setAlpha(1.0f);
                qVar.x(this.f171967s.f291239g);
                qVar.notifyDataSetChanged();
                recyclerView.setAdapter(qVar);
                androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f171956e;
                int size = this.f171967s.f291239g.size() - 1;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(java.lang.Integer.valueOf(size));
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(recyclerView2, arrayList6.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView2.a1(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(recyclerView2, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.post(new rf4.f1(this));
            } else if (i17 == 5) {
                commentsContainer.a();
                commentsContainer.setVisibility(8);
                recyclerView.animate().alpha(0.0f).withEndAction(new rf4.b1(this)).start();
                this.f171974z = true;
                android.content.Context context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                rf4.a aVar2 = new rf4.a(context);
                this.f171972x = aVar2;
                com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView11 = aVar2.f395015f;
                if (storyCommentInputView11 != null) {
                    storyCommentInputView11.setHostStory(qVar.f353885e);
                }
                rf4.a aVar3 = this.f171972x;
                com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView12 = aVar3 != null ? aVar3.f395015f : null;
                if (storyCommentInputView12 != null) {
                    storyCommentInputView12.setCommentInputCallback(pVar2);
                }
                rf4.a aVar4 = this.f171972x;
                com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView13 = aVar4 != null ? aVar4.f395015f : null;
                if (storyCommentInputView13 != null) {
                    storyCommentInputView13.setCommentReplyCallback(pVar);
                }
                rf4.a aVar5 = this.f171972x;
                if (aVar5 != null && (storyCommentInputView10 = aVar5.f395015f) != null) {
                    storyCommentInputView10.c((java.lang.CharSequence) this.B.get(this.C), this.C, true);
                }
                rf4.a aVar6 = this.f171972x;
                if (aVar6 != null && (storyCommentInputView9 = aVar6.f395015f) != null) {
                    storyCommentInputView9.f171942o.setVisibility(0);
                }
                rf4.a aVar7 = this.f171972x;
                if (aVar7 != null && (storyCommentInputView8 = aVar7.f395015f) != null) {
                    java.util.LinkedList storyComments = this.f171967s.f291239g;
                    kotlin.jvm.internal.o.g(storyComments, "storyComments");
                    storyCommentInputView8.f171943p.x(storyComments);
                }
                rf4.a aVar8 = this.f171972x;
                if (aVar8 != null && (storyCommentInputView7 = aVar8.f395015f) != null) {
                    storyCommentInputView7.f171943p.notifyDataSetChanged();
                }
                rf4.a aVar9 = this.f171972x;
                if (aVar9 != null && (storyCommentInputView6 = aVar9.f395015f) != null) {
                    int i18 = this.E;
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList7.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(storyCommentInputView6, arrayList7.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                    storyCommentInputView6.f171942o.post(new rf4.h0(storyCommentInputView6, ((java.lang.Integer) arrayList7.get(0)).intValue()));
                    yj0.a.f(storyCommentInputView6, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                }
                rf4.a aVar10 = this.f171972x;
                if (aVar10 != null) {
                    aVar10.show();
                }
                this.f171973y = false;
                rf4.a aVar11 = this.f171972x;
                if (aVar11 != null) {
                    aVar11.setOnDismissListener(new rf4.c1(this));
                }
            }
        } else {
            this.C = this.f171965q;
            this.D = 0;
            commentsContainer.a();
            recyclerView.setVisibility(8);
            commentsContainer.setVisibility(8);
            this.f171974z = false;
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            rf4.a aVar12 = new rf4.a(context2);
            this.f171972x = aVar12;
            com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView14 = aVar12.f395015f;
            if (storyCommentInputView14 != null) {
                storyCommentInputView14.setHostStory(qVar.f353885e);
            }
            rf4.a aVar13 = this.f171972x;
            com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView15 = aVar13 != null ? aVar13.f395015f : null;
            if (storyCommentInputView15 != null) {
                storyCommentInputView15.setCommentInputCallback(pVar2);
            }
            rf4.a aVar14 = this.f171972x;
            com.tencent.mm.plugin.story.ui.view.StoryCommentInputView storyCommentInputView16 = aVar14 != null ? aVar14.f395015f : null;
            if (storyCommentInputView16 != null) {
                storyCommentInputView16.setCommentReplyCallback(pVar);
            }
            rf4.a aVar15 = this.f171972x;
            if (aVar15 != null && (storyCommentInputView5 = aVar15.f395015f) != null) {
                storyCommentInputView5.c(this.A, "", false);
            }
            rf4.a aVar16 = this.f171972x;
            if (aVar16 != null && (storyCommentInputView4 = aVar16.f395015f) != null) {
                storyCommentInputView4.f171942o.setVisibility(0);
            }
            rf4.a aVar17 = this.f171972x;
            if (aVar17 != null && (storyCommentInputView3 = aVar17.f395015f) != null) {
                java.util.LinkedList storyComments2 = this.f171967s.f291239g;
                kotlin.jvm.internal.o.g(storyComments2, "storyComments");
                storyCommentInputView3.f171943p.x(storyComments2);
            }
            rf4.a aVar18 = this.f171972x;
            if (aVar18 != null && (storyCommentInputView2 = aVar18.f395015f) != null) {
                storyCommentInputView2.f171943p.notifyDataSetChanged();
            }
            rf4.a aVar19 = this.f171972x;
            if (aVar19 != null && (storyCommentInputView = aVar19.f395015f) != null) {
                int size2 = this.f171967s.f291239g.size() - 1;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList8.add(java.lang.Integer.valueOf(size2));
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(storyCommentInputView, arrayList8.toArray(), "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                storyCommentInputView.f171942o.post(new rf4.h0(storyCommentInputView, ((java.lang.Integer) arrayList8.get(0)).intValue()));
                yj0.a.f(storyCommentInputView, "com/tencent/mm/plugin/story/ui/view/StoryCommentView", "switchState", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            }
            rf4.a aVar20 = this.f171972x;
            if (aVar20 != null) {
                aVar20.show();
            }
            this.f171973y = false;
            rf4.a aVar21 = this.f171972x;
            if (aVar21 != null) {
                aVar21.setOnDismissListener(new rf4.a1(this));
            }
        }
        yz5.l lVar = this.stateChangeCallback;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(this.f171969u));
        }
    }

    public final yz5.a getOutsideClickListener() {
        return this.outsideClickListener;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final yz5.l getStateChangeCallback() {
        return this.stateChangeCallback;
    }

    public final void setOutsideClickListener(yz5.a aVar) {
        this.outsideClickListener = aVar;
    }

    public final void setSessionId(java.lang.String str) {
        this.sessionId = str;
    }

    public final void setStateChangeCallback(yz5.l lVar) {
        this.stateChangeCallback = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoryCommentView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
