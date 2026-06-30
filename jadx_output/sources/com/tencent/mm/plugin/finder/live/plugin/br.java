package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class br implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f112067d;

    public br(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f112067d = etVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", false);
        this.f112067d.f112448p.statusChange(qo0.b.W, bundle);
    }
}
