package r45;

/* loaded from: classes.dex */
public class sg1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public sg1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.i(4, "op_code"), com.tencent.mm.protobuf.i.r(5, "op_fan_club_info", r45.eq1.class), com.tencent.mm.protobuf.i.r(6, "op_custom_gift_info", r45.gg1.class));
        this.__printBytes = true;
    }

    @Override // r45.my3
    public final r45.he getBaseRequest() {
        return (r45.he) getCustom(0);
    }

    @Override // r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        set(0, heVar);
        return this;
    }
}
