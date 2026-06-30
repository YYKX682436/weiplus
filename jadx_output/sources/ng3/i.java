package ng3;

/* loaded from: classes10.dex */
public final class i implements ng3.f {

    /* renamed from: a, reason: collision with root package name */
    public final ng3.t f337006a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.MotionEvent f337007b;

    public i(ng3.t trigger, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(trigger, "trigger");
        kotlin.jvm.internal.o.g(e17, "e");
        this.f337006a = trigger;
        this.f337007b = e17;
    }

    @Override // ng3.h
    public ng3.t a() {
        return this.f337006a;
    }

    @Override // ng3.h
    public void b(mg3.b gesture, mg3.e pageGesture) {
        kotlin.jvm.internal.o.g(gesture, "gesture");
        kotlin.jvm.internal.o.g(pageGesture, "pageGesture");
        if (this.f337006a == ng3.t.f337046q) {
            ((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) gesture).D1.onLongPress(this.f337007b);
        }
    }
}
