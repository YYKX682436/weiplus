package com.tencent.mm.plugin.mmsight.segment;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002:\u0006\u0017\u0018\u0019\u001a\u001b\u001cB\u001d\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B%\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/mmsight/segment/RecyclerThumbSeekBarExtend;", "Landroid/widget/RelativeLayout;", "", "", "curPos", "Ljz5/f0;", "setCurrentCursorPosition", "", "getDurationMs", "Lcom/tencent/mm/plugin/mmsight/segment/g;", "preparedListener", "setOnPreparedListener", "Lcom/tencent/mm/plugin/mmsight/segment/h;", "l", "setThumbBarSeekListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/mmsight/segment/c0", "com/tencent/mm/plugin/mmsight/segment/d0", "com/tencent/mm/plugin/mmsight/segment/e0", "com/tencent/mm/plugin/mmsight/segment/f0", "com/tencent/mm/plugin/mmsight/segment/g0", "com/tencent/mm/plugin/mmsight/segment/h0", "plugin-mmsightui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class RecyclerThumbSeekBarExtend extends android.widget.RelativeLayout {
    public static final /* synthetic */ int B = 0;
    public final int A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f148888d;

    /* renamed from: e, reason: collision with root package name */
    public int f148889e;

    /* renamed from: f, reason: collision with root package name */
    public int f148890f;

    /* renamed from: g, reason: collision with root package name */
    public int f148891g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.g f148892h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.h f148893i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.f0 f148894m;

    /* renamed from: n, reason: collision with root package name */
    public int f148895n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f148896o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f148897p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar f148898q;

    /* renamed from: r, reason: collision with root package name */
    public long f148899r;

    /* renamed from: s, reason: collision with root package name */
    public long f148900s;

    /* renamed from: t, reason: collision with root package name */
    public long f148901t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.segment.i f148902u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f148903v;

    /* renamed from: w, reason: collision with root package name */
    public final androidx.recyclerview.widget.w2 f148904w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.segment.k1 f148905x;

    /* renamed from: y, reason: collision with root package name */
    public final int f148906y;

    /* renamed from: z, reason: collision with root package name */
    public final int f148907z;

    public RecyclerThumbSeekBarExtend(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f148889e = -1;
        this.f148896o = new java.util.ArrayList();
        this.f148902u = new com.tencent.mm.plugin.mmsight.segment.i(4, new com.tencent.mm.plugin.mmsight.segment.n0(this));
        this.f148903v = new com.tencent.mm.plugin.mmsight.segment.j0(this);
        this.f148904w = new com.tencent.mm.plugin.mmsight.segment.o0(this);
        this.f148905x = new com.tencent.mm.plugin.mmsight.segment.k0(this);
        this.f148906y = 1;
        this.f148907z = 2;
        this.A = 3;
        e();
    }

    public static final java.util.ArrayList a(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend, long j17, long j18) {
        recyclerThumbSeekBarExtend.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.tencent.mm.plugin.mmsight.segment.e0(-1, 0L, recyclerThumbSeekBarExtend.f148906y));
        int i17 = 0;
        while (true) {
            long j19 = i17;
            if (j19 > j17) {
                arrayList.add(new com.tencent.mm.plugin.mmsight.segment.e0(-1, 0L, recyclerThumbSeekBarExtend.f148907z));
                return arrayList;
            }
            long j27 = j17 - j19;
            if (j27 > j18) {
                j27 = j18;
            }
            arrayList.add(new com.tencent.mm.plugin.mmsight.segment.e0(i17, j27, recyclerThumbSeekBarExtend.A));
            i17 += (int) j18;
        }
    }

    public float b() {
        com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar = this.f148898q;
        if (finderSliderSeekBar == null) {
            kotlin.jvm.internal.o.o("innerSeekBar");
            throw null;
        }
        float d17 = d(finderSliderSeekBar.getRightSliderBound(), true);
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar2 = this.f148898q;
        if (finderSliderSeekBar2 == null) {
            kotlin.jvm.internal.o.o("innerSeekBar");
            throw null;
        }
        objArr[0] = java.lang.Integer.valueOf(finderSliderSeekBar2.getRightSliderBound());
        objArr[1] = java.lang.Float.valueOf(d17);
        objArr[2] = java.lang.Integer.valueOf(a06.d.b(this.f148889e * d17));
        com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "computeEndPercent x : [%d] ret[%f] seekLoopEndTime[%d]", objArr);
        return d17;
    }

    public float c() {
        com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar = this.f148898q;
        if (finderSliderSeekBar == null) {
            kotlin.jvm.internal.o.o("innerSeekBar");
            throw null;
        }
        float d17 = d(finderSliderSeekBar.getLeftSliderBound(), false);
        java.lang.Object[] objArr = new java.lang.Object[4];
        com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar2 = this.f148898q;
        if (finderSliderSeekBar2 == null) {
            kotlin.jvm.internal.o.o("innerSeekBar");
            throw null;
        }
        objArr[0] = java.lang.Integer.valueOf(finderSliderSeekBar2.getLeftSliderBound());
        objArr[1] = java.lang.Float.valueOf(d17);
        objArr[2] = java.lang.Integer.valueOf(a06.d.b(this.f148889e * d17));
        objArr[3] = java.lang.Integer.valueOf(this.f148889e);
        com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "computeStartPercent x : [%d] ret[%f] seekLoopStartTime[%d] durationMs[%d]", objArr);
        return d17;
    }

    public final float d(int i17, boolean z17) {
        java.lang.Number valueOf;
        if (this.f148894m == null) {
            return 0.0f;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f148897p;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        android.view.View k07 = recyclerView.k0(i17, 0.0f);
        if (k07 == null) {
            com.tencent.mars.xlog.Log.w("RecyclerThumbSeekBar", "getPositionInTotalRange x[%d] isEnd[%b], view is null.", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
            return 0.0f;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f148897p;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        int u07 = recyclerView2.u0(k07);
        com.tencent.mm.plugin.mmsight.segment.f0 f0Var = this.f148894m;
        kotlin.jvm.internal.o.d(f0Var);
        float left = (i17 - k07.getLeft()) / this.f148891g;
        if (u07 == f0Var.getItemCount() - 1) {
            valueOf = java.lang.Integer.valueOf(this.f148889e);
        } else if (u07 == 0) {
            valueOf = 0;
        } else {
            long j17 = this.f148901t;
            valueOf = java.lang.Float.valueOf(((float) ((u07 - 1) * j17)) + (left * ((float) j17)));
        }
        return e06.p.e(valueOf.floatValue() / this.f148889e, 0.0f, 1.0f);
    }

    public final void e() {
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(getContext(), null);
        this.f148897p = recyclerView;
        recyclerView.setOverScrollMode(2);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f148897p;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        i65.a.h(getContext(), com.tencent.mm.R.dimen.ad_);
        this.f148895n = i65.a.h(getContext(), com.tencent.mm.R.dimen.ad9);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f148897p;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        addView(recyclerView3, layoutParams);
        com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar = new com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar(getContext());
        this.f148898q = finderSliderSeekBar;
        finderSliderSeekBar.setBlackMastPaintColor(i65.a.d(getContext(), com.tencent.mm.R.color.f479505p5));
        com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar2 = this.f148898q;
        if (finderSliderSeekBar2 == null) {
            kotlin.jvm.internal.o.o("innerSeekBar");
            throw null;
        }
        finderSliderSeekBar2.setBorderColor(i65.a.d(getContext(), com.tencent.mm.R.color.f479504p4));
        com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar3 = this.f148898q;
        if (finderSliderSeekBar3 == null) {
            kotlin.jvm.internal.o.o("innerSeekBar");
            throw null;
        }
        finderSliderSeekBar3.setEnableOldBorder(false);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar4 = this.f148898q;
        if (finderSliderSeekBar4 == null) {
            kotlin.jvm.internal.o.o("innerSeekBar");
            throw null;
        }
        addView(finderSliderSeekBar4, layoutParams2);
        com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar5 = this.f148898q;
        if (finderSliderSeekBar5 == null) {
            kotlin.jvm.internal.o.o("innerSeekBar");
            throw null;
        }
        finderSliderSeekBar5.setOnSliderTouchListener(this.f148905x);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f148897p;
        if (recyclerView4 != null) {
            recyclerView4.i(this.f148904w);
        } else {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
    }

    /* renamed from: getDurationMs, reason: from getter */
    public int getF148889e() {
        return this.f148889e;
    }

    public void setCurrentCursorPosition(float f17) {
        com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar = this.f148898q;
        if (finderSliderSeekBar == null) {
            kotlin.jvm.internal.o.o("innerSeekBar");
            throw null;
        }
        float f18 = 0.0f;
        if (this.f148894m != null) {
            float itemCount = (r2.getItemCount() - 2) * f17;
            int floor = (int) java.lang.Math.floor(itemCount);
            float f19 = itemCount - floor;
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f148897p;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.k3 p07 = recyclerView.p0(floor + 1);
            if (p07 != null) {
                android.view.View itemView = p07.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                f18 = (itemView.getLeft() + (itemView.getWidth() * f19)) / getWidth();
            }
        }
        finderSliderSeekBar.setCursorPos(f18);
    }

    public void setOnPreparedListener(com.tencent.mm.plugin.mmsight.segment.g preparedListener) {
        kotlin.jvm.internal.o.g(preparedListener, "preparedListener");
        this.f148892h = preparedListener;
    }

    public void setThumbBarSeekListener(com.tencent.mm.plugin.mmsight.segment.h l17) {
        kotlin.jvm.internal.o.g(l17, "l");
        this.f148893i = l17;
    }

    public RecyclerThumbSeekBarExtend(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f148889e = -1;
        this.f148896o = new java.util.ArrayList();
        this.f148902u = new com.tencent.mm.plugin.mmsight.segment.i(4, new com.tencent.mm.plugin.mmsight.segment.n0(this));
        this.f148903v = new com.tencent.mm.plugin.mmsight.segment.j0(this);
        this.f148904w = new com.tencent.mm.plugin.mmsight.segment.o0(this);
        this.f148905x = new com.tencent.mm.plugin.mmsight.segment.k0(this);
        this.f148906y = 1;
        this.f148907z = 2;
        this.A = 3;
        e();
    }
}
