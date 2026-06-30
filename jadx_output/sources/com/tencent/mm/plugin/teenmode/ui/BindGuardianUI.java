package com.tencent.mm.plugin.teenmode.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/BindGuardianUI;", "Lcom/tencent/mm/ui/MMActivity;", "Luh4/i0;", "<init>", "()V", "plugin-teenmode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BindGuardianUI extends com.tencent.mm.ui.MMActivity implements uh4.i0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f172827h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f172828d = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.w0(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f172829e = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.x0(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f172830f = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.g1(this));

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f172831g = ((uh4.c0) i95.n0.c(uh4.c0.class)).df();

    public static final void T6(com.tencent.mm.plugin.teenmode.ui.BindGuardianUI bindGuardianUI, java.lang.String str) {
        android.widget.TextView textView = (android.widget.TextView) bindGuardianUI.findViewById(com.tencent.mm.R.id.dhj);
        textView.setVisibility(0);
        if (str == null) {
            str = bindGuardianUI.getString(com.tencent.mm.R.string.f490390tn);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        textView.setText(str);
    }

    public final void U6(boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206781b & (-65));
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", getString(com.tencent.mm.R.string.f493324jr2));
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("without_openim", true);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c01.z1.r());
        com.tencent.mm.storage.z3 z3Var = this.f172831g;
        if (z3Var != null) {
            arrayList.add(z3Var.d1());
        }
        intent.putExtra("block_contact", kz5.n0.g0(arrayList, ",", null, null, 0, null, com.tencent.mm.plugin.teenmode.ui.d1.f172964d, 30, null));
        j45.l.v(this, ".ui.contact.SelectContactUI", intent, z17 ? 102 : 101);
    }

    public final void V6() {
        if (this.f172831g == null) {
            android.widget.Button button = (android.widget.Button) ((jz5.n) this.f172828d).getValue();
            button.setVisibility(0);
            button.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.h1(this));
        } else if (c01.e2.a0()) {
            android.widget.Button button2 = (android.widget.Button) ((jz5.n) this.f172829e).getValue();
            button2.setVisibility(0);
            button2.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.i1(this));
        } else {
            android.widget.Button button3 = (android.widget.Button) ((jz5.n) this.f172830f).getValue();
            button3.setVisibility(0);
            button3.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.k1(button3, this));
        }
        if (this.f172831g == null) {
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f484050cu2)).setText(com.tencent.mm.R.string.jrb);
            ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.aiu)).setVisibility(8);
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.o3_)).setVisibility(8);
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484050cu2);
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.storage.z3 z3Var = this.f172831g;
        objArr[0] = z3Var != null ? z3Var.g2() : null;
        textView.setText(getString(com.tencent.mm.R.string.f493325jr3, objArr));
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.aiu)).setVisibility(0);
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.gvg);
        com.tencent.mm.storage.z3 z3Var2 = this.f172831g;
        ((com.tencent.mm.feature.avatar.w) zVar).Ai(imageView, z3Var2 != null ? z3Var2.d1() : null, null);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gvj);
        com.tencent.mm.storage.z3 z3Var3 = this.f172831g;
        textView2.setText(z3Var3 != null ? z3Var3.g2() : null);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cy9;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if ((i17 == 101 || i17 == 102) && i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            if (stringExtra == null || stringExtra.length() == 0) {
                return;
            }
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(this, "", getContext().getString(com.tencent.mm.R.string.ggd), true, false, null);
            Q.show();
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.dhj)).setVisibility(8);
            kotlin.jvm.internal.o.d(stringExtra);
            int i19 = i17 != 101 ? 1 : 0;
            com.tencent.mm.storage.z3 z3Var = this.f172831g;
            pq5.g l17 = new vh4.e1(stringExtra, i19, z3Var != null ? z3Var.d1() : null).l();
            l17.f(this);
            l17.h(new com.tencent.mm.plugin.teenmode.ui.a1(Q, this, stringExtra, i17));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.fk.b((android.widget.TextView) findViewById);
        setBackBtn(new com.tencent.mm.plugin.teenmode.ui.b1(this));
        V6();
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(this);
    }

    @Override // uh4.i0
    public void onDataChanged() {
        this.f172831g = ((uh4.c0) i95.n0.c(uh4.c0.class)).df();
        pm0.v.X(new com.tencent.mm.plugin.teenmode.ui.c1(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((uh4.c0) i95.n0.c(uh4.c0.class)).tc(this);
        super.onDestroy();
    }
}
