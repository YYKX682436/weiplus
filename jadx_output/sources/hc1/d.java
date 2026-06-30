package hc1;

/* loaded from: classes7.dex */
public final class d extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    private static final int CTRL_INDEX = 1505;
    public static final java.lang.String NAME = "onGetSmiley";

    public final void x(java.lang.String emoticonText, com.tencent.mm.plugin.appbrand.e9 service) {
        kotlin.jvm.internal.o.g(emoticonText, "emoticonText");
        kotlin.jvm.internal.o.g(service, "service");
        if (service.isRunning()) {
            java.util.HashMap hashMap = new java.util.HashMap(2);
            hashMap.put("errMsg", "ok");
            hashMap.put("smiley", emoticonText);
            t(hashMap);
            u(service);
            m();
        }
    }
}
