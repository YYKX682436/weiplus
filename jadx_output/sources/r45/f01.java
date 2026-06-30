package r45;

/* loaded from: classes5.dex */
public class f01 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public f01() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.u(2, "game_live_prepare_buff"), com.tencent.mm.protobuf.i.i(3, "no_need_redirect"), com.tencent.mm.protobuf.i.r(4, "warn_page", r45.m01.class), com.tencent.mm.protobuf.i.c(5, "not_pass_openid_to_game"), com.tencent.mm.protobuf.i.r(6, "promotion_entrance", r45.j52.class), com.tencent.mm.protobuf.i.r(7, "cover_img", com.tencent.mm.protocal.protobuf.FinderMedia.class));
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
