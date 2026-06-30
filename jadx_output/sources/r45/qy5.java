package r45;

/* loaded from: classes9.dex */
public class qy5 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public qy5() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.u(2, "AppId"), com.tencent.mm.protobuf.i.u(3, "FromUserName"), com.tencent.mm.protobuf.i.u(4, "ToUserName"), com.tencent.mm.protobuf.i.i(5, "MsgId"), com.tencent.mm.protobuf.i.u(6, "ClientMsgId"), com.tencent.mm.protobuf.i.i(7, "CreateTime"), com.tencent.mm.protobuf.i.i(8, "Type"), com.tencent.mm.protobuf.i.n(9, "NewMsgId"), com.tencent.mm.protobuf.i.u(10, "AESKey"), com.tencent.mm.protobuf.i.u(11, "MsgSource"), com.tencent.mm.protobuf.i.i(12, "ActionFlag"), com.tencent.mm.protobuf.i.u(13, "FileUploadFinishBuffer"), com.tencent.mm.protobuf.i.u(14, "ExtCommonInfoXml"));
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
