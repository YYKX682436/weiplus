package r45;

/* loaded from: classes.dex */
public class xk1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public xk1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.i(2, "lottery_attend_type"), com.tencent.mm.protobuf.i.n(3, "object_id"), com.tencent.mm.protobuf.i.r(4, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.a(5, "live_cookies"), com.tencent.mm.protobuf.i.u(6, "finder_username"));
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
