package com.tencent.mm.plugin.vlog.ui.thumb;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0015B!\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)B\u001b\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b(\u0010*J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006+"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView;", "Landroid/widget/FrameLayout;", "", "", "enable", "Ljz5/f0;", "setEnableLengthEdit", "Lrm5/v;", "composition", "setTrack", "Lcom/tencent/mm/plugin/vlog/model/h1;", "", "timeMs", "setProgress", "Ljava/util/LinkedList;", "Lkp4/c1;", "D", "Ljava/util/LinkedList;", "getTrackList", "()Ljava/util/LinkedList;", "trackList", "Lkp4/c0;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkp4/c0;", "getCallback", "()Lkp4/c0;", "setCallback", "(Lkp4/c0;)V", "callback", "getSourceDuration", "()J", "sourceDuration", "getCutDuration", "cutDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MultiTrackCropView extends android.widget.FrameLayout implements xn5.a0 {
    public final kp4.c1 A;
    public final kp4.c1 B;
    public java.lang.Runnable C;

    /* renamed from: D, reason: from kotlin metadata */
    public final java.util.LinkedList trackList;

    /* renamed from: E, reason: from kotlin metadata */
    public kp4.c0 callback;
    public final long F;
    public final java.lang.Runnable G;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView f176023d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f176024e;

    /* renamed from: f, reason: collision with root package name */
    public final kp4.h f176025f;

    /* renamed from: g, reason: collision with root package name */
    public final int f176026g;

    /* renamed from: h, reason: collision with root package name */
    public final int f176027h;

    /* renamed from: i, reason: collision with root package name */
    public int f176028i;

    /* renamed from: m, reason: collision with root package name */
    public int f176029m;

    /* renamed from: n, reason: collision with root package name */
    public long f176030n;

    /* renamed from: o, reason: collision with root package name */
    public long f176031o;

    /* renamed from: p, reason: collision with root package name */
    public int f176032p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.MotionEvent f176033q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f176034r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f176035s;

    /* renamed from: t, reason: collision with root package name */
    public long f176036t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f176037u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f176038v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f176039w;

    /* renamed from: x, reason: collision with root package name */
    public final int f176040x;

    /* renamed from: y, reason: collision with root package name */
    public final int f176041y;

    /* renamed from: z, reason: collision with root package name */
    public final int f176042z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTrackCropView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f176025f = new kp4.h();
        this.f176026g = 112;
        this.f176027h = 63;
        this.f176028i = 1;
        this.f176037u = true;
        this.f176040x = i65.a.B(context);
        this.f176041y = i65.a.b(context, 40);
        this.f176042z = i65.a.b(context, 64);
        kp4.b1 b1Var = kp4.c1.f311095o;
        this.A = b1Var.a(0);
        this.B = b1Var.a(0);
        this.trackList = new java.util.LinkedList();
        this.F = 16L;
        this.G = new kp4.g0(this);
    }

    public static final void a(com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView) {
        int i17 = multiTrackCropView.f176029m;
        java.util.LinkedList linkedList = multiTrackCropView.trackList;
        int i18 = 0;
        for (java.lang.Object obj : linkedList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            kp4.c1 c1Var = (kp4.c1) obj;
            if (i18 != 0 && i18 != kz5.c0.h(linkedList) && multiTrackCropView.f176032p < (i17 = i17 + c1Var.f311081k)) {
                multiTrackCropView.post(new kp4.m0(multiTrackCropView, i18, c1Var));
                return;
            }
            i18 = i19;
        }
    }

    public final void b(com.tencent.mm.plugin.vlog.model.h1 h1Var, long j17) {
        if (this.f176034r) {
            this.f176034r = false;
            this.f176035s = true;
            this.f176036t = j17;
            this.f176037u = true;
            int i17 = this.f176029m;
            long j18 = this.f176030n;
            int i18 = i17 + ((int) ((((float) ((j17 - j18) * this.f176028i)) * 1.0f) / ((float) (this.f176031o - j18))));
            com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView = this.f176023d;
            if (multiTrackRecyclerView != null) {
                multiTrackRecyclerView.b1(i18 - this.f176032p, 0, null);
            } else {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
        }
    }

    public final void c(boolean z17) {
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView = this.f176023d;
        if (multiTrackRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        int height = multiTrackRecyclerView.getHeight();
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView2 = this.f176023d;
        if (multiTrackRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        int paddingTop = height - multiTrackRecyclerView2.getPaddingTop();
        if (this.f176023d == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        float paddingBottom = ((paddingTop - r3.getPaddingBottom()) * 1.0f) / this.f176026g;
        this.f176028i = 0;
        long j17 = 0;
        for (kp4.c1 c1Var : this.trackList) {
            if (z17) {
                c1Var.f311076f = (((float) c1Var.d()) / c1Var.f311097n.f175627l.f397506h) / 1000;
                c1Var.g();
            }
            c1Var.f311080j = j17;
            int d17 = (int) ((((c1Var.f311076f * c1Var.f311071a) * paddingBottom) * ((float) (c1Var.f311075e - c1Var.f311074d))) / ((float) c1Var.d()));
            c1Var.f311081k = d17;
            this.f176028i += d17;
            j17 += ((float) (c1Var.f311075e - c1Var.f311074d)) / c1Var.f311097n.f175627l.f397506h;
        }
        this.f176030n = 0L;
        this.f176031o = j17;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            motionEvent.getAction();
        }
        if (motionEvent != null) {
            motionEvent.getRawX();
        }
        if (motionEvent != null) {
            motionEvent.getRawY();
        }
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f176038v = false;
            this.f176037u = false;
            kp4.c0 c0Var = this.callback;
            if (c0Var != null) {
                c0Var.pause();
            }
            com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView = this.f176023d;
            if (multiTrackRecyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            multiTrackRecyclerView.f1();
        } else {
            if ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 1)) {
                com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView2 = this.f176023d;
                if (multiTrackRecyclerView2 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                if (multiTrackRecyclerView2.getScrollState() == 0) {
                    this.f176038v = false;
                    this.f176037u = true;
                } else {
                    this.f176038v = true;
                }
            } else if (valueOf != null && valueOf.intValue() == 2) {
                this.f176033q = android.view.MotionEvent.obtain(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final kp4.c0 getCallback() {
        return this.callback;
    }

    public final long getCutDuration() {
        long j17 = 0;
        for (kp4.c1 c1Var : this.trackList) {
            j17 += c1Var.f311075e - c1Var.f311074d;
        }
        return j17;
    }

    public final long getSourceDuration() {
        java.util.Iterator it = this.trackList.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += ((kp4.c1) it.next()).d();
        }
        return j17;
    }

    public final java.util.LinkedList<kp4.c1> getTrackList() {
        return this.trackList;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487389oi2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f176023d = (com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView) findViewById;
        final android.content.Context context = getContext();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context) { // from class: com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView$onFinishInflate$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
                com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView = com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView.this;
                int i18 = multiTrackCropView.f176032p;
                int i19 = i18 + i17;
                if (multiTrackCropView.f176039w) {
                    return super.scrollHorizontallyBy(i17, z2Var, h3Var);
                }
                int i27 = multiTrackCropView.f176029m;
                int i28 = multiTrackCropView.f176028i + i27;
                if (i19 < i27) {
                    i17 = i27 - i18;
                } else if (i19 > i28) {
                    i17 = i28 - i18;
                }
                return super.scrollHorizontallyBy(i17, z2Var, h3Var);
            }
        };
        this.f176024e = linearLayoutManager;
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView = this.f176023d;
        if (multiTrackRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        multiTrackRecyclerView.setLayoutManager(linearLayoutManager);
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView2 = this.f176023d;
        if (multiTrackRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        kp4.h hVar = this.f176025f;
        multiTrackRecyclerView2.setAdapter(hVar);
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView3 = this.f176023d;
        if (multiTrackRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        multiTrackRecyclerView3.setItemAnimator(null);
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView4 = this.f176023d;
        if (multiTrackRecyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        multiTrackRecyclerView4.N(new kp4.i());
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView5 = this.f176023d;
        if (multiTrackRecyclerView5 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        multiTrackRecyclerView5.i(new kp4.d0(this));
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView6 = this.f176023d;
        if (multiTrackRecyclerView6 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        multiTrackRecyclerView6.P(new kp4.e0());
        hVar.f311112g = new kp4.f0(this);
    }

    public final void setCallback(kp4.c0 c0Var) {
        this.callback = c0Var;
    }

    public final void setEnableLengthEdit(boolean z17) {
    }

    public final void setProgress(long j17) {
        pm0.v.X(new kp4.h0(j17, this));
    }

    public final void setTrack(rm5.v composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        java.util.LinkedList linkedList = this.trackList;
        linkedList.clear();
        composition.j();
        com.tencent.tav.coremedia.CMTimeRange h17 = composition.h();
        long j17 = 1000;
        this.f176030n = h17.getStartUs() / j17;
        this.f176031o = h17.getEndUs() / j17;
        java.util.ArrayList arrayList = composition.f397584l;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            kp4.c1 c1Var = new kp4.c1((rm5.j) next, false, false);
            c1Var.f311079i = i17;
            c1Var.f311072b = this.f176026g;
            c1Var.f311071a = this.f176027h;
            arrayList2.add(c1Var);
            i17 = i18;
        }
        linkedList.addAll(arrayList2);
        this.f176034r = true;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f176024e;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(0);
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(linearLayoutManager, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView", "setTrack", "(Lcom/tencent/mm/videocomposition/VideoComposition;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView", "setTrack", "(Lcom/tencent/mm/videocomposition/VideoComposition;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            this.f176032p = 0;
            kp4.j0 j0Var = new kp4.j0(this);
            this.C = j0Var;
            j0Var.run();
            return;
        }
        kotlin.jvm.internal.o.o("layoutManager");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiTrackCropView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void setTrack(com.tencent.mm.plugin.vlog.model.h1 composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        java.util.LinkedList linkedList = this.trackList;
        linkedList.clear();
        composition.k();
        com.tencent.tav.coremedia.CMTimeRange i17 = composition.i();
        long j17 = 1000;
        this.f176030n = i17.getStartUs() / j17;
        this.f176031o = i17.getEndUs() / j17;
        java.util.List m17 = composition.m();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        java.util.Iterator it = ((java.util.ArrayList) m17).iterator();
        int i18 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            kp4.c1 c1Var = new kp4.c1((com.tencent.mm.plugin.vlog.model.i1) next);
            c1Var.f311079i = i18;
            c1Var.f311072b = this.f176026g;
            c1Var.f311071a = this.f176027h;
            arrayList.add(c1Var);
            i18 = i19;
        }
        linkedList.addAll(arrayList);
        this.f176034r = true;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f176024e;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(linearLayoutManager, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView", "setTrack", "(Lcom/tencent/mm/plugin/vlog/model/VLogComposition;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/vlog/ui/thumb/MultiTrackCropView", "setTrack", "(Lcom/tencent/mm/plugin/vlog/model/VLogComposition;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            this.f176032p = 0;
            kp4.l0 l0Var = new kp4.l0(this);
            this.C = l0Var;
            l0Var.run();
            return;
        }
        kotlin.jvm.internal.o.o("layoutManager");
        throw null;
    }
}
