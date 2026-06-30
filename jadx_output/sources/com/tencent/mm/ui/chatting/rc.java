package com.tencent.mm.ui.chatting;

/* loaded from: classes3.dex */
public class rc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.SendDataToDeviceProgressBar f202649d;

    public rc(com.tencent.mm.ui.chatting.SendDataToDeviceProgressBar sendDataToDeviceProgressBar) {
        this.f202649d = sendDataToDeviceProgressBar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f202649d.invalidate();
    }
}
