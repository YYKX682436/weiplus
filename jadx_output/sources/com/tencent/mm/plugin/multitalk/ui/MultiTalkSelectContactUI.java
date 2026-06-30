package com.tencent.mm.plugin.multitalk.ui;

@db5.a(3)
/* loaded from: classes11.dex */
public class MultiTalkSelectContactUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public java.lang.String C;
    public java.util.HashSet E;
    public java.util.HashSet F;
    public java.util.ArrayList G;
    public boolean H;
    public sj3.p3 I;

    /* renamed from: J, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f150250J;
    public android.widget.FrameLayout K;
    public sj3.f1 M;
    public boolean D = true;
    public boolean L = false;
    public final android.view.View.OnClickListener N = new com.tencent.mm.plugin.multitalk.ui.v(this);
    public final com.tencent.mm.sdk.event.IListener P = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MultiTalkActionEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI.3
        {
            this.__eventId = 1177822575;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent) {
            com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent2 = multiTalkActionEvent;
            if (!(multiTalkActionEvent2 instanceof com.tencent.mm.autogen.events.MultiTalkActionEvent) || multiTalkActionEvent2.f54504g.f6259a != 0) {
                return false;
            }
            com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI.this.finish();
            return false;
        }
    };

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        return new com.tencent.mm.plugin.multitalk.ui.w(this, this.C);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return new com.tencent.mm.plugin.multitalk.ui.x(this, this.C);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        return getIntent().getStringExtra("titile");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c3x;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string;
        java.lang.String string2;
        com.tencent.mm.ui.contact.p4 b76 = b7();
        com.tencent.mm.ui.contact.item.d item = b76.getItem(i17 - this.f206446d.getHeaderViewsCount());
        if (item == null || (str = item.f206850s) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.multitalk.MultiTalkSelectContactUI", "ClickUser=%s", str);
        java.lang.String str4 = item.f206850s;
        if (c01.z1.r().equals(str4)) {
            return;
        }
        Y6();
        if (this.E.contains(str4)) {
            return;
        }
        boolean contains = this.F.contains(str4);
        android.view.View.OnClickListener onClickListener = this.N;
        if (contains) {
            if (this.H) {
                this.I.b(str4);
            }
            this.F.remove(str4);
            int indexOf = this.G.indexOf(str4);
            this.G.remove(str4);
            sj3.q5 q5Var = (sj3.q5) this.f150250J.getAdapter();
            java.util.ArrayList userNameList = this.G;
            q5Var.getClass();
            kotlin.jvm.internal.o.g(userNameList, "userNameList");
            kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
            java.util.ArrayList arrayList = q5Var.f408718e;
            arrayList.clear();
            arrayList.add(c01.z1.r());
            int size = userNameList.size();
            for (int i18 = 0; i18 < size; i18++) {
                java.lang.Object obj = userNameList.get(i18);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                if (!q5Var.x((java.lang.String) obj) && !kotlin.jvm.internal.o.b(userNameList.get(i18), c01.z1.r())) {
                    arrayList.add(userNameList.get(i18));
                }
            }
            q5Var.f408719f = onClickListener;
            int size2 = arrayList.size();
            int i19 = q5Var.f408720g;
            if (size2 < 5) {
                for (int i27 = 0; i27 < 5; i27++) {
                    q5Var.notifyItemChanged(i27 + i19);
                }
            }
            q5Var.notifyItemRemoved(indexOf + i19);
            this.K.setContentDescription(((sj3.q5) this.f150250J.getAdapter()).y().toString());
        } else {
            if (this.E.size() + this.F.size() == zj3.j.e()) {
                this.L = true;
                if (!zj3.c.k()) {
                    dp.a.makeText(this, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h2v, java.lang.Integer.valueOf(zj3.j.e())), 0).show();
                    return;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(zj3.c.d()) && !com.tencent.mm.sdk.platformtools.t8.K0(zj3.c.e())) {
                    string = zj3.c.d();
                    string2 = zj3.c.e();
                } else if (zj3.c.l()) {
                    string = getString(com.tencent.mm.R.string.h2g);
                    string2 = getString(com.tencent.mm.R.string.f492586h20);
                } else {
                    if (!zj3.c.n()) {
                        str2 = "";
                        str3 = str2;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.MeetingLinkHelper", "cannot get dialog wording, ignore");
                            return;
                        } else {
                            db5.e1.B(this, str2, "", str3, getString(com.tencent.mm.R.string.f490347sg), new zj3.a(this), new zj3.b(), com.tencent.mm.R.color.f478524a5);
                            zj3.d.c(zj3.c.i(), 0, 1, 0, 0, 0, 0, 0, 0, "", 0);
                            return;
                        }
                    }
                    string = getString(com.tencent.mm.R.string.h2h);
                    string2 = getString(com.tencent.mm.R.string.f492587h21);
                }
                str3 = string2;
                str2 = string;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.MeetingLinkHelper", "cannot get dialog wording, ignore");
                return;
            }
            if (this.H) {
                this.I.a(str4);
            }
            this.F.add(str4);
            this.G.add(str4);
            sj3.q5 q5Var2 = (sj3.q5) this.f150250J.getAdapter();
            java.util.ArrayList userNameList2 = this.G;
            q5Var2.getClass();
            kotlin.jvm.internal.o.g(userNameList2, "userNameList");
            kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
            java.util.ArrayList arrayList2 = q5Var2.f408718e;
            arrayList2.clear();
            arrayList2.add(c01.z1.r());
            int size3 = userNameList2.size();
            for (int i28 = 0; i28 < size3; i28++) {
                java.lang.Object obj2 = userNameList2.get(i28);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                if (!q5Var2.x((java.lang.String) obj2) && !kotlin.jvm.internal.o.b(userNameList2.get(i28), c01.z1.r())) {
                    arrayList2.add(userNameList2.get(i28));
                }
            }
            q5Var2.f408719f = onClickListener;
            if (arrayList2.size() < 5) {
                for (int i29 = 0; i29 < 5; i29++) {
                    q5Var2.notifyItemChanged(q5Var2.f408720g + i29);
                }
            }
            q5Var2.notifyItemInserted(q5Var2.getItemCount());
            this.K.setContentDescription(((sj3.q5) this.f150250J.getAdapter()).y().toString());
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f150250J;
        int itemCount = recyclerView.getAdapter().getItemCount() - 1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList3.add(java.lang.Integer.valueOf(itemCount));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(recyclerView, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI", "handleItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI", "handleItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "scrollToPosition", "(I)V");
        b76.notifyDataSetChanged();
        w7();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ff  */
    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI.initView():void");
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        this.H = getIntent().getBooleanExtra("key_need_gallery", false);
        java.lang.String stringExtra = getIntent().getStringExtra("chatroomName");
        this.C = stringExtra;
        if (!com.tencent.mm.storage.z3.R4(stringExtra)) {
            finish();
        }
        this.F = new java.util.HashSet();
        this.E = new java.util.HashSet();
        this.G = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.view.ViewTreeObserver.OnDrawListener onDrawListener;
        sj3.f1 f1Var = this.M;
        android.view.View view = f1Var.f408506c;
        if (view != null && (onDrawListener = f1Var.f408511h) != null) {
            view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
            f1Var.f408504a = null;
        }
        this.P.dead();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        qp1.h0.a(true, false, true);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        java.lang.String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.E.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")));
        }
        this.E.add(c01.z1.r());
        this.G.addAll(this.E);
        if (this.H) {
            this.I.a(c01.z1.r());
        }
        this.f150250J = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.n0b);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this);
        linearLayoutManager.Q(0);
        this.f150250J.setLayoutManager(linearLayoutManager);
        this.f150250J.setAdapter(new sj3.q5(this));
        ((sj3.q5) this.f150250J.getAdapter()).B(this.G, this.N);
        this.P.alive();
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.n0c);
        this.K = frameLayout;
        frameLayout.setContentDescription(((sj3.q5) this.f150250J.getAdapter()).y().toString());
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            return false;
        }
        return this.E.contains(str);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void p7() {
        super.p7();
        hideVKB();
        if (this.D) {
            qp1.h0.b();
        }
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(yi3.e.class);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            return false;
        }
        return this.F.contains(str);
    }

    public final void w7() {
        if (this.F.size() > 0) {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.h2l, java.lang.Integer.valueOf(this.E.size() + this.F.size())));
            enableOptionMenu(1, true);
        } else {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.h2m));
            enableOptionMenu(1, false);
        }
    }
}
