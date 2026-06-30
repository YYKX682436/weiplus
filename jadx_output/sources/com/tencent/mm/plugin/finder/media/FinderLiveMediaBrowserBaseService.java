package com.tencent.mm.plugin.finder.media;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/media/FinderLiveMediaBrowserBaseService;", "Landroidx/media/MediaBrowserServiceCompat;", "Lsn2/g;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class FinderLiveMediaBrowserBaseService extends androidx.media.MediaBrowserServiceCompat implements sn2.g {
    @Override // androidx.media.MediaBrowserServiceCompat
    public c4.l b(java.lang.String clientPackageName, int i17, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(clientPackageName, "clientPackageName");
        com.tencent.mars.xlog.Log.i(e(), "onGetRoot: who is trying to connect me: " + clientPackageName + ": " + i17);
        java.lang.String e17 = e();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGetRoot: connection hint: ");
        sb6.append(bundle);
        com.tencent.mars.xlog.Log.i(e17, sb6.toString());
        return new c4.l(e(), null);
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public void c(java.lang.String parentId, c4.z result) {
        kotlin.jvm.internal.o.g(parentId, "parentId");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i(e(), "onLoadChildren: no need to load children");
        result.d(null);
    }

    public abstract java.lang.String e();
}
