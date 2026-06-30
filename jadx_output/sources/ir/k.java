package ir;

/* loaded from: classes15.dex */
public final class k implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ir.o f293873a;

    public k(ir.o oVar) {
        this.f293873a = oVar;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        ((ir.m0) this.f293873a.f293881b).f293877a.notifyItemRangeChanged(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        ((ir.m0) this.f293873a.f293881b).f293877a.notifyItemRangeInserted(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        ((ir.m0) this.f293873a.f293881b).f293877a.notifyItemRangeRemoved(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
    }
}
