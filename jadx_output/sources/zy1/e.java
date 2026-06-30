package zy1;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final zy1.e f477325a = new zy1.e();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseArray f477326b = new android.util.SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f477327c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final android.util.SparseArray f477328d = new android.util.SparseArray();

    public final jx3.a a(int i17, boolean z17) {
        jx3.a aVar;
        android.util.SparseArray sparseArray = f477326b;
        jx3.a aVar2 = (jx3.a) sparseArray.get(i17);
        if (!z17 || aVar2 != null) {
            return aVar2;
        }
        try {
            aVar = (jx3.a) java.lang.Class.forName("com.tencent.mm.autogen.mmdata.rpt.Struct" + i17).newInstance();
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.KVReportManager", "getInstance " + i17 + " error");
            aVar = null;
        }
        jx3.a aVar3 = aVar;
        sparseArray.put(i17, aVar3);
        return aVar3;
    }

    public final void b(int i17, java.lang.String key, int i18) {
        kotlin.jvm.internal.o.g(key, "key");
        jx3.a a17 = a(i17, true);
        if (a17 == null) {
            return;
        }
        java.lang.Object f17 = a17.f(key);
        kotlin.jvm.internal.o.e(f17, "null cannot be cast to non-null type kotlin.Int");
        a17.j(key, java.lang.Integer.valueOf(((java.lang.Integer) f17).intValue() + i18));
    }

    public final void c(int i17, java.lang.String key) {
        long longValue;
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.Long l17 = (java.lang.Long) f477327c.remove(i17 + '-' + key);
        if (l17 == null) {
            l17 = -1L;
        }
        long longValue2 = l17.longValue();
        if (longValue2 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.KVReportManager", "report:" + i17 + " key:" + key + " error!");
            return;
        }
        jx3.a a17 = a(i17, true);
        if (a17 == null) {
            return;
        }
        java.lang.Object f17 = a17.f(key);
        if (f17 instanceof java.lang.Integer) {
            longValue = ((java.lang.Number) f17).intValue();
        } else {
            kotlin.jvm.internal.o.e(f17, "null cannot be cast to non-null type kotlin.Long");
            longValue = ((java.lang.Long) f17).longValue();
        }
        a17.j(key, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - longValue2) + longValue));
    }

    public final void d(int i17, java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.util.HashMap hashMap = f477327c;
        if (hashMap.containsKey(i17 + '-' + key)) {
            return;
        }
        hashMap.put(i17 + '-' + key, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void e(int i17, java.lang.String key, java.lang.Object unique) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(unique, "unique");
        android.util.SparseArray sparseArray = f477328d;
        if (sparseArray.get(i17) == null) {
            sparseArray.put(i17, new java.util.HashSet());
        }
        java.util.HashSet hashSet = (java.util.HashSet) sparseArray.get(i17);
        if (hashSet == null) {
            return;
        }
        java.util.Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((zy1.h) obj).f477332a, key)) {
                    break;
                }
            }
        }
        zy1.h hVar = (zy1.h) obj;
        if (hVar == null) {
            hVar = new zy1.h(key, null, 2, null);
            hashSet.add(hVar);
        }
        hVar.f477333b.add(unique.toString());
        unique.toString();
        hVar.f477333b.size();
    }
}
