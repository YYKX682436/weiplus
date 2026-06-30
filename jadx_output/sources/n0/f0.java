package n0;

/* loaded from: classes14.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f333504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f333505e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(kotlin.jvm.internal.f0 f0Var, java.util.List list) {
        super(3);
        this.f333504d = f0Var;
        this.f333505e = list;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.e applier = (n0.e) obj;
        kotlin.jvm.internal.o.g(applier, "applier");
        kotlin.jvm.internal.o.g((n0.o4) obj2, "<anonymous parameter 1>");
        kotlin.jvm.internal.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        int i17 = this.f333504d.f310116d;
        java.util.List list = this.f333505e;
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            java.lang.Object obj4 = list.get(i18);
            int i19 = i17 + i18;
            applier.g(i19, obj4);
            applier.f(i19, obj4);
        }
        return jz5.f0.f302826a;
    }
}
