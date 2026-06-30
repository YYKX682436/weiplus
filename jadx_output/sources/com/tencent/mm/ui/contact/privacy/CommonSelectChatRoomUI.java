package com.tencent.mm.ui.contact.privacy;

/* loaded from: classes10.dex */
public class CommonSelectChatRoomUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public static final /* synthetic */ int E = 0;
    public final java.util.HashSet C = new java.util.HashSet();
    public java.lang.String D;

    public static void w7(com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI commonSelectChatRoomUI, com.tencent.mm.storage.z3 z3Var) {
        commonSelectChatRoomUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonSelectChatRoomUI", "goToRoomMember, contact=%s.", z3Var);
        java.lang.String d17 = z3Var.d1();
        android.content.Intent intent = new android.content.Intent(commonSelectChatRoomUI, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsChatRoomMemberUI.class);
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        java.util.List m17 = c01.v1.m(d17);
        int size = m17 != null ? ((java.util.LinkedList) m17).size() : 0;
        intent.putExtra("RoomInfo_Id", d17);
        intent.putExtra("room_member_count", size);
        intent.putExtra("Add_address_titile", commonSelectChatRoomUI.getString(com.tencent.mm.R.string.jbh));
        intent.putExtra("room_name", z3Var.d1());
        commonSelectChatRoomUI.startActivityForResult(intent, 1);
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.D(d17);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            this.C.remove(str);
            b7().notifyDataSetChanged();
            y7();
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        sb4.c cVar = new sb4.c(this, null, true, false, false);
        uf5.a0 a0Var = new uf5.a0(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        cVar.f405450r = a0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        return cVar;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        sb4.d dVar = new sb4.d(this, null, true);
        uf5.b0 b0Var = new uf5.b0(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        dVar.f405453n = b0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemMoreIvClickListener", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomSearchAdapter");
        return dVar;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public int[] d7() {
        return new int[]{131075};
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        return "";
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.contact.item.a aVar;
        com.tencent.mm.storage.z3 z3Var;
        int headerViewsCount = i17 - this.f206446d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CommonSelectChatRoomUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mm.ui.contact.item.d item = b7().getItem(headerViewsCount);
        if (item == null || !(item instanceof com.tencent.mm.ui.contact.item.a) || (z3Var = (aVar = (com.tencent.mm.ui.contact.item.a) item).B) == null || z3Var.F0() == 1) {
            return;
        }
        java.lang.String d17 = aVar.B.d1();
        Y6();
        this.f206450h.d(d17);
        java.util.HashSet hashSet = this.C;
        if (hashSet.contains(d17)) {
            hashSet.remove(d17);
        } else {
            hashSet.add(d17);
        }
        this.f206448f.notifyDataSetChanged();
        y7();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        java.lang.String stringExtra = getIntent().getStringExtra("privacy_source_type");
        this.D = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonSelectChatRoomUI", "initData, blackType = %s.", stringExtra);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1 || intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CommonSelectChatRoomUI", "onActivityResult, resultCode = %s.", java.lang.Integer.valueOf(i18));
            return;
        }
        if (i17 == 0) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Select_Contact", stringExtra);
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new uf5.y(this));
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490502ww), new uf5.z(this), null, com.tencent.mm.ui.fb.GREEN);
        y7();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void r7(android.widget.ListView listView, int i17) {
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            return false;
        }
        return this.C.contains(str);
    }

    public final java.util.ArrayList x7(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.C.iterator();
        while (it.hasNext()) {
            hashSet.add((java.lang.String) it.next());
        }
        arrayList.addAll(hashSet);
        return arrayList;
    }

    public final void y7() {
        java.util.HashSet hashSet = this.C;
        if (hashSet.size() > 0) {
            enableOptionMenu(1, true);
        } else {
            enableOptionMenu(1, false);
        }
        updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490502ww) + "(" + hashSet.size() + ")");
    }
}
