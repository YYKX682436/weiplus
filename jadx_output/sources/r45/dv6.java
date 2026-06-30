package r45;

/* loaded from: classes12.dex */
public class dv6 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public dv6() {
        super(com.tencent.mm.protobuf.i.u(1, "FromUserName"), com.tencent.mm.protobuf.i.u(2, "ToUserName"), com.tencent.mm.protobuf.i.i(3, "Offset"), com.tencent.mm.protobuf.i.i(4, "Length"), com.tencent.mm.protobuf.i.i(5, "CreateTime"), com.tencent.mm.protobuf.i.u(6, "ClientMsgId"), com.tencent.mm.protobuf.i.i(7, "MsgId"), com.tencent.mm.protobuf.i.i(8, "VoiceLength"), com.tencent.mm.protobuf.i.i(9, "EndFlag"), com.tencent.mm.protobuf.i.r(10, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.i(11, "CancelFlag"), com.tencent.mm.protobuf.i.n(12, "NewMsgId"), com.tencent.mm.protobuf.i.i(13, "ActionFlag"));
        this.__printBytes = true;
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(9);
    }

    @Override // r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        set(9, ieVar);
        return this;
    }
}
