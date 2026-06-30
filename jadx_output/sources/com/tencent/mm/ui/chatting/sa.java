package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class sa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.db f202669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(com.tencent.mm.ui.chatting.db dbVar) {
        super(0);
        this.f202669d = dbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float[] fArr = new float[2];
        com.tencent.mm.ui.chatting.db dbVar = this.f202669d;
        fArr[0] = dbVar.f200437t != null ? r2.intValue() : dbVar.f200426f;
        fArr[1] = 0.0f;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(fArr);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new com.tencent.mm.ui.chatting.ra(dbVar));
        return ofFloat;
    }
}
