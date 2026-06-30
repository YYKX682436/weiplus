package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class z extends com.tencent.mm.plugin.finder.ui.fav.q {
    @Override // com.tencent.mm.plugin.finder.ui.fav.q, com.tencent.mm.plugin.finder.storage.jj0, com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(final yz5.l lVar) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.fav.FinderGlobalMixFavConfig$getItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                in5.r rVar;
                if (type == -7) {
                    return new com.tencent.mm.plugin.finder.convert.zh();
                }
                if (type != 10002) {
                    yz5.l lVar2 = lVar;
                    return (lVar2 == null || (rVar = (in5.r) lVar2.invoke(java.lang.Integer.valueOf(type))) == null) ? new com.tencent.mm.plugin.finder.convert.z2() : rVar;
                }
                com.tencent.mm.plugin.finder.ui.fav.z zVar = com.tencent.mm.plugin.finder.ui.fav.z.this;
                return new com.tencent.mm.plugin.finder.convert.qo(zVar.f127016a, zVar.f127017b, zVar.f129201d, null, 8, null);
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.storage.jj0, com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.p2 c() {
        return new com.tencent.mm.plugin.finder.ui.fav.y();
    }

    @Override // com.tencent.mm.plugin.finder.storage.jj0, com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.RecyclerView.LayoutManager d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new androidx.recyclerview.widget.LinearLayoutManager(context);
    }
}
