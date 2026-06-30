package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.v0 f150212d;

    public z0(com.tencent.mm.plugin.multitalk.model.v0 v0Var) {
        this.f150212d = v0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.model.v0 v0Var = this.f150212d;
        v0Var.f150183x1.postValue(v0Var.f150173p1);
    }
}
