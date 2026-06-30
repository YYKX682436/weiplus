package r45;

/* loaded from: classes.dex */
public class cu2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public cu2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "last_buff"), com.tencent.mm.protobuf.i.u(4, "query"), com.tencent.mm.protobuf.i.u(5, "request_id"), com.tencent.mm.protobuf.i.u(6, "finder_nickname"), com.tencent.mm.protobuf.i.u(7, "event_name"), com.tencent.mm.protobuf.i.n(8, "topic_id"), com.tencent.mm.protobuf.i.r(11, "attach_ext_info", r45.ip2.class));
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
