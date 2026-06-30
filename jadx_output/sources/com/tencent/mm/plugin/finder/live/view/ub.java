package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public interface ub {
    com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController getController(java.lang.Class cls);

    qo0.c getLiveStatus();

    com.tencent.mm.plugin.finder.live.plugin.l getPlugin(java.lang.Class cls);

    void onPluginAlphaModify(float f17, float f18);

    void onScreenClear(boolean z17);

    dk2.xf provideFinderLiveAssistant();

    android.view.ViewGroup rootView();
}
