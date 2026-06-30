package n74;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final n74.r f335421a = new n74.r();

    public final java.lang.Object a(java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
            return null;
        }
        if (j17 > 0) {
            java.lang.Object c17 = kotlinx.coroutines.a4.c(j17, new n74.h(str, null), continuation);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
            return c17;
        }
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        n74.j jVar = new n74.j(rVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImgForAdLandingPages$default", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        a84.m.d(str, jVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImgForAdLandingPages$default", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        java.lang.Object j18 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        return j18;
    }

    public final void b(java.lang.String str, boolean z17, yz5.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadVideoForAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        if (str == null || r26.n0.N(str)) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesDownloadResourceHelper2", "downloadVideoForAdResource error!, url=" + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideoForAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("AdLandingPagesDownloadResourceHelper2", "downloadVideoForAdResource, url=" + str);
        java.lang.String c17 = c();
        java.lang.String d17 = d("advideo", str);
        java.lang.String str2 = c17 + d17;
        if (com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mars.xlog.Log.i("AdLandingPagesDownloadResourceHelper2", "cdn file %s is already exists", str2);
            ((ku5.t0) ku5.t0.f312615d).B(new n74.l(pVar, str2));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideoForAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
            return;
        }
        com.tencent.mm.vfs.w6.u(c17);
        r45.jj4 h17 = m21.y.h(d17, 6, str, str, 1, 1, "");
        h17.N = true;
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).B(new n74.m(new n74.p(new java.lang.ref.WeakReference(pVar), str2), h17, c17, d17));
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new n74.o(h17, c17, d17, pVar, str2));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideoForAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdDownloadResDir", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        java.lang.String Bi = ((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Bi();
        kotlin.jvm.internal.o.f(Bi, "getSnsAdLandingPagesPath(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDownloadResDir", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        return Bi;
    }

    public final java.lang.String d(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFileName", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String str3 = "adId_" + str + '_' + com.tencent.mm.sdk.platformtools.w2.b(str2.getBytes());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFileName", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdDownloadResourceHelper");
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r18, android.widget.ImageView r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n74.r.e(java.lang.String, android.widget.ImageView, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
