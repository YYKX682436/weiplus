package r45;

/* loaded from: classes5.dex */
public class fx0 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public fx0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.i(2, "liveDurationSeconds"), com.tencent.mm.protobuf.i.i(3, "liveAudiencesNum"), com.tencent.mm.protobuf.i.i(4, "liveBeLikedNum"), com.tencent.mm.protobuf.i.i(5, "liveNewFansNum"), com.tencent.mm.protobuf.i.s(8, "live_suggestion_jump", com.tencent.mm.protocal.protobuf.FinderJumpInfo.class), com.tencent.mm.protobuf.i.r(11, "auto_gen_replay_option", r45.sl1.class));
        this.__printBytes = true;
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(0);
    }

    @Override // r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        set(0, ieVar);
        return this;
    }
}
