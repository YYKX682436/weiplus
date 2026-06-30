package r45;

/* loaded from: classes8.dex */
public class ov4 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ov4() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.r(3, "KeyBuf", r45.cu5.class), com.tencent.mm.protobuf.i.u(4, "finder_username"), com.tencent.mm.protobuf.i.r(5, "new_life_expose", r45.hv4.class), com.tencent.mm.protobuf.i.a(6, "client_ai_info"), com.tencent.mm.protobuf.i.r(7, "client_status", r45.ky2.class), com.tencent.mm.protobuf.i.w(8, "multi_finder_username"), com.tencent.mm.protobuf.i.g(9, "longitude"), com.tencent.mm.protobuf.i.g(10, "latitude"), com.tencent.mm.protobuf.i.r(11, "entrance_expose_content", r45.el0.class), com.tencent.mm.protobuf.i.a(12, "last_buffer"), com.tencent.mm.protobuf.i.a(13, "reliable_notify_buff"), com.tencent.mm.protobuf.i.i(15, "lbs_cache_time"));
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
