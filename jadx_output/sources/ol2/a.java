package ol2;

/* loaded from: classes3.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final ol2.b a(r45.o92 o92Var) {
        java.util.LinkedList list;
        java.lang.String str;
        ol2.b bVar = new ol2.b();
        boolean z17 = false;
        if (o92Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList list2 = o92Var.getList(0);
            kotlin.jvm.internal.o.f(list2, "getWording_list(...)");
            int i17 = 0;
            for (java.lang.Object obj : list2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                ol2.c cVar = new ol2.c();
                cVar.f346145a = (java.lang.String) obj;
                java.util.LinkedList list3 = o92Var.getList(3);
                kotlin.jvm.internal.o.f(list3, "getWording_type_list(...)");
                java.lang.Integer num = (java.lang.Integer) kz5.n0.a0(list3, i17);
                cVar.f346146b = 1;
                if (num != null && num.intValue() > 0) {
                    cVar.f346146b = java.lang.Integer.valueOf(num.intValue());
                }
                java.util.LinkedList list4 = o92Var.getList(4);
                if (list4 != null && (str = (java.lang.String) kz5.n0.a0(list4, i17)) != null) {
                    cVar.f346147c = str;
                }
                arrayList.add(cVar);
                i17 = i18;
            }
            bVar.f346143a = arrayList;
            o92Var.getInteger(1);
            o92Var.getString(2);
        }
        if (o92Var != null && (list = o92Var.getList(3)) != null && list.contains(4)) {
            z17 = true;
        }
        if (z17) {
            bVar.f346144b = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f493701op5);
        }
        return bVar;
    }
}
