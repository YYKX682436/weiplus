package r45;

/* loaded from: classes.dex */
public class p32 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public p32() {
        super(com.tencent.mm.protobuf.i.r(1, "baseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "anchor_finderusername"), com.tencent.mm.protobuf.i.i(4, "op_type"), com.tencent.mm.protobuf.i.i(5, "type"), com.tencent.mm.protobuf.i.r(6, "item", r45.uc5.class), com.tencent.mm.protobuf.i.i(7, ya.b.ITEM_ID), com.tencent.mm.protobuf.i.n(8, "object_id"));
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
