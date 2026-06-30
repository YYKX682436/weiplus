package fg1;

/* loaded from: classes7.dex */
public final class n extends b06.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg1.u f261875b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.Object obj, fg1.u uVar) {
        super(obj);
        this.f261875b = uVar;
    }

    @Override // b06.b
    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(property, "property");
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        ((java.lang.Boolean) obj).booleanValue();
        fg1.u uVar = this.f261875b;
        if (booleanValue) {
            if (((java.lang.Boolean) ((b06.b) uVar.f261898d).b(uVar, fg1.u.f261894m[0])).booleanValue()) {
                com.tencent.mm.plugin.appbrand.AppBrandRuntime a17 = uVar.a();
                if (a17 != null) {
                    a17.P(25, -1, uVar.f261903i);
                }
                com.tencent.mm.plugin.appbrand.AppBrandRuntime a18 = uVar.a();
                if (a18 != null) {
                    a18.P(24, -1, uVar.f261904j);
                }
                uVar.getClass();
                com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, uVar.f261896b);
                return;
            }
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime a19 = uVar.a();
        if (a19 != null) {
            a19.B1(uVar.f261903i);
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime a27 = uVar.a();
        if (a27 != null) {
            a27.B1(uVar.f261904j);
        }
        uVar.getClass();
        com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().unregisterContentObserver(uVar.f261896b);
    }
}
