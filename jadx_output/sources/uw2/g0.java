package uw2;

/* loaded from: classes2.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f431668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f431669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f431670g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f431671h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f431672i;

    public g0(android.view.View view, float f17, android.view.MotionEvent motionEvent, boolean z17, float f18, long j17) {
        this.f431667d = view;
        this.f431668e = f17;
        this.f431669f = motionEvent;
        this.f431670g = z17;
        this.f431671h = f18;
        this.f431672i = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uw2.h0.f(uw2.h0.f431674a, this.f431667d, this.f431668e, this.f431669f, this.f431670g, this.f431671h, this.f431672i, 0L, 0L, 192, null).start();
    }
}
