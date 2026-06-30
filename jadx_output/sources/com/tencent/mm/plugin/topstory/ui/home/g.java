package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class g implements al5.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI f174971a;

    public g(com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI topStoryHomeAffinityUI) {
        this.f174971a = topStoryHomeAffinityUI;
    }

    @Override // al5.e3
    public void a(int i17) {
        if (i17 == 1) {
            com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI topStoryHomeAffinityUI = this.f174971a;
            db5.f.c(topStoryHomeAffinityUI.getContext(), null);
            topStoryHomeAffinityUI.getSwipeBackLayout().d(true);
        }
    }

    @Override // al5.e3
    public void b(int i17, int i18, int i19, int i27, float f17) {
    }

    @Override // al5.e3
    public void c() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = this.f174971a.getSwipeBackLayout();
        swipeBackLayout.post(new com.tencent.mm.plugin.topstory.ui.home.f(this, swipeBackLayout));
    }
}
