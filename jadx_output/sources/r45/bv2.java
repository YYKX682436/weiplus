package r45;

/* loaded from: classes5.dex */
public class bv2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public bv2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "liveId"), com.tencent.mm.protobuf.i.a(4, "anchorStatusBuffer"), com.tencent.mm.protobuf.i.n(5, "objectId"), com.tencent.mm.protobuf.i.u(6, "finderUsername"), com.tencent.mm.protobuf.i.i(7, "liveStatus"), com.tencent.mm.protobuf.i.u(8, "object_nonce_id"), com.tencent.mm.protobuf.i.n(9, "anchor_status_op_flag"), com.tencent.mm.protobuf.i.n(10, "anchor_setting_op_flag"), com.tencent.mm.protobuf.i.r(11, "start_report_info", r45.rw2.class), com.tencent.mm.protobuf.i.a(12, "create_live_bubble_buffer"));
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
