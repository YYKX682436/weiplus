package com.tencent.mm.ui.contact;

@db5.a(8192)
/* loaded from: classes11.dex */
public class SelectContactUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI implements com.tencent.mm.modelbase.u0, com.tencent.mm.ui.tools.c5 {

    /* renamed from: m2, reason: collision with root package name */
    public static final /* synthetic */ int f206536m2 = 0;
    public boolean A1;
    public java.lang.String B1;
    public android.app.ProgressDialog C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;
    public android.widget.TextView G;
    public android.widget.TextView H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f206537J;
    public dn.h J1;
    public android.widget.TextView K;
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.widget.TextView N;
    public dn.h N1;
    public boolean O1;
    public java.util.List P;
    public boolean P1;
    public java.util.List Q;
    public java.util.List R;
    public java.util.List S;
    public java.lang.String T1;
    public int U;
    public java.lang.String U1;
    public boolean V;
    public java.lang.String V1;
    public java.lang.String W;
    public java.lang.String X;
    public int Y;
    public com.tencent.mm.ui.tools.f5 Z;
    public int Z1;

    /* renamed from: h2, reason: collision with root package name */
    public int f206545h2;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.ImageView f206549l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.RelativeLayout f206551p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.ImageView f206552p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.LinearLayout f206553x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.ProgressBar f206554x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.ImageView f206555y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.TextView f206556y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.Button f206557z1;
    public final java.util.Map T = new java.util.HashMap();
    public int C1 = 0;
    public int D1 = 0;
    public java.util.ArrayList E1 = null;
    public long F1 = -1;
    public boolean G1 = false;
    public boolean H1 = false;
    public android.util.Pair I1 = new android.util.Pair(new com.tencent.mm.plugin.msg.MsgIdTalker(-1, ""), java.lang.Boolean.FALSE);
    public boolean K1 = false;
    public boolean L1 = false;
    public java.util.List M1 = new java.util.ArrayList();
    public boolean Q1 = true;
    public boolean R1 = false;
    public boolean S1 = false;
    public java.lang.String W1 = "";
    public java.lang.String X1 = java.util.UUID.randomUUID().toString();
    public long Y1 = 0;

    /* renamed from: a2, reason: collision with root package name */
    public java.lang.String f206538a2 = null;

    /* renamed from: b2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f206539b2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecordMsgNetSceneEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.ui.contact.SelectContactUI.1
        {
            this.__eventId = 1734631819;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.RecordMsgNetSceneEvent recordMsgNetSceneEvent) {
            com.tencent.mm.autogen.events.RecordMsgNetSceneEvent recordMsgNetSceneEvent2 = recordMsgNetSceneEvent;
            if (recordMsgNetSceneEvent2 != null) {
                am.dq dqVar = recordMsgNetSceneEvent2.f54662g;
                long j17 = dqVar.f6488a;
                if (j17 != 0) {
                    java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                    com.tencent.mm.ui.contact.SelectContactUI selectContactUI = com.tencent.mm.ui.contact.SelectContactUI.this;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "RecordMsgNetSceneEvent msgId:%s netSceneMsgId:%s isSucc:%s", valueOf, selectContactUI.I1.first, java.lang.Boolean.valueOf(dqVar.f6489b));
                    if (dqVar.f6488a == ((com.tencent.mm.plugin.msg.MsgIdTalker) selectContactUI.I1.first).f149480d) {
                        if (dqVar.f6489b) {
                            selectContactUI.O7();
                        } else {
                            selectContactUI.L7(0, "send record error", dqVar.f6490c);
                        }
                    }
                }
            }
            return false;
        }
    };

    /* renamed from: c2, reason: collision with root package name */
    public final com.tencent.mm.ui.contact.ma f206540c2 = new com.tencent.mm.ui.contact.ma(this, null);

    /* renamed from: d2, reason: collision with root package name */
    public long f206541d2 = 0;

    /* renamed from: e2, reason: collision with root package name */
    public long f206542e2 = 0;

    /* renamed from: f2, reason: collision with root package name */
    public android.animation.ObjectAnimator f206543f2 = null;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f206544g2 = false;

    /* renamed from: i2, reason: collision with root package name */
    public final java.util.HashMap f206546i2 = new java.util.HashMap();

    /* renamed from: j2, reason: collision with root package name */
    public final java.util.HashMap f206547j2 = new java.util.HashMap();

    /* renamed from: k2, reason: collision with root package name */
    public final dn.k f206548k2 = new com.tencent.mm.ui.contact.y9(this);

    /* renamed from: l2, reason: collision with root package name */
    public final com.tencent.mm.ui.contact.la f206550l2 = new com.tencent.mm.ui.contact.la();

    public static boolean w7(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
        boolean z17;
        java.util.ArrayList C7 = selectContactUI.C7(com.tencent.mm.ui.contact.i5.d(selectContactUI.D, 8192));
        C7.remove(c01.z1.r());
        if (!(com.tencent.mm.ui.contact.i5.d(selectContactUI.D, 4096) && C7.size() > 1)) {
            java.util.ArrayList E7 = selectContactUI.E7(com.tencent.mm.ui.contact.i5.d(selectContactUI.D, 8192));
            a14.a a17 = a14.a.a();
            a17.getClass();
            long size = E7.size();
            com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct shareRoomHistoryStatStruct = a17.f582a;
            shareRoomHistoryStatStruct.f60360g = size;
            shareRoomHistoryStatStruct.f60373t = shareRoomHistoryStatStruct.b("InvitedUsrs", com.tencent.mm.sdk.platformtools.t8.c1(E7, ";"), true);
            return selectContactUI.H7(E7, true);
        }
        if (!selectContactUI.O1) {
            selectContactUI.O1 = true;
            java.util.ArrayList C72 = selectContactUI.C7(false);
            C72.remove(c01.z1.r());
            if (C72.size() == 1) {
                selectContactUI.O1 = false;
                selectContactUI.finish();
                selectContactUI.startActivity(com.tencent.mm.ui.chatting.ChattingUI.class, new android.content.Intent().putExtra("Chat_User", (java.lang.String) C72.get(0)));
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                boolean z18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMDirectCreateAssociateChatRoomSwitch", 0) == 1;
                if (!z18) {
                    java.util.Iterator it = C72.iterator();
                    while (it.hasNext()) {
                        if (com.tencent.mm.storage.z3.m4((java.lang.String) it.next())) {
                            z17 = false;
                            break;
                        }
                    }
                }
                z17 = true;
                if (z18 || z17) {
                    selectContactUI.z7(((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@chatroom").l("", C72));
                } else if (com.tencent.mm.ui.contact.i5.f()) {
                    selectContactUI.O1 = false;
                    gm0.j1.i();
                    gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_OPENIM_SELECT_ALERT_ID_BOOLEAN, false);
                    selectContactUI.O1 = true;
                    selectContactUI.z7(((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi("@im.chatroom").l("", C72));
                } else {
                    db5.e1.t(selectContactUI, selectContactUI.getString(com.tencent.mm.R.string.j3w), "", null);
                    selectContactUI.O1 = false;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "Create the chatroom");
        return true;
    }

    @Override // com.tencent.mm.ui.contact.l4
    public boolean A2(com.tencent.mm.ui.contact.item.d dVar) {
        java.util.List list = this.S;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return ((java.util.LinkedList) this.S).contains(dVar.f206850s);
    }

    public final boolean A7(java.util.List list, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.Object obj;
        com.tencent.mm.storage.z3 n17;
        if (getIntent().getBooleanExtra("Add_SendCard", false)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.W)) {
                this.W = com.tencent.mm.sdk.platformtools.t8.c1(list, ",");
            } else {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.X)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SelectContactUI", "send card occur error: send:%s | receive:%s", this.W, this.X);
                    return false;
                }
                this.X = com.tencent.mm.sdk.platformtools.t8.c1(list, ",");
            }
            boolean R4 = com.tencent.mm.storage.z3.R4(this.X);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("be_send_card_name", this.W);
            intent.putExtra("received_card_name", this.X);
            intent.putExtra("Is_Chatroom", R4);
            setResult(-1, intent);
            finish();
        } else {
            if (getIntent().getBooleanExtra("snsPostWhoCanSee", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "sns post who can see scene,users=%s", list.toString());
                java.util.ArrayList E7 = E7(false);
                E7.remove(c01.z1.r());
                java.util.Iterator it = list.iterator();
                boolean z18 = false;
                while (it.hasNext()) {
                    java.lang.String str8 = (java.lang.String) it.next();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str8) && !E7.contains(str8) && !c01.z1.r().equals(str8) && (n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str8, true)) != null && ((int) n17.E2) != 0 && n17.r2()) {
                        J7(str8, null);
                        E7.add(str8);
                        z18 = true;
                    }
                }
                if (z18) {
                    M7();
                    b7().notifyDataSetChanged();
                } else if (z17) {
                    java.util.ArrayList E72 = E7(false);
                    E72.remove(c01.z1.r());
                    java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(E72, ",");
                    if (com.tencent.mm.sdk.platformtools.t8.L0(E72)) {
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("Select_Contact", c17);
                        intent2.putExtra("Select_Conv_User", c17);
                        intent2.putExtra("Select_Contact", c17);
                        intent2.putExtra("Select_Contacts_To_Create_New_Label", c17);
                        setResult(-1, intent2);
                        finish();
                    } else if (getIntent().getBooleanExtra("snsUploadWhoCanSssToShowSaveLabel", true)) {
                        db5.e1.K(getContext(), true, getString(com.tencent.mm.R.string.g9s), "", getString(com.tencent.mm.R.string.g9r), getString(com.tencent.mm.R.string.g9q), new com.tencent.mm.ui.contact.q9(this, c17), new com.tencent.mm.ui.contact.r9(this, c17));
                    } else {
                        android.content.Intent intent3 = new android.content.Intent();
                        intent3.putExtra("Select_Contact", c17);
                        intent3.putExtra("Select_Conv_User", c17);
                        intent3.putExtra("Select_Contact", c17);
                        setResult(-1, intent3);
                        finish();
                    }
                }
            } else if (getIntent().getBooleanExtra("recommend_friends", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "Recommend Friends");
                androidx.appcompat.app.AppCompatActivity context = getContext();
                java.lang.String str9 = this.X;
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    java.lang.String str10 = (java.lang.String) it6.next();
                    java.lang.String b17 = com.tencent.mm.ui.contact.db.b(str10, null);
                    if (w11.t1.a(str9)) {
                        w11.r1 a17 = w11.s1.a(str9);
                        a17.g(str9);
                        a17.e(b17);
                        a17.h(com.tencent.mm.storage.z3.m4(str10) ? 66 : 42);
                        a17.b();
                    } else {
                        w11.r1 a18 = w11.s1.a(str9);
                        a18.g(str9);
                        a18.e(b17);
                        a18.h(com.tencent.mm.storage.z3.m4(str10) ? 66 : 42);
                        a18.f442131f = 0;
                        a18.f442134i = 4;
                        a18.a().a();
                    }
                }
                com.tencent.mm.ui.widget.snackbar.j.c(context.getString(com.tencent.mm.R.string.fw6), null, context, null, null);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11003, str9, 3, java.lang.Integer.valueOf(list.size()));
                context.setResult(-1);
                com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.contact.cb(context), 2000L);
            } else if (this.R1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "From Group choose");
                this.R1 = false;
                java.util.Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    java.lang.String str11 = (java.lang.String) it7.next();
                    if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SelectContactUI", "userName isNull Or Nil");
                    } else {
                        gm0.j1.i();
                        com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(str11);
                        if (q17 == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SelectContactUI", "contact is null");
                        } else if (com.tencent.mm.sdk.platformtools.t8.K0(q17.Q0()) && q17.r2() && (com.tencent.mm.sdk.platformtools.t8.K0(this.V1) || !str11.equals(this.V1))) {
                            if (!((java.util.LinkedList) this.R).contains(str11)) {
                                J7(str11, null);
                            }
                        }
                    }
                }
                M7();
                y7();
                D7().notifyDataSetChanged();
            } else if (com.tencent.mm.ui.contact.i5.d(this.D, 16384)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "return the result");
                android.content.Intent intent4 = new android.content.Intent();
                java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(list, ",");
                intent4.putExtra("Select_Contact", c18);
                intent4.putExtra("Select_Conv_User", c18);
                intent4.putExtra("Select_Contact", c18);
                if (b7() instanceof com.tencent.mm.ui.contact.h0) {
                    android.database.Cursor cursor = ((com.tencent.mm.ui.contact.h0) b7()).f206749z;
                    intent4.putExtra("show_all_select_contact_count", cursor != null ? ((android.database.MergeCursor) cursor).getCount() : 0);
                }
                dn.h hVar = this.J1;
                if (hVar != null || this.N1 != null) {
                    com.tencent.mm.chatroom.ui.ChatroomInfoUI.LocalHistoryInfo localHistoryInfo = new com.tencent.mm.chatroom.ui.ChatroomInfoUI.LocalHistoryInfo();
                    if (hVar != null) {
                        localHistoryInfo.f63717d = hVar.field_fileId;
                        localHistoryInfo.f63718e = hVar.field_aesKey;
                        localHistoryInfo.f63719f = hVar.field_filemd5;
                        localHistoryInfo.f63720g = (int) hVar.field_fileLength;
                        localHistoryInfo.f63721h = this.D1;
                    }
                    dn.h hVar2 = this.N1;
                    if (hVar2 != null) {
                        localHistoryInfo.f63722i = hVar2.field_fileId;
                        localHistoryInfo.f63723m = hVar2.field_aesKey;
                        localHistoryInfo.f63724n = hVar2.field_filemd5;
                        localHistoryInfo.f63725o = (int) hVar2.field_fileLength;
                        localHistoryInfo.f63726p = this.D1;
                    }
                    intent4.putExtra("select_record_msg_info", localHistoryInfo);
                    android.util.Pair pair = this.I1;
                    intent4.putExtra("select_record_fake_msg_id", (pair == null || (obj = pair.first) == null) ? 0L : ((com.tencent.mm.plugin.msg.MsgIdTalker) obj).f149480d);
                }
                intent4.putExtra("label_source", this.U1);
                intent4.putExtra("Is_Chatroom", this.f206545h2 == 1);
                intent4.putExtra("scene_from", 13);
                setResult(-1, intent4);
                finish();
            } else if (getIntent().getBooleanExtra("shareImage", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "Share Image");
                java.util.ArrayList E73 = E7(true);
                E73.remove(c01.z1.r());
                if (E73.size() > 0) {
                    this.C = db5.e1.Q(getContext(), null, getString(com.tencent.mm.R.string.gqx), true, false, null);
                    gm0.j1.e().j(new com.tencent.mm.ui.contact.na(this, E73, null));
                }
            } else if (getIntent().getBooleanExtra("key_select_contact_come_from_pocket_money", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "come from pocketMoney scene need special deal");
                com.tencent.mm.ui.PocketMoneyEntryInfo pocketMoneyEntryInfo = (com.tencent.mm.ui.PocketMoneyEntryInfo) getIntent().getParcelableExtra("key_select_contact_pocket_money_info");
                java.lang.String str12 = "";
                com.tencent.mm.ui.contact.bb.f206631c = "";
                com.tencent.mm.ui.contact.bb.f206632d = null;
                com.tencent.mm.ui.contact.bb.f206630b = pocketMoneyEntryInfo;
                if (list == null || list.isEmpty()) {
                    com.tencent.mars.xlog.Log.e("SelectPocketMoneyHelper", "usernameList is empty");
                } else {
                    com.tencent.mm.ui.contact.bb.f206631c = (java.lang.String) kz5.n0.X(list);
                    com.tencent.mm.ui.contact.bb.f206632d = this;
                    if (com.tencent.mm.ui.contact.bb.f206630b == null) {
                        com.tencent.mars.xlog.Log.i("SelectPocketMoneyHelper", "pocketMoneyInfo is null, return normal result");
                        java.lang.String str13 = com.tencent.mm.ui.contact.bb.f206631c;
                        android.content.Intent intent5 = new android.content.Intent();
                        intent5.putExtra("Select_Conv_User", str13);
                        intent5.putExtra("pocket_money_result_status", -100);
                        setResult(-1, intent5);
                        finish();
                    } else {
                        com.tencent.mars.xlog.Log.i("SelectPocketMoneyHelper", "[startForwardHalfPage] start entryInfo: " + com.tencent.mm.ui.contact.bb.f206630b);
                        l15.c cVar = new l15.c();
                        cVar.q(new v05.b());
                        v05.b k17 = cVar.k();
                        if (k17 != null) {
                            k17.set(k17.f432315e + 78, new b15.b());
                        }
                        v05.b k18 = cVar.k();
                        if (k18 != null) {
                            com.tencent.mm.ui.PocketMoneyEntryInfo pocketMoneyEntryInfo2 = com.tencent.mm.ui.contact.bb.f206630b;
                            if (pocketMoneyEntryInfo2 == null || (str7 = pocketMoneyEntryInfo2.f197037d) == null) {
                                str7 = "";
                            }
                            k18.set(k18.f368365d + 2, str7);
                        }
                        v05.b k19 = cVar.k();
                        if (k19 != null) {
                            com.tencent.mm.ui.PocketMoneyEntryInfo pocketMoneyEntryInfo3 = com.tencent.mm.ui.contact.bb.f206630b;
                            if (pocketMoneyEntryInfo3 == null || (str6 = pocketMoneyEntryInfo3.f197038e) == null) {
                                str6 = "";
                            }
                            k19.set(k19.f368365d + 3, str6);
                        }
                        v05.b k27 = cVar.k();
                        if (k27 != null) {
                            com.tencent.mm.ui.PocketMoneyEntryInfo pocketMoneyEntryInfo4 = com.tencent.mm.ui.contact.bb.f206630b;
                            if (pocketMoneyEntryInfo4 == null || (str5 = pocketMoneyEntryInfo4.f197040g) == null) {
                                str5 = "";
                            }
                            k27.set(k27.f432315e + 12, str5);
                        }
                        v05.b k28 = cVar.k();
                        if (k28 != null) {
                            com.tencent.mm.ui.PocketMoneyEntryInfo pocketMoneyEntryInfo5 = com.tencent.mm.ui.contact.bb.f206630b;
                            if (pocketMoneyEntryInfo5 == null || (str4 = pocketMoneyEntryInfo5.f197041h) == null) {
                                str4 = "";
                            }
                            k28.set(k28.f432315e + 11, str4);
                        }
                        v05.b k29 = cVar.k();
                        if (k29 != null) {
                            com.tencent.mm.ui.PocketMoneyEntryInfo pocketMoneyEntryInfo6 = com.tencent.mm.ui.contact.bb.f206630b;
                            if (pocketMoneyEntryInfo6 == null || (str3 = pocketMoneyEntryInfo6.f197039f) == null) {
                                str3 = "";
                            }
                            k29.set(k29.f432315e + 14, str3);
                        }
                        v05.b k37 = cVar.k();
                        if (k37 != null) {
                            k37.set(k37.f368365d + 6, 110);
                        }
                        v05.b k38 = cVar.k();
                        b15.b bVar = k38 != null ? (b15.b) k38.getCustom(k38.f432315e + 78) : null;
                        if (bVar != null) {
                            com.tencent.mm.ui.PocketMoneyEntryInfo pocketMoneyEntryInfo7 = com.tencent.mm.ui.contact.bb.f206630b;
                            if (pocketMoneyEntryInfo7 == null || (str2 = pocketMoneyEntryInfo7.f197042i) == null) {
                                str2 = "";
                            }
                            bVar.j(str2);
                        }
                        v05.b k39 = cVar.k();
                        b15.b bVar2 = k39 != null ? (b15.b) k39.getCustom(k39.f432315e + 78) : null;
                        if (bVar2 != null) {
                            com.tencent.mm.ui.PocketMoneyEntryInfo pocketMoneyEntryInfo8 = com.tencent.mm.ui.contact.bb.f206630b;
                            if (pocketMoneyEntryInfo8 != null && (str = pocketMoneyEntryInfo8.f197043m) != null) {
                                str12 = str;
                            }
                            bVar2.k(str12);
                        }
                        vd5.b bVar3 = new vd5.b();
                        bVar3.k(cVar);
                        com.tencent.mm.ui.contact.ab abVar = com.tencent.mm.ui.contact.ab.f206596a;
                        com.tencent.mm.ui.contact.za zaVar = com.tencent.mm.ui.contact.za.f207276d;
                        n13.t tVar = new n13.t();
                        tVar.f334134b = abVar;
                        tVar.f334136d = zaVar;
                        ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).wi(this, bVar3, com.tencent.mm.ui.contact.bb.f206631c, tVar);
                    }
                }
            } else if (list.size() > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "Launch ChattingUI: users=%s", list.toString());
                finish();
                android.content.Intent intent6 = new android.content.Intent();
                intent6.setClass(this, com.tencent.mm.ui.chatting.ChattingUI.class);
                intent6.putExtra("Chat_User", (java.lang.String) list.get(0));
                intent6.addFlags(67108864);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent6);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/contact/SelectContactUI", "dohandleSelect", "(Ljava/util/List;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/contact/SelectContactUI", "dohandleSelect", "(Ljava/util/List;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                I7(3);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SelectContactUI", "unkown action: User=%s", list.toString());
            }
        }
        return true;
    }

    public final void B7(boolean z17) {
        if (this.Y == 1) {
            enableOptionMenu(1, z17);
        } else {
            this.f206557z1.setEnabled(z17);
        }
    }

    public final java.util.ArrayList C7(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : this.R) {
            if (z17 || !c01.e2.M(str)) {
                hashSet.add(str);
            } else {
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                java.util.List n17 = c01.v1.n(str);
                if (n17 != null) {
                    java.util.Iterator it = n17.iterator();
                    while (it.hasNext()) {
                        hashSet.add((java.lang.String) it.next());
                    }
                }
            }
        }
        hashSet.addAll(this.Q);
        arrayList.addAll(hashSet);
        return arrayList;
    }

    public com.tencent.mm.ui.contact.a5 D7() {
        com.tencent.mm.ui.contact.a5 a5Var = this.f206448f;
        if (a5Var != null) {
            return a5Var;
        }
        com.tencent.mm.ui.contact.a5 Z6 = Z6();
        this.f206446d.setAdapter((android.widget.ListAdapter) Z6);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "getInitAdapter is null");
        return Z6;
    }

    public final java.util.ArrayList E7(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : this.R) {
            if (z17 || !c01.e2.M(str)) {
                hashSet.add(str);
            } else {
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                java.util.List n17 = c01.v1.n(str);
                if (n17 != null) {
                    java.util.Iterator it = n17.iterator();
                    while (it.hasNext()) {
                        hashSet.add((java.lang.String) it.next());
                    }
                }
            }
        }
        arrayList.addAll(hashSet);
        return arrayList;
    }

    public final dn.m F7(java.lang.String str, boolean z17) {
        dn.m mVar = new dn.m();
        mVar.f241786e = true;
        mVar.f241787f = this.f206548k2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        sb6.append(", ");
        sb6.append(str);
        java.lang.String g17 = kk.k.g(sb6.toString().getBytes());
        mVar.field_mediaId = g17;
        mVar.field_fullpath = str;
        mVar.field_thumbpath = "";
        mVar.field_fileType = 5;
        mVar.field_talker = "";
        mVar.field_priority = 2;
        mVar.field_needStorage = false;
        mVar.field_isStreamMedia = false;
        mVar.field_appType = 0;
        mVar.field_bzScene = 0;
        this.f206546i2.put(g17, str);
        java.util.HashMap hashMap = this.f206547j2;
        java.lang.String str2 = mVar.field_mediaId;
        hashMap.put(str2, new com.tencent.mm.ui.contact.oa(this, str2, mVar.field_fullpath, z17));
        return mVar;
    }

    public final boolean G7(java.util.List list) {
        return H7(list, false);
    }

    public final boolean H7(java.util.List list, boolean z17) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "handleSelect %s", list);
        if (!com.tencent.mm.ui.contact.i5.d(this.D, 65536)) {
            return A7(list, z17);
        }
        if (list != null) {
            int i17 = 0;
            if (list.size() == 1) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str2 = (java.lang.String) list.get(0);
                ((sg3.a) v0Var).getClass();
                str = getString(com.tencent.mm.R.string.ieu, c01.a2.e(str2));
            } else if (list.size() > 1) {
                java.lang.String string = getString(com.tencent.mm.R.string.f490554yd);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                while (true) {
                    if (i17 >= list.size()) {
                        break;
                    }
                    if (i17 == 3) {
                        sb6.append("...");
                        break;
                    }
                    tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String str3 = (java.lang.String) list.get(i17);
                    ((sg3.a) v0Var2).getClass();
                    sb6.append(c01.a2.e(str3));
                    if (i17 < list.size() - 1) {
                        sb6.append(string);
                    }
                    i17++;
                }
                str = getString(com.tencent.mm.R.string.ieu, sb6.toString());
            }
            this.P1 = true;
            db5.e1.H(getContext(), str, null, true, new com.tencent.mm.ui.contact.j9(this, list, z17), new com.tencent.mm.ui.contact.k9(this));
            return this.P1;
        }
        str = null;
        this.P1 = true;
        db5.e1.H(getContext(), str, null, true, new com.tencent.mm.ui.contact.j9(this, list, z17), new com.tencent.mm.ui.contact.k9(this));
        return this.P1;
    }

    public final void I7(int i17) {
        if (this.f206544g2) {
            return;
        }
        this.f206544g2 = true;
        int i18 = 0;
        if (getIntent().getBooleanExtra("create_group_recommend", false)) {
            int i19 = this.A;
            int i27 = i19 != 2 ? i19 != 3 ? i19 != 7 ? 0 : 1 : 2 : 3;
            int i28 = 0;
            int i29 = 0;
            int i37 = 0;
            int i38 = 0;
            for (java.lang.String str : this.R) {
                java.util.Map map = this.T;
                if (((java.util.HashMap) map).containsKey(str)) {
                    int intValue = ((java.lang.Integer) ((java.util.HashMap) map).get(str)).intValue();
                    if (intValue == 0) {
                        i18++;
                    } else if (intValue == 1) {
                        i28++;
                    } else if (intValue == 2) {
                        i29++;
                    } else if (intValue == 3) {
                        i37++;
                    } else if (intValue == 4) {
                        i38++;
                    }
                }
            }
            b7().m();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17535, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(b7().m()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38));
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.Q);
            linkedList.addAll(this.R);
            com.tencent.mm.ui.contact.j6.a(linkedList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0113, code lost:
    
        if (r0 != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J7(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.SelectContactUI.J7(java.lang.String, java.lang.String):void");
    }

    public final void K7() {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.contact.p9(this));
    }

    public final void L7(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "triggerErrorCallback errCode:%s errMsg:%s", objArr);
        this.H1 = true;
        this.L1 = true;
        this.G1 = false;
        this.K1 = false;
        K7();
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.contact.aa(this, str2));
        a14.a a17 = a14.a.a();
        long a18 = c01.id.a();
        long j17 = a17.f587f;
        if (a18 > j17) {
            a17.f582a.f60372s = a18 - j17;
        }
        a14.a.a().f590i++;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            ((java.util.LinkedList) this.R).remove(str);
            if (b7() instanceof com.tencent.mm.ui.contact.i6) {
                this.f206450h.getInputText().setText(((com.tencent.mm.ui.contact.i6) b7()).x());
            } else if (b7() instanceof com.tencent.mm.ui.contact.h0) {
                D7().s();
            } else {
                b7().notifyDataSetChanged();
            }
            M7();
        }
    }

    public final void M7() {
        if (com.tencent.mm.ui.contact.i5.d(this.D, 64)) {
            java.util.List list = this.R;
            if (this.f206456q != null && list != null) {
                u7(((java.util.LinkedList) list).size());
            }
        }
        if (!com.tencent.mm.ui.contact.i5.d(this.D, 64) || ((java.util.LinkedList) this.R).size() <= 0) {
            if (com.tencent.mm.ui.contact.i5.d(this.D, 64) && com.tencent.mm.ui.contact.i5.d(this.D, 4194304)) {
                N7(android.text.TextUtils.isEmpty(this.f206538a2) ? getString(com.tencent.mm.R.string.f490441v5) : this.f206538a2);
                B7(true);
                return;
            } else if (com.tencent.mm.ui.contact.i5.d(this.D, 64) && com.tencent.mm.ui.contact.i5.d(this.D, 262144) && ((java.util.LinkedList) this.R).size() == 0) {
                N7(android.text.TextUtils.isEmpty(this.f206538a2) ? getString(com.tencent.mm.R.string.f490441v5) : this.f206538a2);
                B7(false);
                return;
            } else {
                N7(android.text.TextUtils.isEmpty(this.f206538a2) ? getString(com.tencent.mm.R.string.f490441v5) : this.f206538a2);
                B7(true);
                return;
            }
        }
        N7((android.text.TextUtils.isEmpty(this.f206538a2) ? getString(com.tencent.mm.R.string.f490441v5) : this.f206538a2) + "(" + ((java.util.LinkedList) this.R).size() + ")");
        int intExtra = getIntent().getIntExtra("min_limit_num", 0);
        if (!com.tencent.mm.ui.contact.i5.d(this.D, 262144)) {
            B7(true);
        } else if (((java.util.LinkedList) this.R).size() >= intExtra) {
            B7(true);
        } else {
            B7(false);
        }
    }

    public final void N7(java.lang.String str) {
        if (this.Y == 1) {
            updateOptionMenuText(1, str);
        } else {
            this.f206557z1.setText(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O7() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.SelectContactUI.O7():void");
    }

    public final java.util.List P7(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!gm0.j1.a() || list == null) {
            return linkedList;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
            if (n17 != null && ((int) n17.E2) != 0) {
                str = n17.g2();
            }
            linkedList.add(str);
        }
        return linkedList;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public synchronized com.tencent.mm.ui.contact.a5 Z6() {
        com.tencent.mm.ui.contact.i0 i0Var;
        i0Var = new com.tencent.mm.ui.contact.i0();
        i0Var.f206762b = com.tencent.mm.ui.contact.i5.d(this.D, 16);
        i0Var.f206761a = com.tencent.mm.ui.contact.i5.d(this.D, 32);
        i0Var.f206765e = getIntent().getBooleanExtra("create_group_recommend", false);
        i0Var.f206763c = !com.tencent.mm.ui.contact.i5.d(this.D, 4);
        i0Var.f206764d = !com.tencent.mm.ui.contact.i5.d(this.D, 1);
        i0Var.f206766f = com.tencent.mm.ui.contact.i5.d(this.D, 128);
        i0Var.f206767g = com.tencent.mm.ui.contact.i5.d(this.D, 1048576);
        boolean d17 = com.tencent.mm.ui.contact.i5.d(this.D, 256);
        i0Var.f206771k = d17;
        if (d17) {
            i0Var.f206772l = getIntent().getStringExtra("custom_contact");
        }
        if (i0Var.f206766f) {
            this.S1 = true;
            i0Var.f206768h = getIntent().getStringExtra("wechat_sport_contact");
            i0Var.f206769i = getIntent().getStringExtra("wechat_sport_recent_like");
            this.T1 = i0Var.f206768h;
        }
        if (com.tencent.mm.ui.contact.i5.f()) {
            i0Var.f206770j = "@all.contact.without.chatroom.without.openim";
        } else {
            i0Var.f206770j = "@all.contact.without.chatroom.without.openim.without.openimfavour";
        }
        int i17 = this.A;
        if (i17 == 6 || i17 == 5) {
            i0Var.f206770j = "@all.contact.without.chatroom.without.openim.without.openimfavour";
        }
        if (getIntent().getBooleanExtra("KBlockOpenImFav", false)) {
            i0Var.f206770j = "@all.contact.without.chatroom.without.openim.without.openimfavour";
        }
        return new com.tencent.mm.ui.contact.h0(this, this.Q, this.R, this.S, this.P, com.tencent.mm.ui.contact.i5.d(this.D, 1), com.tencent.mm.ui.contact.i5.d(this.D, 64), i0Var, this.U == 15, getIntent().getBooleanExtra("KForceDarkMode", false), getIntent().getBooleanExtra("can_go_to_profile", false));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        if (this.S1) {
            return new com.tencent.mm.ui.contact.h5(this, this.P, com.tencent.mm.ui.contact.i5.d(this.D, 64), this.T1);
        }
        if (getIntent().getBooleanExtra("create_group_recommend", false)) {
            return new com.tencent.mm.ui.contact.i6(this, this.Q, this.R, this.P, com.tencent.mm.ui.contact.i5.d(this.D, 64), this.A);
        }
        return new com.tencent.mm.ui.contact.f5(this, this.P, com.tencent.mm.ui.contact.i5.d(this.D, 64), this.A, getIntent().getBooleanExtra("KForceDarkMode", false), getIntent().getBooleanExtra("can_go_to_profile", false) ? 1 : 0);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.p4 b7() {
        com.tencent.mm.ui.contact.p4 b76 = super.b7();
        if (b76 != null) {
            return b76;
        }
        com.tencent.mm.ui.contact.a5 Z6 = Z6();
        this.f206448f = Z6;
        this.f206446d.setAdapter((android.widget.ListAdapter) Z6);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "getAdapter is null");
        return Z6;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public int[] d7() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(131072);
        if (!getIntent().getBooleanExtra("without_openim", false)) {
            arrayList.add(131081);
        }
        if (!com.tencent.mm.ui.contact.i5.d(this.D, 1)) {
            arrayList.add(131076);
            arrayList.add(2097171);
            arrayList.add(2097173);
        }
        if (!com.tencent.mm.ui.contact.i5.d(this.D, 4)) {
            arrayList.add(131075);
        }
        int[] iArr = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            iArr[i17] = ((java.lang.Integer) arrayList.get(i17)).intValue();
        }
        return iArr;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        return this.E;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public int getCustomBounceId() {
        return com.tencent.mm.R.id.mil;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.contact.item.a aVar;
        com.tencent.mm.storage.z3 z3Var;
        int headerViewsCount = i17 - this.f206446d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mm.ui.contact.item.d item = b7().getItem(headerViewsCount);
        if (item == null) {
            return;
        }
        if (item instanceof com.tencent.mm.ui.contact.item.d1) {
            if (com.tencent.mm.ui.contact.i5.d(this.D, 16384)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "handleClickNonSelect, return the result");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Contact", "");
                intent.putExtra("Select_Conv_User", "");
                intent.putExtra("Select_Contact", "");
                setResult(-1, intent);
                finish();
                return;
            }
            return;
        }
        if (!(item instanceof com.tencent.mm.ui.contact.item.a) || (z3Var = (aVar = (com.tencent.mm.ui.contact.item.a) item).B) == null || z3Var.F0() == 1) {
            return;
        }
        java.lang.String d17 = aVar.B.d1();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "ClickUser=%s", d17);
        if (p5(item)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "handleItemClick() isItemAlwaysCheck");
            return;
        }
        if (!com.tencent.mm.ui.contact.i5.d(this.D, 64)) {
            G7(com.tencent.mm.sdk.platformtools.t8.P1(new java.lang.String[]{d17}));
            return;
        }
        if (com.tencent.mm.storage.z3.R4(d17) && getIntent().getBooleanExtra("create_group_recommend", false)) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
            intent2.addFlags(67108864);
            intent2.putExtra("Chat_User", d17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/contact/SelectContactUI", "handleItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/contact/SelectContactUI", "handleItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            I7(3);
        }
        if (!com.tencent.mm.ui.contact.i5.d(this.D, 131072) || ((java.util.LinkedList) this.R).size() < getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE)) {
            J7(d17, item.f206848q);
        } else if (!((java.util.LinkedList) this.Q).contains(d17)) {
            Y6();
            if (((java.util.LinkedList) this.R).contains(d17)) {
                this.f206450h.d(d17);
                ((java.util.LinkedList) this.R).remove(d17);
            } else {
                java.lang.String stringExtra = getIntent().getStringExtra("too_many_member_tip_string");
                java.lang.String stringExtra2 = getIntent().getStringExtra("too_many_member_tip_ok_string");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    stringExtra = getString(com.tencent.mm.R.string.ifp, java.lang.Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10)));
                }
                java.lang.String str = stringExtra;
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    db5.e1.t(getContext(), str, "", new com.tencent.mm.ui.contact.u9(this));
                } else {
                    db5.e1.E(getContext(), str, "", stringExtra2, true, new com.tencent.mm.ui.contact.v9(this));
                }
            }
        }
        M7();
        y7();
        D7();
        D7().notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View view;
        super.initView();
        this.f206551p0 = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.mjt);
        this.f206553x0 = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.mjs);
        this.f206557z1 = (android.widget.Button) findViewById(com.tencent.mm.R.id.g6_);
        this.f206555y0 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mjv);
        this.f206549l1 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mjx);
        this.f206552p1 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mju);
        this.f206554x1 = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.lpj);
        this.f206556y1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mjw);
        this.f206553x0.setOnClickListener(new com.tencent.mm.ui.contact.ca(this));
        this.f206549l1.setOnClickListener(new com.tencent.mm.ui.contact.da(this));
        a14.a.f581n = new a14.a();
        a14.a a17 = a14.a.a();
        java.lang.String str = this.B1;
        com.tencent.mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct shareRoomHistoryStatStruct = a17.f582a;
        shareRoomHistoryStatStruct.f60357d = shareRoomHistoryStatStruct.b("RoomId", str, true);
        shareRoomHistoryStatStruct.f60379z = c01.e2.E(str) ? 1 : 0;
        if (!com.tencent.mm.storage.z3.N4(this.B1) || c01.e2.E(this.B1) || ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D2(this.B1) <= 0) {
            this.f206553x0.setVisibility(8);
            a14.a.a().f582a.f60358e = 0;
        } else {
            this.f206553x0.setVisibility(0);
            a14.a.a().f582a.f60358e = 1;
        }
        if (this.Y == 2) {
            com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(this);
            this.Z = f5Var;
            f5Var.f210400e = this;
        }
        if (getIntent().getBooleanExtra("KForceDarkMode", false)) {
            setTheme(com.tencent.mm.R.style.f493938a3);
            setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478512u));
            setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478512u));
            setBackGroundColorResource(com.tencent.mm.R.color.f478512u);
            t7();
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
            if (multiSelectContactView != null && (view = multiSelectContactView.f189787g) != null) {
                view.setBackgroundColor(multiSelectContactView.getResources().getColor(com.tencent.mm.R.color.f478514w));
            }
            this.f206446d.setBackgroundResource(com.tencent.mm.R.color.f478514w);
            if (getBounceView() != null) {
                getBounceView().setBgColor(getResources().getColor(com.tencent.mm.R.color.f478514w));
            }
            this.f206447e.setTextColor(getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_2));
            this.f206447e.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f479063oq));
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        android.content.Intent intent = getIntent();
        com.tencent.mm.ui.contact.i5.e();
        this.D = intent.getIntExtra("list_attr", com.tencent.mm.ui.contact.i5.f206780a);
        this.E = getIntent().getStringExtra("titile");
        this.F = getIntent().getStringExtra("sub_title");
        this.U = getIntent().getIntExtra("list_type", -1);
        this.Q1 = getIntent().getBooleanExtra("show_too_many_member", true);
        this.U1 = getIntent().getStringExtra("label_source");
        if (com.tencent.mm.ui.contact.i5.d(this.D, 256)) {
            ((java.util.ArrayList) c01.e2.j()).size();
        }
        this.V = getIntent().getBooleanExtra("Add_SendCard", false);
        boolean booleanExtra = getIntent().getBooleanExtra("recommend_friends", false);
        if (this.V || booleanExtra) {
            java.lang.String stringExtra = getIntent().getStringExtra("be_send_card_name");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.W = stringExtra;
            java.lang.String stringExtra2 = getIntent().getStringExtra("received_card_name");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.X = stringExtra2;
        }
        getIntent().getBooleanExtra("Forbid_SelectChatRoom", false);
        this.A1 = getIntent().getBooleanExtra("is_select_record_msg_mode", false);
        this.Y = getIntent().getIntExtra("menu_mode", 1);
        java.lang.String stringExtra3 = getIntent().getStringExtra("chatroomName");
        this.B1 = stringExtra3;
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = stringExtra3 != null ? stringExtra3 : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "mRoomId：%s", objArr);
        this.P = new java.util.ArrayList();
        this.R = new java.util.LinkedList();
        this.Q = new java.util.LinkedList();
        this.S = new java.util.LinkedList();
        java.lang.String stringExtra4 = getIntent().getStringExtra("always_select_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4)) {
            ((java.util.LinkedList) this.Q).addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra4.split(",")));
        }
        java.lang.String stringExtra5 = getIntent().getStringExtra("already_select_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra5)) {
            ((java.util.LinkedList) this.R).addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra5.split(",")));
        }
        java.lang.String stringExtra6 = getIntent().getStringExtra("exclude_select_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra6)) {
            ((java.util.LinkedList) this.S).addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra6.split(",")));
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String stringExtra7 = getIntent().getStringExtra("block_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra7)) {
            hashSet.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra7.split(",")));
        }
        java.util.HashSet hashSet2 = new java.util.HashSet(hashSet);
        hashSet2.addAll(com.tencent.mm.ui.contact.i5.b());
        hashSet2.addAll(c01.e2.i());
        hashSet2.addAll(((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ri());
        if (!com.tencent.mm.ui.contact.i5.d(this.D, 268435456)) {
            hashSet2.add(c01.z1.r());
        }
        if (this.V) {
            hashSet2.removeAll(com.tencent.mm.ui.contact.i5.b());
        }
        ((java.util.ArrayList) this.P).addAll(com.tencent.mm.storage.z3.u3());
        ((java.util.ArrayList) this.P).addAll(hashSet2);
        y7();
        this.W1 = "SelectContactUI-" + this.U;
        this.Z1 = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
        this.f206538a2 = getIntent().getStringExtra("menu_label");
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean n7() {
        return !this.S1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.List list;
        java.util.List list2;
        super.onActivityResult(i17, i18, intent);
        this.f206545h2 = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "requestCode=%d | resultCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            return;
        }
        switch (i17) {
            case 0:
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    return;
                }
                G7(com.tencent.mm.sdk.platformtools.t8.P1(new java.lang.String[]{stringExtra}));
                return;
            case 1:
                java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
                this.R1 = intent.getBooleanExtra("Select_From_Group", false);
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    return;
                }
                G7(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(",")));
                return;
            case 2:
                if (intent != null) {
                    java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                        return;
                    }
                    G7(com.tencent.mm.sdk.platformtools.t8.P1(new java.lang.String[]{stringExtra3}));
                    return;
                }
                return;
            case 3:
                java.lang.String stringExtra4 = intent.getStringExtra("Select_Contact");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "GET_LABEL_USERS return usernames is null or empty");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "GET_LABEL_USERS select username=%s", stringExtra4);
                if (!com.tencent.mm.ui.contact.i5.d(this.D, 64)) {
                    G7(com.tencent.mm.sdk.platformtools.t8.P1(new java.lang.String[]{stringExtra4}));
                    return;
                }
                for (java.lang.String str : stringExtra4.split(",")) {
                    if (((java.util.LinkedList) this.R).add(str)) {
                        this.f206450h.d(str);
                    }
                }
                M7();
                b7().notifyDataSetChanged();
                return;
            case 4:
                com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                long currentTimeMillis = s0Var.B().f61236J + (java.lang.System.currentTimeMillis() - this.f206541d2);
                s0Var.B().f61236J = currentTimeMillis;
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "setSelectFriGroupDuration %d", java.lang.Long.valueOf(currentTimeMillis));
                java.lang.String stringExtra5 = intent.getStringExtra("select_chatrooms");
                if (!getIntent().getBooleanExtra("snsPostWhoCanSee", false)) {
                    for (java.lang.String str2 : this.R) {
                        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
                        if (str2 != null) {
                            multiSelectContactView.g(str2, false, false);
                        } else {
                            multiSelectContactView.getClass();
                        }
                    }
                    ((java.util.LinkedList) this.R).clear();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra5)) {
                        ((java.util.LinkedList) this.R).addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra5.split(",")));
                    }
                    java.util.Iterator it = this.R.iterator();
                    while (it.hasNext()) {
                        this.f206450h.a((java.lang.String) it.next(), false);
                    }
                    M7();
                    return;
                }
                java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra5.split(","));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator it6 = P1.iterator();
                while (it6.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it6.next();
                    if (c01.v1.B(str3)) {
                        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                        java.util.List n17 = c01.v1.n(str3);
                        if (n17 != null) {
                            java.util.Iterator it7 = n17.iterator();
                            while (it7.hasNext()) {
                                hashSet.add((java.lang.String) it7.next());
                            }
                        }
                    } else {
                        hashSet.add(str3);
                    }
                }
                arrayList.addAll(hashSet);
                if (getIntent().getBooleanExtra("without_openim", false)) {
                    java.util.Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        if (((java.lang.String) it8.next()).contains("openim")) {
                            it8.remove();
                        }
                    }
                }
                if (!arrayList.isEmpty() && (list = this.S) != null && !list.isEmpty()) {
                    arrayList.removeIf(new java.util.function.Predicate() { // from class: com.tencent.mm.ui.contact.SelectContactUI$$a
                        @Override // java.util.function.Predicate
                        public final boolean test(java.lang.Object obj) {
                            return ((java.util.LinkedList) com.tencent.mm.ui.contact.SelectContactUI.this.S).contains((java.lang.String) obj);
                        }
                    });
                }
                G7(arrayList);
                return;
            case 5:
                if (intent != null) {
                    java.lang.String stringExtra6 = intent.getStringExtra("Select_Contact");
                    java.lang.String stringExtra7 = intent.getStringExtra("Cancel_Select_Contact");
                    java.util.List<java.lang.String> O1 = com.tencent.mm.sdk.platformtools.t8.K0(stringExtra6) ? null : com.tencent.mm.sdk.platformtools.t8.O1(stringExtra6, ",");
                    java.util.List O12 = com.tencent.mm.sdk.platformtools.t8.K0(stringExtra7) ? null : com.tencent.mm.sdk.platformtools.t8.O1(stringExtra7, ",");
                    if (O1 != null) {
                        if (this.f206450h != null) {
                            for (java.lang.String str4 : O1) {
                                if (!((java.util.LinkedList) this.R).contains(str4)) {
                                    this.f206450h.d(str4);
                                }
                            }
                        }
                        ((java.util.LinkedList) this.R).addAll(O1);
                    }
                    if (O12 != null) {
                        if (this.f206450h != null) {
                            java.util.Iterator it9 = O12.iterator();
                            while (it9.hasNext()) {
                                this.f206450h.d((java.lang.String) it9.next());
                            }
                        }
                        this.R.removeAll(O12);
                    }
                    b7().notifyDataSetChanged();
                    if (getIntent().getBooleanExtra("Add_SendCard", false)) {
                        G7(com.tencent.mm.sdk.platformtools.t8.P1(new java.lang.String[]{stringExtra6}));
                    }
                }
                M7();
                return;
            case 6:
                if (intent != null) {
                    int intExtra = intent.getIntExtra("select_record_msg_num", 0);
                    this.C1 = intExtra;
                    this.D1 = intExtra;
                    this.E1 = intent.getStringArrayListExtra("key_selected_record_msg_list");
                    this.J1 = null;
                    this.N1 = null;
                    this.H1 = false;
                    this.L1 = false;
                    if (this.C1 == 0) {
                        this.G1 = false;
                        this.K1 = false;
                        K7();
                    } else {
                        this.G1 = true;
                        this.K1 = true;
                        this.F1 = intent.getLongExtra("select_record_min_msg_id", -1L);
                        if (com.tencent.mm.ui.chatting.x3.g() > 0 && com.tencent.mm.ui.chatting.x3.g() < this.C1) {
                            this.D1 = com.tencent.mm.ui.chatting.x3.g();
                        }
                        K7();
                        a14.a.a().f587f = c01.id.a();
                        this.M1 = new java.util.ArrayList(com.tencent.mm.ui.chatting.x3.f206228a.f206201a);
                        android.util.Pair i19 = com.tencent.mm.ui.chatting.x3.i(this, "msginfo@fakeuser", true, this.B1);
                        this.I1 = i19;
                        if (((java.lang.Boolean) i19.second).booleanValue()) {
                            O7();
                        } else {
                            this.f206539b2.alive();
                        }
                    }
                    a14.a.a().f582a.f60362i = this.D1;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "GET_SELECT_RECORD_MSG selectMsgNum:%s actualSelectMsgNum:%s msgId:%s direct:%s", java.lang.Integer.valueOf(this.C1), java.lang.Integer.valueOf(this.D1), java.lang.Long.valueOf(((com.tencent.mm.plugin.msg.MsgIdTalker) this.I1.first).f149480d), this.I1.second);
                    return;
                }
                return;
            case 7:
                com.tencent.mm.plugin.sns.statistics.s0 s0Var2 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                long currentTimeMillis2 = s0Var2.B().K + (java.lang.System.currentTimeMillis() - this.f206542e2);
                s0Var2.B().K = currentTimeMillis2;
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "setSelectFriLabelDuration %d", java.lang.Long.valueOf(currentTimeMillis2));
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
                if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.util.Iterator<java.lang.String> it10 = stringArrayListExtra.iterator();
                while (it10.hasNext()) {
                    java.lang.String next = it10.next();
                    java.util.List j17 = ((b93.b) c93.a.a()).j(next);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "select label:%s count:%d", next, java.lang.Integer.valueOf(j17.size()));
                    sb6.append(next);
                    sb6.append("|");
                    sb6.append(j17.size());
                    sb6.append(";");
                    arrayList2.addAll(j17);
                }
                com.tencent.mm.plugin.sns.statistics.s0 s0Var3 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                s0Var3.B().F = stringArrayListExtra.size();
                com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct B = s0Var3.B();
                B.G = B.b("SelectFriLabelList", sb6.toString(), true);
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("contact_select_label_id_list_from_search");
                if (stringArrayListExtra2 != null) {
                    int size = stringArrayListExtra2.size();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSearchLabelCntOfSelectFri", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                    com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = s0Var3.f164959l;
                    if (timelineGroupUserBehaviorStruct != null) {
                        int i27 = timelineGroupUserBehaviorStruct.N + size;
                        timelineGroupUserBehaviorStruct.N = i27;
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportHelper", "addSearchLabelCntOfSelectFri: newCount=%d", java.lang.Integer.valueOf(i27));
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSearchLabelCntOfSelectFri", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                }
                if (!arrayList2.isEmpty() && (list2 = this.S) != null && !list2.isEmpty()) {
                    arrayList2.removeIf(new java.util.function.Predicate() { // from class: com.tencent.mm.ui.contact.SelectContactUI$$b
                        @Override // java.util.function.Predicate
                        public final boolean test(java.lang.Object obj) {
                            return ((java.util.LinkedList) com.tencent.mm.ui.contact.SelectContactUI.this.S).contains((java.lang.String) obj);
                        }
                    });
                }
                G7(arrayList2);
                M7();
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView;
        this.Y1 = c01.id.c();
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "create!");
        c01.d9.e().a(30, this);
        c01.d9.e().a(138, this);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.F)) {
            setMMSubTitle(this.F);
        }
        this.V1 = c01.z1.r();
        int i17 = 0;
        if (com.tencent.mm.ui.contact.i5.d(this.D, 64)) {
            if (this.Y == 1) {
                this.f206551p0.setVisibility(8);
                if (this.f206446d != null) {
                    this.f206551p0.post(new com.tencent.mm.ui.contact.ea(this));
                }
                addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.ui.contact.l9(this), null, getIntent().getBooleanExtra("KForceDarkMode", false) ? com.tencent.mm.ui.fb.FINDER_LIVE : com.tencent.mm.ui.fb.GREEN);
            } else {
                this.f206551p0.setVisibility(0);
                if (this.f206446d != null) {
                    this.f206551p0.post(new com.tencent.mm.ui.contact.ea(this));
                }
                this.f206557z1.setOnClickListener(new com.tencent.mm.ui.contact.o9(this));
            }
        }
        M7();
        setBackBtn(new com.tencent.mm.ui.contact.ba(this));
        if (this.U != 15 && (multiSelectContactView = this.f206450h) != null) {
            multiSelectContactView.e(this.R);
        }
        if (getIntent().getBooleanExtra("create_group_recommend", false)) {
            int i18 = this.A;
            if (i18 == 2) {
                i17 = 3;
            } else if (i18 == 3) {
                i17 = 2;
            } else if (i18 == 7) {
                i17 = 1;
            }
            com.tencent.mm.ui.contact.j6.f206959a = i17;
        }
        if (getBounceView() != null) {
            getBounceView().setBgColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f206539b2.dead();
        c01.d9.e().q(30, this);
        c01.d9.e().q(138, this);
        I7(1);
        com.tencent.mm.ui.contact.j6.f206960b = null;
        com.tencent.mm.ui.contact.j6.f206961c = null;
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.Z;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.ui.tools.f5 f5Var = this.Z;
        if (f5Var != null) {
            f5Var.f();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.X1)) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.MvvmOptimizeReportStruct mvvmOptimizeReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MvvmOptimizeReportStruct();
        mvvmOptimizeReportStruct.f59617d = mvvmOptimizeReportStruct.b("Type", this.W1, true);
        mvvmOptimizeReportStruct.f59618e = mvvmOptimizeReportStruct.b("SessionId", this.X1, true);
        mvvmOptimizeReportStruct.f59620g = 0L;
        mvvmOptimizeReportStruct.f59619f = c01.id.c() - this.Y1;
        mvvmOptimizeReportStruct.k();
        mvvmOptimizeReportStruct.o();
        this.X1 = "";
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.app.ProgressDialog progressDialog = this.C;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.C = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.U0(this) && !com.tencent.mm.ui.pc.a(this, i17, i18, str, 4)) {
            if (i17 == 0 && i18 == 0) {
                if (m1Var.getType() != 138) {
                    return;
                }
                b7().notifyDataSetChanged();
            } else if (i17 == 4 && i18 == -24 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.mm.ui.tools.f5 f5Var = this.Z;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        if (!dVar.d() || !(dVar instanceof com.tencent.mm.ui.contact.item.a)) {
            return false;
        }
        com.tencent.mm.ui.contact.item.a aVar = (com.tencent.mm.ui.contact.item.a) dVar;
        if (aVar.B == null) {
            return false;
        }
        if (com.tencent.mm.ui.contact.i5.d(this.D, com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING)) {
            return aVar.B.y2();
        }
        return ((java.util.LinkedList) this.Q).contains(aVar.B.d1());
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void q7(java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11225, 1, 0);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this, "com.tencent.mm.ui.contact.SelectLabelContactUI");
        intent.putExtra("label", str);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(E7(com.tencent.mm.ui.contact.i5.d(this.D, 8192)));
        hashSet.addAll(this.Q);
        intent.putExtra("always_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(new java.util.ArrayList(hashSet), ","));
        intent.putExtra("always_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(new java.util.ArrayList(hashSet), ","));
        intent.putExtra("block_contact", getIntent().getStringExtra("block_contact"));
        if (com.tencent.mm.ui.contact.i5.d(this.D, 64)) {
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(16384, 64, 131072));
            if (this.U == 14) {
                intent.putExtra("max_limit_num", getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE));
            }
        } else {
            intent.putExtra("list_attr", 16384);
        }
        startActivityForResult(intent, 3);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void r7(android.widget.ListView listView, int i17) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        java.lang.String str;
        if (com.tencent.mm.ui.contact.i5.d(this.D, 256)) {
            if (this.G == null) {
                this.G = x7(listView, new com.tencent.mm.ui.contact.fa(this), getString(this.U == 14 ? com.tencent.mm.R.string.f489925fo : com.tencent.mm.R.string.f489909f5));
            }
            this.G.setVisibility(i17);
        }
        if (com.tencent.mm.ui.contact.i5.d(this.D, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62)) {
            if (this.M == null) {
                this.M = x7(listView, new com.tencent.mm.ui.contact.ga(this), getString(com.tencent.mm.R.string.jbv));
            }
            this.M.setVisibility(i17);
        }
        if (com.tencent.mm.ui.contact.i5.d(this.D, 67108864)) {
            if (this.N == null) {
                this.N = x7(listView, new com.tencent.mm.ui.contact.ha(this), getString(com.tencent.mm.R.string.jbu));
            }
            this.N.setVisibility(i17);
        }
        if (com.tencent.mm.ui.contact.i5.d(this.D, 512)) {
            if (this.H == null) {
                this.H = x7(listView, new com.tencent.mm.ui.contact.ia(this), getString(com.tencent.mm.R.string.cfx));
            }
            this.H.setVisibility(i17);
        }
        if (com.tencent.mm.ui.contact.i5.d(this.D, 1024)) {
            if (this.I == null) {
                this.I = x7(listView, new com.tencent.mm.ui.contact.d9(this), getString(com.tencent.mm.R.string.f489910f6));
            }
            this.I.setVisibility(i17);
        }
        if (com.tencent.mm.ui.contact.i5.d(this.D, 2048)) {
            if (this.K == null) {
                this.K = x7(listView, new com.tencent.mm.ui.contact.e9(this), getString(com.tencent.mm.R.string.f489922fj));
            }
            this.K.setVisibility(i17);
            android.widget.TextView textView3 = this.K;
            textView3.setTextSize(i65.a.q(textView3.getContext()) * 16.0f);
        }
        if (com.tencent.mm.ui.contact.i5.d(this.D, 524288)) {
            if (this.f206537J == null) {
                int intExtra = getIntent().getIntExtra("topstory_import_type", 0);
                int i18 = com.tencent.mm.R.string.f489914fa;
                int i19 = com.tencent.mm.R.string.f_;
                if (intExtra == 1) {
                    java.util.List L0 = ((com.tencent.mm.plugin.sns.storage.r2) p94.w0.f()).L0(5L);
                    r7 = com.tencent.mm.sdk.platformtools.t8.L0(L0) ? 0 : ((java.util.ArrayList) L0).size();
                    str = com.tencent.mm.sdk.platformtools.t8.c1(L0, ",");
                } else if (intExtra == 2) {
                    java.util.List b17 = k35.c.b();
                    r7 = com.tencent.mm.sdk.platformtools.t8.L0(b17) ? 0 : ((java.util.ArrayList) b17).size();
                    str = com.tencent.mm.sdk.platformtools.t8.c1(b17, ",");
                    i19 = com.tencent.mm.R.string.f489912f8;
                    i18 = com.tencent.mm.R.string.f489913f9;
                } else {
                    str = "";
                }
                android.widget.TextView x76 = x7(listView, new com.tencent.mm.ui.contact.g9(this, i18, r7, str), getString(i19));
                this.f206537J = x76;
                x76.setTag(java.lang.Integer.valueOf(r7));
            }
            java.lang.Object tag = this.f206537J.getTag();
            if (!(tag instanceof java.lang.Integer) || ((java.lang.Integer) tag).intValue() <= 0) {
                this.f206537J.setVisibility(8);
            } else {
                this.f206537J.setVisibility(i17);
            }
        }
        if (com.tencent.mm.ui.contact.i5.d(this.D, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62)) {
            if (this.L == null) {
                java.util.LinkedList linkedList = (java.util.LinkedList) ((com.tencent.mm.storage.k4) c01.d9.b().q()).Q();
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "setOpenIMHeaderView %s", java.lang.Integer.valueOf(linkedList.size()));
                if (linkedList.size() != 0) {
                    this.L = x7(listView, new com.tencent.mm.ui.contact.i9(this), "");
                    java.lang.String Ni = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni("3552365301", "openim_acct_type_title", j41.a0.TYPE_WORDING);
                    this.L.setVisibility(i17);
                    this.L.setText(Ni);
                }
            }
            android.widget.TextView textView4 = this.L;
            if (textView4 != null) {
                textView4.setVisibility(i17);
            }
        }
        if (com.tencent.mm.ui.contact.i5.d(this.D, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) && (textView2 = this.L) != null) {
            textView2.setBackgroundResource(com.tencent.mm.R.drawable.f481310q6);
            return;
        }
        if (com.tencent.mm.ui.contact.i5.d(this.D, 2048)) {
            android.widget.TextView textView5 = this.K;
            if (textView5 != null) {
                textView5.setBackgroundResource(com.tencent.mm.R.drawable.f481310q6);
                return;
            }
            return;
        }
        if (com.tencent.mm.ui.contact.i5.d(this.D, 1024)) {
            android.widget.TextView textView6 = this.I;
            if (textView6 != null) {
                textView6.setBackgroundResource(com.tencent.mm.R.drawable.f481310q6);
                return;
            }
            return;
        }
        if (com.tencent.mm.ui.contact.i5.d(this.D, 512)) {
            android.widget.TextView textView7 = this.H;
            if (textView7 != null) {
                textView7.setBackgroundResource(com.tencent.mm.R.drawable.f481310q6);
                return;
            }
            return;
        }
        if (!com.tencent.mm.ui.contact.i5.d(this.D, 256) || (textView = this.G) == null) {
            return;
        }
        textView.setBackgroundResource(com.tencent.mm.R.drawable.f481310q6);
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(cj5.z2.class);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        java.lang.String str2;
        if (dVar.d() && (str2 = dVar.f206850s) != null) {
            return ((java.util.LinkedList) this.R).contains(str2);
        }
        if (dVar.f206839h && (str = dVar.f206850s) != null) {
            return ((java.util.LinkedList) this.R).contains(str);
        }
        if (dVar instanceof com.tencent.mm.ui.contact.item.d1) {
            return this.R.isEmpty();
        }
        return false;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactUI", "height:%s", java.lang.Integer.valueOf(i17));
        android.animation.ObjectAnimator objectAnimator = this.f206543f2;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f206543f2.cancel();
        }
        if (i17 > 0) {
            if (this.f206551p0.getTranslationY() != 0.0f) {
                this.f206551p0.setTranslationY(0.0f);
            }
            this.f206543f2 = android.animation.ObjectAnimator.ofFloat(this.f206551p0, "translationY", 0.0f, -i17);
        } else {
            android.widget.RelativeLayout relativeLayout = this.f206551p0;
            this.f206543f2 = android.animation.ObjectAnimator.ofFloat(relativeLayout, "translationY", relativeLayout.getTranslationY(), 0.0f);
        }
        this.f206543f2.setDuration(200L);
        this.f206543f2.setInterpolator(new y3.b());
        this.f206543f2.addUpdateListener(new com.tencent.mm.ui.contact.h9(this));
        this.f206543f2.start();
    }

    public final android.widget.TextView x7(android.widget.ListView listView, android.view.View.OnClickListener onClickListener, java.lang.String str) {
        android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.bik, (android.view.ViewGroup) null);
        inflate.setOnClickListener(onClickListener);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483931ci2);
        textView.setText(str);
        listView.addHeaderView(inflate);
        return textView;
    }

    public final void y7() {
        if (this.Q1) {
            int i17 = this.U;
            if (i17 == 1 || i17 == 0) {
                java.util.List list = this.Q;
                int size = list != null ? ((java.util.LinkedList) list).size() : 0;
                java.util.List list2 = this.R;
                this.f206550l2.a(this, size + (list2 != null ? ((java.util.LinkedList) list2).size() : 0), com.tencent.mm.sdk.platformtools.t8.D1(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ChatRoomInviteStartCount"), 0));
            }
        }
    }

    public final void z7(com.tencent.mm.roomsdk.model.factory.a aVar) {
        aVar.f192248d = new com.tencent.mm.ui.contact.s9(this, aVar);
        aVar.c(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f492388gb2), true, true, new com.tencent.mm.ui.contact.t9(this, aVar));
        I7(2);
    }
}
