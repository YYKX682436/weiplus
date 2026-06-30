package ec4;

@j95.b
/* loaded from: classes4.dex */
public final class j0 extends i95.w implements fe0.i4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f251169d = "MicroMsg.SnsFakeVideoResultApi";

    public void wi(int i17, java.lang.String videoPath, java.lang.String thumbPath, byte[] extInfo, int i18) {
        ec4.j b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyPublishRemuxWorkResult", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApi");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        java.lang.String str = "notifyPublishRemuxWorkResult >> snsLocalId: " + i17 + ", workType: " + i18 + ", videoPath: " + videoPath + ", extInfoSize: " + extInfo.length;
        java.lang.String str2 = this.f251169d;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (i18 == 4007 && com.tencent.mm.vfs.w6.j(videoPath)) {
            if (!(extInfo.length == 0)) {
                com.tencent.mars.xlog.Log.i(str2, "notifyPublishRemuxWorkResult >> go to commit");
                ec4.j d17 = new ec4.j().d(i17, extInfo);
                if (d17 != null && (b17 = d17.b(videoPath, thumbPath)) != null) {
                    b17.c();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyPublishRemuxWorkResult", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApi");
            }
        }
        com.tencent.mars.xlog.Log.i(str2, "remux is error, snsLocalId: " + i17 + ", workType: " + i18 + ", videoPath: " + videoPath + ", extInfoSize: " + extInfo.length);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFakeVideoFeedToDie", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateFakeVideoFeedToDie >> localId ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", sb6.toString());
        com.tencent.mm.plugin.sns.storage.SnsInfo i19 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17);
        if (i19 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimeLineFakeViewHandler", "updateFakeVideoFeedToDie: failed, info null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFakeVideoFeedToDie", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        } else {
            com.tencent.mm.plugin.sns.model.l4.Nj().l(i19, -1, 7, "sns BackVideo is remux error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFakeVideoFeedToDie", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyPublishRemuxWorkResult", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoResultApi");
    }
}
