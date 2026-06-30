package de2;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de2.c f229370d;

    public b(de2.c cVar) {
        this.f229370d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f229370d.f229373c.entrySet().iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator) ((java.util.Map.Entry) it.next()).getValue()).cancel();
        }
    }
}
