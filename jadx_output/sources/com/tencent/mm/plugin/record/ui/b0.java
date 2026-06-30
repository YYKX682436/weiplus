package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.h0 f155351d;

    public b0(com.tencent.mm.plugin.record.ui.h0 h0Var) {
        this.f155351d = h0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f155351d.notifyDataSetChanged();
    }
}
