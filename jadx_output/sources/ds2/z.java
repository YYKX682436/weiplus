package ds2;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f242913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f242914e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.util.LinkedList linkedList, ds2.b0 b0Var) {
        super(0);
        this.f242913d = linkedList;
        this.f242914e = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ds2.b0 b0Var = this.f242914e;
        java.util.Collection values = b0Var.f242855c.values();
        java.util.LinkedList linkedList = this.f242913d;
        linkedList.addAll(values);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            b0Var.a(((cs2.p) it.next()).f222092i2, true, "onClearAll");
        }
        java.util.LinkedList linkedList2 = b0Var.f242856d;
        linkedList.addAll(linkedList2);
        b0Var.f242855c.clear();
        linkedList2.clear();
        return jz5.f0.f302826a;
    }
}
