package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class r7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.u7 f116652e;

    public r7(java.lang.String str, com.tencent.mm.plugin.finder.live.view.u7 u7Var) {
        this.f116651d = str;
        this.f116652e = u7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(this.f116651d, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.f329965s));
        com.tencent.mm.plugin.finder.live.view.q7 q7Var = new com.tencent.mm.plugin.finder.live.view.q7(this.f116652e);
        b17.getClass();
        b17.f447873d = q7Var;
        b17.a();
    }
}
