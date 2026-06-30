package qi4;

/* loaded from: classes11.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final qi4.p f363776a;

    /* renamed from: b, reason: collision with root package name */
    public static final si4.f f363777b;

    /* renamed from: c, reason: collision with root package name */
    public static final si4.c f363778c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f363779d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f363780e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f363781f;

    static {
        qi4.p pVar = new qi4.p();
        f363776a = pVar;
        f363779d = jz5.h.b(qi4.l.f363772d);
        f363780e = jz5.h.b(qi4.o.f363775d);
        f363781f = jz5.h.b(qi4.n.f363774d);
        com.tencent.wechat.aff.status.StatusInitOnLoader.getInstance().registerStatusInitManager(qi4.c.f363763a);
        ai4.b0 b0Var = ai4.b0.f5123a;
        b0Var.getClass();
        boolean z17 = ai4.b0.f5125c;
        if (z17) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.TextStatus.StatusDBWrapper", "[initAffStatusDB] ready on " + java.lang.Thread.currentThread().getName(), new java.lang.Object[0]);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusDBWrapper", "[initAffStatusDB] initIlinkTimeCost=" + currentTimeMillis2);
            qj4.s.f363958a.r(4096L, (r20 & 2) != 0 ? null : null, (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : java.lang.Long.valueOf(currentTimeMillis2), (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? null : null);
            int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
            java.lang.String h17 = gm0.j1.u().h();
            java.lang.String k17 = gm0.j1.b().k();
            com.tencent.wechat.aff.status.StatusStorageManager.getInstance().init(h17, k17, i17, false, h17 + "status/media/");
            long currentTimeMillis3 = java.lang.System.currentTimeMillis() - com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusDBWrapper", "clean timeStamp: " + currentTimeMillis3);
            com.tencent.wechat.aff.status.StatusStorageManager.getInstance().cleanExpireDBAsync(currentTimeMillis3, false, false, qi4.m.f363773a);
            com.tencent.wechat.aff.status.StatusStorageManager.getInstance().constructStatusInfoCache();
            if (pVar.d()) {
                com.tencent.wechat.aff.status.StatusStorageManager statusStorageManager = com.tencent.wechat.aff.status.StatusStorageManager.getInstance();
                bw5.pm0 pm0Var = new bw5.pm0();
                bk4.n nVar = bk4.n.f21513a;
                pm0Var.f31748d = nVar.e("v3_");
                boolean[] zArr = pm0Var.f31752h;
                zArr[1] = true;
                pm0Var.f31749e = nVar.d("v3_");
                zArr[2] = true;
                pm0Var.f31751g = nVar.j("v3_");
                zArr[4] = true;
                pm0Var.f31750f = nVar.i("v3_");
                zArr[3] = true;
                statusStorageManager.initIconConfigAsync(pm0Var, null);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusDBWrapper", "[initAffStatusDB] finish, myUserName=" + k17 + ", clientVersion = " + i17 + ", rootPath = " + h17 + ", isDebug = false");
        }
        b0Var.getClass();
        if (ai4.b0.f5126d) {
            si4.f b17 = pVar.b(null);
            f363777b = b17;
            f363778c = pVar.a(b17);
        } else {
            si4.c a17 = pVar.a(null);
            f363778c = a17;
            b0Var.getClass();
            f363777b = z17 ? pVar.b(a17) : pVar.b(null);
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.TextStatus.StatusDBWrapper", "init, thread=" + java.lang.Thread.currentThread().getName(), new java.lang.Object[0]);
    }

    public final si4.c a(si4.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createAffInfoStorage: fallbackDB=");
        sb6.append(aVar != null ? java.lang.Integer.valueOf(aVar.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusDBWrapper", sb6.toString());
        return new si4.c(aVar);
    }

    public final si4.f b(si4.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createNativeInfoStorage: fallbackDB=");
        sb6.append(aVar != null ? java.lang.Integer.valueOf(aVar.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusDBWrapper", sb6.toString());
        return new si4.f(c(), aVar);
    }

    public final d95.b0 c() {
        return (d95.b0) f363779d.getValue();
    }

    public final boolean d() {
        com.tencent.mm.repairer.config.textstatus.v4.RepairerConfigTextStatusPostFlutter repairerConfigTextStatusPostFlutter = new com.tencent.mm.repairer.config.textstatus.v4.RepairerConfigTextStatusPostFlutter();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean z17 = false;
        boolean z18 = z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c;
        int h17 = z18 ? bm5.o1.f22719a.h(repairerConfigTextStatusPostFlutter) : -1;
        java.lang.String str2 = "repairerConfig";
        if (z18 && h17 == 1) {
            z17 = true;
        } else if (!z18 || h17 != 2) {
            z17 = j62.e.g().l("clicfg_textstatus_android_use_flutter_publish_page_android", false, true, true);
            str2 = "expt";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusDBWrapper", "FlutterPublishPage enable=" + z17 + ", source=" + str2 + ", useRepairer=" + z18 + ", repairerConfig=" + h17);
        return z17;
    }

    public final si4.a d(boolean z17) {
        if (z17) {
            return f363778c;
        }
        return f363777b;
    }
}
