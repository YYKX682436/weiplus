package qm;

/* loaded from: classes11.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f364625b;

    /* renamed from: c, reason: collision with root package name */
    public static final android.text.format.Time f364626c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f364627a;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f364625b = hashSet;
        hashSet.add("readerapp");
        hashSet.add("blogapp");
        hashSet.add("newsapp");
        f364626c = new android.text.format.Time();
    }

    public static boolean d(int i17, java.lang.String str) {
        boolean z17;
        ot0.q v17;
        if ((i17 & 65535) != 49 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        try {
            v17 = ot0.q.v(str);
        } catch (java.lang.Exception e17) {
            e = e17;
            z17 = false;
        }
        if (v17 == null) {
            return false;
        }
        java.util.Map map = v17.G2;
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.ext_pay_info.pay_outtradeno");
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.ext_pay_info.pay_feetype");
        if (str4 != null) {
            str3 = str4;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return false;
        }
        z17 = true;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Silent.Handle", "isPaySpeechMessage: true, outTradeNo:%s, feeType:%s", str2, str3);
        } catch (java.lang.Exception e18) {
            e = e18;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Notification.Silent.Handle", e, "parse ext_pay_info for pay speech check failed", new java.lang.Object[0]);
            return z17;
        }
        return z17;
    }

    public static boolean g(java.lang.StringBuilder sb6) {
        boolean i17 = ip.b.i();
        int ringerMode = ((android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio")).getRingerMode();
        if (ringerMode == 0) {
            i17 = false;
        }
        if (sb6 != null) {
            sb6.append("ShakeMode=");
            sb6.append(i17);
            sb6.append("; ");
            sb6.append("RingMode=");
            sb6.append(ringerMode);
            sb6.append("; ");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Silent.Handle", "check is Shake Mode: %B, System AudioManager Mode: %d", java.lang.Boolean.valueOf(i17), java.lang.Integer.valueOf(ringerMode));
        }
        return i17;
    }

    public static boolean i(java.lang.StringBuilder sb6) {
        boolean b17 = ip.b.b();
        if (sb6 != null) {
            sb6.append("SoundMode=");
            sb6.append(b17);
            sb6.append("; ");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Silent.Handle", "check is Sound Mode: %B", java.lang.Boolean.valueOf(b17));
        }
        return b17;
    }

    public final boolean a(boolean[] zArr, boolean z17) {
        boolean z18 = !z17;
        zArr[0] = zArr[0] & z17;
        zArr[1] = z17 & zArr[1];
        return z18;
    }

    public final boolean b(java.lang.String str, java.lang.StringBuilder sb6) {
        boolean contains = ((java.util.HashSet) com.tencent.mm.sdk.platformtools.c3.f192495a).contains("keep_chatting_silent" + str);
        if (sb6 != null) {
            sb6.append("SoundLocked=");
            sb6.append(contains);
            sb6.append("; ");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Silent.Handle", "check is Sound NOT Lock: %b", java.lang.Boolean.valueOf(contains));
        }
        return contains;
    }

    public boolean c(java.lang.String str, com.tencent.mm.storage.f9 f9Var, java.lang.StringBuilder sb6) {
        boolean z17 = false;
        if (ip.l.d(str)) {
            if (!(f9Var == null ? false : f9Var.s2(c01.z1.r()))) {
                z17 = true;
            }
        }
        if (sb6 != null) {
            sb6.append("MustMute=");
            sb6.append(z17);
            sb6.append("; ");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Silent.Handle", "check is NOT Must Mute: %B", java.lang.Boolean.valueOf(!z17));
        }
        return z17;
    }

    public boolean e(int i17, java.lang.StringBuilder sb6) {
        boolean z17 = (i17 & 2) != 0;
        if (sb6 != null) {
            sb6.append("ServiceRequestShake=");
            sb6.append(z17);
            sb6.append("; ");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Silent.Handle", "check is Service Request Shake: %B", java.lang.Boolean.valueOf(z17));
        }
        return z17;
    }

    public boolean f(int i17, java.lang.StringBuilder sb6) {
        boolean z17 = (i17 & 2) != 0;
        if (sb6 != null) {
            sb6.append("ServiceRequestSound=");
            sb6.append(z17);
            sb6.append("; ");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Silent.Handle", "check is Service Request Sound: %B", java.lang.Boolean.valueOf(z17));
        }
        return z17;
    }

    public boolean h(java.lang.String str, java.lang.StringBuilder sb6) {
        boolean contains = ((java.util.HashSet) f364625b).contains(str);
        if (sb6 != null) {
            sb6.append("SildeUser=");
            sb6.append(contains);
            sb6.append("; ");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Silent.Handle", "check is NOT Siler User: %B", java.lang.Boolean.valueOf(!contains));
        }
        return contains;
    }

    public boolean j() {
        try {
            com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
            voipEvent.f54945g.f8415b = 2;
            voipEvent.e();
            return voipEvent.f54946h.f8501b;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Notification.Silent.Handle", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public boolean k(int i17, java.lang.String str, java.lang.StringBuilder sb6) {
        boolean z17 = true;
        if (i17 == 50 || i17 == 53) {
            if (ip.l.g(str)) {
                z17 = ((java.lang.Boolean) gm0.j1.u().c().l(73217, java.lang.Boolean.TRUE)).booleanValue();
            } else if (ip.l.h(str)) {
                z17 = ((java.lang.Boolean) gm0.j1.u().c().l(73218, java.lang.Boolean.TRUE)).booleanValue();
            }
        }
        if (sb6 != null) {
            sb6.append("VoipNeedSound=");
            sb6.append(z17);
            sb6.append("; ");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Silent.Handle", "check is Voip Need Sound: %B", java.lang.Boolean.valueOf(z17));
        }
        return z17;
    }

    public boolean l(boolean z17, long j17, java.lang.StringBuilder sb6) {
        this.f364627a = false;
        if (((java.util.HashSet) com.tencent.mm.sdk.platformtools.c3.f192495a).contains("keep_app_silent")) {
            this.f364627a = true;
        } else if (java.lang.System.currentTimeMillis() > j17 && java.lang.System.currentTimeMillis() < j17 + 5000) {
            this.f364627a = z17;
        }
        if (sb6 != null) {
            sb6.append("RefreshSilent=");
            sb6.append(this.f364627a);
            sb6.append("; ");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Notification.Silent.Handle", "check Refresh Keep is NOT Silent: %B", java.lang.Boolean.valueOf(!this.f364627a));
        }
        return this.f364627a;
    }
}
