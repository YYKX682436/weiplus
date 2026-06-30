package oc2;

/* loaded from: classes8.dex */
public final class o implements oc2.l {

    /* renamed from: a, reason: collision with root package name */
    public r45.cp5 f344236a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f344237b = new java.util.LinkedList();

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isolateNode=");
        r45.cp5 cp5Var = this.f344236a;
        java.util.ArrayList arrayList = null;
        sb6.append(cp5Var != null ? cp5Var.toJSON() : null);
        sb6.append(";containerNodes=");
        java.util.LinkedList linkedList = this.f344237b;
        if (linkedList != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.cp5) it.next()).toJSON());
            }
        }
        sb6.append(arrayList);
        return sb6.toString();
    }
}
