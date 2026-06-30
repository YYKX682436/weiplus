package r45;

/* loaded from: classes12.dex */
public class cv6 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public cv6() {
        super(com.tencent.mm.protobuf.i.u(1, "FromUserName"), com.tencent.mm.protobuf.i.u(2, "ToUserName"), com.tencent.mm.protobuf.i.i(3, "Offset"), com.tencent.mm.protobuf.i.i(4, "Length"), com.tencent.mm.protobuf.i.u(5, "ClientMsgId"), com.tencent.mm.protobuf.i.i(6, "MsgId"), com.tencent.mm.protobuf.i.i(7, "VoiceLength"), com.tencent.mm.protobuf.i.r(8, com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer.TAG, r45.cu5.class), com.tencent.mm.protobuf.i.i(9, "EndFlag"), com.tencent.mm.protobuf.i.r(10, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.i(11, "CancelFlag"), com.tencent.mm.protobuf.i.u(12, "MsgSource"), com.tencent.mm.protobuf.i.i(13, "VoiceFormat"), com.tencent.mm.protobuf.i.i(14, "UICreateTime"), com.tencent.mm.protobuf.i.i(15, "ForwardFlag"), com.tencent.mm.protobuf.i.n(16, "NewMsgId"), com.tencent.mm.protobuf.i.i(17, "ReqTime"), com.tencent.mm.protobuf.i.u(19, "SendMsgTicket"), com.tencent.mm.protobuf.i.u(20, "aesKey"), com.tencent.mm.protobuf.i.u(21, "voiceUrl"), com.tencent.mm.protobuf.i.u(24, "ExtCommonInfoXml"));
        this.__printBytes = true;
    }

    @Override // r45.my3
    public final r45.he getBaseRequest() {
        return (r45.he) getCustom(9);
    }

    @Override // r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        set(9, heVar);
        return this;
    }
}
