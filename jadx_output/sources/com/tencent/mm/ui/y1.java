package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f212570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.CheckCanSubscribeBizUI f212571e;

    public y1(com.tencent.mm.ui.CheckCanSubscribeBizUI checkCanSubscribeBizUI, java.lang.String str) {
        this.f212571e = checkCanSubscribeBizUI;
        this.f212570d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.CheckCanSubscribeBizUI checkCanSubscribeBizUI = this.f212571e;
        if (checkCanSubscribeBizUI.f196613e.equals(this.f212570d)) {
            checkCanSubscribeBizUI.f196620o = true;
            if (checkCanSubscribeBizUI.f196621p) {
                return;
            }
            com.tencent.mm.ui.CheckCanSubscribeBizUI.T6(checkCanSubscribeBizUI);
        }
    }
}
