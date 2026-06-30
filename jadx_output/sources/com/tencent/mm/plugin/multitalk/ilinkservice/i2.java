package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.j2 f149608d;

    public i2(com.tencent.mm.plugin.multitalk.ilinkservice.j2 j2Var, java.util.ArrayList arrayList) {
        this.f149608d = j2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149608d.f149663a;
        if (i4Var.f149637n != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Multitalk.ILinkService", "hy: onSpeakerListChanged but not in room!");
        } else {
            i4Var.getClass();
        }
    }
}
