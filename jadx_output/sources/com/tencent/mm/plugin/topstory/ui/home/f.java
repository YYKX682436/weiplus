package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.SwipeBackLayout f174964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.g f174965e;

    public f(com.tencent.mm.plugin.topstory.ui.home.g gVar, com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout) {
        this.f174965e = gVar;
        this.f174964d = swipeBackLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = this.f174964d;
        swipeBackLayout.setNeedRequestActivityTranslucent(true);
        swipeBackLayout.d(false);
        db5.f.b(this.f174965e.f174971a.getContext());
    }
}
