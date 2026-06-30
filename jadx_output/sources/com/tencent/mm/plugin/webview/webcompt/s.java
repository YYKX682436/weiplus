package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f187898d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f187898d = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCInteger it = (com.tencent.mm.ipcinvoker.type.IPCInteger) obj;
        kotlin.jvm.internal.o.g(it, "it");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f187898d.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(it.f68404d)));
        return jz5.f0.f302826a;
    }
}
