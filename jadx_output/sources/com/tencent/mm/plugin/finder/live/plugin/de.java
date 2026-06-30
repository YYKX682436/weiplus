package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class de implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112274d;

    public de(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f112274d = mgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f112274d.D.notifyDataSetChanged();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "e:" + e17.getMessage());
        }
    }
}
