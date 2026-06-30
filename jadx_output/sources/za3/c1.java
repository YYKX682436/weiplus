package za3;

/* loaded from: classes15.dex */
public class c1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.i1 f470899d;

    public c1(za3.i1 i1Var) {
        this.f470899d = i1Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/TrackPointViewMgrImpl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        za3.i1 i1Var = this.f470899d;
        if (action != 0) {
            boolean z17 = true;
            if (action != 1) {
                if (action == 2 && (java.lang.Math.abs(motionEvent.getX() - i1Var.f470957o) > 10.0f || java.lang.Math.abs(motionEvent.getY() - i1Var.f470958p) > 10.0f)) {
                    i1Var.f470959q = true;
                }
            } else if (!i1Var.f470959q && java.lang.System.currentTimeMillis() - i1Var.f470960r < 200) {
                if (i1Var.f470951i) {
                    i1Var.d(false);
                }
                java.util.Collection childs = i1Var.f470954l.getChilds();
                java.util.Iterator it = childs.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (next instanceof com.tencent.mm.plugin.location.ui.impl.TrackPoint) {
                        if (((com.tencent.mm.plugin.location.ui.impl.TrackPoint) next).f144713e.getVisibility() == 0) {
                            break;
                        }
                    }
                }
                for (java.lang.Object obj : childs) {
                    if (obj instanceof com.tencent.mm.plugin.location.ui.impl.TrackPoint) {
                        if (z17) {
                            ((com.tencent.mm.plugin.location.ui.impl.TrackPoint) obj).a();
                        } else {
                            com.tencent.mm.plugin.location.ui.impl.TrackPoint trackPoint = (com.tencent.mm.plugin.location.ui.impl.TrackPoint) obj;
                            trackPoint.f144713e.setVisibility(0);
                            com.tencent.mm.plugin.location_soso.ViewManager viewManager = trackPoint.f144721p;
                            if (viewManager != null) {
                                viewManager.toggleViewVisible(trackPoint.f144713e);
                            }
                        }
                    }
                }
            }
        } else {
            i1Var.f470957o = motionEvent.getX();
            i1Var.f470958p = motionEvent.getY();
            i1Var.f470960r = java.lang.System.currentTimeMillis();
            i1Var.f470959q = false;
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/location/ui/TrackPointViewMgrImpl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
