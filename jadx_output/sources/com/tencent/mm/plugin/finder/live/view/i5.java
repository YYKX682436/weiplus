package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class i5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f116375d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f116376e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f116377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView f116378g;

    /* renamed from: h, reason: collision with root package name */
    public int f116379h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(com.tencent.mm.plugin.finder.live.view.FinderLiveGameDataView finderLiveGameDataView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f116378g = finderLiveGameDataView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f116377f = obj;
        this.f116379h |= Integer.MIN_VALUE;
        return this.f116378g.h(null, null, this);
    }
}
