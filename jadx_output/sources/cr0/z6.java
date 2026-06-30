package cr0;

@j95.b
/* loaded from: classes12.dex */
public final class z6 extends i95.w implements ob0.p3 {

    /* renamed from: d */
    public static final cr0.f5 f221824d = new cr0.f5(null);

    /* renamed from: e */
    public static final jz5.g f221825e;

    /* renamed from: f */
    public static android.os.Handler f221826f;

    /* renamed from: g */
    public static boolean f221827g;

    /* renamed from: h */
    public static boolean f221828h;

    /* renamed from: i */
    public static final int f221829i;

    /* renamed from: m */
    public static final jz5.g f221830m;

    /* renamed from: n */
    public static boolean[] f221831n;

    static {
        jz5.h.b(cr0.d5.f221615d);
        f221825e = jz5.h.b(cr0.e5.f221622d);
        f221829i = 19;
        f221830m = jz5.h.b(cr0.c5.f221603d);
    }

    public static final /* synthetic */ boolean[] Ai() {
        return f221831n;
    }

    public static final /* synthetic */ int Bi() {
        return f221829i;
    }

    public static final /* synthetic */ android.os.Handler wi() {
        return f221826f;
    }

    public void Di(java.util.List originTidSchedAffinityHolder) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(originTidSchedAffinityHolder, "originTidSchedAffinityHolder");
        boolean z17 = (f221826f != null) && f221828h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restoreAffinity: ");
        sb6.append(z17);
        sb6.append(", tidList=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(originTidSchedAffinityHolder, 10));
        java.util.Iterator it = originTidSchedAffinityHolder.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.o) it.next()).f302841d).intValue()));
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.ThreadSchedFeatureService", sb6.toString());
        if (z17) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it6 = originTidSchedAffinityHolder.iterator();
            while (it6.hasNext()) {
                jz5.o oVar = (jz5.o) it6.next();
                int intValue = ((java.lang.Number) oVar.f302841d).intValue();
                boolean[] zArr = (boolean[]) oVar.f302842e;
                boolean[] zArr2 = (boolean[]) oVar.f302843f;
                try {
                    boolean[] b17 = com.tencent.matrix.hook.junwind.PthreadHackJni.b(intValue);
                    if (zh.c.a(b17)) {
                        if (java.util.Arrays.equals(b17, zArr2)) {
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(java.util.Arrays.equals(b17, zArr) ? 0 : com.tencent.matrix.hook.junwind.PthreadHackJni.f(intValue, zArr));
                            java.lang.Object obj2 = linkedHashMap.get(valueOf);
                            if (obj2 == null) {
                                obj2 = new java.util.ArrayList();
                                linkedHashMap.put(valueOf, obj2);
                            }
                            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intValue);
                            kotlin.jvm.internal.o.d(b17);
                            ((java.util.List) obj2).add(new jz5.o(valueOf2, b17, zArr));
                        } else {
                            java.lang.Object obj3 = linkedHashMap.get(-114514);
                            if (obj3 == null) {
                                obj3 = new java.util.ArrayList();
                                linkedHashMap.put(-114514, obj3);
                            }
                            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(intValue);
                            kotlin.jvm.internal.o.d(b17);
                            ((java.util.List) obj3).add(new jz5.o(valueOf3, b17, zArr));
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            java.util.List<java.util.Map.Entry> F0 = kz5.n0.F0(linkedHashMap.entrySet(), new cr0.s6());
            int d17 = kz5.b1.d(kz5.d0.q(F0, 10));
            if (d17 < 16) {
                d17 = 16;
            }
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(d17);
            for (java.util.Map.Entry entry : F0) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                int intValue2 = ((java.lang.Number) entry2.getKey()).intValue();
                java.util.List list = (java.util.List) entry2.getValue();
                if (intValue2 == -114514) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ThreadSchedFeatureService", "RESTORE affinity_skip: " + list.size());
                    java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                    for (java.lang.Object obj4 : list) {
                        jz5.o oVar2 = (jz5.o) obj4;
                        int intValue3 = ((java.lang.Number) oVar2.f302841d).intValue();
                        java.lang.String b18 = zh.c.b((boolean[]) oVar2.f302843f);
                        java.util.Iterator it7 = cr0.p6.f221711b.d().iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                obj = it7.next();
                                if (((java.lang.Number) ((jz5.o) obj).f302841d).intValue() == intValue3) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        jz5.o oVar3 = (jz5.o) obj;
                        java.lang.String str = b18 + ">>" + zh.c.b(oVar3 != null ? (boolean[]) oVar3.f302843f : null) + ">>" + zh.c.b((boolean[]) oVar2.f302842e);
                        java.lang.Object obj5 = linkedHashMap3.get(str);
                        if (obj5 == null) {
                            obj5 = new java.util.ArrayList();
                            linkedHashMap3.put(str, obj5);
                        }
                        ((java.util.List) obj5).add(obj4);
                    }
                    java.util.List<java.util.Map.Entry> F02 = kz5.n0.F0(linkedHashMap3.entrySet(), new cr0.v6());
                    int d18 = kz5.b1.d(kz5.d0.q(F02, 10));
                    if (d18 < 16) {
                        d18 = 16;
                    }
                    java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap(d18);
                    for (java.util.Map.Entry entry3 : F02) {
                        linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                    }
                    for (java.util.Map.Entry entry4 : linkedHashMap4.entrySet()) {
                        java.lang.String str2 = (java.lang.String) entry4.getKey();
                        java.util.List list2 = (java.util.List) entry4.getValue();
                        com.tencent.mars.xlog.Log.i("MicroMsg.ThreadSchedFeatureService", " - " + str2 + ": " + list2.size() + ", tids=" + kz5.n0.g0(list2, ",", null, null, 0, null, cr0.t6.f221756d, 30, null));
                    }
                } else if (intValue2 != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ThreadSchedFeatureService", "RESTORE affinity_fail: " + list.size());
                    com.tencent.mars.xlog.Log.i("MicroMsg.ThreadSchedFeatureService", " - " + intValue2 + ": tids=" + kz5.n0.g0(list, ",", null, null, 0, null, cr0.u6.f221775d, 30, null));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ThreadSchedFeatureService", "RESTORE affinity_succ: " + list.size());
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" - ");
                    sb7.append(intValue2);
                    sb7.append(": tids=");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
                    java.util.Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.o) it8.next()).f302841d).intValue()));
                    }
                    sb7.append(kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
                    com.tencent.mars.xlog.Log.i("MicroMsg.ThreadSchedFeatureService", sb7.toString());
                }
            }
        }
    }

    public ob0.o3 Ni(java.util.List tidList) {
        kotlin.jvm.internal.o.g(tidList, "tidList");
        boolean z17 = false;
        if ((f221826f != null) && f221828h) {
            z17 = true;
        }
        boolean[] zArr = f221831n;
        com.tencent.mars.xlog.Log.i("MicroMsg.ThreadSchedFeatureService", "schedLowEnergyAffinity: " + z17 + ", tidList=" + tidList + ", targetCpuSet=" + zArr);
        ob0.o3 o3Var = new ob0.o3();
        if (zArr != null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            if (z17 && zh.c.a(zArr)) {
                java.util.Iterator it = tidList.iterator();
                while (it.hasNext()) {
                    int intValue = ((java.lang.Number) it.next()).intValue();
                    try {
                        boolean[] b17 = com.tencent.matrix.hook.junwind.PthreadHackJni.b(intValue);
                        if (zh.c.a(b17)) {
                            if (java.util.Arrays.equals(zArr, b17)) {
                                boolean[] e17 = zh.c.e();
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append("cpuSet conflict: curr=");
                                java.lang.String arrays = java.util.Arrays.toString(b17);
                                kotlin.jvm.internal.o.f(arrays, "toString(...)");
                                sb6.append(arrays);
                                sb6.append(", reNice=");
                                java.lang.String arrays2 = java.util.Arrays.toString(e17);
                                kotlin.jvm.internal.o.f(arrays2, "toString(...)");
                                sb6.append(arrays2);
                                com.tencent.mars.xlog.Log.w("MicroMsg.ThreadSchedFeatureService", sb6.toString());
                                if (zh.c.a(e17)) {
                                    kotlin.jvm.internal.o.d(e17);
                                    if (!java.util.Arrays.equals(e17, b17)) {
                                        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.matrix.hook.junwind.PthreadHackJni.f(intValue, e17));
                                        java.lang.Object obj = linkedHashMap.get(valueOf);
                                        if (obj == null) {
                                            obj = new java.util.ArrayList();
                                            linkedHashMap.put(valueOf, obj);
                                        }
                                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intValue);
                                        kotlin.jvm.internal.o.d(b17);
                                        ((java.util.List) obj).add(new jz5.o(valueOf2, b17, e17));
                                    }
                                }
                            } else {
                                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.tencent.matrix.hook.junwind.PthreadHackJni.f(intValue, zArr));
                                java.lang.Object obj2 = linkedHashMap.get(valueOf3);
                                if (obj2 == null) {
                                    obj2 = new java.util.ArrayList();
                                    linkedHashMap.put(valueOf3, obj2);
                                }
                                java.lang.Integer valueOf4 = java.lang.Integer.valueOf(intValue);
                                kotlin.jvm.internal.o.d(b17);
                                ((java.util.List) obj2).add(new jz5.o(valueOf4, b17, zArr));
                            }
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            java.util.List<java.util.Map.Entry> F0 = kz5.n0.F0(linkedHashMap.entrySet(), new cr0.x6());
            int d17 = kz5.b1.d(kz5.d0.q(F0, 10));
            if (d17 < 16) {
                d17 = 16;
            }
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(d17);
            for (java.util.Map.Entry entry : F0) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                int intValue2 = ((java.lang.Number) entry2.getKey()).intValue();
                java.util.List list = (java.util.List) entry2.getValue();
                if (intValue2 == 0) {
                    java.util.List F02 = kz5.n0.F0(list, new cr0.y6());
                    synchronized (o3Var) {
                        java.util.List b18 = o3Var.b();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj3 : F02) {
                            if (!o3Var.b().contains((jz5.o) obj3)) {
                                arrayList.add(obj3);
                            }
                        }
                        b18.addAll(arrayList);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ThreadSchedFeatureService", "REDUCE affinity_succ: " + list.size());
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" - ");
                    sb7.append(intValue2);
                    sb7.append(": tids=");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
                    java.util.Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.o) it6.next()).f302841d).intValue()));
                    }
                    sb7.append(kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
                    com.tencent.mars.xlog.Log.i("MicroMsg.ThreadSchedFeatureService", sb7.toString());
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ThreadSchedFeatureService", "REDUCE affinity_fail: " + list.size());
                    com.tencent.mars.xlog.Log.i("MicroMsg.ThreadSchedFeatureService", " - " + intValue2 + ": tids=" + kz5.n0.g0(list, ",", null, null, 0, null, cr0.w6.f221806d, 30, null));
                }
            }
        }
        return o3Var;
    }
}
