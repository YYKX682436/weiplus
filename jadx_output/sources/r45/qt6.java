package r45;

/* loaded from: classes10.dex */
public class qt6 extends com.tencent.mm.protobuf.e implements r45.ny3 {
    public qt6() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseResponse", r45.ie.class), com.tencent.mm.protobuf.i.u(2, "AppId"), com.tencent.mm.protobuf.i.u(3, "MediaId"), com.tencent.mm.protobuf.i.u(4, "ClientAppDataId"), com.tencent.mm.protobuf.i.u(5, "UserName"), com.tencent.mm.protobuf.i.i(6, "TotalLen"), com.tencent.mm.protobuf.i.i(7, "StartPos"), com.tencent.mm.protobuf.i.i(8, "DataLen"), com.tencent.mm.protobuf.i.i(9, "CreateTime"));
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
