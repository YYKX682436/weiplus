package la4;

/* loaded from: classes4.dex */
public class h extends la4.i {
    @Override // la4.f
    public int l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadImage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaType", "com.tencent.mm.plugin.sns.model.download.SnsDownloadImage");
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01af  */
    @Override // la4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean q(dn.h r41, int r42) {
        /*
            Method dump skipped, instructions count: 1461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: la4.h.q(dn.h, int):boolean");
    }

    public final boolean u(la4.a aVar, r45.jj4 jj4Var, java.lang.String str, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createUserAlbum", "com.tencent.mm.plugin.sns.model.download.SnsDownloadImage");
        java.lang.String e07 = ca4.z0.e0(jj4Var);
        if (com.tencent.mm.vfs.w6.j(aVar.d() + e07)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createUserAlbum", "com.tencent.mm.plugin.sns.model.download.SnsDownloadImage");
            return true;
        }
        boolean i17 = com.tencent.mm.plugin.sns.storage.m2.i1(aVar.d(), str, e07, f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createUserAlbum", "com.tencent.mm.plugin.sns.model.download.SnsDownloadImage");
        return i17;
    }
}
