package oj5;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj5.o f345856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f345857e;

    public k(oj5.o oVar, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f345856d = oVar;
        this.f345857e = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        oj5.o oVar = this.f345856d;
        oj5.o.a(oVar);
        oj5.o.b(this.f345856d, true, "recyclerView.first.post", 0L, 4, null);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f345857e;
        if (n3.x0.b(recyclerView)) {
            recyclerView.addOnAttachStateChangeListener(new oj5.j(recyclerView, oVar));
            return;
        }
        oj5.g gVar = oVar.f345873l;
        if (gVar != null && (atomicBoolean = gVar.f345850n) != null) {
            atomicBoolean.set(true);
        }
        oVar.f345867f.removeCallbacksAndMessages(null);
    }
}
