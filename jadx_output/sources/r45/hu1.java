package r45;

/* loaded from: classes.dex */
public class hu1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public hu1() {
        super(com.tencent.mm.protobuf.i.r(1, "baseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "record_list", r45.xc5.class), com.tencent.mm.protobuf.i.s(3, "live_record_list", r45.q94.class), com.tencent.mm.protobuf.i.a(4, "last_buffer"), com.tencent.mm.protobuf.i.i(5, "continue_flag"));
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
