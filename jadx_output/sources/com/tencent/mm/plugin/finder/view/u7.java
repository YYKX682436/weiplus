package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class u7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCountDownTextView f133160d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView) {
        super(0);
        this.f133160d = finderCountDownTextView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView = this.f133160d;
        yz5.l countDownFinishCallback = finderCountDownTextView.getCountDownFinishCallback();
        if (countDownFinishCallback != null) {
            if (finderCountDownTextView.tempWordingResId != 0) {
                long j17 = finderCountDownTextView.remainTimeMs;
                long j18 = finderCountDownTextView.showTempWordingUntilTime;
                if (j17 > j18 && j18 != 0) {
                    z17 = true;
                    countDownFinishCallback.invoke(java.lang.Boolean.valueOf(z17));
                }
            }
            z17 = false;
            countDownFinishCallback.invoke(java.lang.Boolean.valueOf(z17));
        }
        finderCountDownTextView.setRemainTimeMs(0L);
        finderCountDownTextView.c();
        return jz5.f0.f302826a;
    }
}
