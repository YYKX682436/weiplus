package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f187868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.h0 f187869e;

    /* renamed from: f, reason: collision with root package name */
    public int f187870f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.webview.webcompt.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f187869e = h0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f187868d = obj;
        this.f187870f |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.webview.webcompt.h0.a(this.f187869e, this);
    }
}
