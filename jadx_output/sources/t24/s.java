package t24;

/* loaded from: classes.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f415331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f415334g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t24.u f415335h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wd0.x1 f415336i;

    public s(in5.s0 s0Var, java.lang.String str, java.lang.String str2, int i17, t24.u uVar, wd0.x1 x1Var) {
        this.f415331d = s0Var;
        this.f415332e = str;
        this.f415333f = str2;
        this.f415334g = i17;
        this.f415335h = uVar;
        this.f415336i = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Intent intent;
        android.content.Intent intent2;
        android.content.Intent intent3;
        android.content.Intent intent4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/type/converts/SettingSearchConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f415331d;
        android.content.Context context = s0Var.f293121e;
        com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI baseSettingUI = context instanceof com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI ? (com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI) context : null;
        if (baseSettingUI != null && (intent4 = baseSettingUI.getIntent()) != null) {
            intent4.putExtra("cell_source_type", 1);
        }
        android.content.Context context2 = s0Var.f293121e;
        com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI baseSettingUI2 = context2 instanceof com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI ? (com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI) context2 : null;
        if (baseSettingUI2 != null && (intent3 = baseSettingUI2.getIntent()) != null) {
            intent3.putExtra("search_word", this.f415332e);
        }
        com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI baseSettingUI3 = context2 instanceof com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI ? (com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI) context2 : null;
        if (baseSettingUI3 != null && (intent2 = baseSettingUI3.getIntent()) != null) {
            intent2.putExtra("search_query_id", this.f415333f);
        }
        com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI baseSettingUI4 = context2 instanceof com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI ? (com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI) context2 : null;
        if (baseSettingUI4 != null && (intent = baseSettingUI4.getIntent()) != null) {
            intent.putExtra("search_index", this.f415334g + 1);
        }
        ((vd0.l3) ((wd0.y1) ((jz5.n) this.f415335h.f415340g).getValue())).Ui(context2 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context2 : null, this.f415336i);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/type/converts/SettingSearchConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
