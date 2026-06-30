package ng3;

/* loaded from: classes10.dex */
public final class l implements ng3.h {

    /* renamed from: a, reason: collision with root package name */
    public final ng3.t f337011a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.MotionEvent f337012b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.MotionEvent f337013c;

    /* renamed from: d, reason: collision with root package name */
    public final float f337014d;

    /* renamed from: e, reason: collision with root package name */
    public final float f337015e;

    public l(ng3.t trigger, android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(trigger, "trigger");
        kotlin.jvm.internal.o.g(e27, "e2");
        this.f337011a = trigger;
        this.f337012b = motionEvent;
        this.f337013c = e27;
        this.f337014d = f17;
        this.f337015e = f18;
    }

    @Override // ng3.h
    public ng3.t a() {
        return this.f337011a;
    }

    @Override // ng3.h
    public void b(mg3.b gesture, mg3.e pageGesture) {
        kotlin.jvm.internal.o.g(gesture, "gesture");
        kotlin.jvm.internal.o.g(pageGesture, "pageGesture");
        ng3.t tVar = ng3.t.f337041i;
        android.view.MotionEvent motionEvent = this.f337012b;
        android.view.MotionEvent event = this.f337013c;
        float f17 = this.f337015e;
        float f18 = this.f337014d;
        ng3.t tVar2 = this.f337011a;
        if (tVar2 == tVar) {
            java.lang.String content = "MoveEvent: into dispatcher.onScroll(MOVE_SCROLL) " + f18 + ' ' + f17;
            kotlin.jvm.internal.o.g(content, "content");
            ((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) gesture).D1.onScroll(motionEvent, event, f18, f17);
            return;
        }
        if (tVar2 == ng3.t.f337042m) {
            java.lang.String content2 = "MoveEvent: into dispatcher.onScroll(MOVE_VERTICAL_SCROLL) " + f18 + ' ' + f17;
            kotlin.jvm.internal.o.g(content2, "content");
            ((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) gesture).D1.onScroll(motionEvent, event, f18, f17);
            return;
        }
        if (tVar2 == ng3.t.f337040h) {
            ((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) gesture).D1.onDown(event);
            return;
        }
        if (tVar2 == ng3.t.f337044o) {
            com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer previewGestureContainer = (com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) gesture;
            kotlin.jvm.internal.o.g(event, "event");
            previewGestureContainer.t();
            previewGestureContainer.u();
            previewGestureContainer.v();
            previewGestureContainer.x();
            previewGestureContainer.w();
            java.util.Objects.toString(previewGestureContainer.getVisibilityRect());
            java.util.Objects.toString(previewGestureContainer.getContentRectF());
            if (previewGestureContainer.t()) {
                com.tencent.mm.ui.widget.cropview.CropLayout.I(previewGestureContainer, null, 1, null);
            }
            android.view.KeyEvent.Callback contentView = previewGestureContainer.getContentView();
            rf3.g gVar = contentView instanceof rf3.g ? (rf3.g) contentView : null;
            if (gVar == null) {
                return;
            }
            gVar.b();
        }
    }

    public /* synthetic */ l(ng3.t tVar, android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18, int i17, kotlin.jvm.internal.i iVar) {
        this(tVar, (i17 & 2) != 0 ? null : motionEvent, motionEvent2, (i17 & 8) != 0 ? 0.0f : f17, (i17 & 16) != 0 ? 0.0f : f18);
    }
}
