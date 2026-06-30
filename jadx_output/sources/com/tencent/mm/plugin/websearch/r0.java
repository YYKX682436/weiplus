package com.tencent.mm.plugin.websearch;

/* loaded from: classes11.dex */
public final class r0 implements ls5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.FlutterSearchFinderLivePlayerPlugin f181609a;

    public r0(com.tencent.mm.plugin.websearch.FlutterSearchFinderLivePlayerPlugin flutterSearchFinderLivePlayerPlugin) {
        this.f181609a = flutterSearchFinderLivePlayerPlugin;
    }

    @Override // ls5.l
    public boolean a() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f181609a.f181405f;
        return (mMActivity == null || mMActivity.isStopped()) ? false : true;
    }
}
