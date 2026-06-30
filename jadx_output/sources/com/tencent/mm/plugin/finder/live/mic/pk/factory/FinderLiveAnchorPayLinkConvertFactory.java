package com.tencent.mm.plugin.finder.live.mic.pk.factory;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/mic/pk/factory/FinderLiveAnchorPayLinkConvertFactory;", "Lin5/s;", "Lcom/tencent/mm/plugin/finder/convert/z2;", "createFinderEmptyConvert", "", "type", "Lin5/r;", "getItemConvert", "Lgk2/e;", "liveData", "Lgk2/e;", "getLiveData", "()Lgk2/e;", "Lsi2/c;", "convertCallback", "Lsi2/c;", "getConvertCallback", "()Lsi2/c;", "<init>", "(Lgk2/e;Lsi2/c;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLiveAnchorPayLinkConvertFactory implements in5.s {
    private final si2.c convertCallback;
    private final gk2.e liveData;

    public FinderLiveAnchorPayLinkConvertFactory(gk2.e liveData, si2.c convertCallback) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(convertCallback, "convertCallback");
        this.liveData = liveData;
        this.convertCallback = convertCallback;
    }

    private final com.tencent.mm.plugin.finder.convert.z2 createFinderEmptyConvert() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.sdk.platformtools.Log.c("RecyclerViewAdapterEx", "type invalid", new java.lang.Object[0]);
        return new com.tencent.mm.plugin.finder.convert.z2();
    }

    public final si2.c getConvertCallback() {
        return this.convertCallback;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        return type == 5 ? new ti2.g(this.liveData, this.convertCallback) : createFinderEmptyConvert();
    }

    public final gk2.e getLiveData() {
        return this.liveData;
    }
}
