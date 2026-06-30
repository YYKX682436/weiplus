package x85;

/* loaded from: classes2.dex */
public final class b extends com.tencent.mm.modelbase.i {
    public b(int i17, byte[] bArr, byte[] bArr2) {
        r45.wh3 wh3Var = new r45.wh3();
        wh3Var.f389156d = i17;
        bArr = bArr == null ? new byte[0] : bArr;
        wh3Var.f389157e = new com.tencent.mm.protobuf.g(bArr, 0, bArr.length);
        bArr2 = bArr2 == null ? new byte[0] : bArr2;
        wh3Var.f389158f = new com.tencent.mm.protobuf.g(bArr2, 0, bArr2.length);
        r45.xh3 xh3Var = new r45.xh3();
        r45.ie ieVar = new r45.ie();
        xh3Var.BaseResponse = ieVar;
        ieVar.f376960e = new r45.du5();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = wh3Var;
        lVar.f70665b = xh3Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getlenslist";
        lVar.f70667d = 3847;
        p(lVar.a());
    }
}
