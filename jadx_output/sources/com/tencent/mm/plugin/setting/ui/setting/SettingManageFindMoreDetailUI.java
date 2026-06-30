package com.tencent.mm.plugin.setting.ui.setting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingManageFindMoreDetailUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "com/tencent/mm/plugin/setting/ui/setting/x3", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class SettingManageFindMoreDetailUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: x, reason: collision with root package name */
    public static final com.tencent.mm.plugin.setting.ui.setting.x3 f160220x = new com.tencent.mm.plugin.setting.ui.setting.x3(null);

    /* renamed from: d, reason: collision with root package name */
    public boolean f160221d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f160222e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f160223f;

    /* renamed from: g, reason: collision with root package name */
    public long f160224g;

    /* renamed from: h, reason: collision with root package name */
    public long f160225h;

    /* renamed from: i, reason: collision with root package name */
    public long f160226i;

    /* renamed from: q, reason: collision with root package name */
    public int f160231q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f160232r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f160234t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f160235u;

    /* renamed from: w, reason: collision with root package name */
    public int f160237w;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f160227m = new java.util.LinkedHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f160228n = new java.util.LinkedHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f160229o = new java.util.LinkedHashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f160230p = new java.util.LinkedHashMap();

    /* renamed from: s, reason: collision with root package name */
    public final boolean f160233s = true;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f160236v = "";

    public static final void U6(com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI settingManageFindMoreDetailUI, boolean z17) {
        settingManageFindMoreDetailUI.getClass();
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a17 = zVar.a(settingManageFindMoreDetailUI).a(w24.k.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        boolean z18 = !z17;
        ((w24.k) a17).U6("ITEM_KEY_IS_NOTIFY", z18);
        androidx.lifecycle.c1 a18 = zVar.a(settingManageFindMoreDetailUI).a(w24.k.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        ((w24.k) a18).U6("ITEM_KEY_IS_SHOW_NEARBY", z18);
    }

    public final w24.w V6() {
        w24.w wVar = new w24.w("ITEM_KEY_IS_NOTIFY", this.f160222e);
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ish);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        wVar.f442647i = string;
        wVar.c();
        wVar.f442646h = new com.tencent.mm.plugin.setting.ui.setting.y3(this);
        wVar.c();
        return wVar;
    }

    public final w24.w W6() {
        w24.w wVar = new w24.w("ITEM_KEY_IS_SHOW", this.f160221d);
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.isg);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        wVar.f442647i = string;
        wVar.c();
        wVar.f442646h = new com.tencent.mm.plugin.setting.ui.setting.z3(this);
        wVar.c();
        return wVar;
    }

    public final void X6(boolean z17, int i17, java.lang.String str, java.lang.String str2, wd0.o1 o1Var, java.lang.String str3) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = getContext().getResources().getString(com.tencent.mm.R.string.f492984ik0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = getContext().getResources().getString(com.tencent.mm.R.string.ijz);
        }
        v24.o0.g(this, str, str2, str3, new com.tencent.mm.plugin.setting.ui.setting.p4(z17, i17, this, o1Var));
    }

    public final void Y6(boolean z17) {
        ((ty4.n) ((uy4.v) i95.n0.c(uy4.v.class))).Ni("labs_browse", z17);
        this.f160225h = z17 ? this.f160225h & (-67108865) : this.f160225h | 67108864;
        this.f160228n.put(56, java.lang.Integer.valueOf(z17 ? 1 : 0));
        if (z17) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4.N("com.tencent.xin.newLife.internalKV." + new kk.v(gm0.j1.b().h()), 2, null).A("newlife_jump_top_story_show_time", 0);
    }

    public final void Z6(boolean z17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switch ext change : open = " + z17 + " item value = " + j17);
        this.f160226i = z17 ? this.f160226i & (~j17) : this.f160226i | j17;
        this.f160227m.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(z17 ? 0L : j17));
    }

    public final void a7(boolean z17, long j17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switch ext change : open = " + z17 + " item value = " + j17 + " functionId = " + i17);
        this.f160225h = z17 ? (~j17) & this.f160225h : j17 | this.f160225h;
        this.f160228n.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }

    public final void b7(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switch plugin flag, open %s, flag %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        this.f160231q = !z17 ? this.f160231q | i17 : this.f160231q & (~i17);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        android.content.Intent intent = new android.content.Intent(getIntent());
        intent.putExtra("is_show_in_findmore", this.f160221d);
        intent.putExtra("is_new_notify", this.f160222e);
        intent.putExtra("is_show_nearby", this.f160223f);
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.clm;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity
    public boolean isContentAtTop() {
        return !((com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.gvd)).canScrollVertically(-1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0341, code lost:
    
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0394  */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "oplog extstatus:" + this.f160225h + ",pluginFlag:" + this.f160231q + ",discoveryCtrlFlag:" + this.f160226i);
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(this.f160225h));
        gm0.j1.u().c().w(34, java.lang.Integer.valueOf(this.f160231q));
        gm0.j1.u().c().w(147458, java.lang.Long.valueOf(this.f160226i));
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f160228n;
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Number) entry.getValue()).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = intValue;
            p53Var.f382762e = intValue2;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switch  " + intValue + ' ' + intValue2);
        }
        linkedHashMap.clear();
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) this.f160227m;
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            long longValue = ((java.lang.Number) entry2.getKey()).longValue();
            long longValue2 = ((java.lang.Number) entry2.getValue()).longValue();
            r45.io4 io4Var = new r45.io4();
            io4Var.f377216d = longValue;
            io4Var.f377217e = longValue2;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(75, io4Var));
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switchDiscoveryState switch " + longValue + ' ' + longValue2);
        }
        linkedHashMap2.clear();
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", this.f160231q, "", 0, "", 0));
        java.util.LinkedHashMap linkedHashMap3 = (java.util.LinkedHashMap) this.f160230p;
        java.util.Iterator it = linkedHashMap3.keySet().iterator();
        while (it.hasNext()) {
            int intValue3 = ((java.lang.Number) it.next()).intValue();
            java.util.Map map = this.f160229o;
            if (map.containsKey(java.lang.Integer.valueOf(intValue3))) {
                if (!kotlin.jvm.internal.o.b(((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(intValue3)), linkedHashMap3.get(java.lang.Integer.valueOf(intValue3)))) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15185, java.lang.Integer.valueOf(intValue3), linkedHashMap3.get(java.lang.Integer.valueOf(intValue3)), 1);
                    if (intValue3 == 0) {
                        java.lang.Integer num = (java.lang.Integer) linkedHashMap3.get(java.lang.Integer.valueOf(intValue3));
                        if (num != null && num.intValue() == 0) {
                            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_ENTRY_SWITCH_INT, -1);
                        } else {
                            java.lang.Integer num2 = (java.lang.Integer) linkedHashMap3.get(java.lang.Integer.valueOf(intValue3));
                            if (num2 != null && num2.intValue() == 1) {
                                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_ENTRY_SWITCH_INT, 1);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(w24.k.class);
        set.add(com.tencent.mm.plugin.setting.ui.setting.a.class);
        set.add(n14.j.class);
    }
}
