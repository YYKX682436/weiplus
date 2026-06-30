package eb1;

/* loaded from: classes7.dex */
public final class a implements eb1.c {
    @Override // eb1.c
    public eb1.d bf(com.tencent.mm.plugin.appbrand.y component) {
        xi1.g windowAndroid;
        kotlin.jvm.internal.o.g(component, "component");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = component.t3();
        if (t37 == null || (windowAndroid = t37.getWindowAndroid()) == null) {
            windowAndroid = component.getWindowAndroid();
        }
        kotlin.jvm.internal.o.d(windowAndroid);
        android.content.Context context = component.getContext();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        java.lang.String appId = component.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        vi1.y1 y1Var = new vi1.y1(context, appId, windowAndroid);
        if ((!(nf.x.f336616b != null ? r5.e() : false)) && windowAndroid.isLargeScreenWindow()) {
            y1Var.c(1);
        }
        return y1Var;
    }
}
