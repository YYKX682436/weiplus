package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingProtectUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes8.dex */
public final class FinderSettingProtectUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f128749w = 0;

    /* renamed from: t, reason: collision with root package name */
    public az2.f f128750t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f128751u = "";

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.wh f128752v = new com.tencent.mm.plugin.finder.ui.wh(this);

    public final void c7() {
        r45.h23 h23Var;
        if (!hc2.s.g()) {
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.tuu)).setText(getString(com.tencent.mm.R.string.o07));
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.tul)).setText(getString(com.tencent.mm.R.string.f492013o04));
            android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.tuk);
            button.setText(getString(com.tencent.mm.R.string.f490508x2));
            button.setTextColor(button.getContext().getColor(com.tencent.mm.R.color.f478838io));
            button.setBackgroundResource(com.tencent.mm.R.drawable.f481057jk);
            return;
        }
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.tuu)).setText(getString(com.tencent.mm.R.string.nzz));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.tul);
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.fcl);
        long j17 = 1000;
        g92.b bVar = g92.b.f269769e;
        m92.b j37 = g92.a.j3(bVar, bVar.U(), false, 2, null);
        objArr[0] = android.text.format.DateFormat.format(string, j17 * ((j37 == null || (h23Var = (r45.h23) j37.u0().getCustom(52)) == null) ? 0L : h23Var.getLong(0)));
        textView.setText(getString(com.tencent.mm.R.string.f492014o05, objArr));
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.tuk);
        button2.setText(getString(com.tencent.mm.R.string.nzx));
        com.tencent.mm.ui.fk.b(button2);
        button2.setTextColor(button2.getContext().getColor(com.tencent.mm.R.color.aax));
        button2.setBackgroundResource(com.tencent.mm.R.drawable.f481068jy);
    }

    public final void d7() {
        az2.f fVar = this.f128750t;
        if (fVar != null) {
            fVar.b();
        }
        az2.c cVar = az2.f.f16125d;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        az2.f a17 = az2.c.a(cVar, context, getContext().getString(com.tencent.mm.R.string.f490604zq), 0L, null, 8, null);
        this.f128750t = a17;
        a17.a();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eeb;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f128751u = stringExtra;
        if (stringExtra.length() == 0) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f128751u = xy2.c.e(context);
        }
        c7();
        setMMTitle("");
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.f478491c, null));
        getController().p0(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c, null));
        hideActionbarLine();
        findViewById(com.tencent.mm.R.id.tuk).setOnClickListener(new com.tencent.mm.plugin.finder.ui.xh(this));
        setBackBtn(new com.tencent.mm.plugin.finder.ui.yh(this));
    }
}
