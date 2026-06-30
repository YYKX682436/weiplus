package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201921f;

    public l3(com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2) {
        this.f201919d = f9Var;
        this.f201920e = str;
        this.f201921f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.p3 Zi = t21.o2.Zi();
        com.tencent.mm.storage.f9 f9Var = this.f201919d;
        Zi.c(f9Var.z0(), 3, new com.tencent.mm.ui.chatting.m3(this.f201920e, f9Var, this.f201921f));
    }
}
