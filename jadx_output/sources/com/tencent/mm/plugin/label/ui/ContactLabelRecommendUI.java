package com.tencent.mm.plugin.label.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/label/ui/ContactLabelRecommendUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ContactLabelRecommendUI extends com.tencent.mm.ui.vas.VASActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f143260q = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f143264g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143265h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f143266i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f143267m;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f143270p;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f143261d = jz5.h.b(new f93.p2(this));

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f143262e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f143263f = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f143268n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f143269o = jz5.h.b(new f93.w2(this));

    public static final void U6(com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI contactLabelRecommendUI) {
        if (contactLabelRecommendUI.f143267m) {
            if (!contactLabelRecommendUI.Z6().O6().isEmpty()) {
                contactLabelRecommendUI.V6();
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "onSaveWrapper(): batch mode, no label selected, exit");
                contactLabelRecommendUI.finish();
                return;
            }
        }
        if (contactLabelRecommendUI.a7()) {
            contactLabelRecommendUI.V6();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "onSaveWrapper(): not change, exit");
            contactLabelRecommendUI.finish();
        }
    }

    public final void V6() {
        java.util.ArrayList O6 = Z6().O6();
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "[doAddLabelAndSaveLabel]: " + O6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.storage.d4 d4Var : Z6().f279711g) {
            java.lang.String str = d4Var.field_labelName;
            if (str == null) {
                str = "";
            }
            if (O6.contains(str)) {
                arrayList.add(d4Var.field_labelName);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "temp Label " + arrayList.size() + " need to add: " + arrayList);
        if (!(!arrayList.isEmpty())) {
            W6();
        } else {
            b7(getString(com.tencent.mm.R.string.g9k));
            c01.d9.e().g(new e93.a(arrayList));
        }
    }

    public final boolean W6() {
        java.util.ArrayList O6 = Z6().O6();
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "do save labels: " + O6);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = O6.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!this.f143262e.contains(str)) {
                arrayList.add(str);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "newAttached: " + arrayList);
        long c17 = c01.id.c();
        com.tencent.mm.storage.h4 wi6 = b93.r.wi();
        if (wi6 != null) {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("lastUseTime", java.lang.Long.valueOf(c17));
            p75.h1 j17 = dm.g2.f237027n.j(contentValues);
            j17.f352651c = dm.g2.f237029p.l(arrayList).c(dm.g2.f237031r.i(0));
            j17.a().f(wi6.f195002d);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "lastUseTime=" + c17 + ", newAttached: " + arrayList);
        if (this.f143267m) {
            java.util.ArrayList arrayList2 = this.f143268n;
            if (arrayList2.isEmpty()) {
                return false;
            }
            b7(getString(com.tencent.mm.R.string.g9k));
            kotlinx.coroutines.l.d(androidx.lifecycle.z.a(this), null, null, new f93.o2(this, new java.util.ArrayList(arrayList2), O6, null), 3, null);
            return true;
        }
        java.lang.String str2 = "";
        if (this.f143264g) {
            com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(this.f143265h);
            java.lang.String h17 = ((b93.b) c93.a.a()).h(O6);
            if (com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
                z07.field_contactLabels = "";
                ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).replace(z07);
            } else {
                z07.field_contactLabels = h17;
                if (com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
                    z07.field_encryptUsername = this.f143265h;
                }
                ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).replace(z07);
            }
            X6();
            return true;
        }
        if (!O6.isEmpty()) {
            com.tencent.mm.storage.h4 wi7 = b93.r.wi();
            str2 = wi7 != null ? wi7.u1(O6) : null;
        }
        if (str2 == null || this.f143265h == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "modify ContactLabel: userName=" + this.f143265h + " LabelIds=" + str2);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f143265h, true);
        if (n17 != null) {
            n17.r1(str2);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(this.f143265h, n17);
            new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent().e();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.gw6 gw6Var = new r45.gw6();
        gw6Var.f375582e = str2;
        gw6Var.f375581d = this.f143265h;
        linkedList.add(gw6Var);
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436681g, vg3.b.f436645e, vg3.c.f436671z, 0, kz5.b0.c(this.f143265h), 8, null));
        c01.d9.e().g(new e93.e(linkedList));
        b7(getString(com.tencent.mm.R.string.g9k));
        return true;
    }

    public final void X6() {
        android.content.Intent intent = new android.content.Intent();
        if (a7()) {
            intent.putExtra("hasLableChange", true);
        } else {
            intent.putExtra("hasLableChange", false);
        }
        java.util.ArrayList O6 = Z6().O6();
        intent.putExtra("result_label_id_list", O6);
        java.util.ArrayList<java.lang.String> selectTagList = ((h93.r) pf5.z.f353948a.a(this).a(h93.r.class)).O6().getSelectTagList();
        intent.putExtra("recommend_label_adopt_count", selectTagList != null ? java.lang.Integer.valueOf(selectTagList.size()) : null);
        intent.putExtra("button_add_new_label_cnt", ((h93.k) pf5.z.f353948a.a(this).a(h93.k.class)).f279716o);
        intent.putExtra("search_add_new_label_cnt", ((h93.k) pf5.z.f353948a.a(this).a(h93.k.class)).f279717p);
        intent.putStringArrayListExtra("selected_labels", ((h93.k) pf5.z.f353948a.a(this).a(h93.k.class)).O6());
        intent.putIntegerArrayListExtra("selected_source", new java.util.ArrayList<>(((h93.k) pf5.z.f353948a.a(this).a(h93.k.class)).f279708d.values()));
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "finishWithSelectedLabels " + O6);
        setResult(-1, intent);
        finish();
    }

    public final com.tencent.mm.ui.widget.MMEditText Y6() {
        java.lang.Object value = ((jz5.n) this.f143261d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.MMEditText) value;
    }

    public final h93.k Z6() {
        return (h93.k) ((jz5.n) this.f143269o).getValue();
    }

    public final boolean a7() {
        java.util.ArrayList O6 = Z6().O6();
        int size = O6.size();
        java.util.ArrayList arrayList = this.f143262e;
        if (size != arrayList.size()) {
            return true;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!O6.contains((java.lang.String) it.next())) {
                return true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "no change");
        return false;
    }

    public final void b7(java.lang.String str) {
        this.f143270p = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), str, true, true, f93.v2.f260488d);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e3r;
    }

    public final void onChange() {
        if (this.f143267m) {
            enableOptionMenu(!Z6().O6().isEmpty());
        } else {
            enableOptionMenu(a7());
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.List list;
        super.onCreate(bundle);
        setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("label_username_list");
        boolean z17 = !(stringArrayListExtra == null || stringArrayListExtra.isEmpty());
        this.f143267m = z17;
        if (z17) {
            java.util.ArrayList arrayList = this.f143268n;
            kotlin.jvm.internal.o.d(stringArrayListExtra);
            arrayList.addAll(stringArrayListExtra);
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "batch mode, userCount: " + arrayList.size());
        } else {
            applyHalfScreenActionbarHeight();
        }
        setActionbarColor(i65.a.d(this, com.tencent.mm.R.color.f478491c));
        this.f143265h = getIntent().getStringExtra("label_username");
        this.f143264g = getIntent().getBooleanExtra("is_stranger", false);
        this.f143266i = getIntent().getStringExtra("Contact_ReportSessionId");
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "mUserName: " + this.f143265h + ", mIsStranger: " + this.f143264g + ", mIsBatchMode: " + this.f143267m);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Ej("view_exp", kz5.c1.k(new jz5.l("note_sid", this.f143266i), new jz5.l("add_username", this.f143265h)), 33926);
        }
        h93.k Z6 = Z6();
        f93.r2 r2Var = new f93.r2(this);
        Z6.getClass();
        Z6.f279712h = r2Var;
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("label_str_list");
        if (stringArrayListExtra2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "originalList: " + stringArrayListExtra2);
            com.tencent.mm.storage.h4 wi6 = b93.r.wi();
            if (wi6 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (!stringArrayListExtra2.isEmpty()) {
                    p75.i0 h17 = dm.g2.f237027n.h(dm.g2.f237028o);
                    h17.f352657d = dm.g2.f237029p.l(stringArrayListExtra2);
                    java.util.Iterator it = ((java.util.ArrayList) h17.a().l(wi6.f195002d)).iterator();
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        try {
                            arrayList2.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                        } catch (java.lang.NumberFormatException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.Label.ContactLabelStorage", "Invalid label ID format: " + str, e17);
                        }
                    }
                }
                list = kz5.n0.V(arrayList2);
            } else {
                list = kz5.p0.f313996d;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "original ids: " + list);
            java.util.ArrayList arrayList3 = this.f143262e;
            arrayList3.addAll(stringArrayListExtra2);
            java.util.ArrayList arrayList4 = this.f143263f;
            arrayList4.addAll(list);
            if (arrayList4.size() != arrayList3.size()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelRecommendUI", "originalList: " + stringArrayListExtra2.size() + ", idList: " + list.size() + ", may have some temporary label");
            }
            h93.k Z62 = Z6();
            Z62.getClass();
            java.util.HashMap hashMap = Z62.f279708d;
            java.util.List V = kz5.n0.V(stringArrayListExtra2);
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(V, 10));
            java.util.Iterator it6 = ((java.util.ArrayList) V).iterator();
            while (it6.hasNext()) {
                arrayList5.add(new jz5.l((java.lang.String) it6.next(), 0));
            }
            kz5.c1.o(hashMap, arrayList5);
            java.util.ArrayList<java.lang.String> stringArrayListExtra3 = Z62.getIntent().getStringArrayListExtra("selected_labels");
            java.util.ArrayList<java.lang.Integer> integerArrayListExtra = Z62.getIntent().getIntegerArrayListExtra("selected_source");
            if (stringArrayListExtra3 != null && integerArrayListExtra != null) {
                java.util.Iterator it7 = ((java.util.ArrayList) kz5.n0.a1(stringArrayListExtra3, integerArrayListExtra)).iterator();
                while (it7.hasNext()) {
                    jz5.l lVar = (jz5.l) it7.next();
                    java.lang.String str2 = (java.lang.String) lVar.f302833d;
                    java.lang.Integer num = (java.lang.Integer) lVar.f302834e;
                    if (Z62.f279708d.containsKey(str2)) {
                        java.util.HashMap hashMap2 = Z62.f279708d;
                        kotlin.jvm.internal.o.d(str2);
                        kotlin.jvm.internal.o.d(num);
                        hashMap2.put(str2, num);
                    }
                }
            }
            Z62.f279709e.addAll(list);
            Z62.Q6();
        }
        setMMTitle(com.tencent.mm.R.string.mbk);
        onChange();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(Y6());
        aVar.fk(Y6(), "view_id", "tag_search_input");
        aVar.fk(Y6(), "note_sid", this.f143266i);
        aVar.fk(Y6(), "add_username", this.f143265h);
        aVar.ik(Y6(), 8, 33926);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new f93.s2(this), null, com.tencent.mm.ui.fb.GREEN);
        if (this.f143267m) {
            getController().t0(true);
            getController().s0(new f93.t2(this), 0);
        } else {
            getController().t0(false);
            getController().x0(getString(com.tencent.mm.R.string.f490347sg), new f93.u2(this));
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        c01.d9.e().q(638, this);
        c01.d9.e().q(kd1.c.CTRL_INDEX, this);
        super.onPause();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c01.d9.e().a(638, this);
        c01.d9.e().a(kd1.c.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd: ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(i18);
        sb6.append(", ");
        sb6.append(str);
        sb6.append(", scene=");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", sb6.toString());
        if (m1Var instanceof e93.a) {
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "add temp label success: " + ((r45.c4) ((e93.a) m1Var).f250348d.f70711b.f70700a).f371259d);
                W6();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "add temp label failed");
            android.app.ProgressDialog progressDialog = this.f143270p;
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
            db5.e1.s(this, getString(com.tencent.mm.R.string.f490390tn), null);
            return;
        }
        if (m1Var instanceof e93.e) {
            ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436681g, vg3.b.f436646f, vg3.c.f436671z, i18, this.f143267m ? this.f143268n : kz5.b0.c(this.f143265h)));
            android.app.ProgressDialog progressDialog2 = this.f143270p;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                progressDialog2.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "modify contact label success");
                X6();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "modify contact label failed");
                db5.e1.s(this, getString(com.tencent.mm.R.string.f490390tn), null);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(h93.k.class);
        set.add(j93.n.class);
        java.util.List list = h93.k.f279707q;
        java.util.Iterator it = h93.k.f279707q.iterator();
        while (it.hasNext()) {
            set.add((java.lang.Class) it.next());
        }
    }
}
