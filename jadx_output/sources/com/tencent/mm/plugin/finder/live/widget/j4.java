package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class j4 extends com.tencent.mm.plugin.finder.live.widget.e80 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q4 f118723d;

    public j4(com.tencent.mm.plugin.finder.live.widget.q4 q4Var) {
        this.f118723d = q4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        android.view.View findViewById = this.f118723d.f119491h.findViewById(com.tencent.mm.R.id.f487556oz4);
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget$genPlayerIfNeeded$2", "onVideoFirstFrameDraw", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget$genPlayerIfNeeded$2", "onVideoFirstFrameDraw", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
