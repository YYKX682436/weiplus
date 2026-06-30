package com.tencent.wechat.aff.emoticon;

/* loaded from: classes7.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f216643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f216643d = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.wechat.aff.emoticon.g result = (com.tencent.wechat.aff.emoticon.g) obj;
        kotlin.jvm.internal.o.g(result, "result");
        this.f216643d.resumeWith(kotlin.Result.m521constructorimpl(result));
        return jz5.f0.f302826a;
    }
}
