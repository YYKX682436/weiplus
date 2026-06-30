package com.tencent.mm.plugin.record.ui;

/* loaded from: classes5.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f155425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.k2 f155426e;

    public j2(com.tencent.mm.plugin.record.ui.k2 k2Var, int i17) {
        this.f155426e = k2Var;
        this.f155425d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f155426e.f155434g.f155340d.f(this.f155425d, false);
    }
}
