package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class qa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.db f202622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(com.tencent.mm.ui.chatting.db dbVar) {
        super(0);
        this.f202622d = dbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.db dbVar = this.f202622d;
        ((com.tencent.mm.ui.chatting.ta) dbVar.f200425e).e();
        ((android.animation.ValueAnimator) ((jz5.n) dbVar.f200429i).getValue()).start();
        return jz5.f0.f302826a;
    }
}
