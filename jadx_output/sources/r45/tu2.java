package r45;

/* loaded from: classes2.dex */
public class tu2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public tu2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "infoList", r45.mu2.class), com.tencent.mm.protobuf.i.i(3, "offset"), com.tencent.mm.protobuf.i.i(4, "continueFlag"), com.tencent.mm.protobuf.i.s(5, "objectList", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.a(6, "lastBuff"), com.tencent.mm.protobuf.i.u(7, "requestId"), com.tencent.mm.protobuf.i.s(8, "topicInfoList", r45.t03.class), com.tencent.mm.protobuf.i.i(9, "objectContinueFlag"), com.tencent.mm.protobuf.i.i(10, "topicContinue_Flag"), com.tencent.mm.protobuf.i.s(11, "musicInfoList", r45.fj2.class), com.tencent.mm.protobuf.i.i(12, "musicContinueFlag"), com.tencent.mm.protobuf.i.r(13, "securityTips", r45.uu2.class), com.tencent.mm.protobuf.i.r(14, "hotWordInfo", r45.lu2.class), com.tencent.mm.protobuf.i.s(15, "multiFeedStream", r45.gu2.class));
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
