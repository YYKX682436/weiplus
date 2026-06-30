package ng3;

/* loaded from: classes10.dex */
public final class o implements ng3.h {

    /* renamed from: a, reason: collision with root package name */
    public final ng3.t f337019a;

    /* renamed from: b, reason: collision with root package name */
    public final float f337020b;

    /* renamed from: c, reason: collision with root package name */
    public final float f337021c;

    /* renamed from: d, reason: collision with root package name */
    public final float f337022d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.MotionEvent f337023e;

    public o(ng3.t trigger, float f17, float f18, float f19, android.view.MotionEvent motionEvent, int i17, kotlin.jvm.internal.i iVar) {
        f17 = (i17 & 2) != 0 ? 0.0f : f17;
        f18 = (i17 & 4) != 0 ? 0.0f : f18;
        f19 = (i17 & 8) != 0 ? 0.0f : f19;
        motionEvent = (i17 & 16) != 0 ? null : motionEvent;
        kotlin.jvm.internal.o.g(trigger, "trigger");
        this.f337019a = trigger;
        this.f337020b = f17;
        this.f337021c = f18;
        this.f337022d = f19;
        this.f337023e = motionEvent;
    }

    @Override // ng3.h
    public ng3.t a() {
        return this.f337019a;
    }

    @Override // ng3.h
    public void b(mg3.b gesture, mg3.e pageGesture) {
        kotlin.jvm.internal.o.g(gesture, "gesture");
        kotlin.jvm.internal.o.g(pageGesture, "pageGesture");
        ng3.t tVar = ng3.t.f337036d;
        android.view.MotionEvent motionEvent = this.f337023e;
        float f17 = this.f337022d;
        float f18 = this.f337021c;
        float f19 = this.f337020b;
        ng3.t tVar2 = this.f337019a;
        if (tVar2 == tVar) {
            java.lang.String content = "ScaleEvent: cancel viewpager " + f19 + ", " + f18 + ", " + f17;
            kotlin.jvm.internal.o.g(content, "content");
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            pageGesture.g(obtain);
            return;
        }
        if (tVar2 == ng3.t.f337037e) {
            java.lang.String content2 = "ScaleEvent: into adapterScale " + f19 + ", " + f18 + ", " + f17;
            kotlin.jvm.internal.o.g(content2, "content");
            ((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) gesture).B(f19, f18, f17);
            return;
        }
        if (tVar2 != ng3.t.f337038f || motionEvent == null) {
            return;
        }
        com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer previewGestureContainer = (com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) gesture;
        previewGestureContainer.c(motionEvent);
        android.view.KeyEvent.Callback contentView = previewGestureContainer.getContentView();
        rf3.g gVar = contentView instanceof rf3.g ? (rf3.g) contentView : null;
        if (gVar == null) {
            return;
        }
        gVar.b();
    }
}
