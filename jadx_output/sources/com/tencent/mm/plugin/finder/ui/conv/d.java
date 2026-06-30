package com.tencent.mm.plugin.finder.ui.conv;

/* loaded from: classes2.dex */
public class d extends com.tencent.mm.plugin.finder.storage.jj0 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f129014d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yz5.a getCurrQuery) {
        super(-1, null, 2, null);
        kotlin.jvm.internal.o.g(getCurrQuery, "getCurrQuery");
        this.f129014d = getCurrQuery;
    }

    @Override // com.tencent.mm.plugin.finder.storage.jj0, com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(yz5.l lVar) {
        return new com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedStaggeredConfig$getItemConvertFactory$1(this, lVar);
    }
}
