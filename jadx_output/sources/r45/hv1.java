package r45;

/* loaded from: classes5.dex */
public class hv1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public hv1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "game_user_info_list", r45.n73.class), com.tencent.mm.protobuf.i.r(3, "error_page", r45.qp1.class), com.tencent.mm.protobuf.i.i(4, "show_search_more_games"), com.tencent.mm.protobuf.i.s(6, "game_category_list", r45.a63.class), com.tencent.mm.protobuf.i.c(7, "need_clear_client_local_cache"));
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
