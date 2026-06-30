package gd1;

/* loaded from: classes7.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f270516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.util.ArrayList arrayList) {
        super(1);
        this.f270516d = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        id1.d dVar = id1.d.f290462n;
        boolean b17 = kotlin.jvm.internal.o.b(it, dVar.f290469d);
        java.util.ArrayList arrayList = this.f270516d;
        if (b17) {
            arrayList.add(dVar);
        } else {
            id1.d dVar2 = id1.d.f290463o;
            if (kotlin.jvm.internal.o.b(it, dVar2.f290469d)) {
                arrayList.add(dVar2);
            } else {
                id1.d dVar3 = id1.d.f290465q;
                if (kotlin.jvm.internal.o.b(it, dVar3.f290469d)) {
                    arrayList.add(dVar3);
                } else {
                    id1.d dVar4 = id1.d.f290466r;
                    if (kotlin.jvm.internal.o.b(it, dVar4.f290469d)) {
                        arrayList.add(dVar4);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
