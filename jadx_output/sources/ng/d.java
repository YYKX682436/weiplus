package ng;

/* loaded from: classes5.dex */
public final class d extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng.e f336885d;

    public d(ng.e eVar) {
        this.f336885d = eVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        ng.e eVar = this.f336885d;
        com.tencent.maas.base.Rect2 rect2 = eVar.f336888c;
        if (rect2 != null && motionEvent != null) {
            float f17 = rect2.getOrigin().f47799x;
            float f18 = rect2.getOrigin().f47800y;
            float f19 = rect2.getOrigin().f47799x + rect2.getSize().f47799x;
            float f27 = rect2.getOrigin().f47800y + rect2.getSize().f47800y;
            if (motionEvent.getX() > f17 && motionEvent.getY() > f18 && motionEvent.getX() < f19 && motionEvent.getY() < f27) {
                mg.e.a("MJHandleBoxGestureDetector", "onDoubleTap, origin:[" + rect2.getOrigin() + "]  size:[" + rect2.getSize() + ']');
                ((mg.c) eVar.f336887b).f326196a.getClass();
            }
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        this.f336885d.getClass();
        mg.e.a("MJHandleBoxGestureDetector", "onScroll, distanceX:" + f17 + ", distanceY:" + f18 + ", touchCurRect:false");
        return super.onScroll(motionEvent, motionEvent2, f17, f18);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        ng.e eVar = this.f336885d;
        if (eVar.f336889d) {
            eVar.f336889d = false;
            return true;
        }
        if (motionEvent != null) {
            ng.f fVar = eVar.f336887b;
            com.tencent.maas.base.Vec2 vec2 = new com.tencent.maas.base.Vec2(motionEvent.getX(), motionEvent.getY());
            com.tencent.maas.base.Vec2 vec22 = eVar.f336886a;
            com.tencent.maas.base.Vec2 vec23 = new com.tencent.maas.base.Vec2(vec22.f47799x, vec22.f47800y);
            mg.c cVar = (mg.c) fVar;
            cVar.getClass();
            cVar.f326196a.f326183a.onTapRenderView(vec2, new com.tencent.maas.base.Rect2(new com.tencent.maas.base.Vec2(0.0f, 0.0f), vec23));
        }
        return true;
    }
}
