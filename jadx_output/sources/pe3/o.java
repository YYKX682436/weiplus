package pe3;

/* loaded from: classes7.dex */
public final class o extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView f353668d;

    /* renamed from: e, reason: collision with root package name */
    public final se3.e f353669e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.y0 f353670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = androidx.lifecycle.k1.a(activity, null).a(se3.e.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f353669e = (se3.e) a17;
    }

    public final void O6() {
        kotlinx.coroutines.y0 y0Var = this.f353670f;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        this.f353670f = null;
        com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView magicBrushSclDemoView = this.f353668d;
        if (magicBrushSclDemoView == null) {
            kotlin.jvm.internal.o.o("frameSetView");
            throw null;
        }
        magicBrushSclDemoView.setVisibility(4);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pe3.f fVar = (pe3.f) pf5.z.f353948a.a(activity).a(pe3.f.class);
        hq0.e0 e0Var = fVar.f353652d;
        if (e0Var != null) {
            java.lang.String str = e0Var.f282984e;
            oe3.c cVar = fVar.f353654f;
            cVar.F1(str);
            cVar.destroy();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.gdx);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f353668d = (com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView) findViewById;
        android.view.View findViewById2 = getActivity().findViewById(com.tencent.mm.R.id.f484047cu0);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((android.widget.FrameLayout) findViewById2).addView(((pe3.f) pf5.z.f353948a.a(activity).a(pe3.f.class)).f353655g, new android.view.ViewGroup.LayoutParams(-1, -1));
        getActivity().findViewById(com.tencent.mm.R.id.f485341hd0).setOnClickListener(new pe3.j(this));
        getActivity().findViewById(com.tencent.mm.R.id.b5x).setOnClickListener(new pe3.k(this));
        getActivity().findViewById(com.tencent.mm.R.id.nja).setOnClickListener(new pe3.l(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        O6();
    }
}
