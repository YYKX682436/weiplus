package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes11.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198786d;

    public h0(com.tencent.mm.ui.chatting.component.biz.a aVar) {
        this.f198786d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.ScanAndReportNearFieldFreeWifiEvent scanAndReportNearFieldFreeWifiEvent = new com.tencent.mm.autogen.events.ScanAndReportNearFieldFreeWifiEvent();
        qk.o oVar = this.f198786d.f198746h;
        if (oVar != null) {
            java.lang.String str = oVar.field_username;
            scanAndReportNearFieldFreeWifiEvent.f54725g.getClass();
            scanAndReportNearFieldFreeWifiEvent.e();
        }
    }
}
