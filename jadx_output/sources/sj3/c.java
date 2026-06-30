package sj3;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.d f408445d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(sj3.d dVar) {
        super(1);
        this.f408445d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.HashSet hashSet;
        java.lang.String usrName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(usrName, "usrName");
        sj3.d dVar = this.f408445d;
        java.util.Iterator it = dVar.f408460e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            aj3.c cVar = (aj3.c) next;
            if (kotlin.jvm.internal.o.b(cVar != null ? cVar.f5307e : null, usrName)) {
                obj2 = next;
                break;
            }
        }
        aj3.c cVar2 = (aj3.c) obj2;
        if (cVar2 != null && (hashSet = dVar.f408464i) != null) {
            hashSet.add(cVar2.f5303a.f71612d);
        }
        return jz5.f0.f302826a;
    }
}
