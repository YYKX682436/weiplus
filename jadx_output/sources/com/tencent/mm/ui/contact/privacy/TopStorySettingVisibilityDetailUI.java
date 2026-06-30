package com.tencent.mm.ui.contact.privacy;

@db5.a(3)
/* loaded from: classes10.dex */
public class TopStorySettingVisibilityDetailUI extends com.tencent.mm.ui.contact.privacy.ContactMgrUIBase {
    public java.util.List F = new java.util.ArrayList();
    public final java.util.List G = new java.util.ArrayList();
    public long H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f207123J;
    public final java.util.Set K;

    public TopStorySettingVisibilityDetailUI() {
        new java.util.HashSet();
        this.I = "";
        this.f207123J = "";
        this.K = new java.util.HashSet();
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public uf5.w0 T6(com.tencent.mm.ui.contact.l4 l4Var) {
        return new uf5.h2(this, l4Var);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void V6() {
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", getString(com.tencent.mm.R.string.hl7));
        intent.putExtra("list_type", 1);
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("without_openim", true);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206781b);
        intent.putExtra("always_select_contact", c17);
        intent.putExtra("topstory_import_type", this.H == 1 ? 1 : 2);
        j45.l.v(this, ".ui.contact.SelectContactUI", intent, 1);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void W6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        intent.putExtra("titile", getResources().getString(com.tencent.mm.R.string.hla));
        long j17 = this.H;
        if (j17 == 1) {
            intent.putExtra("filter_type", "@tophistory.unlike.android");
        } else if (j17 == 2) {
            intent.putExtra("filter_type", "@tophistory.black.android");
        }
        b7(intent);
        startActivityForResult(intent, 2);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void X6(android.content.Intent intent, android.content.Context context) {
        java.util.ArrayList P1;
        com.tencent.mm.storage.z3 n17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onAddContact.");
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onAddContact %s", stringExtra);
        if (stringExtra == null || (P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","))) == null) {
            return;
        }
        java.lang.String stringExtra2 = intent.getStringExtra("App_MsgId");
        gm0.j1.i();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String r17 = c01.z1.r();
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) || !stringExtra2.equals("fromSns")) {
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!this.f207100d.contains(str) && !r17.equals(str) && (n17 = Bi.n(str, true)) != null && n17.r2()) {
                    this.f207100d.add(str);
                }
            }
        } else {
            java.util.Iterator it6 = P1.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (!this.f207100d.contains(str2) && !r17.equals(str2)) {
                    this.f207100d.add(str2);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onAddContact tagList = %s.", this.f207100d);
        this.f207119z = true;
        l7();
        if (((java.util.HashSet) this.K).size() > 0) {
            this.D.a(new uf5.e2(this));
        }
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public boolean Y6(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void Z6(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.contact.item.d item = this.f207103g.getItem(i17);
        if (item == null || !(item instanceof com.tencent.mm.ui.contact.item.u)) {
            return;
        }
        java.lang.String str = ((com.tencent.mm.ui.contact.item.u) item).f206819z;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        j45.l.j(this, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void a7(android.content.Intent intent, android.content.Context context) {
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onRemoveContact %s", stringExtra);
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
        if (P1 == null) {
            return;
        }
        this.D.b(new uf5.f2(this, P1), new uf5.g2(this));
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onNotifyChange, event: %s, stg: %s, obj: %s.", java.lang.Integer.valueOf(i17), a1Var, obj);
        if (i17 == 4) {
            g7();
        }
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void i7() {
        uf5.w0 w0Var = this.f207103g;
        if (w0Var == null || w0Var.u() <= 0) {
            setMMTitle(this.I);
            return;
        }
        setMMTitle(this.I + "(" + this.f207103g.u() + ")");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        getIntent().getIntExtra("k_sns_from_settings_about_sns", 0);
        setBackBtn(new uf5.d2(this));
    }

    public final void j7(sm4.i iVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus");
        if (iVar == null || iVar.f409949g == null || iVar.f409950h == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus， netScene is null.");
            return;
        }
        for (int i17 = 0; i17 < iVar.f409949g.size(); i17++) {
            java.lang.String str = (java.lang.String) iVar.f409949g.get(i17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus，snsTagId is %s,  name is %s, .", java.lang.Long.valueOf(this.H), str);
                long j17 = this.H;
                if (j17 == 1) {
                    if (((java.lang.Integer) iVar.f409950h.get(i17)).intValue() == 3) {
                        this.f207100d.remove(str);
                        ((java.util.ArrayList) this.F).remove(str);
                    } else if (((java.lang.Integer) iVar.f409950h.get(i17)).intValue() == 4) {
                        this.f207100d.add(str);
                        ((java.util.ArrayList) this.F).add(str);
                    }
                } else if (j17 == 2) {
                    if (((java.lang.Integer) iVar.f409950h.get(i17)).intValue() == 1) {
                        this.f207100d.remove(str);
                        ((java.util.ArrayList) this.F).remove(str);
                    } else if (((java.lang.Integer) iVar.f409950h.get(i17)).intValue() == 2) {
                        this.f207100d.add(str);
                        ((java.util.ArrayList) this.F).add(str);
                    }
                }
            }
        }
        k7();
        g7();
        if (z17) {
            c7();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus, snsTamd5gName: %s, tagList: %s, origList : %s.", this.f207123J, this.f207100d, this.F);
    }

    public final void k7() {
        this.f207123J = this.I + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
        if (this.H == 1) {
            rm4.c.b().f397443e.clear();
            rm4.c.b().f397443e.addAll(this.f207100d);
            rm4.c.b().d();
        } else {
            rm4.c.b().f397442d.clear();
            rm4.c.b().f397442d.addAll(this.f207100d);
            rm4.c.b().c();
        }
    }

    public void l7() {
        java.lang.String str = this.I + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "writeNow newMd5 = %s, md5 = %s, origList = %s.", str, this.f207123J, this.F);
        if (!str.equals(this.f207123J) || this.H == 0) {
            k7();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str2 : this.f207100d) {
                if (!((java.util.ArrayList) this.F).contains(str2)) {
                    arrayList.add(str2);
                    if (this.H == 1) {
                        arrayList2.add(3);
                    } else {
                        arrayList2.add(1);
                    }
                }
            }
            java.util.Iterator it = ((java.util.ArrayList) this.F).iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                if (!this.f207100d.contains(str3)) {
                    arrayList.add(str3);
                    if (this.H == 1) {
                        arrayList2.add(4);
                    } else {
                        arrayList2.add(2);
                    }
                }
            }
            java.util.Set set = this.K;
            ((java.util.HashSet) set).clear();
            int i17 = 0;
            while (i17 < arrayList.size()) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (int i18 = 0; i17 < arrayList.size() && i18 < 50; i18++) {
                    arrayList3.add((java.lang.String) arrayList.get(i17));
                    arrayList4.add((java.lang.Integer) arrayList2.get(i17));
                    i17++;
                }
                ((java.util.HashSet) set).add(new sm4.i(arrayList3, arrayList4));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "batch doNetscene, size: %s", java.lang.Integer.valueOf(((java.util.HashSet) set).size()));
            ((java.util.ArrayList) this.F).clear();
            ((java.util.ArrayList) this.F).addAll(this.f207100d);
            if (((java.util.HashSet) set).size() == 0) {
                this.D.c();
                return;
            }
            java.util.Iterator it6 = ((java.util.HashSet) set).iterator();
            while (it6.hasNext()) {
                gm0.j1.n().f273288b.g((sm4.i) it6.next());
            }
        }
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.H = getIntent().getIntExtra("k_topstory_type", 0);
        super.onCreate(bundle);
        if (this.H == 1) {
            this.I = getString(com.tencent.mm.R.string.hlk);
        } else {
            this.I = getString(com.tencent.mm.R.string.hl9);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList, before md5: %s, tagList: %s, origList : %s.", this.f207123J, this.f207100d, this.F);
        java.lang.String stringExtra = getIntent().getStringExtra("k_topstory_user_list");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
            this.F = P1;
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !this.f207100d.contains(str)) {
                    this.f207100d.add(str);
                }
            }
        }
        java.util.List list = this.G;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.clear();
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(2, null);
        if (str2 == null) {
            str2 = "";
        }
        long j17 = this.H;
        if (j17 == 1) {
            android.database.Cursor x17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).x("@tophistory.unlike.android", "", null);
            while (x17.moveToNext()) {
                arrayList.add(x17.getString(x17.getColumnIndex(dm.i4.COL_USERNAME)));
            }
            x17.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList, localContactTagList: %s.", list);
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                java.lang.String str3 = (java.lang.String) arrayList.get(i17);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && !this.f207100d.contains(str3)) {
                    c01.e2.D0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str3, true));
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList tag no container db tagName: %s", str3);
                }
            }
            for (int i18 = 0; i18 < this.f207100d.size(); i18++) {
                java.lang.String str4 = (java.lang.String) this.f207100d.get(i18);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    c01.e2.v0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str4, true));
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList db no container tag tagName: %s", str4);
                }
            }
            if (this.f207100d.contains(str2)) {
                this.f207100d.remove(str2);
                c01.e2.D0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str2, true));
            }
        } else if (j17 == 2) {
            android.database.Cursor x18 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).x("@tophistory.black.android", "", null);
            while (x18.moveToNext()) {
                arrayList.add(x18.getString(x18.getColumnIndex(dm.i4.COL_USERNAME)));
            }
            x18.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList, localContactTagList: %s.", list);
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                java.lang.String str5 = (java.lang.String) arrayList.get(i19);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str5) && !this.f207100d.contains(str5)) {
                    c01.e2.C0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str5, true));
                }
            }
            for (int i27 = 0; i27 < this.f207100d.size(); i27++) {
                java.lang.String str6 = (java.lang.String) this.f207100d.get(i27);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                    c01.e2.u0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str6, true));
                }
            }
            if (this.f207100d.contains(str2)) {
                this.f207100d.remove(str2);
                c01.e2.C0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str2, true));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "initBlackList, after md5: %s, tagList: %s, origList : %s.", this.f207123J, this.f207100d, this.F);
        initView();
        gm0.j1.d().a(2859, this);
        enableOptionMenu(false);
        this.f207123J = this.I + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
        if (this.H == 1) {
            this.f207112s = getString(com.tencent.mm.R.string.hli);
        } else {
            this.f207112s = getString(com.tencent.mm.R.string.hlj);
        }
        f7();
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(2859, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        super.onSceneEnd(i17, i18, str, m1Var);
        if (m1Var instanceof sm4.i) {
            sm4.i iVar = (sm4.i) m1Var;
            boolean z17 = i17 == 0 && i18 == 0;
            if (z17 && (i19 = ((r45.o50) iVar.f409948f.f70711b.f70700a).BaseResponse.f376959d) != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd ret:%s", java.lang.Integer.valueOf(i19));
                z17 = false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd succ:%s", java.lang.Boolean.valueOf(z17));
            java.util.Set set = this.K;
            if (!z17) {
                int i27 = iVar.f409951i + 1;
                iVar.f409951i = i27;
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd, netScene.retryTimes: %s.", java.lang.Integer.valueOf(i27));
                if (iVar.f409951i < 2) {
                    sm4.i iVar2 = new sm4.i(iVar);
                    gm0.j1.n().f273288b.g(iVar2);
                    ((java.util.HashSet) set).add(iVar2);
                } else {
                    j7(iVar, true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd, isAddingContact: %s, isRemovingContact: %s.", java.lang.Boolean.valueOf(this.f207119z), java.lang.Boolean.valueOf(this.A));
                }
            }
            java.util.HashSet hashSet = (java.util.HashSet) set;
            if (hashSet.contains(m1Var)) {
                hashSet.remove(m1Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd netSceneSet remove, size:%s", java.lang.Integer.valueOf(hashSet.size()));
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseSuccessContactStatus");
                    for (int i28 = 0; i28 < iVar.f409949g.size(); i28++) {
                        java.lang.String str2 = (java.lang.String) iVar.f409949g.get(i28);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseSuccessContactStatus，snsTagId is %s,  name is %s, .", java.lang.Long.valueOf(this.H), str2);
                            long j17 = this.H;
                            if (j17 == 1) {
                                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str2, true);
                                if (((java.lang.Integer) iVar.f409950h.get(i28)).intValue() == 3) {
                                    c01.e2.v0(n17);
                                } else if (((java.lang.Integer) iVar.f409950h.get(i28)).intValue() == 4) {
                                    c01.e2.D0(n17);
                                }
                            } else if (j17 == 2) {
                                com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str2, true);
                                if (((java.lang.Integer) iVar.f409950h.get(i28)).intValue() == 1) {
                                    c01.e2.u0(n18);
                                } else if (((java.lang.Integer) iVar.f409950h.get(i28)).intValue() == 2) {
                                    c01.e2.C0(n18);
                                }
                            }
                        }
                    }
                    g7();
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "updateDataBaseFailContactStatus, snsTamd5gName: %s, tagList: %s, origList : %s.", this.f207123J, this.f207100d, this.F);
                }
                if (hashSet.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", " onSceneEnd, isEmpty, isAddingContact: %s, isRemovingContact: %s, succ : %s.", java.lang.Boolean.valueOf(this.f207119z), java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(z17));
                    this.D.c();
                    this.A = false;
                    this.f207119z = false;
                    if (z17) {
                        d7();
                    }
                }
            }
        }
    }
}
