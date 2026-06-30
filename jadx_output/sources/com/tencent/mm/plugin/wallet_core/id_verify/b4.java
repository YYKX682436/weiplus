package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179343d;

    public b4(com.tencent.mm.plugin.wallet_core.id_verify.c4 c4Var, java.lang.String str) {
        this.f179343d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.wallet_core.ui.r1.V(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f179343d, true);
    }
}
