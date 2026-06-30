package r45;

/* loaded from: classes.dex */
public class k23 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public k23() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBasereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.i(4, "type"), com.tencent.mm.protobuf.i.u(5, "url"), com.tencent.mm.protobuf.i.i(6, "musicSid"), com.tencent.mm.protobuf.i.i(7, "article_scene"), com.tencent.mm.protobuf.i.r(8, "cmd_item", r45.hx0.class), com.tencent.mm.protobuf.i.a(12, "last_buffer"));
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
