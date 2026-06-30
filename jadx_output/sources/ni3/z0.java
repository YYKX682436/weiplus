package ni3;

/* loaded from: classes10.dex */
public final class z0 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ni3.a1 f337761g;

    public z0(ni3.a1 a1Var) {
        this.f337761g = a1Var;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        if (event instanceof fc2.t) {
            int i17 = ((fc2.t) event).f260985d;
            return i17 == 0 || i17 == 7 || i17 == 6;
        }
        if (!(event instanceof ec2.f)) {
            return false;
        }
        int i18 = ((ec2.f) event).f250959d;
        return i18 == 1 || i18 == 19 || i18 == 3 || i18 == 4 || i18 == 6 || i18 == 11 || i18 == 22 || i18 == 23;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof fc2.t;
        ni3.a1 a1Var = this.f337761g;
        if (!z17) {
            if (ev6 instanceof ec2.f) {
                pm0.v.X(new ni3.y0(ev6, a1Var));
                return;
            }
            return;
        }
        long j17 = ((fc2.t) ev6).f260992k;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = a1Var.f337527c;
        if (dataBuffer == null) {
            kotlin.jvm.internal.o.o(ya.b.SOURCE);
            throw null;
        }
        a1Var.i("onFocus", dataBuffer, a1Var.f337531g);
        a1Var.f337525a.f337662i = j17;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer2 = a1Var.f337527c;
        if (dataBuffer2 == null) {
            kotlin.jvm.internal.o.o(ya.b.SOURCE);
            throw null;
        }
        java.util.Iterator<T> it = dataBuffer2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((so2.j5) obj).getItemId() == j17) {
                    break;
                }
            }
        }
        so2.j5 j5Var = (so2.j5) obj;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer3 = a1Var.f337527c;
        if (dataBuffer3 == null) {
            kotlin.jvm.internal.o.o(ya.b.SOURCE);
            throw null;
        }
        java.util.Iterator<T> it6 = dataBuffer3.iterator();
        int i17 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((so2.j5) it6.next()).getItemId() == j17) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (!(j5Var instanceof so2.u1)) {
            com.tencent.mars.xlog.Log.i("FinderStreamVideoLoadStrategyMonitor", "onFocus return for ".concat(a1Var.e(i17, j5Var)));
            return;
        }
        ni3.p0 f17 = a1Var.f(j17);
        if (f17 != null) {
            f17.f337674e = true;
            ni3.o0 o0Var = f17.f337671b;
            o0Var.f337650d = i17;
            o0Var.a(hc2.b0.h(j5Var, false, 1, null));
        }
        com.tencent.mars.xlog.Log.i("FinderStreamVideoLoadStrategyMonitor", "onFocus ".concat(a1Var.e(i17, j5Var)));
    }
}
