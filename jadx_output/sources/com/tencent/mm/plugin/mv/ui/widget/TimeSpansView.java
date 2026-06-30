package com.tencent.mm.plugin.mv.ui.widget;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u001d\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR*\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "value", "d2", "J", "getTotalDuration", "()J", "setTotalDuration", "(J)V", "totalDuration", "", "e2", "D", "getWidthPerMills", "()D", "widthPerMills", "f2", "getProgress", "setProgress", "progress", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sm3/i0", "sm3/j0", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TimeSpansView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f152051b2;

    /* renamed from: c2, reason: collision with root package name */
    public final double f152052c2;

    /* renamed from: d2, reason: collision with root package name and from kotlin metadata */
    public long totalDuration;

    /* renamed from: e2, reason: collision with root package name and from kotlin metadata */
    public final double widthPerMills;

    /* renamed from: f2, reason: collision with root package name and from kotlin metadata */
    public long progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeSpansView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false);
        this.f152051b2 = linearLayoutManager;
        this.f152052c2 = 5000.0d;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.c4o, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.d(inflate);
        new sm3.i0(inflate).f409876d.setText("00:00");
        inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        this.widthPerMills = inflate.getMeasuredWidth() / 5000.0d;
        setAdapter(new sm3.j0(this));
        setLayoutManager(linearLayoutManager);
        setClipChildren(false);
        setClipToPadding(false);
        i(new sm3.h0());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    public final void g1(int i17, int i18) {
        double d17 = this.totalDuration;
        kotlin.jvm.internal.o.d(getAdapter());
        int i19 = i17 / 2;
        setPadding(i19, 0, ((int) ((d17 - (r8.getItemCount() * this.f152052c2)) * this.widthPerMills)) + i19, 0);
    }

    public final long getProgress() {
        return this.progress;
    }

    public final long getTotalDuration() {
        return this.totalDuration;
    }

    public final double getWidthPerMills() {
        return this.widthPerMills;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        g1(i17, i18);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    public final void setProgress(long j17) {
        this.progress = j17;
        double d17 = j17;
        double d18 = this.f152052c2;
        int i17 = (int) (d17 / d18);
        double d19 = (d17 - (d18 * i17)) * this.widthPerMills;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f152051b2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(-((int) d19)));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView", "setProgress", "(J)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView", "setProgress", "(J)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }

    public final void setTotalDuration(long j17) {
        this.totalDuration = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeSpansView", "setup duration: " + this.totalDuration);
        g1(getWidth(), getHeight());
    }
}
