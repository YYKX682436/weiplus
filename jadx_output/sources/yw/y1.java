package yw;

/* loaded from: classes11.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.y1 f466511a = new yw.y1();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.pigeon.biz_base.BizEnterStatusInfo f466512b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f466513c = true;

    /* renamed from: d, reason: collision with root package name */
    public static long f466514d;

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Intent r41) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw.y1.a(android.content.Intent):void");
    }

    public final void b(boolean z17) {
        com.tencent.pigeon.biz_base.BizEnterStatusInfo bizEnterStatusInfo = f466512b;
        f466512b = bizEnterStatusInfo != null ? bizEnterStatusInfo.copy((r44 & 1) != 0 ? bizEnterStatusInfo.enterSource : null, (r44 & 2) != 0 ? bizEnterStatusInfo.openArticleFromScene : null, (r44 & 4) != 0 ? bizEnterStatusInfo.isTeenMode : null, (r44 & 8) != 0 ? bizEnterStatusInfo.redDotCount : null, (r44 & 16) != 0 ? bizEnterStatusInfo.pos : null, (r44 & 32) != 0 ? bizEnterStatusInfo.finderLiveRedDotType : null, (r44 & 64) != 0 ? bizEnterStatusInfo.finderFeedExportId : null, (r44 & 128) != 0 ? bizEnterStatusInfo.exposeMsgType : null, (r44 & 256) != 0 ? bizEnterStatusInfo.exposeUserName : null, (r44 & 512) != 0 ? bizEnterStatusInfo.lastExposeId : null, (r44 & 1024) != 0 ? bizEnterStatusInfo.lastExposeMsgId : null, (r44 & 2048) != 0 ? bizEnterStatusInfo.lastExposeMid : null, (r44 & 4096) != 0 ? bizEnterStatusInfo.sessionId : null, (r44 & 8192) != 0 ? bizEnterStatusInfo.enterTime : null, (r44 & 16384) != 0 ? bizEnterStatusInfo.netType : null, (r44 & 32768) != 0 ? bizEnterStatusInfo.isHeadsetOn : null, (r44 & 65536) != 0 ? bizEnterStatusInfo.redDotReportItem : null, (r44 & 131072) != 0 ? bizEnterStatusInfo.createEngineGroup : null, (r44 & 262144) != 0 ? bizEnterStatusInfo.createEngine : java.lang.Boolean.valueOf(z17), (r44 & 524288) != 0 ? bizEnterStatusInfo.startOpenTime : null, (r44 & 1048576) != 0 ? bizEnterStatusInfo.endOnEnterTime : null, (r44 & 2097152) != 0 ? bizEnterStatusInfo.startCreateEngineGroupTime : null, (r44 & 4194304) != 0 ? bizEnterStatusInfo.startCreateEngineTime : null, (r44 & 8388608) != 0 ? bizEnterStatusInfo.startShowFlutterPageTime : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? bizEnterStatusInfo.firstGroupMsgCount : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? bizEnterStatusInfo.reddotReportInfo : null) : null;
    }

    public final void c() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.pigeon.biz_base.BizEnterStatusInfo bizEnterStatusInfo = f466512b;
        f466512b = bizEnterStatusInfo != null ? bizEnterStatusInfo.copy((r44 & 1) != 0 ? bizEnterStatusInfo.enterSource : null, (r44 & 2) != 0 ? bizEnterStatusInfo.openArticleFromScene : null, (r44 & 4) != 0 ? bizEnterStatusInfo.isTeenMode : null, (r44 & 8) != 0 ? bizEnterStatusInfo.redDotCount : null, (r44 & 16) != 0 ? bizEnterStatusInfo.pos : null, (r44 & 32) != 0 ? bizEnterStatusInfo.finderLiveRedDotType : null, (r44 & 64) != 0 ? bizEnterStatusInfo.finderFeedExportId : null, (r44 & 128) != 0 ? bizEnterStatusInfo.exposeMsgType : null, (r44 & 256) != 0 ? bizEnterStatusInfo.exposeUserName : null, (r44 & 512) != 0 ? bizEnterStatusInfo.lastExposeId : null, (r44 & 1024) != 0 ? bizEnterStatusInfo.lastExposeMsgId : null, (r44 & 2048) != 0 ? bizEnterStatusInfo.lastExposeMid : null, (r44 & 4096) != 0 ? bizEnterStatusInfo.sessionId : null, (r44 & 8192) != 0 ? bizEnterStatusInfo.enterTime : null, (r44 & 16384) != 0 ? bizEnterStatusInfo.netType : null, (r44 & 32768) != 0 ? bizEnterStatusInfo.isHeadsetOn : null, (r44 & 65536) != 0 ? bizEnterStatusInfo.redDotReportItem : null, (r44 & 131072) != 0 ? bizEnterStatusInfo.createEngineGroup : null, (r44 & 262144) != 0 ? bizEnterStatusInfo.createEngine : null, (r44 & 524288) != 0 ? bizEnterStatusInfo.startOpenTime : null, (r44 & 1048576) != 0 ? bizEnterStatusInfo.endOnEnterTime : java.lang.Long.valueOf(currentTimeMillis), (r44 & 2097152) != 0 ? bizEnterStatusInfo.startCreateEngineGroupTime : null, (r44 & 4194304) != 0 ? bizEnterStatusInfo.startCreateEngineTime : null, (r44 & 8388608) != 0 ? bizEnterStatusInfo.startShowFlutterPageTime : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? bizEnterStatusInfo.firstGroupMsgCount : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? bizEnterStatusInfo.reddotReportInfo : null) : null;
    }

    public final void d() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.pigeon.biz_base.BizEnterStatusInfo bizEnterStatusInfo = f466512b;
        f466512b = bizEnterStatusInfo != null ? bizEnterStatusInfo.copy((r44 & 1) != 0 ? bizEnterStatusInfo.enterSource : null, (r44 & 2) != 0 ? bizEnterStatusInfo.openArticleFromScene : null, (r44 & 4) != 0 ? bizEnterStatusInfo.isTeenMode : null, (r44 & 8) != 0 ? bizEnterStatusInfo.redDotCount : null, (r44 & 16) != 0 ? bizEnterStatusInfo.pos : null, (r44 & 32) != 0 ? bizEnterStatusInfo.finderLiveRedDotType : null, (r44 & 64) != 0 ? bizEnterStatusInfo.finderFeedExportId : null, (r44 & 128) != 0 ? bizEnterStatusInfo.exposeMsgType : null, (r44 & 256) != 0 ? bizEnterStatusInfo.exposeUserName : null, (r44 & 512) != 0 ? bizEnterStatusInfo.lastExposeId : null, (r44 & 1024) != 0 ? bizEnterStatusInfo.lastExposeMsgId : null, (r44 & 2048) != 0 ? bizEnterStatusInfo.lastExposeMid : null, (r44 & 4096) != 0 ? bizEnterStatusInfo.sessionId : null, (r44 & 8192) != 0 ? bizEnterStatusInfo.enterTime : null, (r44 & 16384) != 0 ? bizEnterStatusInfo.netType : null, (r44 & 32768) != 0 ? bizEnterStatusInfo.isHeadsetOn : null, (r44 & 65536) != 0 ? bizEnterStatusInfo.redDotReportItem : null, (r44 & 131072) != 0 ? bizEnterStatusInfo.createEngineGroup : null, (r44 & 262144) != 0 ? bizEnterStatusInfo.createEngine : null, (r44 & 524288) != 0 ? bizEnterStatusInfo.startOpenTime : null, (r44 & 1048576) != 0 ? bizEnterStatusInfo.endOnEnterTime : null, (r44 & 2097152) != 0 ? bizEnterStatusInfo.startCreateEngineGroupTime : null, (r44 & 4194304) != 0 ? bizEnterStatusInfo.startCreateEngineTime : java.lang.Long.valueOf(currentTimeMillis), (r44 & 8388608) != 0 ? bizEnterStatusInfo.startShowFlutterPageTime : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? bizEnterStatusInfo.firstGroupMsgCount : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? bizEnterStatusInfo.reddotReportInfo : null) : null;
    }

    public final void e() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.pigeon.biz_base.BizEnterStatusInfo bizEnterStatusInfo = f466512b;
        f466512b = bizEnterStatusInfo != null ? bizEnterStatusInfo.copy((r44 & 1) != 0 ? bizEnterStatusInfo.enterSource : null, (r44 & 2) != 0 ? bizEnterStatusInfo.openArticleFromScene : null, (r44 & 4) != 0 ? bizEnterStatusInfo.isTeenMode : null, (r44 & 8) != 0 ? bizEnterStatusInfo.redDotCount : null, (r44 & 16) != 0 ? bizEnterStatusInfo.pos : null, (r44 & 32) != 0 ? bizEnterStatusInfo.finderLiveRedDotType : null, (r44 & 64) != 0 ? bizEnterStatusInfo.finderFeedExportId : null, (r44 & 128) != 0 ? bizEnterStatusInfo.exposeMsgType : null, (r44 & 256) != 0 ? bizEnterStatusInfo.exposeUserName : null, (r44 & 512) != 0 ? bizEnterStatusInfo.lastExposeId : null, (r44 & 1024) != 0 ? bizEnterStatusInfo.lastExposeMsgId : null, (r44 & 2048) != 0 ? bizEnterStatusInfo.lastExposeMid : null, (r44 & 4096) != 0 ? bizEnterStatusInfo.sessionId : null, (r44 & 8192) != 0 ? bizEnterStatusInfo.enterTime : null, (r44 & 16384) != 0 ? bizEnterStatusInfo.netType : null, (r44 & 32768) != 0 ? bizEnterStatusInfo.isHeadsetOn : null, (r44 & 65536) != 0 ? bizEnterStatusInfo.redDotReportItem : null, (r44 & 131072) != 0 ? bizEnterStatusInfo.createEngineGroup : null, (r44 & 262144) != 0 ? bizEnterStatusInfo.createEngine : null, (r44 & 524288) != 0 ? bizEnterStatusInfo.startOpenTime : null, (r44 & 1048576) != 0 ? bizEnterStatusInfo.endOnEnterTime : null, (r44 & 2097152) != 0 ? bizEnterStatusInfo.startCreateEngineGroupTime : java.lang.Long.valueOf(currentTimeMillis), (r44 & 4194304) != 0 ? bizEnterStatusInfo.startCreateEngineTime : null, (r44 & 8388608) != 0 ? bizEnterStatusInfo.startShowFlutterPageTime : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? bizEnterStatusInfo.firstGroupMsgCount : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? bizEnterStatusInfo.reddotReportInfo : null) : null;
    }

    public final void f() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        f466514d = currentTimeMillis;
        com.tencent.pigeon.biz_base.BizEnterStatusInfo bizEnterStatusInfo = f466512b;
        f466512b = bizEnterStatusInfo != null ? bizEnterStatusInfo.copy((r44 & 1) != 0 ? bizEnterStatusInfo.enterSource : null, (r44 & 2) != 0 ? bizEnterStatusInfo.openArticleFromScene : null, (r44 & 4) != 0 ? bizEnterStatusInfo.isTeenMode : null, (r44 & 8) != 0 ? bizEnterStatusInfo.redDotCount : null, (r44 & 16) != 0 ? bizEnterStatusInfo.pos : null, (r44 & 32) != 0 ? bizEnterStatusInfo.finderLiveRedDotType : null, (r44 & 64) != 0 ? bizEnterStatusInfo.finderFeedExportId : null, (r44 & 128) != 0 ? bizEnterStatusInfo.exposeMsgType : null, (r44 & 256) != 0 ? bizEnterStatusInfo.exposeUserName : null, (r44 & 512) != 0 ? bizEnterStatusInfo.lastExposeId : null, (r44 & 1024) != 0 ? bizEnterStatusInfo.lastExposeMsgId : null, (r44 & 2048) != 0 ? bizEnterStatusInfo.lastExposeMid : null, (r44 & 4096) != 0 ? bizEnterStatusInfo.sessionId : null, (r44 & 8192) != 0 ? bizEnterStatusInfo.enterTime : null, (r44 & 16384) != 0 ? bizEnterStatusInfo.netType : null, (r44 & 32768) != 0 ? bizEnterStatusInfo.isHeadsetOn : null, (r44 & 65536) != 0 ? bizEnterStatusInfo.redDotReportItem : null, (r44 & 131072) != 0 ? bizEnterStatusInfo.createEngineGroup : null, (r44 & 262144) != 0 ? bizEnterStatusInfo.createEngine : null, (r44 & 524288) != 0 ? bizEnterStatusInfo.startOpenTime : java.lang.Long.valueOf(currentTimeMillis), (r44 & 1048576) != 0 ? bizEnterStatusInfo.endOnEnterTime : null, (r44 & 2097152) != 0 ? bizEnterStatusInfo.startCreateEngineGroupTime : null, (r44 & 4194304) != 0 ? bizEnterStatusInfo.startCreateEngineTime : null, (r44 & 8388608) != 0 ? bizEnterStatusInfo.startShowFlutterPageTime : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? bizEnterStatusInfo.firstGroupMsgCount : null, (r44 & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0 ? bizEnterStatusInfo.reddotReportInfo : null) : null;
    }
}
