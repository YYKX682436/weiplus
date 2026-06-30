package n91;

/* loaded from: classes7.dex */
public class u extends com.tencent.mm.plugin.appbrand.widget.halfscreen.f {
    private zi1.b orientationHandler;
    private final com.tencent.mm.plugin.appbrand.o6 runtime;
    private java.lang.String softOrientation;

    public u(com.tencent.mm.plugin.appbrand.o6 o6Var, xi1.g gVar) {
        super(o6Var, gVar);
        this.runtime = o6Var;
    }

    private android.view.Display defaultDisplay() {
        android.app.Activity r07 = this.runtime.r0();
        java.util.Objects.requireNonNull(r07);
        return ((android.view.WindowManager) r07.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.halfscreen.f
    public void applyWindowConfig(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.widget.halfscreen.b bVar) {
        n91.g gVar;
        if (n91.t.b(this.runtime) && (gVar = this.runtime.K2) != null && gVar.f335873c.ordinal() >= 3) {
            n91.t.a(appBrandInitConfigWC);
        }
        super.applyWindowConfig(appBrandInitConfigWC, bVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.halfscreen.f, xi1.s
    public xi1.p getOrientationHandler() {
        n91.g gVar = this.runtime.K2;
        if (gVar != null && gVar.f335873c.ordinal() >= 3) {
            this.orientationHandler = null;
            return super.getOrientationHandler();
        }
        if (this.orientationHandler == null) {
            this.orientationHandler = new zi1.b(this.runtime.getWindowAndroid());
        }
        return this.orientationHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001e  */
    @Override // com.tencent.mm.plugin.appbrand.widget.halfscreen.f, xi1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.DisplayMetrics getVDisplayMetrics() {
        /*
            r3 = this;
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r1 = 30
            boolean r1 = fp.h.c(r1)
            if (r1 == 0) goto L1b
            com.tencent.mm.plugin.appbrand.o6 r1 = r3.runtime     // Catch: java.lang.UnsupportedOperationException -> L1b
            android.app.Activity r1 = r1.r0()     // Catch: java.lang.UnsupportedOperationException -> L1b
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.UnsupportedOperationException -> L1b
            android.view.Display r1 = r1.getDisplay()     // Catch: java.lang.UnsupportedOperationException -> L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 != 0) goto L22
            android.view.Display r1 = r3.defaultDisplay()
        L22:
            r1.getRealMetrics(r0)
            java.lang.String r1 = "landscape"
            java.lang.String r2 = r3.softOrientation
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L39
            int r1 = r0.widthPixels
            int r2 = r0.heightPixels
            if (r1 >= r2) goto L39
            r0.widthPixels = r2
            r0.heightPixels = r1
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n91.u.getVDisplayMetrics():android.util.DisplayMetrics");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.halfscreen.f, xi1.s
    public void setSoftOrientation(java.lang.String str) {
        this.softOrientation = str;
    }
}
