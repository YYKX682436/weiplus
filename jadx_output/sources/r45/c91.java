package r45;

/* loaded from: classes2.dex */
public class c91 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public c91() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "object_id"), com.tencent.mm.protobuf.i.n(4, "task_id"), com.tencent.mm.protobuf.i.r(5, "support_info", r45.gx4.class));
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
