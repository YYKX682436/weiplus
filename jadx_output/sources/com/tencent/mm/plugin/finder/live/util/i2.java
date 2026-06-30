package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes10.dex */
public final class i2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f115547d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f115548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.j2 f115549f;

    /* renamed from: g, reason: collision with root package name */
    public int f115550g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.tencent.mm.plugin.finder.live.util.j2 j2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f115549f = j2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f115548e = obj;
        this.f115550g |= Integer.MIN_VALUE;
        return this.f115549f.e(null, this);
    }
}
