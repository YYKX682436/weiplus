package com.tencent.mm.plugin.label.ui;

/* loaded from: classes11.dex */
public class ContactLabelSelectUI extends com.tencent.mm.plugin.label.ui.ContactLabelBaseUI implements com.tencent.mm.modelbase.u0, android.view.View.OnCreateContextMenuListener, db5.t4 {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f143271p1 = 0;
    public java.lang.String C;
    public k93.j E;
    public final java.util.HashMap M;
    public final java.util.HashMap N;
    public final java.util.HashMap P;
    public final java.util.HashSet Q;
    public final java.util.HashSet R;
    public boolean S;
    public android.view.View S5;
    public boolean T;
    public rl5.r U;
    public int V;
    public int W;
    public boolean X;
    public int Y;
    public final com.tencent.mm.sdk.platformtools.n3 Z;

    /* renamed from: l1, reason: collision with root package name */
    public final l75.z0 f143278l1;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f143280n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f143281o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f143282p;

    /* renamed from: p0, reason: collision with root package name */
    public final k93.a f143283p0;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f143284q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f143285r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f143286s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f143287t;

    /* renamed from: u, reason: collision with root package name */
    public k93.c f143288u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f143289v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f143290w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMTagPanelScrollView f143291x;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f143292x0;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.label.ui.widget.MMLabelPanel f143293y;

    /* renamed from: y0, reason: collision with root package name */
    public final l75.q0 f143294y0;

    /* renamed from: e, reason: collision with root package name */
    public final int f143273e = com.tencent.mm.R.string.f490352sk;

    /* renamed from: f, reason: collision with root package name */
    public final int f143274f = com.tencent.mm.R.string.g9p;

    /* renamed from: g, reason: collision with root package name */
    public int f143275g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f143276h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f143277i = 0;

    /* renamed from: m, reason: collision with root package name */
    public f93.w3 f143279m = f93.w3.Normal;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f143295z = true;
    public boolean A = false;
    public boolean B = false;
    public boolean D = false;
    public final java.util.ArrayList F = new java.util.ArrayList();
    public boolean G = false;
    public int H = 0;
    public int I = 0;
    public boolean T5 = false;

    /* renamed from: J, reason: collision with root package name */
    public java.util.ArrayList f143272J = new java.util.ArrayList();
    public final java.util.ArrayList K = new java.util.ArrayList();
    public final java.util.HashMap L = new java.util.HashMap();

    public ContactLabelSelectUI() {
        new java.util.HashMap();
        this.M = new java.util.HashMap();
        this.N = new java.util.HashMap();
        this.P = new java.util.HashMap();
        this.Q = new java.util.HashSet();
        this.R = new java.util.HashSet();
        this.S = true;
        this.T = false;
        this.V = 0;
        this.W = 0;
        this.X = true;
        this.Y = -1;
        this.Z = new f93.k3(this);
        this.f143283p0 = new f93.o3(this);
        this.f143292x0 = null;
        this.f143294y0 = new f93.q3(this);
        this.f143278l1 = new f93.r3(this);
        new f93.s3(this);
    }

    public static void a(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI) {
        int i17;
        java.util.HashMap hashMap;
        contactLabelSelectUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "freshAdapter: ");
        contactLabelSelectUI.g7(f93.w3.Normal);
        contactLabelSelectUI.d7(contactLabelSelectUI.f143272J);
        java.util.ArrayList arrayList = contactLabelSelectUI.K;
        arrayList.clear();
        arrayList.addAll(contactLabelSelectUI.f143272J);
        java.util.HashMap hashMap2 = contactLabelSelectUI.L;
        hashMap2.clear();
        java.util.Iterator it = contactLabelSelectUI.E.f305894f.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            java.util.Iterator it6 = contactLabelSelectUI.f143272J.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                com.tencent.mm.storage.d4 d4Var = (com.tencent.mm.storage.d4) it6.next();
                if (str.equals(d4Var.field_labelID + "") && (hashMap = contactLabelSelectUI.M) != null && hashMap.containsKey(java.lang.Integer.valueOf(d4Var.field_labelID)) && ((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(d4Var.field_labelID))).intValue() > 0) {
                    i17 = 1;
                    break;
                }
            }
            if (i17 == 0) {
                it.remove();
                com.tencent.mars.xlog.Log.e("MicroMsg.Label.ContactLabelSelectUI", "can not found lable id:%s", str);
            }
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            com.tencent.mm.storage.d4 d4Var2 = (com.tencent.mm.storage.d4) it7.next();
            if (!d4Var2.field_isTemporary) {
                hashMap2.put(java.lang.Integer.valueOf(d4Var2.field_labelID), java.lang.Long.valueOf(d4Var2.field_createTime));
            }
        }
        contactLabelSelectUI.E.notifyDataSetChanged();
        java.util.ArrayList arrayList2 = contactLabelSelectUI.E.f305894f;
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Label.ContactLabelSelectUI", "updateLabelPanelBySelectedIdList: failed idList nil");
            contactLabelSelectUI.Y6(0);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "updateLabelPanelBySelectedIdList: size:%d", java.lang.Integer.valueOf(arrayList2.size()));
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            while (i17 < arrayList2.size()) {
                java.lang.String str2 = (java.lang.String) arrayList2.get(i17);
                java.lang.String str3 = (java.lang.String) contactLabelSelectUI.N.get(str2);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Label.ContactLabelSelectUI", "updateLabelPanelWithSelectIdList: get name failed, labelId:%s", str2);
                } else {
                    arrayList3.add(str3);
                }
                i17++;
            }
            if (!contactLabelSelectUI.T5) {
                contactLabelSelectUI.f143293y.r(arrayList3, arrayList3);
            }
            contactLabelSelectUI.Y6(contactLabelSelectUI.E.f305894f.size());
        }
        contactLabelSelectUI.h7(contactLabelSelectUI.E.f305894f.size());
        contactLabelSelectUI.e7();
    }

    public static void b(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        contactLabelSelectUI.getClass();
        if (arrayList == null || arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelSelectUI", "cpan[doDeleteScene] can not do scene. lable is null");
            return;
        }
        contactLabelSelectUI.U6(contactLabelSelectUI.getString(com.tencent.mm.R.string.g8w));
        e93.c cVar = new e93.c(com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
        cVar.f250358g = arrayList2;
        c01.d9.e().g(cVar);
    }

    public final void Y6(int i17) {
        if (this.B) {
            android.view.View view = this.f143289v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f143290w;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.T5) {
            android.view.View view3 = this.f143289v;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f143290w;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        boolean z17 = i17 > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility: show=[%b]", java.lang.Boolean.valueOf(z17));
        if (z17) {
            android.view.View view5 = this.f143289v;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f143290w;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view7 = this.f143289v;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = this.f143290w;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "checkLabelSearchBarLayoutVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void Z6(java.util.ArrayList arrayList) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, true);
        k0Var.f211872n = new f93.m3(this);
        k0Var.r(getString(com.tencent.mm.R.string.g9v), 17, i65.a.b(this, 14), null);
        k0Var.f211881s = new f93.n3(this, arrayList);
        k0Var.v();
    }

    public final java.lang.String a7(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.storage.d4 n17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (n17 = b93.r.wi().n1(str)) == null || com.tencent.mm.sdk.platformtools.t8.K0(n17.field_labelName)) {
            str2 = "";
        } else {
            str2 = n17.field_labelName;
            java.util.HashMap hashMap = this.N;
            hashMap.put(str, str2);
            hashMap.put(str2, str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "getLabelNameByIdFromStorage: labelId:%s", str);
        return str2;
    }

    public final java.lang.String b7(int i17) {
        if (this.f143275g != 0) {
            return getContext().getResources().getString(this.f143275g);
        }
        if (i17 <= 0) {
            return this.f143276h > 0 ? getContext().getResources().getString(this.f143276h) : getContext().getResources().getString(this.f143273e);
        }
        if (this.f143277i > 0) {
            return getContext().getResources().getString(this.f143277i, java.lang.Integer.valueOf(i17));
        }
        return getContext().getResources().getString(this.f143274f, java.lang.Integer.valueOf(i17));
    }

    public void c(java.lang.String str, boolean z17, boolean z18) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "unselectLabel: id = %s", str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && this.E.f305894f.contains(str)) {
            this.E.f305894f.remove(str);
            this.R.remove(str);
            if (z17) {
                k93.j jVar = this.E;
                int parseInt = java.lang.Integer.parseInt(str);
                if (!com.tencent.mm.sdk.platformtools.t8.L0(jVar.f305893e)) {
                    i17 = 0;
                    while (i17 < jVar.f305893e.size()) {
                        if (((com.tencent.mm.storage.d4) jVar.f305893e.get(i17)).field_labelID == parseInt) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                i17 = -1;
                if (com.tencent.mm.sdk.platformtools.t8.L0(jVar.f305893e) || i17 < 0 || i17 >= jVar.f305893e.size()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LabelAdapter", "notifyTargetItemByLabelId: failed, labelId:%d, pos:%d", java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(i17));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LabelAdapter", "notifyTargetItemByLabelId: labelId:%d, pos:%d", java.lang.Integer.valueOf(parseInt), java.lang.Integer.valueOf(i17));
                    jVar.notifyItemChanged(i17);
                }
            }
            java.lang.String str2 = (java.lang.String) this.N.get(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Label.ContactLabelSelectUI", "unselectLabel failed, get name cache failed, try read db, labelId:%s", str);
                java.lang.String a76 = a7(str);
                if (com.tencent.mm.sdk.platformtools.t8.K0(a76)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Label.ContactLabelSelectUI", "unselectLabel failed again, read name failed, labelId:%s", str);
                } else if (!this.T5) {
                    this.f143293y.p(a76);
                }
            } else if (!this.T5) {
                this.f143293y.p(str2);
            }
        }
        Y6(this.E.f305894f.size());
        h7(this.E.f305894f.size());
        if (z18) {
            ((com.tencent.mm.plugin.label.ui.uic.LabelCustomCombineProxyUIC) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.label.ui.uic.LabelCustomCombineProxyUIC.class)).a(this.E.f305894f);
        }
    }

    public final void c7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "selectLabel: id = %s", str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !this.E.f305894f.contains(str)) {
            this.E.f305894f.add(str);
            java.lang.String str2 = (java.lang.String) this.N.get(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Label.ContactLabelSelectUI", "selectLabel failed, get name cache failed,try read db, labelId:%s", str);
                java.lang.String a76 = a7(str);
                if (com.tencent.mm.sdk.platformtools.t8.K0(a76)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Label.ContactLabelSelectUI", "selectLabel failed again, read name failed, labelId:%s", str);
                } else if (!this.T5) {
                    this.f143293y.d(a76, true);
                }
            } else if (!this.T5) {
                this.f143293y.d(str2, true);
            }
        }
        Y6(this.E.f305894f.size());
        h7(this.E.f305894f.size());
        ((com.tencent.mm.plugin.label.ui.uic.LabelCustomCombineProxyUIC) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.label.ui.uic.LabelCustomCombineProxyUIC.class)).a(this.E.f305894f);
    }

    public final void d7(java.util.ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        if (this.T5) {
            arrayList.removeIf(new d0.m3$$a());
            com.tencent.mm.storage.d4 d4Var = new com.tencent.mm.storage.d4();
            d4Var.field_labelID = -5000000;
            d4Var.field_isTemporary = true;
            arrayList.add(d4Var);
        }
        k93.j jVar = this.E;
        jVar.getClass();
        if (arrayList.size() != 0) {
            jVar.f305893e = arrayList;
            jVar.notifyDataSetChanged();
        }
        k93.j jVar2 = this.E;
        jVar2.f305892d = jVar2.getItemCount() > (this.E.A ? 2 : 0);
        jVar2.notifyDataSetChanged();
        this.f143288u.I.f305885b = false;
    }

    public void e7() {
    }

    public final synchronized void f7(boolean z17) {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17);
        sb6.append("");
        if (z17 && (n3Var = this.Z) != null) {
            n3Var.sendEmptyMessageDelayed(5002, 400L);
        }
        gm0.j1.e().j(new f93.j3(this, z17));
    }

    public final void g7(f93.w3 w3Var) {
        this.f143279m = w3Var;
        int ordinal = w3Var.ordinal();
        if (ordinal == 0) {
            android.view.View view = this.f143280n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f143286s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (ordinal != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelSelectUI", "unkonw mode:%s", this.f143279m + "");
            return;
        }
        android.view.View view3 = this.f143280n;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f143286s;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelSelectUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        enableOptionMenu(false);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public int getCustomBounceId() {
        return com.tencent.mm.R.id.hsa;
    }

    @Override // com.tencent.mm.plugin.label.ui.ContactLabelBaseUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a2i;
    }

    public final void h7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "updateOpButtonTextOnSelectChange: selectedCount:%d", java.lang.Integer.valueOf(i17));
        updateOptionMenuText(0, b7(i17));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.C = getIntent().getStringExtra("privacy_source_type");
        this.A = getIntent().getBooleanExtra("privacy_from_select_contact_ui", false);
        this.B = getIntent().getBooleanExtra("key_select_label_hide_search_bar", false);
        this.D = getIntent().getBooleanExtra("intent_status_from_privacy_setting", false);
        this.f143275g = getIntent().getIntExtra("option_button_wording_res_id", 0);
        this.f143276h = getIntent().getIntExtra("option_button_wording_res_id_zero", 0);
        this.f143277i = getIntent().getIntExtra("option_button_wording_res_id_more_format", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("from_combine_multi_tab", false);
        this.T5 = booleanExtra;
        com.tencent.mm.ui.fb fbVar = com.tencent.mm.ui.fb.GREEN;
        if (booleanExtra) {
            setMMTitle("");
            hideActionbarLine();
            hideActionBarOperationArea();
            if (getSupportActionBar() != null) {
                getSupportActionBar().o();
            }
        } else {
            hideActionbarLine();
            if (this.A) {
                setMMTitle(getString(com.tencent.mm.R.string.jbu));
            } else {
                setMMTitle(getString(com.tencent.mm.R.string.g9o));
            }
            setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: d0.m3$$b
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    int i17 = com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.f143271p1;
                    com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.this;
                    contactLabelSelectUI.setResult(0);
                    contactLabelSelectUI.finish();
                    return true;
                }
            });
            addTextOptionMenu(0, b7(0), new android.view.MenuItem.OnMenuItemClickListener() { // from class: d0.m3$$c
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    int i17 = com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.f143271p1;
                    com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.this;
                    contactLabelSelectUI.getClass();
                    android.content.Intent intent = new android.content.Intent();
                    intent.putStringArrayListExtra("label_id", contactLabelSelectUI.E.f305894f);
                    java.util.HashSet hashSet = contactLabelSelectUI.R;
                    intent.putExtra("contact_select_label_id_list_from_search", new java.util.ArrayList(hashSet));
                    com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "opBtn: click, selected label size:%d, count from search:%d", java.lang.Integer.valueOf(contactLabelSelectUI.E.f305894f.size()), java.lang.Integer.valueOf(hashSet.size()));
                    contactLabelSelectUI.setResult(-1, intent);
                    contactLabelSelectUI.finish();
                    return true;
                }
            }, null, fbVar);
        }
        k93.j jVar = new k93.j(this);
        this.E = jVar;
        jVar.S1 = this.T5;
        this.f143280n = findViewById(com.tencent.mm.R.id.hsc);
        this.f143286s = findViewById(com.tencent.mm.R.id.f485469hs4);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.hsg);
        this.f143290w = findViewById;
        this.f143291x = (com.tencent.mm.ui.base.MMTagPanelScrollView) findViewById.findViewById(com.tencent.mm.R.id.hsj);
        this.f143293y = (com.tencent.mm.plugin.label.ui.widget.MMLabelPanel) this.f143290w.findViewById(com.tencent.mm.R.id.hsh);
        if (this.T5) {
            android.view.View view = this.f143290w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f143291x.setMaxLine(3);
        this.f143291x.setBackground(getResources().getDrawable(com.tencent.mm.R.drawable.aij));
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = this.f143293y;
        mMLabelPanel.f197585q = true;
        mMLabelPanel.k(true);
        this.f143293y.setEditTextEnableEdit(false);
        this.f143293y.setEditTextOnClickListener(new f93.d3(this));
        this.f143293y.setEditHint(getContext().getResources().getString(com.tencent.mm.R.string.g9m));
        this.f143293y.setEditTextSize(ym5.x.a(getContext(), 17.0f));
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel2 = this.f143293y;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn);
        com.tencent.mm.ui.widget.MMEditText mMEditText = mMLabelPanel2.F;
        if (mMEditText != null) {
            mMEditText.setPadding(dimensionPixelSize, 0, 0, 0);
        }
        this.f143293y.setOnClickListener(new f93.e3(this));
        this.f143293y.setCallBack(new f93.f3(this));
        this.f143287t = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.hsa);
        this.f143287t.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        this.f143287t.setHasFixedSize(true);
        k93.c cVar = new k93.c(new k93.b(this.f143283p0));
        this.f143288u = cVar;
        cVar.d(this.f143287t);
        k93.c cVar2 = this.f143288u;
        cVar2.I.f305885b = false;
        k93.j jVar2 = this.E;
        jVar2.f305900o = cVar2;
        jVar2.f305910y = new f93.y2$$a(this);
        jVar2.T1 = new f93.y2$$b(this);
        jVar2.U1 = new f93.y2$$c(this);
        this.f143282p = findViewById(com.tencent.mm.R.id.f484151d61);
        this.f143284q = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485987js4);
        this.f143285r = (android.widget.Button) findViewById(com.tencent.mm.R.id.ctd);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.jiq);
        this.S5 = findViewById2;
        if (this.T5) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.k9k)).setOnClickListener(new android.view.View.OnClickListener() { // from class: f93.y2$$d
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View v17) {
                int i17 = com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.f143271p1;
                com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.this;
                contactLabelSelectUI.getClass();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(v17);
                java.lang.Object[] array = arrayList4.toArray();
                arrayList4.clear();
                yj0.a.b("com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", contactLabelSelectUI, array);
                pf5.z zVar = pf5.z.f353948a;
                ((j93.w) zVar.a(contactLabelSelectUI).a(j93.w.class)).O6();
                j93.r rVar = (j93.r) zVar.a(contactLabelSelectUI).a(j93.r.class);
                rVar.getClass();
                kotlin.jvm.internal.o.g(v17, "v");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", v17, kz5.c1.k(new jz5.l("view_id", "label_create_btn"), new jz5.l("label_business_type", (java.lang.String) ((jz5.n) rVar.f298487e).getValue()), new jz5.l("label_select_sessionid", rVar.O6())), 33926);
                yj0.a.h(contactLabelSelectUI, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.d5y)).setOnClickListener(new f93.t3(this));
        this.f143284q.setOnClickListener(new f93.u3(this));
        this.f143285r.setOnClickListener(new f93.v3(this));
        this.U = new rl5.r(this);
        k93.j jVar3 = this.E;
        jVar3.f305911z = new f93.z2(this);
        this.f143287t.setAdapter(jVar3);
        k93.j jVar4 = this.E;
        jVar4.f305901p = 3;
        jVar4.f305902q = getIntent().getBooleanExtra("key_select_label_click_more_to_contact_list", false);
        k93.j jVar5 = this.E;
        jVar5.f305906u = this.M;
        jVar5.E = new f93.a3(this);
        boolean z17 = this.D;
        boolean z18 = this.f143295z;
        if (z17 && z18) {
            addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490502ww), new f93.b3(this), null, fbVar);
            if (this.D) {
                k93.j jVar6 = this.E;
                if (jVar6 == null || jVar6.f305894f.size() <= 0) {
                    enableOptionMenu(1, false);
                } else {
                    enableOptionMenu(1, true);
                }
                updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490502ww) + "(" + this.E.f305894f.size() + ")");
            }
        }
        this.f143285r.setEnabled(false);
        b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), 1L, 0L, 0L, 0L);
        this.E.D = !z18;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.hsq);
        this.f143289v = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new f93.c3(this));
            if (this.T5) {
                android.view.View findViewById4 = this.f143289v.findViewById(com.tencent.mm.R.id.mes);
                if (findViewById4 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = findViewById4.getLayoutParams();
                    layoutParams.height = i65.a.b(this, 40);
                    findViewById4.setLayoutParams(layoutParams);
                    android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                    gradientDrawable.setCornerRadius(i65.a.b(this, 4));
                    gradientDrawable.setColor(i65.a.d(this, com.tencent.mm.R.color.f478491c));
                    findViewById4.setBackground(gradientDrawable);
                }
                android.view.View findViewById5 = this.f143289v.findViewById(com.tencent.mm.R.id.hsp);
                if (findViewById5 != null) {
                    int b17 = i65.a.b(this, 16);
                    findViewById5.setPaddingRelative(b17, findViewById5.getPaddingTop(), b17, findViewById5.getPaddingBottom());
                }
            }
        }
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.i3c);
        this.f143281o = findViewById6;
        if (this.T5) {
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById6.getLayoutParams();
            if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.bottomMargin = i65.a.b(this, 0);
                this.f143281o.setLayoutParams(marginLayoutParams);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "dz[onActivityResult] requestCode:%d resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            return;
        }
        boolean z17 = false;
        if (i17 != 7001) {
            if (i17 == 8001) {
                java.lang.String stringExtra = intent.getStringExtra("contact_choose_label_list");
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "dz[onActivityResult] %s", stringExtra + "");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    try {
                        for (java.lang.String str : com.tencent.mm.sdk.platformtools.t8.O1(stringExtra, ",")) {
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !this.E.f305894f.contains(str)) {
                                c7(str);
                                this.R.add(str);
                            }
                        }
                        b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), 11L, r0.size(), 0L, 0L);
                        this.E.notifyDataSetChanged();
                        e7();
                    } catch (java.lang.Exception unused) {
                    }
                }
            } else if (i17 == 9001 && intent != null) {
                java.lang.String stringExtra2 = intent.getStringExtra("label_id");
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "get newLabelIdWithContact:%s", stringExtra2);
                if (stringExtra2 != null) {
                    int length = stringExtra2.length();
                    int i19 = 0;
                    while (true) {
                        if (i19 >= length) {
                            z17 = true;
                            break;
                        }
                        int codePointAt = stringExtra2.codePointAt(i19);
                        if (!java.lang.Character.isWhitespace(codePointAt)) {
                            break;
                        } else {
                            i19 += java.lang.Character.charCount(codePointAt);
                        }
                    }
                    if (!z17) {
                        c7(stringExtra2);
                    }
                }
            }
        } else if (this.f143295z && this.D) {
            java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "dz[onActivityResult] %s", stringExtra3 + "");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Select_Contact", stringExtra3);
            setResult(-1, intent2);
            finish();
        } else {
            java.lang.String stringExtra4 = intent.getStringExtra("Select_Contact");
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "dz[onActivityResult] %s", stringExtra4 + "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4)) {
                android.content.Intent intent3 = new android.content.Intent(intent);
                intent3.putExtra("label_source", "label_source_SNS");
                intent3.putExtra("last_page_source_type", 1);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "startActivity ContactEditLabel ");
                    intent3.setClass(this, com.tencent.mm.plugin.label.ui.ContactEditLabel.class);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "startActivity ContactLabelEditUI ");
                    intent3.setClass(this, com.tencent.mm.plugin.label.ui.ContactLabelEditUI.class);
                }
                intent3.putExtra("Select_Contact", stringExtra4);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent3);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/label/ui/ContactLabelSelectUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.label.ui.ContactLabelBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        initView();
        if (intent.hasExtra("label_id")) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(new java.util.HashSet(stringArrayListExtra));
            this.E.f305894f.clear();
            this.E.f305894f.addAll(arrayList);
        }
        if (intent.hasExtra("contact_forbid_unselect_label_id_list")) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("contact_forbid_unselect_label_id_list");
            if (stringArrayListExtra2 == null) {
                stringArrayListExtra2 = new java.util.ArrayList<>();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(new java.util.HashSet(stringArrayListExtra2));
            this.E.f305895g.clear();
            this.E.f305895g.addAll(arrayList2);
        }
        if (intent.hasExtra("contact_forbid_select_label_id_list")) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("contact_forbid_select_label_id_list");
            if (stringArrayListExtra3 == null) {
                stringArrayListExtra3 = new java.util.ArrayList<>();
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(new java.util.HashSet(stringArrayListExtra3));
            this.E.f305896h.clear();
            this.E.f305896h.addAll(arrayList3);
        }
        if (intent.hasExtra("contact_label_id_custom_data_list")) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra4 = intent.getStringArrayListExtra("contact_label_id_custom_data_list");
            if (stringArrayListExtra4 == null) {
                stringArrayListExtra4 = new java.util.ArrayList<>();
            }
            this.F.addAll(new java.util.ArrayList(new java.util.HashSet(stringArrayListExtra4)));
            this.G = true;
        }
        this.H = intent.getIntExtra("contact_forbid_select_wording_res_id", 0);
        this.I = intent.getIntExtra("contact_forbid_unselect_wording_res_id", 0);
        gm0.j1.e().j(new f93.g3(this));
        b93.r.wi().add(this.f143294y0);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 2, 0, 2);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.storage.d4 z17;
        int i17 = ((android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo).position;
        k93.j jVar = this.E;
        if (jVar != null && i17 >= 0 && (z17 = jVar.z(i17)) != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = view.getContext();
            java.lang.String str = z17.field_labelName;
            ((ke0.e) xVar).getClass();
            contextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
            contextMenu.add(0, 0, 0, getString(com.tencent.mm.R.string.f490367t0));
        }
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        b93.r.wi().remove(this.f143294y0);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            keyEvent.getAction();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18 = ((android.widget.AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position;
        k93.j jVar = this.E;
        if (jVar == null || i18 < 0) {
            return;
        }
        com.tencent.mm.storage.d4 z17 = jVar.z(i18);
        if (i17 != 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(z17);
        Z6(arrayList);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        c01.d9.e().q(636, this);
        c01.d9.e().q(5882, this);
        ((l75.a1) c01.d9.b().q()).e(this.f143278l1);
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.label.ui.ContactLabelBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        c01.d9.e().a(636, this);
        c01.d9.e().a(5882, this);
        ((l75.a1) c01.d9.b().q()).a(this.f143278l1);
        if (this.X) {
            f7(true);
        } else {
            this.X = true;
        }
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int type = m1Var.getType();
        if (type != 636) {
            if (type != 5882) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelSelectUI", "unknow type.");
                return;
            }
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelSelectUI", "[onSceneEnd] sort fail.");
                return;
            } else if (((r45.bh) ((e93.b) m1Var).f250352d.f70711b.f70700a).f370756d == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "[onSceneEnd] sort success is this type.");
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "[onSceneEnd] sort success no this type.");
                return;
            }
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelSelectUI", "cpan[onSceneEnd] delete fail.");
            hideLoading();
            db5.e1.t(this, getString(com.tencent.mm.R.string.f491043bo5), "", new f93.w0(this));
            return;
        }
        java.util.ArrayList arrayList = ((e93.c) m1Var).f250358g;
        if (!b93.r.wi().P0(arrayList)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelSelectUI", "cpan[doDeleteContactLabel] fail.");
            hideLoading();
            db5.e1.t(this, getString(com.tencent.mm.R.string.f491043bo5), "", new f93.w0(this));
            return;
        }
        hideLoading();
        f7(false);
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        if (this.E != null) {
            java.util.Iterator it = arrayList.iterator();
            i19 = 0;
            while (it.hasNext()) {
                i19 += ((java.lang.Integer) this.E.f305906u.get(java.lang.Integer.valueOf(((com.tencent.mm.storage.d4) it.next()).field_labelID))).intValue();
            }
        } else {
            i19 = 0;
        }
        b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), this.Y == 2 ? 7L : 12L, arrayList.size(), 0L, i19);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setScreenEnable(boolean z17) {
        super.setScreenEnable(z17);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(j93.r.class);
        hashSet.add(com.tencent.mm.plugin.label.ui.uic.LabelCustomCombineProxyUIC.class);
    }
}
