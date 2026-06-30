package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class uc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.vc f210828d;

    public uc(com.tencent.mm.ui.tools.vc vcVar) {
        this.f210828d = vcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.vc vcVar = this.f210828d;
        vcVar.f210853a.finish();
        vcVar.f210853a.overridePendingTransition(0, 0);
    }
}
