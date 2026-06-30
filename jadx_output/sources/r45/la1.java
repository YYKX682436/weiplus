package r45;

/* loaded from: classes2.dex */
public class la1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public la1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "finderBaseReq", r45.kv0.class), com.tencent.mm.protobuf.i.n(3, "topicId"), com.tencent.mm.protobuf.i.u(4, "encryptedTopicEventId"), com.tencent.mm.protobuf.i.u(5, "topic_wording"), com.tencent.mm.protobuf.i.i(6, "topic_type"), com.tencent.mm.protobuf.i.n(7, "fromObjectId"), com.tencent.mm.protobuf.i.u(8, "short_url"), com.tencent.mm.protobuf.i.a(9, "topic_info_passbuff"), com.tencent.mm.protobuf.i.i(10, "get_topic_info_flag"), com.tencent.mm.protobuf.i.i(11, "prefetch_type"), com.tencent.mm.protobuf.i.u(12, "finder_username"));
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
