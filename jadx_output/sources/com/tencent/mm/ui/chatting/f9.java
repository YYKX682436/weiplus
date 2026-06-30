package com.tencent.mm.ui.chatting;

/* loaded from: classes4.dex */
public class f9 extends java.util.HashMap {
    public f9(com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment, long j17, int i17, com.tencent.mm.storage.z3 z3Var) {
        put("conversation_session_id", java.lang.String.valueOf(j17));
        put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(i17));
        put(dm.i4.COL_USERNAME, z3Var.d1());
    }
}
