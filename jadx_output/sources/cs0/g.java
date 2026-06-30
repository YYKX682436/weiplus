package cs0;

/* loaded from: classes14.dex */
public final class g extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView f222048d;

    public g(com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView cameraFocusAndMeteringView) {
        this.f222048d = cameraFocusAndMeteringView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDoubleTap enable:[");
        com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f222048d;
        sb6.append(cameraFocusAndMeteringView.f68899y.f456154e);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraFocusAndMeteringView", sb6.toString());
        if (java.lang.System.currentTimeMillis() - cameraFocusAndMeteringView.f68882e > 1000 && cameraFocusAndMeteringView.f68899y.f456154e) {
            cs0.b bVar = cameraFocusAndMeteringView.f68881d;
            if (bVar != null) {
                com.tencent.mm.media.camera.view.CameraKitView cameraKitView = (com.tencent.mm.media.camera.view.CameraKitView) bVar;
                bs0.e eVar = cameraKitView.f68878i;
                if (eVar != null) {
                    eVar.e();
                }
                cameraKitView.switchCamera();
            }
            cameraFocusAndMeteringView.f68882e = java.lang.System.currentTimeMillis();
        }
        yj0.a.i(false, this, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraFocusAndMeteringView", "onSingleTapConfirmed");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSingleTapUp ");
        sb6.append(e17.getX());
        sb6.append(", ");
        sb6.append(e17.getY());
        sb6.append(' ');
        com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f222048d;
        sb6.append(cameraFocusAndMeteringView.f68899y.f456153d);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraFocusAndMeteringView", sb6.toString());
        if (!cameraFocusAndMeteringView.f68899y.f456153d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraFocusAndMeteringView", "no to use focus on");
            yj0.a.i(false, this, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
        float x17 = e17.getX();
        float y17 = e17.getY();
        pm0.v.X(new cs0.d(cameraFocusAndMeteringView));
        if (cameraFocusAndMeteringView.f68899y.f456152c && cameraFocusAndMeteringView.f68890p == null) {
            cameraFocusAndMeteringView.f68897w = kotlinx.coroutines.l.d(cameraFocusAndMeteringView.f68896v, null, null, new cs0.f(cameraFocusAndMeteringView, x17, y17, null), 3, null);
        } else {
            cs0.i iVar = cameraFocusAndMeteringView.f68885h;
            if (iVar != null) {
                iVar.a(x17, y17, cameraFocusAndMeteringView.a());
            }
            cs0.b bVar = cameraFocusAndMeteringView.f68881d;
            if (bVar != null) {
                ((com.tencent.mm.media.camera.view.CameraKitView) bVar).m(x17, y17);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$simpleGestureListener$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
