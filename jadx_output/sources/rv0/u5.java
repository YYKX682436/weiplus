package rv0;

/* loaded from: classes5.dex */
public final class u5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(rv0.z6 z6Var) {
        super(2);
        this.f400278d = z6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        sv0.h data = (sv0.h) obj2;
        kotlin.jvm.internal.o.g(data, "data");
        rv0.z6 z6Var = this.f400278d;
        sv0.f fVar = z6Var.f400364t;
        fVar.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = fVar.f275970d;
        int i17 = 0;
        for (java.lang.Object obj3 : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sv0.h hVar = (sv0.h) obj3;
            if (hVar.f413226d) {
                linkedHashMap.put(java.lang.Integer.valueOf(i17), sv0.h.a(hVar, null, 0L, false, false, 7, null));
            }
            i17 = i18;
        }
        java.util.Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue2 = ((java.lang.Number) it.next()).intValue();
            sv0.h hVar2 = (sv0.h) linkedHashMap.get(java.lang.Integer.valueOf(intValue2));
            if (hVar2 != null) {
                arrayList.set(intValue2, hVar2);
                fVar.notifyItemChanged(intValue2);
            }
        }
        arrayList.set(intValue, sv0.h.a(data, null, 0L, false, true, 7, null));
        fVar.notifyItemChanged(intValue);
        z6Var.w7(data.f413223a);
        return jz5.f0.f302826a;
    }
}
