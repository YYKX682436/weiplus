package r45;

/* loaded from: classes2.dex */
public class j61 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public j61() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "likeList", r45.md1.class), com.tencent.mm.protobuf.i.a(3, "lastBuffer"), com.tencent.mm.protobuf.i.i(4, "continueFlag"), com.tencent.mm.protobuf.i.i(5, "totalCount"), com.tencent.mm.protobuf.i.r(6, "redpackage_info", r45.tl6.class), com.tencent.mm.protobuf.i.r(7, "likedlist_comm_info", r45.a31.class));
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
