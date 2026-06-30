package com.tencent.mm.plugin.finder.storage;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/storage/FinderStaggeredConfig$getItemConvertFactory$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderStaggeredConfig$getItemConvertFactory$1 implements in5.s {
    final /* synthetic */ yz5.l $extraMap;
    final /* synthetic */ com.tencent.mm.plugin.finder.storage.jj0 this$0;

    public FinderStaggeredConfig$getItemConvertFactory$1(com.tencent.mm.plugin.finder.storage.jj0 jj0Var, yz5.l lVar) {
        this.this$0 = jj0Var;
        this.$extraMap = lVar;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        in5.r rVar;
        com.tencent.mm.plugin.finder.storage.jj0 jj0Var = this.this$0;
        yz5.l lVar = this.$extraMap;
        jj0Var.getClass();
        if (!(type == 3002 || type == 4) && type != 9) {
            if (type == 3001 || type == 2) {
                return new com.tencent.mm.plugin.finder.convert.eh(jj0Var.f127016a, jj0Var.f127017b, null, null, 12, null);
            }
            if (type == -3) {
                return new com.tencent.mm.plugin.finder.convert.ik();
            }
            if (type == -5) {
                return new com.tencent.mm.plugin.finder.convert.xh();
            }
            if (type == -7) {
                return new com.tencent.mm.plugin.finder.convert.zh();
            }
            if (type == -21) {
                return new com.tencent.mm.plugin.finder.convert.x7();
            }
            if (type == -22) {
                return new com.tencent.mm.plugin.finder.convert.e0(null, 1, null);
            }
            if (type == -23) {
                return new com.tencent.mm.plugin.finder.convert.v(jj0Var.f127016a, jj0Var.f127017b, null, null, 12, null);
            }
            if (type == 10002) {
                return new com.tencent.mm.plugin.finder.convert.uo(jj0Var.f127016a, jj0Var.f127017b, null, null, 12, null);
            }
            if (type == 1) {
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
            if (type == com.tencent.mm.plugin.finder.playlist.z1.class.getName().hashCode()) {
                return new com.tencent.mm.plugin.finder.playlist.y1(false, false, false, false, 15, null);
            }
            if (lVar != null && (rVar = (in5.r) lVar.invoke(java.lang.Integer.valueOf(type))) != null) {
                return rVar;
            }
            hc2.l.a("FinderStaggeredConfig", type);
            return new com.tencent.mm.plugin.finder.convert.z2();
        }
        return new com.tencent.mm.plugin.finder.convert.zk(jj0Var.f127016a, jj0Var.f127017b, null, null, 12, null);
    }
}
