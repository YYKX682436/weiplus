package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class i00 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f118611d;

    public i00(com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        this.f118611d = m10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
        this.f118611d.f119000b.statusChange(qo0.b.W, bundle);
    }
}
