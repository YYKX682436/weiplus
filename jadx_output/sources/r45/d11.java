package r45;

/* loaded from: classes.dex */
public class d11 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public d11() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.n(4, "mentionId"), com.tencent.mm.protobuf.i.a(5, "mentionLastBuff"), com.tencent.mm.protobuf.i.n(6, "refObjectId"), com.tencent.mm.protobuf.i.n(7, "refCommentId"), com.tencent.mm.protobuf.i.i(8, "mentionType"), com.tencent.mm.protobuf.i.n(9, "svr_mention_id"));
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
