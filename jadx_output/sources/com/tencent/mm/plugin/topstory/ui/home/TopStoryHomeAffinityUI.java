package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class TopStoryHomeAffinityUI extends com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f174886e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f174887f = new com.tencent.mm.plugin.topstory.ui.home.e(this);

    @Override // com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(super.importUIComponents());
        hashSet.add(com.tencent.mm.plugin.topstory.ui.home.d1.class);
        return hashSet;
    }

    @Override // com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setTaskDescription(new android.app.ActivityManager.TaskDescription(getContext().getString(com.tencent.mm.R.string.k1i), m95.a.a(getContext().getResources(), com.tencent.mm.R.raw.top_story_icon, 3.0f), 0));
        if (getF65848t()) {
            getSwipeBackLayout().setAutoResetToNoTranslucent(false);
            getSwipeBackLayout().setDragListener(new com.tencent.mm.plugin.topstory.ui.home.g(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            setTheme(com.tencent.mm.R.style.f494616rq);
        }
    }

    @Override // com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f174886e.removeCallbacks(this.f174887f);
    }

    @Override // com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f174886e.removeCallbacks(this.f174887f);
    }

    @Override // com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f174886e;
        java.lang.Runnable runnable = this.f174887f;
        n3Var.removeCallbacks(runnable);
        o11.g gVar = wm4.u.f447309a;
        n3Var.postDelayed(runnable, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_topstory_selfkill_delay_multitask, 180000L));
    }

    @Override // com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
    }
}
