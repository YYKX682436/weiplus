package no0;

/* loaded from: classes3.dex */
public interface g {
    default void jumpPayEvaluate(com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
    }

    void onAcceptLiveMic(no0.a aVar);

    void onAnchorCallInterruption(boolean z17);

    void onAnchorConnectionChange(boolean z17);

    void onBattleApply();

    void onBattleClose();

    void onBattleDismiss();

    void onBattleEnd();

    void onBattleStart();

    void onCloseLiveMic(no0.f fVar);

    default void onCloseLiveMicNotify() {
    }

    default void onPayCloseCheck() {
    }

    void onPkMicLiveRoomImgChanged(r45.xn1 xn1Var);

    default void onRandomMicAccept(r45.ch1 appMsg, r45.ij1 info) {
        kotlin.jvm.internal.o.g(appMsg, "appMsg");
        kotlin.jvm.internal.o.g(info, "info");
    }

    default void onRandomMicApply(r45.kj1 info) {
        kotlin.jvm.internal.o.g(info, "info");
    }
}
