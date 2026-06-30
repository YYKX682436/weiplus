package com.tencent.mm.plugin.finder.nearby.video;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/nearby/video/NearbyVideoStaggeredConfig$getItemConvertFactory$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NearbyVideoStaggeredConfig$getItemConvertFactory$1 implements in5.s {
    final /* synthetic */ yz5.l $extraMap;
    final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.r this$0;

    public NearbyVideoStaggeredConfig$getItemConvertFactory$1(com.tencent.mm.plugin.finder.nearby.video.r rVar, yz5.l lVar) {
        this.this$0 = rVar;
        this.$extraMap = lVar;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        in5.r rVar;
        if (type != 2) {
            if (type != 4) {
                if (type == 9) {
                    return new ep2.l(this.this$0.f122215a);
                }
                if (type != 3001) {
                    if (type != 3002) {
                        yz5.l lVar = this.$extraMap;
                        if (lVar != null && (rVar = (in5.r) lVar.invoke(java.lang.Integer.valueOf(type))) != null) {
                            return rVar;
                        }
                        this.this$0.getClass();
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                        com.tencent.mm.sdk.platformtools.Log.c("FinderGridLayoutConfig", "type invalid", new java.lang.Object[0]);
                        return new com.tencent.mm.plugin.finder.convert.z2();
                    }
                }
            }
            return new com.tencent.mm.plugin.finder.nearby.video.o(this.this$0);
        }
        return new com.tencent.mm.plugin.finder.nearby.video.p(this.this$0);
    }
}
