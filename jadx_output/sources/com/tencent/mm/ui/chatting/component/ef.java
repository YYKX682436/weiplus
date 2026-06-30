package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class ef implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ff f198968e;

    public ef(com.tencent.mm.ui.chatting.component.ff ffVar, java.lang.String str) {
        this.f198968e = ffVar;
        this.f198967d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.ff ffVar = this.f198968e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(ffVar.f199054d.f199687h)) {
            return;
        }
        java.lang.String str = this.f198967d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(ffVar.f199054d.f199687h)) {
            return;
        }
        ffVar.f199054d.J0(false);
    }
}
