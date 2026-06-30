package vh5;

/* loaded from: classes10.dex */
public final class i implements sy3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mg3.b f437218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vh5.q f437219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f437220c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh5.k f437221d;

    public i(mg3.b bVar, vh5.q qVar, int i17, vh5.k kVar) {
        this.f437218a = bVar;
        this.f437219b = qVar;
        this.f437220c = i17;
        this.f437221d = kVar;
    }

    @Override // sy3.a
    public void a(float f17, float f18, float f19) {
        mg3.b bVar = this.f437218a;
        com.tencent.mars.xlog.Log.i("MediaGallery.ChatXGestureAdapter", "zoomTo currentScale:" + bVar.getCurrentScaleRatio() + " targetScale" + f17);
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(0L, 0L, 0, f18, f19, 0);
        mg3.c cVar = ((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) bVar).D1;
        if (cVar != null) {
            cVar.onDoubleTap(obtain);
        }
    }

    @Override // sy3.a
    public float b(float f17, float f18) {
        mg3.b bVar = this.f437218a;
        float currentScaleRatio = bVar.getCurrentScaleRatio();
        float minScaleRatio = bVar.getMinScaleRatio();
        float f19 = 100;
        int i17 = (int) (currentScaleRatio * f19);
        int i18 = (int) (f19 * minScaleRatio);
        float f27 = java.lang.Math.abs(i17 - i18) <= 10 ? 2.0f : minScaleRatio;
        com.tencent.mars.xlog.Log.i("MediaGallery.ChatXGestureAdapter", "doubleTabZoom curScale:" + currentScaleRatio + '(' + i17 + "%) minScale:" + minScaleRatio + '(' + i18 + "%) targetScale:" + f27 + " threshold:10");
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(0L, 0L, 0, f17, f18, 0);
        mg3.c cVar = ((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) bVar).D1;
        if (cVar != null) {
            cVar.onDoubleTap(obtain);
        }
        return f27;
    }

    @Override // sy3.a
    public float c() {
        return 1.0f;
    }

    @Override // sy3.a
    public float d() {
        return this.f437218a.getCurrentScaleRatio();
    }

    @Override // sy3.a
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        vh5.k kVar = this.f437221d;
        kVar.getClass();
        return kVar.f437225b.dispatchTouchEvent(motionEvent);
    }

    @Override // sy3.a
    public void e(sy3.b bVar) {
        mg3.b bVar2 = this.f437218a;
        com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer previewGestureContainer = bVar2 instanceof com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer ? (com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) bVar2 : null;
        if (previewGestureContainer == null) {
            return;
        }
        previewGestureContainer.setOnScaleChangedListener(new vh5.h(bVar));
    }

    @Override // sy3.a
    public void f() {
        vh5.q qVar = this.f437219b;
        if (qVar != null) {
            qVar.c(this.f437220c, new wh5.i0(true));
        }
    }

    @Override // sy3.a
    public void reset() {
        vh5.q qVar = this.f437219b;
        if (qVar != null) {
            qVar.c(this.f437220c, new wh5.i0(false));
        }
    }
}
