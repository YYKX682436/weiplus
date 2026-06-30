package r45;

/* loaded from: classes.dex */
public class w81 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public w81() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "native_drama_id"), com.tencent.mm.protobuf.i.n(4, "from_object_id"), com.tencent.mm.protobuf.i.i(5, com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION), com.tencent.mm.protobuf.i.a(6, "up_lastbuffer"), com.tencent.mm.protobuf.i.a(7, "down_lastbuffer"), com.tencent.mm.protobuf.i.i(8, "consumer_mode"), com.tencent.mm.protobuf.i.u(9, "export_from_object_id"), com.tencent.mm.protobuf.i.u(10, "export_native_drama_id"), com.tencent.mm.protobuf.i.u(11, "stream_buffer"));
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
