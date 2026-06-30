package r45;

/* loaded from: classes.dex */
public class wb1 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public wb1() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "KeyBuf", r45.cu5.class), com.tencent.mm.protobuf.i.r(3, "finderBaseRequest", r45.kv0.class), com.tencent.mm.protobuf.i.a(4, "last_buffer"), com.tencent.mm.protobuf.i.c(5, "need_reddot_history_record"), com.tencent.mm.protobuf.i.i(6, "reddot_history_record_update_time"), com.tencent.mm.protobuf.i.g(7, "longitude"), com.tencent.mm.protobuf.i.g(8, "latitude"));
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
