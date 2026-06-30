package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class SelectContactsFromRangeUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI implements com.tencent.mm.modelbase.u0 {
    public com.tencent.mm.ui.contact.sa C;
    public com.tencent.mm.ui.contact.ta D;
    public int E;
    public java.lang.String F;
    public java.lang.String[] G;

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            this.C.t(str);
            if (((java.util.LinkedList) this.C.f207182r).size() > 0) {
                updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490507x1) + "(" + ((java.util.LinkedList) this.C.f207182r).size() + ")");
                enableOptionMenu(1, true);
            } else {
                updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490507x1));
                enableOptionMenu(1, false);
            }
            if (b7() instanceof com.tencent.mm.ui.contact.ta) {
                Y6();
                hideVKB();
            }
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        return this.C;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return this.D;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        return getString(com.tencent.mm.R.string.f489934fx);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public android.app.Activity getActivity() {
        return this;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        int headerViewsCount = i17 - this.f206446d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactsFromRangeUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mm.ui.contact.item.d item = b7().getItem(headerViewsCount);
        if (item == null || !(item instanceof com.tencent.mm.ui.contact.item.u)) {
            return;
        }
        if (this.E == 16 || !((com.tencent.mm.ui.contact.item.a) item).B.y2()) {
            java.lang.String d17 = ((com.tencent.mm.ui.contact.item.a) item).B.d1();
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactsFromRangeUI", "ClickUser=%s", d17);
            this.C.t(d17);
            if (((java.util.LinkedList) this.C.f207182r).size() > 0) {
                updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490507x1) + "(" + ((java.util.LinkedList) this.C.f207182r).size() + ")");
                enableOptionMenu(1, true);
            } else {
                updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490507x1));
                enableOptionMenu(1, false);
            }
            if (b7() instanceof com.tencent.mm.ui.contact.ta) {
                Y6();
                hideVKB();
            }
            this.f206450h.d(d17);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        this.E = getIntent().getIntExtra("list_type", 0);
        this.F = getIntent().getStringExtra("filter_type");
        this.G = getIntent().getStringArrayExtra("already_select_contact");
        com.tencent.mm.ui.contact.sa saVar = new com.tencent.mm.ui.contact.sa(this, this, getIntent().getIntExtra("max_limit_num", 30));
        this.C = saVar;
        saVar.f207078f = true;
        this.D = new com.tencent.mm.ui.contact.ta(this, this, this.C);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.ui.contact.pa(this));
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.ui.contact.qa(this), null, this.E == 16 ? com.tencent.mm.ui.fb.RED : com.tencent.mm.ui.fb.GREEN);
        enableOptionMenu(1, false);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.C.k();
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactsFromRangeUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.getType());
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        return (dVar instanceof com.tencent.mm.ui.contact.item.u) && this.E != 16 && ((com.tencent.mm.ui.contact.item.a) dVar).B.y2();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        if (!(dVar instanceof com.tencent.mm.ui.contact.item.u)) {
            return false;
        }
        return ((java.util.LinkedList) this.C.f207182r).contains(((com.tencent.mm.ui.contact.item.u) dVar).f206819z);
    }
}
