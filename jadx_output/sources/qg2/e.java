package qg2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final qg2.e f362799a = new qg2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f362800b = new java.util.HashSet();

    public final java.lang.String a(java.lang.String defaultUrl, r45.ka4 ka4Var) {
        kotlin.jvm.internal.o.g(defaultUrl, "defaultUrl");
        if (!f362800b.contains(defaultUrl) || ka4Var == null) {
            return defaultUrl;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList<r45.gv> linkedList = ka4Var.f378540m;
        if (linkedList != null) {
            for (r45.gv gvVar : linkedList) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(gvVar.f375538f);
                java.lang.String str = gvVar.f375537e;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                int i17 = gvVar.f375542m;
                java.lang.String str3 = gvVar.f375543n;
                java.lang.String str4 = gvVar.f375545p;
                if (str4 != null) {
                    str2 = str4;
                }
                hashMap.put(valueOf, new kn0.r(str, i17, str3, str2));
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLivePlayerUtils", "cdn_quality_h265backcfg: " + ka4Var.f378547r + " cdnUrlMap: " + hashMap);
        kn0.r rVar = (kn0.r) hashMap.get(java.lang.Integer.valueOf(ka4Var.f378547r));
        java.lang.String str5 = rVar != null ? rVar.f309596a : null;
        return str5 == null ? defaultUrl : str5;
    }

    public final void b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("FinderLivePlayerUtils", "mark hasH265Error = ".concat(url));
        f362800b.add(url);
    }

    public final void c(java.lang.String source, mn0.b0 player, r45.ka4 ka4Var, r45.p72 p72Var) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(player, "player");
        mn0.y yVar = (mn0.y) player;
        boolean Ni = ((b92.v1) ((zy2.z7) i95.n0.c(zy2.z7.class))).Ni(source, yVar.f329816r);
        boolean z17 = com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a) == -1;
        com.tencent.mars.xlog.Log.i("FinderLivePlayerUtils", "tryReplayLive: source=" + source + ", markIPInvalid=" + Ni + ", nonNetwork=" + z17);
        if (Ni) {
            ((b92.v1) ((zy2.z7) i95.n0.c(zy2.z7.class))).Vi(source);
            if (z17) {
                return;
            }
            mn0.b0.C(player, false, false, false, 6, null);
            mn0.b0.D(player, yVar.f329816r, 1, ka4Var, p72Var, true, false, 32, null);
        }
    }
}
