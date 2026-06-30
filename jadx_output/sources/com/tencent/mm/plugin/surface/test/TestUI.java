package com.tencent.mm.plugin.surface.test;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/surface/test/TestUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-surface-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class TestUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f172446d;

    static {
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        java.util.List<com.tencent.mm.plugin.appbrand.jsapi.k0> i17 = kz5.c0.i(new mg4.d(), new com.tencent.mm.plugin.appbrand.jsapi.eb(), ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Vc(251));
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i17, 10));
        for (com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var : i17) {
            arrayList.add(new jz5.l(k0Var.k(), k0Var));
        }
        kz5.c1.t(kz5.c1.q(arrayList));
    }

    public TestUI() {
        jz5.h.b(new zg4.a(this));
        this.f172446d = new java.util.LinkedList();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cxg;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("Surface Canvas Test");
        setBackBtn(new zg4.b(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        java.util.Iterator it = this.f172446d.iterator();
        while (it.hasNext()) {
            ((hq0.e0) it.next()).f();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        java.util.Iterator it = this.f172446d.iterator();
        while (it.hasNext()) {
            ((hq0.e0) it.next()).j();
        }
    }
}
