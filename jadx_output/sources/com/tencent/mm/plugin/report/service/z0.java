package com.tencent.mm.plugin.report.service;

/* loaded from: classes2.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ch f158330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f158331e;

    public z0(r45.ch chVar, java.util.Map.Entry entry) {
        this.f158330d = chVar;
        this.f158331e = entry;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList = this.f158330d.f371548d;
        if (linkedList != null) {
            linkedList.addAll((java.util.Collection) this.f158331e.getValue());
        }
        com.tencent.mm.plugin.report.service.b1.f158148a.g();
    }
}
