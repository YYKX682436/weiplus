package gq5;

/* loaded from: classes5.dex */
public class e extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f274619d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f274620e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f274621f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f274622g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f274623h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f274624i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f274619d = "MicroMsg.WeDrop.WeDropMainUIC";
        this.f274620e = "hasRebuild";
        this.f274621f = jz5.h.b(new gq5.c(this));
        this.f274622g = jz5.h.b(new gq5.d(activity));
        this.f274624i = jz5.h.b(new gq5.b(this));
    }

    public java.lang.String T6() {
        return this.f274619d;
    }

    public int U6() {
        return ((java.lang.Boolean) ((jz5.n) this.f274621f).getValue()).booleanValue() ? 1 : 2;
    }

    public void V6() {
    }

    public void W6(int i17) {
    }

    public void X6(r45.b87 prepareSendRequest, int i17) {
        kotlin.jvm.internal.o.g(prepareSendRequest, "prepareSendRequest");
    }

    public void Y6() {
    }

    public void Z6(int i17, byte[] data, r45.y77 fileInfo) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(fileInfo, "fileInfo");
    }

    public void a7(int i17, byte[] data, r45.y77 fileInfo) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(fileInfo, "fileInfo");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eqq;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
            P6.hideActionbarLine();
            P6.setBackBtnVisible(false);
            P6.setMMTitle("");
            P6.getWindow().addFlags(128);
            androidx.appcompat.app.b supportActionBar = P6.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o();
            }
        }
        this.f274623h = bundle != null ? bundle.getBoolean(this.f274620e) : false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        int U6 = this.f274623h ? ((java.lang.Boolean) ((jz5.n) this.f274621f).getValue()).booleanValue() ? 11 : 12 : U6();
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eq5.c());
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.B3(new eq5.i(U6));
        }
        float q17 = i65.a.q(getContext());
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getRootView().findViewById(com.tencent.mm.R.id.uoc);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) getRootView().findViewById(com.tencent.mm.R.id.l3o);
        android.widget.TextView textView = (android.widget.TextView) getRootView().findViewById(com.tencent.mm.R.id.odf);
        if (q17 <= 1.4f) {
            viewGroup.setPadding(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479657bu), 0, 0);
            int f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479723df);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = f17;
            viewGroup2.setLayoutParams(marginLayoutParams);
            return;
        }
        viewGroup.setPadding(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479723df), 0, 0);
        int f18 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479704cz);
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = f18;
        viewGroup2.setLayoutParams(marginLayoutParams2);
        textView.setTextSize(0, i65.a.j(getContext()) * i65.a.f(getContext(), com.tencent.mm.R.dimen.f479852h1));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.getWindow().clearFlags(128);
        }
        aq5.p0.f13273a.f(null, true);
        com.tencent.mars.xlog.Log.i(T6(), "onDestroy() called");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setRequestedOrientation(1);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putBoolean(this.f274620e, true);
        }
    }
}
