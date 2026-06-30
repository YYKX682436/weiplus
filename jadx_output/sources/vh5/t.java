package vh5;

/* loaded from: classes10.dex */
public final class t implements ng3.h {

    /* renamed from: a, reason: collision with root package name */
    public final ng3.t f437244a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.MotionEvent f437245b;

    public t(ng3.t trigger, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(trigger, "trigger");
        kotlin.jvm.internal.o.g(e17, "e");
        this.f437244a = trigger;
        this.f437245b = e17;
    }

    @Override // ng3.h
    public ng3.t a() {
        return this.f437244a;
    }

    @Override // ng3.h
    public void b(mg3.b gesture, mg3.e pageGesture) {
        kotlin.jvm.internal.o.g(gesture, "gesture");
        kotlin.jvm.internal.o.g(pageGesture, "pageGesture");
        if (this.f437244a == ng3.t.f337048s) {
            ((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) gesture).D1.onDoubleTap(this.f437245b);
        }
    }
}
