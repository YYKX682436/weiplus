package r45;

/* loaded from: classes5.dex */
public class qd2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public qd2() {
        super(com.tencent.mm.protobuf.i.r(1, "baseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "anchor_finder_username"), com.tencent.mm.protobuf.i.n(4, "object_id"), com.tencent.mm.protobuf.i.n(5, "live_id"), com.tencent.mm.protobuf.i.a(6, "live_cookies"), com.tencent.mm.protobuf.i.i(7, "update_type"), com.tencent.mm.protobuf.i.r(8, "song_list_info", r45.b32.class), com.tencent.mm.protobuf.i.r(9, "report_info", r45.dy1.class));
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
