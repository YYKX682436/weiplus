package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes15.dex */
public final class t0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f115698d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f115699e;

    /* renamed from: f, reason: collision with root package name */
    public int f115700f;

    /* renamed from: g, reason: collision with root package name */
    public int f115701g;

    /* renamed from: h, reason: collision with root package name */
    public int f115702h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f115703i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.a1 f115704m;

    /* renamed from: n, reason: collision with root package name */
    public int f115705n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.finder.live.util.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f115704m = a1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f115703i = obj;
        this.f115705n |= Integer.MIN_VALUE;
        return this.f115704m.b7(null, this);
    }
}
