package com.tencent.mm.plugin.mmsight.segment;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002:\u0006%&'()*B\u001d\b\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B%\b\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0004\b!\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R3\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n0\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n`\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lcom/tencent/mm/plugin/mmsight/segment/SegmentClipRecyclerThumbBarView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/mmsight/segment/f;", "", "getThumbHeight", "", "duration", "Ljz5/f0;", "setTotalDurationMs", "getDurationMs", "", "durationSecond", "setClipWindowDuration", "count", "setMinThumbViewCountForWindow", "Lcom/tencent/mm/plugin/mmsight/segment/g;", "preparedListener", "setOnPreparedListener", "Lcom/tencent/mm/plugin/mmsight/segment/e;", "l", "setSegmentThumbBarTouchListener", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "w", "Ljava/util/HashMap;", "getMediaItemStartTimeMsPositionMap", "()Ljava/util/HashMap;", "mediaItemStartTimeMsPositionMap", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/mmsight/segment/p0", "com/tencent/mm/plugin/mmsight/segment/q0", "com/tencent/mm/plugin/mmsight/segment/r0", "com/tencent/mm/plugin/mmsight/segment/s0", "com/tencent/mm/plugin/mmsight/segment/t0", "com/tencent/mm/plugin/mmsight/segment/u0", "plugin-mmsightui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SegmentClipRecyclerThumbBarView extends android.widget.RelativeLayout implements com.tencent.mm.plugin.mmsight.segment.f {
    public final com.tencent.mm.plugin.mmsight.segment.e1 A;
    public final com.tencent.mm.plugin.mmsight.segment.t0 B;

    /* renamed from: d, reason: collision with root package name */
    public int f148908d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f148909e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f148910f;

    /* renamed from: g, reason: collision with root package name */
    public int f148911g;

    /* renamed from: h, reason: collision with root package name */
    public int f148912h;

    /* renamed from: i, reason: collision with root package name */
    public int f148913i;

    /* renamed from: m, reason: collision with root package name */
    public int f148914m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.g f148915n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.e f148916o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f148917p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.SegmentClipWindow f148918q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.SegmentClipTimeCursorView f148919r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f148920s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f148921t;

    /* renamed from: u, reason: collision with root package name */
    public int f148922u;

    /* renamed from: v, reason: collision with root package name */
    public double f148923v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final java.util.HashMap mediaItemStartTimeMsPositionMap;

    /* renamed from: x, reason: collision with root package name */
    public rm5.k f148925x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f148926y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f148927z;

    public SegmentClipRecyclerThumbBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final int getThumbHeight() {
        return i65.a.f(getContext(), com.tencent.mm.R.dimen.ad8);
    }

    public final int a() {
        int i17 = this.f148912h;
        if (i17 == ((int) (this.f148923v * 1000))) {
            return this.f148908d;
        }
        if (i17 > 0) {
            return java.lang.Math.max(0, (int) java.lang.Math.floor(i17 / this.f148911g));
        }
        return 0;
    }

    public void b(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.mmsight.segment.SegmentClipTimeCursorView segmentClipTimeCursorView = this.f148919r;
        if (segmentClipTimeCursorView != null) {
            segmentClipTimeCursorView.setVisibility(4);
        }
        java.lang.String r17 = i65.a.r(getContext(), com.tencent.mm.R.string.gga);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        d(true, r17, this.f148922u);
        this.f148910f = path;
        int thumbHeight = getThumbHeight();
        this.f148913i = thumbHeight;
        if (this.f148914m <= 0) {
            this.f148914m = (thumbHeight * 9) / 16;
        }
        this.f148922u = (getWidth() - (this.f148908d * this.f148914m)) / 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.SegmentClip.RecyclerThumbBarView", "thumb size=[" + this.f148914m + ',' + this.f148913i + "], layout width=" + getWidth() + ", HorizontalPadding=" + this.f148922u);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f148917p;
        if ((recyclerView != null ? recyclerView.getAdapter() : null) == null) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f148917p;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.B);
            }
            setClipToPadding(false);
            setClipChildren(false);
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f148917p;
            if (recyclerView3 != null) {
                recyclerView3.setClipChildren(false);
            }
            androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f148917p;
            if (recyclerView4 != null) {
                recyclerView4.setClipToPadding(false);
            }
        }
        androidx.recyclerview.widget.RecyclerView recyclerView5 = this.f148917p;
        if (recyclerView5 != null) {
            int i17 = this.f148922u;
            recyclerView5.setPadding(i17, 0, i17, 0);
        }
        com.tencent.mm.plugin.mmsight.segment.SegmentClipWindow segmentClipWindow = this.f148918q;
        int borderWidth = segmentClipWindow != null ? segmentClipWindow.getBorderWidth() : 0;
        int i18 = this.f148922u;
        int i19 = borderWidth / 2;
        double d17 = this.f148923v;
        android.widget.TextView textView = this.f148920s;
        android.view.ViewGroup.LayoutParams layoutParams = textView != null ? textView.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMargins(i18 + i19, i19, 0, 0);
            android.widget.TextView textView2 = this.f148920s;
            if (textView2 != null) {
                textView2.setLayoutParams(layoutParams2);
            }
        }
        double pow = java.lang.Math.pow(10.0d, 1);
        java.lang.String format = java.lang.String.format("%.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(java.lang.Math.rint(d17 * pow) / pow)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.ief);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String format2 = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{format}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        android.widget.TextView textView3 = this.f148920s;
        if (textView3 != null) {
            textView3.setText(format2);
        }
        android.widget.TextView textView4 = this.f148920s;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        kotlinx.coroutines.l.d(this.f148909e, null, null, new com.tencent.mm.plugin.mmsight.segment.w0(this, path, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(boolean z17, java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SegmentClip.RecyclerThumbBarView", "updateClipWindowTipsView: " + z17 + ", " + i17);
        boolean z18 = false;
        if (z17) {
            android.widget.TextView textView = this.f148921t;
            if (textView != null) {
                android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    int i18 = i17 + 0;
                    layoutParams2.setMargins(i18, 0, i18, 0);
                }
                textView.setLayoutParams(layoutParams2);
                textView.setVisibility(0);
                textView.setText(str);
            }
        } else {
            android.widget.TextView textView2 = this.f148921t;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            android.widget.TextView textView3 = this.f148921t;
            if (textView3 != null) {
                textView3.setText("");
            }
        }
        android.widget.TextView textView4 = this.f148921t;
        if (textView4 != null && textView4.getVisibility() == 0) {
            z18 = true;
        }
        if (!z18) {
            com.tencent.mm.plugin.mmsight.segment.SegmentClipWindow segmentClipWindow = this.f148918q;
            if (segmentClipWindow == null) {
                return;
            }
            segmentClipWindow.setContentDescription(i65.a.r(getContext(), com.tencent.mm.R.string.lpu));
            return;
        }
        com.tencent.mm.plugin.mmsight.segment.SegmentClipWindow segmentClipWindow2 = this.f148918q;
        if (segmentClipWindow2 == null) {
            return;
        }
        android.widget.TextView textView5 = this.f148921t;
        segmentClipWindow2.setContentDescription(textView5 != null ? textView5.getText() : null);
    }

    /* renamed from: getDurationMs, reason: from getter */
    public int getF148912h() {
        return this.f148912h;
    }

    public final java.util.HashMap<java.lang.String, java.lang.Double> getMediaItemStartTimeMsPositionMap() {
        return this.mediaItemStartTimeMsPositionMap;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        measureChild(this.f148917p, i17, i18);
        measureChild(this.f148919r, i17, i18);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f148917p;
        int measuredHeight = recyclerView != null ? recyclerView.getMeasuredHeight() : 0;
        com.tencent.mm.plugin.mmsight.segment.SegmentClipTimeCursorView segmentClipTimeCursorView = this.f148919r;
        setMeasuredDimension(getMeasuredWidth(), measuredHeight + (segmentClipTimeCursorView != null ? segmentClipTimeCursorView.getMeasuredHeight() : 0));
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.f
    public void setClipWindowDuration(double d17) {
        this.f148923v = d17;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.f
    public void setMinThumbViewCountForWindow(int i17) {
        this.f148908d = java.lang.Math.max(0, i17);
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.f
    public void setOnPreparedListener(com.tencent.mm.plugin.mmsight.segment.g gVar) {
        this.f148915n = gVar;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.f
    public void setSegmentThumbBarTouchListener(com.tencent.mm.plugin.mmsight.segment.e l17) {
        kotlin.jvm.internal.o.g(l17, "l");
        this.f148916o = l17;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.f
    public void setTotalDurationMs(long j17) {
        this.f148912h = (int) j17;
    }

    public SegmentClipRecyclerThumbBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f148908d = 10;
        this.f148909e = kotlinx.coroutines.z0.b();
        this.f148910f = "";
        this.f148912h = -1;
        this.mediaItemStartTimeMsPositionMap = new java.util.HashMap();
        this.f148926y = kz5.p0.f313996d;
        this.f148927z = new java.util.HashSet();
        com.tencent.mm.plugin.mmsight.segment.e1 e1Var = new com.tencent.mm.plugin.mmsight.segment.e1(this);
        this.A = e1Var;
        this.B = new com.tencent.mm.plugin.mmsight.segment.t0(this, e1Var);
        com.tencent.mm.plugin.mmsight.segment.v0 v0Var = new com.tencent.mm.plugin.mmsight.segment.v0(this);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.cje, (android.view.ViewGroup) this, true);
        this.f148917p = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.gdu);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f148917p;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f148917p;
        if (recyclerView2 != null) {
            recyclerView2.setHasFixedSize(true);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f148917p;
        if (recyclerView3 != null) {
            recyclerView3.i(v0Var);
        }
        this.f148922u = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479731dn);
        this.f148918q = (com.tencent.mm.plugin.mmsight.segment.SegmentClipWindow) inflate.findViewById(com.tencent.mm.R.id.gdl);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gdm);
        this.f148920s = textView;
        com.tencent.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        android.widget.TextView textView2 = this.f148920s;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        com.tencent.mm.plugin.mmsight.segment.SegmentClipTimeCursorView segmentClipTimeCursorView = (com.tencent.mm.plugin.mmsight.segment.SegmentClipTimeCursorView) inflate.findViewById(com.tencent.mm.R.id.gdi);
        this.f148919r = segmentClipTimeCursorView;
        if (segmentClipTimeCursorView != null) {
            segmentClipTimeCursorView.setVisibility(4);
        }
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gdn);
        this.f148921t = textView3;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        android.widget.TextView textView4 = this.f148921t;
        if (textView4 != null) {
            textView4.setTextSize(0, textView4.getTextSize() / i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a));
        }
    }
}
