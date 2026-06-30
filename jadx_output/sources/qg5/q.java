package qg5;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.r f363135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(qg5.r rVar) {
        super(0);
        this.f363135d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.util.List list = this.f363135d.f363152c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((c01.ob) obj).f37374b != null) {
                arrayList.add(obj);
            }
        }
        int d17 = kz5.b1.d(kz5.d0.q(arrayList, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            c01.nb nbVar = ((c01.ob) next).f37374b;
            if (nbVar == null || (str = nbVar.f37351a) == null) {
                str = "";
            }
            linkedHashMap.put(str, next);
        }
        return linkedHashMap;
    }
}
