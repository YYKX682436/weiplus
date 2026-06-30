package xd4;

/* loaded from: classes4.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xd4.i0 f453645d;

    public h0(xd4.i0 i0Var) {
        this.f453645d = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sight.base.b bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask$rptVideoPause$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getReporter$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        xd4.i0 i0Var = this.f453645d;
        ok4.c cVar = i0Var.f453650d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getReporter$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        long j17 = cVar.f345988l;
        if (j17 <= 0) {
            j17 = 0;
        }
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadTask", "no download not need to report");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask$rptVideoPause$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getReporter$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getReporter$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        ok4.b v17 = i0Var.f453650d.v();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getProvider$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getProvider$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct b17 = i0Var.f453651e.b();
        com.tencent.mm.autogen.mmdata.rpt.SnsOnlineVideoReportStruct snsOnlineVideoReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsOnlineVideoReportStruct();
        snsOnlineVideoReportStruct.f60659n = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        snsOnlineVideoReportStruct.f60645g = 0L;
        snsOnlineVideoReportStruct.K = 0L;
        snsOnlineVideoReportStruct.f60643f = com.tencent.mm.vfs.w6.k(b17.f166559f);
        snsOnlineVideoReportStruct.N = snsOnlineVideoReportStruct.b("SnsPublishid", b17.f166557d, true);
        snsOnlineVideoReportStruct.f60639d = snsOnlineVideoReportStruct.b("SnsVideoUrl", b17.f166558e, true);
        snsOnlineVideoReportStruct.f60649i = v17.f345966a;
        long j18 = v17.f345967b;
        if (j18 < 0) {
            j18 = 0;
        }
        snsOnlineVideoReportStruct.f60651j = j18;
        snsOnlineVideoReportStruct.f60653k = v17.f345968c;
        snsOnlineVideoReportStruct.f60655l = v17.f345969d;
        long j19 = v17.f345970e;
        snsOnlineVideoReportStruct.f60657m = j19 >= 0 ? j19 : 0L;
        snsOnlineVideoReportStruct.I = v17.f345971f;
        snsOnlineVideoReportStruct.f60635J = v17.f345972g;
        snsOnlineVideoReportStruct.V = b17.f166556c;
        snsOnlineVideoReportStruct.W = snsOnlineVideoReportStruct.b("AutoPlaySessionID", b17.f166555b, true);
        snsOnlineVideoReportStruct.X = (int) b17.f166554a;
        snsOnlineVideoReportStruct.f60668r0 = snsOnlineVideoReportStruct.b("cdn_req_flag", b17.f166560g, true);
        snsOnlineVideoReportStruct.f60670s0 = snsOnlineVideoReportStruct.b("cdn_resp_flag", b17.f166561h, true);
        snsOnlineVideoReportStruct.f60672t0 = snsOnlineVideoReportStruct.b("switch_source_start_time", b17.f166562i, true);
        snsOnlineVideoReportStruct.f60674u0 = snsOnlineVideoReportStruct.b("switch_source_end_time", b17.f166563j, true);
        snsOnlineVideoReportStruct.f60676v0 = b17.f166564k;
        snsOnlineVideoReportStruct.f60678w0 = snsOnlineVideoReportStruct.b("sns_video_multi_spec", b17.f166565l, true);
        try {
            bVar = com.tencent.mm.plugin.sight.base.e.d(i0Var.j(), true);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoDownloadTask", "Failed to getMediaInfo");
            bVar = null;
        }
        if (bVar != null) {
            snsOnlineVideoReportStruct.f60640d0 = bVar.f162384c;
            snsOnlineVideoReportStruct.f60642e0 = bVar.f162385d;
            snsOnlineVideoReportStruct.f60644f0 = bVar.f162386e;
            snsOnlineVideoReportStruct.f60646g0 = v17.f345973h;
            int i17 = v17.f345974i;
            int i18 = 0;
            boolean z17 = (i17 & 1) != 0;
            boolean z18 = (i17 & 2) != 0;
            snsOnlineVideoReportStruct.f60648h0 = snsOnlineVideoReportStruct.f60655l;
            snsOnlineVideoReportStruct.f60650i0 = snsOnlineVideoReportStruct.f60657m;
            if (z17 && z18) {
                i18 = 3;
            } else if (z17) {
                i18 = 1;
            } else if (z18) {
                i18 = 2;
            }
            snsOnlineVideoReportStruct.f60652j0 = i18;
            int i19 = bVar.f162382a;
            if (i19 != 0) {
                boolean z19 = v17.f345976k;
                long j27 = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
                if (!z19) {
                    j27 = java.lang.Math.min(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, (v17.f345975j * 10000) / i19);
                }
                snsOnlineVideoReportStruct.f60654k0 = j27;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(bVar.f162384c);
            sb6.append('x');
            sb6.append(bVar.f162385d);
            snsOnlineVideoReportStruct.f60660n0 = snsOnlineVideoReportStruct.b("widthxheight", sb6.toString(), true);
        }
        snsOnlineVideoReportStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask$rptVideoPause$1");
    }
}
