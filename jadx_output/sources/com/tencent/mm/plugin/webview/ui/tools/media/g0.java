package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.media.g0 f185777a = new com.tencent.mm.plugin.webview.ui.tools.media.g0();

    public final void a(r45.ee eeVar, com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        if (eeVar == null || mMActivity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MPVideoShareToSns", "doShareToSns msgInfo is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsMpVideoShareObject", "com.tencent.mm.feature.sns.SnsShareObjectService");
        m21.q qVar = new m21.q();
        qVar.f322998a = eeVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsMpVideoShareObject", "com.tencent.mm.feature.sns.SnsShareObjectService");
        intent.putExtra("ksnsupload_mp_video_xml", qVar.a());
        intent.putExtra("Ksnsupload_type", 19);
        intent.putExtra("need_result", true);
        j45.l.w(mMActivity, ".plugin.sns.ui.SnsUploadUI", intent, 209, new com.tencent.mm.plugin.webview.ui.tools.media.f0(mMActivity, eeVar, i17));
    }
}
