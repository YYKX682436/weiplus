package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes8.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.u f198816d;

    public t(com.tencent.mm.ui.chatting.component.biz.u uVar) {
        this.f198816d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.biz.u uVar = this.f198816d;
        uVar.f198817d.f198819a.dismiss();
        uVar.f198817d.f198820b.f198823f.b();
    }
}
