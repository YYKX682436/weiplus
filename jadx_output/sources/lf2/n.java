package lf2;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final lf2.n f318298d = new lf2.n();

    public n() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = om2.n.f346359a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new lf2.b((om2.m) it.next(), false));
        }
        linkedList.addAll(arrayList2);
        return linkedList;
    }
}
