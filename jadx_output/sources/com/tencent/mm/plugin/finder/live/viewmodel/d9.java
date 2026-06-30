package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class d9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f117039d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f117040e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f117041f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f117042g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117043h;

    /* renamed from: i, reason: collision with root package name */
    public int f117044i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f117043h = v9Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f117042g = obj;
        this.f117044i |= Integer.MIN_VALUE;
        return this.f117043h.P6(this);
    }
}
