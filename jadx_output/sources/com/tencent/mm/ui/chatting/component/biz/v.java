package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes8.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.w f198818d;

    public v(com.tencent.mm.ui.chatting.component.biz.w wVar) {
        this.f198818d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.biz.w wVar = this.f198818d;
        wVar.f198819a.dismiss();
        wVar.f198820b.f198823f.b();
    }
}
