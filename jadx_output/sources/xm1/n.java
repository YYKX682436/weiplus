package xm1;

/* loaded from: classes14.dex */
public class n extends xm1.h {
    @Override // xm1.h
    public boolean A(boolean z17) {
        c().getMode();
        ym1.e eVar = ym1.f.f463134h;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPAudioManager", "dkbt shiftSpeaker:%b -> %b", java.lang.Boolean.valueOf(eVar.k()), java.lang.Boolean.valueOf(z17));
        boolean z18 = false;
        if (!com.tencent.mm.sdk.platformtools.l5.Bi()) {
            if (!eVar.i() && !this.f455171c) {
                wo.c cVar = wo.v1.f447823c;
                if (cVar.f447589a) {
                    if (cVar.b()) {
                        int i17 = cVar.f447593c;
                        if (i17 >= 0) {
                            xm1.h.y(this, i17, null, 2, null);
                        } else if (cVar.f447595d >= 0) {
                            if (z17) {
                                xm1.h.y(this, 0, null, 2, null);
                            } else {
                                xm1.h.y(this, 2, null, 2, null);
                            }
                        }
                        if (cVar.f447597e <= 0) {
                            return z17;
                        }
                        a(z17);
                        return z17;
                    }
                    if (cVar.a()) {
                        if (!z17) {
                            if (cVar.a() && (cVar.f447599f & 1) > 0) {
                                a(false);
                            }
                            if (cVar.d() < 0) {
                                return z17;
                            }
                            xm1.h.y(this, cVar.d(), null, 2, null);
                            return z17;
                        }
                        if (cVar.a() && (cVar.f447599f & 16) > 0) {
                            z18 = true;
                        }
                        if (z18) {
                            a(true);
                        }
                        if (cVar.e() < 0) {
                            return z17;
                        }
                        xm1.h.y(this, cVar.e(), null, 2, null);
                        return z17;
                    }
                }
                if (z17) {
                    kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                    f0Var.f310116d = 3;
                    int i18 = cVar.B;
                    if (i18 > -1) {
                        f0Var.f310116d = i18;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPAudioManager", "VoIP doShiftSpeaker useSpeakerMode: %s, getMode: %s", java.lang.Integer.valueOf(f0Var.f310116d), java.lang.Integer.valueOf(f()));
                    if (f0Var.f310116d != f()) {
                        x(f0Var.f310116d, new xm1.l(f0Var, this));
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPAudioManager", "voip doShiftSpeaker true isSpeakerphoneOn: %s", java.lang.Boolean.valueOf(c().isSpeakerphoneOn()));
                    a(true);
                    return z17;
                }
                kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
                f0Var2.f310116d = 3;
                if (fp.e0.g() && 2 == wo.v1.f447833m.f447750h) {
                    f0Var2.f310116d = 2;
                }
                int i19 = cVar.C;
                if (i19 > -1) {
                    f0Var2.f310116d = i19;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPAudioManager", "VoIP doShiftSpeaker usePhoneMode: %s getMode:%s", java.lang.Integer.valueOf(f0Var2.f310116d), java.lang.Integer.valueOf(f()));
                if (f0Var2.f310116d != f()) {
                    x(f0Var2.f310116d, new xm1.m(f0Var2, this));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPAudioManager", "VoIP doShiftSpeaker false isSpeakerphoneOn: %s", java.lang.Boolean.valueOf(c().isSpeakerphoneOn()));
                a(false);
                return z17;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPAudioManager", "dkbt shiftSpeaker isBluetoothOn");
            xm1.h.y(this, 3, null, 2, null);
        }
        return false;
    }
}
