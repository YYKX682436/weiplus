package t24;

/* loaded from: classes.dex */
public final class u extends a24.g {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f415338e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f415339f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f415340g;

    public u(yz5.a getSearchText, yz5.a getSearchQueryID) {
        kotlin.jvm.internal.o.g(getSearchText, "getSearchText");
        kotlin.jvm.internal.o.g(getSearchQueryID, "getSearchQueryID");
        this.f415338e = getSearchText;
        this.f415339f = getSearchQueryID;
        this.f415340g = jz5.h.b(t24.t.f415337d);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.Intent intent3;
        android.content.Intent intent4;
        android.content.Intent intent5;
        c24.c item = (c24.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String str = (java.lang.String) this.f415338e.invoke();
        java.lang.String str2 = (java.lang.String) this.f415339f.invoke();
        android.content.Context context = holder.f293121e;
        boolean z18 = context instanceof com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI;
        com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI baseSettingUI = z18 ? (com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI) context : null;
        boolean z19 = true;
        if (baseSettingUI != null && (intent5 = baseSettingUI.getIntent()) != null) {
            intent5.putExtra("cell_source_type", 1);
        }
        com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI baseSettingUI2 = z18 ? (com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI) context : null;
        if (baseSettingUI2 != null && (intent4 = baseSettingUI2.getIntent()) != null) {
            intent4.putExtra("search_word", str);
        }
        com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI baseSettingUI3 = z18 ? (com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI) context : null;
        if (baseSettingUI3 != null && (intent3 = baseSettingUI3.getIntent()) != null) {
            intent3.putExtra("search_query_id", str2);
        }
        com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI baseSettingUI4 = z18 ? (com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI) context : null;
        if (baseSettingUI4 != null && (intent2 = baseSettingUI4.getIntent()) != null) {
            intent2.putExtra("key_config_item", "SettingGroup_Main");
        }
        com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI baseSettingUI5 = z18 ? (com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI) context : null;
        if (baseSettingUI5 != null && (intent = baseSettingUI5.getIntent()) != null) {
            intent.putExtra("search_index", i17 + 1);
        }
        p(holder, item, i17, i18, z17, list);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.oct);
        if (p17 != null) {
            p17.setBackground(context.getDrawable(com.tencent.mm.R.drawable.bfj));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(android.R.id.summary);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.oct);
        wd0.y1 y1Var = (wd0.y1) ((jz5.n) this.f415340g).getValue();
        java.lang.String str3 = str == null ? "" : str;
        wd0.x1 x1Var = item.f38071e;
        jz5.l Vi = ((vd0.l3) y1Var).Vi(x1Var, str3);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) Vi.f302833d;
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) Vi.f302834e;
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(android.R.id.title);
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        java.lang.CharSequence charSequence3 = charSequence2.length() > 0 ? charSequence2 : null;
        if (charSequence3 != null && charSequence3.length() != 0) {
            z19 = false;
        }
        if (z19) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (p18 != null) {
                u24.o.a(p18, java.lang.Integer.valueOf(com.tencent.mm.R.dimen.aii), java.lang.Integer.valueOf(com.tencent.mm.R.dimen.aii));
            }
        } else {
            if (textView != null) {
                textView.setVisibility(0);
                com.tencent.mm.ui.kk.f(textView, 0);
                textView.setText(charSequence3);
            }
            if (p18 != null) {
                u24.o.a(p18, java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479556yd), java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f479556yd));
            }
        }
        holder.itemView.setOnClickListener(new t24.s(holder, str, str2, i17, this, x1Var));
    }

    @Override // a24.g
    public java.lang.Integer n(in5.s0 holder, a24.i baseItem, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(baseItem, "baseItem");
        return java.lang.Integer.valueOf(com.tencent.mm.R.layout.f489295c11);
    }

    @Override // a24.g
    public boolean o() {
        return false;
    }
}
