package ir;

/* loaded from: classes15.dex */
public final class j extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ir.o f293872a;

    public j(ir.o oVar) {
        this.f293872a = oVar;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        ir.o oVar = this.f293872a;
        java.lang.Object obj = oVar.f293882c.f293892c.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        ir.y0 y0Var = (ir.y0) obj;
        java.lang.Object obj2 = oVar.f293883d.f293892c.get(i18);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        return b(i17, i18) && y0Var.f293919a.b(((ir.y0) obj2).f293919a);
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        ir.o oVar = this.f293872a;
        java.lang.Object obj = oVar.f293882c.f293892c.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.lang.Object obj2 = oVar.f293883d.f293892c.get(i18);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        ir.r rVar = ((ir.y0) obj).f293919a;
        int i19 = rVar.f293895a;
        ir.r rVar2 = ((ir.y0) obj2).f293919a;
        return i19 == rVar2.f293895a && kotlin.jvm.internal.o.b(rVar, rVar2);
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f293872a.f293883d.f293892c.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f293872a.f293882c.f293892c.size();
    }
}
