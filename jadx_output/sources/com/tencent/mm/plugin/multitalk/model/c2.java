package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.x f149899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149900e;

    public c2(com.tencent.mm.plugin.multitalk.model.d2 d2Var, com.tencent.mm.plugin.multitalk.model.x xVar, java.lang.String str) {
        this.f149899d = xVar;
        this.f149900e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f149899d.b(this.f149900e);
    }
}
