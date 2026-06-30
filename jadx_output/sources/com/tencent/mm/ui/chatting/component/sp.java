package com.tencent.mm.ui.chatting.component;

/* loaded from: classes.dex */
public final class sp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f199957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(kotlinx.coroutines.q qVar) {
        super(1);
        this.f199957d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) this.f199957d;
        if (rVar.n()) {
            rVar.resumeWith(kotlin.Result.m521constructorimpl(mVar));
        }
        return jz5.f0.f302826a;
    }
}
