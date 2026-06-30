package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class pa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.db f202089d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(com.tencent.mm.ui.chatting.db dbVar) {
        super(0);
        this.f202089d = dbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.db dbVar = this.f202089d;
        ((jz5.n) dbVar.f200431n).getValue();
        ((android.animation.ValueAnimator) ((jz5.n) dbVar.f200429i).getValue()).cancel();
        int i17 = dbVar.f200426f;
        ah5.a aVar = dbVar.f200425e;
        ((com.tencent.mm.ui.chatting.ta) aVar).b((int) (i17 * 1.0f), i17);
        ((com.tencent.mm.ui.chatting.ta) aVar).a();
        return jz5.f0.f302826a;
    }
}
