package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class l4 {
    public l4(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.StringBuffer sb6, java.lang.String key, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        kotlin.jvm.internal.o.g(key, "key");
        if (num != null && num.intValue() == 0) {
            return;
        }
        sb6.append(key + '=' + num + '\n');
    }

    public final void b(java.lang.StringBuffer sb6, java.lang.String key, java.lang.Long l17) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        kotlin.jvm.internal.o.g(key, "key");
        if (l17 != null && l17.longValue() == 0) {
            return;
        }
        sb6.append(key + '=' + l17 + '\n');
    }

    public final void c(r45.vd6 stats, java.lang.String tag) {
        kotlin.jvm.internal.o.g(stats, "stats");
        kotlin.jvm.internal.o.g(tag, "tag");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("[Stats]\n");
        com.tencent.mm.plugin.finder.report.l4 l4Var = com.tencent.mm.plugin.finder.report.n4.f125151r0;
        l4Var.b(stringBuffer, "feedId", java.lang.Long.valueOf(stats.getLong(0)));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        r45.yw6 yw6Var = (r45.yw6) stats.getCustom(2);
        l4Var.a(stringBuffer, "vidPlayLen", yw6Var != null ? java.lang.Integer.valueOf(yw6Var.getInteger(0)) : null);
        r45.yw6 yw6Var2 = (r45.yw6) stats.getCustom(2);
        l4Var.a(stringBuffer, "stayTime", yw6Var2 != null ? java.lang.Integer.valueOf(yw6Var2.getInteger(1)) : null);
        r45.yw6 yw6Var3 = (r45.yw6) stats.getCustom(2);
        l4Var.b(stringBuffer, "stayTimeMs", yw6Var3 != null ? java.lang.Long.valueOf(yw6Var3.getLong(2)) : null);
        r45.yw6 yw6Var4 = (r45.yw6) stats.getCustom(2);
        l4Var.b(stringBuffer, "vidPlayTimeMs", yw6Var4 != null ? java.lang.Long.valueOf(yw6Var4.getLong(3)) : null);
        r45.yw6 yw6Var5 = (r45.yw6) stats.getCustom(2);
        l4Var.b(stringBuffer, "vidPlayingTimeMs", yw6Var5 != null ? java.lang.Long.valueOf(yw6Var5.getLong(4)) : null);
        r45.yw6 yw6Var6 = (r45.yw6) stats.getCustom(2);
        l4Var.b(stringBuffer, "exposeTimeMs", yw6Var6 != null ? java.lang.Long.valueOf(yw6Var6.getLong(5)) : null);
        r45.yw6 yw6Var7 = (r45.yw6) stats.getCustom(2);
        l4Var.b(stringBuffer, "startPlayTime", yw6Var7 != null ? java.lang.Long.valueOf(yw6Var7.getLong(6)) : null);
        r45.yw6 yw6Var8 = (r45.yw6) stats.getCustom(2);
        l4Var.b(stringBuffer, "endPlayTime", yw6Var8 != null ? java.lang.Long.valueOf(yw6Var8.getLong(7)) : null);
        r45.yw6 yw6Var9 = (r45.yw6) stats.getCustom(2);
        l4Var.b(stringBuffer, "lastPlayTime", yw6Var9 != null ? java.lang.Long.valueOf(yw6Var9.getLong(8)) : null);
        r45.yw6 yw6Var10 = (r45.yw6) stats.getCustom(2);
        l4Var.b(stringBuffer, "stopTimes", yw6Var10 != null ? java.lang.Long.valueOf(yw6Var10.getLong(9)) : null);
        r45.yw6 yw6Var11 = (r45.yw6) stats.getCustom(2);
        l4Var.a(stringBuffer, "autoPlay", yw6Var11 != null ? java.lang.Integer.valueOf(yw6Var11.getInteger(10)) : null);
        r45.q25 q25Var = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, ya.a.SHARE, q25Var != null ? java.lang.Integer.valueOf(q25Var.getInteger(7)) : null);
        r45.q25 q25Var2 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "forward_times", q25Var2 != null ? java.lang.Integer.valueOf(q25Var2.getInteger(4)) : null);
        r45.q25 q25Var3 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "feed_stay_time", q25Var3 != null ? java.lang.Integer.valueOf(q25Var3.getInteger(2)) : null);
        r45.q25 q25Var4 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "vid_replay_times", q25Var4 != null ? java.lang.Integer.valueOf(q25Var4.getInteger(3)) : null);
        r45.q25 q25Var5 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "max_vid_play_progress", q25Var5 != null ? java.lang.Integer.valueOf(q25Var5.getInteger(1)) : null);
        r45.q25 q25Var6 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "pageTurn", q25Var6 != null ? java.lang.Integer.valueOf(q25Var6.getInteger(0)) : null);
        r45.q25 q25Var7 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "clickComment", q25Var7 != null ? java.lang.Integer.valueOf(q25Var7.getInteger(5)) : null);
        r45.q25 q25Var8 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "clickHead", q25Var8 != null ? java.lang.Integer.valueOf(q25Var8.getInteger(6)) : null);
        r45.q25 q25Var9 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "likeStatus", q25Var9 != null ? java.lang.Integer.valueOf(q25Var9.getInteger(9)) : null);
        r45.q25 q25Var10 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "followStatus", q25Var10 != null ? java.lang.Integer.valueOf(q25Var10.getInteger(8)) : null);
        r45.q25 q25Var11 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "favStatus", q25Var11 != null ? java.lang.Integer.valueOf(q25Var11.getInteger(11)) : null);
        r45.q25 q25Var12 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "notInterestAction", q25Var12 != null ? java.lang.Integer.valueOf(q25Var12.getInteger(15)) : null);
        r45.q25 q25Var13 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "fastSlip", q25Var13 != null ? java.lang.Integer.valueOf(q25Var13.getInteger(12)) : null);
        r45.q25 q25Var14 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "sortId", q25Var14 != null ? java.lang.Integer.valueOf(q25Var14.getInteger(13)) : null);
        r45.q25 q25Var15 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "maxVidPlayLen", q25Var15 != null ? java.lang.Integer.valueOf(q25Var15.getInteger(14)) : null);
        r45.q25 q25Var16 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "clickTopicTimes", q25Var16 != null ? java.lang.Integer.valueOf(q25Var16.getInteger(16)) : null);
        r45.q25 q25Var17 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "expandTextTimes", q25Var17 != null ? java.lang.Integer.valueOf(q25Var17.getInteger(17)) : null);
        r45.q25 q25Var18 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "shareMomentTimes", q25Var18 != null ? java.lang.Integer.valueOf(q25Var18.getInteger(18)) : null);
        r45.q25 q25Var19 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "clickPoiTimes", q25Var19 != null ? java.lang.Integer.valueOf(q25Var19.getInteger(19)) : null);
        r45.q25 q25Var20 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "collapseTextTimes", q25Var20 != null ? java.lang.Integer.valueOf(q25Var20.getInteger(20)) : null);
        r45.q25 q25Var21 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "commentLikeTimes", q25Var21 != null ? java.lang.Integer.valueOf(q25Var21.getInteger(21)) : null);
        r45.q25 q25Var22 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "clickFeedMenu", q25Var22 != null ? java.lang.Integer.valueOf(q25Var22.getInteger(22)) : null);
        r45.q25 q25Var23 = (r45.q25) stats.getCustom(3);
        l4Var.a(stringBuffer, "complainTimes", q25Var23 != null ? java.lang.Integer.valueOf(q25Var23.getInteger(23)) : null);
        l4Var.b(stringBuffer, "actionTimeMs", java.lang.Long.valueOf(stats.getLong(6)));
        l4Var.a(stringBuffer, "feedScene", java.lang.Integer.valueOf(stats.getInteger(7)));
        java.lang.String string = stats.getString(8);
        l4Var.a(stringBuffer, "sessionBuffer", string != null ? java.lang.Integer.valueOf(string.length()) : null);
        r45.q25 q25Var24 = (r45.q25) stats.getCustom(3);
        r45.h85 h85Var = q25Var24 != null ? (r45.h85) q25Var24.getCustom(29) : null;
        if (h85Var != null) {
            stringBuffer.append("picStats = " + h85Var.toJSON() + '\n');
        }
        com.tencent.mars.xlog.Log.i(tag, stringBuffer.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:355:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.vd6 d(com.tencent.mm.plugin.finder.report.n4 r26, r45.qt2 r27) {
        /*
            Method dump skipped, instructions count: 2046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.l4.d(com.tencent.mm.plugin.finder.report.n4, r45.qt2):r45.vd6");
    }
}
