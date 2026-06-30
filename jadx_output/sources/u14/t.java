package u14;

@j95.b
/* loaded from: classes5.dex */
public final class t extends i95.w implements wd0.l1 {
    public void Ai(java.lang.String eventId) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        java.lang.String a17 = com.tencent.mm.plugin.setting.ui.setting.ce.f160909a.a();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(eventId, kz5.b1.e(new jz5.l("care_session_id", a17)), 35684);
    }

    public void Bi(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidService", "WaveHAid, destroy haid inst");
        com.tencent.mm.plugin.setting.ui.setting.WaveAudioHAid.DestroyInst(j17);
    }

    public int Di() {
        int ordinal = Ui().ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                return 2;
            }
            if (ordinal == 4) {
                return 1;
            }
            if (ordinal == 5) {
                return 4;
            }
        }
        return 3;
    }

    public int Ni() {
        int i17 = (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui() ? new cv.v0(4, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6m), 0, 4, null) : ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj() ? new cv.v0(3, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6o), 0, 4, null) : ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Vi() ? new cv.v0(1, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6p), 0, 4, null) : new cv.v0(2, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6n), 0, 4, null)).f222516a;
        if (i17 != 1) {
            if (i17 == 2) {
                return 1;
            }
            if (i17 == 3 || i17 == 4) {
                return 3;
            }
        }
        return 2;
    }

    public final int Ri(wd0.g1 g1Var) {
        int ordinal = g1Var.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 100;
        }
        int i17 = 3;
        if (ordinal != 2) {
            if (ordinal == 3) {
                return 2;
            }
            i17 = 4;
            if (ordinal == 4) {
                return 1;
            }
            if (ordinal != 5) {
                throw new jz5.j();
            }
        }
        return i17;
    }

    public wd0.g1 Ui() {
        java.lang.String str;
        java.lang.Object m521constructorimpl;
        if (!j65.e.b()) {
            return wd0.g1.f444713e;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HearingAid_");
        long n17 = j62.e.g().n();
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            while (j17 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(wd0.g1.valueOf(java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.o4.M(sb7).getString("hearing_aid_mode_local", "CLOSE"))));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) != null) {
            m521constructorimpl = wd0.g1.f444713e;
        }
        return (wd0.g1) m521constructorimpl;
    }

    public wd0.g1 Vi() {
        java.lang.String str;
        java.lang.Object m521constructorimpl;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HearingAid_");
        long n17 = j62.e.g().n();
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            while (j17 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(wd0.g1.valueOf(java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.o4.M(sb7).getString("hearing_aid_mode_local_old", "CLOSE"))));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) != null) {
            m521constructorimpl = wd0.g1.f444713e;
        }
        return (wd0.g1) m521constructorimpl;
    }

    public wd0.g1 Zi() {
        java.lang.String str;
        java.lang.Object m521constructorimpl;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HearingAid_");
        long n17 = j62.e.g().n();
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            while (j17 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            int i18 = com.tencent.mm.sdk.platformtools.o4.M(sb7).getInt("hearing_aid_mode_remote", 0);
            m521constructorimpl = kotlin.Result.m521constructorimpl(i18 != 0 ? i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 100 ? wd0.g1.f444713e : wd0.g1.f444714f : wd0.g1.f444718m : wd0.g1.f444715g : wd0.g1.f444716h : wd0.g1.f444717i : wd0.g1.f444713e);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) != null) {
            m521constructorimpl = wd0.g1.f444713e;
        }
        return (wd0.g1) m521constructorimpl;
    }

    public int aj(long j17, int i17, int i18, int i19, int i27, int i28) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidService", "WaveHAid, init haid inst, type:" + i17 + ", device:" + i18 + ", scene:" + i19 + ", sr:" + i27 + ", ch:" + i28 + '.');
        return com.tencent.mm.plugin.setting.ui.setting.WaveAudioHAid.Init(j17, i17, i18, i19, i27, i28);
    }

    public boolean bj() {
        wd0.g1 Ui = Ui();
        return (Ui != wd0.g1.f444714f && Ui != wd0.g1.f444713e) && cj();
    }

    public boolean cj() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.haid.RepairerConfigHAidEnable()) == 1;
    }

    public void fj(kotlinx.coroutines.y0 lifecycleScope, wd0.g1 mode) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
        kotlin.jvm.internal.o.g(mode, "mode");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HearingAid_");
        long n17 = j62.e.g().n();
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            for (long j19 = 0; j17 > j19; j19 = 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidService", "current select mode (update set mode) is " + mode.name() + ", uin is " + sb7);
        kotlinx.coroutines.l.d(lifecycleScope, null, null, new com.tencent.mm.plugin.setting.ui.setting.dd(Ri(mode), null), 3, null);
        wd0.g1 Ui = Ui();
        wd0.g1 g1Var = wd0.g1.f444713e;
        if (Ui != g1Var) {
            com.tencent.mm.sdk.platformtools.o4.M(sb7).putString("hearing_aid_mode_local_old", Ui().name());
        }
        com.tencent.mm.sdk.platformtools.o4.M(sb7).putString("hearing_aid_mode_local", mode.name());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("before_value", java.lang.Integer.valueOf(Vi() == g1Var ? 2 : 1));
        hashMap.put("after_value", java.lang.Integer.valueOf(Ui() == g1Var ? 2 : 1));
        hashMap.put("vocals_enhance_mode", java.lang.Integer.valueOf(Ri(Ui())));
        jz5.g gVar = com.tencent.mm.plugin.setting.ui.setting.bm.f160878a;
        java.lang.String str2 = com.tencent.mm.plugin.setting.ui.setting.bm.f160879b;
        if (str2 == null) {
            str2 = (java.lang.String) ((jz5.n) com.tencent.mm.plugin.setting.ui.setting.bm.f160878a).getValue();
        }
        hashMap.put("care_mode_sessionid", str2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("vocals_enhance_btn", "set_vocal_enhance", hashMap, 35684);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        boolean bj6 = bj();
        int Di = Di();
        int Ni = Ni();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidService", "initXWebAudioHAidConfig, enable:" + bj6 + ", haidType:" + Di + ", haidDevice:" + Ni);
        com.tencent.xweb.s1.a(bj6, Di, Ni, null);
    }

    public long wi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidService", "WaveHAid, create haid inst.");
        return com.tencent.mm.plugin.setting.ui.setting.WaveAudioHAid.CreateInst();
    }
}
