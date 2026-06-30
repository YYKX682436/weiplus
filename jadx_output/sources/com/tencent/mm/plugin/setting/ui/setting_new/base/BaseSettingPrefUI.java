package com.tencent.mm.plugin.setting.ui.setting_new.base;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingPrefUI;", "Lcom/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingUI;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class BaseSettingPrefUI extends com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f161837h = 0;

    /* renamed from: e, reason: collision with root package name */
    public a24.i f161838e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f161839f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f161840g;

    public java.lang.String U6() {
        return "";
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eif;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f161840g = getIntent().getStringArrayListExtra("key_highlight_item");
        hideActionbarLine();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.ui.component.UIComponent uIComponent : getUiComponents()) {
            if (uIComponent instanceof a24.i) {
                arrayList.add(uIComponent);
            }
        }
        u24.m mVar = u24.m.f424129a;
        a24.i iVar = this.f161838e;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        jz5.l d17 = mVar.d(iVar, arrayList);
        j75.f stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.B3(new r24.e(d17));
        }
        this.f161839f = getIntent().getStringExtra("key_config_target_item");
        setMMTitle(U6());
        setBackBtn(new a24.m(this));
        j75.f stateCenter2 = getStateCenter();
        if (stateCenter2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.tencent.mm.ui.component.UIComponent uIComponent2 : getUiComponents()) {
            if (uIComponent2 instanceof a24.i) {
                arrayList2.add(uIComponent2);
            }
        }
        a24.i iVar2 = this.f161838e;
        if (iVar2 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        stateCenter2.B3(new r24.e(mVar.d(iVar2, arrayList2)));
        j75.f stateCenter3 = getStateCenter();
        if (stateCenter3 != null) {
            stateCenter3.L2(this, new a24.p(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f161839f = intent != null ? intent.getStringExtra("key_config_target_item") : null;
        j75.f stateCenter = getStateCenter();
        if (stateCenter == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.ui.component.UIComponent uIComponent : getUiComponents()) {
            if (uIComponent instanceof a24.i) {
                arrayList.add(uIComponent);
            }
        }
        u24.m mVar = u24.m.f424129a;
        a24.i iVar = this.f161838e;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        stateCenter.B3(new r24.e(mVar.d(iVar, arrayList)));
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        jz5.l c17;
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.setting.ui.setting_new.uic.e.class);
        set.add(com.tencent.mm.plugin.setting.ui.setting_new.uic.d.class);
        java.lang.String stringExtra = getIntent().getStringExtra("key_config_item");
        u24.m mVar = u24.m.f424129a;
        if (stringExtra == null || (c17 = mVar.c(stringExtra, this)) == null) {
            c17 = mVar.c("SettingGroup_Main", this);
        }
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseSettingPrefUI", "superImportUIComponents: node is null");
            return;
        }
        java.util.Iterator it = ((java.lang.Iterable) c17.f302834e).iterator();
        while (it.hasNext()) {
            set.add(((a24.i) it.next()).getClass());
        }
        this.f161838e = (a24.i) c17.f302833d;
    }
}
