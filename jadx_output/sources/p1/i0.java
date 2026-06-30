package p1;

/* loaded from: classes14.dex */
public abstract class i0 {
    public static final void a(p1.l lVar, long j17, yz5.l lVar2, boolean z17) {
        p1.g gVar = lVar.f350843b;
        android.view.MotionEvent motionEvent = gVar != null ? gVar.f350818b.f350904b : null;
        if (motionEvent == null) {
            throw new java.lang.IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
        }
        int action = motionEvent.getAction();
        if (z17) {
            motionEvent.setAction(3);
        }
        motionEvent.offsetLocation(-d1.e.c(j17), -d1.e.d(j17));
        lVar2.invoke(motionEvent);
        motionEvent.offsetLocation(d1.e.c(j17), d1.e.d(j17));
        motionEvent.setAction(action);
    }
}
