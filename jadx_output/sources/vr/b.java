package vr;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.g f439394d;

    public b(vr.g gVar) {
        this.f439394d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vr.g gVar = this.f439394d;
        gVar.f439405c.setVisibility(4);
        if (gVar.f439405c.getParent() != null) {
            gVar.f439405c.h();
            android.view.ViewParent parent = gVar.f439405c.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(gVar.f439405c);
        }
    }
}
