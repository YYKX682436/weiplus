package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class z0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f154016d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f154017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.k1 f154018f;

    /* renamed from: g, reason: collision with root package name */
    public int f154019g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.profile.ui.mod.components.k1 k1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f154018f = k1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f154017e = obj;
        this.f154019g |= Integer.MIN_VALUE;
        return this.f154018f.R6(this);
    }
}
