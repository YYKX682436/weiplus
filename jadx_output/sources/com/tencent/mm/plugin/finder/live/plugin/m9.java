package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class m9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.o9 f113472d;

    public m9(com.tencent.mm.plugin.finder.live.plugin.o9 o9Var) {
        this.f113472d = o9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hn0.f fVar;
        in0.q B1 = this.f113472d.B1();
        if (B1 == null || (fVar = B1.f420773t) == null) {
            return;
        }
        ((hn0.p) fVar).j(dk2.ef.f233372a.G());
    }
}
