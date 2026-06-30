package r45;

/* loaded from: classes2.dex */
public class j51 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public j51() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "commentInfo", com.tencent.mm.protocal.protobuf.FinderCommentInfo.class), com.tencent.mm.protobuf.i.r(3, "countInfo", r45.ll2.class), com.tencent.mm.protobuf.i.a(4, "lastBuffer"), com.tencent.mm.protobuf.i.i(5, "upContinueFlag"), com.tencent.mm.protobuf.i.i(6, "downContinueFlag"), com.tencent.mm.protobuf.i.r(7, "descComment", com.tencent.mm.protocal.protobuf.FinderCommentInfo.class), com.tencent.mm.protobuf.i.r(8, "monotonic_data", r45.pm2.class), com.tencent.mm.protobuf.i.r(12, "prompt_info", r45.uy0.class), com.tencent.mm.protobuf.i.r(13, "sort_ctrl", r45.vy0.class), com.tencent.mm.protobuf.i.r(14, "half_sheet_info", r45.xq2.class), com.tencent.mm.protobuf.i.s(15, "emoji_desc_comments", com.tencent.mm.protocal.protobuf.FinderCommentInfo.class), com.tencent.mm.protobuf.i.s(16, "desc_comments", com.tencent.mm.protocal.protobuf.FinderCommentInfo.class), com.tencent.mm.protobuf.i.n(17, "option_flag"));
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
