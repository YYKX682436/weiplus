package com.tencent.mm.pluginsdk.model;

/* loaded from: classes10.dex */
public final class p2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f189401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.x2 f189402e;

    /* renamed from: f, reason: collision with root package name */
    public int f189403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.tencent.mm.pluginsdk.model.x2 x2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f189402e = x2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f189401d = obj;
        this.f189403f |= Integer.MIN_VALUE;
        return this.f189402e.b(null, null, this);
    }
}
