package r45;

/* loaded from: classes.dex */
public class d71 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public d71() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "liked_list", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.a(3, "lastBuffer"), com.tencent.mm.protobuf.i.i(4, "continueFlag"), com.tencent.mm.protobuf.i.i(5, "totalCount"), com.tencent.mm.protobuf.i.u(6, "noMoreWording"), com.tencent.mm.protobuf.i.i(7, "megaVideoTotalCount"), com.tencent.mm.protobuf.i.i(8, "finderTotalCount"), com.tencent.mm.protobuf.i.r(9, "preload_info", r45.sq2.class));
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
