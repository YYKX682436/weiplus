package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes11.dex */
public class tk extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f205612s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488516vn);
        com.tencent.mm.ui.chatting.viewitems.uk ukVar = new com.tencent.mm.ui.chatting.viewitems.uk();
        ukVar.a(xgVar, true);
        xgVar.setTag(ukVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.getType() == 37) {
            java.lang.String j17 = f9Var.j();
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemFMessageFrom", "dealClickVerifyMsgEvent : " + j17);
            if (j17 != null && j17.length() > 0) {
                com.tencent.mm.storage.e9 H9 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).H9(j17);
                iz5.a.g(null, H9.f193859a.length() > 0);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(H9.f193859a, true);
                android.content.Intent intent = new android.content.Intent();
                if (n17 == null || ((int) n17.E2) <= 0 || !n17.r2()) {
                    intent.putExtra("Verify_ticket", H9.f193878t);
                    intent.putExtra("User_Verify", true);
                    intent.putExtra("Contact_User", H9.f193859a);
                    intent.putExtra("Contact_Alias", H9.f193860b);
                    intent.putExtra("Contact_Nick", H9.f193861c);
                    intent.putExtra("Contact_QuanPin", H9.f193862d);
                    intent.putExtra("Contact_PyInitial", H9.f193863e);
                    intent.putExtra("Contact_Sex", H9.f193873o);
                    intent.putExtra("Contact_Signature", H9.f193874p);
                    intent.putExtra("Contact_Scene", H9.f193866h);
                    intent.putExtra("Contact_FMessageCard", true);
                    intent.putExtra("Contact_City", H9.a());
                    intent.putExtra("Contact_Province", H9.d());
                    intent.putExtra("Contact_Mobile_MD5", H9.f193867i);
                    intent.putExtra("Contact_full_Mobile_MD5", H9.f193868j);
                    intent.putExtra("Contact_KSnsIFlag", H9.f193876r);
                    intent.putExtra("Contact_KSnsBgUrl", H9.f193877s);
                } else {
                    intent.putExtra("Contact_User", n17.d1());
                    com.tencent.mm.ui.contact.g1.c(intent, n17.d1());
                }
                java.lang.String str = H9.f193864f;
                if ((str == null ? "" : str).length() <= 0) {
                    int i17 = H9.f193866h;
                    if (i17 != 18) {
                        switch (i17) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                                break;
                            default:
                                str = this.f205612s.s().getString(com.tencent.mm.R.string.f490856b22);
                                break;
                        }
                    }
                    str = this.f205612s.s().getString(com.tencent.mm.R.string.f490860b26);
                }
                intent.putExtra("Contact_Content", str);
                intent.putExtra("Contact_verify_Scene", H9.f193866h);
                intent.putExtra("Contact_Uin", H9.f193869k);
                intent.putExtra("Contact_QQNick", H9.f193870l);
                intent.putExtra("Contact_Mobile_MD5", H9.f193867i);
                intent.putExtra("User_From_Fmessage", true);
                intent.putExtra("Contact_from_msgType", 37);
                intent.putExtra("Contact_KSnsIFlag", H9.f193876r);
                intent.putExtra("Contact_KSnsBgUrl", H9.f193877s);
                j45.l.j(this.f205612s.g(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
                k45.a.a(H9.f193866h);
            }
        } else if (f9Var.getType() == 40) {
            com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).D3(f9Var.j());
            if (D3.f196358a.length() > 0) {
                k45.a.a(D3.f196364g);
                com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(D3.f196358a, true);
                if (n18 != null && ((int) n18.E2) > 0 && n18.r2()) {
                    com.tencent.mm.ui.contact.g1.a(this.f205612s.g(), n18, D3, false, false, null, D3.f196381x);
                } else if (D3.f196367j > 0) {
                    com.tencent.mm.ui.contact.g1.b(this.f205612s.g(), D3, false, false, null);
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(D3.f196365h) && com.tencent.mm.sdk.platformtools.t8.K0(D3.f196366i)) {
                    com.tencent.mm.ui.contact.g1.b(this.f205612s.g(), D3, false, false, null);
                } else {
                    r61.a i18 = m61.k.wi().i(D3.f196365h);
                    if ((i18 == null || i18.e() == null || i18.e().length() <= 0) && ((i18 = m61.k.wi().i(D3.f196366i)) == null || i18.e() == null || i18.e().length() <= 0)) {
                        if (n18 == null || ((int) n18.E2) <= 0) {
                            com.tencent.mm.ui.contact.g1.b(this.f205612s.g(), D3, false, false, null);
                        } else {
                            com.tencent.mm.ui.contact.g1.a(this.f205612s.g(), n18, D3, false, false, null, D3.f196381x);
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemFMessageFrom", "error : this is not the mobile contact, MD5 = " + D3.f196365h + " fullMD5:" + D3.f196366i);
                    } else {
                        if (i18.i() == null || i18.i().length() <= 0) {
                            i18.f392792h = D3.f196358a;
                            i18.O = 128;
                            if (m61.k.wi().j(i18.e(), i18) == -1) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemFMessageFrom", "update mobile contact username failed");
                            }
                        }
                        com.tencent.mm.ui.contact.g1.b(this.f205612s.g(), D3, false, false, null);
                    }
                }
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean b0() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f205612s = dVar;
        com.tencent.mm.ui.chatting.viewitems.uk ukVar = (com.tencent.mm.ui.chatting.viewitems.uk) g0Var;
        if (f9Var.getType() == 37) {
            com.tencent.mm.storage.e9 H9 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).H9(f9Var.j());
            java.lang.String str2 = H9.f193859a;
            if (str2 == null || str2.length() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemFMessageFrom", "getView : parse verify msg failed");
                return;
            }
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String str3 = H9.f193859a;
            int i17 = H9.f193865g;
            ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
            com.tencent.mm.modelavatar.g.f(str3, i17);
            if (c01.e2.J(H9.f193859a)) {
                ukVar.f205707f.setVisibility(8);
                ukVar.f205708g.setVisibility(8);
                ukVar.f205709h.setVisibility(0);
                ukVar.f205706e.setBackgroundColor(16777215);
                ukVar.f205709h.setText(dVar.s().getString(com.tencent.mm.R.string.ffb));
            } else {
                ukVar.f205707f.setVisibility(0);
                ukVar.f205708g.setVisibility(0);
                ukVar.f205709h.setVisibility(0);
                ukVar.f205706e.setBackgroundResource(com.tencent.mm.R.drawable.f481222nn);
                ukVar.f205709h.setText(dVar.s().getString(com.tencent.mm.R.string.ffa));
            }
            int i18 = H9.f193866h;
            if (i18 == 13) {
                r61.a h17 = m61.k.wi().h(H9.f193859a);
                if (h17 == null || h17.h() == null || h17.h().equals("")) {
                    ukVar.f205710i.setVisibility(8);
                } else {
                    ukVar.f205710i.setVisibility(0);
                    ukVar.f205710i.setText(dVar.s().getString(com.tencent.mm.R.string.b1v, h17.h()));
                }
            } else if (i18 != 18) {
                switch (i18) {
                    case 22:
                    case 23:
                    case 24:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        ukVar.f205703b.setText(com.tencent.mm.R.string.b27);
                        break;
                    case 25:
                        ukVar.f205703b.setText(com.tencent.mm.R.string.f490854b20);
                        break;
                    case 30:
                        ukVar.f205703b.setText(com.tencent.mm.R.string.hq9);
                        break;
                    default:
                        ukVar.f205703b.setText(com.tencent.mm.R.string.f490855b21);
                        break;
                }
            } else {
                ukVar.f205703b.setText(com.tencent.mm.R.string.f490859b25);
            }
            android.widget.TextView textView = ukVar.f205704c;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g17 = dVar.g();
            java.lang.String b17 = H9.b();
            float textSize = ukVar.f205704c.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(g17, b17, textSize));
            com.tencent.mm.ui.chatting.viewitems.a0.T(ukVar.avatarIV, H9.f193859a, null);
            ukVar.f205705d.setVisibility(0);
            java.lang.String str4 = H9.f193864f;
            if (str4 == null || str4.trim().equals("")) {
                ukVar.f205705d.setText(dVar.s().getString(com.tencent.mm.R.string.f490860b26));
            } else {
                ukVar.f205705d.setText(H9.f193864f);
            }
        } else if (f9Var.getType() == 40) {
            com.tencent.mm.storage.y8 D3 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).D3(f9Var.j());
            java.lang.String str5 = D3.f196358a;
            if (str5 == null || str5.length() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemFMessageFrom", "getView : parse possible friend msg failed");
                return;
            }
            kv.c0 c0Var2 = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String str6 = D3.f196358a;
            int i19 = D3.f196363f;
            ((com.tencent.mm.feature.avatar.w) c0Var2).getClass();
            com.tencent.mm.modelavatar.g.f(str6, i19);
            if (c01.e2.J(D3.f196358a)) {
                ukVar.f205707f.setVisibility(8);
                ukVar.f205708g.setVisibility(8);
                ukVar.f205709h.setVisibility(0);
                ukVar.f205706e.setBackgroundColor(16777215);
                ukVar.f205709h.setText(dVar.s().getString(com.tencent.mm.R.string.ffb));
            } else {
                ukVar.f205707f.setVisibility(0);
                ukVar.f205708g.setVisibility(0);
                ukVar.f205709h.setVisibility(0);
                ukVar.f205706e.setBackgroundResource(com.tencent.mm.R.drawable.f481222nn);
                ukVar.f205709h.setText(dVar.s().getString(com.tencent.mm.R.string.ffa));
            }
            int i27 = D3.f196364g;
            if (i27 == 4) {
                ukVar.f205703b.setText(com.tencent.mm.R.string.b1r);
                ukVar.f205705d.setText(com.tencent.mm.R.string.b1s);
                java.lang.String g18 = D3.g();
                if (g18 == null) {
                    g18 = D3.c();
                }
                android.widget.TextView textView2 = ukVar.f205704c;
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g19 = dVar.g();
                float textSize2 = ukVar.f205704c.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(g19, g18, textSize2));
            } else if (i27 == 10 || i27 == 11) {
                ukVar.f205703b.setText(com.tencent.mm.R.string.b1u);
                java.lang.String f17 = r61.q0.f(D3.f196365h);
                if (com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
                    f17 = r61.q0.f(D3.f196366i);
                }
                ukVar.f205705d.setText(dVar.s().getString(com.tencent.mm.R.string.b1v, f17));
                android.widget.TextView textView3 = ukVar.f205704c;
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g27 = dVar.g();
                java.lang.String c17 = D3.c();
                float textSize3 = ukVar.f205704c.getTextSize();
                ((ke0.e) xVar3).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(g27, c17, textSize3));
            } else if (i27 == 31) {
                ukVar.f205703b.setText(com.tencent.mm.R.string.f490857b23);
                ukVar.f205705d.setText(com.tencent.mm.R.string.f490858b24);
                android.widget.TextView textView4 = ukVar.f205704c;
                le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g28 = dVar.g();
                java.lang.String c18 = D3.c();
                float textSize4 = ukVar.f205704c.getTextSize();
                ((ke0.e) xVar4).getClass();
                textView4.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(g28, c18, textSize4));
            } else if (i27 != 32) {
                ukVar.f205703b.setText(com.tencent.mm.R.string.b1w);
                ukVar.f205705d.setText(com.tencent.mm.R.string.b1x);
                android.widget.TextView textView5 = ukVar.f205704c;
                le0.x xVar5 = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g29 = dVar.g();
                java.lang.String c19 = D3.c();
                float textSize5 = ukVar.f205704c.getTextSize();
                ((ke0.e) xVar5).getClass();
                textView5.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(g29, c19, textSize5));
            } else {
                ukVar.f205703b.setText(com.tencent.mm.R.string.b1z);
                ukVar.f205705d.setText(com.tencent.mm.R.string.b1y);
                android.widget.TextView textView6 = ukVar.f205704c;
                le0.x xVar6 = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g37 = dVar.g();
                java.lang.String c27 = D3.c();
                float textSize6 = ukVar.f205704c.getTextSize();
                ((ke0.e) xVar6).getClass();
                textView6.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(g37, c27, textSize6));
            }
            com.tencent.mm.ui.chatting.viewitems.a0.T(ukVar.avatarIV, D3.f196358a, null);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemFMessageFrom", "FROM_FMESSAGE did not include this type, msgType = " + f9Var.getType());
        }
        ukVar.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), ukVar, null));
        ukVar.clickArea.setOnClickListener(w(dVar));
        ukVar.clickArea.setOnLongClickListener(u(dVar));
        ukVar.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
    }
}
