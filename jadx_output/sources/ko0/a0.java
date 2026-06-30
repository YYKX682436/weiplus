package ko0;

/* loaded from: classes5.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f309818d;

    public a0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ko0.a0(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new ko0.a0((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Lc;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f309818d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(zy.u.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy.w p37 = zy.u.p3((zy.u) c17, null, 1, null);
            java.lang.String str = ko0.c0.f309832h;
            java.lang.String str2 = ko0.c0.f309833i;
            this.f309818d = 1;
            Lc = zy.w.Lc(p37, str, true, str2, 0, 0, null, null, this, 120, null);
            if (Lc == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            Lc = obj;
        }
        jz5.o oVar = (jz5.o) Lc;
        boolean booleanValue = ((java.lang.Boolean) oVar.f302841d).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (booleanValue) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#checkAndMakeToReady unzip dir=");
            java.lang.Object obj2 = oVar.f302843f;
            sb6.append((java.lang.String) obj2);
            com.tencent.mars.xlog.Log.i("LiveCore.LiveFilterUtil", sb6.toString());
            java.lang.String str3 = ((java.lang.String) obj2) + "/manifest.json";
            if (!com.tencent.mm.vfs.w6.j(str3)) {
                com.tencent.mars.xlog.Log.e("LiveCore.LiveFilterUtil", "#checkAndMakeToReady manifestFile not exist");
                try {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s((java.lang.String) obj2, false);
                    if (s17 != null) {
                        java.util.Iterator it = s17.iterator();
                        while (it.hasNext()) {
                            sb7.append(((com.tencent.mm.vfs.x1) it.next()).f213232b);
                            sb7.append(",");
                        }
                    }
                    pm0.z.b(xy2.b.f458155b, "vfs_clear_health_in_filter", false, null, null, false, false, new ko0.x(sb7), 60, null);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("LiveCore.LiveFilterUtil", e17.toString());
                }
                com.tencent.mm.vfs.w6.f((java.lang.String) obj2);
                return f0Var;
            }
            pm0.z.b(xy2.b.f458155b, "vfs_clear_health_in_filter", false, null, null, false, false, ko0.y.f309914d, 60, null);
            try {
                java.lang.String M = com.tencent.mm.vfs.w6.M(str3);
                if (M == null || M.length() == 0) {
                    return f0Var;
                }
                com.tencent.mars.xlog.Log.i("LiveCore.LiveFilterUtil", "#checkAndMakeToReady manifestFileText=" + M);
                org.json.JSONArray jSONArray = new org.json.JSONObject(M).getJSONArray("files");
                kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                c0Var.f310112d = true;
                kotlin.jvm.internal.o.d(jSONArray);
                c75.c.d(jSONArray, new ko0.z(oVar, c0Var));
                if (!c0Var.f310112d) {
                    com.tencent.mars.xlog.Log.e("LiveCore.LiveFilterUtil", "#checkAndMakeToReady something wrong. rm dir " + ((java.lang.String) obj2));
                    com.tencent.mm.vfs.w6.f((java.lang.String) obj2);
                    return f0Var;
                }
                ko0.c0 c0Var2 = ko0.c0.f309825a;
                ko0.c0.f309830f = new lo0.g0((java.lang.String) obj2);
                ko0.c0 c0Var3 = ko0.c0.f309825a;
                ko0.c0.f309829e = true;
                com.tencent.mars.xlog.Log.i("LiveCore.LiveFilterUtil", "#checkAndMakeToReady nice done!");
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("LiveCore.LiveFilterUtil", "#checkAndMakeToReady package parsing failed. " + e18);
            }
        }
        return f0Var;
    }
}
