package com.tencent.mm.plugin.finder.replay.widget;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u001d\b\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B%\b\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\u0002J \u0010\u000e\u001a\u00020\u00042\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0018\u00010\fR\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u000bJ \u0010\u000f\u001a\u00020\u00042\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0018\u00010\fR\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u000bR!\u0010\u0015\u001a\f\u0012\b\u0012\u00060\fR\u00020\u00000\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/finder/replay/widget/FinderLiveReplaySeekbar;", "Landroid/widget/SeekBar;", "Landroid/view/View;", "contentView", "Ljz5/f0;", "setFragmentPreview", "", "Lr45/w94;", "items", "setFragmentItems", "getFragmentView", "Lkotlin/Function1;", "Ldt2/v;", "callback", "setBreakpointClickCallback", "setBreakPointDoubleClickCallback", "", "u", "Ljava/util/List;", "getFragmentItems", "()Ljava/util/List;", "fragmentItems", "", org.chromium.base.BaseSwitches.V, "Z", "isDragging", "()Z", "setDragging", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveReplaySeekbar extends android.widget.SeekBar {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f124919d;

    /* renamed from: e, reason: collision with root package name */
    public float f124920e;

    /* renamed from: f, reason: collision with root package name */
    public float f124921f;

    /* renamed from: g, reason: collision with root package name */
    public long f124922g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f124923h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f124924i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f124925m;

    /* renamed from: n, reason: collision with root package name */
    public dt2.v f124926n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f124927o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f124928p;

    /* renamed from: q, reason: collision with root package name */
    public db5.d5 f124929q;

    /* renamed from: r, reason: collision with root package name */
    public final android.os.Vibrator f124930r;

    /* renamed from: s, reason: collision with root package name */
    public int f124931s;

    /* renamed from: t, reason: collision with root package name */
    public kotlinx.coroutines.y0 f124932t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final java.util.List fragmentItems;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public boolean isDragging;

    public FinderLiveReplaySeekbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f124919d = "FinderLiveReplaySeekbar";
        this.f124928p = new java.util.ArrayList();
        java.lang.Object systemService = getContext().getSystemService("vibrator");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        this.f124930r = (android.os.Vibrator) systemService;
        this.fragmentItems = new java.util.ArrayList();
        setOnSeekBarChangeListener(new dt2.u(this));
    }

    public final java.util.List<dt2.v> getFragmentItems() {
        return this.fragmentItems;
    }

    public final android.view.View getFragmentView() {
        db5.d5 d5Var = this.f124929q;
        if (d5Var != null) {
            return d5Var.getContentView();
        }
        return null;
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        for (dt2.v vVar : this.fragmentItems) {
            vVar.getClass();
            gk2.e eVar = ws2.k1.f449066r.a().f449071c;
            int S6 = eVar != null ? ((ct2.j) eVar.a(ct2.j.class)).S6() : -1;
            float paddingLeft = vVar.f243207d.getPaddingLeft();
            r45.w94 w94Var = vVar.f243205b;
            com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar finderLiveReplaySeekbar = vVar.f243204a;
            android.graphics.drawable.Drawable drawable = vVar.f243206c;
            int integer = (int) ((paddingLeft + ((w94Var.getInteger(0) / S6) * ((finderLiveReplaySeekbar.getWidth() - finderLiveReplaySeekbar.getPaddingLeft()) - finderLiveReplaySeekbar.getPaddingRight()))) - (drawable.getIntrinsicWidth() / 2));
            if (w94Var.getInteger(0) <= S6) {
                int paddingTop = (int) ((r3.getPaddingTop() + (finderLiveReplaySeekbar.getHeight() / 2.0f)) - (drawable.getIntrinsicHeight() / 2.0f));
                drawable.setBounds(integer, paddingTop, drawable.getIntrinsicWidth() + integer, drawable.getIntrinsicHeight() + paddingTop);
                drawable.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r0 != 3) goto L47;
     */
    @Override // android.widget.AbsSeekBar, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setBreakPointDoubleClickCallback(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f124925m = callback;
    }

    public final void setBreakpointClickCallback(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f124924i = callback;
    }

    public final void setDragging(boolean z17) {
        this.isDragging = z17;
    }

    public final void setFragmentItems(java.util.List<? extends r45.w94> items) {
        kotlin.jvm.internal.o.g(items, "items");
        java.util.List list = this.fragmentItems;
        ((java.util.ArrayList) list).clear();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(new dt2.v(this, this, (r45.w94) it.next()));
        }
        ((java.util.ArrayList) list).addAll(arrayList);
        invalidate();
    }

    public final void setFragmentPreview(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        db5.d5 d5Var = new db5.d5(contentView, -2, -2);
        d5Var.setOutsideTouchable(true);
        d5Var.setFocusable(true);
        this.f124929q = d5Var;
    }

    public FinderLiveReplaySeekbar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f124919d = "FinderLiveReplaySeekbar";
        this.f124928p = new java.util.ArrayList();
        java.lang.Object systemService = getContext().getSystemService("vibrator");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        this.f124930r = (android.os.Vibrator) systemService;
        this.fragmentItems = new java.util.ArrayList();
        setOnSeekBarChangeListener(new dt2.u(this));
    }
}
