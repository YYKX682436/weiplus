package zx3;

/* loaded from: classes10.dex */
public final class e extends zx3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(mx3.u helper) {
        super(helper);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f477104b = mx3.i.MULTITALK;
    }

    @Override // zx3.a
    public boolean a(java.lang.String str, int i17, boolean z17, long j17, java.lang.Boolean bool) {
        boolean d17;
        boolean k17;
        boolean z18;
        boolean z19;
        if (fp.h.c(29)) {
            d17 = ip.b.g(mx3.i0.h(""));
            k17 = ip.b.h(mx3.i0.h(""));
        } else {
            d17 = ip.b.d();
            k17 = ip.b.k();
        }
        if (z17) {
            d17 = true;
        }
        int i18 = 0;
        if (!d17 && !k17) {
            return false;
        }
        java.lang.String r17 = c01.z1.r();
        mx3.u uVar = this.f477103a;
        uVar.Vi(r17, z17, 0L);
        if (d17) {
            ym1.e eVar = ym1.f.f463134h;
            if (eVar.i()) {
                android.media.AudioManager audioManager = eVar.b().c();
                kotlin.jvm.internal.o.g(audioManager, "audioManager");
                if (audioManager.isBluetoothScoAvailableOffCall()) {
                    z18 = true;
                    boolean j18 = eVar.j();
                    if (mx3.f0.f332548a.k() ? !z17 : !(z18 || z17 || j18)) {
                        i18 = 2;
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    uVar.Di(vx3.d.f441273d, i18, true);
                    uVar.Vi(c01.z1.r(), z17, 0L);
                    if (k17 && !z17 && !j18 && !z18) {
                        uVar.Ri(true);
                    }
                    uVar.Ni(z19);
                }
            }
            z18 = false;
            boolean j182 = eVar.j();
            if (mx3.f0.f332548a.k()) {
                i18 = 2;
                z19 = true;
            } else {
                i18 = 2;
                z19 = true;
            }
            uVar.Di(vx3.d.f441273d, i18, true);
            uVar.Vi(c01.z1.r(), z17, 0L);
            if (k17) {
                uVar.Ri(true);
            }
            uVar.Ni(z19);
        } else if (k17 && !z17) {
            java.lang.String r18 = c01.z1.r();
            kotlin.jvm.internal.o.f(r18, "getUsernameFromUserInfo(...)");
            uVar.Ui(r18, z17);
        }
        return true;
    }
}
