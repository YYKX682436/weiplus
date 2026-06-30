package mx3;

@j95.b
/* loaded from: classes10.dex */
public final class u extends i95.w implements mx3.j {

    /* renamed from: f, reason: collision with root package name */
    public static final mx3.s f332620f = new mx3.s(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f332621d = jz5.h.b(mx3.t.f332619d);

    /* renamed from: e, reason: collision with root package name */
    public zx3.a f332622e;

    public final yx3.v Ai() {
        return (yx3.v) ((jz5.n) this.f332621d).getValue();
    }

    public boolean Bi(mx3.i iVar, android.os.Bundle params) {
        java.lang.String string;
        yx3.v Ai;
        kotlin.jvm.internal.o.g(params, "params");
        zx3.a aVar = this.f332622e;
        if (aVar == null || aVar.f477104b != iVar) {
            if (iVar == mx3.i.VOIP) {
                this.f332622e = new zx3.d(this);
            } else if (iVar == mx3.i.MULTITALK) {
                this.f332622e = new zx3.c(this);
            } else if (iVar == mx3.i.WMPF_CALL_IN) {
                this.f332622e = new zx3.e(this);
            } else if (iVar == mx3.i.ILINK_VOIP) {
                this.f332622e = new zx3.b(this);
            }
        }
        zx3.a aVar2 = this.f332622e;
        if (aVar2 == null || (string = params.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) == null) {
            return false;
        }
        int hashCode = string.hashCode();
        ym1.e eVar = ym1.f.f463134h;
        mx3.u uVar = aVar2.f477103a;
        switch (hashCode) {
            case -346633629:
                if (!string.equals("bad_net")) {
                    return false;
                }
                int i17 = params.getInt("streamType");
                if (!eVar.i() && !eVar.j() && (kotlin.jvm.internal.o.b(eVar.a(), "silent") || kotlin.jvm.internal.o.b(eVar.a(), "vibrate"))) {
                    return false;
                }
                try {
                    uVar.Di(vx3.d.f441274e, i17, false);
                    uVar.Vi(null, false, 0L);
                    uVar.Ni(eVar.k());
                    break;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BaseSceneSetting", "playSound Failed Throwable t = ", th6);
                    return false;
                }
            case 100571:
                if (!string.equals("end")) {
                    return false;
                }
                int i18 = params.getInt("streamType");
                if (!eVar.i() && !eVar.j() && (kotlin.jvm.internal.o.b(eVar.a(), "silent") || kotlin.jvm.internal.o.b(eVar.a(), "vibrate"))) {
                    return false;
                }
                try {
                    uVar.Di(vx3.d.f441274e, i18, false);
                    uVar.Vi(null, false, 0L);
                    if ((eVar.i() || eVar.j()) && (Ai = uVar.Ai()) != null) {
                        yx3.k kVar = Ai.f467943c;
                        if (kVar != null) {
                            kVar.a(0.5f, 0.5f);
                            Ai.f467950j = -1.0f;
                        } else {
                            Ai.f467950j = 0.5f;
                        }
                    }
                    uVar.Ni(eVar.k());
                    break;
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BaseSceneSetting", "playSound Failed Throwable t = ", th7);
                    return false;
                }
                break;
            case 94756344:
                if (!string.equals("close")) {
                    return false;
                }
                if (aVar2.f477105c) {
                    aVar2.f477106d = true;
                }
                yx3.v Ai2 = uVar.Ai();
                if (Ai2 != null) {
                    Ai2.d(vx3.b.f441266f);
                    break;
                }
                break;
            case 106440182:
                if (!string.equals("pause")) {
                    return false;
                }
                yx3.v Ai3 = uVar.Ai();
                if (Ai3 != null) {
                    Ai3.d(vx3.b.f441264d);
                    break;
                }
                break;
            case 109757538:
                if (!string.equals("start")) {
                    return false;
                }
                aVar2.f477105c = true;
                boolean a17 = aVar2.a(params.getString(dm.i4.COL_USERNAME), params.getInt("isVideoCall"), params.getBoolean("isOutCall"), params.getLong("seekStartMs"), params.containsKey("isSpeakOn") ? java.lang.Boolean.valueOf(params.getBoolean("isSpeakOn")) : null);
                aVar2.f477105c = false;
                if (aVar2.f477106d) {
                    aVar2.f477106d = false;
                    yx3.v Ai4 = uVar.Ai();
                    if (Ai4 != null) {
                        Ai4.d(vx3.b.f441266f);
                    }
                }
                return a17;
            default:
                return false;
        }
        return true;
    }

    public void Di(vx3.d soundType, int i17, boolean z17) {
        int i18;
        kotlin.jvm.internal.o.g(soundType, "soundType");
        yx3.v Ai = Ai();
        if (Ai != null) {
            Ai.f467945e = new vx3.c(soundType, i17, z17);
            ym1.e eVar = ym1.f.f463134h;
            if (eVar.b().k()) {
                i18 = eVar.c();
            } else {
                vx3.c cVar = Ai.f467945e;
                i18 = cVar != null ? cVar.f441271b : 0;
            }
            Ai.A = eVar.b().h(i18);
        }
    }

    public void Ni(boolean z17) {
        yx3.v Ai = Ai();
        if (Ai != null) {
            Ai.f(z17);
        }
    }

    public boolean Ri(boolean z17) {
        yx3.v Ai;
        java.lang.String a17 = ym1.f.f463134h.a();
        if ((kotlin.jvm.internal.o.b(a17, "vibrate") || kotlin.jvm.internal.o.b(a17, "normal")) && (Ai = Ai()) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneServiceHelper", "updateVibrateInfo");
            Ai.f467958r = true;
        }
        return true;
    }

    public boolean Ui(java.lang.String name, boolean z17) {
        yx3.v Ai;
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.String a17 = ym1.f.f463134h.a();
        if ((kotlin.jvm.internal.o.b(a17, "vibrate") || kotlin.jvm.internal.o.b(a17, "normal")) && (Ai = Ai()) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneServiceHelper", "updateRingtoneInfo name:" + name + ", isOutCall:" + z17 + ", seekStartMs:" + Ai.f467946f);
            Ai.f467941a = Ai.f467944d;
            Ai.f467944d = null;
            Ai.f467947g = z17;
            Ai.f467950j = -1.0f;
            kotlinx.coroutines.r2 r2Var = Ai.f467951k;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            Ai.f467951k = kotlinx.coroutines.l.d(Ai.f467952l, null, null, new yx3.s(Ai, name, z17, null), 3, null);
        }
        return true;
    }

    public void Vi(java.lang.String str, boolean z17, long j17) {
        yx3.v Ai = Ai();
        if (Ai != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneServiceHelper", "updateRingtoneInfo name:" + str + ", isOutCall:" + z17 + ", seekStartMs:" + j17);
            Ai.f467941a = Ai.f467944d;
            Ai.f467944d = null;
            Ai.f467946f = j17;
            Ai.f467947g = z17;
            Ai.f467950j = -1.0f;
            kotlinx.coroutines.r2 r2Var = Ai.f467951k;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            Ai.f467951k = kotlinx.coroutines.l.d(Ai.f467952l, null, null, new yx3.u(Ai, str, z17, null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        ?? r37;
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        mx3.i0 i0Var = mx3.i0.f332577a;
        if (gm0.j1.b().n()) {
            mx3.i0.n();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                mx3.i0 i0Var2 = mx3.i0.f332577a;
                com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneManager", "deleteNonMyVoipChannel");
                try {
                    if (gm0.j1.b().n()) {
                        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("notification");
                        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
                        java.lang.String[] b17 = i0Var2.e().b();
                        if (b17 != null) {
                            r37 = new java.util.ArrayList();
                            for (java.lang.String str : b17) {
                                kotlin.jvm.internal.o.d(str);
                                vx3.i i17 = mx3.i0.i(str);
                                java.lang.String str2 = i17 != null ? i17.f441295l : null;
                                if (str2 != null) {
                                    r37.add(str2);
                                }
                            }
                        } else {
                            r37 = kz5.p0.f313996d;
                        }
                        r37.toString();
                        for (android.app.NotificationChannel notificationChannel : notificationManager.getNotificationChannels()) {
                            java.lang.String id6 = notificationChannel.getId();
                            kotlin.jvm.internal.o.f(id6, "getId(...)");
                            if (r26.n0.B(id6, "voip_ringtone_channel_", false) && !r37.contains(notificationChannel.getId())) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneManager", "deleteNonMyVoipChannel id:%s", notificationChannel.getId());
                                notificationManager.deleteNotificationChannel(notificationChannel.getId());
                            }
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.RingtoneManager", "deleteNonMyVoipChannel error: " + e17.getLocalizedMessage());
                }
            }
        }
        ((com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) ((iz2.c) pf5.u.f353936a.e(zy2.b6.class).c(iz2.c.class))).f136733g.add(com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI.class);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        kotlinx.coroutines.r2 r2Var = mx3.i0.f332584h;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        mx3.i0.f332584h = null;
    }

    public nx3.a wi() {
        int i17;
        yx3.v Ai = Ai();
        if (Ai == null) {
            return null;
        }
        Ai.f467961u = java.lang.System.currentTimeMillis() - Ai.f467959s;
        ym1.e eVar = ym1.f.f463134h;
        if (eVar.b().k()) {
            i17 = eVar.c();
        } else {
            vx3.c cVar = Ai.f467945e;
            i17 = cVar != null ? cVar.f441271b : 0;
        }
        nx3.a aVar = new nx3.a(Ai.f467965y == vx3.g.f441282i, Ai.f467961u, Ai.f467960t, java.lang.String.valueOf(Ai.B), Ai.f467966z, Ai.f467962v, Ai.E, Ai.D, eVar.b().h(i17), i17, Ai.A, !kotlin.jvm.internal.o.b(eVar.a(), "normal"), Ai.C, Ai.f467964x, Ai.f467963w);
        Ai.f467959s = 0L;
        Ai.f467961u = 0L;
        Ai.f467962v = true;
        Ai.f467963w = "";
        Ai.f467965y = vx3.g.f441279f;
        Ai.f467966z = "";
        Ai.B = 0;
        Ai.E = false;
        Ai.A = 0;
        return aVar;
    }
}
