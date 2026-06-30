package gy0;

/* loaded from: classes5.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy0.q f277516d;

    public m(gy0.q qVar) {
        this.f277516d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gy0.q qVar = this.f277516d;
        androidx.recyclerview.widget.RecyclerView recyclerView = qVar.f277522e.getRecyclerView();
        qVar.getClass();
        recyclerView.requestLayout();
        recyclerView.D0();
        recyclerView.invalidate();
    }
}
