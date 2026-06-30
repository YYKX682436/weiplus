package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class w7 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCountDownTextView f133286a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(long j17, com.tencent.mm.plugin.finder.view.FinderCountDownTextView finderCountDownTextView) {
        super(j17, 1000L);
        this.f133286a = finderCountDownTextView;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        pm0.v.X(new com.tencent.mm.plugin.finder.view.u7(this.f133286a));
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        pm0.v.X(new com.tencent.mm.plugin.finder.view.v7(this.f133286a, j17));
    }
}
