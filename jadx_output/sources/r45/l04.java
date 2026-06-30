package r45;

/* loaded from: classes.dex */
public class l04 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public l04() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, "kid_key"), com.tencent.mm.protobuf.i.r(3, "verify_pwd_token", r45.rx6.class), com.tencent.mm.protobuf.i.u(4, "co_manager_user_name"), com.tencent.mm.protobuf.i.u(5, "context"));
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
