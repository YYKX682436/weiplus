package k91;

/* loaded from: classes7.dex */
public class i1 extends com.tencent.mm.plugin.appbrand.networking.d {
    public i1(java.util.List list, k91.h1 h1Var) {
        com.tencent.mm.protobuf.g i17;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(list.size());
        java.lang.String name = h1Var.name();
        int i18 = h1Var.f305609d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiBatchWxaAttrSync", "create sync request, list_size %d, scene %s(%d)", valueOf, name, java.lang.Integer.valueOf(i18));
        r45.fh fhVar = new r45.fh();
        fhVar.f374331e = i18;
        fhVar.f374334h = wo.w0.m();
        fhVar.f374335i = android.os.Build.VERSION.RELEASE;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader a17 = com.tencent.mm.plugin.appbrand.appcache.x7.a();
        if (a17 != null) {
            r45.fd7 fd7Var = new r45.fd7();
            fhVar.f374333g = fd7Var;
            fd7Var.f374246d = a17.i();
            fhVar.f374337n = a17.W0();
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                r45.ad7 ad7Var = new r45.ad7();
                ad7Var.f369949d = str2;
                k91.v5 n17 = com.tencent.mm.plugin.appbrand.app.r9.ij().n1(str2, k91.a5.f305539a);
                boolean z17 = false;
                if (n17 == null) {
                    i17 = new com.tencent.mm.protobuf.g(new byte[0], 0, 0);
                } else if (k91.h5.a(n17)) {
                    i17 = new com.tencent.mm.protobuf.g(new byte[0], 0, 0);
                } else if (k91.h5.b(n17)) {
                    r81.f.INSTANCE.b(((t81.s) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.s.class)).b(n17.field_username), 199);
                    i17 = new com.tencent.mm.protobuf.g(new byte[0], 0, 0);
                } else {
                    i17 = k91.j4.i1(n17);
                }
                ad7Var.f369950e = i17;
                fhVar.f374330d.add(ad7Var);
                if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = ad7Var.f369949d;
                    com.tencent.mm.protobuf.g gVar = ad7Var.f369950e;
                    if (gVar != null && gVar.f192156a.length > 0) {
                        z17 = true;
                    }
                    objArr[1] = java.lang.Boolean.valueOf(z17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiBatchWxaAttrSync", "create sync request, username[%s], has cache?[%b]", objArr);
                }
            }
        }
        D(fhVar);
    }

    public final void D(r45.fh fhVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = fhVar;
        lVar.f70665b = new r45.gh();
        lVar.f70667d = 1192;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaattr/batchwxaattrsync";
        p(lVar.a());
    }

    public i1(java.lang.String str) {
        r45.fh fhVar = new r45.fh();
        fhVar.f374331e = 113;
        r45.ad7 ad7Var = new r45.ad7();
        ad7Var.f369952g = str;
        fhVar.f374330d.add(ad7Var);
        D(fhVar);
    }
}
