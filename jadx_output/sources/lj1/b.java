package lj1;

/* loaded from: classes8.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f318812a;

    public b(yz5.p pVar) {
        this.f318812a = pVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.i20 i20Var = (r45.i20) obj;
        int i17 = i20Var.BaseResponse.f376959d;
        yz5.p pVar = this.f318812a;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiCheckWxaShortLink", "checkAsync cig fail. Ret[" + i20Var.BaseResponse.f376959d + "]  ErrMsg[" + i20Var.BaseResponse.f376960e + ']');
            pVar.invoke(java.lang.Boolean.FALSE, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiCheckWxaShortLink", "checkAsync cig success.");
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            com.tencent.mm.protobuf.g gVar = i20Var.f376674d;
            java.lang.String h17 = gVar != null ? gVar.h(com.tencent.mapsdk.internal.rv.f51270c) : null;
            java.lang.String str = h17 == null ? "" : h17;
            com.tencent.mm.protobuf.g gVar2 = i20Var.f376676f;
            java.lang.String h18 = gVar2 != null ? gVar2.h(com.tencent.mapsdk.internal.rv.f51270c) : null;
            java.lang.String str2 = h18 == null ? "" : h18;
            com.tencent.mm.protobuf.g gVar3 = i20Var.f376675e;
            java.lang.String h19 = gVar3 != null ? gVar3.h(com.tencent.mapsdk.internal.rv.f51270c) : null;
            java.lang.String str3 = h19 == null ? "" : h19;
            int i18 = i20Var.f376677g;
            int i19 = i20Var.f376678h;
            com.tencent.mm.protobuf.g gVar4 = i20Var.f376679i;
            java.lang.String i27 = gVar4 != null ? gVar4.i() : null;
            if (i27 == null) {
                i27 = "";
            }
            pVar.invoke(bool, new com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo(str, str2, str3, i18, i19, i27, ""));
        }
        return jz5.f0.f302826a;
    }
}
