package uw0;

/* loaded from: classes5.dex */
public final class u implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.x f431612d;

    public u(uw0.x xVar) {
        this.f431612d = xVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        sw0.a data = (sw0.a) obj2;
        kotlin.jvm.internal.o.g(data, "data");
        uw0.x xVar = this.f431612d;
        xVar.getClass();
        r45.ol5 titleInfo = data.f413412a;
        kotlin.jvm.internal.o.g(titleInfo, "titleInfo");
        sw0.a aVar = new sw0.a(titleInfo, true);
        pw0.b bVar = xVar.E1;
        bVar.getClass();
        java.util.ArrayList arrayList = bVar.f275970d;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((sw0.a) it.next()).f413413b) {
                break;
            }
            i17++;
        }
        if (i17 >= 0) {
            java.lang.Object obj3 = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            r45.ol5 titleInfo2 = ((sw0.a) obj3).f413412a;
            kotlin.jvm.internal.o.g(titleInfo2, "titleInfo");
            bVar.x(i17, new sw0.a(titleInfo2, false));
        }
        bVar.x(intValue, aVar);
        uw0.p pVar = xVar.C1;
        if (pVar != null) {
            uw0.t0 t0Var = (uw0.t0) pVar;
            java.lang.String string = aVar.f413412a.getString(0);
            if (string != null) {
                t0Var.q7(string);
            }
        }
        return jz5.f0.f302826a;
    }
}
