package com.tencent.mm.plugin.finder.profile;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/profile/FinderProfileLayoutConfig$getItemConvertFactory$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileLayoutConfig$getItemConvertFactory$1 implements in5.s {
    final /* synthetic */ yz5.l $extraMap;
    final /* synthetic */ com.tencent.mm.plugin.finder.profile.h this$0;

    public FinderProfileLayoutConfig$getItemConvertFactory$1(com.tencent.mm.plugin.finder.profile.h hVar, yz5.l lVar) {
        this.this$0 = hVar;
        this.$extraMap = lVar;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        in5.r rVar;
        boolean z17 = true;
        if (type != 4 && type != 9 && type != 2) {
            z17 = false;
        }
        if (!z17) {
            if (type == so2.c5.class.hashCode()) {
                return new com.tencent.mm.plugin.finder.convert.xt();
            }
            yz5.l lVar = this.$extraMap;
            if (lVar != null && (rVar = (in5.r) lVar.invoke(java.lang.Integer.valueOf(type))) != null) {
                return rVar;
            }
            this.this$0.getClass();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            com.tencent.mm.sdk.platformtools.Log.c("FinderGridLayoutConfig", "type invalid", new java.lang.Object[0]);
            return new com.tencent.mm.plugin.finder.convert.z2();
        }
        com.tencent.mm.plugin.finder.profile.h hVar = this.this$0;
        if (!hVar.f123387f) {
            com.tencent.mm.plugin.finder.convert.mt mtVar = new com.tencent.mm.plugin.finder.convert.mt();
            mtVar.A = java.lang.Boolean.valueOf(this.this$0.f123383b);
            return mtVar;
        }
        if (hVar.f123384c == 2) {
            com.tencent.mm.plugin.finder.convert.ft ftVar = new com.tencent.mm.plugin.finder.convert.ft();
            ftVar.f103422q = java.lang.Boolean.valueOf(hVar.f123383b);
            return ftVar;
        }
        com.tencent.mm.plugin.finder.convert.dt dtVar = new com.tencent.mm.plugin.finder.convert.dt(hVar.f123385d, null, hVar.f123386e, hVar.f123388g, 2, null);
        dtVar.G = java.lang.Boolean.valueOf(hVar.f123383b);
        return dtVar;
    }
}
