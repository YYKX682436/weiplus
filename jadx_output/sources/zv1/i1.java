package zv1;

/* loaded from: classes10.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final zv1.i1 f476306a = new zv1.i1();

    public final int a(java.lang.String leftPath, java.lang.String rightPath) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(leftPath, "leftPath");
        kotlin.jvm.internal.o.g(rightPath, "rightPath");
        java.lang.String a17 = com.tencent.mm.vfs.e8.a(leftPath);
        kotlin.jvm.internal.o.f(a17, "canonicalizePath(...)");
        java.lang.String a18 = com.tencent.mm.vfs.e8.a(rightPath);
        kotlin.jvm.internal.o.f(a18, "canonicalizePath(...)");
        if (kotlin.jvm.internal.o.b(a17, a18)) {
            return 1;
        }
        java.lang.String separator = java.io.File.separator;
        kotlin.jvm.internal.o.f(separator, "separator");
        if (r26.i0.n(a17, separator, false)) {
            str = a17;
        } else {
            str = a17 + separator;
        }
        kotlin.jvm.internal.o.f(separator, "separator");
        if (r26.i0.n(a18, separator, false)) {
            str2 = a18;
        } else {
            str2 = a18 + separator;
        }
        if (r26.i0.y(a17, str2, false)) {
            return 2;
        }
        return r26.i0.y(a18, str, false) ? 3 : 0;
    }

    public final java.util.List b(com.tencent.mm.plugin.clean.cache.CacheClassifyType cacheType) {
        kotlin.jvm.internal.o.g(cacheType, "cacheType");
        int[] iArr = zv1.n.f476321a;
        int i17 = iArr[cacheType.ordinal()];
        java.util.List list = kz5.p0.f313996d;
        int i18 = 16;
        int i19 = 10;
        int i27 = 4;
        switch (i17) {
            case 11:
                list = kz5.c0.i(10, 11);
                break;
            case 12:
                list = kz5.c0.i(2, 3, 16, 0);
                break;
            case 13:
                list = kz5.b0.c(2);
                break;
            case 14:
                list = kz5.b0.c(3);
                break;
            case 15:
            case 16:
                break;
            default:
                switch (iArr[cacheType.ordinal()]) {
                    case 1:
                        break;
                    case 2:
                        i27 = 5;
                        break;
                    case 3:
                        i27 = 6;
                        break;
                    case 4:
                        i27 = 7;
                        break;
                    case 5:
                        i27 = 8;
                        break;
                    case 6:
                        i27 = 9;
                        break;
                    case 7:
                        i27 = 15;
                        break;
                    case 8:
                        i27 = 18;
                        break;
                    case 9:
                        i27 = 17;
                        break;
                    case 10:
                        i27 = 19;
                        break;
                    default:
                        i27 = 0;
                        break;
                }
                list = kz5.b0.c(java.lang.Integer.valueOf(i27));
                break;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            com.tencent.mm.vfs.b2 b2Var = com.tencent.mm.vfs.b2.f212807a;
            zv1.h1 h1Var = new zv1.h1(intValue);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Map e17 = com.tencent.mm.vfs.a3.f212781a.e();
            java.util.Collection collection = om5.u9.f346675a;
            int d17 = kz5.b1.d(kz5.d0.q(collection, i19));
            if (d17 < i18) {
                d17 = i18;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
            for (java.lang.Object obj : collection) {
                linkedHashMap.put(((com.tencent.mm.vfs.c6) obj).f212873a, obj);
            }
            java.util.List b17 = com.tencent.mm.vfs.q7.b(true);
            java.util.Map h17 = b2Var.h(b17);
            q26.n u17 = kz5.e1.u(com.tencent.mm.vfs.b2.f212809c);
            java.util.Map map = com.tencent.mm.vfs.b2.f212808b;
            com.tencent.mm.vfs.b2.e(intValue, e17, h1Var, arrayList2, linkedHashMap, q26.h0.u(u17, kz5.e1.u(map)), h17);
            java.lang.String str = "account";
            java.lang.Object obj2 = ((java.util.HashMap) h17).get("account");
            java.util.HashMap hashMap = new java.util.HashMap(h17);
            java.util.Iterator it6 = ((java.util.ArrayList) b17).iterator();
            while (it6.hasNext()) {
                android.util.Pair pair = (android.util.Pair) it6.next();
                if (!kotlin.jvm.internal.o.b(pair.first, obj2) && !kotlin.jvm.internal.o.b(pair.first, "ee1da3ae2100e09165c2e52382cfe79f")) {
                    hashMap.put(str, pair.first);
                    hashMap.put("accountSalt", pair.second);
                    hashMap.put("accountSd", kotlin.jvm.internal.o.b(pair.first, pair.second) ? new java.lang.String[]{pair.first} : new java.lang.String[]{pair.first, pair.second});
                    java.util.HashMap hashMap2 = hashMap;
                    com.tencent.mm.vfs.b2.e(intValue, e17, h1Var, arrayList2, linkedHashMap, kz5.e1.u(map), hashMap2);
                    hashMap = hashMap2;
                    obj2 = obj2;
                    str = str;
                }
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                java.lang.Object next = it7.next();
                if (hashSet.add((java.lang.String) ((jz5.l) next).f302833d)) {
                    arrayList3.add(next);
                }
            }
            arrayList.addAll(arrayList3);
            i18 = 16;
            i19 = 10;
        }
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList) {
            if (hashSet2.add((java.lang.String) ((jz5.l) obj3).f302833d)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }
}
