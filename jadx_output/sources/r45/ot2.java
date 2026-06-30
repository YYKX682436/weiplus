package r45;

/* loaded from: classes5.dex */
public class ot2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ot2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.i(4, "type"), com.tencent.mm.protobuf.i.i(5, "flags"), com.tencent.mm.protobuf.i.n(6, "listen_id"), com.tencent.mm.protobuf.i.n(7, "finder_feed_id"), com.tencent.mm.protobuf.i.i(8, "item_type"), com.tencent.mm.protobuf.i.n(9, "mtime"));
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
