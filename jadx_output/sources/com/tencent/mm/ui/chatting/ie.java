package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class ie implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.je f201861d;

    public ie(com.tencent.mm.ui.chatting.je jeVar) {
        this.f201861d = jeVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f201861d.f201875d.f198325d.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }
}
