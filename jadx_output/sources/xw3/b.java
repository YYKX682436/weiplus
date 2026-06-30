package xw3;

/* loaded from: classes.dex */
public final class b extends ym3.a {

    /* renamed from: g, reason: collision with root package name */
    public static final xw3.a f457727g = new xw3.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final r45.dp5 f457728d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f457729e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f457730f;

    public b(r45.dp5 initItem, boolean z17) {
        kotlin.jvm.internal.o.g(initItem, "initItem");
        this.f457728d = initItem;
        this.f457729e = z17;
        this.f457730f = new java.util.LinkedList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        u26.k0 k0Var = new u26.k0();
        ym3.d dVar = new ym3.d(request);
        dVar.f463149c.addAll(this.f457730f);
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    public final r45.dp5 d(java.lang.String key, r45.dp5 item) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(item, "item");
        if (kotlin.jvm.internal.o.b(item.getString(0), key)) {
            return item;
        }
        if (item.getInteger(2) != 1) {
            return null;
        }
        java.util.LinkedList<r45.dp5> list = item.getList(5);
        kotlin.jvm.internal.o.f(list, "getSubItemList(...)");
        for (r45.dp5 dp5Var : list) {
            kotlin.jvm.internal.o.d(dp5Var);
            r45.dp5 d17 = d(key, dp5Var);
            if (d17 != null) {
                return d17;
            }
        }
        return null;
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.LinkedList linkedList = this.f457730f;
        linkedList.clear();
        boolean z17 = this.f457729e;
        xw3.a aVar = f457727g;
        r45.dp5 dp5Var = this.f457728d;
        if (z17) {
            java.lang.String k17 = bm5.o1.f22719a.k(bm5.h0.RepairerConfig_Inner_TopKey_String, "");
            com.tencent.mars.xlog.Log.i("MicroMsg.Repairer.RepairerDataSource", "favKeyString: ".concat(k17));
            int i17 = 0;
            for (java.lang.Object obj : r26.n0.f0(k17, new java.lang.String[]{","}, false, 0, 6, null)) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.dp5 d17 = d((java.lang.String) obj, dp5Var);
                if (d17 != null) {
                    r45.ep5 ep5Var = (r45.ep5) d17.getCustom(12);
                    linkedList.add(new ex3.e(i17, 0, d17, aVar.a(d17, ep5Var != null && ep5Var.getInteger(0) == 1)));
                }
                i17 = i18;
            }
        }
        java.util.LinkedList list = dp5Var.getList(5);
        kotlin.jvm.internal.o.f(list, "getSubItemList(...)");
        int i19 = 0;
        for (java.lang.Object obj2 : list) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.dp5 dp5Var2 = (r45.dp5) obj2;
            kotlin.jvm.internal.o.d(dp5Var2);
            r45.ep5 ep5Var2 = (r45.ep5) dp5Var2.getCustom(12);
            linkedList.add(new ex3.e(i19, 1, dp5Var2, aVar.a(dp5Var2, ep5Var2 != null && ep5Var2.getInteger(0) == 1)));
            i19 = i27;
        }
    }
}
