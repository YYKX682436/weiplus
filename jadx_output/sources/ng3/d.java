package ng3;

/* loaded from: classes10.dex */
public final class d implements ng3.f {

    /* renamed from: a, reason: collision with root package name */
    public final ng3.t f336999a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.MotionEvent f337000b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.MotionEvent f337001c;

    /* renamed from: d, reason: collision with root package name */
    public final float f337002d;

    /* renamed from: e, reason: collision with root package name */
    public final float f337003e;

    public d(ng3.t trigger, android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(trigger, "trigger");
        kotlin.jvm.internal.o.g(e27, "e2");
        this.f336999a = trigger;
        this.f337000b = motionEvent;
        this.f337001c = e27;
        this.f337002d = f17;
        this.f337003e = f18;
    }

    @Override // ng3.h
    public ng3.t a() {
        return this.f336999a;
    }

    @Override // ng3.h
    public void b(mg3.b gesture, mg3.e pageGesture) {
        kotlin.jvm.internal.o.g(gesture, "gesture");
        kotlin.jvm.internal.o.g(pageGesture, "pageGesture");
        if (this.f336999a == ng3.t.f337043n) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MoveEvent: into dispatcher.onFling ");
            float f17 = this.f337002d;
            sb6.append(f17);
            sb6.append(' ');
            float f18 = this.f337003e;
            sb6.append(f18);
            java.lang.String content = sb6.toString();
            kotlin.jvm.internal.o.g(content, "content");
            ((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) gesture).D1.onFling(this.f337000b, this.f337001c, f17, f18);
        }
    }
}
