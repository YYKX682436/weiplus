package r45;

/* loaded from: classes2.dex */
public class rn2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public rn2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.s(3, "cmdList", r45.hx0.class), com.tencent.mm.protobuf.i.r(4, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.u(5, "session_buffer"), com.tencent.mm.protobuf.i.i(6, "op_scene"), com.tencent.mm.protobuf.i.u(7, "op_username"));
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
