package r45;

/* loaded from: classes.dex */
public class fu1 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public fu1() {
        super(com.tencent.mm.protobuf.i.r(1, "baseResponse", r45.ie.class), com.tencent.mm.protobuf.i.s(2, ya.b.ITEM_LIST, r45.uc5.class), com.tencent.mm.protobuf.i.i(3, "location_id"), com.tencent.mm.protobuf.i.i(4, "data_version"));
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
