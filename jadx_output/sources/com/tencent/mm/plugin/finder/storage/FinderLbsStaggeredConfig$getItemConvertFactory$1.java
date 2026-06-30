package com.tencent.mm.plugin.finder.storage;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig$getItemConvertFactory$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLbsStaggeredConfig$getItemConvertFactory$1 implements in5.s {
    final /* synthetic */ yz5.l $extraMap;
    final /* synthetic */ com.tencent.mm.plugin.finder.storage.s90 this$0;

    public FinderLbsStaggeredConfig$getItemConvertFactory$1(com.tencent.mm.plugin.finder.storage.s90 s90Var, yz5.l lVar) {
        this.this$0 = s90Var;
        this.$extraMap = lVar;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        in5.r rVar;
        if (type == -5) {
            return new com.tencent.mm.plugin.finder.convert.xh();
        }
        if (type == -3) {
            return new com.tencent.mm.plugin.finder.convert.ik();
        }
        if (type != 2) {
            if (type != 4 && type != 9) {
                if (type == 2003) {
                    com.tencent.mm.ui.MMActivity activity = this.this$0.f127534a;
                    kotlin.jvm.internal.o.g(activity, "activity");
                    return new com.tencent.mm.plugin.finder.convert.th(null, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), 2);
                }
                if (type != 3001) {
                    if (type != 3002) {
                        yz5.l lVar = this.$extraMap;
                        if (lVar != null && (rVar = (in5.r) lVar.invoke(java.lang.Integer.valueOf(type))) != null) {
                            return rVar;
                        }
                        this.this$0.getClass();
                        hc2.l.a("FinderLbsStaggeredConfig", type);
                        return new com.tencent.mm.plugin.finder.convert.z2();
                    }
                }
            }
            return new com.tencent.mm.plugin.finder.storage.p90(this.this$0);
        }
        return new com.tencent.mm.plugin.finder.storage.q90(this.this$0);
    }
}
