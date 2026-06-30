package r45;

/* loaded from: classes5.dex */
public class dh5 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public dh5() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.c(2, "finish"), com.tencent.mm.protobuf.i.a(3, "tts_data"), com.tencent.mm.protobuf.i.a(4, "context_buff"), com.tencent.mm.protobuf.i.s(5, "audio_ext_info", r45.sb.class), com.tencent.mm.protobuf.i.i(6, "interval"));
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
