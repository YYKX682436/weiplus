package r45;

/* loaded from: classes5.dex */
public class k93 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public k93() {
        super(com.tencent.mm.protobuf.i.r(1, "base_request", r45.he.class), com.tencent.mm.protobuf.i.u(2, "user_agent"), com.tencent.mm.protobuf.i.u(3, "common_device_id"), com.tencent.mm.protobuf.i.u(4, "common_device_info"), com.tencent.mm.protobuf.i.a(5, "pos_id"), com.tencent.mm.protobuf.i.u(6, "vangogh_lib_version"), com.tencent.mm.protobuf.i.i(7, "teenager_mode"), com.tencent.mm.protobuf.i.i(8, "iscaremode"));
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
