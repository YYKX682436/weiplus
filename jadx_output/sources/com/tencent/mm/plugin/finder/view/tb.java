package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class tb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderHorizontalViewPager f133121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f133122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f133123f;

    public tb(com.tencent.mm.plugin.finder.view.FinderHorizontalViewPager finderHorizontalViewPager, int i17, boolean z17) {
        this.f133121d = finderHorizontalViewPager;
        this.f133122e = i17;
        this.f133123f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.sb sbVar = this.f133121d.pageChangeListener;
        if (sbVar != null) {
            sbVar.a(this.f133122e, true, this.f133123f);
        }
    }
}
