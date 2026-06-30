package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.l f139889d;

    public g(com.tencent.mm.plugin.game.luggage.page.l lVar) {
        this.f139889d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Dialog dialog = this.f139889d.f139917q2;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
