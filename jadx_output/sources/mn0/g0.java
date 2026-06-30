package mn0;

/* loaded from: classes5.dex */
public final class g0 {
    public g0(kotlin.jvm.internal.i iVar) {
    }

    public final void a() {
        kotlinx.coroutines.r2 r2Var = mn0.i0.L;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        mn0.i0.L = kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new mn0.f0(null), 2, null);
    }

    public final void b(java.lang.String source, long j17) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("LiveTXPlayerTicker", "setOutsideTouchUpTimestamp: source=" + source + ", timestamp=" + j17);
        mn0.i0.I = j17;
    }
}
