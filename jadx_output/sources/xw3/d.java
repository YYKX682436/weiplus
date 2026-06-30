package xw3;

/* loaded from: classes.dex */
public final class d extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.dp5 f457734d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f457735e;

    public d(r45.dp5 initItem) {
        kotlin.jvm.internal.o.g(initItem, "initItem");
        this.f457734d = initItem;
        this.f457735e = new java.util.LinkedList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        ym3.d dVar = new ym3.d(request);
        dVar.f463149c.addAll(this.f457735e);
        v65.i.b(scope, null, new xw3.c(b17, dVar, null), 1, null);
        return kotlinx.coroutines.flow.l.a(b17);
    }

    @Override // ym3.f
    public void onCreate() {
        java.lang.String str;
        java.lang.String string;
        java.lang.String obj;
        java.util.LinkedList linkedList = this.f457735e;
        linkedList.clear();
        r45.dp5 repairerItem = this.f457734d;
        kotlin.jvm.internal.o.g(repairerItem, "repairerItem");
        q55.e eVar = (q55.e) ix3.y0.f295612e.get(repairerItem.getString(0));
        java.lang.String str2 = "X实验为主";
        if (eVar != null && bm5.o1.f22719a.m(eVar) != 0) {
            str2 = "维修厂为主";
        }
        linkedList.add(new ex3.e(1, 2, repairerItem, str2));
        kotlin.jvm.internal.o.g(repairerItem, "repairerItem");
        str = "";
        if (repairerItem.getInteger(2) == 3 && (string = repairerItem.getString(0)) != null) {
            java.lang.String str3 = (java.lang.String) r26.n0.f0(string, new java.lang.String[]{"_"}, false, 0, 6, null).get(r3.size() - 1);
            switch (str3.hashCode()) {
                case -1808118735:
                    if (str3.equals("String")) {
                        bm5.o1 o1Var = bm5.o1.f22719a;
                        java.lang.String string2 = repairerItem.getString(0);
                        if (string2 == null) {
                            string2 = "";
                        }
                        java.lang.String string3 = repairerItem.getString(8);
                        obj = o1Var.c(string2, string3 != null ? string3 : "").toString();
                        str = obj;
                        break;
                    }
                    break;
                case 73679:
                    if (str3.equals("Int")) {
                        int P = com.tencent.mm.sdk.platformtools.t8.P(repairerItem.getString(8), 0);
                        bm5.o1 o1Var2 = bm5.o1.f22719a;
                        java.lang.String string4 = repairerItem.getString(0);
                        obj = o1Var2.c(string4 != null ? string4 : "", java.lang.Integer.valueOf(P)).toString();
                        str = obj;
                        break;
                    }
                    break;
                case 2374300:
                    if (str3.equals("Long")) {
                        long V = com.tencent.mm.sdk.platformtools.t8.V(repairerItem.getString(8), 0L);
                        bm5.o1 o1Var3 = bm5.o1.f22719a;
                        java.lang.String string5 = repairerItem.getString(0);
                        obj = o1Var3.c(string5 != null ? string5 : "", java.lang.Long.valueOf(V)).toString();
                        str = obj;
                        break;
                    }
                    break;
                case 67973692:
                    if (str3.equals("Float")) {
                        float L = com.tencent.mm.sdk.platformtools.t8.L(repairerItem.getString(8), 0.0f);
                        bm5.o1 o1Var4 = bm5.o1.f22719a;
                        java.lang.String string6 = repairerItem.getString(0);
                        obj = o1Var4.c(string6 != null ? string6 : "", java.lang.Float.valueOf(L)).toString();
                        str = obj;
                        break;
                    }
                    break;
            }
        }
        linkedList.add(new ex3.e(0, 3, repairerItem, str));
    }
}
