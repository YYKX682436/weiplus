package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class uf extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f133172d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f133173e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f133174f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f133175g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout f133176h;

    /* renamed from: i, reason: collision with root package name */
    public int f133177i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf(com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout finderNPSFrameLayout, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f133176h = finderNPSFrameLayout;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f133175g = obj;
        this.f133177i |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout.a(this.f133176h, null, false, this);
    }
}
