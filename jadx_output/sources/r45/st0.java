package r45;

/* loaded from: classes.dex */
public class st0 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public st0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "liveNoticeInfo", r45.h32.class), com.tencent.mm.protobuf.i.i(3, "refreshInterval"));
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
