package com.tencent.mm.pluginsdk.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "com/tencent/mm/pluginsdk/ui/v0", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes8.dex */
public final class FileSelectorPreviewUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f189767i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f189768d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f189769e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f189770f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Intent f189771g = new android.content.Intent();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f189772h = "";

    public final void U6() {
        long j17;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e45.t tVar = (e45.t) pf5.z.f353948a.a(context).a(e45.t.class);
        int size = this.f189770f.size();
        if (size <= 0) {
            android.widget.TextView textView = tVar.f249427d;
            if (textView != null) {
                textView.setVisibility(4);
            }
        } else {
            android.widget.TextView textView2 = tVar.f249427d;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.widget.TextView textView3 = tVar.f249427d;
            if (textView3 != null) {
                textView3.setText(tVar.getContext().getString(com.tencent.mm.R.string.dcy, java.lang.Integer.valueOf(size)));
            }
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.taj);
        if (!((d40.n) ((e40.v) i95.n0.c(e40.v.class))).wi()) {
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
            return;
        }
        long j18 = 0;
        for (com.tencent.mm.pluginsdk.ui.v0 v0Var : this.f189770f) {
            com.tencent.mm.pluginsdk.ui.tools.d2 d2Var = v0Var.f192029d;
            if (!(d2Var != null && d2Var.f191568l)) {
                int h17 = v0Var.h();
                if (h17 == 1) {
                    com.tencent.mm.pluginsdk.ui.tools.d2 d2Var2 = v0Var.f192029d;
                    if (d2Var2 != null) {
                        j17 = d2Var2.f191566j;
                    }
                } else if (h17 == 2) {
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = v0Var.f192030e;
                    j17 = com.tencent.mm.vfs.w6.k(galleryItem$MediaItem != null ? galleryItem$MediaItem.f138430e : null);
                }
                j18 += j17;
            }
            j17 = 0;
            j18 += j17;
        }
        if (j18 > ip.c.k()) {
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(0);
        } else {
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        c01.n2.d().c("KEY_DARA_CENTER_FILE_SELECTOR_SELECTED_FILE_LIST", true).i("INTENT_KEY_DATA_LIST", this.f189770f);
        android.content.Intent intent = this.f189771g;
        intent.putExtra("RESULT_KEY_LAST_SELECTED_TAB", getIntent().getIntExtra("INTENT_KEY_LAST_SELECTED_TAB", 0));
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.vfh);
        intent.putExtra("RESULT_KEY_IS_NEED_CLEAN", checkBox != null ? checkBox.isChecked() : getIntent().getBooleanExtra("INTENT_KEY_IS_NEED_CLEAN", true));
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487933dm;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.j(importUIComponents, e45.t.class);
        }
        return null;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        androidx.recyclerview.widget.f2 adapter;
        o25.n1.f(this);
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        java.lang.Object b17 = c01.n2.d().c("KEY_DARA_CENTER_FILE_SELECTOR_SELECTED_FILE_LIST", true).b("INTENT_KEY_DATA_LIST");
        java.util.ArrayList arrayList = b17 instanceof java.util.ArrayList ? (java.util.ArrayList) b17 : null;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        this.f189770f = arrayList;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.lqa);
        this.f189768d = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 1, false));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI$buildItemConverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.pluginsdk.ui.u0(new com.tencent.mm.pluginsdk.ui.w0(com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI.this));
            }
        }, this.f189770f, false);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f189768d;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(wxRecyclerAdapter);
        }
        if (getIntent().getBooleanExtra("INTENT_KEY_SCROLL_TO_LAST", false)) {
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f189768d;
            int itemCount = (wxRecyclerView3 == null || (adapter = wxRecyclerView3.getAdapter()) == null) ? 0 : adapter.getItemCount();
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = this.f189768d;
            if (wxRecyclerView4 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(itemCount - 1));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(wxRecyclerView4, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
                wxRecyclerView4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(wxRecyclerView4, "com/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        this.f189769e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qxd);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.owo);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            android.view.View findViewById = findViewById(com.tencent.mm.R.layout.ac9);
            if (findViewById == null) {
                findViewById = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ac9, (android.view.ViewGroup) null);
            }
            frameLayout.addView(findViewById);
            android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.smz);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new com.tencent.mm.pluginsdk.ui.x0(this));
            }
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.hhc);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new com.tencent.mm.pluginsdk.ui.y0(this));
        }
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.vfh);
        if (checkBox != null) {
            checkBox.setChecked(getIntent().getBooleanExtra("INTENT_KEY_IS_NEED_CLEAN", true));
        }
        android.widget.TextView textView = this.f189769e;
        if (textView != null) {
            textView.setVisibility(com.tencent.mm.sdk.platformtools.t8.L0(this.f189770f) ? 0 : 8);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView5 = this.f189768d;
        if (wxRecyclerView5 == null) {
            return;
        }
        wxRecyclerView5.setVisibility(com.tencent.mm.sdk.platformtools.t8.L0(this.f189770f) ? 8 : 0);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        U6();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f189772h)) {
            java.lang.String stringExtra = getIntent().getStringExtra("INTENT_KEY_ACTION_BUTTON_TEXT");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f189772h = stringExtra;
        }
        com.tencent.mm.sdk.platformtools.t8.K0(this.f189772h);
    }
}
