package r45;

/* loaded from: classes2.dex */
public class ty0 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public ty0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.n(2, "comment_id"), com.tencent.mm.protobuf.i.u(3, "clientid"), com.tencent.mm.protobuf.i.r(4, dm.i4.COL_FINDEROBJECT, com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.s(5, "exposedComment", com.tencent.mm.protocal.protobuf.FinderCommentInfo.class), com.tencent.mm.protobuf.i.r(7, "image_info", r45.j60.class));
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
