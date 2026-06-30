package r45;

/* loaded from: classes10.dex */
public class rt6 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public rt6() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, "ClientId"), com.tencent.mm.protobuf.i.i(3, "TotalLen"), com.tencent.mm.protobuf.i.i(4, "StartPos"), com.tencent.mm.protobuf.i.i(5, "DataLen"), com.tencent.mm.protobuf.i.r(6, com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer.TAG, r45.cu5.class), com.tencent.mm.protobuf.i.u(7, "ContactUserName"), com.tencent.mm.protobuf.i.i(8, "CardImgCount"), com.tencent.mm.protobuf.i.s(9, "CardImgList", r45.fu.class));
        this.__printBytes = true;
    }

    @Override // r45.my3
    public final r45.he getBaseRequest() {
        return (r45.he) getCustom(0);
    }

    @Override // r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        set(0, heVar);
        return this;
    }
}
