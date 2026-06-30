package r45;

/* loaded from: classes.dex */
public class ov0 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public ov0() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, "object_async_info_map", r45.dl2.class), com.tencent.mm.protobuf.i.s(3, "contact_async_info_map", r45.cz0.class), com.tencent.mm.protobuf.i.i(4, "object_info_refresh_interval_seconds"), com.tencent.mm.protobuf.i.i(5, "live_contact_ttl_seconds"));
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
