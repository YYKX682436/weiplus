package com.tencent.mm.ui.chatting;

/* loaded from: classes4.dex */
public final /* synthetic */ class n9$$b implements yz5.l {
    @Override // yz5.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i17 = ((b12.l) obj).f17073d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringEggRpt", "18914 eggRpt: " + b12.k.f17067h + ", 8, " + b12.k.f17068i + ", sessionId: " + b12.k.f17064e + ", reason: " + i17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18914, b12.k.f17067h, b12.k.f17061b, b12.k.f17062c, b12.k.f17063d, b12.k.f17064e, b12.k.f17065f, 8, "", java.lang.Integer.valueOf(b12.k.f17068i), "", java.lang.Integer.valueOf(i17));
        return null;
    }
}
