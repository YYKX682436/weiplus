package i45;

/* loaded from: classes9.dex */
public final class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f288406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject f288407b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f288408c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f288409d;

    public f(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject wXMiniProgramObject, java.util.LinkedList linkedList, com.tencent.mm.pluginsdk.model.app.m mVar) {
        this.f288406a = wXMediaMessage;
        this.f288407b = wXMiniProgramObject;
        this.f288408c = linkedList;
        this.f288409d = mVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        k91.v5 v5Var = (k91.v5) obj;
        if (v5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxImeHelper", "get wxaAttributes for appbrand info failed");
            return null;
        }
        i45.j jVar = i45.j.f288415a;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = this.f288406a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1_");
        com.tencent.mm.pluginsdk.model.app.m mVar = this.f288409d;
        sb6.append(mVar.field_appId);
        sb6.append("_");
        sb6.append(com.tencent.mm.sdk.platformtools.w2.a(kk.v.a(c01.d9.b().C())));
        sb6.append("_");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.i1());
        sb6.append("_0");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        java.util.Iterator it = this.f288408c.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            ot0.q qVar = new ot0.q();
            java.lang.String field_appId = mVar.field_appId;
            kotlin.jvm.internal.o.f(field_appId, "field_appId");
            qVar.f348646d = field_appId;
            qVar.f348677k2 = v5Var.field_appId;
            qVar.f348737z2 = this.f288407b.miniprogramType;
            qVar.H = mVar.field_appName;
            qVar.f348706s = 2;
            qVar.f348689n2 = sb7;
            qVar.f348681l2 = 2;
            qVar.f348722w = v5Var.field_username;
            qVar.f348726x = v5Var.field_nickname;
            int i17 = 0;
            qVar.f348717u2 = 0;
            ot0.a aVar = new ot0.a();
            aVar.f348360p = v5Var.u0() != null ? v5Var.u0().f305642q : 0;
            aVar.f348362r = v5Var.u0() != null ? v5Var.u0().f305643r : 0;
            if (v5Var.u0() != null) {
                i17 = v5Var.u0().f305644s;
            }
            aVar.f348363s = i17;
            qVar.f(aVar);
            com.tencent.mm.pluginsdk.model.app.a aVar2 = new com.tencent.mm.pluginsdk.model.app.a();
            aVar2.f188790a = 1;
            aVar2.f188791b = "net.sourceforge.simcpux";
            aVar2.f188792c = "";
            com.tencent.mm.pluginsdk.model.app.k0.G(qVar, wXMediaMessage, str, null, 0, aVar2);
        }
        return null;
    }
}
