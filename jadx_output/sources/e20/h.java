package e20;

/* loaded from: classes9.dex */
public final class h extends t10.c {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f246481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
        this.f246481c = new java.util.concurrent.ConcurrentHashMap();
        java.util.List<f20.b> c17 = kz5.b0.c(new f20.b("showToast"));
        com.tencent.mars.xlog.Log.i("ECS_O.Router.Wxa", "register nextActionHandlers, count: " + c17.size());
        int d17 = kz5.b1.d(kz5.d0.q(c17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        for (f20.b bVar : c17) {
            linkedHashMap.put(bVar.f258831a, bVar);
        }
        this.f246481c.putAll(linkedHashMap);
    }

    @Override // t10.c
    public boolean a(pq.a context, bw5.x7 jumpInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        if (!jumpInfo.f34984r[2]) {
            return false;
        }
        java.lang.String appid = jumpInfo.f().getAppid();
        if (appid == null || appid.length() == 0) {
            java.lang.String b17 = jumpInfo.f().b();
            if (b17 == null || b17.length() == 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028f  */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    @Override // t10.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(pq.a r37, bw5.x7 r38, t10.d r39) {
        /*
            Method dump skipped, instructions count: 1723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e20.h.b(pq.a, bw5.x7, t10.d):void");
    }

    @Override // t10.c
    public void c(pq.a context, bw5.x7 jumpInfo, bw5.l8 l8Var, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        bw5.u7 f17 = jumpInfo.f();
        if (f17 != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(f17.b())) {
                com.tencent.mm.sdk.platformtools.Log.c("ECS_O.Router.Wxa", "hy: no app username provided", new java.lang.Object[0]);
            } else {
                com.tencent.mars.xlog.Log.i("ECS_O.Router.Wxa", "hy: start preloading attr with " + f17.b());
                java.lang.String b17 = f17.b();
                kotlin.jvm.internal.o.f(b17, "getAppUsername(...)");
                ((com.tencent.mm.plugin.appbrand.service.r5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.r5.class)).p7(kz5.b0.c(b17));
            }
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Rh(com.tencent.mm.plugin.appbrand.service.x6.U);
        }
        callback.d(null);
    }

    public final boolean d(pq.a aVar, bw5.u7 u7Var) {
        if (!u7Var.f33760m) {
            return false;
        }
        bw5.g8 d17 = aVar.f357552b.d();
        boolean z17 = u7Var.f33764q;
        if (aVar.f357552b.d().f27717m) {
            z17 = true;
        }
        boolean z18 = !z17;
        if (d17.f27716i) {
            z18 = true;
        }
        bw5.t7 t7Var = u7Var.f33768u[13] ? u7Var.f33766s : new bw5.t7();
        if (t7Var != null && t7Var.f33286h) {
            return false;
        }
        return z18;
    }
}
