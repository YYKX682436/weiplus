package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.a0 f149865d;

    public z(com.tencent.mm.plugin.multitalk.ilinkservice.a0 a0Var) {
        this.f149865d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = true;
        if (com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.f149637n != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Multitalk.ILinkMemberMgr", "hy: not in room, ignore speaker change");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        java.util.Iterator it = this.f149865d.f149505d.f149517a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.multitalk.ilinkservice.w wVar = (com.tencent.mm.plugin.multitalk.ilinkservice.w) it.next();
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.getClass();
            if (com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.GetVoiceActivity(wVar.f149840a) > 0) {
                arrayList.add(wVar);
            }
        }
        java.util.Collections.sort(arrayList, new com.tencent.mm.plugin.multitalk.ilinkservice.y(this));
        com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var = this.f149865d.f149505d;
        if (c0Var.f149526j != null) {
            if (arrayList.size() == c0Var.f149526j.size()) {
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    if (((com.tencent.mm.plugin.multitalk.ilinkservice.w) arrayList.get(i17)).f149840a == ((com.tencent.mm.plugin.multitalk.ilinkservice.w) c0Var.f149526j.get(i17)).f149840a) {
                    }
                }
            }
            z17 = false;
            break;
        }
        if (!z17) {
            synchronized (this.f149865d.f149505d.f149527k) {
                java.util.Iterator it6 = this.f149865d.f149505d.f149527k.iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.plugin.multitalk.ilinkservice.j2 j2Var = (com.tencent.mm.plugin.multitalk.ilinkservice.j2) ((com.tencent.mm.plugin.multitalk.ilinkservice.b0) it6.next());
                    j2Var.getClass();
                    j2Var.f149663a.J(new com.tencent.mm.plugin.multitalk.ilinkservice.i2(j2Var, arrayList));
                }
            }
        }
        this.f149865d.f149505d.f149526j = arrayList;
    }
}
