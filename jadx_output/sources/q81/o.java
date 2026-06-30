package q81;

/* loaded from: classes4.dex */
public class o extends q81.a {
    public static java.lang.String g(java.util.List list) {
        if (list == null) {
            return "null";
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            sb6.append(it.next().toString());
            sb6.append(',');
        }
        sb6.append("}");
        return sb6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Boolean] */
    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        r45.mf7 mf7Var = (r45.mf7) obj;
        java.lang.String str3 = mf7Var.f380462e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], empty base64", str, str2);
            return java.lang.Boolean.FALSE;
        }
        java.util.LinkedList linkedList = mf7Var.f380463f;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], empty sceneList", str, str2);
            return java.lang.Boolean.FALSE;
        }
        try {
            byte[] decode = android.util.Base64.decode(str3, 0);
            r45.v54 v54Var = new r45.v54();
            v54Var.parseFrom(decode);
            if (v54Var.f387903e.f370425d.f192156a.length == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], parse pb, invalid foreground control bytes", str, str2);
                r81.f.INSTANCE.b(mf7Var.f380461d.f371531f, 105);
                str = java.lang.Boolean.FALSE;
            } else {
                r81.f fVar = r81.f.INSTANCE;
                fVar.b(mf7Var.f380461d.f371531f, 104);
                long b17 = ik1.c0.b(mf7Var.f380464g);
                long b18 = ik1.c0.b(mf7Var.f380465h);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s| %s] WriteToStorage, sceneList %s, time[%d, %d]", str, str2, g(linkedList), java.lang.Long.valueOf(b17), java.lang.Long.valueOf(b18));
                boolean y07 = ((t81.e) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.e.class)).y0(decode, str2, linkedList, b17, b18);
                fVar.b(mf7Var.f380461d.f371531f, y07 ? 107 : 108);
                str = java.lang.Boolean.valueOf(y07);
            }
            return str;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", e17, "call[%s | %s], decode base64", str, str2);
            return java.lang.Boolean.FALSE;
        }
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        return ((r45.mf7) obj).f380461d;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdIssueLaunch";
    }
}
