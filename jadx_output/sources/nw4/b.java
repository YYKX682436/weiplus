package nw4;

/* loaded from: classes8.dex */
public final class b extends com.tencent.mm.modelbase.i {
    public b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18) {
        r45.u14 u14Var = new r45.u14();
        u14Var.f386942d = i17;
        u14Var.f386943e = str;
        u14Var.f386944f = str2;
        u14Var.f386945g = str3;
        u14Var.f386946h = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = u14Var;
        lVar.f70665b = new r45.v14();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/jsapi-moduseuserinfo";
        lVar.f70667d = 4810;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.f fVar2 = this.f70646f.f70710a.f70684a;
        if (fVar2 instanceof r45.u14) {
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.JSAPIModUseUserInfoRequest");
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
    }
}
