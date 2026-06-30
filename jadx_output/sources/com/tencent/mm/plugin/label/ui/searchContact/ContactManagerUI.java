package com.tencent.mm.plugin.label.ui.searchContact;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "Ll75/z0;", "Lo13/x;", "Landroid/view/View;", "e", "Landroid/view/View;", "getMMainView", "()Landroid/view/View;", "setMMainView", "(Landroid/view/View;)V", "mMainView", "f", "getMEditFooter", "setMEditFooter", "mEditFooter", "h", "getMEmptyView", "setMEmptyView", "mEmptyView", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ContactManagerUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, l75.z0, o13.x {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f143316z = 0;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.view.View mMainView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.view.View mEditFooter;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f143320g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public android.view.View mEmptyView;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f143322i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f143323m;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f143326p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f143328r;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxLinearLayoutManager f143332v;

    /* renamed from: d, reason: collision with root package name */
    public final int f143317d = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 50);

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f143324n = "";

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f143325o = new com.tencent.mm.sdk.platformtools.n3();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashSet f143327q = new java.util.HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f143329s = new com.tencent.mm.plugin.label.ui.searchContact.o(this);

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f143330t = jz5.h.b(new com.tencent.mm.plugin.label.ui.searchContact.g(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f143331u = jz5.h.b(new com.tencent.mm.plugin.label.ui.searchContact.m(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f143333w = jz5.h.b(new com.tencent.mm.plugin.label.ui.searchContact.n(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f143334x = jz5.h.b(new com.tencent.mm.plugin.label.ui.searchContact.r(this));

    /* renamed from: y, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f143335y = new com.tencent.mm.plugin.label.ui.searchContact.p(this);

    public final com.tencent.mm.plugin.label.ui.searchContact.f T6() {
        return (com.tencent.mm.plugin.label.ui.searchContact.f) ((jz5.n) this.f143330t).getValue();
    }

    public final com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList U6() {
        return (com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList) ((jz5.n) this.f143331u).getValue();
    }

    public final void V6() {
        java.util.ArrayList arrayList;
        android.widget.Button button = this.f143320g;
        kotlin.jvm.internal.o.d(button);
        com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList U6 = U6();
        kotlin.jvm.internal.o.d(U6);
        button.setEnabled(U6.A.size() > 0);
        com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList U62 = U6();
        kotlin.jvm.internal.o.d(U62);
        if (U62.A.size() > 0) {
            android.widget.Button button2 = this.f143320g;
            kotlin.jvm.internal.o.d(button2);
            button2.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479291v7));
        } else {
            android.widget.Button button3 = this.f143320g;
            kotlin.jvm.internal.o.d(button3);
            button3.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478720fb));
        }
        com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList U63 = U6();
        kotlin.jvm.internal.o.d(U63);
        if (U63.A.size() > 0) {
            android.widget.Button button4 = this.f143320g;
            kotlin.jvm.internal.o.d(button4);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(getResources().getString(com.tencent.mm.R.string.bod));
            sb6.append(" (");
            com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList U64 = U6();
            kotlin.jvm.internal.o.d(U64);
            sb6.append(U64.A.size());
            sb6.append(')');
            button4.setText(sb6.toString());
        } else {
            android.widget.Button button5 = this.f143320g;
            kotlin.jvm.internal.o.d(button5);
            button5.setText(getResources().getString(com.tencent.mm.R.string.bod));
        }
        android.widget.TextView textView = this.f143323m;
        if (textView != null) {
            kotlin.jvm.internal.o.d(textView);
            textView.setVisibility(0);
            com.tencent.mm.plugin.label.ui.searchContact.f T6 = T6();
            java.util.ArrayList arrayList2 = T6 != null ? T6.f143367p : null;
            kotlin.jvm.internal.o.d(arrayList2);
            int size = arrayList2.size();
            if (size > 1) {
                android.widget.TextView textView2 = this.f143323m;
                if (textView2 == null) {
                    return;
                }
                android.content.res.Resources resources = getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                com.tencent.mm.plugin.label.ui.searchContact.f T62 = T6();
                arrayList = T62 != null ? T62.f143367p : null;
                kotlin.jvm.internal.o.d(arrayList);
                objArr[0] = arrayList.get(0);
                textView2.setText(resources.getString(com.tencent.mm.R.string.bk6, objArr));
                return;
            }
            if (size != 1) {
                android.widget.TextView textView3 = this.f143323m;
                if (textView3 == null) {
                    return;
                }
                textView3.setVisibility(8);
                return;
            }
            android.widget.TextView textView4 = this.f143323m;
            if (textView4 == null) {
                return;
            }
            android.content.res.Resources resources2 = getResources();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            com.tencent.mm.plugin.label.ui.searchContact.f T63 = T6();
            arrayList = T63 != null ? T63.f143367p : null;
            kotlin.jvm.internal.o.d(arrayList);
            objArr2[0] = arrayList.get(0);
            textView4.setText(resources2.getString(com.tencent.mm.R.string.bk9, objArr2));
        }
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        V6();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 stg, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(stg, "stg");
        kotlin.jvm.internal.o.g(obj, "obj");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f143329s;
        if (n3Var != null) {
            n3Var.removeMessages(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT);
            n3Var.sendEmptyMessageDelayed(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT, 400L);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getCustomBounceId() {
        return com.tencent.mm.R.id.cas;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a2k;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String string;
        hideActionbarLine();
        java.lang.String stringExtra = getIntent().getStringExtra("contact_search_query");
        this.f143324n = stringExtra;
        kotlin.jvm.internal.o.d(stringExtra);
        if (stringExtra.length() > 10) {
            java.lang.String str = this.f143324n;
            kotlin.jvm.internal.o.d(str);
            java.lang.String substring = str.substring(0, 11);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            string = getString(com.tencent.mm.R.string.bbd, substring.concat("..."));
            kotlin.jvm.internal.o.d(string);
        } else {
            string = getString(com.tencent.mm.R.string.bbd, this.f143324n);
            kotlin.jvm.internal.o.d(string);
        }
        setMMTitle(string);
        setBackBtn(this.f143335y, com.tencent.mm.R.raw.actionbar_icon_dark_back);
        this.mMainView = findViewById(com.tencent.mm.R.id.hsc);
        this.mEmptyView = findViewById(com.tencent.mm.R.id.f485469hs4);
        this.f143322i = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.cas);
        this.f143323m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cej);
        this.f143332v = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(this);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f143322i;
        kotlin.jvm.internal.o.d(wxRecyclerView);
        wxRecyclerView.setLayoutManager(this.f143332v);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f143322i;
        kotlin.jvm.internal.o.d(wxRecyclerView2);
        wxRecyclerView2.setHasFixedSize(true);
        this.mEditFooter = findViewById(com.tencent.mm.R.id.f484151d61);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.ctd);
        this.f143320g = button;
        if (button != null) {
            button.setOnClickListener(new com.tencent.mm.plugin.label.ui.searchContact.l(this));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f143322i;
        kotlin.jvm.internal.o.d(wxRecyclerView3);
        jz5.g gVar = this.f143333w;
        wxRecyclerView3.setAdapter((xm3.t0) ((jz5.n) gVar).getValue());
        com.tencent.mm.plugin.label.ui.searchContact.f T6 = T6();
        if (T6 != null) {
            T6.f143361g = U6();
        }
        com.tencent.mm.plugin.label.ui.searchContact.f T62 = T6();
        if (T62 != null) {
            T62.f143362h = this;
        }
        xm3.t0 t0Var = (xm3.t0) ((jz5.n) gVar).getValue();
        if (t0Var != null) {
            t0Var.B = (com.tencent.mm.plugin.label.ui.searchContact.q) ((jz5.n) this.f143334x).getValue();
        }
        android.widget.Button button2 = this.f143320g;
        if (button2 != null) {
            button2.setEnabled(false);
        }
        b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), 1L, 0L, 0L, 0L);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        removeAllOptionMenu();
        android.view.View view = this.mEditFooter;
        kotlin.jvm.internal.o.d(view);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/label/ui/searchContact/ContactManagerUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.Button button = this.f143320g;
        kotlin.jvm.internal.o.d(button);
        button.setEnabled(false);
        android.widget.Button button2 = this.f143320g;
        kotlin.jvm.internal.o.d(button2);
        button2.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478720fb));
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        gm0.j1.n().f273288b.a(3990, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        gm0.j1.n().f273288b.q(3990, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 != 4 || event.getAction() != 0) {
            return super.onKeyDown(i17, event);
        }
        finish();
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        java.lang.String errMsg;
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (scene instanceof w11.h0) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f143326p;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f143326p = null;
            }
            if (i17 == 0 && i18 == 0) {
                dp.a.makeText(this, getString(com.tencent.mm.R.string.bbf), 0).show();
                java.util.HashSet hashSet = this.f143327q;
                java.util.List list = ((w11.h0) scene).f442039e;
                hashSet.addAll(list);
                com.tencent.mm.plugin.label.ui.searchContact.f T6 = T6();
                if (T6 != null) {
                    T6.f143360f = hashSet;
                }
                kotlin.jvm.internal.o.f(list, "getNames(...)");
                com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList U6 = U6();
                kotlin.jvm.internal.o.d(U6);
                U6.A.removeAll(list);
                V6();
                this.f143328r = true;
                return;
            }
            if (i18 != -3503) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
                if (i18 == -3500) {
                    w11.h0 h0Var = (w11.h0) scene;
                    errMsg = getString(com.tencent.mm.R.string.bba, java.lang.Integer.valueOf(h0Var.f442045n - ((java.util.LinkedList) h0Var.f442039e).size()));
                } else {
                    errMsg = scene.getReqResp().getRespObj().getErrMsg();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(errMsg)) {
                        errMsg = ((w11.h0) scene).H() == null ? getString(com.tencent.mm.R.string.bbb) : getString(com.tencent.mm.R.string.bbc);
                    }
                }
                u1Var.g(errMsg);
                u1Var.m(com.tencent.mm.R.string.f490507x1);
                u1Var.l(com.tencent.mm.plugin.label.ui.searchContact.t.f143382a);
                u1Var.q(false);
                return;
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(this);
            java.lang.String errMsg2 = scene.getReqResp().getRespObj().getErrMsg();
            java.lang.String string = getString(com.tencent.mm.R.string.bbc);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (errMsg2 == null) {
                errMsg2 = string;
            }
            u1Var2.g(errMsg2);
            u1Var2.a(true);
            u1Var2.j(getString(com.tencent.mm.R.string.hmr));
            u1Var2.m(com.tencent.mm.R.string.hms);
            u1Var2.b(new com.tencent.mm.plugin.label.ui.searchContact.s(this));
            u1Var2.q(false);
        }
    }

    public final void setMEditFooter(android.view.View view) {
        this.mEditFooter = view;
    }

    public final void setMEmptyView(android.view.View view) {
        this.mEmptyView = view;
    }

    public final void setMMainView(android.view.View view) {
        this.mMainView = view;
    }
}
