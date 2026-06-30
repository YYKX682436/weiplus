package wv1;

/* loaded from: classes12.dex */
public class k extends wv1.a {

    /* renamed from: f, reason: collision with root package name */
    public ot0.q f449946f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f449947g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f449948h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f449949i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Integer f449950j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f449951k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f449952l;

    public k(com.tencent.mm.plugin.choosemsgfile.logic.ui.w wVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        super(wVar, f9Var);
        this.f449947g = str;
    }

    @Override // wv1.a
    public java.lang.String c() {
        return m() != null ? com.tencent.mm.sdk.platformtools.t8.u1(m().f348690o, "") : "";
    }

    @Override // wv1.a
    public java.lang.String d() {
        if (m() == null) {
            return "";
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f449947g, true);
        if (n17 != null) {
            this.f449949i = n17.f2();
        }
        return m().n();
    }

    @Override // wv1.a
    public long e() {
        if (m() != null) {
            return m().f348682m;
        }
        return 0L;
    }

    @Override // wv1.a
    public int h() {
        return 1;
    }

    @Override // wv1.a
    public void j(androidx.recyclerview.widget.k3 k3Var, int i17, wv1.a aVar) {
        java.lang.String n17;
        boolean containsKey;
        wv1.r rVar = (wv1.r) k3Var;
        rVar.f449973d.setTag(this);
        rVar.f449978i.setTag(this);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(rVar.f449974e, p(), null);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = ((com.tencent.mm.plugin.choosemsgfile.logic.ui.a) this.f449929a).f95523d.getContext();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(n())) {
            n17 = n();
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(o())) {
            if (this.f449949i == null) {
                com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f449947g, true);
                if (n18 != null) {
                    this.f449949i = n18.f2();
                } else {
                    this.f449949i = "";
                }
            }
            n17 = this.f449949i;
        } else {
            n17 = o();
        }
        android.widget.TextView textView = rVar.f449975f;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, n17, textSize));
        rVar.f449976g.setText(com.tencent.mm.plugin.fav.ui.w6.c(b(), g()));
        if (this.f449950j == null) {
            n82.e eVar = (n82.e) i95.n0.c(n82.e.class);
            java.lang.String c17 = c();
            ((a40.k) eVar).getClass();
            kk.j jVar = com.tencent.mm.plugin.fav.ui.u1.f101464a;
            this.f449950j = java.lang.Integer.valueOf(o25.y.a(c17));
        }
        rVar.f449980n.setImageResource(this.f449950j.intValue());
        rVar.f449981o.setText(d());
        long e17 = e();
        android.widget.TextView textView2 = rVar.f449982p;
        if (e17 == 0) {
            textView2.setText(com.tencent.mm.sdk.platformtools.t8.f0(e()));
        } else {
            textView2.setText(c().toUpperCase() + " " + com.tencent.mm.sdk.platformtools.t8.f0(e()));
        }
        if (aVar == null || aVar.h() != 1) {
            android.view.View view = rVar.f449985s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = rVar.f449985s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.CheckBox checkBox = rVar.f449977h;
        checkBox.setVisibility(0);
        android.view.View view3 = rVar.f449978i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rVar.f449983q.setVisibility(8);
        rVar.f449984r.setVisibility(8);
        rVar.f449979m.setVisibility(8);
        boolean i18 = i();
        android.widget.LinearLayout linearLayout = rVar.f449973d;
        if (i18) {
            linearLayout.setAlpha(1.0f);
        } else {
            linearLayout.setAlpha(0.6f);
        }
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            q(rVar);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new wv1.j(this, rVar));
        }
        xv1.b a17 = a();
        long f17 = f();
        java.util.Map map = a17.f457388b;
        if (map == null) {
            containsKey = false;
        } else {
            containsKey = ((java.util.concurrent.ConcurrentHashMap) map).containsKey(java.lang.Long.valueOf(f17));
        }
        if (containsKey) {
            checkBox.setChecked(true);
        } else {
            checkBox.setChecked(false);
        }
    }

    @Override // wv1.a
    public void k(android.view.View view, wv1.a aVar) {
        boolean z17;
        boolean z18;
        xv1.b a17 = a();
        long f17 = f();
        synchronized (a17) {
            java.util.Set set = a17.f457390d;
            z17 = true;
            if (set != null) {
                if (((java.util.HashSet) set).contains(java.lang.Long.valueOf(f17))) {
                    z18 = true;
                }
            }
            z18 = false;
        }
        if (z18) {
            return;
        }
        int i17 = this.f449933e;
        if (i17 != 4 && i17 != 5) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        if (i()) {
            xv1.d.c(b(), f(), this.f449930b.Q0());
        } else {
            xv1.d.h(b(), a().f457387a);
        }
    }

    @Override // wv1.a
    public void l(androidx.recyclerview.widget.k3 k3Var) {
        wv1.r rVar = (wv1.r) k3Var;
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            q(rVar);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new wv1.j(this, rVar));
        }
    }

    public final ot0.q m() {
        if (this.f449946f == null) {
            this.f449946f = ot0.q.v(this.f449930b.j());
        }
        return this.f449946f;
    }

    public final java.lang.String n() {
        if (this.f449952l == null) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f449947g, true);
            if (n17 != null) {
                this.f449952l = n17.w0();
            } else {
                this.f449952l = "";
            }
        }
        return this.f449952l;
    }

    public final java.lang.String o() {
        if (this.f449951k == null) {
            java.lang.String str = this.f449947g;
            com.tencent.mm.storage.a3 z07 = com.tencent.mm.storage.z3.R4(str) ? ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str) : null;
            if (z07 != null) {
                this.f449951k = z07.z0(p());
            } else {
                this.f449951k = "";
            }
        }
        return this.f449951k;
    }

    public java.lang.String p() {
        if (this.f449948h == null) {
            boolean R4 = com.tencent.mm.storage.z3.R4(this.f449947g);
            com.tencent.mm.sdk.platformtools.r2 r2Var = xv1.d.f457391a;
            com.tencent.mm.storage.f9 f9Var = this.f449930b;
            if (f9Var != null) {
                if (f9Var.A0() == 1) {
                    r2 = c01.z1.r();
                } else {
                    r2 = R4 ? c01.w9.s(f9Var.j()) : null;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(r2)) {
                        r2 = f9Var.Q0();
                    }
                }
            }
            this.f449948h = r2;
        }
        return this.f449948h;
    }

    public final void q(wv1.r rVar) {
        int i17 = this.f449933e;
        if (i17 == 0) {
            rVar.f449983q.setVisibility(8);
            rVar.f449984r.setVisibility(8);
            android.widget.CheckBox checkBox = rVar.f449977h;
            checkBox.setVisibility(0);
            android.view.View view = rVar.f449978i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setChecked(false);
            rVar.f449979m.setVisibility(8);
            return;
        }
        if (i17 == 1) {
            rVar.f449983q.setVisibility(0);
            rVar.f449984r.setVisibility(8);
            rVar.f449977h.setVisibility(8);
            android.view.View view2 = rVar.f449978i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rVar.f449979m.setVisibility(8);
            return;
        }
        if (i17 == 2) {
            rVar.f449983q.setVisibility(0);
            com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = rVar.f449984r;
            mMPinProgressBtn.setVisibility(0);
            rVar.f449977h.setVisibility(8);
            android.view.View view3 = rVar.f449978i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rVar.f449979m.setVisibility(8);
            long j17 = this.f449932d;
            if (j17 > 0) {
                int i18 = (int) ((((float) this.f449931c) / ((float) j17)) * 100.0f);
                if (i18 == -1 || i18 >= 100) {
                    mMPinProgressBtn.setProgress(100);
                    return;
                } else {
                    mMPinProgressBtn.setProgress(i18);
                    return;
                }
            }
            return;
        }
        if (i17 == 3) {
            rVar.f449983q.setVisibility(8);
            rVar.f449984r.setVisibility(8);
            rVar.f449977h.setVisibility(0);
            android.view.View view4 = rVar.f449978i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rVar.f449979m.setVisibility(8);
            return;
        }
        if (i17 == 4) {
            rVar.f449983q.setVisibility(8);
            rVar.f449984r.setVisibility(8);
            rVar.f449977h.setVisibility(8);
            android.view.View view5 = rVar.f449978i;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rVar.f449979m.setVisibility(0);
            rVar.f449982p.setText(c().toUpperCase() + " " + b().getString(com.tencent.mm.R.string.b7_));
            return;
        }
        if (i17 != 5) {
            return;
        }
        rVar.f449983q.setVisibility(8);
        rVar.f449984r.setVisibility(8);
        rVar.f449977h.setVisibility(8);
        android.view.View view6 = rVar.f449978i;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemListFile", "updateStateInner", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rVar.f449979m.setVisibility(0);
        rVar.f449982p.setText(c().toUpperCase() + " " + b().getString(com.tencent.mm.R.string.b79));
    }
}
