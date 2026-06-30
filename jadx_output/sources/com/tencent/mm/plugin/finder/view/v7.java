package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class v7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCountDownTextView f133229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f133230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView, long j17) {
        super(0);
        this.f133229d = finderCountDownTextView;
        this.f133230e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView = this.f133229d;
        if (finderCountDownTextView.getTotalCountDownMs() != 0) {
            finderCountDownTextView.setRemainTimeMs(this.f133230e);
            if (finderCountDownTextView.getRemainTimeMs() < finderCountDownTextView.getPreloadRemainMs()) {
                yz5.a countDownPreloadCallback = finderCountDownTextView.getCountDownPreloadCallback();
                if (countDownPreloadCallback != null) {
                    countDownPreloadCallback.invoke();
                }
                finderCountDownTextView.setPreloadRemainMs(0L);
            }
            finderCountDownTextView.c();
            if (finderCountDownTextView.getTempWordingResId() != 0 && finderCountDownTextView.getShowTempWordingUntilTime() != 0 && finderCountDownTextView.getRemainTimeMs() < finderCountDownTextView.getShowTempWordingUntilTime()) {
                yz5.a tempWordingFinishCallback = finderCountDownTextView.getTempWordingFinishCallback();
                if (tempWordingFinishCallback != null) {
                    tempWordingFinishCallback.invoke();
                }
                finderCountDownTextView.setShowTempWordingUntilTime(0L);
            }
        }
        return jz5.f0.f302826a;
    }
}
