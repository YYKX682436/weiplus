package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class r70 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f114108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f114109e;

    public r70(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var, kotlin.jvm.internal.f0 f0Var) {
        this.f114108d = v70Var;
        this.f114109e = f0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f114108d.f114692z;
        kotlin.jvm.internal.f0 f0Var = this.f114109e;
        int i17 = f0Var.f310116d + 1;
        f0Var.f310116d = i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$startMatch$1", "onTimerExpired", "()Z", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$startMatch$1", "onTimerExpired", "()Z", "Undefined", "smoothScrollToPosition", "(I)V");
        return true;
    }
}
