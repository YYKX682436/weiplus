package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class a0 implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c0 f149505d;

    public a0(com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var) {
        this.f149505d = c0Var;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "ILinkMemberMgr-mCheckMemberChangeTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.J(new com.tencent.mm.plugin.multitalk.ilinkservice.z(this));
    }
}
