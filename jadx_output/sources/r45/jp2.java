package r45;

/* loaded from: classes.dex */
public class jp2 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public jp2() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finder_basereq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "object_id"), com.tencent.mm.protobuf.i.n(4, "video_timestamp"), com.tencent.mm.protobuf.i.n(5, ya.b.CONTENT_TYPE), com.tencent.mm.protobuf.i.u(6, "content"), com.tencent.mm.protobuf.i.n(7, "comment_source"), com.tencent.mm.protobuf.i.i(8, "post_identity"), com.tencent.mm.protobuf.i.u(9, "client_msg_id"), com.tencent.mm.protobuf.i.u(10, "nonce_id"), com.tencent.mm.protobuf.i.n(11, "follow_bullet_comment_id"), com.tencent.mm.protobuf.i.i(12, "feed_play_times"), com.tencent.mm.protobuf.i.u(13, "finder_username"), com.tencent.mm.protobuf.i.n(14, "reply_comment_id"), com.tencent.mm.protobuf.i.n(15, "follow_button_hold_time_ms"));
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
