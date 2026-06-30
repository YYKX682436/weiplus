package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f155427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.l f155428e;

    public k(com.tencent.mm.plugin.record.ui.l lVar, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f155428e = lVar;
        this.f155427d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f155427d.dismiss();
        com.tencent.mm.plugin.record.ui.l lVar = this.f155428e;
        long j17 = lVar.f155435d.f155449d.f155455d.f155258v;
        lVar.f155435d.f155449d.f155455d.finish();
    }
}
