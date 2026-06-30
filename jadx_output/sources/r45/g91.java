package r45;

/* loaded from: classes.dex */
public class g91 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public g91() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(4, "last_buffer"), com.tencent.mm.protobuf.i.i(7, "tab_type"), com.tencent.mm.protobuf.i.i(8, "need_item_types"));
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
