package com.tencent.mm.plugin.vlog.ui.thumb;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B!\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010-\u001a\u00020\u0015¢\u0006\u0004\b.\u0010/B\u001b\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b.\u00100J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003R(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00061"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/thumb/TrackCropView;", "Landroid/widget/FrameLayout;", "", "", "getScrollTime", "", "enable", "Ljz5/f0;", "setEnableLengthEdit", "Lrm5/v;", "composition", "setTrack", "timeMs", "setProgress", "Lcom/tencent/mm/plugin/mmsight/segment/SliderSeekBar;", "<set-?>", "h", "Lcom/tencent/mm/plugin/mmsight/segment/SliderSeekBar;", "getSeekSlider", "()Lcom/tencent/mm/plugin/mmsight/segment/SliderSeekBar;", "seekSlider", "", "w", "I", "getDragCnt", "()I", "setDragCnt", "(I)V", "dragCnt", "x", "getCutCnt", "setCutCnt", "cutCnt", "Lkp4/t0;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkp4/t0;", "getCallback", "()Lkp4/t0;", "setCallback", "(Lkp4/t0;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class TrackCropView extends android.widget.FrameLayout implements xn5.a0 {

    /* renamed from: A, reason: from kotlin metadata */
    public kp4.t0 callback;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f176054d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f176055e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f176056f;

    /* renamed from: g, reason: collision with root package name */
    public final kp4.r f176057g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.mmsight.segment.SliderSeekBar seekSlider;

    /* renamed from: i, reason: collision with root package name */
    public final int f176059i;

    /* renamed from: m, reason: collision with root package name */
    public final int f176060m;

    /* renamed from: n, reason: collision with root package name */
    public long f176061n;

    /* renamed from: o, reason: collision with root package name */
    public long f176062o;

    /* renamed from: p, reason: collision with root package name */
    public long f176063p;

    /* renamed from: q, reason: collision with root package name */
    public long f176064q;

    /* renamed from: r, reason: collision with root package name */
    public float f176065r;

    /* renamed from: s, reason: collision with root package name */
    public int f176066s;

    /* renamed from: t, reason: collision with root package name */
    public int f176067t;

    /* renamed from: u, reason: collision with root package name */
    public final kp4.c1 f176068u;

    /* renamed from: v, reason: collision with root package name */
    public final kp4.c1 f176069v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public int dragCnt;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public int cutCnt;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Runnable f176072y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f176073z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackCropView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f176054d = "MicroMsg.TrackCropView";
        this.f176056f = new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false);
        this.f176057g = new kp4.r();
        this.f176059i = 112;
        this.f176060m = 63;
        this.f176064q = 1L;
        this.f176065r = 1.0f;
        kp4.b1 b1Var = kp4.c1.f311095o;
        this.f176068u = b1Var.a(0);
        this.f176069v = b1Var.a(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r4 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r10.seekSlider != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r10.f176073z != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        r0 = (float) r0;
        r1 = ((r2.getLeftSliderBound() - r4.getLeft()) / r10.f176065r) + r0;
        r10.f176063p = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r1 >= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        r10.f176063p = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        kotlin.jvm.internal.o.d(r10.seekSlider);
        r0 = ((r1.getRightSliderBound() - r4.getLeft()) / r10.f176065r) + r0;
        r10.f176064q = r0;
        r2 = r10.f176061n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r0 <= r2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        r10.f176064q = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        r10.f176063p = 0;
        r10.f176064q = r10.f176061n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView r10) {
        /*
            androidx.recyclerview.widget.RecyclerView r0 = r10.f176055e
            r1 = 0
            java.lang.String r2 = "recyclerView"
            if (r0 == 0) goto L91
            int r0 = r0.getChildCount()
            r3 = 0
            r4 = r1
        Ld:
            r5 = 0
            if (r3 >= r0) goto L46
            androidx.recyclerview.widget.RecyclerView r7 = r10.f176055e
            if (r7 == 0) goto L42
            android.view.View r7 = r7.getChildAt(r3)
            boolean r8 = r7 instanceof com.tencent.mm.plugin.vlog.ui.thumb.FrameListView
            if (r8 == 0) goto L3f
            androidx.recyclerview.widget.RecyclerView r4 = r10.f176055e
            if (r4 == 0) goto L3b
            int r4 = r4.u0(r7)
            if (r4 < 0) goto L39
            kp4.r r8 = r10.f176057g
            int r9 = r8.getItemCount()
            if (r4 >= r9) goto L39
            kp4.a r0 = r8.x(r4)
            long r0 = r0.c()
            r4 = r7
            goto L47
        L39:
            r4 = r7
            goto L3f
        L3b:
            kotlin.jvm.internal.o.o(r2)
            throw r1
        L3f:
            int r3 = r3 + 1
            goto Ld
        L42:
            kotlin.jvm.internal.o.o(r2)
            throw r1
        L46:
            r0 = r5
        L47:
            if (r4 == 0) goto L8a
            com.tencent.mm.plugin.mmsight.segment.SliderSeekBar r2 = r10.seekSlider
            if (r2 != 0) goto L4e
            goto L8a
        L4e:
            boolean r3 = r10.f176073z
            if (r3 != 0) goto L53
            goto L90
        L53:
            int r2 = r2.getLeftSliderBound()
            int r3 = r4.getLeft()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r3 = r10.f176065r
            float r2 = r2 / r3
            float r0 = (float) r0
            float r2 = r2 + r0
            long r1 = (long) r2
            r10.f176063p = r1
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L6b
            r10.f176063p = r5
        L6b:
            com.tencent.mm.plugin.mmsight.segment.SliderSeekBar r1 = r10.seekSlider
            kotlin.jvm.internal.o.d(r1)
            int r1 = r1.getRightSliderBound()
            int r2 = r4.getLeft()
            int r1 = r1 - r2
            float r1 = (float) r1
            float r2 = r10.f176065r
            float r1 = r1 / r2
            float r1 = r1 + r0
            long r0 = (long) r1
            r10.f176064q = r0
            long r2 = r10.f176061n
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L90
            r10.f176064q = r2
            goto L90
        L8a:
            r10.f176063p = r5
            long r0 = r10.f176061n
            r10.f176064q = r0
        L90:
            return
        L91:
            kotlin.jvm.internal.o.o(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView.a(com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView):void");
    }

    public static void b(com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView trackCropView, com.tencent.mm.plugin.vlog.model.h1 composition, long j17, long j18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            j17 = -1;
        }
        if ((i17 & 4) != 0) {
            j18 = -1;
        }
        trackCropView.getClass();
        kotlin.jvm.internal.o.g(composition, "composition");
        trackCropView.dragCnt = 0;
        trackCropView.cutCnt = 0;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        trackCropView.f176061n = composition.k();
        com.tencent.tav.coremedia.CMTimeRange i18 = composition.i();
        long j19 = trackCropView.f176061n;
        if (j19 > 60000) {
            j19 = 60000;
        }
        trackCropView.f176062o = j19;
        trackCropView.f176063p = j17;
        trackCropView.f176064q = j18;
        if (j17 < 0 || j18 < 0) {
            long j27 = 1000;
            trackCropView.f176063p = i18.getStartUs() / j27;
            trackCropView.f176064q = i18.getEndUs() / j27;
        }
        java.util.List m17 = composition.m();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        java.util.Iterator it = ((java.util.ArrayList) m17).iterator();
        int i19 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            kp4.c1 c1Var = new kp4.c1((com.tencent.mm.plugin.vlog.model.i1) next);
            c1Var.f311079i = i19;
            c1Var.f311072b = trackCropView.f176059i;
            c1Var.f311071a = trackCropView.f176060m;
            arrayList.add(c1Var);
            i19 = i27;
        }
        linkedList.addAll(arrayList);
        trackCropView.f176073z = false;
        kp4.a1 a1Var = new kp4.a1(trackCropView, linkedList, 3000L);
        trackCropView.f176072y = a1Var;
        a1Var.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r4 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        return ((-r4.getLeft()) / r10.f176065r) + ((float) r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long getScrollTime() {
        /*
            r10 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r10.f176055e
            java.lang.String r1 = "recyclerView"
            r2 = 0
            if (r0 == 0) goto L57
            int r0 = r0.getChildCount()
            r3 = 0
            r4 = r2
        Ld:
            r5 = 0
            if (r3 >= r0) goto L46
            androidx.recyclerview.widget.RecyclerView r7 = r10.f176055e
            if (r7 == 0) goto L42
            android.view.View r7 = r7.getChildAt(r3)
            boolean r8 = r7 instanceof com.tencent.mm.plugin.vlog.ui.thumb.FrameListView
            if (r8 == 0) goto L3f
            androidx.recyclerview.widget.RecyclerView r4 = r10.f176055e
            if (r4 == 0) goto L3b
            int r4 = r4.u0(r7)
            if (r4 < 0) goto L39
            kp4.r r8 = r10.f176057g
            int r9 = r8.getItemCount()
            if (r4 >= r9) goto L39
            kp4.a r0 = r8.x(r4)
            long r0 = r0.c()
            r4 = r7
            goto L47
        L39:
            r4 = r7
            goto L3f
        L3b:
            kotlin.jvm.internal.o.o(r1)
            throw r2
        L3f:
            int r3 = r3 + 1
            goto Ld
        L42:
            kotlin.jvm.internal.o.o(r1)
            throw r2
        L46:
            r0 = r5
        L47:
            if (r4 != 0) goto L4a
            return r5
        L4a:
            int r2 = r4.getLeft()
            int r2 = -r2
            float r2 = (float) r2
            float r3 = r10.f176065r
            float r2 = r2 / r3
            float r0 = (float) r0
            float r2 = r2 + r0
            long r0 = (long) r2
            return r0
        L57:
            kotlin.jvm.internal.o.o(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView.getScrollTime():long");
    }

    public final kp4.t0 getCallback() {
        return this.callback;
    }

    public final int getCutCnt() {
        return this.cutCnt;
    }

    public final int getDragCnt() {
        return this.dragCnt;
    }

    public final com.tencent.mm.plugin.mmsight.segment.SliderSeekBar getSeekSlider() {
        return this.seekSlider;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487389oi2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f176055e = (androidx.recyclerview.widget.RecyclerView) findViewById;
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar = (com.tencent.mm.plugin.mmsight.segment.SliderSeekBar) findViewById(com.tencent.mm.R.id.f487388oi1);
        this.seekSlider = sliderSeekBar;
        if (sliderSeekBar != null) {
            sliderSeekBar.setMaskColor(1999383596);
        }
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar2 = this.seekSlider;
        if (sliderSeekBar2 != null) {
            sliderSeekBar2.setEnableHapticAtEdge(true);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f176055e;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(this.f176056f);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f176055e;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView2.setAdapter(this.f176057g);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f176055e;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView3.setItemAnimator(null);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f176055e;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView4.i(new kp4.u0(this));
        androidx.recyclerview.widget.RecyclerView recyclerView5 = this.f176055e;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView5.P(new kp4.v0(this));
        kp4.w0 w0Var = new kp4.w0(this);
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar3 = this.seekSlider;
        if (sliderSeekBar3 != null) {
            sliderSeekBar3.setOnSliderTouchListener(w0Var);
        }
    }

    public final void setCallback(kp4.t0 t0Var) {
        this.callback = t0Var;
    }

    public final void setCutCnt(int i17) {
        this.cutCnt = i17;
    }

    public final void setDragCnt(int i17) {
        this.dragCnt = i17;
    }

    public final void setEnableLengthEdit(boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar = this.seekSlider;
            if (sliderSeekBar != null) {
                sliderSeekBar.f148941f = false;
                return;
            }
            return;
        }
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar2 = this.seekSlider;
        if (sliderSeekBar2 != null) {
            sliderSeekBar2.f148941f = true;
        }
    }

    public final void setProgress(long j17) {
        float f17 = this.f176066s / this.f176065r;
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar = this.seekSlider;
        if (sliderSeekBar != null) {
            sliderSeekBar.setCursorPos(((float) (j17 - getScrollTime())) / (((float) this.f176062o) + (f17 * 2)));
        }
    }

    public final void setTrack(rm5.v composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        this.dragCnt = 0;
        this.cutCnt = 0;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = composition.f397584l;
        long j17 = ((rm5.j) kz5.n0.X(arrayList)).f397504f;
        long j18 = (composition.j() - 0) + j17;
        long j19 = (composition.j() - 0) + j17 + (((rm5.j) kz5.n0.i0(arrayList)).f397508j - ((rm5.j) kz5.n0.i0(arrayList)).f397505g);
        this.f176061n = j19;
        if (j19 > 60000) {
            j19 = 60000;
        }
        this.f176062o = j19;
        this.f176063p = j17;
        this.f176064q = j18;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                linkedList.addAll(arrayList2);
                if (linkedList.size() == 1) {
                    int i18 = ((kp4.c1) linkedList.get(0)).f311097n.f175617b;
                }
                this.f176073z = false;
                kp4.y0 y0Var = new kp4.y0(this, linkedList, 1000L);
                this.f176072y = y0Var;
                y0Var.run();
                return;
            }
            java.lang.Object next = it.next();
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            rm5.j jVar = (rm5.j) next;
            boolean z18 = i17 == 0;
            if (i17 != arrayList.size() - 1) {
                z17 = false;
            }
            kp4.c1 c1Var = new kp4.c1(jVar, z18, z17);
            c1Var.f311079i = i17;
            c1Var.f311072b = this.f176059i;
            c1Var.f311071a = this.f176060m;
            arrayList2.add(c1Var);
            i17 = i19;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackCropView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
