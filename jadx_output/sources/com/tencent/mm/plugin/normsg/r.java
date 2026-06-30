package com.tencent.mm.plugin.normsg;

/* loaded from: classes13.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f152418d;

    public r(com.tencent.mm.plugin.normsg.s sVar, android.os.Bundle bundle) {
        this.f152418d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NormsgSourceImpl", "run wkat");
        w04.l.INSTANCE.pe(this.f152418d.getByteArray("WKWAR"));
    }
}
