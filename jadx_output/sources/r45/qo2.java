package r45;

/* loaded from: classes.dex */
public class qo2 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public qo2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.u(2, "poi_name"), com.tencent.mm.protobuf.i.s(3, "line_component_list", r45.a74.class), com.tencent.mm.protobuf.i.u(4, "poi_address"), com.tencent.mm.protobuf.i.r(5, "recommend_dishes_component", r45.xk5.class));
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
