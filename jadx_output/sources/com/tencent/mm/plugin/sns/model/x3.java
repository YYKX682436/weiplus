package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class x3 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.z3 f164756d;

    public x3(com.tencent.mm.plugin.sns.model.z3 z3Var) {
        this.f164756d = z3Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
        com.tencent.mm.plugin.sns.model.z3 z3Var = this.f164756d;
        if (i17 == -21005) {
            com.tencent.mm.plugin.sns.model.z3.c(z3Var);
            com.tencent.mm.plugin.sns.statistics.v0.a(com.tencent.mm.plugin.sns.model.z3.d(z3Var), 3, -1);
            ((com.tencent.mm.plugin.sns.model.u7) com.tencent.mm.plugin.sns.model.z3.e(z3Var)).a(true, z3Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
            return 0;
        }
        if (gVar != null) {
            com.tencent.mm.autogen.events.SnsSightUploadProgressEvent snsSightUploadProgressEvent = new com.tencent.mm.autogen.events.SnsSightUploadProgressEvent();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            java.lang.String str2 = z3Var.f164806k;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            am.xw xwVar = snsSightUploadProgressEvent.f54841g;
            xwVar.f8404a = str2;
            xwVar.f8405b = (int) ((gVar.field_finishedLength * 100) / gVar.field_toltalLength);
            snsSightUploadProgressEvent.e();
        }
        r45.mj4 mj4Var = null;
        if (hVar == null || hVar.field_retCode != 0) {
            if (hVar != null && hVar.field_retCode != 0) {
                com.tencent.mm.plugin.sns.model.z3.c(z3Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", null, java.lang.Integer.valueOf(i17), gVar, hVar);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                z3Var.h(0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                com.tencent.mm.plugin.sns.statistics.v0.a(com.tencent.mm.plugin.sns.model.z3.d(z3Var), 3, -1);
                ((com.tencent.mm.plugin.sns.model.u7) com.tencent.mm.plugin.sns.model.z3.e(z3Var)).a(false, z3Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
                return 0;
            }
            if (i17 == 0) {
                com.tencent.mm.plugin.sns.model.z3.c(z3Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
                return 0;
            }
            com.tencent.mm.plugin.sns.model.z3.c(z3Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", null, java.lang.Integer.valueOf(i17), gVar, hVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            z3Var.h(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            com.tencent.mm.plugin.sns.statistics.v0.a(com.tencent.mm.plugin.sns.model.z3.d(z3Var), 3, -1);
            ((com.tencent.mm.plugin.sns.model.u7) com.tencent.mm.plugin.sns.model.z3.e(z3Var)).a(false, z3Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
            return 0;
        }
        com.tencent.mm.plugin.sns.model.z3.c(z3Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", null, java.lang.Integer.valueOf(i17), gVar, hVar);
        java.lang.String str3 = hVar.field_fileUrl;
        java.lang.String str4 = hVar.field_thumbUrl;
        com.tencent.mm.plugin.sns.model.z3.c(z3Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostScene", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        com.tencent.mm.plugin.sns.storage.m2 Hj = com.tencent.mm.plugin.sns.model.l4.Hj();
        int i18 = z3Var.f164799d;
        com.tencent.mm.plugin.sns.storage.l2 n17 = Hj.n1(i18);
        n17.k("upload_null");
        try {
            mj4Var = (r45.mj4) new r45.mj4().parseFrom(n17.h());
        } catch (java.lang.Exception unused) {
        }
        if (mj4Var == null) {
            mj4Var = new r45.mj4();
        }
        r45.cj4 cj4Var = new r45.cj4();
        cj4Var.f371596e = 1;
        cj4Var.f371595d = str3;
        mj4Var.f380566g = cj4Var;
        mj4Var.f380570n = 0;
        java.lang.String Di = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Di(z3Var.f164796a);
        mj4Var.A = Di;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "onPostScene videoMd5 %s", Di);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            r45.cj4 cj4Var2 = new r45.cj4();
            cj4Var2.f371596e = 1;
            cj4Var2.f371595d = str4;
            mj4Var.f380568i.add(cj4Var2);
        }
        try {
            n17.m(mj4Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightCdnUpload", e17, "", new java.lang.Object[0]);
        }
        n17.n();
        com.tencent.mm.plugin.sns.model.l4.Hj().Y2(i18, n17);
        com.tencent.mm.plugin.sns.model.l4.xj().A(i18);
        if (com.tencent.mm.plugin.sns.model.l4.Nj() != null) {
            com.tencent.mm.plugin.sns.model.l4.Nj().d();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostScene", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        t21.i2 wi6 = t21.i2.wi();
        int d17 = com.tencent.mm.plugin.sns.model.z3.d(z3Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        int i19 = z3Var.f164805j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        wi6.Bi(d17, hVar, i19);
        com.tencent.mm.plugin.sns.statistics.v0.a(com.tencent.mm.plugin.sns.model.z3.d(z3Var), 0, 0);
        ((com.tencent.mm.plugin.sns.model.u7) com.tencent.mm.plugin.sns.model.z3.e(z3Var)).a(true, z3Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
        return null;
    }
}
