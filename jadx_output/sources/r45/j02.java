package r45;

/* loaded from: classes5.dex */
public class j02 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public j02() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "finder_username"), com.tencent.mm.protobuf.i.r(4, "bg_music_info", r45.xl1.class), com.tencent.mm.protobuf.i.a(5, "live_cookies"), com.tencent.mm.protobuf.i.n(6, "live_id"), com.tencent.mm.protobuf.i.n(7, "object_id"));
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
