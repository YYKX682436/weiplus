package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class q0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f122405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122406e;

    /* renamed from: f, reason: collision with root package name */
    public int f122407f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.finder.playlist.s1 s1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f122406e = s1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f122405d = obj;
        this.f122407f |= Integer.MIN_VALUE;
        java.lang.Object a17 = com.tencent.mm.plugin.finder.playlist.s1.a(this.f122406e, null, this);
        return a17 == pz5.a.f359186d ? a17 : kotlin.Result.m520boximpl(a17);
    }
}
