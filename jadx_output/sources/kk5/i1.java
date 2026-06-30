package kk5;

/* loaded from: classes8.dex */
public final class i1 extends wm3.a implements wm3.m {

    /* renamed from: m, reason: collision with root package name */
    public static yz5.a f308651m;

    /* renamed from: n, reason: collision with root package name */
    public static xj.m f308652n;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f308653d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f308654e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f308655f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f308656g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f308657h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f308658i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f308653d = jz5.h.b(kk5.h1.f308646d);
        this.f308654e = jz5.h.b(kk5.y0.f308703d);
        this.f308655f = jz5.h.b(kk5.g1.f308643d);
        this.f308656g = jz5.h.b(kk5.x0.f308700d);
        this.f308657h = jz5.h.b(new kk5.f1(this));
        this.f308658i = jz5.h.b(new kk5.e1(this));
    }

    public final ct.k3 T6() {
        return (ct.k3) ((jz5.n) this.f308653d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eqz;
    }

    @Override // wm3.m
    public boolean i() {
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity = activity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity ? (com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) activity : null;
        if (baseMvvmActivity != null) {
            baseMvvmActivity.setMMTitle("");
            baseMvvmActivity.hideActionbarLine();
            baseMvvmActivity.hideActionBarOperationArea();
            androidx.appcompat.app.b supportActionBar = baseMvvmActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o();
            }
            ul5.k bounceView = baseMvvmActivity.getBounceView();
            if (bounceView != null) {
                bounceView.setBounceEnabled(false);
            }
        }
        ((ht.w) ((jt.c0) ((jz5.n) this.f308655f).getValue())).getClass();
        com.tencent.mm.pluginsdk.model.h4 h4Var = com.tencent.mm.pluginsdk.model.h4.f189337a;
        boolean b17 = ik1.b.b(getContext(), "com.tencent.hunyuan.app.chat");
        xj.m mVar = f308652n;
        f308652n = null;
        jz5.g gVar = this.f308657h;
        if (mVar == null && !b17) {
            em.l4 l4Var = (em.l4) ((jz5.n) gVar).getValue();
            if (l4Var.f254574b == null) {
                l4Var.f254574b = (android.widget.LinearLayout) l4Var.f254573a.findViewById(com.tencent.mm.R.id.hu8);
            }
            l4Var.f254574b.setVisibility(8);
        }
        em.l4 l4Var2 = (em.l4) ((jz5.n) gVar).getValue();
        if (l4Var2.f254574b == null) {
            l4Var2.f254574b = (android.widget.LinearLayout) l4Var2.f254573a.findViewById(com.tencent.mm.R.id.hu8);
        }
        l4Var2.f254574b.setOnClickListener(new kk5.b1(this, mVar, "com.tencent.hunyuan.app.chat"));
        em.l4 l4Var3 = (em.l4) ((jz5.n) gVar).getValue();
        if (l4Var3.f254575c == null) {
            l4Var3.f254575c = (android.widget.TextView) l4Var3.f254573a.findViewById(com.tencent.mm.R.id.b5i);
        }
        l4Var3.f254575c.setOnClickListener(new kk5.c1(this));
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new kk5.d1(this, "com.tencent.hunyuan.app.chat", null), 3, null);
        qg5.e3 e3Var = (qg5.e3) T6();
        ((cy1.a) e3Var.ij()).Hj("multi_select_sub_open_yuanbao_btn", "view_exp", e3Var.nj("journey_copy"), 35480);
    }
}
