package r45;

/* loaded from: classes12.dex */
public class wf0 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public wf0() {
        super(com.tencent.mm.protobuf.i.i(1, "MsgId"), com.tencent.mm.protobuf.i.i(2, "Offset"), com.tencent.mm.protobuf.i.i(3, "Length"), com.tencent.mm.protobuf.i.i(5, "VoiceLength"), com.tencent.mm.protobuf.i.u(6, "ClientMsgId"), com.tencent.mm.protobuf.i.r(7, com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer.TAG, r45.cu5.class), com.tencent.mm.protobuf.i.i(8, "EndFlag"), com.tencent.mm.protobuf.i.r(9, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.i(10, "CancelFlag"), com.tencent.mm.protobuf.i.n(11, "NewMsgId"));
        this.__printBytes = true;
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(7);
    }

    @Override // r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        set(7, ieVar);
        return this;
    }
}
