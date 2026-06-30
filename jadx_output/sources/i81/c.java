package i81;

/* loaded from: classes7.dex */
public class c extends java.util.HashMap {
    public c(long j17, boolean z17, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2) {
        put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "wxapp_front_ad_hot_launch");
        put("value", java.lang.Long.valueOf(j17));
        put("exptid", java.lang.Integer.valueOf(z17 ? pInt.value : -1));
        put("groupid", java.lang.Integer.valueOf(z17 ? pInt2.value : -1));
    }
}
