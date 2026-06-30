package r45;

/* loaded from: classes.dex */
public class l23 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public l23() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.r(2, "article", r45.i23.class), com.tencent.mm.protobuf.i.r(3, "miniapp", r45.j23.class), com.tencent.mm.protobuf.i.r(4, "musicInfo", r45.zi2.class), com.tencent.mm.protobuf.i.a(6, "finder_secret_data"), com.tencent.mm.protobuf.i.a(7, "last_buffer"));
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
