package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f114274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f114275e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(com.tencent.mm.plugin.finder.live.plugin.hm hmVar, long j17) {
        super(0);
        this.f114274d = hmVar;
        this.f114275e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f114274d;
        java.lang.String str = hmVar.f112831r;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setBalance: balance:");
        long j17 = this.f114275e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        android.widget.TextView textView = hmVar.B;
        if (j17 < 0) {
            java.lang.String str2 = hmVar.f112831r;
            com.tencent.mars.xlog.Log.i(str2, "setBalance: invalid balance:" + j17);
            dk2.xf W0 = hmVar.W0();
            java.lang.Long valueOf = W0 != null ? java.lang.Long.valueOf(((dk2.r4) W0).U()) : null;
            com.tencent.mars.xlog.Log.i(str2, "getBalanceFromCache: balance:" + valueOf);
            if (valueOf != null) {
                valueOf.longValue();
                if (valueOf.longValue() >= 0) {
                    textView.setText(java.lang.String.valueOf(valueOf));
                    if (!hmVar.H) {
                        hmVar.H = true;
                        hmVar.N1();
                    }
                }
            }
        } else {
            textView.setText(java.lang.String.valueOf(j17));
            if (!hmVar.H) {
                hmVar.H = true;
                hmVar.N1();
            }
        }
        return jz5.f0.f302826a;
    }
}
