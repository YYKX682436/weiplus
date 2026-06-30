package v85;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final v85.e f434103a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f434104b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f434105c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f434106d;

    /* renamed from: e, reason: collision with root package name */
    public static final r45.q64 f434107e;

    /* renamed from: f, reason: collision with root package name */
    public static final r45.q64 f434108f;

    /* renamed from: g, reason: collision with root package name */
    public static int f434109g;

    /* renamed from: h, reason: collision with root package name */
    public static yz5.a f434110h;

    static {
        java.lang.String string;
        v85.e eVar = new v85.e();
        f434103a = eVar;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            string = eVar.a();
        } else {
            android.os.Bundle bundle = (android.os.Bundle) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.x2.f193072b, null, v85.b.class);
            string = bundle != null ? bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) : null;
            if (string == null) {
                string = "";
            }
        }
        f434104b = string;
        java.lang.String str = string + "recommend.proto";
        f434105c = str;
        f434106d = string + "history.proto";
        r45.q64 q64Var = new r45.q64();
        f434107e = q64Var;
        f434108f = new r45.q64();
        byte[] N = com.tencent.mm.vfs.w6.N(str, 0, -1);
        if (N != null) {
            if (!(N.length == 0)) {
                try {
                    q64Var.parseFrom(N);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LensInfoUserCache", e17, "", new java.lang.Object[0]);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LensInfoUserCache", "parseRecommend: " + str + ' ' + q64Var.f383710d.size());
            }
        }
        r45.q64 q64Var2 = f434108f;
        java.lang.String str2 = f434106d;
        byte[] N2 = com.tencent.mm.vfs.w6.N(str2, 0, -1);
        if (N2 != null) {
            if (!(N2.length == 0)) {
                try {
                    q64Var2.parseFrom(N2);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LensInfoUserCache", e18, "", new java.lang.Object[0]);
                }
                java.util.LinkedList lensInfoList = q64Var2.f383710d;
                kotlin.jvm.internal.o.f(lensInfoList, "lensInfoList");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : lensInfoList) {
                    java.lang.String str3 = ((r45.p64) obj).f382792d;
                    if (!(str3 == null || r26.n0.N(str3))) {
                        arrayList.add(obj);
                    }
                }
                java.util.LinkedList linkedList = q64Var2.f383710d;
                linkedList.clear();
                linkedList.addAll(arrayList);
                com.tencent.mars.xlog.Log.i("MicroMsg.LensInfoUserCache", "parseHistory: " + str2 + ' ' + linkedList.size());
            }
        }
    }

    public final java.lang.String a() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_STICKER_USER_CACHE_DIR_STRING;
        java.lang.Object m17 = c17.m(u3Var, null);
        java.lang.String str = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "lens_" + java.lang.System.currentTimeMillis();
            gm0.j1.u().c().x(u3Var, str);
        }
        return lp0.b.h() + "sticker/data/" + str + '/';
    }

    public final void b() {
        yz5.a aVar = f434110h;
        if (aVar != null) {
            aVar.invoke();
        }
        r45.q64 q64Var = f434108f;
        byte[] byteArray = q64Var.toByteArray();
        com.tencent.mm.vfs.w6.u(f434104b);
        com.tencent.mm.vfs.w6.R(f434106d, byteArray);
        com.tencent.mars.xlog.Log.i("MicroMsg.LensInfoUserCache", "saveHistory: " + q64Var.f383710d.size());
    }

    public final void c(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        r45.q64 q64Var = f434107e;
        q64Var.f383710d.clear();
        q64Var.f383710d.addAll(list);
        byte[] byteArray = q64Var.toByteArray();
        com.tencent.mm.vfs.w6.u(f434104b);
        com.tencent.mm.vfs.w6.R(f434105c, byteArray);
        com.tencent.mars.xlog.Log.i("MicroMsg.LensInfoUserCache", "saveRecommend: " + q64Var.f383710d.size());
    }
}
