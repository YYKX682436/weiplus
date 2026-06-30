package ir;

/* loaded from: classes15.dex */
public final class i extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ir.o f293865a;

    public i(ir.o oVar) {
        this.f293865a = oVar;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        ir.o oVar = this.f293865a;
        java.lang.Object obj = oVar.f293882c.f293891b.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.lang.Object obj2 = oVar.f293883d.f293891b.get(i18);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        return ((ir.r) obj).b((ir.r) obj2);
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        ir.o oVar = this.f293865a;
        return kotlin.jvm.internal.o.b(oVar.f293882c.f293891b.get(i17), oVar.f293883d.f293891b.get(i18));
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f293865a.f293883d.f293891b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f293865a.f293882c.f293891b.size();
    }
}
