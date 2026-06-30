package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class e80 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.f0 f112379d;

    public e80(cm2.f0 f0Var) {
        this.f112379d = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            f52Var.set(0, 7);
            cm2.f0 f0Var = this.f112379d;
            f52Var.set(2, new com.tencent.mm.protobuf.g(f0Var.f43342v.toByteArray()));
            f52Var.set(4, java.lang.Long.valueOf(f0Var.f43385d));
            f52Var.set(5, f0Var.f43387f);
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
            k0Var.statusChange(bVar, bundle);
        }
    }
}
