package r45;

/* loaded from: classes5.dex */
public class xt0 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public xt0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.i(3, "action_type"), com.tencent.mm.protobuf.i.u(4, "report_data"), com.tencent.mm.protobuf.i.u(5, "report_byp_data"), com.tencent.mm.protobuf.i.r(6, "advertisement_info", r45.cl2.class));
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
