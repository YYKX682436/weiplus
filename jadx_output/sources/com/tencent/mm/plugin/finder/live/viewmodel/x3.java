package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class x3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f117523d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f117524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.y3 f117525f;

    /* renamed from: g, reason: collision with root package name */
    public int f117526g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(com.tencent.mm.plugin.finder.live.viewmodel.y3 y3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f117525f = y3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f117524e = obj;
        this.f117526g |= Integer.MIN_VALUE;
        return this.f117525f.U6(this);
    }
}
