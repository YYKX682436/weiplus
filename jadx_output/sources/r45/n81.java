package r45;

/* loaded from: classes10.dex */
public class n81 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public n81() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "list", r45.wg2.class), com.tencent.mm.protobuf.i.a(3, "lastBuf"), com.tencent.mm.protobuf.i.r(4, "redpackage_info", r45.tl6.class), com.tencent.mm.protobuf.i.a(5, "page_buffer"), com.tencent.mm.protobuf.i.r(6, "last_read_info", r45.qk4.class), com.tencent.mm.protobuf.i.i(7, "continue_flag"));
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
