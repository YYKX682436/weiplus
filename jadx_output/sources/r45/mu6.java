package r45;

/* loaded from: classes12.dex */
public class mu6 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public mu6() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.i(2, "MsgId"), com.tencent.mm.protobuf.i.r(3, "ClientImgId", r45.du5.class), com.tencent.mm.protobuf.i.r(4, "FromUserName", r45.du5.class), com.tencent.mm.protobuf.i.r(5, "ToUserName", r45.du5.class), com.tencent.mm.protobuf.i.i(6, "TotalLen"), com.tencent.mm.protobuf.i.i(7, "StartPos"), com.tencent.mm.protobuf.i.i(8, "DataLen"), com.tencent.mm.protobuf.i.i(9, "CreateTime"), com.tencent.mm.protobuf.i.n(10, "NewMsgId"), com.tencent.mm.protobuf.i.u(11, "AESKey"), com.tencent.mm.protobuf.i.u(12, "FileId"), com.tencent.mm.protobuf.i.u(13, "MsgSource"), com.tencent.mm.protobuf.i.i(14, "ActionFlag"));
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
