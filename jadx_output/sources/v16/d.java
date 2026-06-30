package v16;

/* loaded from: classes15.dex */
public final class d extends o26.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f432598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f432599b;

    public d(kotlin.jvm.internal.h0 h0Var, yz5.l lVar) {
        this.f432598a = h0Var;
        this.f432599b = lVar;
    }

    @Override // o26.e
    public java.lang.Object a() {
        return (o06.d) this.f432598a.f310123d;
    }

    @Override // o26.e
    public boolean b(java.lang.Object obj) {
        o06.d current = (o06.d) obj;
        kotlin.jvm.internal.o.g(current, "current");
        return this.f432598a.f310123d == null;
    }

    @Override // o26.c, o26.e
    public void c(java.lang.Object obj) {
        o06.d current = (o06.d) obj;
        kotlin.jvm.internal.o.g(current, "current");
        kotlin.jvm.internal.h0 h0Var = this.f432598a;
        if (h0Var.f310123d == null && ((java.lang.Boolean) this.f432599b.invoke(current)).booleanValue()) {
            h0Var.f310123d = current;
        }
    }
}
