package d22;

/* loaded from: classes12.dex */
public final class g implements d22.p {
    @Override // d22.p
    public java.lang.String d(d22.v context) {
        java.lang.String str = "";
        kotlin.jvm.internal.o.g(context, "context");
        try {
            d22.f fVar = (d22.f) context;
            r45.v75 v75Var = fVar.f225837p;
            if (v75Var != null) {
                r45.v75 v75Var2 = new r45.v75();
                if (v75Var != null) {
                    v75Var2.f387964d = v75Var.f387964d;
                    v75Var2.f387965e = v75Var.f387965e;
                    v75Var2.f387966f = v75Var.f387966f;
                    v75Var2.f387967g = v75Var.f387967g;
                    v75Var2.f387968h = v75Var.f387968h;
                    v75Var2.f387969i = v75Var.f387969i;
                    v75Var2.f387970m = v75Var.f387970m;
                }
                str = android.util.Base64.encodeToString(v75Var2.toByteArray(), 2);
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("designerID", fVar.f364052g);
            linkedHashMap.put("designerUin", v75Var != null ? new jz5.u(v75Var.f387964d) : null);
            linkedHashMap.put("needLeftNavReturn", java.lang.Boolean.valueOf(fVar.f364059n));
            linkedHashMap.put("extranceScene", java.lang.Integer.valueOf(fVar.f364155a));
            linkedHashMap.put("oldRedirectUrl", fVar.f364058m);
            linkedHashMap.put("needJmp2SingleEmoji", java.lang.Boolean.valueOf(fVar.f364060o));
            linkedHashMap.put("enterTime", java.lang.Long.valueOf(fVar.f364158d));
            linkedHashMap.put("requestID", fVar.f364157c);
            linkedHashMap.put("personalDesigner", str);
            java.lang.String gVar = new cl0.g(linkedHashMap).toString();
            kotlin.jvm.internal.o.f(gVar, "toString(...)");
            return gVar;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.MMEmoticonDesignerProfileCreator", th6, "unable to cast DesignerProfileContext", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // d22.p
    public java.lang.String e() {
        return "pages/profile/entry";
    }

    @Override // d22.p
    public void f(d22.v liteAppContext) {
        kotlin.jvm.internal.o.g(liteAppContext, "liteAppContext");
    }

    @Override // d22.p
    public com.tencent.mm.plugin.lite.s i(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.lite.s();
    }

    @Override // d22.p
    public java.lang.String j() {
        return "wxaliteb6acd493f7e02b17d6b805ccf970be5b";
    }

    @Override // d22.p
    public void k(android.content.Context viewContext, d22.v liteAppContext) {
        kotlin.jvm.internal.o.g(viewContext, "viewContext");
        kotlin.jvm.internal.o.g(liteAppContext, "liteAppContext");
    }

    @Override // d22.p
    public boolean l() {
        return false;
    }

    @Override // d22.p
    public boolean n(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        return true;
    }
}
