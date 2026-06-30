package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class k00 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f134909d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k00(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(1);
        this.f134909d = baseFinderFeed;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ed2.k trackWith = (ed2.k) obj;
        kotlin.jvm.internal.o.g(trackWith, "$this$trackWith");
        return new ed2.j("self_read_click_guide", 1L, 4, this.f134909d);
    }
}
