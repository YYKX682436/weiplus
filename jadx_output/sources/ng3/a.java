package ng3;

/* loaded from: classes10.dex */
public final class a implements ng3.h {

    /* renamed from: a, reason: collision with root package name */
    public final ng3.t f336990a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.MotionEvent f336991b;

    public a(ng3.t trigger, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(trigger, "trigger");
        kotlin.jvm.internal.o.g(e17, "e");
        this.f336990a = trigger;
        this.f336991b = e17;
    }

    @Override // ng3.h
    public ng3.t a() {
        return this.f336990a;
    }

    @Override // ng3.h
    public void b(mg3.b gesture, mg3.e pageGesture) {
        kotlin.jvm.internal.o.g(gesture, "gesture");
        kotlin.jvm.internal.o.g(pageGesture, "pageGesture");
        ng3.t tVar = ng3.t.f337048s;
        android.view.MotionEvent motionEvent = this.f336991b;
        ng3.t tVar2 = this.f336990a;
        if (tVar2 == tVar) {
            ((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) gesture).D1.onDoubleTap(motionEvent);
        } else if (tVar2 == ng3.t.f337047r) {
            pageGesture.g(motionEvent);
        }
    }
}
