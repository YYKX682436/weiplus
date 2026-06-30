package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f158548a;

    /* renamed from: b, reason: collision with root package name */
    public final qx3.o f158549b;

    public y1() {
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);
        this.f158548a = a17;
        qx3.o oVar = new qx3.o(a17);
        this.f158549b = oVar;
        kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(oVar.f367374d, null, null, new qx3.n(oVar, null), 3, null);
        oVar.f367383p = d17;
        ((kotlinx.coroutines.c3) d17).start();
    }

    public final void a(vx3.i item, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayUIC", "on play ringtone " + item.n() + ",and id is " + j17 + " with action is play " + z17);
        qx3.o oVar = this.f158549b;
        dk4.a aVar = item.f441284a;
        oVar.P6(item, j17, z17, true, aVar != null ? aVar.f234475l : false);
    }
}
