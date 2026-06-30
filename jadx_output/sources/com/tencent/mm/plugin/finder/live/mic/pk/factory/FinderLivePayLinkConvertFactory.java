package com.tencent.mm.plugin.finder.live.mic.pk.factory;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/mic/pk/factory/FinderLivePayLinkConvertFactory;", "Lin5/s;", "Lcom/tencent/mm/plugin/finder/convert/z2;", "createFinderEmptyConvert", "", "type", "Lin5/r;", "getItemConvert", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLivePayLinkConvertFactory implements in5.s {
    private final com.tencent.mm.plugin.finder.convert.z2 createFinderEmptyConvert() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.sdk.platformtools.Log.c("RecyclerViewAdapterEx", "type invalid", new java.lang.Object[0]);
        return new com.tencent.mm.plugin.finder.convert.z2();
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        return type == 1 ? new ti2.s() : createFinderEmptyConvert();
    }
}
