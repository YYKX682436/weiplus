package r45;

/* loaded from: classes2.dex */
public class y41 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public y41() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "object_id"), com.tencent.mm.protobuf.i.n(4, "start_timestamp"), com.tencent.mm.protobuf.i.a(5, "last_buffer"), com.tencent.mm.protobuf.i.p(7, "need_comment_ids"), com.tencent.mm.protobuf.i.a(8, "bypass_buffer"));
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
