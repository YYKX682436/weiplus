package il1;

/* loaded from: classes7.dex */
public final class d extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    public static final int CTRL_INDEX = 1227;
    public static final java.lang.String NAME = "sheetModeWindowStateChangedEvent";

    public final void x(com.tencent.luggage.sdk.jsapi.component.service.y service, il1.e state) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSheetModeWindowStateChangedEvent", "[dispatchEvent] state=" + state);
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            u(service);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("state", "fullPage");
            t(hashMap);
            m();
            return;
        }
        if (ordinal != 1) {
            return;
        }
        u(service);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("state", "halfPage");
        t(hashMap2);
        m();
    }
}
