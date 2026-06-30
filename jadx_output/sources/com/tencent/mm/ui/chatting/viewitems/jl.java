package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class jl extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f204270s = "ChattingItemFinderLiveNotifyTmpl";

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f204271t;

    /* renamed from: u, reason: collision with root package name */
    public yb5.d f204272u;

    public jl() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f204271t = hashMap;
        com.tencent.mm.sdk.platformtools.o4 o4Var = xe5.g0.f454026g;
        hashMap.put("TipsTempl_MultiReason_Live", new xe5.g0());
        int i17 = xe5.f.f454021i;
        hashMap.put("TipsTempl_GamePurchaseTeamUp_Live", new xe5.f());
        int i18 = xe5.g.f454024i;
        hashMap.put("TipsTempl_GamePurchaseRefund_Success", new xe5.g());
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view == null || view.getTag() == null) {
            view = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488487uk);
            com.tencent.mm.ui.chatting.viewitems.fl flVar = new com.tencent.mm.ui.chatting.viewitems.fl(this.f204271t);
            flVar.f203979c = view.findViewById(com.tencent.mm.R.id.bkn);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.bkf);
            kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.CheckBox");
            flVar.checkBox = (android.widget.CheckBox) findViewById;
            flVar.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
            flVar.f203980d = (com.tencent.mm.ui.chatting.view.ServiceNotifyHeaderView) view.findViewById(com.tencent.mm.R.id.vna);
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f483696br1);
            kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            flVar.timeTV = (android.widget.TextView) findViewById2;
            java.util.Set entrySet = flVar.f203978b.entrySet();
            kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
            java.util.Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                xe5.i iVar = (xe5.i) ((xe5.h0) ((java.util.Map.Entry) it.next()).getValue());
                iVar.getClass();
                android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.odv);
                iVar.f454040a = findViewById3;
                if (findViewById3 != null) {
                    iVar.f454053n = (android.widget.ImageView) findViewById3.findViewById(com.tencent.mm.R.id.fs7);
                    iVar.f454041b = (android.widget.ImageView) findViewById3.findViewById(com.tencent.mm.R.id.kgj);
                    iVar.f454042c = (android.widget.TextView) findViewById3.findViewById(com.tencent.mm.R.id.kgp);
                    iVar.f454043d = (android.widget.ImageView) findViewById3.findViewById(com.tencent.mm.R.id.kgi);
                    iVar.f454044e = findViewById3.findViewById(com.tencent.mm.R.id.kgo);
                    android.widget.TextView textView = (android.widget.TextView) findViewById3.findViewById(com.tencent.mm.R.id.i0j);
                    iVar.f454045f = textView;
                    com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
                    iVar.f454046g = (android.widget.LinearLayout) findViewById3.findViewById(com.tencent.mm.R.id.kgm);
                    iVar.f454047h = findViewById3.findViewById(com.tencent.mm.R.id.f484871fs5);
                    iVar.f454048i = (android.widget.TextView) findViewById3.findViewById(com.tencent.mm.R.id.kgs);
                    iVar.f454049j = findViewById3.findViewById(com.tencent.mm.R.id.kgq);
                    iVar.f454050k = (android.widget.TextView) findViewById3.findViewById(com.tencent.mm.R.id.kgg);
                    iVar.f454051l = (android.widget.TextView) findViewById3.findViewById(com.tencent.mm.R.id.rac);
                    iVar.f454052m = (android.widget.LinearLayout) findViewById3.findViewById(com.tencent.mm.R.id.rad);
                    android.view.View findViewById4 = findViewById3.findViewById(com.tencent.mm.R.id.kgk);
                    iVar.f454054o = findViewById4;
                    boolean z17 = iVar.f454056q;
                    if (findViewById4 != null) {
                        int dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(z17 ? com.tencent.mm.R.dimen.f479688cn : com.tencent.mm.R.dimen.f479704cz);
                        findViewById4.setPadding(findViewById4.getPaddingLeft(), dimensionPixelOffset, findViewById4.getPaddingRight(), dimensionPixelOffset);
                    }
                    iVar.f454055p = findViewById3.findViewById(com.tencent.mm.R.id.ums);
                    android.view.View view2 = iVar.f454047h;
                    if (view2 != null) {
                        view2.getLayoutParams().width = view.getContext().getResources().getDimensionPixelOffset(z17 ? com.tencent.mm.R.dimen.f479669c6 : com.tencent.mm.R.dimen.f479662c0);
                        view2.getLayoutParams().height = view.getContext().getResources().getDimensionPixelOffset(z17 ? com.tencent.mm.R.dimen.f479681ch : com.tencent.mm.R.dimen.f479675cc);
                        view2.requestLayout();
                    }
                }
            }
            view.setTag(flVar);
        }
        return view;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean N() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        if (item.getItemId() != 111) {
            return false;
        }
        if (!(ui6.g() instanceof androidx.appcompat.app.AppCompatActivity)) {
            return true;
        }
        kotlin.jvm.internal.o.d(f9Var);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null);
        java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        long Z = pm0.v.Z(str);
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_nonce_id");
        com.tencent.mm.protocal.protobuf.FinderObject ml6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ml(Z, str2 == null ? "" : str2, 65, false, true, "", new com.tencent.mm.ui.chatting.viewitems.hl(this, ui6));
        d0(false, f9Var);
        if (ml6 == null) {
            return true;
        }
        e0(ui6, ml6);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
        yb5.d dVar = this.f204272u;
        boolean z17 = false;
        if (dVar != null && !dVar.F()) {
            z17 = true;
        }
        if (z17) {
            kotlin.jvm.internal.o.d(f9Var);
            java.util.Map d18 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null);
            java.lang.String str = (java.lang.String) d18.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            long Z = pm0.v.Z(str);
            java.lang.String str2 = (java.lang.String) d18.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id");
            long Z2 = pm0.v.Z(str2 != null ? str2 : "");
            if (Z == 0 || Z2 == 0) {
                com.tencent.mars.xlog.Log.i(this.f204270s, "onCreateContextMenu feedId:" + Z + ", liveId:" + Z2);
            } else {
                d0(true, f9Var);
                yb5.d dVar2 = this.f204272u;
                kotlin.jvm.internal.o.d(dVar2);
                menu.c(d17, 111, 0, dVar2.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
            menu.c(d17, 100, 0, v17.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    public final void d0(boolean z17, com.tencent.mm.storage.f9 f9Var) {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var != null ? f9Var.j() : null, "msg", null);
        java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
        ((b92.y0) ((m40.i0) i95.n0.c(m40.i0.class))).wi(z17, kz5.c1.i(new jz5.l("share_scene", "6"), new jz5.l("liveid", str), new jz5.l("feedid", str2 != null ? str2 : "")));
    }

    public final void e0(yb5.d dVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        zy2.db dbVar = (zy2.db) i95.n0.c(zy2.db.class);
        android.app.Activity g17 = dVar.g();
        kotlin.jvm.internal.o.e(g17, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((b92.s2) dbVar).Di((androidx.appcompat.app.AppCompatActivity) g17, finderObject, null, 1, 6, new com.tencent.mm.ui.chatting.viewitems.il(finderObject));
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a componentProvider) {
        kotlin.jvm.internal.o.g(componentProvider, "componentProvider");
        com.tencent.mm.ui.chatting.viewitems.gl glVar = new com.tencent.mm.ui.chatting.viewitems.gl(f9Var);
        com.tencent.mm.storage.a9 a9Var = f9Var != null ? f9Var.f193927g2 : null;
        if (!(a9Var instanceof com.tencent.mm.storage.o5)) {
            return glVar;
        }
        ((com.tencent.mm.storage.oa) ((com.tencent.mm.storage.o5) a9Var)).C = glVar;
        return a9Var;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        com.tencent.mm.ui.chatting.e6 e6Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f204272u = ui6;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null);
        if (d17 == null) {
            return;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.templateid");
        com.tencent.mars.xlog.Log.i(this.f204270s, "tmplId = " + str2);
        xe5.i0 i0Var = (xe5.i0) this.f204271t.get(str2);
        if (i0Var != null) {
            java.lang.String str3 = (java.lang.String) d17.get(".msg.fromusername");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mm.ui.chatting.viewitems.q0 u17 = u(ui6);
            kotlin.jvm.internal.o.f(u17, "getLongClickListener(...)");
            com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er(msgData, str3);
            erVar.f203908d = holder;
            xe5.i iVar = ((xe5.g0) i0Var).f454028b;
            iVar.getClass();
            android.view.View view = iVar.f454040a;
            if (view != null) {
                view.setOnLongClickListener(u17);
            }
            android.view.View view2 = iVar.f454040a;
            if (view2 != null) {
                view2.setTag(erVar);
            }
            sb5.z zVar = (sb5.z) ui6.f460708c.a(sb5.z.class);
            if (zVar != null && (e6Var = ((com.tencent.mm.ui.chatting.adapter.k) zVar).B1) != null) {
                iVar.getClass();
                android.view.View view3 = iVar.f454040a;
                if (view3 != null) {
                    view3.setOnTouchListener(e6Var);
                }
            }
            i0Var.a((com.tencent.mm.ui.chatting.viewitems.fl) holder, d17, f9Var, ui6);
        }
    }
}
