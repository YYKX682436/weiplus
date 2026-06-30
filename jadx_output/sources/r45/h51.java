package r45;

/* loaded from: classes.dex */
public class h51 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public h51() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "commentInfo", com.tencent.mm.protocal.protobuf.FinderCommentInfo.class), com.tencent.mm.protobuf.i.r(3, "feedObject", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.a(4, "lastBuffer"), com.tencent.mm.protobuf.i.i(5, "commentCount"), com.tencent.mm.protobuf.i.i(6, "upContinueFlag"), com.tencent.mm.protobuf.i.i(7, "downContinueFlag"), com.tencent.mm.protobuf.i.i(8, "nextCheckObjectStatus"), com.tencent.mm.protobuf.i.i(9, "secondaryShowFlag"), com.tencent.mm.protobuf.i.s(10, "barrageCommentInfo", com.tencent.mm.protocal.protobuf.FinderCommentInfo.class), com.tencent.mm.protobuf.i.s(11, "refObjectList", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.r(12, "preload_info", r45.sq2.class), com.tencent.mm.protobuf.i.u(13, "json_resp"), com.tencent.mm.protobuf.i.s(20, "desc_comment_info", com.tencent.mm.protocal.protobuf.FinderCommentInfo.class), com.tencent.mm.protobuf.i.a(24, "async_load_info_buffer"));
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
