package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.widget.TopStoryTipsPopupWindow f175083d;

    public t1(com.tencent.mm.plugin.topstory.ui.widget.TopStoryTipsPopupWindow topStoryTipsPopupWindow) {
        this.f175083d = topStoryTipsPopupWindow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f175083d.dismiss();
    }
}
