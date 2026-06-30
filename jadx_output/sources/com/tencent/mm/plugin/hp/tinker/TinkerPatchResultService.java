package com.tencent.mm.plugin.hp.tinker;

/* loaded from: classes11.dex */
public class TinkerPatchResultService implements ak0.c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService f142403a = new com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService();

    /* renamed from: b, reason: collision with root package name */
    public static b83.m f142404b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f142405c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f142406d = {"com.tencent.mm.plugin.base.stub.WXPayEntryActivity", "com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI", "com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI"};

    /* renamed from: e, reason: collision with root package name */
    public static boolean f142407e = false;

    /* JADX WARN: Multi-variable type inference failed */
    public static int a() {
        boolean d17 = d(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
        voipEvent.f54945g.f8415b = 2;
        voipEvent.e();
        boolean z17 = d17;
        if (voipEvent.f54946h.f8501b) {
            z17 = (d17 ? 1 : 0) | 2;
        }
        boolean z18 = z17;
        if (iq.b.H()) {
            z18 = (z17 ? 1 : 0) | 4;
        }
        int i17 = z18;
        if (c()) {
            i17 = (z18 ? 1 : 0) | 8;
        }
        boolean z19 = false;
        try {
            jm4.u2 a17 = jm4.w2.f300435d.a();
            if (a17 != null) {
                if (((jm4.g3) urgen.ur_0025.UR_8227.UR_EDB6(((jm4.w2) a17).getCppPointer())) != null) {
                    z19 = true;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.TinkerPatchResultService", th6, "fail to check if ting audio is playing.", new java.lang.Object[0]);
        }
        if (z19) {
            i17 = (i17 == true ? 1 : 0) | 16;
        }
        if (i17 == 0) {
            b(true);
        } else {
            com.tencent.mars.xlog.Log.w("Tinker.TinkerPatchResultService", "not hit condition, skip suicide this time. reason code: %d", java.lang.Integer.valueOf(i17));
        }
        return i17;
    }

    public static void b(boolean z17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (f142407e) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.w("Tinker.TinkerPatchResultService", "[+] do not call suicide more than one time @ %s", new com.tencent.mm.sdk.platformtools.z3());
        } else {
            f142407e = true;
            com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchResultService", "app is background now, i can kill quietly");
            com.tencent.mars.xlog.Log.appenderFlushSync();
            ((bt.b1) k35.p.f303943a).a(context, z17);
        }
    }

    public static boolean c() {
        try {
            for (java.lang.String str : f142406d) {
                if (b83.l.f18325d.contains(str)) {
                    com.tencent.mars.xlog.Log.w("Tinker.TinkerPatchResultService", "found activity '%s' belongs to pay routine.", str);
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.TinkerPatchResultService", th6, "fail to check if we're in pay routine.", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean d(android.content.Context context) {
        try {
            for (android.view.Display display : ((android.hardware.display.DisplayManager) context.getApplicationContext().getSystemService("display")).getDisplays()) {
                if (display.getState() == 2) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.TinkerPatchResultService", th6, "Fail to fetch status of displays.", new java.lang.Object[0]);
            return false;
        }
    }

    public static void prepareSuicide() {
        if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigTinkerSuicideDisableV2()) != 0) {
            com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchResultService", "Use tinker suicide strategy V1.");
            new w11.f1(com.tencent.mm.sdk.platformtools.x2.f193071a, new b83.k(), false);
            return;
        }
        com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchResultService", "Use tinker suicide strategy V2.");
        if (f142405c) {
            com.tencent.mars.xlog.Log.i("Tinker.TinkerPatchResultService", "Skip waiting for suicide, it is already prepared.");
        } else {
            f142405c = true;
            com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(new b83.n(null));
        }
    }
}
