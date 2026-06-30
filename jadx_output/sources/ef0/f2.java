package ef0;

@j95.b
/* loaded from: classes11.dex */
public final class f2 extends i95.w implements qk.h8 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f252208d;

    public boolean Ai(java.lang.String str) {
        if (str == null) {
            return false;
        }
        ((qk.o8) i95.n0.c(qk.o8.class)).getClass();
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        il4.l lVar = il4.l.f292142a;
        return ((java.util.List) ((jz5.n) il4.l.f292143b).getValue()).contains(lowerCase);
    }

    public void Bi(java.lang.String key, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(31890, key, java.lang.Integer.valueOf(i17), str != null ? r26.i0.u(str, ',', ';', false, 4, null) : "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public void Di(qk.aa likeRequest, qk.ba baVar) {
        kotlin.jvm.internal.o.g(likeRequest, "likeRequest");
        bw5.g80 g80Var = likeRequest.f364013b;
        java.lang.String listenId = g80Var.getListenId();
        kotlin.jvm.internal.o.f(listenId, "getListenId(...)");
        if (listenId.length() > 0) {
            rk4.k kVar = g80Var.f27725f ? rk4.k.f396772e : rk4.k.f396771d;
            java.lang.String listenId2 = g80Var.getListenId();
            kotlin.jvm.internal.o.f(listenId2, "getListenId(...)");
            bw5.ar0 i17 = bw5.ar0.i(g80Var.f27733q);
            kotlin.jvm.internal.o.f(i17, "forNumber(...)");
            bw5.yq0 yq0Var = kVar == rk4.k.f396772e ? bw5.yq0.TingReportAction_CancelLike : bw5.yq0.TingReportAction_Like;
            jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
            if (Zi != null) {
                ef0.x1 x1Var = new ef0.x1(i17, listenId2);
                jm4.x1 x1Var2 = new jm4.x1();
                x1Var2.f300441d = x1Var;
                urgen.ur_0025.UR_5769.UR_60C4(((jm4.k4) Zi).getCppPointer(), yq0Var.f35626d, i17.f25422d, x1Var2);
            }
        }
        new vk4.e(g80Var).l().q(new ef0.w1(this, likeRequest, baVar, g80Var));
    }

    public boolean Ni(bw5.l80 info, il4.e tingItemExt) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(tingItemExt, "tingItemExt");
        java.lang.String filePath = info.getFilePath();
        if (filePath == null || r26.n0.N(filePath)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingCommonService", "playLocalFile but filePath is empty!");
            return false;
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310568a, null, new ef0.c2(this, info, tingItemExt, null), 2, null);
        return true;
    }

    public bw5.l80 wi(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        bw5.l80 l80Var = new bw5.l80();
        l80Var.f29683d = str == null ? "" : str;
        boolean z17 = true;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        android.util.ArrayMap arrayMap = l80Var.f29694r;
        arrayMap.put(1, bool);
        if (str2 == null) {
            str2 = "";
        }
        l80Var.f29685f = str2;
        arrayMap.put(3, bool);
        if (str3 == null) {
            str3 = "";
        }
        l80Var.f29687h = str3;
        arrayMap.put(5, bool);
        if (str4 != null && str4.length() != 0) {
            z17 = false;
        }
        if (z17) {
            if (str == null) {
                str = "";
            }
            java.lang.String e17 = kk.k.e(str);
            if (e17 == null) {
                e17 = "";
            }
            l80Var.f29686g = e17;
            arrayMap.put(4, bool);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildListenLocalFileInfo1 md5: ");
            sb6.append(l80Var.hasFieldNumber(4) ? l80Var.f29686g : "");
            com.tencent.mars.xlog.Log.i("MicroMsg.TingCommonService", sb6.toString());
        } else {
            l80Var.f29686g = str4;
            arrayMap.put(4, bool);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("buildListenLocalFileInfo2 md5: ");
            sb7.append(l80Var.hasFieldNumber(4) ? l80Var.f29686g : "");
            com.tencent.mars.xlog.Log.i("MicroMsg.TingCommonService", sb7.toString());
        }
        return l80Var;
    }
}
