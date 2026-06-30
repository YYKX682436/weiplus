package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.d3 f176915d;

    public x2(com.tencent.mm.plugin.voip.model.d3 d3Var) {
        this.f176915d = d3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176915d;
        int b17 = d3Var.f176411a.A.b();
        byte[] array = java.nio.ByteBuffer.allocate(4).putInt(b17).array();
        d3Var.f176411a.f176532x.setJNIAppCmd(16, array, array.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "audio play volume: %d", java.lang.Integer.valueOf(b17));
    }
}
