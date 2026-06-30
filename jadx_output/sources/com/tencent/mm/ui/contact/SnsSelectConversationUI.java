package com.tencent.mm.ui.contact;

@db5.a(19)
@gm0.a2
/* loaded from: classes11.dex */
public class SnsSelectConversationUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public static final int N = com.tencent.mm.ui.contact.i5.g(1, 2);
    public android.widget.RelativeLayout C;
    public android.widget.RelativeLayout D;
    public android.widget.LinearLayout E;
    public android.widget.ImageView F;
    public android.widget.TextView G;

    /* renamed from: J, reason: collision with root package name */
    public int f206569J;
    public com.tencent.mm.ui.contact.pb K;
    public java.util.List L;
    public final boolean H = true;
    public java.util.List I = new java.util.LinkedList();
    public final android.view.MenuItem.OnMenuItemClickListener M = new com.tencent.mm.ui.contact.dc(this);

    public void A7(java.util.List list) {
        z7();
        com.tencent.mm.ui.contact.pb pbVar = this.K;
        if (pbVar != null) {
            pbVar.w(list);
        }
        b7().notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            ((java.util.LinkedList) this.I).remove(str);
            com.tencent.mm.plugin.sns.statistics.j0.f164861a.k(str);
            A7(this.I);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public java.lang.String W5(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str = dVar.f206850s;
        if (str == null || !com.tencent.mm.storage.z3.N3(str)) {
            return null;
        }
        java.util.List<java.lang.String> list = this.I;
        int i17 = 0;
        if (list != null) {
            for (java.lang.String str2 : list) {
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                if (c01.v1.y(str2)) {
                    i17++;
                }
            }
        }
        if (i17 != 0) {
            return getString(com.tencent.mm.R.string.f492960ig2, java.lang.Integer.valueOf(i17));
        }
        return null;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        com.tencent.mm.ui.contact.pb pbVar = new com.tencent.mm.ui.contact.pb(this, this.L, true, this.H, false, this.f206569J);
        this.K = pbVar;
        return pbVar;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return new com.tencent.mm.ui.contact.f5((com.tencent.mm.ui.contact.MMBaseSelectContactUI) this, this.L, true, this.A, false, true);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public int[] d7() {
        int[] intArrayExtra = getIntent().getIntArrayExtra("search_range");
        return intArrayExtra != null ? intArrayExtra : super.d7();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(-1, com.tencent.mm.R.anim.f477877e1);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        java.lang.String stringExtra = getIntent().getStringExtra("Select_Conv_ui_title");
        return (stringExtra == null || stringExtra.length() <= 0) ? getString(com.tencent.mm.R.string.jgi) : stringExtra;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        boolean z17;
        int headerViewsCount = i17 - this.f206446d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectConversationUI", "Click HeaderView position=%d", java.lang.Integer.valueOf(i17));
            x7();
            return;
        }
        com.tencent.mm.ui.contact.item.d item = b7().getItem(headerViewsCount);
        if (item == null || (str = item.f206850s) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectConversationUI", "ClickUser=%s", str);
        if (com.tencent.mm.storage.z3.R4(str)) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(this, com.tencent.mm.ui.contact.SnsSelectConversationMemberUI.class);
            intent.putExtra("no_result_tip", getContext().getString(com.tencent.mm.R.string.jhp));
            intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(this.I, ","));
            intent.putExtra("select_chatroom_name", str);
            startActivityForResult(intent, 6);
        } else {
            if ("conversationboxservice".equals(str)) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(this, com.tencent.mm.ui.contact.SnsSelectFromConvBoxUI.class);
                intent2.putExtras(getIntent().getExtras());
                intent2.putExtra("KIsMultiSelect", true);
                intent2.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(this.I, ","));
                startActivityForResult(intent2, 7);
                db5.f.a(getContext(), intent2);
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                return;
            }
            if (!((java.util.LinkedList) this.I).contains(str) && y7(((java.util.LinkedList) this.I).size() + 1)) {
                Y6();
                return;
            }
            Y6();
            if (android.text.TextUtils.isEmpty(str) || !str.contains("openim")) {
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
                if (multiSelectContactView != null) {
                    multiSelectContactView.d(str);
                }
                if (((java.util.LinkedList) this.I).contains(str)) {
                    ((java.util.LinkedList) this.I).remove(str);
                    com.tencent.mm.plugin.sns.statistics.j0.f164861a.k(str);
                } else {
                    ((java.util.LinkedList) this.I).add(str);
                    com.tencent.mm.plugin.sns.statistics.j0.f164861a.a(str, 1);
                }
            } else {
                db5.e1.t(getContext(), getString(com.tencent.mm.R.string.jhm), "", new com.tencent.mm.ui.contact.SnsSelectConversationUI$$a());
            }
        }
        A7(this.I);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        this.C = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.lls);
        this.D = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.gzk);
        this.E = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.chj);
        this.F = (android.widget.ImageView) this.C.findViewById(com.tencent.mm.R.id.h6y);
        android.widget.TextView textView = (android.widget.TextView) this.C.findViewById(com.tencent.mm.R.id.gze);
        this.G = textView;
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        this.G.setText(getString(com.tencent.mm.R.string.iex));
        ((android.widget.TextView) this.C.findViewById(com.tencent.mm.R.id.f483931ci2)).setText(getString(com.tencent.mm.R.string.ifk));
        android.widget.ImageView imageView = this.F;
        if (imageView != null) {
            imageView.setImageResource(com.tencent.mm.R.raw.icons_filled_contacts);
        }
        this.E.setOnClickListener(new com.tencent.mm.ui.contact.bc(this));
        java.util.List list = this.I;
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
        if (multiSelectContactView != null) {
            multiSelectContactView.e(list);
        }
        A7(list);
        this.f206446d.setOnScrollListener(new com.tencent.mm.ui.contact.ac(this));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        this.f206569J = getIntent().getIntExtra("Select_Conv_Type", N);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(com.tencent.mm.ui.contact.i5.b());
        hashSet.addAll(com.tencent.mm.ui.contact.i5.c());
        java.lang.String stringExtra = getIntent().getStringExtra("Select_block_List");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            hashSet.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")));
        }
        if (com.tencent.mm.ui.contact.i5.d(this.f206569J, 2)) {
            java.util.HashSet i17 = c01.e2.i();
            i17.remove("filehelper");
            hashSet.addAll(i17);
        }
        if (!com.tencent.mm.ui.contact.i5.d(this.f206569J, 4)) {
            hashSet.remove("conversationboxservice");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.L = arrayList;
        arrayList.addAll(hashSet);
        java.util.List list = this.L;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int size = list.size();
        list.addAll(k35.c.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectConversationUI", "[fillBlockList] cost:%sms size:%s block size:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(list.size() - size));
        w7();
        this.I = new java.util.LinkedList();
        java.lang.String stringExtra2 = getIntent().getStringExtra("Select_Contact");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            return;
        }
        this.I.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(",")));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return !(this instanceof com.tencent.mm.ui.contact.SnsSelectFromConvBoxUI);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectConversationUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18 + ", data = null");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            ((java.util.LinkedList) this.I).clear();
            ((java.util.LinkedList) this.I).addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")));
            java.util.List list = this.I;
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
            if (multiSelectContactView != null) {
                multiSelectContactView.e(list);
            }
            A7(list);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectConversationUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18 + ", data = " + intent.toString());
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.p7();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        o25.n1.c(this);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeAllOptionMenu();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void p7() {
        super.p7();
        hideVKB();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            return false;
        }
        return this.I.contains(str);
    }

    public void w7() {
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.jbc), this.M, null, com.tencent.mm.ui.fb.GREEN);
        z7();
    }

    public final void x7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectConversationUI", "selectContactFromAddressUI");
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.tencent.mm.ui.contact.SnsSelectConversationAddressUI.class);
        intent.putExtra("Contact_Compose", true);
        intent.putExtra("List_Type", 1);
        intent.putExtra("Add_address_titile", getContext().getString(com.tencent.mm.R.string.jgi));
        intent.putExtra("footer_tip", getContext().getString(com.tencent.mm.R.string.jhf));
        intent.putExtra("Contact_GroupFilter_Type", "@micromsg.qq.com");
        intent.putExtra("Block_list", c01.z1.r());
        intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(this.I, ","));
        intent.putExtra("sns_address_count", this.I.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(6);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(this, arrayList.toArray(), "com/tencent/mm/ui/contact/SnsSelectConversationUI", "selectContactFromAddressUI", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final boolean y7(int i17) {
        if (i17 <= 10) {
            return false;
        }
        db5.e1.t(getContext(), getString(com.tencent.mm.R.string.jhs, java.lang.Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10))), "", new com.tencent.mm.ui.contact.ec(this));
        return true;
    }

    public void z7() {
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
        if (multiSelectContactView != null) {
            multiSelectContactView.setVisibility(0);
        }
        java.util.List list = this.I;
        if (list != null && list.size() > 0) {
            updateOptionMenuText(1, java.lang.String.format("%s(%d/%d)", getString(com.tencent.mm.R.string.jbc), java.lang.Integer.valueOf(this.I.size()), 10));
            updateOptionMenuStyle(1, com.tencent.mm.ui.fb.GREEN);
            enableOptionMenu(1, true);
        } else {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.jbc));
            enableOptionMenu(1, false);
            if (!(this instanceof com.tencent.mm.ui.contact.SnsSelectFromConvBoxUI)) {
                i7();
            }
        }
    }
}
