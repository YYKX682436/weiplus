package r45;

/* loaded from: classes2.dex */
public class yo2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public yo2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(3, "last_buffer"), com.tencent.mm.protobuf.i.g(4, "longitude"), com.tencent.mm.protobuf.i.g(5, "latitude"), com.tencent.mm.protobuf.i.r(6, "status", r45.dx0.class), com.tencent.mm.protobuf.i.u(7, "poi"), com.tencent.mm.protobuf.i.n(8, "from_object_id"), com.tencent.mm.protobuf.i.i(9, "from_type"), com.tencent.mm.protobuf.i.i(10, "from_scene"), com.tencent.mm.protobuf.i.i(11, "tab_id"), com.tencent.mm.protobuf.i.u(12, "poi_name"), com.tencent.mm.protobuf.i.u(13, "address"), com.tencent.mm.protobuf.i.u(14, "city"), com.tencent.mm.protobuf.i.u(15, "country"), com.tencent.mm.protobuf.i.i(16, "prefetch"), com.tencent.mm.protobuf.i.u(17, "building_id"), com.tencent.mm.protobuf.i.u(18, "floor_name"), com.tencent.mm.protobuf.i.i(19, "media_tab_type"), com.tencent.mm.protobuf.i.u(20, "jump_info_to_poistream_by_pass"), com.tencent.mm.protobuf.i.r(21, "from_mp_item", r45.wo2.class));
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
