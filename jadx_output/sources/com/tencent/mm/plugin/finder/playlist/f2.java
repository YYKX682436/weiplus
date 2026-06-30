package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes14.dex */
public final class f2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f122303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.p2 f122304e;

    /* renamed from: f, reason: collision with root package name */
    public int f122305f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.tencent.mm.plugin.finder.playlist.p2 p2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f122304e = p2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f122303d = obj;
        this.f122305f |= Integer.MIN_VALUE;
        java.lang.Object a17 = com.tencent.mm.plugin.finder.playlist.p2.a(this.f122304e, this);
        return a17 == pz5.a.f359186d ? a17 : kotlin.Result.m520boximpl(a17);
    }
}
