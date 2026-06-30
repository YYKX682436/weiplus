package y;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f458330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.List list) {
        super(1);
        this.f458330d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        java.util.List list = this.f458330d;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            s1.n1.b(layout, (s1.o1) list.get(i17), 0, 0, 0.0f, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
