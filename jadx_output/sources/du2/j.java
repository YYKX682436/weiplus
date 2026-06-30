package du2;

@j95.b
/* loaded from: classes2.dex */
public final class j extends i95.w implements zy2.ob {

    /* renamed from: d, reason: collision with root package name */
    public static final du2.i f243476d = new du2.i(null);

    public final boolean wi(cw2.wa waVar, java.lang.String str) {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.plugin.finder.storage.FeedData feedData2;
        java.lang.Integer num = null;
        java.lang.Integer valueOf = (waVar == null || (feedData2 = waVar.f224099f) == null) ? null : java.lang.Integer.valueOf(feedData2.getMediaType());
        du2.i iVar = f243476d;
        if (valueOf != null && valueOf.intValue() == 4) {
            return iVar.b();
        }
        if (valueOf != null && valueOf.intValue() == 9) {
            return iVar.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaType = ");
        if (waVar != null && (feedData = waVar.f224099f) != null) {
            num = java.lang.Integer.valueOf(feedData.getMediaType());
        }
        sb6.append(num);
        sb6.append(", source = ");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerController", sb6.toString());
        return false;
    }
}
