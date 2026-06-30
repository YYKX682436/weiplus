package vc2;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f435245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc2.j f435246e;

    public i(vc2.j jVar, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f435246e = jVar;
        this.f435245d = recyclerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f435245d;
        if (recyclerView.getItemAnimator() != null) {
            recyclerView.getItemAnimator().p(new vc2.h(this));
            return;
        }
        vc2.j jVar = this.f435246e;
        jVar.f435248b = false;
        jVar.f435247a.requestLayout();
    }
}
