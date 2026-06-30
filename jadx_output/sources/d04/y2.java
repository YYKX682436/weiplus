package d04;

/* loaded from: classes8.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f225562a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.widget.ScanScrollTabView f225563b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f225564c;

    /* renamed from: d, reason: collision with root package name */
    public int f225565d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f225566e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f225567f;

    public y2(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f225562a = context;
        this.f225564c = new java.util.ArrayList();
        this.f225565d = -1;
        d04.v2[] v2VarArr = new d04.v2[3];
        java.lang.String string = context.getString(z17 ? com.tencent.mm.R.string.i99 : com.tencent.mm.R.string.i9f);
        kotlin.jvm.internal.o.d(string);
        v2VarArr[0] = new d04.v2(1, string);
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.i9a);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        v2VarArr[1] = new d04.v2(12, string2);
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.i9e);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        v2VarArr[2] = new d04.v2(3, string3);
        this.f225566e = kz5.c0.d(v2VarArr);
        this.f225567f = new java.util.HashMap();
    }

    public final void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanScrollTabController", "setAccessibilityAvailable :" + z17);
        com.tencent.mm.plugin.scanner.ui.widget.ScanScrollTabView scanScrollTabView = this.f225563b;
        if (scanScrollTabView != null) {
            scanScrollTabView.setTabViewImportantForAccessibility(z17 ? 0 : 4);
        }
    }

    public final void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanScrollTabController", "setEnableSwitchTab enable: %b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.scanner.ui.widget.ScanScrollTabView scanScrollTabView = this.f225563b;
        if (scanScrollTabView != null) {
            scanScrollTabView.setEnableSwitchTab(z17);
        }
    }

    public final void c(int i17, int i18) {
        java.lang.Integer num = (java.lang.Integer) this.f225567f.get(java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanScrollTabController", "setSelectedTab tabId: %d, index: %s, tabSelectedAction: %d", java.lang.Integer.valueOf(i17), num, java.lang.Integer.valueOf(i18));
        if (num != null) {
            this.f225565d = num.intValue();
            com.tencent.mm.plugin.scanner.ui.widget.ScanScrollTabView scanScrollTabView = this.f225563b;
            if (scanScrollTabView != null) {
                scanScrollTabView.h(num.intValue(), i18);
            }
        }
    }
}
