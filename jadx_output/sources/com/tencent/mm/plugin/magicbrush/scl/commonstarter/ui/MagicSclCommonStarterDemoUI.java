package com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/scl/commonstarter/ui/MagicSclCommonStarterDemoUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class MagicSclCommonStarterDemoUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f148127g = kz5.c0.i(new vd3.f(), new vd3.d(), new lq0.d());

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f148128d;

    /* renamed from: e, reason: collision with root package name */
    public iq0.c f148129e;

    /* renamed from: f, reason: collision with root package name */
    public jq0.b f148130f;

    public static final void U6(com.tencent.mm.plugin.magicbrush.scl.commonstarter.ui.MagicSclCommonStarterDemoUI magicSclCommonStarterDemoUI) {
        magicSclCommonStarterDemoUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclCommonStarterDemoUI", "stop");
        iq0.c cVar = magicSclCommonStarterDemoUI.f148129e;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Di(cVar);
        }
        jq0.b bVar = magicSclCommonStarterDemoUI.f148130f;
        if (bVar != null) {
            hq0.b0 b0Var = bVar.f301046a;
            if (b0Var != null) {
                b0Var.deactivate();
            }
            hq0.b0 b0Var2 = bVar.f301046a;
            if (b0Var2 != null) {
                b0Var2.destroy();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.doh;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("MagicSclCommonStarterDemoUI");
        setBackBtn(new ke3.g(this));
        this.f148128d = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.r5k);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ngb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.Button) findViewById).setOnClickListener(new ke3.a(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.j2h);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        ((android.widget.Button) findViewById2).setOnClickListener(new ke3.b(this));
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.rdq);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        ((android.widget.Button) findViewById3).setOnClickListener(new ke3.c(this));
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.nja);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        ((android.widget.Button) findViewById4).setOnClickListener(new ke3.d(this));
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.cki);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        ((android.widget.Button) findViewById5).setOnClickListener(new ke3.e(this));
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.r8o);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        ((android.widget.Button) findViewById6).setOnClickListener(new ke3.f(this));
    }
}
