package r45;

/* loaded from: classes.dex */
public class it1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public it1() {
        super(com.tencent.mm.protobuf.i.r(1, "baseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "object_id"), com.tencent.mm.protobuf.i.u(4, "mic_id"), com.tencent.mm.protobuf.i.n(5, "uin"), com.tencent.mm.protobuf.i.n(6, "mic_start_time"), com.tencent.mm.protobuf.i.n(7, "mic_end_time"), com.tencent.mm.protobuf.i.n(8, "replay_type"));
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
