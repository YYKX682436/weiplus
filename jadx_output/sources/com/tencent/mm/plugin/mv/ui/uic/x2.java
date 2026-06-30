package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes8.dex */
public final class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151524e;

    public x2(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC, int i17) {
        this.f151523d = musicMvMainUIC;
        this.f151524e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151523d;
        com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "post smooth scroll");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = musicMvMainUIC.f150976f;
        if (wxRecyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(this.f151524e));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC$scrollMvToPosition$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            wxRecyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC$scrollMvToPosition$1$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
