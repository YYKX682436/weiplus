package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f187852d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f187853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.h0 f187854f;

    /* renamed from: g, reason: collision with root package name */
    public int f187855g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.webview.webcompt.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f187854f = h0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f187853e = obj;
        this.f187855g |= Integer.MIN_VALUE;
        return this.f187854f.d(this);
    }
}
