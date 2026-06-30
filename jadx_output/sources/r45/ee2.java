package r45;

/* loaded from: classes.dex */
public class ee2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public ee2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "qrcode_url"), com.tencent.mm.protobuf.i.s(4, "select_chatroom_list", r45.ky5.class), com.tencent.mm.protobuf.i.s(5, "select_user_list", r45.oy5.class));
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
