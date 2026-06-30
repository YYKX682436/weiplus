package xa3;

/* loaded from: classes9.dex */
public class m0 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f452802d;

    public m0() {
        super(0);
        this.f452802d = false;
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        int t17;
        int t18;
        com.tencent.mm.autogen.events.LocationServerEvent locationServerEvent = (com.tencent.mm.autogen.events.LocationServerEvent) iEvent;
        if (!(locationServerEvent instanceof com.tencent.mm.autogen.events.LocationServerEvent)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("LocationServerListener", "e.data.eventType : " + locationServerEvent.f54481g.f6559a);
        int i17 = locationServerEvent.f54481g.f6559a;
        if (i17 == 0) {
            va3.s Ai = va3.j0.Ai();
            java.lang.String str = locationServerEvent.f54481g.f6560b;
            Ai.getClass();
            Ai.f434340a = new java.util.HashSet();
            this.f452802d = true;
        } else if (i17 == 1) {
            va3.s Ai2 = va3.j0.Ai();
            com.tencent.mm.storage.f9 f9Var = locationServerEvent.f54481g.f6561c;
            Ai2.getClass();
            java.lang.String[] strArr = new java.lang.String[2];
            java.lang.String j17 = f9Var.j();
            if (com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                strArr[0] = "";
                strArr[1] = "";
            } else {
                boolean z17 = f9Var.A0() == 0;
                if (com.tencent.mm.storage.z3.R4(f9Var.Q0()) && z17 && (t18 = c01.w9.t(j17)) != -1) {
                    j17 = j17.substring(t18 + 1).trim();
                }
                com.tencent.mm.storage.b9 H6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().H6(j17);
                if (H6.b()) {
                    java.lang.String str2 = H6.f193779e;
                    java.lang.String str3 = H6.f193780f;
                    strArr[0] = str2;
                    strArr[1] = str3;
                } else {
                    strArr[0] = H6.f193779e;
                    strArr[1] = "";
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(strArr[0]) && com.tencent.mm.sdk.platformtools.t8.K0(strArr[1])) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LocationServer", "pull from sever");
                    int hashCode = f9Var.U1().hashCode();
                    java.util.Set set = Ai2.f434340a;
                    if (set != null) {
                        if (!((java.util.HashSet) set).contains(java.lang.Integer.valueOf(hashCode))) {
                            java.lang.String j18 = f9Var.j();
                            boolean z18 = f9Var.A0() == 0;
                            if (com.tencent.mm.storage.z3.R4(f9Var.Q0()) && z18 && (t17 = c01.w9.t(j18)) != -1) {
                                j18 = j18.substring(t17 + 1).trim();
                            }
                            com.tencent.mm.storage.b9 d17 = com.tencent.mm.storage.b9.d(j18);
                            ((java.util.HashSet) Ai2.f434340a).add(java.lang.Integer.valueOf(hashCode));
                            u60.h hVar = new u60.h(d17.f193776b, d17.f193777c);
                            hVar.f424873f = f9Var;
                            ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).b(hVar, Ai2.f434341b);
                        }
                    }
                }
            }
            am.fj fjVar = locationServerEvent.f54482h;
            fjVar.f6680a = strArr[0];
            fjVar.f6681b = strArr[1];
        } else if (i17 == 2 && this.f452802d) {
            va3.s Ai3 = va3.j0.Ai();
            java.util.Set set2 = Ai3.f434340a;
            if (set2 != null) {
                ((java.util.HashSet) set2).clear();
            }
            ((i11.g) ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi()).c(Ai3.f434341b);
        }
        return true;
    }
}
