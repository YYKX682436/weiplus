package ko0;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f309861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309863f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f309862e = str;
        this.f309863f = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ko0.i(this.f309862e, this.f309863f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ko0.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        java.lang.Object Lc;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f309861d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(zy.u.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy.w p37 = zy.u.p3((zy.u) c17, null, 1, null);
            java.lang.String str = this.f309862e;
            java.lang.String str2 = this.f309863f;
            this.f309861d = 1;
            z17 = true;
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
            z17 = true;
        }
        jz5.o oVar = (jz5.o) Lc;
        boolean booleanValue = ((java.lang.Boolean) oVar.f302841d).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (booleanValue) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#checkAndMakeToReady unzip dir=");
            java.lang.Object obj2 = oVar.f302843f;
            sb6.append((java.lang.String) obj2);
            com.tencent.mars.xlog.Log.i("LiveBeautyUtil", sb6.toString());
            java.lang.String str3 = ((java.lang.String) obj2) + "/manifest.json";
            if (!com.tencent.mm.vfs.w6.j(str3)) {
                com.tencent.mars.xlog.Log.e("LiveBeautyUtil", "#checkAndMakeToReady manifestFile not exist");
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
                    pm0.z.b(xy2.b.f458155b, "vfs_clear_health_in_beauty", false, null, null, false, false, new ko0.f(sb7), 60, null);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("LiveBeautyUtil", e17.toString());
                }
                com.tencent.mm.vfs.w6.f((java.lang.String) obj2);
                return f0Var;
            }
            pm0.z.b(xy2.b.f458155b, "vfs_clear_health_in_beauty", false, null, null, false, false, ko0.g.f309853d, 60, null);
            try {
                java.lang.String M = com.tencent.mm.vfs.w6.M(str3);
                kotlin.jvm.internal.o.d(M);
                com.tencent.mars.xlog.Log.i("LiveBeautyUtil", "#checkAndMakeToReady manifestFileText=".concat(r26.i0.t(r26.i0.t(M, "\n", "", false), " ", "", false)));
                if (M.length() == 0 ? z17 : false) {
                    return f0Var;
                }
                org.json.JSONArray jSONArray = new org.json.JSONObject(M).getJSONArray("files");
                kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                c0Var.f310112d = z17;
                kotlin.jvm.internal.o.d(jSONArray);
                c75.c.d(jSONArray, new ko0.h(oVar, c0Var));
                if (!c0Var.f310112d) {
                    com.tencent.mars.xlog.Log.e("LiveBeautyUtil", "#checkAndMakeToReady something wrong. rm dir " + ((java.lang.String) obj2));
                    com.tencent.mm.vfs.w6.f((java.lang.String) obj2);
                    return f0Var;
                }
                ko0.l lVar = ko0.l.f309870a;
                ko0.l.f309872c = (java.lang.String) obj2;
                ko0.l lVar2 = ko0.l.f309870a;
                ko0.l.f309876g = z17;
                com.tencent.mars.xlog.Log.i("LiveBeautyUtil", "#checkAndMakeToReady nice done!");
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("LiveBeautyUtil", "#checkAndMakeToReady package parsing failed. " + e18);
            }
        }
        return f0Var;
    }
}
