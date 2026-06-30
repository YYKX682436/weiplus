package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class SelectLabelContactUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public java.lang.String C;
    public int D;
    public java.util.List E;
    public java.util.HashSet F;
    public java.util.HashSet G;

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        return new com.tencent.mm.ui.contact.l3(this, com.tencent.mm.ui.contact.i5.d(this.D, 64), ((b93.b) c93.a.a()).j(((b93.b) c93.a.a()).e(this.C)), this.E);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return null;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        return this.C;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        int headerViewsCount = i17 - this.f206446d.getHeaderViewsCount();
        com.tencent.mm.ui.contact.p4 b76 = b7();
        com.tencent.mm.ui.contact.item.d item = b76.getItem(headerViewsCount);
        if (item == null || (str = item.f206850s) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectLabelContactUI", "ClickUser=%s", str);
        if (!com.tencent.mm.ui.contact.i5.d(this.D, 64)) {
            w7(str);
            return;
        }
        if (!this.G.contains(str) && !this.F.contains(str) && com.tencent.mm.ui.contact.i5.d(this.D, 131072) && this.G.size() + this.F.size() >= getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE)) {
            db5.e1.t(getContext(), getString(com.tencent.mm.R.string.ifp, java.lang.Integer.valueOf(getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE))), "", new com.tencent.mm.ui.contact.va(this));
            return;
        }
        if (!this.G.contains(str)) {
            if (this.F.contains(str)) {
                this.F.remove(str);
            } else {
                this.F.add(str);
            }
        }
        x7();
        b76.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        this.C = getIntent().getStringExtra("label");
        this.D = getIntent().getIntExtra("list_attr", 0);
        this.F = new java.util.HashSet();
        this.G = new java.util.HashSet();
        this.E = new java.util.ArrayList();
        java.lang.String stringExtra = getIntent().getStringExtra("always_select_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.G.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")));
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("already_select_contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            this.F.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(",")));
        }
        java.lang.String stringExtra3 = getIntent().getStringExtra("block_contact");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
            return;
        }
        this.E.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra3.split(",")));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (com.tencent.mm.ui.contact.i5.d(this.D, 64)) {
            addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.ui.contact.ua(this), null, com.tencent.mm.ui.fb.GREEN);
        }
        x7();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            return false;
        }
        return this.G.contains(str);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            return false;
        }
        return this.F.contains(str);
    }

    public final void w7(java.lang.String str) {
        if (com.tencent.mm.ui.contact.i5.d(this.D, 16384)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", str);
            setResult(-1, intent);
            finish();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClass(this, com.tencent.mm.ui.chatting.ChattingUI.class);
        intent2.putExtra("Chat_User", str);
        intent2.putExtra("finish_direct", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/contact/SelectLabelContactUI", "handleSelect", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/contact/SelectLabelContactUI", "handleSelect", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public final void x7() {
        if (!com.tencent.mm.ui.contact.i5.d(this.D, 64) || this.F.size() <= 0) {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490507x1));
            enableOptionMenu(1, false);
            return;
        }
        updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490507x1) + "(" + this.F.size() + ")");
        enableOptionMenu(1, true);
    }
}
