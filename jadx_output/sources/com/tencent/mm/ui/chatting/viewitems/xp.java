package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class xp extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f206004s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f206005t;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public java.lang.String A(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return dVar.x();
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488570xl);
        com.tencent.mm.ui.chatting.viewitems.cs csVar = new com.tencent.mm.ui.chatting.viewitems.cs();
        csVar.a(xgVar, true);
        xgVar.setTag(csVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        if (menuItem.getItemId() != 111) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_content", c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        intent.putExtra("scene_from", 17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
        int r17 = com.tencent.mm.pluginsdk.model.app.k0.r(c01.w9.l(this.f206004s.D(), f9Var.j(), f9Var.A0()));
        long j17 = ot0.q.v(c01.w9.l(this.f206004s.D(), f9Var.j(), f9Var.A0())).f348682m;
        if (j17 <= 0 || (j17 > 0 && r17 >= 100)) {
            g4Var.c(d17, 111, 0, this.f206004s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        if (this.f206004s.F()) {
            return true;
        }
        g4Var.c(d17, 100, 0, this.f206004s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean c0(yb5.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.cs csVar = (com.tencent.mm.ui.chatting.viewitems.cs) g0Var;
        this.f206004s = dVar;
        java.lang.String U1 = f9Var.U1();
        ot0.q v17 = ot0.q.v(U1);
        zf4.o a17 = zf4.o.a(U1);
        if (a17 != null && a17.f472682a != 0) {
            try {
                java.lang.String h17 = k35.m1.h(dVar.g(), a17.f472682a);
                if (h17 == null || h17.length() <= 0) {
                    str3 = "";
                } else {
                    java.lang.String[] split = h17.split(";");
                    str3 = "" + split[0].replace(" ", "");
                    if (split.length > 1) {
                        str3 = str3 + split[1];
                    }
                }
                if (v17 != null && v17.f348658g != null) {
                    str3 = str3 + " " + v17.f348658g;
                }
                csVar.f203749b.setText(str3);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemVoiceRemindRemind", e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.sdk.platformtools.t8.G1(f9Var.j());
        if (com.tencent.mm.sdk.platformtools.t8.K0(f9Var.z0()) && a17.f472686e > 0) {
            com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).o2(f9Var.Q0(), a17.f472686e);
            if (o27 != null && !com.tencent.mm.sdk.platformtools.t8.K0(o27.z0())) {
                java.lang.String y07 = zf4.b0.y0(c01.z1.r());
                if (com.tencent.mm.vfs.w6.d(zf4.r.b(o27.z0(), false), zf4.r.b(y07, false), false) >= 0) {
                    f9Var.i1(y07);
                    ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
                }
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(f9Var.z0()) && a17 != null && (str2 = a17.f472687f) != null && str2.length() > 0 && a17.f472688g > 0 && this.f206005t == null) {
            java.lang.String y08 = zf4.b0.y0(c01.z1.r());
            java.lang.String b17 = zf4.r.b(y08, false);
            if (com.tencent.mm.sdk.platformtools.t8.K0(f9Var.z0())) {
                f9Var.i1(y08);
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
                java.lang.String str4 = v17.f348694p;
                com.tencent.mm.pluginsdk.model.app.d i17 = com.tencent.mm.pluginsdk.model.app.k0.i(b17, f9Var.getMsgId(), f9Var.Q0(), v17.f348650e, v17.f348646d, v17.f348694p, v17.f348682m, false);
                if (i17.field_mediaSvrId != null) {
                    com.tencent.mm.modelbase.r1 e18 = c01.d9.e();
                    com.tencent.mm.ui.chatting.viewitems.vp vpVar = new com.tencent.mm.ui.chatting.viewitems.vp(this);
                    this.f206005t = vpVar;
                    e18.a(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, vpVar);
                    c01.d9.e().g(new bt3.l0(i17, true));
                }
            }
        }
        csVar.f203750c.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.wp(this, f9Var, csVar));
        if (((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) dVar.f460708c.a(sb5.q2.class))).s0(f9Var.getMsgId())) {
            csVar.f203750c.setImageResource(com.tencent.mm.R.drawable.as6);
        } else {
            csVar.f203750c.setImageResource(com.tencent.mm.R.drawable.as8);
        }
        csVar.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), csVar, null));
        if (c01.d9.b().E()) {
            csVar.clickArea.setOnLongClickListener(u(dVar));
        }
    }
}
