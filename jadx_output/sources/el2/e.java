package el2;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f253779e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(el2.i0 i0Var, android.content.Context context) {
        super(1);
        this.f253778d = i0Var;
        this.f253779e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        long longValue = ((java.lang.Number) obj).longValue();
        el2.i0 i0Var = this.f253778d;
        java.util.LinkedList linkedList = i0Var.Q.f22362e;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                boolean z17 = false;
                if (((r45.z42) obj2).getLong(0) == longValue) {
                    z17 = true;
                }
                if (z17) {
                    break;
                }
            }
            r45.z42 z42Var = (r45.z42) obj2;
            if (z42Var != null) {
                wt2.a aVar = i0Var.I;
                if (aVar == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                aVar.O1(z42Var, new el2.d(this.f253779e, i0Var));
            }
        }
        return jz5.f0.f302826a;
    }
}
