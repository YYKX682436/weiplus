package r45;

/* loaded from: classes.dex */
public class jt1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public jt1() {
        super(com.tencent.mm.protobuf.i.r(1, "baseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "mic_replay_info", r45.gl4.class), com.tencent.mm.protobuf.i.i(3, "next_poll_time"), com.tencent.mm.protobuf.i.r(4, "ktv_replay_info", r45.b54.class));
        this.__printBytes = true;
    }

    @Override // r45.ny3
    public final r45.ie getBaseResponse() {
        return (r45.ie) getCustom(0);
    }

    @Override // r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        set(0, ieVar);
        return this;
    }
}
