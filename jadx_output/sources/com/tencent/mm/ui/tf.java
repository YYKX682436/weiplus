package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class tf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.NewChattingTabUI f209900d;

    public tf(com.tencent.mm.ui.NewChattingTabUI newChattingTabUI) {
        this.f209900d = newChattingTabUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Looper.myQueue().addIdleHandler(this.f209900d.f197018e);
    }
}
