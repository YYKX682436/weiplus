package ww1;

/* loaded from: classes9.dex */
public class m extends com.tencent.mm.modelbase.i {
    public m(double d17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.mm.protobuf.g gVar, java.lang.String str6, boolean z17, java.lang.String str7) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ix ixVar = new r45.ix();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.wallet_core.ui.r1.i0(d17 + "", "100"));
        sb6.append("");
        ixVar.f377376d = sb6.toString();
        ixVar.f377377e = str;
        ixVar.f377378f = str2;
        ixVar.f377379g = str3;
        ixVar.f377380h = str4;
        ixVar.f377381i = str5;
        ixVar.f377382m = gVar;
        ixVar.f377383n = str6;
        ixVar.f377384o = z17;
        ixVar.f377385p = str7;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiSaveQrcode", "fee：%s desc:%s desc_required:%s descPlaceholder:%s ", java.lang.Double.valueOf(d17), str6, java.lang.Boolean.valueOf(z17), str7);
        lVar.f70664a = ixVar;
        lVar.f70665b = new r45.jx();
        lVar.f70666c = "/cgi-bin/mmpay-bin/busif2fsaveqrcode";
        lVar.f70667d = 4461;
        lVar.f70678o = 2;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public /* bridge */ /* synthetic */ void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
