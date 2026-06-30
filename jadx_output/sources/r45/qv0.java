package r45;

/* loaded from: classes.dex */
public class qv0 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public qv0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.s(3, "ids", r45.rv0.class), com.tencent.mm.protobuf.i.i(4, "batch_load_scene"), com.tencent.mm.protobuf.i.r(5, "status", r45.dx0.class));
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
