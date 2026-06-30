package ni3;

/* loaded from: classes10.dex */
public final class w0 implements ni3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni3.a1 f337751a;

    public w0(ni3.a1 a1Var) {
        this.f337751a = a1Var;
    }

    @Override // ni3.a
    public void a(int i17, int i18) {
        ni3.a1 a1Var = this.f337751a;
        ni3.a1.a(a1Var, i17).f337640c = c01.id.a();
        ni3.a1.a(a1Var, i17).f337641d = i18;
        long j17 = ni3.a1.a(a1Var, i17).f337640c - ni3.a1.a(a1Var, i17).f337639b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiEnd tabType:");
        sb6.append(i17);
        sb6.append(" time:");
        sb6.append(j17);
        sb6.append(" size:");
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = a1Var.f337527c;
        if (dataBuffer == null) {
            kotlin.jvm.internal.o.o(ya.b.SOURCE);
            throw null;
        }
        sb6.append(dataBuffer.size());
        sb6.append(" remainSize:");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("FinderStreamVideoLoadStrategyMonitor", sb6.toString());
    }

    @Override // ni3.a
    public void b(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiStart tabType:");
        sb6.append(i17);
        sb6.append(" size:");
        ni3.a1 a1Var = this.f337751a;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = a1Var.f337527c;
        if (dataBuffer == null) {
            kotlin.jvm.internal.o.o(ya.b.SOURCE);
            throw null;
        }
        sb6.append(dataBuffer.size());
        com.tencent.mars.xlog.Log.i("FinderStreamVideoLoadStrategyMonitor", sb6.toString());
        ni3.a1.a(a1Var, i17).f337639b = c01.id.a();
    }
}
