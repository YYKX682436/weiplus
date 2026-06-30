package sc3;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406432d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(sc3.k1 k1Var) {
        super(0);
        this.f406432d = k1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sc3.k1 k1Var = this.f406432d;
        jc3.n nVar = k1Var.f406483o;
        if (nVar == null) {
            kotlin.jvm.internal.o.o("mbAdaptor");
            throw null;
        }
        java.util.Collection y17 = nVar.y();
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = k1Var.f406482n;
        if (mBBuildConfig == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : mBBuildConfig.f147817d) {
            if (!((java.lang.Boolean) ((jz5.l) obj).f302834e).booleanValue()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((java.lang.String) ((jz5.l) it.next()).f302833d);
        }
        java.util.List t07 = kz5.n0.t0(y17, arrayList2);
        java.util.Map map = k1Var.M;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
            if (!((lc3.c0) entry.getValue()).g()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it6 = linkedHashMap.entrySet().iterator();
        while (it6.hasNext()) {
            arrayList3.add((java.lang.String) ((java.util.Map.Entry) it6.next()).getKey());
        }
        return (java.lang.String[]) ((java.util.ArrayList) kz5.n0.t0(t07, arrayList3)).toArray(new java.lang.String[0]);
    }
}
