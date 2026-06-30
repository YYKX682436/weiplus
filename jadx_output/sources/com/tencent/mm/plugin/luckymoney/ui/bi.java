package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class bi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.ci f146756d;

    public bi(com.tencent.mm.plugin.luckymoney.ui.ci ciVar) {
        this.f146756d = ciVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.ci ciVar = this.f146756d;
        ciVar.f146797a.f146445z.setFocusable(true);
        ciVar.f146797a.f146445z.setClickable(true);
        ciVar.f146797a.f146441y.setFocusable(true);
        ciVar.f146797a.f146441y.setClickable(true);
        ciVar.f146797a.D.setFocusable(true);
        ciVar.f146797a.D.setClickable(true);
    }
}
