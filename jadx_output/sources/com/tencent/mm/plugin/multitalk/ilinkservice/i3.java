package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149611f;

    public i3(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, java.lang.String str, java.lang.String str2) {
        this.f149611f = i4Var;
        this.f149609d = str;
        this.f149610e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.j(this.f149611f, new com.tencent.mm.plugin.multitalk.ilinkservice.b3(this));
    }
}
