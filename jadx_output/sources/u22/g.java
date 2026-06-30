package u22;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u22.k f423988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f423989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u22.k kVar, java.util.List list) {
        super(0);
        this.f423988d = kVar;
        this.f423989e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        u22.k kVar = this.f423988d;
        java.util.LinkedList linkedList = kVar.f423999d;
        java.util.List newList = this.f423989e;
        synchronized (linkedList) {
            java.util.LinkedList oldList = kVar.f423999d;
            kotlin.jvm.internal.o.g(oldList, "oldList");
            kotlin.jvm.internal.o.g(newList, "newList");
            h0Var.f310123d = androidx.recyclerview.widget.h0.a(new t85.c(oldList, newList), false);
            kVar.f423999d.clear();
            kVar.f423999d.addAll(newList);
        }
        pm0.v.X(new u22.f(this.f423988d, this.f423989e, h0Var));
        return jz5.f0.f302826a;
    }
}
