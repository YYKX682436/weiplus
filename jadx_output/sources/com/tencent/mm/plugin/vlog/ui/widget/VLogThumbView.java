package com.tencent.mm.plugin.vlog.ui.widget;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002 \u0010B\u001d\b\u0007\u0012\u0006\u00108\u001a\u000207\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u00106\u001a\u0004\u0018\u0001012\b\u0010)\u001a\u0004\u0018\u0001018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u0006="}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/VLogThumbView;", "Landroid/widget/FrameLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "d", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "w", "I", "getScrollCount", "()I", "setScrollCount", "(I)V", "scrollCount", "Lcq4/u;", "x", "Lcq4/u;", "getSortCallback", "()Lcq4/u;", "setSortCallback", "(Lcq4/u;)V", "sortCallback", "Lbp4/c0;", "z", "Lbp4/c0;", "getAudioSeekable", "()Lbp4/c0;", "setAudioSeekable", "(Lbp4/c0;)V", "audioSeekable", "Lcq4/t;", "L", "Lcq4/t;", "getOnSelectCallback", "()Lcq4/t;", "setOnSelectCallback", "(Lcq4/t;)V", "onSelectCallback", "", "value", "M", "J", "getProgress", "()J", "setProgress", "(J)V", "progress", "Lkp4/s0;", "getThumbFetcherFactory", "()Lkp4/s0;", "setThumbFetcherFactory", "(Lkp4/s0;)V", "thumbFetcherFactory", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class VLogThumbView extends android.widget.FrameLayout {
    public boolean A;
    public boolean B;
    public final java.util.LinkedList C;
    public boolean D;
    public long E;
    public long F;
    public long G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final int f176132J;
    public final int K;

    /* renamed from: L, reason: from kotlin metadata */
    public cq4.t onSelectCallback;

    /* renamed from: M, reason: from kotlin metadata */
    public long progress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final androidx.recyclerview.widget.RecyclerView recyclerView;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f176134e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f176135f;

    /* renamed from: g, reason: collision with root package name */
    public final kp4.r f176136g;

    /* renamed from: h, reason: collision with root package name */
    public int f176137h;

    /* renamed from: i, reason: collision with root package name */
    public long f176138i;

    /* renamed from: m, reason: collision with root package name */
    public long f176139m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f176140n;

    /* renamed from: o, reason: collision with root package name */
    public int f176141o;

    /* renamed from: p, reason: collision with root package name */
    public int f176142p;

    /* renamed from: q, reason: collision with root package name */
    public float f176143q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Runnable f176144r;

    /* renamed from: s, reason: collision with root package name */
    public final kp4.c1 f176145s;

    /* renamed from: t, reason: collision with root package name */
    public final kp4.c1 f176146t;

    /* renamed from: u, reason: collision with root package name */
    public float f176147u;

    /* renamed from: v, reason: collision with root package name */
    public float f176148v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public int scrollCount;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public cq4.u sortCallback;

    /* renamed from: y, reason: collision with root package name */
    public bp4.c0 f176151y;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public bp4.c0 audioSeekable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VLogThumbView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f176137h = 1;
        this.f176140n = true;
        this.f176143q = 1.0f;
        kp4.b1 b1Var = kp4.c1.f311095o;
        this.f176145s = b1Var.a(0);
        this.f176146t = b1Var.a(0);
        android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.C = new java.util.LinkedList();
        this.H = -1;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context) { // from class: com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
                com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView = this;
                int i18 = vLogThumbView.f176142p + i17;
                if (vLogThumbView.H < 0 || !vLogThumbView.I) {
                    return super.scrollHorizontallyBy(i17, z2Var, h3Var);
                }
                float f17 = ((float) vLogThumbView.F) * 1.0f;
                float f18 = (float) vLogThumbView.E;
                float f19 = vLogThumbView.f176137h;
                float f27 = i18;
                if (f27 <= java.lang.Float.valueOf(((((float) vLogThumbView.G) * 1.0f) / f18) * f19).floatValue() && f27 >= java.lang.Float.valueOf((f17 / f18) * f19).floatValue()) {
                    return super.scrollHorizontallyBy(i17, z2Var, h3Var);
                }
                return 0;
            }
        };
        this.f176135f = linearLayoutManager;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, io4.i.f293529a);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
        drawable = drawable == null ? b3.l.getDrawable(context, com.tencent.mm.R.drawable.b97) : drawable;
        this.K = obtainStyledAttributes.getDimensionPixelSize(2, 63);
        this.f176132J = obtainStyledAttributes.getDimensionPixelSize(1, 112);
        obtainStyledAttributes.recycle();
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(context, null);
        this.recyclerView = recyclerView;
        recyclerView.setLayoutManager(linearLayoutManager);
        kp4.r rVar = new kp4.r();
        this.f176136g = rVar;
        recyclerView.setAdapter(rVar);
        recyclerView.setItemAnimator(null);
        recyclerView.setHorizontalFadingEdgeEnabled(true);
        recyclerView.setVerticalFadingEdgeEnabled(false);
        recyclerView.setFadingEdgeLength(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv));
        addView(recyclerView, new android.widget.FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df), 16));
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f176134e = imageView;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(4);
        addView(imageView, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        setFocusableInTouchMode(false);
        setFocusable(false);
        recyclerView.i(new cq4.o(this));
        recyclerView.P(new cq4.p(this));
        new androidx.recyclerview.widget.g1(new cq4.r(this)).d(recyclerView);
        rVar.f311139h = new cq4.s(this);
    }

    public final void a(int i17, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogThumbView", "selectTrack:" + i17);
        this.H = i17;
        this.F = j17;
        this.G = j18;
        if (i17 == -1) {
            clearFocus();
        } else {
            this.f176136g.y(i17);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        super.clearFocus();
        this.f176136g.y(-1);
    }

    public final bp4.c0 getAudioSeekable() {
        return this.audioSeekable;
    }

    public final cq4.t getOnSelectCallback() {
        return this.onSelectCallback;
    }

    public final long getProgress() {
        return this.progress;
    }

    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final int getScrollCount() {
        return this.scrollCount;
    }

    public final cq4.u getSortCallback() {
        return this.sortCallback;
    }

    public final kp4.s0 getThumbFetcherFactory() {
        return this.f176136g.f311140i;
    }

    public final void setAudioSeekable(bp4.c0 c0Var) {
        this.audioSeekable = c0Var;
    }

    public final void setOnSelectCallback(cq4.t tVar) {
        this.onSelectCallback = tVar;
    }

    public final void setProgress(long j17) {
        this.progress = j17;
        if (this.f176140n) {
            long j18 = this.f176138i;
            if (j17 != j18) {
                this.recyclerView.b1(((int) ((((float) ((j17 - j18) * this.f176137h)) * 1.0f) / ((float) this.E))) - this.f176142p, 0, null);
                return;
            }
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f176135f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView", "setProgress", "(J)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView", "setProgress", "(J)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            this.f176142p = 0;
        }
    }

    public final void setScrollCount(int i17) {
        this.scrollCount = i17;
    }

    public final void setSortCallback(cq4.u uVar) {
        this.sortCallback = uVar;
    }

    public final void setThumbFetcherFactory(kp4.s0 s0Var) {
        this.f176136g.f311140i = s0Var;
    }
}
