package com.tencent.mm.plugin.vlog.ui.plugin.timecrop;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB!\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u0010.\u001a\u00020\u0012¢\u0006\u0004\b/\u00100B\u001b\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b/\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003R(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010)\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$¨\u00062"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropViewGroup;", "Landroid/widget/FrameLayout;", "", "", "getScrollTime", "", "enable", "Ljz5/f0;", "setEnableLengthEdit", "timeMs", "setProgress", "Lcom/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar;", "<set-?>", "g", "Lcom/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar;", "getSeekSlider", "()Lcom/tencent/mm/plugin/vlog/ui/plugin/timecrop/TimeCropSliderSeekBar;", "seekSlider", "", "u", "I", "getDragCnt", "()I", "setDragCnt", "(I)V", "dragCnt", org.chromium.base.BaseSwitches.V, "getCutCnt", "setCutCnt", "cutCnt", "Lfp4/e;", "x", "Lfp4/e;", "getCallback", "()Lfp4/e;", "setCallback", "(Lfp4/e;)V", "callback", "y", "getRealTimeCallback", "setRealTimeCallback", "realTimeCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class TimeCropViewGroup extends android.widget.FrameLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f175934d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f175935e;

    /* renamed from: f, reason: collision with root package name */
    public kp4.r f175936f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar seekSlider;

    /* renamed from: h, reason: collision with root package name */
    public final int f175938h;

    /* renamed from: i, reason: collision with root package name */
    public final int f175939i;

    /* renamed from: m, reason: collision with root package name */
    public long f175940m;

    /* renamed from: n, reason: collision with root package name */
    public long f175941n;

    /* renamed from: o, reason: collision with root package name */
    public long f175942o;

    /* renamed from: p, reason: collision with root package name */
    public long f175943p;

    /* renamed from: q, reason: collision with root package name */
    public float f175944q;

    /* renamed from: r, reason: collision with root package name */
    public int f175945r;

    /* renamed from: s, reason: collision with root package name */
    public final kp4.c1 f175946s;

    /* renamed from: t, reason: collision with root package name */
    public final kp4.c1 f175947t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public int dragCnt;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public int cutCnt;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Runnable f175950w;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public fp4.e callback;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public fp4.e realTimeCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeCropViewGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f175934d = "MicroMsg.TrackCropView";
        this.f175938h = 112;
        this.f175939i = 63;
        this.f175943p = 1L;
        this.f175944q = 1.0f;
        kp4.b1 b1Var = kp4.c1.f311095o;
        this.f175946s = b1Var.a(0);
        this.f175947t = b1Var.a(0);
    }

    public static final void a(com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup timeCropViewGroup) {
        android.view.View view;
        long j17;
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar timeCropSliderSeekBar;
        androidx.recyclerview.widget.RecyclerView recyclerView = timeCropViewGroup.f175935e;
        android.view.View view2 = null;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                view = recyclerView.getChildAt(i17);
                if (view instanceof com.tencent.mm.plugin.vlog.ui.thumb.FrameListView) {
                    int u07 = recyclerView.u0(view);
                    if (u07 >= 0) {
                        kp4.r rVar = timeCropViewGroup.f175936f;
                        kotlin.jvm.internal.o.d(rVar);
                        if (u07 < rVar.getItemCount()) {
                            kp4.r rVar2 = timeCropViewGroup.f175936f;
                            kotlin.jvm.internal.o.d(rVar2);
                            j17 = ((kp4.c1) rVar2.x(u07)).c();
                            break;
                        }
                    }
                    view2 = view;
                }
            }
        }
        view = view2;
        j17 = 0;
        if (view == null || (timeCropSliderSeekBar = timeCropViewGroup.seekSlider) == null) {
            timeCropViewGroup.f175942o = 0L;
            timeCropViewGroup.f175943p = timeCropViewGroup.f175940m;
            return;
        }
        float f17 = (float) j17;
        long leftSliderBound = ((timeCropSliderSeekBar.getLeftSliderBound() - view.getLeft()) / timeCropViewGroup.f175944q) + f17;
        timeCropViewGroup.f175942o = leftSliderBound;
        if (leftSliderBound < 0) {
            timeCropViewGroup.f175942o = 0L;
        }
        kotlin.jvm.internal.o.d(timeCropViewGroup.seekSlider);
        long rightSliderBound = ((r1.getRightSliderBound() - view.getLeft()) / timeCropViewGroup.f175944q) + f17;
        timeCropViewGroup.f175943p = rightSliderBound;
        long j18 = timeCropViewGroup.f175940m;
        if (rightSliderBound > j18) {
            timeCropViewGroup.f175943p = j18;
        }
    }

    private final long getScrollTime() {
        android.view.View view;
        long j17;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f175935e;
        android.view.View view2 = null;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                view = recyclerView.getChildAt(i17);
                if (view instanceof com.tencent.mm.plugin.vlog.ui.thumb.FrameListView) {
                    int u07 = recyclerView.u0(view);
                    if (u07 >= 0) {
                        kp4.r rVar = this.f175936f;
                        kotlin.jvm.internal.o.d(rVar);
                        if (u07 < rVar.getItemCount()) {
                            kp4.r rVar2 = this.f175936f;
                            kotlin.jvm.internal.o.d(rVar2);
                            j17 = rVar2.x(u07).c();
                            break;
                        }
                    }
                    view2 = view;
                }
            }
        }
        view = view2;
        j17 = 0;
        if (view == null) {
            return 0L;
        }
        return (view.getLeft() / this.f175944q) + ((float) j17);
    }

    public final void b(com.tencent.mm.plugin.vlog.model.h1 composition, long j17, long j18) {
        kotlin.jvm.internal.o.g(composition, "composition");
        this.dragCnt = 0;
        this.cutCnt = 0;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f175940m = composition.g();
        com.tencent.tav.coremedia.CMTimeRange i17 = composition.i();
        this.f175941n = composition.g();
        this.f175942o = j17;
        this.f175943p = j18;
        if (j17 < 0 || j18 < 0) {
            long j19 = 1000;
            this.f175942o = i17.getStartUs() / j19;
            this.f175943p = i17.getEndUs() / j19;
        }
        java.util.List m17 = composition.m();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        int i18 = 0;
        for (java.lang.Object obj : m17) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            kp4.c1 c1Var = new kp4.c1((com.tencent.mm.plugin.vlog.model.i1) obj);
            c1Var.f311079i = i18;
            c1Var.f311072b = this.f175938h;
            c1Var.f311071a = this.f175939i;
            arrayList.add(c1Var);
            i18 = i19;
        }
        linkedList.addAll(arrayList);
        if (linkedList.size() == 1) {
            int i27 = ((kp4.c1) linkedList.get(0)).f311097n.f175617b;
        }
        fp4.h hVar = new fp4.h(this, linkedList, 1000L);
        this.f175950w = hVar;
        hVar.run();
    }

    public final fp4.e getCallback() {
        return this.callback;
    }

    public final int getCutCnt() {
        return this.cutCnt;
    }

    public final int getDragCnt() {
        return this.dragCnt;
    }

    public final fp4.e getRealTimeCallback() {
        return this.realTimeCallback;
    }

    public final com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar getSeekSlider() {
        return this.seekSlider;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f175935e = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f487389oi2);
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar timeCropSliderSeekBar = (com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar) findViewById(com.tencent.mm.R.id.f487388oi1);
        this.seekSlider = timeCropSliderSeekBar;
        if (timeCropSliderSeekBar != null) {
            timeCropSliderSeekBar.setMaskColor(1999383596);
        }
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar timeCropSliderSeekBar2 = this.seekSlider;
        if (timeCropSliderSeekBar2 != null) {
            timeCropSliderSeekBar2.setEnableHapticAtEdge(true);
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f175935e;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        kp4.r rVar = new kp4.r();
        this.f175936f = rVar;
        rVar.f311141m = true;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f175935e;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(rVar);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f175935e;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator(null);
        }
        fp4.f fVar = new fp4.f(this);
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar timeCropSliderSeekBar3 = this.seekSlider;
        if (timeCropSliderSeekBar3 != null) {
            timeCropSliderSeekBar3.setOnSliderTouchListener(fVar);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        com.tencent.mars.xlog.Log.i(this.f175934d, "onLayout");
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar timeCropSliderSeekBar = this.seekSlider;
        if (timeCropSliderSeekBar != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f175935e;
            timeCropSliderSeekBar.setContentTop(recyclerView != null ? recyclerView.getTop() : 0);
        }
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar timeCropSliderSeekBar2 = this.seekSlider;
        if (timeCropSliderSeekBar2 != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f175935e;
            timeCropSliderSeekBar2.setContentHeight(recyclerView2 != null ? recyclerView2.getMeasuredHeight() : 0);
        }
    }

    public final void setCallback(fp4.e eVar) {
        this.callback = eVar;
    }

    public final void setCutCnt(int i17) {
        this.cutCnt = i17;
    }

    public final void setDragCnt(int i17) {
        this.dragCnt = i17;
    }

    public final void setEnableLengthEdit(boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar timeCropSliderSeekBar = this.seekSlider;
            if (timeCropSliderSeekBar != null) {
                timeCropSliderSeekBar.f175916f = false;
                return;
            }
            return;
        }
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar timeCropSliderSeekBar2 = this.seekSlider;
        if (timeCropSliderSeekBar2 != null) {
            timeCropSliderSeekBar2.f175916f = true;
        }
    }

    public final void setProgress(long j17) {
        float f17 = this.f175945r / this.f175944q;
        com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropSliderSeekBar timeCropSliderSeekBar = this.seekSlider;
        if (timeCropSliderSeekBar != null) {
            timeCropSliderSeekBar.setCursorPos(((float) (j17 + getScrollTime())) / (((float) this.f175941n) + (f17 * 2)));
        }
    }

    public final void setRealTimeCallback(fp4.e eVar) {
        this.realTimeCallback = eVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeCropViewGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
