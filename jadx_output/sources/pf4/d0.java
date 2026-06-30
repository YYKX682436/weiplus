package pf4;

/* loaded from: classes4.dex */
public final class d0 implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf4.f0 f353858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f353859b;

    public d0(pf4.f0 f0Var, java.util.List list) {
        this.f353858a = f0Var;
        this.f353859b = list;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        pf4.f0 f0Var = this.f353858a;
        java.lang.String str = f0Var.f353867e;
        f0Var.f353866d.clear();
        f0Var.f353866d.addAll(this.f353859b);
        f0Var.notifyItemRangeChanged(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        pf4.f0 f0Var = this.f353858a;
        java.lang.String str = f0Var.f353867e;
        f0Var.f353866d.clear();
        f0Var.f353866d.addAll(this.f353859b);
        f0Var.notifyItemRangeInserted(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        pf4.f0 f0Var = this.f353858a;
        java.lang.String str = f0Var.f353867e;
        f0Var.f353866d.clear();
        f0Var.f353866d.addAll(this.f353859b);
        f0Var.notifyItemRangeRemoved(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        java.lang.String str = this.f353858a.f353867e;
    }
}
