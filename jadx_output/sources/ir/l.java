package ir;

/* loaded from: classes15.dex */
public final class l implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ir.o f293874a;

    public l(ir.o oVar) {
        this.f293874a = oVar;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        ((ir.m0) this.f293874a.f293881b).f293878b.notifyItemRangeChanged(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        ((ir.m0) this.f293874a.f293881b).f293878b.notifyItemRangeInserted(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        ((ir.m0) this.f293874a.f293881b).f293878b.notifyItemRangeRemoved(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
    }
}
