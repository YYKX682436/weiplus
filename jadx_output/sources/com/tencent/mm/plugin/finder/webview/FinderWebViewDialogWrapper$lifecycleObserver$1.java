package com.tencent.mm.plugin.finder.webview;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007¨\u0006\u0007"}, d2 = {"com/tencent/mm/plugin/finder/webview/FinderWebViewDialogWrapper$lifecycleObserver$1", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onResume", "onPause", "onStop", "onDestroy", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderWebViewDialogWrapper$lifecycleObserver$1 implements androidx.lifecycle.x {
    public FinderWebViewDialogWrapper$lifecycleObserver$1(com.tencent.mm.plugin.finder.webview.u uVar) {
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void onDestroy() {
        com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "OnLifecycleEvent onDestroy");
        throw null;
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public final void onPause() {
        com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "OnLifecycleEvent onPause");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public final void onResume() {
        com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "OnLifecycleEvent onResume");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
    public final void onStop() {
        com.tencent.mars.xlog.Log.i("Finder.AdCenterDialog", "OnLifecycleEvent onStop");
    }
}
