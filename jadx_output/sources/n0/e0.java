package n0;

/* loaded from: classes14.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f333490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f333491e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(kotlin.jvm.internal.f0 f0Var, java.util.List list) {
        super(3);
        this.f333490d = f0Var;
        this.f333491e = list;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.e applier = (n0.e) obj;
        n0.o4 slots = (n0.o4) obj2;
        n0.d4 rememberManager = (n0.d4) obj3;
        kotlin.jvm.internal.o.g(applier, "applier");
        kotlin.jvm.internal.o.g(slots, "slots");
        kotlin.jvm.internal.o.g(rememberManager, "rememberManager");
        int i17 = this.f333490d.f310116d;
        if (i17 > 0) {
            applier = new n0.x2(applier, i17);
        }
        java.util.List list = this.f333491e;
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            ((yz5.q) list.get(i18)).invoke(applier, slots, rememberManager);
        }
        return jz5.f0.f302826a;
    }
}
