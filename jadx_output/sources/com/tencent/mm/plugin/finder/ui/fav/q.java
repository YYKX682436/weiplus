package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public class q extends com.tencent.mm.plugin.finder.storage.jj0 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.r f129201d;

    public q(yz5.r rVar) {
        super(-1, null, 2, null);
        this.f129201d = rVar;
    }

    @Override // com.tencent.mm.plugin.finder.storage.jj0, com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(final yz5.l lVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavStaggeredConfig$getItemConvertFactory$1
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
                            com.tencent.mm.plugin.finder.ui.fav.q qVar = com.tencent.mm.plugin.finder.ui.fav.q.this;
                            return new com.tencent.mm.plugin.finder.convert.zk(qVar.f127016a, qVar.f127017b, null, null, 12, null);
                        }
                        if (type != 3001) {
                            if (type != 3002) {
                                yz5.l lVar2 = lVar;
                                return (lVar2 == null || (rVar = (in5.r) lVar2.invoke(java.lang.Integer.valueOf(type))) == null) ? new com.tencent.mm.plugin.finder.convert.z2() : rVar;
                            }
                        }
                    }
                    com.tencent.mm.plugin.finder.ui.fav.q qVar2 = com.tencent.mm.plugin.finder.ui.fav.q.this;
                    return new com.tencent.mm.plugin.finder.convert.zk(qVar2.f127016a, qVar2.f127017b, qVar2.f129201d, null, 8, null);
                }
                com.tencent.mm.plugin.finder.ui.fav.q qVar3 = com.tencent.mm.plugin.finder.ui.fav.q.this;
                return new com.tencent.mm.plugin.finder.convert.eh(qVar3.f127016a, qVar3.f127017b, qVar3.f129201d, null, 8, null);
            }
        };
    }
}
