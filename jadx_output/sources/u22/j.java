package u22;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u22.k f423994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f423995e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u22.k kVar, java.util.List list) {
        super(0);
        this.f423994d = kVar;
        this.f423995e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        u22.k kVar = this.f423994d;
        java.util.LinkedList linkedList = kVar.f423998c;
        java.util.List newList = this.f423995e;
        synchronized (linkedList) {
            java.util.LinkedList oldList = kVar.f423998c;
            kotlin.jvm.internal.o.g(oldList, "oldList");
            kotlin.jvm.internal.o.g(newList, "newList");
            h0Var.f310123d = androidx.recyclerview.widget.h0.a(new t85.c(oldList, newList), false);
            kVar.f423998c.clear();
            kVar.f423998c.addAll(newList);
        }
        pm0.v.X(new u22.i(this.f423994d, this.f423995e, h0Var));
        return jz5.f0.f302826a;
    }
}
