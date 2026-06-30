package com.tencent.mm.plugin.finder.nearby.live;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0010\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0014\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010(¨\u0006/"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/NearbyLiveItemConvertFactory;", "Lin5/s;", "Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/y2;", "createBigCardLiveConvert", "Lcom/tencent/mm/plugin/finder/convert/z2;", "createFinderEmptyConvert", "Lcom/tencent/mm/plugin/finder/convert/i8;", "createFinderFeedEmptyConvert", "Lcom/tencent/mm/plugin/finder/convert/ek;", "createFinderFeedSameCityLiveConvert", "Lep2/k;", "createNearbyFinderSquareLiveFeedConvert", "Lep2/e;", "createRelatedLiveFeedConvert", "", "type", "Lin5/r;", "getItemConvert", "Lcom/tencent/mm/ui/MMActivity;", "baseContext", "Lcom/tencent/mm/ui/MMActivity;", "Lcp2/c;", "Lso2/j5;", "presenter", "Lcp2/c;", "", "isForceNightMode", "Z", "isLocalCityPage", "commentScene", "I", "", "aspectRatio", "F", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "bottomExtraInfo", "getBottomExtraInfo", "()I", "setBottomExtraInfo", "(I)V", "getScreenWidth", "screenWidth", "<init>", "(Lcom/tencent/mm/ui/MMActivity;Lcp2/c;ZZI)V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NearbyLiveItemConvertFactory implements in5.s {
    private float aspectRatio;
    private final com.tencent.mm.ui.MMActivity baseContext;
    private int bottomExtraInfo;
    private final int commentScene;
    private final boolean isForceNightMode;
    private final boolean isLocalCityPage;
    private final cp2.c presenter;

    public NearbyLiveItemConvertFactory(com.tencent.mm.ui.MMActivity baseContext, cp2.c presenter, boolean z17, boolean z18, int i17) {
        kotlin.jvm.internal.o.g(baseContext, "baseContext");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.baseContext = baseContext;
        this.presenter = presenter;
        this.isForceNightMode = z17;
        this.isLocalCityPage = z18;
        this.commentScene = i17;
        this.aspectRatio = 1.7776f;
    }

    private final com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2 createBigCardLiveConvert() {
        new java.util.ArrayList();
        return new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y2(true, getScreenWidth() - (com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 0) * 2), 1.0f, new cp2.t(this), new cp2.s(this));
    }

    private final com.tencent.mm.plugin.finder.convert.z2 createFinderEmptyConvert() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.sdk.platformtools.Log.c("RecyclerViewAdapterEx", "type invalid", new java.lang.Object[0]);
        return new com.tencent.mm.plugin.finder.convert.z2();
    }

    private final com.tencent.mm.plugin.finder.convert.i8 createFinderFeedEmptyConvert() {
        return new com.tencent.mm.plugin.finder.convert.i8(new cp2.u(this), new cp2.v(this), null, this.isForceNightMode, 4, null);
    }

    private final com.tencent.mm.plugin.finder.convert.ek createFinderFeedSameCityLiveConvert() {
        return new com.tencent.mm.plugin.finder.convert.ek(new cp2.w(this));
    }

    private final ep2.k createNearbyFinderSquareLiveFeedConvert() {
        int i17 = this.commentScene;
        dp2.a aVar = dp2.a.f242183a;
        return new ep2.k(i17, 3 * com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), this.isForceNightMode, this.isLocalCityPage, this.baseContext, this.aspectRatio, this.bottomExtraInfo);
    }

    private final ep2.e createRelatedLiveFeedConvert() {
        return new ep2.e(true, getScreenWidth(), this.aspectRatio, new cp2.x(this));
    }

    private final int getScreenWidth() {
        return com.tencent.mm.ui.bl.b(this.baseContext).x;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final int getBottomExtraInfo() {
        return this.bottomExtraInfo;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        return type != -10 ? type != -5 ? type != -3 ? type != -1 ? type != 4 ? type != 6 ? type != 9 ? type != 2021 ? type != 2022 ? createFinderEmptyConvert() : createBigCardLiveConvert() : createRelatedLiveFeedConvert() : createNearbyFinderSquareLiveFeedConvert() : new com.tencent.mm.plugin.finder.convert.cr(this.isForceNightMode) : new com.tencent.mm.plugin.finder.convert.br(this.isForceNightMode) : createFinderFeedEmptyConvert() : new com.tencent.mm.plugin.finder.convert.ik() : new com.tencent.mm.plugin.finder.convert.xh() : createFinderFeedSameCityLiveConvert();
    }

    public final void setAspectRatio(float f17) {
        this.aspectRatio = f17;
    }

    public final void setBottomExtraInfo(int i17) {
        this.bottomExtraInfo = i17;
    }
}
