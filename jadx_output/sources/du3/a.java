package du3;

/* loaded from: classes.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public static du3.b a(du3.a aVar, java.lang.String template, java.lang.String title, java.lang.String hostUrl, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            aVar.getClass();
            hostUrl = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_photo_edit_ai_generate_host, "https://yuanbao.tencent.com/aigi/generate/", true);
            kotlin.jvm.internal.o.f(hostUrl, "getExpt(...)");
        }
        aVar.getClass();
        kotlin.jvm.internal.o.g(template, "template");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(hostUrl, "hostUrl");
        return new du3.b(du3.b.f243519k, template, title, hostUrl);
    }

    public final du3.b b() {
        java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.pdt);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        du3.a aVar = du3.b.f243513e;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_photo_edit_ai_generate_host, "https://yuanbao.tencent.com/aigi/generate/", true);
        kotlin.jvm.internal.o.f(Zi, "getExpt(...)");
        return new du3.b(0, "", r17, Zi);
    }
}
