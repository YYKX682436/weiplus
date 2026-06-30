package com.tencent.wechat.aff.emoticon;

/* loaded from: classes7.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f216661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f216661d = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.wechat.aff.emoticon.o result = (com.tencent.wechat.aff.emoticon.o) obj;
        kotlin.jvm.internal.o.g(result, "result");
        this.f216661d.resumeWith(kotlin.Result.m521constructorimpl(result));
        return jz5.f0.f302826a;
    }
}
