package r45;

/* loaded from: classes5.dex */
public class e72 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public e72() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.r(3, "client_status", r45.rn1.class), com.tencent.mm.protobuf.i.r(4, "enter_info", r45.tn5.class), com.tencent.mm.protobuf.i.r(5, "exit_info", r45.vn5.class), com.tencent.mm.protobuf.i.r(6, "block_info", r45.sn5.class));
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
