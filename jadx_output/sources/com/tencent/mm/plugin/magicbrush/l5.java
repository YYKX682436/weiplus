package com.tencent.mm.plugin.magicbrush;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/l5;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/magicbrush/IMBAppBrandExportFeature$ServerEvent;", "Ljz5/f0;", "<init>", "()V", "mb-impl_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
final class l5 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        if (!(((com.tencent.mm.plugin.magicbrush.IMBAppBrandExportFeature$ServerEvent) obj) instanceof com.tencent.mm.plugin.magicbrush.IMBAppBrandExportFeature$ServerEvent.CleanUpPkgImplsEvent)) {
            throw new java.lang.IllegalArgumentException("Not implemented yet!");
        }
        com.tencent.mm.plugin.magicbrush.s7 s7Var = (com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class));
        synchronized (s7Var) {
            s7Var.f148124g.clear();
        }
    }
}
