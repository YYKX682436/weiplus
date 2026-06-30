package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class i4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f118631d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f118632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q4 f118633f;

    /* renamed from: g, reason: collision with root package name */
    public int f118634g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(com.tencent.mm.plugin.finder.live.widget.q4 q4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f118633f = q4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f118632e = obj;
        this.f118634g |= Integer.MIN_VALUE;
        return this.f118633f.c(null, this);
    }
}
