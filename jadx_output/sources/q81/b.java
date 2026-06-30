package q81;

/* loaded from: classes4.dex */
public class b extends q81.a {
    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        r45.df7 df7Var = (r45.df7) obj;
        t81.b bVar = (t81.b) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.b.class);
        bVar.getClass();
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(df7Var.f372405f);
        java.util.LinkedList linkedList = df7Var.f372405f;
        java.util.LinkedList linkedList2 = df7Var.f372404e;
        boolean z17 = false;
        if (L0 || com.tencent.mm.sdk.platformtools.t8.L0(linkedList2)) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = java.lang.Integer.valueOf(linkedList == null ? -1 : linkedList.size());
            objArr[3] = java.lang.Integer.valueOf(linkedList2 != null ? linkedList2.size() : -1);
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.CmdBlockCgiPersistentStorage", "saveBlockList with username(%s) appId(%s) sceneList.size(%d), blockCgi.size(%d), skip", objArr);
        } else {
            t81.a aVar = new t81.a();
            aVar.field_username = str;
            boolean z18 = bVar.get(aVar, new java.lang.String[0]);
            aVar.field_appId = str2;
            aVar.field_startTime = df7Var.f372406g;
            aVar.field_endTime = df7Var.f372407h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(";");
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb6.append(((java.lang.Integer) it.next()).intValue());
                sb6.append(";");
            }
            aVar.field_sceneList = sb6.toString();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(";");
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                sb7.append(((java.lang.Integer) it6.next()).intValue());
                sb7.append(";");
            }
            aVar.field_cgiList = sb7.toString();
            aVar.field_reportId = df7Var.f372403d.f371531f;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.CmdBlockCgiPersistentStorage", "saveBlockList, record( %s ), doUpdate %b", aVar, java.lang.Boolean.valueOf(z18));
            z17 = z18 ? bVar.update(aVar, new java.lang.String[0]) : bVar.insert(aVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.CmdBlockCgiRequest", "saveBlockList with username(%s) appId(%s), ret %b", str, str2, java.lang.Boolean.valueOf(z17));
        return java.lang.Boolean.valueOf(z17);
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        return ((r45.df7) obj).f372403d;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdBlockCgiRequest";
    }
}
