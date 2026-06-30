package kk5;

/* loaded from: classes.dex */
public abstract class c extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f308617d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f308618e;

    /* renamed from: f, reason: collision with root package name */
    public long f308619f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f308620g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f308621h;

    /* renamed from: i, reason: collision with root package name */
    public final int f308622i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f308617d = jz5.h.b(kk5.a.f308610d);
        this.f308618e = jz5.h.b(kk5.b.f308613d);
        this.f308620g = "yuanbao_enter_h5";
        this.f308621h = "yuanbao_h5_page_out";
        this.f308622i = 35480;
    }

    public abstract java.util.Map T6();

    public abstract java.util.Map U6();

    public abstract java.lang.String V6();

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        this.f308619f = java.lang.System.currentTimeMillis();
        dy1.r rVar = (dy1.r) ((jz5.n) this.f308617d).getValue();
        ((cy1.a) rVar).Ej(this.f308620g, kz5.c1.m(((qg5.e3) ((ct.k3) ((jz5.n) this.f308618e).getValue())).nj(V6()), T6()), this.f308622i);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        dy1.r rVar = (dy1.r) ((jz5.n) this.f308617d).getValue();
        jz5.g gVar = this.f308618e;
        ((cy1.a) rVar).Ej(this.f308621h, kz5.c1.m(kz5.c1.m(((qg5.e3) ((ct.k3) ((jz5.n) gVar).getValue())).nj(V6()), kz5.b1.e(new jz5.l("stay_duration", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f308619f)))), U6()), this.f308622i);
        ((qg5.e3) ((ct.k3) ((jz5.n) gVar).getValue())).oj(V6());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = activity instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) activity : null;
        java.lang.String G7 = webViewUI != null ? webViewUI.G7() : null;
        if (G7 == null) {
            G7 = "";
        }
        ((qg5.e3) ((ct.k3) ((jz5.n) this.f308618e).getValue())).rj(V6(), kz5.b1.e(new jz5.l("webview_session_id", G7)));
    }
}
