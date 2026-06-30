package com.tencent.mm.plugin.finder.ui.conv;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedStaggeredConfig$getItemConvertFactory$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderConvSearchFeedStaggeredConfig$getItemConvertFactory$1 implements in5.s {
    final /* synthetic */ yz5.l $extraMap;
    final /* synthetic */ com.tencent.mm.plugin.finder.ui.conv.d this$0;

    public FinderConvSearchFeedStaggeredConfig$getItemConvertFactory$1(com.tencent.mm.plugin.finder.ui.conv.d dVar, yz5.l lVar) {
        this.this$0 = dVar;
        this.$extraMap = lVar;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        in5.r rVar;
        if (type == -7) {
            return new com.tencent.mm.plugin.finder.convert.zh();
        }
        if (type == -5) {
            return new com.tencent.mm.plugin.finder.convert.xh();
        }
        if (type == -3) {
            return new com.tencent.mm.plugin.finder.convert.ik();
        }
        if (type != 2) {
            if (type != 4) {
                if (type == 9) {
                    com.tencent.mm.plugin.finder.ui.conv.d dVar = this.this$0;
                    return new com.tencent.mm.plugin.finder.convert.zk(dVar.f127016a, dVar.f127017b, null, null, 12, null);
                }
                if (type == 26214) {
                    return new com.tencent.mm.plugin.finder.ui.conv.m();
                }
                if (type != 3001) {
                    if (type != 3002) {
                        yz5.l lVar = this.$extraMap;
                        return (lVar == null || (rVar = (in5.r) lVar.invoke(java.lang.Integer.valueOf(type))) == null) ? new com.tencent.mm.plugin.finder.convert.z2() : rVar;
                    }
                }
            }
            com.tencent.mm.plugin.finder.ui.conv.d dVar2 = this.this$0;
            return new com.tencent.mm.plugin.finder.convert.zk(dVar2.f127016a, dVar2.f127017b, null, dVar2.f129014d, 4, null);
        }
        com.tencent.mm.plugin.finder.ui.conv.d dVar3 = this.this$0;
        return new com.tencent.mm.plugin.finder.convert.eh(dVar3.f127016a, dVar3.f127017b, null, dVar3.f129014d, 4, null);
    }
}
