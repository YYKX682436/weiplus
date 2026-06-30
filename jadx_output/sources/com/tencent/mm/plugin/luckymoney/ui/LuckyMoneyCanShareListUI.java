package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class LuckyMoneyCanShareListUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLoadMoreListView f146040g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.i6 f146041h;

    /* renamed from: i, reason: collision with root package name */
    public int f146042i = 0;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f146043m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public boolean f146044n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f146045o = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f146046p = "";

    public final void V6() {
        this.f146045o = true;
        int i17 = this.f146042i;
        if (i17 == 0) {
            this.f146046p = "";
        }
        doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.a6(10, i17, 3, "", "v1.0", this.f146046p));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.buq;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new com.tencent.mm.plugin.luckymoney.ui.a1(this));
        this.f146040g = (com.tencent.mm.ui.base.MMLoadMoreListView) findViewById(com.tencent.mm.R.id.f485798j36);
        setMMTitle(getString(com.tencent.mm.R.string.glf));
        com.tencent.mm.plugin.luckymoney.ui.a7 a7Var = new com.tencent.mm.plugin.luckymoney.ui.a7(getContext());
        this.f146041h = a7Var;
        this.f146040g.setAdapter((android.widget.ListAdapter) a7Var);
        this.f146040g.setOnItemClickListener(new com.tencent.mm.plugin.luckymoney.ui.b1(this));
        this.f146040g.setOnLoadMoreListener(new com.tencent.mm.plugin.luckymoney.ui.c1(this));
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        V6();
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.List list;
        if (!(m1Var instanceof com.tencent.mm.plugin.luckymoney.model.a6) || i17 != 0 || i18 != 0) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.a6 a6Var = (com.tencent.mm.plugin.luckymoney.model.a6) m1Var;
        java.util.LinkedList linkedList = a6Var.f145165h.f145477m;
        this.f146046p = a6Var.f145168n;
        if (linkedList != null) {
            int i19 = 0;
            while (true) {
                int size = linkedList.size();
                list = this.f146043m;
                if (i19 >= size) {
                    break;
                }
                ((java.util.LinkedList) list).add((com.tencent.mm.plugin.luckymoney.model.o4) linkedList.get(i19));
                i19++;
            }
            this.f146042i += linkedList.size();
            com.tencent.mm.plugin.luckymoney.model.n4 n4Var = a6Var.f145165h;
            this.f146044n = n4Var == null || n4Var.f145476i == 1;
            this.f146045o = false;
            com.tencent.mm.plugin.luckymoney.ui.i6 i6Var = this.f146041h;
            if (list == null) {
                i6Var.getClass();
                i6Var.f147017d = new java.util.LinkedList();
            } else {
                i6Var.f147017d = list;
            }
            i6Var.notifyDataSetChanged();
        }
        if (this.f146044n) {
            this.f146040g.g();
        } else {
            this.f146040g.b();
        }
        return true;
    }
}
