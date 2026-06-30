package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.at.q f128899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.finder.ui.at.q qVar) {
        super(0);
        this.f128899d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneSearchDataSource finderAtSomeoneSearchDataSource = new com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneSearchDataSource();
        this.f128899d.mo133getLifecycle().a(finderAtSomeoneSearchDataSource);
        return finderAtSomeoneSearchDataSource;
    }
}
