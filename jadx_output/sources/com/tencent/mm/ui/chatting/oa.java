package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class oa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.db f202070d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(com.tencent.mm.ui.chatting.db dbVar) {
        super(0);
        this.f202070d = dbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.db dbVar = this.f202070d;
        ((com.tencent.mm.ui.chatting.ta) dbVar.f200425e).c();
        if (!dbVar.f200438u) {
            ((android.animation.ValueAnimator) ((jz5.n) dbVar.f200430m).getValue()).start();
        }
        return jz5.f0.f302826a;
    }
}
