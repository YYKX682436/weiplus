package com.tencent.mm.plugin.ting.media;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ting/media/BaseTingMediaBrowserService;", "Landroidx/media/MediaBrowserServiceCompat;", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class BaseTingMediaBrowserService extends androidx.media.MediaBrowserServiceCompat {
    @Override // androidx.media.MediaBrowserServiceCompat
    public c4.l b(java.lang.String clientPackageName, int i17, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(clientPackageName, "clientPackageName");
        return new c4.l("MicroMsg.BaseTingMediaBrowserService", null);
    }

    @Override // androidx.media.MediaBrowserServiceCompat
    public void c(java.lang.String parentId, c4.z result) {
        kotlin.jvm.internal.o.g(parentId, "parentId");
        kotlin.jvm.internal.o.g(result, "result");
        result.a();
    }
}
