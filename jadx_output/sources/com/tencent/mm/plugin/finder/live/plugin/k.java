package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f113175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f113176f;

    public k(java.lang.String str, boolean z17, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        this.f113174d = str;
        this.f113175e = z17;
        this.f113176f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("notify2ChangeCommentHeight", "[notify2CHangeCommentHeight] tag = " + this.f113174d + ", post null");
        boolean z17 = this.f113175e;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f113176f;
        if (z17) {
            ((mm2.x4) lVar.P0(mm2.x4.class)).B.setValue(null);
        } else {
            ((mm2.x4) lVar.P0(mm2.x4.class)).B.postValue(null);
        }
    }
}
