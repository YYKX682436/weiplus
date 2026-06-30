package db5;

/* loaded from: classes8.dex */
public final class l implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.DragDownContainer f228426d;

    public l(com.tencent.mm.ui.base.DragDownContainer dragDownContainer) {
        this.f228426d = dragDownContainer;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/DragDownContainer$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(event, "event");
        android.view.MotionEvent.actionToString(event.getAction());
        com.tencent.mm.ui.base.DragDownContainer dragDownContainer = this.f228426d;
        android.view.VelocityTracker velocityTracker = dragDownContainer.f197240i;
        if (velocityTracker == null) {
            velocityTracker = android.view.VelocityTracker.obtain();
            dragDownContainer.f197240i = velocityTracker;
        }
        velocityTracker.addMovement(event);
        int action = event.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x17 = event.getX() - dragDownContainer.f197236e;
                    float y17 = event.getY() - dragDownContainer.f197237f;
                    velocityTracker.computeCurrentVelocity(1000);
                    int xVelocity = (int) velocityTracker.getXVelocity();
                    int yVelocity = (int) velocityTracker.getYVelocity();
                    if ((java.lang.Math.abs(x17) > 250.0f || java.lang.Math.abs(yVelocity) <= java.lang.Math.abs(xVelocity) || yVelocity <= 0) && !dragDownContainer.f197241m) {
                        dragDownContainer.f197241m = false;
                    } else {
                        dragDownContainer.a(x17, y17);
                        dragDownContainer.f197241m = true;
                    }
                    if (y17 > 200.0f) {
                        dragDownContainer.f197242n = false;
                    } else {
                        dragDownContainer.f197242n = true;
                    }
                    if (dragDownContainer.f197240i != null) {
                        velocityTracker.recycle();
                        dragDownContainer.f197240i = null;
                    }
                }
            } else if (dragDownContainer.f197242n) {
                dragDownContainer.a(0.0f, 0.0f);
                dragDownContainer.f197241m = false;
            } else if (dragDownContainer.f197241m) {
                android.content.Context context = dragDownContainer.getContext();
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if (activity != null) {
                    activity.finishAfterTransition();
                    activity.overridePendingTransition(0, 0);
                }
                dragDownContainer.f197241m = false;
            }
        } else {
            dragDownContainer.f197236e = event.getX();
            dragDownContainer.f197237f = event.getY();
        }
        boolean z17 = dragDownContainer.f197241m;
        yj0.a.i(z17, this, "com/tencent/mm/ui/base/DragDownContainer$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
