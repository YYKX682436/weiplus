package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class v3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f117468d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f117469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.y3 f117470f;

    /* renamed from: g, reason: collision with root package name */
    public int f117471g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(com.tencent.mm.plugin.finder.live.viewmodel.y3 y3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f117470f = y3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f117469e = obj;
        this.f117471g |= Integer.MIN_VALUE;
        return this.f117470f.T6(this);
    }
}
