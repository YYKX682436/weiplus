package r45;

/* loaded from: classes.dex */
public class o40 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public o40() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.i(2, "scene_code"), com.tencent.mm.protobuf.i.i(3, "op_code"), com.tencent.mm.protobuf.i.i(4, "upload_size"), com.tencent.mm.protobuf.i.i(5, "download_size"), com.tencent.mm.protobuf.i.i(6, "concurrent_num"));
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
