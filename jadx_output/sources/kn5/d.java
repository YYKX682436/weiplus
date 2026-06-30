package kn5;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kn5.e f309786d;

    public d(kn5.e eVar) {
        this.f309786d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        kn5.c cVar;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        kn5.e eVar = this.f309786d;
        boolean z17 = true;
        if (eVar.f309806z) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = eVar.f309795o;
            if (recyclerView2 != null) {
                recyclerView2.scrollBy(0, -eVar.B);
            }
            eVar.f309788e.postDelayed(this, 25L);
        } else if (eVar.A) {
            androidx.recyclerview.widget.RecyclerView recyclerView3 = eVar.f309795o;
            if (recyclerView3 != null) {
                recyclerView3.scrollBy(0, eVar.B);
            }
            eVar.f309788e.postDelayed(this, 25L);
        } else {
            z17 = false;
        }
        if (!z17 || (cVar = eVar.D) == null || (recyclerView = eVar.f309795o) == null) {
            return;
        }
        android.graphics.Rect rect = kn5.f.f309807a;
        eVar.e(kn5.f.a(recyclerView, cVar.f309784a, cVar.f309785b));
    }
}
