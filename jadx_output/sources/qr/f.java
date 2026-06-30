package qr;

/* loaded from: classes12.dex */
public final class f implements gr.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qr.h f366010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f366011b;

    public f(qr.h hVar, long j17) {
        this.f366010a = hVar;
        this.f366011b = j17;
    }

    public void a(int i17, java.lang.String str, java.lang.String str2) {
        boolean z17;
        qr.h hVar = this.f366010a;
        com.tencent.mars.xlog.Log.i(hVar.f366015g, "uploadCallback: " + i17 + ", " + str);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        hVar.f366017i = java.lang.System.currentTimeMillis() - this.f366011b;
        if (i17 == 0) {
            hVar.getClass();
            java.lang.String str3 = hVar.f366015g;
            com.tencent.mars.xlog.Log.i(str3, "handleSuccess gifMd5:" + str);
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = hVar.f366014f;
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.b(20, hVar.f366016h, 0L, 0L, 0L, 0L, hVar.f366017i, 0, 0, emojiInfo.field_captureScene);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10431, 7, emojiInfo.getMd5(), emojiInfo.field_designerID, emojiInfo.field_groupId, 0, 0, java.lang.Integer.valueOf(emojiInfo.field_size), c01.z1.r(), emojiInfo.field_activityid);
            if (!hVar.f366018m || gr.z.b()) {
                hVar.b(fp0.u.f265290f);
                qr.e.f366008a.a(hVar.f366016h, true, str);
                return;
            } else {
                com.tencent.mars.xlog.Log.w(str3, "upload wxam but not decode, load gif");
                new cr.k(emojiInfo, new cr.l(emojiInfo, new qr.g(hVar, str)));
                return;
            }
        }
        hVar.getClass();
        com.tencent.mars.xlog.Log.e(hVar.f366015g, "handleFail errorCode:" + i17);
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = hVar.f366014f;
        emojiInfo2.getClass();
        emojiInfo2.field_captureStatus = 4;
        int i18 = emojiInfo2.field_captureScene;
        long j17 = hVar.f366016h;
        switch (i17) {
            case 1:
                z17 = true;
                com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.f(j17, 1, i18);
                emojiInfo2.field_captureUploadErrCode = 5;
                break;
            case 2:
                z17 = true;
                com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.f(j17, 2, i18);
                emojiInfo2.field_captureUploadErrCode = 8;
                break;
            case 3:
            default:
                z17 = true;
                com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.f(j17, 3, i18);
                emojiInfo2.field_captureUploadErrCode = 6;
                break;
            case 4:
                z17 = true;
                com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.f(j17, 5, i18);
                emojiInfo2.field_captureUploadErrCode = 4;
                break;
            case 5:
                com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.f(j17, 7, i18);
                z17 = true;
                emojiInfo2.field_captureUploadErrCode = 1;
                break;
            case 6:
                com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.f(j17, 8, i18);
                emojiInfo2.field_captureUploadErrCode = 2;
                z17 = true;
                break;
            case 7:
                com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.f(j17, 9, i18);
                emojiInfo2.field_captureUploadErrCode = 3;
                z17 = true;
                break;
            case 8:
                com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.f(j17, 6, i18);
                emojiInfo2.field_captureUploadErrCode = 9;
                z17 = true;
                break;
            case 9:
                com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.f(j17, 10, i18);
                emojiInfo2.field_captureUploadErrCode = 10;
                z17 = true;
                break;
            case 10:
                com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.f(j17, 4, i18);
                emojiInfo2.field_captureUploadErrCode = 7;
                z17 = true;
                break;
            case 11:
                com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.f(j17, 3, i18);
                emojiInfo2.field_captureUploadErrCode = 10;
                z17 = true;
                break;
        }
        gr.t.g().m(z17);
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().G2(emojiInfo2);
        qr.e.f366008a.a(j17, false, null);
        hVar.b(fp0.u.f265291g);
    }
}
