package r45;

/* loaded from: classes.dex */
public class xs1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public xs1() {
        super(com.tencent.mm.protobuf.i.r(1, "baseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "cur_wish_config", r45.c04.class), com.tencent.mm.protobuf.i.r(3, "recommend_wish_config", r45.c04.class), com.tencent.mm.protobuf.i.c(4, "has_valid_wish_config"), com.tencent.mm.protobuf.i.c(5, "has_valid_recommend_wish_config"), com.tencent.mm.protobuf.i.l(6, "enable_config_interaction_type"), com.tencent.mm.protobuf.i.s(7, "default_wish_config_list", r45.c04.class), com.tencent.mm.protobuf.i.c(8, "disable_set_performance_name"));
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
