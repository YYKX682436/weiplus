package com.tencent.mm.plugin.topstory.ui.home;

@ul5.d(0)
/* loaded from: classes8.dex */
public class TopStoryHomeUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements ym4.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.topstory.ui.home.j f174888d = new com.tencent.mm.plugin.topstory.ui.home.j(this, true);

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        int i17 = !getController().K() ? 0 : 100;
        if (i17 == 0) {
            super.finish();
        } else {
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.topstory.ui.home.h(this), i17);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        this.f174888d.getClass();
        return com.tencent.mm.R.layout.d1w;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            hashSet.addAll(importUIComponents);
        }
        hashSet.add(com.tencent.mm.plugin.topstory.ui.home.d1.class);
        hashSet.add(com.tencent.mm.plugin.topstory.ui.home.y1.class);
        hashSet.add(zm4.d.class);
        hashSet.add(com.tencent.mm.plugin.topstory.ui.home.d.class);
        return hashSet;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean isCallSuperOnSaveInstanceState() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f174888d;
        jVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onActivityResult requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == 1 && i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("key_video_play_info");
            java.lang.String stringExtra2 = intent.getStringExtra("key_search_id");
            com.tencent.mm.plugin.topstory.ui.webview.l lVar = jVar.f174993m;
            lVar.getClass();
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "onVideoPlayInfo %s %s", stringExtra2, stringExtra);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("videoPlayInfo", stringExtra);
                jSONObject.put("searchId", stringExtra2);
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.topstory.ui.webview.z(lVar, jSONObject));
                return;
            } catch (java.lang.Exception unused) {
                return;
            }
        }
        if (i17 == 16 && i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "notifyEnterContentByRedDot");
            if (jVar.E) {
                if (pm4.w.n(jVar.h() != null ? jVar.h().f447318b : 0)) {
                    ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ri(jVar.F, "onBackFromTransient", jVar.Q);
                    return;
                }
            }
            com.tencent.mm.plugin.topstory.ui.webview.l lVar2 = jVar.f174993m;
            org.json.JSONObject jSONObject2 = jVar.Q;
            java.lang.String jSONObject3 = jSONObject2 == null ? "" : jSONObject2.toString();
            lVar2.getClass();
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.topstory.ui.webview.j0(lVar2, jSONObject3));
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z17;
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f174888d;
        if (jVar.f175004v) {
            jVar.l();
            z17 = false;
        } else {
            ((en3.b0) ((ra0.w) i95.n0.c(ra0.w.class))).Ai("OnBackBtnClick");
            z17 = true;
        }
        if (z17) {
            super.onBackPressed();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onCancel() {
        super.onCancel();
        this.f174888d.onCancel();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUI", "use TopStoryHomeUI");
        sh0.e eVar = (sh0.e) i95.n0.c(sh0.e.class);
        com.tencent.xweb.f1 f1Var = com.tencent.xweb.WebView.f220189m;
        com.tencent.xweb.f1 f1Var2 = com.tencent.xweb.f1.WV_KIND_PINUS;
        com.tencent.mm.plugin.topstory.ui.home.i iVar = new com.tencent.mm.plugin.topstory.ui.home.i(this);
        ((th0.a0) eVar).getClass();
        com.tencent.mm.xwebutil.y0.b(f1Var2, iVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUI", "Start To Load WebView %s", f1Var2);
        this.f174888d.s(bundle);
        ((lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class))).f318209e = true;
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.TopStoryHomeUI)).Rj(this, iy1.a.TopStories);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f174888d.t();
        ((lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class))).f318209e = false;
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onDrag() {
        super.onDrag();
        this.f174888d.onDrag();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        boolean z17;
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f174888d;
        if (i17 == 4) {
            jVar.r();
            z17 = true;
        } else {
            jVar.getClass();
            z17 = false;
        }
        if (z17) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        this.f174888d.w(intent);
        super.onNewIntent(intent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        this.f174888d.x();
        super.onPause();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f174888d.y();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f174888d.z(bundle);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        lf0.f0 f0Var = (lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class));
        f0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryMultiTaskService", "on topStory foreground " + this);
        java.util.Set set = f0Var.f318208d;
        if (set.contains(this)) {
            return;
        }
        set.add(this);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        lf0.f0 f0Var = (lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class));
        f0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryMultiTaskService", "on topStory background " + this);
        f0Var.f318208d.remove(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
        this.f174888d.onSwipeBack();
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(m82.p.class);
        hashSet.add(en4.j.class);
        hashSet.add(com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC.class);
        hashSet.add(en4.f.class);
        hashSet.add(en4.a.class);
    }
}
