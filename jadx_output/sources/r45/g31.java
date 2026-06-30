package r45;

/* loaded from: classes.dex */
public class g31 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public g31() {
        super(com.tencent.mm.protobuf.i.u(1, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.u(2, com.tencent.tmassistantsdk.storage.table.ClientInfoTable.Columns.CLIENTID), com.tencent.mm.protobuf.i.u(3, "url"), com.tencent.mm.protobuf.i.u(4, "fromApp"), com.tencent.mm.protobuf.i.u(5, "paramJson"), com.tencent.mm.protobuf.i.r(6, "BaseRequest", r45.he.class));
        this.__printBytes = true;
    }

    @Override // r45.my3
    public final r45.he getBaseRequest() {
        return (r45.he) getCustom(5);
    }

    @Override // r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        set(5, heVar);
        return this;
    }
}
