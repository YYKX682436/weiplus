package r45;

/* loaded from: classes10.dex */
public class pt6 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public pt6() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.u(2, "AppId"), com.tencent.mm.protobuf.i.i(3, "SdkVersion"), com.tencent.mm.protobuf.i.u(4, "ClientAppDataId"), com.tencent.mm.protobuf.i.u(5, "UserName"), com.tencent.mm.protobuf.i.i(6, "TotalLen"), com.tencent.mm.protobuf.i.i(7, "StartPos"), com.tencent.mm.protobuf.i.i(8, "DataLen"), com.tencent.mm.protobuf.i.r(9, "AttachData", r45.cu5.class), com.tencent.mm.protobuf.i.i(10, "Type"), com.tencent.mm.protobuf.i.u(11, "MD5"));
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
