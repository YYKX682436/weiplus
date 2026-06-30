package fc2;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.o f260956d;

    public n(fc2.o oVar) {
        this.f260956d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc2.o oVar = this.f260956d;
        androidx.recyclerview.widget.RecyclerView recyclerView = oVar.f260968m;
        if (recyclerView != null) {
            oVar.g(recyclerView, 7);
            oVar.g(recyclerView, 5);
        }
    }
}
