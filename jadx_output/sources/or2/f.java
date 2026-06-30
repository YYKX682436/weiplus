package or2;

/* loaded from: classes13.dex */
public final class f extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f347623d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f347624e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.Display.Mode f347625f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        jz5.i iVar = jz5.i.f302829d;
        this.f347623d = jz5.h.a(iVar, or2.d.f347619d);
        this.f347624e = jz5.h.a(iVar, new or2.c(this));
    }

    public final void O6() {
        android.view.Display P6 = P6();
        if (P6 == null) {
            return;
        }
        float refreshRate = P6.getRefreshRate();
        float[] supportedRefreshRates = P6.getSupportedRefreshRates();
        kotlin.jvm.internal.o.f(supportedRefreshRates, "getSupportedRefreshRates(...)");
        java.util.List E0 = kz5.n0.E0(kz5.z.w0(supportedRefreshRates));
        android.view.Display.Mode[] supportedModes = P6.getSupportedModes();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dumpRefreshRateInfo currentFps:");
        sb6.append(refreshRate);
        sb6.append(" supportedFpsRate:");
        sb6.append(kz5.n0.g0(E0, ",", "[", "]", 0, null, null, 56, null));
        sb6.append(" supportedFpsRateMode:");
        kotlin.jvm.internal.o.d(supportedModes);
        java.util.ArrayList arrayList = new java.util.ArrayList(supportedModes.length);
        for (android.view.Display.Mode mode : supportedModes) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(mode);
            sb7.append(' ');
            arrayList.add(sb7.toString());
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("FinderFpsController", sb6.toString());
    }

    public final android.view.Display P6() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? getActivity().getWindow().getContext().getDisplay() : getActivity().getWindow().getWindowManager().getDefaultDisplay();
    }

    public final void Q6(android.view.Display.Mode mode) {
        if (getActivity().isFinishing() || kotlin.jvm.internal.o.b(this.f347625f, mode)) {
            return;
        }
        android.view.WindowManager.LayoutParams attributes = getActivity().getWindow().getAttributes();
        attributes.preferredDisplayModeId = mode.getModeId();
        getActivity().getWindow().setAttributes(attributes);
        this.f347625f = mode;
        com.tencent.mars.xlog.Log.i("FinderFpsController", "setDisplayRefreshRate targetFps:" + mode.getRefreshRate() + " mode:" + mode);
        O6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: or2.f.onCreate(android.os.Bundle):void");
    }
}
