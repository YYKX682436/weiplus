package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public abstract class MMLiveFinderUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: t, reason: collision with root package name */
    public long f128817t;

    /* renamed from: u, reason: collision with root package name */
    public long f128818u;

    public boolean c7() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (c7()) {
            this.f128818u = c01.id.c();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Di(getClass().getSimpleName(), 2, kz5.p0.f313996d);
        this.f128812n = true;
        if (c7()) {
            this.f128817t = c01.id.c();
            com.tencent.mars.xlog.Log.i("Finder.MMLiveFinderUI", "onCreate");
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (c7()) {
            com.tencent.mars.xlog.Log.i("Finder.MMLiveFinderUI", "onDestroy, stayTime:" + (c01.id.c() - this.f128817t) + "ms");
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        c61.p2 p2Var = (c61.p2) ((c61.yb) i95.n0.c(c61.yb.class));
        p2Var.getClass();
        java.util.Set set = p2Var.f39219i;
        set.remove(this);
        if (set.isEmpty()) {
            com.tencent.mm.app.k4 k4Var = com.tencent.mm.app.MMCrashReportContents.H;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            k4Var.e(bool);
            com.tencent.mm.app.MMBugReportContents.f53230k.f53732v.e(bool);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c61.p2 p2Var = (c61.p2) ((c61.yb) i95.n0.c(c61.yb.class));
        p2Var.getClass();
        java.util.Set set = p2Var.f39219i;
        if (set.contains(this)) {
            return;
        }
        set.add(this);
        com.tencent.mm.app.k4 k4Var = com.tencent.mm.app.MMCrashReportContents.H;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        k4Var.e(bool);
        com.tencent.mm.app.MMBugReportContents.f53230k.f53732v.e(bool);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        or2.a aVar = or2.a.f347607a;
        long j17 = or2.a.f347610d;
        int i17 = or2.a.f347613g + 1;
        or2.a.f347613g = i17;
        if (i17 >= 1) {
            aVar.c(true, false, j17, false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        or2.a.f347607a.a();
    }
}
