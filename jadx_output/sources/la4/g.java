package la4;

/* loaded from: classes4.dex */
public class g extends la4.b {
    public int N;

    public g(la4.e eVar, la4.a aVar) {
        super(eVar, aVar);
        this.N = 0;
    }

    @Override // la4.f
    public java.lang.String h(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUrlArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return str;
    }

    @Override // la4.f
    public int l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return 4;
    }

    @Override // la4.b, la4.f
    public boolean o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDelFileBeforeDownload", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDelFileBeforeDownload", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return false;
    }

    @Override // la4.f
    public boolean q(dn.h hVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        la4.a aVar = this.f317565n;
        sb6.append(aVar.d());
        sb6.append(aVar.h());
        long k17 = com.tencent.mm.vfs.w6.k(sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDownloadAdSight", "preceeData  downloadLen " + k17 + " " + this.f317562J);
        if (k17 < this.f317562J + 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
            return false;
        }
        com.tencent.mm.vfs.w6.P(aVar.d(), aVar.h(), ca4.z0.I(this.f317566o));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processData", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return true;
    }

    @Override // la4.b
    public com.tencent.mm.network.h2 t(com.tencent.mm.network.h2 h2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendHttpArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendHttpArg", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
        return h2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
    
        if (r16 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e0, code lost:
    
        v(r21.L, 0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e5, code lost:
    
        r2 = com.tencent.mm.vfs.w6.k(r3.d() + r3.h());
        r0 = new java.lang.StringBuilder("getdataend2  ");
        r0.append(r2);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDownloadAdSight", r0.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDataFromNet", "com.tencent.mm.plugin.sns.model.download.SnsDownloadAdSight");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0115, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // la4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x(java.io.InputStream r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: la4.g.x(java.io.InputStream, java.util.Map):boolean");
    }
}
