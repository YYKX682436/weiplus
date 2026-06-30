package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.x f150138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150139e;

    public t3(com.tencent.mm.plugin.multitalk.model.u3 u3Var, com.tencent.mm.plugin.multitalk.model.x xVar, java.lang.String str) {
        this.f150138d = xVar;
        this.f150139e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f150138d.b(this.f150139e);
    }
}
