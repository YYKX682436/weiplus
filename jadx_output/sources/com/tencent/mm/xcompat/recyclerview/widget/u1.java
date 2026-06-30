package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class u1 {

    /* renamed from: a, reason: collision with root package name */
    public int f214646a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f214647b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f214648c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f214649d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f214650e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f214651f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f214652g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f214653h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f214654i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f214655j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f214656k = false;

    /* renamed from: l, reason: collision with root package name */
    public int f214657l;

    /* renamed from: m, reason: collision with root package name */
    public long f214658m;

    /* renamed from: n, reason: collision with root package name */
    public int f214659n;

    public void a(int i17) {
        if ((this.f214649d & i17) != 0) {
            return;
        }
        throw new java.lang.IllegalStateException("Layout state should be one of " + java.lang.Integer.toBinaryString(i17) + " but it is " + java.lang.Integer.toBinaryString(this.f214649d));
    }

    public int b() {
        return this.f214652g ? this.f214647b - this.f214648c : this.f214650e;
    }

    public java.lang.String toString() {
        return "State{mTargetPosition=" + this.f214646a + ", mData=null, mItemCount=" + this.f214650e + ", mIsMeasuring=" + this.f214654i + ", mPreviousLayoutItemCount=" + this.f214647b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f214648c + ", mStructureChanged=" + this.f214651f + ", mInPreLayout=" + this.f214652g + ", mRunSimpleAnimations=" + this.f214655j + ", mRunPredictiveAnimations=" + this.f214656k + '}';
    }
}
