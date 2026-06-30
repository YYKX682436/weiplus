package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f183351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(long j17) {
        super(0);
        this.f183351d = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.plugin.webview.modeltools.s0(this.f183351d));
        return jz5.f0.f302826a;
    }
}
