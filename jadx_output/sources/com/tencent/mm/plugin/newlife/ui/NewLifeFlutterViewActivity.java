package com.tencent.mm.plugin.newlife.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/newlife/ui/NewLifeFlutterViewActivity;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "<init>", "()V", "plugin-newlife_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class NewLifeFlutterViewActivity extends com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f152354u = "MicroMsg.NewLifeFlutterViewActivity@" + hashCode();

    /* renamed from: v, reason: collision with root package name */
    public final pn3.a f152355v = new pn3.a(this);

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        w03.f fVar;
        super.onCreate(bundle);
        if (com.tencent.mars.xlog.Log.isDebug()) {
            na5.a activityAnimLifecycle = getActivityAnimLifecycle();
            w03.h hVar = activityAnimLifecycle instanceof w03.h ? (w03.h) activityAnimLifecycle : null;
            if (hVar == null || (fVar = (w03.f) ((jz5.n) hVar.f441883f).getValue()) == null) {
                return;
            }
            fVar.a(this.f152355v);
        }
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        w03.f fVar;
        super.onDestroy();
        if (com.tencent.mars.xlog.Log.isDebug()) {
            na5.a activityAnimLifecycle = getActivityAnimLifecycle();
            w03.h hVar = activityAnimLifecycle instanceof w03.h ? (w03.h) activityAnimLifecycle : null;
            if (hVar == null || (fVar = (w03.f) ((jz5.n) hVar.f441883f).getValue()) == null) {
                return;
            }
            pn3.a observer = this.f152355v;
            kotlin.jvm.internal.o.g(observer, "observer");
            w03.h hVar2 = fVar.f441880a;
            na5.b a17 = w03.h.a(hVar2, observer, false);
            if (a17 != null) {
                ((java.util.ArrayList) hVar2.f335994d).remove(a17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
