package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class na extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.db f202039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(com.tencent.mm.ui.chatting.db dbVar) {
        super(0);
        this.f202039d = dbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.db dbVar = this.f202039d;
        ((jz5.n) dbVar.f200433p).getValue();
        ((android.animation.ValueAnimator) ((jz5.n) dbVar.f200430m).getValue()).cancel();
        int i17 = dbVar.f200426f;
        ah5.a aVar = dbVar.f200425e;
        ((com.tencent.mm.ui.chatting.ta) aVar).b((int) (i17 * 0.0f), i17);
        ((com.tencent.mm.ui.chatting.ta) aVar).d();
        return jz5.f0.f302826a;
    }
}
