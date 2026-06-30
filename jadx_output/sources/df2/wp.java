package df2;

/* loaded from: classes10.dex */
public abstract class wp {
    public static final void a(com.tencent.mm.autogen.mmdata.rpt.LiveRoomPlayStatusStruct liveRoomPlayStatusStruct, long j17, int i17, java.lang.String curPlayUrl, long j18, java.lang.String liveId, java.lang.String anchorName) {
        kotlin.jvm.internal.o.g(liveRoomPlayStatusStruct, "<this>");
        kotlin.jvm.internal.o.g(curPlayUrl, "curPlayUrl");
        kotlin.jvm.internal.o.g(liveId, "liveId");
        kotlin.jvm.internal.o.g(anchorName, "anchorName");
        liveRoomPlayStatusStruct.f58654d = java.lang.System.currentTimeMillis();
        liveRoomPlayStatusStruct.f58655e = i17;
        liveRoomPlayStatusStruct.f58656f = j18 / 1000;
        liveRoomPlayStatusStruct.f58657g = j17;
        liveRoomPlayStatusStruct.f58661k = liveRoomPlayStatusStruct.b(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL, r26.i0.t(curPlayUrl, ",", "_", false), true);
        liveRoomPlayStatusStruct.f58658h = liveRoomPlayStatusStruct.b("streamId", ko0.t.f309903a.d(curPlayUrl), true);
        liveRoomPlayStatusStruct.f58659i = liveRoomPlayStatusStruct.b("liveid", liveId, true);
        liveRoomPlayStatusStruct.f58660j = liveRoomPlayStatusStruct.b("anchorNickname", anchorName, true);
        liveRoomPlayStatusStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) ((zy2.qa) i95.n0.c(zy2.qa.class))).Zk(liveRoomPlayStatusStruct);
    }
}
