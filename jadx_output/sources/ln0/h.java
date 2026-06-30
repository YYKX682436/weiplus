package ln0;

/* loaded from: classes10.dex */
public final class h implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f319651d;

    public h(ln0.p pVar) {
        this.f319651d = pVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        ln0.p pVar = this.f319651d;
        java.util.Map p2pParamsMap = pVar.f319672a;
        kotlin.jvm.internal.o.f(p2pParamsMap, "p2pParamsMap");
        synchronized (p2pParamsMap) {
            java.util.Map p2pParamsMap2 = pVar.f319672a;
            kotlin.jvm.internal.o.f(p2pParamsMap2, "p2pParamsMap");
            java.util.Iterator it = p2pParamsMap2.entrySet().iterator();
            while (true) {
                boolean z17 = true;
                if (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    java.lang.String str = (java.lang.String) entry.getKey();
                    ln0.q qVar = (ln0.q) entry.getValue();
                    if (qVar.f319684a == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper doReport warning! p2pSwitch=" + qVar.f319684a + " streamId=" + str);
                    } else {
                        java.lang.String proxyOf = com.qcloud.qvb.XNet.proxyOf(pVar.f319674c);
                        kotlin.jvm.internal.o.f(proxyOf, "proxyOf(...)");
                        if (!kotlin.jvm.internal.o.b(proxyOf, pVar.f319674c)) {
                            if (proxyOf.length() != 0) {
                                z17 = false;
                            }
                            if (!z17) {
                                kotlin.jvm.internal.o.d(str);
                                pVar.f(proxyOf + ("stat?xresid=" + str), str);
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper doReport proxy " + proxyOf);
                    }
                }
            }
        }
        return true;
    }
}
