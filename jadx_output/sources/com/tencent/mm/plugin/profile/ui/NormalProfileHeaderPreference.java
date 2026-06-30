package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes11.dex */
public class NormalProfileHeaderPreference extends com.tencent.mm.ui.base.preference.Preference implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {
    public boolean L;
    public com.tencent.mm.storage.z3 M;
    public java.lang.String N;
    public java.lang.String P;
    public int Q;
    public final android.content.Context R;
    public com.tencent.mm.ui.base.preference.r S;
    public android.view.View T;
    public cr3.d0 U;
    public boolean V;
    public boolean W;
    public int X;
    public boolean Y;
    public com.tencent.mm.protocal.protobuf.FinderContact Z;

    /* renamed from: l1, reason: collision with root package name */
    public int f153726l1;

    /* renamed from: p0, reason: collision with root package name */
    public y35.k f153727p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f153728p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View.OnLayoutChangeListener f153729x0;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f153730y0;

    public NormalProfileHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = false;
        this.f153729x0 = null;
        this.f153726l1 = 0;
        this.f153728p1 = 0;
        this.R = context;
    }

    public static java.lang.String N(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String a17 = c01.a2.a(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            return a17;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return str2;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        return c01.a2.e(str);
    }

    public static java.lang.CharSequence Q(android.content.Context context, com.tencent.mm.storage.z3 z3Var, int i17, java.lang.String str, boolean z17) {
        java.lang.String str2;
        if (i17 == 9) {
            i17 = z3Var.getSource();
        }
        if (i17 == 1) {
            return (z17 || z3Var.f236575p0 > 1000000) ? context.getResources().getString(com.tencent.mm.R.string.bif) : z3Var.r2() ? context.getResources().getString(com.tencent.mm.R.string.bie) : context.getResources().getString(com.tencent.mm.R.string.big);
        }
        if (i17 == 6) {
            return context.getResources().getString(com.tencent.mm.R.string.fbe);
        }
        java.lang.String str3 = null;
        if (i17 != 8) {
            if (i17 != 10) {
                if (i17 == 34) {
                    return context.getResources().getString(com.tencent.mm.R.string.bho);
                }
                if (i17 == 48) {
                    return context.getResources().getString(com.tencent.mm.R.string.bia);
                }
                if (i17 == 76) {
                    return context.getResources().getString(com.tencent.mm.R.string.bi7);
                }
                if (i17 != 96) {
                    if (i17 == 161) {
                        return context.getResources().getString(com.tencent.mm.R.string.f490992bi2);
                    }
                    if (i17 == 184) {
                        return context.getResources().getString(com.tencent.mm.R.string.f490993bi3);
                    }
                    if (i17 == 3) {
                        return (z17 || z3Var.f236575p0 > 1000000) ? context.getResources().getString(com.tencent.mm.R.string.bii) : z3Var.r2() ? context.getResources().getString(com.tencent.mm.R.string.bih) : context.getResources().getString(com.tencent.mm.R.string.bij);
                    }
                    if (i17 != 4) {
                        if (i17 == 17) {
                            android.app.Activity activity = (android.app.Activity) context;
                            java.lang.String N = N(activity.getIntent().getStringExtra("share_card_username"), activity.getIntent().getStringExtra("share_card_nickname"));
                            if (com.tencent.mm.sdk.platformtools.t8.K0(N)) {
                                N = N(activity.getIntent().getStringExtra("source_from_user_name"), activity.getIntent().getStringExtra("source_from_nick_name"));
                            }
                            if (com.tencent.mm.sdk.platformtools.t8.K0(N)) {
                                java.lang.String Z0 = z3Var.Z0();
                                com.tencent.mars.xlog.Log.i("MicroMsg.NormalProfileHeaderPreference", "[getSource] SEND_CARD fallback to contact sourceExtInfo, username:%s, sourceExtInfo:%s", str, Z0);
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(Z0)) {
                                    N = N(Z0, null);
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.NormalProfileHeaderPreference", "[getSource] SEND_CARD username:%s, displayName:%s, isVerify:%s, serverSource:%d, isContact:%s", str, N, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(z3Var.f236575p0), java.lang.Boolean.valueOf(z3Var.r2()));
                            if (z17 || z3Var.f236575p0 > 1000000) {
                                if (com.tencent.mm.sdk.platformtools.t8.K0(N)) {
                                    return context.getString(com.tencent.mm.R.string.bhv);
                                }
                                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                                java.lang.String string = context.getString(com.tencent.mm.R.string.bhu, N);
                                ((ke0.e) xVar).getClass();
                                return com.tencent.mm.pluginsdk.ui.span.c0.i(context, string);
                            }
                            if (z3Var.r2()) {
                                if (com.tencent.mm.sdk.platformtools.t8.K0(N)) {
                                    return context.getString(com.tencent.mm.R.string.bhs);
                                }
                                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                                java.lang.String string2 = context.getString(com.tencent.mm.R.string.bht, N);
                                ((ke0.e) xVar2).getClass();
                                return com.tencent.mm.pluginsdk.ui.span.c0.i(context, string2);
                            }
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(N)) {
                                return context.getString(com.tencent.mm.R.string.bhw, N);
                            }
                            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                            java.lang.String string3 = context.getString(com.tencent.mm.R.string.bhx);
                            ((ke0.e) xVar3).getClass();
                            return com.tencent.mm.pluginsdk.ui.span.c0.i(context, string3);
                        }
                        if (i17 == 18) {
                            return (z17 || z3Var.f236575p0 > 1000000) ? context.getResources().getString(com.tencent.mm.R.string.f490995bi5) : z3Var.r2() ? context.getResources().getString(com.tencent.mm.R.string.f490994bi4) : context.getResources().getString(com.tencent.mm.R.string.bi6);
                        }
                        switch (i17) {
                            case 12:
                                break;
                            case 13:
                                break;
                            case 14:
                                break;
                            case 15:
                                return (z17 || z3Var.f236575p0 > 1000000) ? context.getResources().getString(com.tencent.mm.R.string.bic) : z3Var.r2() ? context.getResources().getString(com.tencent.mm.R.string.bib) : context.getResources().getString(com.tencent.mm.R.string.bid);
                            default:
                                switch (i17) {
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                        return (z17 || z3Var.f236575p0 > 1000000) ? context.getResources().getString(com.tencent.mm.R.string.bil) : z3Var.r2() ? context.getResources().getString(com.tencent.mm.R.string.bik) : context.getResources().getString(com.tencent.mm.R.string.bim);
                                    case 25:
                                        return (z17 || z3Var.f236575p0 > 1000000) ? context.getResources().getString(com.tencent.mm.R.string.bhq) : z3Var.r2() ? context.getResources().getString(com.tencent.mm.R.string.bhp) : context.getResources().getString(com.tencent.mm.R.string.bhr);
                                    case 30:
                                        return (z17 || z3Var.f236575p0 > 1000000) ? context.getResources().getString(com.tencent.mm.R.string.bi9) : z3Var.r2() ? context.getResources().getString(com.tencent.mm.R.string.bi8) : context.getResources().getString(com.tencent.mm.R.string.bi_);
                                    default:
                                        switch (i17) {
                                            case 58:
                                            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                                            case 60:
                                                return context.getResources().getString(com.tencent.mm.R.string.fqr);
                                            default:
                                                return null;
                                        }
                                }
                        }
                    }
                    return context.getResources().getString(com.tencent.mm.R.string.fbd);
                }
            }
            return (z17 || z3Var.f236575p0 > 1000000) ? context.getResources().getString(com.tencent.mm.R.string.bio) : z3Var.r2() ? context.getResources().getString(com.tencent.mm.R.string.bin) : context.getResources().getString(com.tencent.mm.R.string.bip);
        }
        com.tencent.mm.storage.p7 W0 = r21.w.Ai().W0(str);
        if (W0 == null) {
            str2 = z3Var.Z0();
        } else {
            str2 = W0.field_chatroomName;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str2 = z3Var.Z0();
            }
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        if (n17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(n17.d1())) {
            str3 = com.tencent.mm.sdk.platformtools.t8.K0(n17.P0()) ? c01.v1.p(n17.d1()) : n17.P0();
        }
        return (z17 || z3Var.f236575p0 > 1000000) ? !com.tencent.mm.sdk.platformtools.t8.K0(str3) ? context.getString(com.tencent.mm.R.string.f490991bi1, str3) : context.getString(com.tencent.mm.R.string.bhz) : z3Var.r2() ? context.getResources().getString(com.tencent.mm.R.string.f490990bi0, str3) : context.getResources().getString(com.tencent.mm.R.string.bhy);
    }

    public void M(com.tencent.mm.storage.z3 z3Var, int i17, boolean z17, cr3.d0 d0Var) {
        android.content.Context context = this.R;
        this.N = ((android.app.Activity) context).getIntent().getStringExtra("Contact_RoomNickname");
        this.P = ((android.app.Activity) context).getIntent().getStringExtra("Contact_ChatRoomId");
        this.M = z3Var;
        this.Q = i17;
        this.L = true;
        this.U = d0Var;
    }

    public final java.lang.String O(com.tencent.mm.storage.z3 z3Var) {
        java.lang.String g27;
        if (com.tencent.mm.storage.z3.H3(this.M.d1())) {
            android.content.res.Resources resources = this.R.getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = com.tencent.mm.sdk.platformtools.t8.K0(z3Var.X) ? ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Di(z3Var.W) : z3Var.X;
            g27 = resources.getString(com.tencent.mm.R.string.aoi, objArr).trim();
        } else {
            g27 = z3Var.g2();
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return g27 == null ? "" : g27;
    }

    public bi4.i0 R() {
        android.view.View view = this.T;
        if (view != null) {
            return ((hr3.u9) view.getTag()).f284075w;
        }
        return null;
    }

    public final void S(hr3.t9 t9Var, java.lang.CharSequence charSequence, java.lang.String str) {
        if (t9Var.getText() != null) {
            java.lang.CharSequence text = t9Var.getText();
            t9Var.setText(charSequence);
            rl5.r rVar = new rl5.r(this.R, t9Var.getView());
            rVar.f397351u = new hr3.r9(this);
            rVar.f397354x = new hr3.s9(this, str);
            rVar.L = new hr3.l9(this, t9Var, text);
            if (!(t9Var.getView().getTag(com.tencent.mm.R.id.ohu) instanceof int[])) {
                rVar.n(this.f153726l1, this.f153728p1);
            } else {
                int[] iArr = (int[]) t9Var.getView().getTag(com.tencent.mm.R.id.ohu);
                rVar.n(iArr[0], iArr[1]);
            }
        }
    }

    public void T() {
        android.view.View view = this.T;
        if (view != null) {
            hr3.u9 u9Var = (hr3.u9) view.getTag();
            com.tencent.mm.pluginsdk.ui.preference.FMessageListView fMessageListView = u9Var.f284071s;
            if (fMessageListView != null) {
                fMessageListView.b();
            }
            com.tencent.mm.pluginsdk.ui.preference.VerifyRecordListView verifyRecordListView = u9Var.f284072t;
            if (verifyRecordListView != null) {
                verifyRecordListView.b();
            }
        }
        if (R() != null) {
            R().S5(0L);
        }
    }

    public void V(boolean z17, int i17, boolean z18) {
        int a17 = com.tencent.mm.ui.bl.a(this.f197770d);
        this.V = z17;
        this.W = z18;
        this.X = i17;
        this.Y = bi4.v1.g();
        if (i17 <= 0) {
            this.X = a17;
        }
        com.tencent.mm.ui.base.preference.r rVar = this.S;
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NormalProfileHeaderPreference", "setHasStory action=%s weuiActionBarHeight=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17));
    }

    public final void W(hr3.u9 u9Var) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.Z;
        if (finderContact == null) {
            android.view.View view = u9Var.D;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "updateFinderAuthInfo", "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "updateFinderAuthInfo", "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo = finderContact.getAuthInfo();
        if (authInfo == null || authInfo.getAuthIconType() <= 0) {
            ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.A5).getValue()).r()).booleanValue()) {
                authInfo = new com.tencent.mm.protocal.protobuf.FinderAuthInfo();
                authInfo.setAuthIconType(1);
                authInfo.setAuthIconUrl("https://dldir1v6.qq.com/weixin/checkresupdate/auth_icon_level3_2e2f94615c1e4651a25a7e0446f63135.png");
                authInfo.setAuthProfession("摄影博主");
            }
        }
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.B5).getValue()).r()).intValue() == 0 || authInfo == null || authInfo.getAuthIconType() <= 0) {
            android.view.View view2 = u9Var.D;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "updateFinderAuthInfo", "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "updateFinderAuthInfo", "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = u9Var.D;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "updateFinderAuthInfo", "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "updateFinderAuthInfo", "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1.f460511a.c(u9Var.E, authInfo, 1);
        u9Var.F.setText(authInfo.getAuthProfession());
        u9Var.D.setOnClickListener(new hr3.m9(this));
    }

    public final void Y(java.lang.String str, com.tencent.mm.storage.z3 z3Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NormalProfileHeaderPreference", "view stranger remark, username is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_Scene", this.Q);
        intent.putExtra("Contact_mode_name_type", 0);
        intent.putExtra("Contact_ModStrangerRemark", true);
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("Contact_Nick", z3Var.P0());
        intent.putExtra("Contact_RemarkName", z3Var.w0());
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.y(intent, this.R);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        android.content.Context context = this.R;
        if (id6 == com.tencent.mm.R.id.f486610lu3) {
            com.tencent.mm.storage.z3 z3Var = this.M;
            if (z3Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NormalProfileHeaderPreference", "contact is null");
            } else if (z3Var.r2()) {
                com.tencent.mm.pluginsdk.ui.preference.PhoneNumPreference phoneNumPreference = (com.tencent.mm.pluginsdk.ui.preference.PhoneNumPreference) ((com.tencent.mm.ui.base.preference.h0) this.S).h("contact_profile_phone");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_Scene", this.Q);
                intent.putExtra("Contact_User", z3Var.d1());
                intent.putExtra("view_mode", true);
                phoneNumPreference.getClass();
                intent.putExtra("contact_phone_number_by_md5", (java.lang.String) null);
                intent.putExtra("contact_phone_number_list", z3Var.E1);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.m(intent, context);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var.J0())) {
                Y(z3Var.d1(), z3Var);
            } else {
                Y(z3Var.J0(), z3Var);
            }
        } else if (id6 == com.tencent.mm.R.id.jp_) {
            cr3.d0 d0Var = this.U;
            if (d0Var != null) {
                d0Var.e();
            }
        } else if (id6 == com.tencent.mm.R.id.cey) {
            java.lang.String d17 = this.M.d1();
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.pluginsdk.ui.ProfileHdHeadImg.class);
            intent2.putExtra(dm.i4.COL_USERNAME, d17);
            android.content.Context context2 = this.R;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "clickAvatar", "(Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "clickAvatar", "(Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.plugin.profile.p2.Bi(((android.app.Activity) context).getIntent(), 16, 1, this.M.d1());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int id6 = view.getId();
        android.content.Context context = this.R;
        if (id6 == com.tencent.mm.R.id.cff || id6 == com.tencent.mm.R.id.cf6 || id6 == com.tencent.mm.R.id.f483907cf0 || id6 == com.tencent.mm.R.id.cf7) {
            android.widget.TextView textView = (android.widget.TextView) view;
            if (textView.getText() != null) {
                java.lang.String charSequence = textView.getText().toString();
                int indexOf = charSequence.indexOf(58);
                if (indexOf >= 0) {
                    charSequence = charSequence.substring(indexOf + 1).trim();
                }
                android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
                spannableString.setSpan(new android.text.style.BackgroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.FG_3)), indexOf >= 0 ? indexOf + 2 : 0, textView.getText().length(), 33);
                S(new hr3.p9(this, textView), spannableString, charSequence);
            }
            yj0.a.i(true, this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        if (id6 != com.tencent.mm.R.id.cf8) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalContactInfo()) == 1) {
            ((zc0.h) ((xs.i1) i95.n0.c(xs.i1.class))).bj(com.tencent.mm.sdk.platformtools.t8.G1(this.M.d1()) + "-" + k35.m1.d("yyyy-MM-dd_HH:mm:ss", c01.id.e()) + ".txt", this.M);
        }
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) view;
        if (mMNeat7extView.a() != null) {
            java.lang.String charSequence2 = mMNeat7extView.a().toString();
            android.text.SpannableString spannableString2 = new android.text.SpannableString(mMNeat7extView.a());
            spannableString2.setSpan(new android.text.style.BackgroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.FG_3)), 0, mMNeat7extView.a().length(), 33);
            S(new hr3.q9(this, mMNeat7extView), spannableString2, charSequence2);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05c6  */
    @Override // com.tencent.mm.ui.base.preference.Preference
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(android.view.View r37) {
        /*
            Method dump skipped, instructions count: 2975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference.t(android.view.View):void");
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.T == null) {
            this.T = super.u(viewGroup);
        }
        return this.T;
    }

    public NormalProfileHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = false;
        this.f153729x0 = null;
        this.f153726l1 = 0;
        this.f153728p1 = 0;
        this.R = context;
    }

    public NormalProfileHeaderPreference(android.content.Context context) {
        super(context);
        this.L = false;
        this.f153729x0 = null;
        this.f153726l1 = 0;
        this.f153728p1 = 0;
        this.R = context;
    }
}
