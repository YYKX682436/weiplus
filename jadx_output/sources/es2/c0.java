package es2;

/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f256337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f256338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.util.LinkedList linkedList, es2.h0 h0Var) {
        super(0);
        this.f256337d = linkedList;
        this.f256338e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        es2.h0 h0Var = this.f256338e;
        java.util.Collection values = h0Var.f256371d.values();
        java.util.LinkedList linkedList = this.f256337d;
        linkedList.addAll(values);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            h0Var.a(((cs2.p) it.next()).f222092i2, true, "onClearAll");
        }
        java.util.LinkedList linkedList2 = h0Var.f256372e;
        linkedList.addAll(linkedList2);
        h0Var.f256371d.clear();
        linkedList2.clear();
        return jz5.f0.f302826a;
    }
}
