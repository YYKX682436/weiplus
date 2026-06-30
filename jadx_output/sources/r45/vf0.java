package r45;

/* loaded from: classes8.dex */
public class vf0 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public vf0() {
        super(com.tencent.mm.protobuf.i.i(1, "MsgId"), com.tencent.mm.protobuf.i.i(2, "Offset"), com.tencent.mm.protobuf.i.i(3, "Length"), com.tencent.mm.protobuf.i.u(4, "ClientMsgId"), com.tencent.mm.protobuf.i.r(5, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.n(6, "NewMsgId"), com.tencent.mm.protobuf.i.u(7, "ChatRoomName"), com.tencent.mm.protobuf.i.n(8, "MasterBufId"));
        this.__printBytes = true;
    }

    @Override // r45.my3
    public final r45.he getBaseRequest() {
        return (r45.he) getCustom(4);
    }

    @Override // r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        set(4, heVar);
        return this;
    }
}
