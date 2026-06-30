package eg;

/* loaded from: classes7.dex */
public interface c extends nd.b {
    static eg.c getInstance() {
        eg.c cVar = (eg.c) nd.f.a(eg.c.class);
        if (cVar != null) {
            return cVar;
        }
        if (com.tencent.mm.plugin.appbrand.extendplugin.h.f78035d == null) {
            com.tencent.mm.plugin.appbrand.extendplugin.h.f78035d = new com.tencent.mm.plugin.appbrand.extendplugin.h();
        }
        return com.tencent.mm.plugin.appbrand.extendplugin.h.f78035d;
    }

    eg.b Ua(java.lang.String str);
}
