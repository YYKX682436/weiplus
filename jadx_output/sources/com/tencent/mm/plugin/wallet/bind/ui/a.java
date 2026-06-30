package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.b f178604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f178605e;

    public a(com.tencent.mm.plugin.wallet.bind.ui.c cVar, com.tencent.mm.plugin.wallet.bind.ui.b bVar, android.view.View view) {
        this.f178604d = bVar;
        this.f178605e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[2];
        com.tencent.mm.plugin.wallet.bind.ui.b bVar = this.f178604d;
        bVar.f178607a.getLocationInWindow(iArr);
        int i17 = iArr[0];
        bVar.f178614h.getLocationInWindow(iArr);
        bVar.f178607a.setMaxWidth((iArr[0] - i17) - i65.a.b(this.f178605e.getContext(), 16));
    }
}
