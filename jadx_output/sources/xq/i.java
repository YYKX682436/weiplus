package xq;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMNeat7extView f455980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xq.m f455981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f455982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f455983g;

    public i(com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, xq.m mVar, int i17, int i18) {
        this.f455980d = mMNeat7extView;
        this.f455981e = mVar;
        this.f455982f = i17;
        this.f455983g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = xq.b.f455970a;
        android.graphics.RectF a17 = xq.a.f455969a.a(this.f455980d);
        xq.m mVar = this.f455981e;
        mVar.f455998j.set(a17);
        mVar.d(a17.centerX() + this.f455982f + r1.getPaddingLeft(), a17.centerY() + this.f455983g + r1.getPaddingTop(), (int) a17.width());
    }
}
