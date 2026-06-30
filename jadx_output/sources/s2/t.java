package s2;

/* loaded from: classes14.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f402252d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.util.List list) {
        super(1);
        this.f402252d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        java.util.List list = this.f402252d;
        int h17 = kz5.c0.h(list);
        if (h17 >= 0) {
            int i17 = 0;
            while (true) {
                s1.n1.e(layout, (s1.o1) list.get(i17), 0, 0, 0.0f, 4, null);
                if (i17 == h17) {
                    break;
                }
                i17++;
            }
        }
        return jz5.f0.f302826a;
    }
}
