package n0;

/* loaded from: classes14.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.d3 f333473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(n0.d3 d3Var) {
        super(0);
        this.f333473d = d3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj = n0.e1.f333492a;
        java.util.HashMap hashMap = new java.util.HashMap();
        n0.d3 d3Var = this.f333473d;
        int size = d3Var.f333483a.size();
        for (int i17 = 0; i17 < size; i17++) {
            n0.l2 l2Var = (n0.l2) d3Var.f333483a.get(i17);
            java.lang.Object obj2 = l2Var.f333602b;
            int i18 = l2Var.f333601a;
            java.lang.Object k2Var = obj2 != null ? new n0.k2(java.lang.Integer.valueOf(i18), l2Var.f333602b) : java.lang.Integer.valueOf(i18);
            java.lang.Object obj3 = hashMap.get(k2Var);
            if (obj3 == null) {
                obj3 = new java.util.LinkedHashSet();
                hashMap.put(k2Var, obj3);
            }
            ((java.util.LinkedHashSet) obj3).add(l2Var);
        }
        return hashMap;
    }
}
