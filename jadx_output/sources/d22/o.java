package d22;

/* loaded from: classes9.dex */
public final class o implements d22.p {
    @Override // d22.p
    public java.lang.String d(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        try {
            d22.n nVar = (d22.n) context;
            r45.vd0 vd0Var = nVar.f225866j;
            if (vd0Var == null) {
                return "";
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.lang.String str = vd0Var.f388136f;
            kotlin.jvm.internal.o.f(str, "getTitle(...)");
            linkedHashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str);
            java.lang.String str2 = vd0Var.f388137g;
            kotlin.jvm.internal.o.f(str2, "getDesc(...)");
            linkedHashMap.put("desc", str2);
            java.lang.String str3 = vd0Var.f388135e;
            kotlin.jvm.internal.o.f(str3, "getIconUrl(...)");
            linkedHashMap.put("iconUrl", str3);
            linkedHashMap.put("extranceScene", java.lang.Integer.valueOf(nVar.f364155a));
            java.lang.String str4 = vd0Var.f388134d;
            kotlin.jvm.internal.o.f(str4, "getKey(...)");
            linkedHashMap.put("setKey", str4);
            linkedHashMap.put("setType", 97);
            linkedHashMap.put("enterTime", java.lang.Long.valueOf(nVar.f364158d));
            d22.n nVar2 = (d22.n) context;
            linkedHashMap.put("designerUin", java.lang.Integer.valueOf(nVar2.f364131g));
            linkedHashMap.put("sessionID", nVar2.f364132h);
            linkedHashMap.put("pageScene", java.lang.Integer.valueOf(nVar.f364133i));
            java.lang.String gVar = new cl0.g(linkedHashMap).toString();
            kotlin.jvm.internal.o.f(gVar, "toString(...)");
            return gVar;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.MMEmoticonIPPageCreator", th6, "unable to cast IPPageContext", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // d22.p
    public java.lang.String e() {
        return "pages/ip/entry";
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
