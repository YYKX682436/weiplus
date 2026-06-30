package r45;

/* loaded from: classes5.dex */
public class or extends com.tencent.mm.protobuf.e implements r45.my3 {
    public or() {
        super(com.tencent.mm.protobuf.i.r(1, "base_request", r45.he.class), com.tencent.mm.protobuf.i.i(2, "biz_type"), com.tencent.mm.protobuf.i.i(3, "op_type"), com.tencent.mm.protobuf.i.a(4, "buf"));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 12607;
        lVar.f70666c = "/cgi-bin/micromsg-bin/bypoplog";
        lVar.f70664a = this;
        lVar.f70665b = new r45.pr();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        return iVar;
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
