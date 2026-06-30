package r45;

/* loaded from: classes2.dex */
public class zt0 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public zt0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.n(3, "maxId"), com.tencent.mm.protobuf.i.u(4, "firstPageMD5"), com.tencent.mm.protobuf.i.u(5, "finder_username"), com.tencent.mm.protobuf.i.i(6, "need_fans_count"), com.tencent.mm.protobuf.i.r(7, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.a(8, "lastBuffer"), com.tencent.mm.protobuf.i.i(9, "enterType"), com.tencent.mm.protobuf.i.r(10, "status", r45.dx0.class), com.tencent.mm.protobuf.i.n(11, "firstObjectId"), com.tencent.mm.protobuf.i.u(12, "encryptedObjectId"));
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
