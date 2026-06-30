package x0;

/* loaded from: classes14.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.r0 f450918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(x0.r0 r0Var) {
        super(0);
        this.f450918d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        o0.i iVar = this.f450918d.f450935d;
        int i17 = iVar.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = iVar.f341850d;
            int i18 = 0;
            do {
                x0.n0 n0Var = (x0.n0) objArr[i18];
                java.util.HashSet hashSet = n0Var.f450915c;
                if (!hashSet.isEmpty()) {
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        n0Var.f450913a.invoke(it.next());
                    }
                    hashSet.clear();
                }
                i18++;
            } while (i18 < i17);
        }
        return jz5.f0.f302826a;
    }
}
