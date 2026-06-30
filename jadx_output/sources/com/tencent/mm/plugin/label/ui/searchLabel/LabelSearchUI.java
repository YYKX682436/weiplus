package com.tencent.mm.plugin.label.ui.searchLabel;

/* loaded from: classes11.dex */
public class LabelSearchUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f143385u = 0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f143386d;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.tools.c9 f143390h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f143391i;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f143393n;

    /* renamed from: o, reason: collision with root package name */
    public i93.e f143394o;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f143396q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f143397r;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f143399t;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f143387e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f143388f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public int f143389g = -1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f143392m = false;

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f143395p = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f143398s = true;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bnc;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dg6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI", "hideViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f143386d = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.hsb);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dg6);
        this.f143391i = textView2;
        textView2.setText(com.tencent.mm.R.string.f489898eu);
        this.f143389g = getIntent().getIntExtra("edit_mode_state", -1);
        this.f143395p = b93.r.wi().i1();
        i93.e eVar = new i93.e(getContext());
        this.f143394o = eVar;
        eVar.f289739s = true;
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.profile.RepairerConfigLabelSearchByContact()) == 1) {
            this.f143394o.f289740t = getIntent().getBooleanExtra("contact_search_label_show_member_count", true);
        } else {
            this.f143394o.f289740t = getIntent().getBooleanExtra("contact_search_label_show_member_count", false);
        }
        this.f143394o.f289741u = getIntent().getBooleanExtra("contact_search_label_enable_choose_empty_label", true);
        this.f143398s = getIntent().getBooleanExtra("contact_search_label_need_toast_after_choose", true);
        java.lang.String stringExtra = getIntent().getStringExtra("contact_has_choose_label_list");
        if (!android.text.TextUtils.isEmpty(stringExtra)) {
            this.f143387e.clear();
            this.f143387e.addAll(com.tencent.mm.sdk.platformtools.t8.O1(stringExtra, ","));
            if (!this.f143387e.isEmpty()) {
                this.f143394o.f289731h = this.f143387e;
            }
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("contact_search_label_forbid_select_label_id_list");
        if (!android.text.TextUtils.isEmpty(stringExtra2)) {
            this.f143388f.clear();
            this.f143388f.addAll(com.tencent.mm.sdk.platformtools.t8.O1(stringExtra2, ","));
            this.f143394o.f289733m = this.f143388f;
        }
        this.f143386d.setAdapter(this.f143394o);
        this.f143386d.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        this.f143386d.setHasFixedSize(true);
        this.f143394o.z(this.f143395p);
        com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9(true, false);
        this.f143390h = c9Var;
        c9Var.c(true);
        this.f143390h.f210318c = true;
        this.f143396q = findViewById(com.tencent.mm.R.id.f484151d61);
        this.f143390h.q(getResources().getString(com.tencent.mm.R.string.g9m));
        this.f143394o.f289736p = this.f143395p;
        android.view.View view = this.f143396q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.tools.c9 c9Var2 = this.f143390h;
        c9Var2.f210330o = new i93.g$$a(this);
        c9Var2.f210324i = new i93.h(this);
        addSearchMenu(true, c9Var2);
        this.f143399t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gx7);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.jbm);
        this.f143393n = button;
        button.setText(getResources().getString(com.tencent.mm.R.string.f490493wm));
        this.f143399t.setOnClickListener(new i93.i(this));
        this.f143393n.setOnClickListener(new i93.j(this));
        this.f143394o.f289742v = new i93.k(this);
        setBackBtn(new i93.l(this));
        this.f143386d.setVisibility(4);
        android.view.ViewGroup.LayoutParams layoutParams = this.f143386d.getLayoutParams();
        if ((this.f143389g == 0) && (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            this.f143386d.setLayoutParams(layoutParams);
        }
        if (this.f143394o.getItemCount() == 0) {
            this.f143391i.setSingleLine(false);
            this.f143391i.setPadding(40, 0, 40, 0);
            this.f143391i.setVisibility(0);
        }
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(this);
        this.f143397r = f5Var;
        f5Var.f210400e = this;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.ui.tools.f5 f5Var = this.f143397r;
        if (f5Var != null) {
            f5Var.d();
        }
        super.onPause();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.mm.ui.tools.f5 f5Var = this.f143397r;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(i93.d.class);
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        android.animation.ObjectAnimator ofFloat;
        com.tencent.mars.xlog.Log.i("MicroMsg.LabelSearchUI", "onKeyboardHeightChanged, height:%s", java.lang.Integer.valueOf(i17));
        android.view.View view = this.f143396q;
        if (view == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LabelSearchUI", "moveViewUppos, container: isNull");
            return;
        }
        if (i17 > 0) {
            if (view.getTranslationY() != 0.0f) {
                view.setTranslationY(0.0f);
            }
            ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationY", 0.0f, -i17);
        } else {
            ofFloat = android.animation.ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), 0.0f);
        }
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new y3.b());
        ofFloat.addUpdateListener(new i93.m(this));
        ofFloat.start();
    }
}
