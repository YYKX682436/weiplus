package vk4;

/* loaded from: classes2.dex */
public final class g extends com.tencent.mm.modelbase.i {
    public g(java.lang.String str, com.tencent.mm.protobuf.g gVar) {
        bw5.zb0 zb0Var = new bw5.zb0();
        zb0Var.f35928d = str == null ? "" : str;
        boolean[] zArr = zb0Var.f35932h;
        zArr[2] = true;
        if (gVar != null) {
            zb0Var.f35929e = gVar;
            zArr[3] = true;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 10541;
        lVar.f70666c = "/cgi-bin/mmlistenappsvr/listensync";
        lVar.f70664a = zb0Var;
        lVar.f70665b = new bw5.ac0();
        p(lVar.a());
    }
}
