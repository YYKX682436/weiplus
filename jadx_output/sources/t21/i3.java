package t21;

/* loaded from: classes12.dex */
public final class i3 {
    public i3(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.util.Map map, java.lang.String str) {
        java.lang.String str2;
        if (map != null) {
            str2 = (java.lang.String) map.get(".msg.videomsg.$" + str);
        } else {
            str2 = null;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str2 == null ? "" : str2;
    }

    public final int b(com.tencent.mm.storage.f9 f9Var) {
        l15.f l17;
        if (f9Var == null) {
            return 0;
        }
        y15.d dVar = new y15.d();
        java.lang.String j17 = f9Var.j();
        kotlin.jvm.internal.o.f(j17, "getContent(...)");
        dVar.fromXml(j17);
        l15.d l18 = dVar.l();
        return (l18 == null || (l17 = l18.l()) == null) ? f9Var.R : l17.j();
    }

    public final java.lang.String c(com.tencent.mm.storage.f9 f9Var) {
        n15.a k17;
        java.lang.String j17;
        if (f9Var == null) {
            return "";
        }
        boolean z17 = false;
        if (f9Var.j() != null) {
            java.lang.String j18 = f9Var.j();
            kotlin.jvm.internal.o.f(j18, "getContent(...)");
            if (j18.length() > 0) {
                z17 = true;
            }
        }
        if (!z17) {
            f9Var = null;
        }
        if (f9Var == null) {
            return "";
        }
        y15.d dVar = new y15.d();
        java.lang.String j19 = f9Var.j();
        kotlin.jvm.internal.o.f(j19, "getContent(...)");
        dVar.fromXml(j19);
        l15.d l17 = dVar.l();
        return (l17 == null || (k17 = l17.k()) == null || (j17 = k17.j()) == null) ? f9Var.Q : j17;
    }

    public final t21.j3 d(java.lang.String str) {
        java.lang.String str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        kotlin.jvm.internal.o.d(str);
        int K = r26.n0.K(str, '<', 0, false, 6, null);
        if (K > 0) {
            str2 = str.substring(K);
            kotlin.jvm.internal.o.f(str2, "substring(...)");
        } else {
            str2 = str;
        }
        int hashCode = "parse_".concat(str).hashCode();
        t21.j3 j3Var = (t21.j3) ((lt0.f) t21.j3.f414801i).get(java.lang.Integer.valueOf(hashCode));
        if (j3Var != null) {
            return j3Var;
        }
        t21.j3 j3Var2 = new t21.j3();
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "msg", null);
        try {
            t21.i3 i3Var = t21.j3.f414800h;
            j3Var2.f414803a = com.tencent.mm.sdk.platformtools.t8.V(i3Var.a(d17, "overwritenewmsgid"), 0L);
            i3Var.a(d17, "fileuploadtoken");
            j3Var2.f414805c = i3Var.a(d17, "rawmd5");
            j3Var2.f414806d = i3Var.a(d17, "cdnrawvideourl");
            j3Var2.f414808f = i3Var.a(d17, "cdnrawvideoaeskey");
            j3Var2.f414809g = com.tencent.mm.sdk.platformtools.t8.P(i3Var.a(d17, "rawlength"), 0);
            j3Var2.f414804b = com.tencent.mm.sdk.platformtools.t8.P(i3Var.a(d17, "isplaceholder"), 0) == 1;
            j3Var2.f414807e = i3Var.a(d17, "cdnvideourl");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoParseInfo", "parsing video msg xml failed", e17);
        }
        ((lt0.f) t21.j3.f414801i).put(java.lang.Integer.valueOf(hashCode), j3Var2);
        long j17 = j3Var2.f414803a;
        if (j17 != 0) {
            ((lt0.f) t21.j3.f414802j).put(java.lang.Long.valueOf(j17), j3Var2);
        }
        return j3Var2;
    }

    public final void e(com.tencent.mm.storage.f9 f9Var, int i17) {
        if (!pt0.f0.f358209b1.h() && f9Var != null) {
            f9Var.R = i17;
            f9Var.f236178r = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("talker: ");
        sb6.append(f9Var != null ? f9Var.Q0() : null);
        sb6.append(", msgId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
        sb6.append(", downloadControlType: ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoParseInfo", sb6.toString());
    }

    public final void f(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        if (!pt0.f0.f358209b1.h() && f9Var != null) {
            f9Var.Q = str;
            f9Var.f236178r = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("talker: ");
        sb6.append(f9Var != null ? f9Var.Q0() : null);
        sb6.append(", msgId: ");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
        sb6.append(", expIdStr: ");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoParseInfo", sb6.toString());
    }
}
