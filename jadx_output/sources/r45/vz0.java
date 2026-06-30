package r45;

/* loaded from: classes.dex */
public class vz0 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public vz0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.u(3, "poster_finder_username"), com.tencent.mm.protobuf.i.n(4, "course_id"), com.tencent.mm.protobuf.i.u(5, "source_feed_id"), com.tencent.mm.protobuf.i.i(6, "comment_scene"));
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
