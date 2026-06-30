package v40;

@j95.b
/* loaded from: classes10.dex */
public final class u extends i95.w implements c50.t0 {

    /* renamed from: d, reason: collision with root package name */
    public long f433195d;

    /* renamed from: e, reason: collision with root package name */
    public long f433196e;

    public java.util.Map wi() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Finder", kz5.c0.i(com.tencent.mm.plugin.finder.ui.FinderHomeUI.class, com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI.class));
        hashMap.put("FinderNearby", kz5.b0.c(com.tencent.mm.plugin.finder.nearby.NearbyUI.class));
        hashMap.put("FinderShare", kz5.b0.c(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI.class));
        hashMap.put("FinderLive", kz5.b0.c(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI.class));
        hashMap.put("FinderLiveAnchor", kz5.b0.c(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorWithoutAffinityUI.class));
        return hashMap;
    }
}
