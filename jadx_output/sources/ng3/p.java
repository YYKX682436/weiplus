package ng3;

/* loaded from: classes10.dex */
public final class p implements ng3.f {

    /* renamed from: a, reason: collision with root package name */
    public final ng3.t f337024a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.MotionEvent f337025b;

    public p(ng3.t trigger, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(trigger, "trigger");
        kotlin.jvm.internal.o.g(e17, "e");
        this.f337024a = trigger;
        this.f337025b = e17;
    }

    @Override // ng3.h
    public ng3.t a() {
        return this.f337024a;
    }

    @Override // ng3.h
    public void b(mg3.b gesture, mg3.e pageGesture) {
        kotlin.jvm.internal.o.g(gesture, "gesture");
        kotlin.jvm.internal.o.g(pageGesture, "pageGesture");
        if (this.f337024a == ng3.t.f337047r) {
            ((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) gesture).D1.onSingleTapConfirmed(this.f337025b);
        }
    }
}
