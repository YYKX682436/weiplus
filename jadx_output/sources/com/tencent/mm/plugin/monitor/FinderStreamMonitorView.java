package com.tencent.mm.plugin.monitor;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0005\u0018\u0019\u001a\u001b\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/monitor/FinderStreamMonitorView;", "Landroid/widget/FrameLayout;", "", "getTranslateOffset", "Landroidx/recyclerview/widget/RecyclerView;", "d", "Ljz5/g;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/TextView;", "e", "getGlobalPreloadTv", "()Landroid/widget/TextView;", "globalPreloadTv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ni3/p", "ni3/q", "ni3/r", "ni3/t", "ni3/u", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderStreamMonitorView extends android.widget.FrameLayout {
    public static final /* synthetic */ int B = 0;
    public final ni3.j0 A;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g recyclerView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g globalPreloadTv;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f149457f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f149458g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer f149459h;

    /* renamed from: i, reason: collision with root package name */
    public cw2.f8 f149460i;

    /* renamed from: m, reason: collision with root package name */
    public long f149461m;

    /* renamed from: n, reason: collision with root package name */
    public int f149462n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f149463o;

    /* renamed from: p, reason: collision with root package name */
    public int f149464p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f149465q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f149466r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f149467s;

    /* renamed from: t, reason: collision with root package name */
    public final ni3.w f149468t;

    /* renamed from: u, reason: collision with root package name */
    public final ni3.b0 f149469u;

    /* renamed from: v, reason: collision with root package name */
    public final ni3.v f149470v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f149471w;

    /* renamed from: x, reason: collision with root package name */
    public long f149472x;

    /* renamed from: y, reason: collision with root package name */
    public int f149473y;

    /* renamed from: z, reason: collision with root package name */
    public int f149474z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderStreamMonitorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.recyclerView = jz5.h.b(new ni3.m0(this));
        this.globalPreloadTv = jz5.h.b(new ni3.c0(this));
        this.f149457f = com.tencent.mm.plugin.finder.storage.t70.f127590a.X2();
        this.f149458g = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127897qa).getValue()).r()).intValue() == 1;
        this.f149465q = new java.util.ArrayList();
        setId(com.tencent.mm.R.id.o39);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.cyh, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.o38);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dk6);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.dk8);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.che);
        findViewById4.getLayoutParams().width = com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().widthPixels;
        findViewById4.requestLayout();
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.chg);
        findViewById5.getLayoutParams().width = com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().widthPixels + ((int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479704cz));
        findViewById5.requestLayout();
        findViewById.getLayoutParams().width = com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().widthPixels + ((int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479704cz));
        findViewById.requestLayout();
        findViewById.requestLayout();
        findViewById2.setTag(java.lang.Boolean.FALSE);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/monitor/FinderStreamMonitorView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/monitor/FinderStreamMonitorView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        getRecyclerView().setLayoutFrozen(true);
        findViewById.post(new ni3.o(findViewById, this));
        ni3.a0 a0Var = new ni3.a0(findViewById2, findViewById3, findViewById, this);
        findViewById2.setOnClickListener(a0Var);
        findViewById3.setOnClickListener(a0Var);
        this.f149466r = new java.util.concurrent.ConcurrentHashMap();
        this.f149467s = new java.util.concurrent.ConcurrentHashMap();
        this.f149468t = new ni3.w(this);
        this.f149469u = new ni3.b0(this);
        this.f149470v = new ni3.v(this);
        this.f149471w = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        final com.tencent.mm.app.a0 a0Var2 = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TestPreloadPreviewNotifyEvent>(a0Var2) { // from class: com.tencent.mm.plugin.monitor.FinderStreamMonitorView$notifyListener$1
            {
                this.__eventId = 1434731824;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TestPreloadPreviewNotifyEvent testPreloadPreviewNotifyEvent) {
                com.tencent.mm.autogen.events.TestPreloadPreviewNotifyEvent event = testPreloadPreviewNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.uy uyVar = event.f54889g;
                long j17 = uyVar.f8145c;
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.this;
                finderStreamMonitorView.f149472x = j17;
                finderStreamMonitorView.f149473y = uyVar.f8144b;
                int i17 = uyVar.f8143a;
                finderStreamMonitorView.f149474z = i17;
                if (i17 == 1) {
                    long j18 = uyVar.f8146d;
                    if (j18 != 0) {
                        finderStreamMonitorView.f149465q.add(java.lang.Long.valueOf(j18));
                    }
                }
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
                return true;
            }
        };
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PreloadProcessChangeEvent>(a0Var2) { // from class: com.tencent.mm.plugin.monitor.FinderStreamMonitorView$listener$1
            {
                this.__eventId = -106021740;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.PreloadProcessChangeEvent preloadProcessChangeEvent) {
                com.tencent.mm.autogen.events.PreloadProcessChangeEvent event = preloadProcessChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.so soVar = event.f54625g;
                java.lang.String str = soVar.f7914a;
                if (str != null) {
                    com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.this;
                    ni3.q a17 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, str);
                    if (soVar.f7916c == 2) {
                        a17.f337692g = soVar.f7917d;
                    } else {
                        a17.f337687b = soVar.f7915b;
                        a17.f337689d = 1;
                        a17.f337690e = soVar.f7919f;
                        java.lang.String.valueOf(soVar.f7918e);
                        a17.getClass();
                        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = finderStreamMonitorView.f149459h;
                        if (dataBuffer == null) {
                            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                            throw null;
                        }
                        java.util.Iterator<T> it = dataBuffer.iterator();
                        while (it.hasNext() && !kotlin.jvm.internal.o.b(com.tencent.mm.plugin.monitor.FinderStreamMonitorView.c(finderStreamMonitorView, (so2.j5) it.next()).getString(9), soVar.f7914a)) {
                        }
                    }
                    com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
                }
                return true;
            }
        };
        this.A = new ni3.j0(this);
    }

    public static final ni3.q a(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView, java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = finderStreamMonitorView.f149466r;
        ni3.q qVar = (ni3.q) concurrentHashMap.get(str);
        if (qVar != null) {
            return qVar;
        }
        ni3.q qVar2 = new ni3.q();
        concurrentHashMap.put(str, qVar2);
        return qVar2;
    }

    public static final java.lang.String b(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView, so2.j5 j5Var) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.lang.String description;
        finderStreamMonitorView.getClass();
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            java.lang.String description2 = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getDescription();
            if (description2 != null) {
                java.lang.String substring = description2.substring(0, java.lang.Math.min(description2.length(), 3));
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                return substring;
            }
        } else if (j5Var instanceof com.tencent.mm.plugin.finder.feed.ys) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) kz5.n0.Z(((com.tencent.mm.plugin.finder.feed.ys) j5Var).f111194f);
            if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (description = feedObject.getDescription()) == null) {
                return "Card";
            }
            java.lang.String substring2 = description.substring(0, java.lang.Math.min(description.length(), 3));
            kotlin.jvm.internal.o.f(substring2, "substring(...)");
            return substring2;
        }
        return "";
    }

    public static final r45.mb4 c(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView, so2.j5 j5Var) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        finderStreamMonitorView.getClass();
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.Z(com.tencent.mm.plugin.finder.storage.FeedData.Companion.a((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getMediaList());
            return mb4Var2 == null ? new r45.mb4() : mb4Var2;
        }
        if (!(j5Var instanceof com.tencent.mm.plugin.finder.feed.ys)) {
            return new r45.mb4();
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) kz5.n0.Z(((com.tencent.mm.plugin.finder.feed.ys) j5Var).f111194f);
        return (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (mediaList = feedObject.getMediaList()) == null || (mb4Var = (r45.mb4) kz5.n0.Z(mediaList)) == null) ? new r45.mb4() : mb4Var;
    }

    public static final java.lang.String d(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView, java.lang.String str) {
        finderStreamMonitorView.getClass();
        java.lang.String t17 = r26.i0.t(str, "finder_video_", "", false);
        int length = t17.length();
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                i17 = -1;
                break;
            }
            if (t17.charAt(i17) == '_') {
                break;
            }
            i17++;
        }
        return i17 >= 0 ? t17.subSequence(i17 + 1, t17.length()).toString() : str;
    }

    public static final void f(com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView) {
        finderStreamMonitorView.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new ni3.f0(finderStreamMonitorView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getTranslateOffset() {
        return ((float) getRecyclerView().getWidth()) <= 0.0f ? com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().widthPixels : getRecyclerView().getWidth();
    }

    public final ni3.p g(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f149467s;
        ni3.p pVar = (ni3.p) concurrentHashMap.get(valueOf);
        if (pVar != null) {
            return pVar;
        }
        ni3.p pVar2 = new ni3.p(i17, 0L, 0L, 0);
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), pVar2);
        return pVar2;
    }

    public final android.widget.TextView getGlobalPreloadTv() {
        java.lang.Object value = this.globalPreloadTv.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        java.lang.Object value = this.recyclerView.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        cs2.j jVar;
        super.onDetachedFromWindow();
        if (this.f149463o) {
            cw2.f8 f8Var = this.f149460i;
            if (f8Var == null) {
                kotlin.jvm.internal.o.o("videoCore");
                throw null;
            }
            cs2.k kVar = f8Var.f223701i;
            if (kVar != null && (jVar = kVar.f222076d) != null) {
                jVar.G(this.f149470v);
            }
            ek4.s Di = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di();
            Di.getClass();
            ni3.b0 callback = this.f149469u;
            kotlin.jvm.internal.o.g(callback, "callback");
            Di.f253689e.remove(callback);
            com.tencent.mm.plugin.finder.feed.ew ewVar = com.tencent.mm.plugin.finder.feed.pz.M1;
            ni3.w callback2 = this.f149468t;
            kotlin.jvm.internal.o.g(callback2, "callback");
            com.tencent.mm.plugin.finder.feed.pz.O1.remove(callback2);
            this.f149463o = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderStreamMonitorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.recyclerView = jz5.h.b(new ni3.m0(this));
        this.globalPreloadTv = jz5.h.b(new ni3.c0(this));
        this.f149457f = com.tencent.mm.plugin.finder.storage.t70.f127590a.X2();
        this.f149458g = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127897qa).getValue()).r()).intValue() == 1;
        this.f149465q = new java.util.ArrayList();
        setId(com.tencent.mm.R.id.o39);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.cyh, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.o38);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dk6);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.dk8);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.che);
        findViewById4.getLayoutParams().width = com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().widthPixels;
        findViewById4.requestLayout();
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.chg);
        findViewById5.getLayoutParams().width = com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().widthPixels + ((int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479704cz));
        findViewById5.requestLayout();
        findViewById.getLayoutParams().width = com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().widthPixels + ((int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479704cz));
        findViewById.requestLayout();
        findViewById.requestLayout();
        findViewById2.setTag(java.lang.Boolean.FALSE);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/monitor/FinderStreamMonitorView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/monitor/FinderStreamMonitorView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        getRecyclerView().setLayoutFrozen(true);
        findViewById.post(new ni3.o(findViewById, this));
        ni3.a0 a0Var = new ni3.a0(findViewById2, findViewById3, findViewById, this);
        findViewById2.setOnClickListener(a0Var);
        findViewById3.setOnClickListener(a0Var);
        this.f149466r = new java.util.concurrent.ConcurrentHashMap();
        this.f149467s = new java.util.concurrent.ConcurrentHashMap();
        this.f149468t = new ni3.w(this);
        this.f149469u = new ni3.b0(this);
        this.f149470v = new ni3.v(this);
        this.f149471w = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        final com.tencent.mm.app.a0 a0Var2 = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TestPreloadPreviewNotifyEvent>(a0Var2) { // from class: com.tencent.mm.plugin.monitor.FinderStreamMonitorView$notifyListener$1
            {
                this.__eventId = 1434731824;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TestPreloadPreviewNotifyEvent testPreloadPreviewNotifyEvent) {
                com.tencent.mm.autogen.events.TestPreloadPreviewNotifyEvent event = testPreloadPreviewNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.uy uyVar = event.f54889g;
                long j17 = uyVar.f8145c;
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.this;
                finderStreamMonitorView.f149472x = j17;
                finderStreamMonitorView.f149473y = uyVar.f8144b;
                int i172 = uyVar.f8143a;
                finderStreamMonitorView.f149474z = i172;
                if (i172 == 1) {
                    long j18 = uyVar.f8146d;
                    if (j18 != 0) {
                        finderStreamMonitorView.f149465q.add(java.lang.Long.valueOf(j18));
                    }
                }
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
                return true;
            }
        };
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PreloadProcessChangeEvent>(a0Var2) { // from class: com.tencent.mm.plugin.monitor.FinderStreamMonitorView$listener$1
            {
                this.__eventId = -106021740;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.PreloadProcessChangeEvent preloadProcessChangeEvent) {
                com.tencent.mm.autogen.events.PreloadProcessChangeEvent event = preloadProcessChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.so soVar = event.f54625g;
                java.lang.String str = soVar.f7914a;
                if (str != null) {
                    com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.this;
                    ni3.q a17 = com.tencent.mm.plugin.monitor.FinderStreamMonitorView.a(finderStreamMonitorView, str);
                    if (soVar.f7916c == 2) {
                        a17.f337692g = soVar.f7917d;
                    } else {
                        a17.f337687b = soVar.f7915b;
                        a17.f337689d = 1;
                        a17.f337690e = soVar.f7919f;
                        java.lang.String.valueOf(soVar.f7918e);
                        a17.getClass();
                        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = finderStreamMonitorView.f149459h;
                        if (dataBuffer == null) {
                            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                            throw null;
                        }
                        java.util.Iterator<T> it = dataBuffer.iterator();
                        while (it.hasNext() && !kotlin.jvm.internal.o.b(com.tencent.mm.plugin.monitor.FinderStreamMonitorView.c(finderStreamMonitorView, (so2.j5) it.next()).getString(9), soVar.f7914a)) {
                        }
                    }
                    com.tencent.mm.plugin.monitor.FinderStreamMonitorView.f(finderStreamMonitorView);
                }
                return true;
            }
        };
        this.A = new ni3.j0(this);
    }
}
