package u22;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u22.r f424003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f424004e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u22.r rVar, java.util.List list) {
        super(0);
        this.f424003d = rVar;
        this.f424004e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        u22.r rVar = this.f424003d;
        boolean z17 = rVar.f424019g;
        java.util.LinkedList linkedList = rVar.f424027o;
        java.util.LinkedList linkedList2 = rVar.f424024l;
        java.util.List list = this.f424004e;
        if (z17) {
            rVar.f424019g = false;
            linkedList.clear();
            linkedList2.clear();
            if (list.isEmpty()) {
                v85.e.f434103a.c(linkedList2);
                rVar.d();
                return jz5.f0.f302826a;
            }
        }
        int min = java.lang.Math.min(t22.o.f415104e - linkedList2.size(), list.size());
        if (min > 0) {
            linkedList2.addAll(list.subList(0, min));
            v85.e.f434103a.c(linkedList2);
            rVar.f424020h = min < list.size();
            rVar.d();
            if (min < list.size()) {
                linkedList.addAll(list.subList(min, list.size()));
                rVar.c();
            }
        } else {
            if (!rVar.f424020h) {
                rVar.f424020h = true;
                rVar.d();
            }
            linkedList.addAll(list);
            rVar.c();
        }
        return jz5.f0.f302826a;
    }
}
