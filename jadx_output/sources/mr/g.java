package mr;

/* loaded from: classes10.dex */
public final class g extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mr.i f330816a;

    public g(mr.i iVar) {
        this.f330816a = iVar;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        mr.i iVar = this.f330816a;
        if (iVar.f330825m != -1 || (recyclerView = iVar.f330820h) == null) {
            return;
        }
        recyclerView.post(new mr.e(iVar));
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        mr.i iVar = this.f330816a;
        if (iVar.f330825m != -1 || (recyclerView = iVar.f330820h) == null) {
            return;
        }
        recyclerView.post(new mr.f(iVar));
    }
}
