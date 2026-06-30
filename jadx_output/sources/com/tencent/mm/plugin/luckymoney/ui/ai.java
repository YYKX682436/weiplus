package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ai implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.ci f146713d;

    public ai(com.tencent.mm.plugin.luckymoney.ui.ci ciVar) {
        this.f146713d = ciVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.ci ciVar = this.f146713d;
        ciVar.f146797a.P.setVisibility(0);
        fc3.h hVar = ciVar.f146797a.Q;
        if (hVar != null) {
            hVar.a();
        }
    }
}
