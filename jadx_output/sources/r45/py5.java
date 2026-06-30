package r45;

/* loaded from: classes9.dex */
public class py5 extends com.tencent.mm.protobuf.e implements r45.my3 {
    public py5() {
        super(com.tencent.mm.protobuf.i.r(1, "BaseRequest", r45.he.class), com.tencent.mm.protobuf.i.r(2, "Msg", r45.b9.class), com.tencent.mm.protobuf.i.u(3, "CommentUrl"), com.tencent.mm.protobuf.i.i(4, "ReqTime"), com.tencent.mm.protobuf.i.u(5, "Md5"), com.tencent.mm.protobuf.i.i(6, "FileType"), com.tencent.mm.protobuf.i.u(7, "Signature"), com.tencent.mm.protobuf.i.u(8, "FromSence"), com.tencent.mm.protobuf.i.i(9, "HitMd5"), com.tencent.mm.protobuf.i.i(10, "CRC32"), com.tencent.mm.protobuf.i.i(11, "MsgForwardType"), com.tencent.mm.protobuf.i.i(12, "DirectShare"), com.tencent.mm.protobuf.i.u(13, "SendMsgTicket"));
        this.__printBytes = true;
    }

    public com.tencent.mm.modelbase.i d() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT;
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendappmsg";
        lVar.f70664a = this;
        lVar.f70665b = new r45.qy5();
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
