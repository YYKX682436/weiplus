package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameRegionSelectUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f140958d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.p5 f140959e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f140960f;

    public static void V6(com.tencent.mm.plugin.game.ui.GameRegionSelectUI gameRegionSelectUI) {
        com.tencent.mm.plugin.game.ui.p5 p5Var = gameRegionSelectUI.f140959e;
        if (p5Var != null) {
            gameRegionSelectUI.getSharedPreferences("game_center_pref", 0).edit().putString("game_region_code", p5Var.f141715d).commit();
            r53.b.f392640a.f392648b = true;
            com.tencent.mm.plugin.game.commlib.j.a().b(true, 7);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.f492228fp3);
        setBackBtn(new com.tencent.mm.plugin.game.ui.q5(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f492227fp2), new com.tencent.mm.plugin.game.ui.t5(this), null, com.tencent.mm.ui.fb.GREEN);
        ((com.tencent.mm.ui.base.preference.h0) this.f140958d).t();
        this.f140960f = r53.b.f392640a.a();
        com.tencent.mm.plugin.game.ui.p5 g17 = com.tencent.mm.plugin.game.model.f.g(this);
        if (g17 != null) {
            g17.f141716e = true;
        }
        for (com.tencent.mm.plugin.game.ui.p5 p5Var : ((java.util.LinkedHashMap) this.f140960f).values()) {
            if (p5Var != null) {
                com.tencent.mm.plugin.game.ui.GameRegionPreference gameRegionPreference = new com.tencent.mm.plugin.game.ui.GameRegionPreference(this, null);
                if (com.tencent.mm.sdk.platformtools.t8.K0(p5Var.f141715d)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GameRegionPreference", "setData region error");
                } else {
                    gameRegionPreference.L = p5Var;
                    gameRegionPreference.C(p5Var.f141715d);
                }
                if (p5Var.f141717f) {
                    ((com.tencent.mm.ui.base.preference.h0) this.f140958d).d(gameRegionPreference, 0);
                } else {
                    ((com.tencent.mm.ui.base.preference.h0) this.f140958d).d(gameRegionPreference, -1);
                }
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f140958d).d(new com.tencent.mm.ui.base.preference.PreferenceCategory(this), -1);
        ((com.tencent.mm.ui.base.preference.h0) this.f140958d).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f140958d = getPreferenceScreen();
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        r53.d dVar = r53.b.f392640a;
        synchronized (dVar) {
            java.util.Map map = dVar.f392647a;
            if (map != null) {
                java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.game.ui.p5) it.next()).f141716e = false;
                }
            }
        }
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.plugin.game.ui.p5 p5Var;
        if (!(preference instanceof com.tencent.mm.plugin.game.ui.GameRegionPreference) || (p5Var = ((com.tencent.mm.plugin.game.ui.GameRegionPreference) preference).L) == null) {
            return false;
        }
        this.f140959e = p5Var;
        java.util.Iterator it = ((java.util.LinkedHashMap) this.f140960f).values().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.game.ui.p5) it.next()).f141716e = false;
        }
        p5Var.f141716e = true;
        ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        return true;
    }
}
