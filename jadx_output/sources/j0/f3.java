package j0;

/* loaded from: classes14.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f296287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(java.util.List list) {
        super(1);
        this.f296287d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        java.util.List list = this.f296287d;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            jz5.l lVar = (jz5.l) list.get(i17);
            s1.n1.d(layout, (s1.o1) lVar.f302833d, ((p2.m) lVar.f302834e).f351390a, 0.0f, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
