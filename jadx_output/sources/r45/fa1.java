package r45;

/* loaded from: classes2.dex */
public class fa1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public fa1() {
        super(com.tencent.mm.protobuf.i.r(1, "baseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "object_id"), com.tencent.mm.protobuf.i.n(4, "subtitle_id"), com.tencent.mm.protobuf.i.n(5, "start_timestamp"), com.tencent.mm.protobuf.i.a(6, "last_buffer"), com.tencent.mm.protobuf.i.s(7, "language_req", r45.zx2.class));
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
