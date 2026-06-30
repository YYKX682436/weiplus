package kw4;

/* loaded from: classes8.dex */
public class z extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f313210h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ lw4.a f313211i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f313212j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kw4.c0 f313213k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kw4.c0 c0Var, long j17, java.lang.Boolean bool, int i17, lw4.a aVar, boolean z17) {
        super(j17, bool);
        this.f313213k = c0Var;
        this.f313210h = i17;
        this.f313211i = aVar;
        this.f313212j = z17;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        kw4.b0 e17;
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        android.view.ViewGroup c17;
        kw4.c0 c0Var = this.f313213k;
        int i17 = c0Var.f313158d;
        int i18 = this.f313210h;
        boolean z17 = false;
        if (i18 != i17 && (e17 = c0Var.e(i18)) != null && (weakReference = e17.f313146a) != null && (view = (android.view.View) weakReference.get()) != null) {
            c0Var.f313159e = i18;
            int i19 = e17.f313148c;
            android.view.ViewGroup c18 = c0Var.c(i19);
            kw4.b0 e18 = c0Var.e(i19);
            if (e18 != null && (c17 = c0Var.c(e18.f313148c)) != null) {
                android.view.View view2 = (android.view.View) weakReference.get();
                if (view2 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    view2.setLayoutParams(layoutParams);
                }
                c0Var.f313159e = e18.f313147b;
                e17 = e18;
                c18 = c17;
            }
            if (c18 != null) {
                view = (android.view.View) e17.f313146a.get();
                c18.addView(c0Var.f313161g, c18.indexOfChild(view));
                c18.removeView(view);
            }
            c0Var.f313160f = new float[]{view.getX(), view.getY(), view.getWidth(), view.getHeight(), e17.f313149d};
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = (com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) c0Var.f313163i;
            baseSearchWebViewUI.J9();
            baseSearchWebViewUI.V3 = view;
            android.view.ViewGroup.LayoutParams layoutParams2 = new android.view.ViewGroup.LayoutParams(-1, -1);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) baseSearchWebViewUI.getWindow().getDecorView();
            viewGroup.addView(view, layoutParams2);
            view.setX(0.0f);
            view.setY(0.0f);
            if (fp.h.a(19)) {
                viewGroup.setSystemUiVisibility(2);
            } else {
                viewGroup.setSystemUiVisibility(4098);
            }
            baseSearchWebViewUI.getWindow().addFlags(1024);
            if (this.f313212j) {
                baseSearchWebViewUI.setRequestedOrientation(0);
            }
            c0Var.f313158d = i18;
            c0Var.f313162h = this.f313211i;
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
