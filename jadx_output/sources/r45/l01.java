package r45;

/* loaded from: classes5.dex */
public class l01 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public l01() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "liveObject", com.tencent.mm.protocal.protobuf.FinderObject.class), com.tencent.mm.protobuf.i.u(3, "realNameUrl"), com.tencent.mm.protobuf.i.r(4, "errorPage", r45.qp1.class), com.tencent.mm.protobuf.i.r(5, "live_ad_info", r45.be1.class), com.tencent.mm.protobuf.i.n(6, "bulletin_seq"), com.tencent.mm.protobuf.i.r(7, "warn_page", r45.m01.class), com.tencent.mm.protobuf.i.w(8, "co_author_head_img_url_list"));
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
