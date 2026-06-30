package r45;

/* loaded from: classes2.dex */
public class w21 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public w21() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "objectId"), com.tencent.mm.protobuf.i.i(4, "optype"), com.tencent.mm.protobuf.i.u(5, "objectNonceId"), com.tencent.mm.protobuf.i.n(6, "favId"), com.tencent.mm.protobuf.i.u(7, "finderUsername"), com.tencent.mm.protobuf.i.u(8, "sessionBuffer"), com.tencent.mm.protobuf.i.i(9, "source_type"), com.tencent.mm.protobuf.i.r(12, "newlife_report_info", r45.t21.class), com.tencent.mm.protobuf.i.r(14, "show_milestone_info", r45.bc1.class));
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
