package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes10.dex */
public class SnsSelectChatRoomUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public static final /* synthetic */ int F = 0;
    public final java.util.HashSet C = new java.util.HashSet();
    public int D = -1;
    public final com.tencent.mm.sdk.platformtools.b4 E = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), new com.tencent.mm.sdk.platformtools.a4() { // from class: com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI$$a
        @Override // com.tencent.mm.sdk.platformtools.a4
        public final boolean onTimerExpired() {
            int i17 = com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI.F;
            com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI snsSelectChatRoomUI = com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI.this;
            snsSelectChatRoomUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$new$0", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            snsSelectChatRoomUI.setMMSubTitle(snsSelectChatRoomUI.e7());
            snsSelectChatRoomUI.setMMSubTitleColor(snsSelectChatRoomUI.getContext().getColor(com.tencent.mm.R.color.a2y));
            if (snsSelectChatRoomUI.f7() > 0.0f) {
                snsSelectChatRoomUI.setMMSubTitleSize(snsSelectChatRoomUI.f7());
            }
            if (com.tencent.mm.ui.bk.C()) {
                snsSelectChatRoomUI.setMMSubTitleColor(snsSelectChatRoomUI.getContext().getColor(com.tencent.mm.R.color.by));
            } else {
                snsSelectChatRoomUI.setMMSubTitleColor(snsSelectChatRoomUI.getContext().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$new$0", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return false;
        }
    }, false);

    public static void w7(com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI snsSelectChatRoomUI, com.tencent.mm.storage.z3 z3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        snsSelectChatRoomUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goToRoomMember", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        java.lang.String d17 = z3Var.d1();
        android.content.Intent intent = new android.content.Intent(snsSelectChatRoomUI, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI.class);
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        java.util.List m17 = c01.v1.m(d17);
        int size = m17 != null ? ((java.util.LinkedList) m17).size() : 0;
        int intExtra = snsSelectChatRoomUI.getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
        intent.putExtra("RoomInfo_Id", d17);
        intent.putExtra("room_member_count", size);
        intent.putExtra("Add_address_titile", snsSelectChatRoomUI.getString(com.tencent.mm.R.string.jbh));
        intent.putExtra("room_name", z3Var.d1());
        intent.putExtra("CONTACT_INFO_UI_SOURCE", intExtra);
        snsSelectChatRoomUI.startActivityForResult(intent, 1);
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.D(d17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goToRoomMember", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        if (i17 == 1) {
            java.util.HashSet hashSet = this.C;
            hashSet.remove(str);
            b7().notifyDataSetChanged();
            int size = hashSet.size();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            u7(size);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createInitAdapter", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        boolean booleanExtra = getIntent().getBooleanExtra("key_filter_associate_chat_room", false);
        if (getIntent().getBooleanExtra("new_life_stryle", false)) {
            sb4.a aVar = new sb4.a(this, null, true, booleanExtra, com.tencent.mm.sdk.platformtools.t8.O1(getIntent().getStringExtra("recent_select_list"), ","));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createInitAdapter", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return aVar;
        }
        sb4.c cVar = new sb4.c(this, null, true, false, booleanExtra);
        com.tencent.mm.plugin.sns.ui.no noVar = new com.tencent.mm.plugin.sns.ui.no(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        cVar.f405450r = noVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createInitAdapter", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return cVar;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSearchAdapter", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        sb4.d dVar = new sb4.d(this, null, true);
        com.tencent.mm.plugin.sns.ui.oo ooVar = new com.tencent.mm.plugin.sns.ui.oo(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        dVar.f405453n = ooVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        ((qd0.n0) dVar.f206704m).f361569t = true;
        if (getIntent().getBooleanExtra("new_life_stryle", false)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowMoreBtn", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
            dVar.f405454o = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowMoreBtn", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSearchAdapter", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return dVar;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public int[] d7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSearchRange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        int[] iArr = {131075};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSearchRange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return iArr;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String e7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubTitleString", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        java.lang.String stringExtra = getIntent().getStringExtra("sub_title");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubTitleString", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return stringExtra;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public float f7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubTitleTextSize", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        float intExtra = getIntent().getIntExtra("sub_title_text_size", -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubTitleTextSize", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return intExtra;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleString", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        java.lang.String stringExtra = getIntent().getStringExtra("titile");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleString", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return stringExtra;
        }
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.jbi);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleString", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return string;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        int headerViewsCount = i17 - this.f206446d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectChatRoomUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return;
        }
        com.tencent.mm.ui.contact.item.d item = b7().getItem(headerViewsCount);
        if (item == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return;
        }
        if (!(item instanceof com.tencent.mm.ui.contact.item.a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return;
        }
        com.tencent.mm.ui.contact.item.a aVar = (com.tencent.mm.ui.contact.item.a) item;
        com.tencent.mm.storage.z3 z3Var = aVar.B;
        if (z3Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return;
        }
        if (z3Var.F0() == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return;
        }
        com.tencent.mm.storage.z3 z3Var2 = aVar.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectUser", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        java.lang.String d17 = z3Var2.d1();
        java.util.HashSet hashSet = this.C;
        if (hashSet.contains(d17)) {
            hashSet.remove(d17);
        } else {
            if (this.D > 0 && hashSet.size() >= this.D) {
                setMMSubTitle(getContext().getString(com.tencent.mm.R.string.jyu, java.lang.Integer.valueOf(this.D)));
                setMMSubTitleColor(getContext().getColor(com.tencent.mm.R.color.a2y));
                if (f7() > 0.0f) {
                    setMMSubTitleSize(f7());
                }
                com.tencent.mm.sdk.platformtools.b4 b4Var = this.E;
                b4Var.d();
                b4Var.c(1500L, 1500L);
                com.tencent.mm.sdk.platformtools.t8.L1(this, true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectUser", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
                this.f206448f.notifyDataSetChanged();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            }
            hashSet.add(d17);
        }
        Y6();
        this.f206450h.d(d17);
        int size = hashSet.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        u7(size);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectUser", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        this.f206448f.notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleItemClick", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        super.j7();
        java.lang.String stringExtra = getIntent().getStringExtra("already_select_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            java.util.List O1 = com.tencent.mm.sdk.platformtools.t8.O1(stringExtra, ",");
            if (!com.tencent.mm.sdk.platformtools.t8.L0(O1)) {
                this.C.addAll(O1);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSearchBarInTop", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSearchBarInTop", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowAlphabetScrollBar", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowAlphabetScrollBar", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initMenu", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        java.lang.String stringExtra = getIntent().getStringExtra("key_confirm_menu_name");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            stringExtra = getString(com.tencent.mm.R.string.f490459vn);
        }
        addTextOptionMenu(1, stringExtra, new com.tencent.mm.plugin.sns.ui.mo(this), null, com.tencent.mm.ui.fb.GREEN);
        enableOptionMenu(1, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initMenu", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        java.util.HashSet hashSet = this.C;
        this.f206450h.e(new java.util.ArrayList(hashSet));
        this.D = getIntent().getIntExtra("max_limit_num", -1);
        int size = hashSet.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        u7(size);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateUIOnSelectChange", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void r7(android.widget.ListView listView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeaderView", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeaderView", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isItemCheck", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isItemCheck", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
            return false;
        }
        boolean contains = this.C.contains(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isItemCheck", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return contains;
    }

    public final java.util.ArrayList x7(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectList", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.C.iterator();
        while (it.hasNext()) {
            hashSet.add((java.lang.String) it.next());
        }
        arrayList.addAll(hashSet);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectList", "com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI");
        return arrayList;
    }
}
