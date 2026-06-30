package com.tencent.mm.plugin.report.service;

/* loaded from: classes12.dex */
public class b implements com.tencent.mm.plugin.report.service.IKVReportNotify {
    @Override // com.tencent.mm.plugin.report.service.IKVReportNotify
    public void onReportKVDataReady(byte[] bArr, byte[] buffer, int i17) {
        bm5.f1.a();
        ((lx3.n) ((com.tencent.mm.plugin.report.service.k) i95.n0.c(com.tencent.mm.plugin.report.service.k.class))).getClass();
        kotlin.jvm.internal.o.g(buffer, "buffer");
        new lx3.h(buffer, i17).doScene(com.tencent.mm.network.x2.c(), lx3.m.f322106d);
    }
}
