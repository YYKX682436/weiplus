package vl1;

/* loaded from: classes11.dex */
public class a extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vl1.g f437780a;

    public a(vl1.g gVar) {
        this.f437780a = gVar;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        this.f437780a.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.h2
    public void c(int i17, int i18) {
        vl1.g gVar = this.f437780a;
        gVar.notifyItemRangeChanged(i17 + (!gVar.f437797g.isEmpty() ? 1 : 0), i18);
    }

    @Override // androidx.recyclerview.widget.h2
    public void d(int i17, int i18, java.lang.Object obj) {
        vl1.g gVar = this.f437780a;
        gVar.notifyItemRangeChanged(i17 + (!gVar.f437797g.isEmpty() ? 1 : 0), i18, obj);
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        vl1.g gVar = this.f437780a;
        gVar.notifyItemRangeInserted(i17 + (!gVar.f437797g.isEmpty() ? 1 : 0), i18);
    }

    @Override // androidx.recyclerview.widget.h2
    public void f(int i17, int i18, int i19) {
        vl1.g gVar = this.f437780a;
        if (i19 == 1) {
            gVar.notifyItemMoved(i17 + (!gVar.f437797g.isEmpty() ? 1 : 0), i18 + (!gVar.f437797g.isEmpty() ? 1 : 0));
        } else {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        vl1.g gVar = this.f437780a;
        gVar.notifyItemRangeRemoved(i17 + (!gVar.f437797g.isEmpty() ? 1 : 0), i18);
    }
}
