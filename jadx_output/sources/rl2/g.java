package rl2;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f397196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.LinkedList linkedList) {
        super(1);
        this.f397196d = linkedList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String id6 = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(id6, "id");
        this.f397196d.add(id6);
        return jz5.f0.f302826a;
    }
}
