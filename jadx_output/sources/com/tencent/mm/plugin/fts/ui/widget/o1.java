package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public abstract class o1 implements com.tencent.mm.modelbase.u0 {
    public static void a(java.lang.String str, g23.k kVar, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18) {
        try {
            if (com.tencent.mm.sdk.platformtools.t8.N0(str, java.lang.String.valueOf(kVar.B), str5)) {
                return;
            }
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("pardussearch=expose&searchid=");
            stringBuffer.append(kVar.G);
            stringBuffer.append("&query=");
            stringBuffer.append(fp.s0.b(str, "utf8"));
            stringBuffer.append("&type=");
            stringBuffer.append(i17);
            stringBuffer.append("&docid=");
            stringBuffer.append(str2);
            stringBuffer.append("&title=");
            stringBuffer.append(fp.s0.b(str3, "utf8"));
            stringBuffer.append("&clienttimestamp=");
            stringBuffer.append(java.lang.System.currentTimeMillis());
            stringBuffer.append("&sug=");
            stringBuffer.append(fp.s0.b(str4, "utf8"));
            stringBuffer.append("&relatedsug=");
            stringBuffer.append(fp.s0.b(str5, "utf8"));
            stringBuffer.append("&sugtype=");
            stringBuffer.append(i18);
            stringBuffer.append("&requestid=");
            stringBuffer.append(kVar.B);
            stringBuffer.append("&sessionid=");
            stringBuffer.append(o13.p.f342250c);
            stringBuffer.append("&extinfo=");
            stringBuffer.append(kVar.L);
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.PardusSearchLogic", "realtimeSearchExposeReport %s", stringBuffer.toString());
            r45.lq5 lq5Var = new r45.lq5();
            lq5Var.f379756t = stringBuffer.toString();
            gm0.j1.d().g(new su4.a2(lq5Var));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.PardusSearchLogic", e17, "realtimeSearchExposeReport", new java.lang.Object[0]);
        }
    }
}
