package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class za extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.db f206286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(com.tencent.mm.ui.chatting.db dbVar) {
        super(0);
        this.f206286d = dbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new com.tencent.mm.ui.chatting.ya(this.f206286d));
        return ofFloat;
    }
}
