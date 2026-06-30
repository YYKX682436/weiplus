package r45;

/* loaded from: classes2.dex */
public class oa1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public oa1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "object", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.a(3, "lastBuffer"), com.tencent.mm.protobuf.i.i(4, "continueFlag"), com.tencent.mm.protobuf.i.n(5, "totalCount"), com.tencent.mm.protobuf.i.r(6, "topic", r45.r03.class), com.tencent.mm.protobuf.i.i(7, "recommendSimilarFlag"), com.tencent.mm.protobuf.i.r(8, "relatedTopic", r45.xn5.class), com.tencent.mm.protobuf.i.r(9, "subTitle", r45.ea5.class), com.tencent.mm.protobuf.i.r(10, "preloadInfo", r45.sq2.class), com.tencent.mm.protobuf.i.i(11, "up_continue_flag"), com.tencent.mm.protobuf.i.i(12, "down_continue_flag"), com.tencent.mm.protobuf.i.r(15, "collection_err_page", r45.ux0.class));
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
