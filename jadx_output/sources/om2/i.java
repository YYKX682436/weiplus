package om2;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final r45.yx1 f346321a;

    /* renamed from: b, reason: collision with root package name */
    public final int f346322b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.ia4 f346323c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.ha4 f346324d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ga4 f346325e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f346326f;

    /* renamed from: g, reason: collision with root package name */
    public int f346327g;

    /* renamed from: h, reason: collision with root package name */
    public int f346328h;

    /* renamed from: i, reason: collision with root package name */
    public int f346329i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f346330j;

    /* renamed from: k, reason: collision with root package name */
    public om2.h f346331k;

    /* renamed from: l, reason: collision with root package name */
    public final mm2.a f346332l;

    /* renamed from: m, reason: collision with root package name */
    public final mm2.a f346333m;

    /* renamed from: n, reason: collision with root package name */
    public final mm2.a f346334n;

    /* renamed from: o, reason: collision with root package name */
    public final mm2.a f346335o;

    /* renamed from: p, reason: collision with root package name */
    public final mm2.a f346336p;

    /* renamed from: q, reason: collision with root package name */
    public int f346337q;

    public i(r45.yx1 songInfo, int i17, r45.ia4 ktvState, r45.ha4 ktvProgress, r45.ga4 ktvNote, java.lang.String actUniqueId, com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole) {
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        kotlin.jvm.internal.o.g(ktvState, "ktvState");
        kotlin.jvm.internal.o.g(ktvProgress, "ktvProgress");
        kotlin.jvm.internal.o.g(ktvNote, "ktvNote");
        kotlin.jvm.internal.o.g(actUniqueId, "actUniqueId");
        this.f346321a = songInfo;
        this.f346322b = i17;
        this.f346323c = ktvState;
        this.f346324d = ktvProgress;
        this.f346325e = ktvNote;
        this.f346326f = actUniqueId;
        this.f346332l = new mm2.a("bluetoothDuration");
        this.f346333m = new mm2.a("wiredDuration");
        this.f346334n = new mm2.a("soundcardDuration");
        this.f346335o = new mm2.a("speakerphoneDuration");
        this.f346336p = new mm2.a("eapiceDuration");
    }

    public final void a(r45.yx1 yx1Var) {
        r45.ay1 ay1Var;
        java.lang.String str;
        java.lang.String str2;
        r45.ay1 ay1Var2;
        r45.ia4 ia4Var = this.f346323c;
        java.lang.String str3 = "";
        if (!kotlin.jvm.internal.o.b(ia4Var != null ? ia4Var.f376870e : null, yx1Var != null ? yx1Var.f391459e : null)) {
            java.lang.String str4 = ia4Var != null ? ia4Var.f376871f : null;
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String str5 = ia4Var != null ? ia4Var.f376870e : null;
            if (str5 == null) {
                str5 = "";
            }
            java.lang.String str6 = ia4Var != null ? ia4Var.f376869d : null;
            if (str6 == null) {
                str6 = "";
            }
            java.lang.String str7 = ia4Var != null ? ia4Var.f376872g : null;
            if (str7 == null) {
                str7 = "";
            }
            this.f346331k = new om2.h(str4, str5, str6, str7);
        }
        if (yx1Var != null) {
            if (ia4Var != null) {
                java.lang.String str8 = yx1Var.f391469r;
                if (str8 == null) {
                    str8 = "";
                }
                ia4Var.f376871f = str8;
            }
            if (ia4Var != null) {
                java.lang.String str9 = yx1Var.f391459e;
                if (str9 == null) {
                    str9 = "";
                }
                ia4Var.f376870e = str9;
            }
            if (ia4Var != null) {
                r45.by1 by1Var = yx1Var.f391466o;
                if (by1Var == null || (ay1Var2 = by1Var.f371143d) == null || (str2 = ay1Var2.f370350d) == null) {
                    str2 = "";
                }
                ia4Var.f376869d = str2;
            }
            if (ia4Var == null) {
                return;
            }
            r45.by1 by1Var2 = yx1Var.f391466o;
            if (by1Var2 != null && (ay1Var = by1Var2.f371143d) != null && (str = ay1Var.f370351e) != null) {
                str3 = str;
            }
            ia4Var.f376872g = str3;
        }
    }

    public final int b() {
        int i17;
        synchronized (this.f346323c) {
            r45.ia4 ia4Var = this.f346323c;
            if (ia4Var.B && (i17 = this.f346337q) > 0) {
                return ia4Var.f376875m / i17;
            }
            int i18 = ia4Var.f376875m;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(ia4Var.f376881s);
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            return i18 / (valueOf != null ? valueOf.intValue() : 1);
        }
    }

    public final java.lang.String c() {
        java.lang.String str;
        synchronized (this.f346323c) {
            r45.ia4 ia4Var = this.f346323c;
            str = ia4Var != null ? ia4Var.f376870e : null;
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    public final java.lang.String d() {
        java.lang.String str;
        synchronized (this.f346323c) {
            r45.ia4 ia4Var = this.f346323c;
            str = ia4Var != null ? ia4Var.f376871f : null;
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    public final void e() {
        synchronized (this.f346323c) {
            r45.ia4 ia4Var = this.f346323c;
            if (ia4Var != null) {
                ia4Var.f376877o = true;
            }
        }
        g();
    }

    public final void f(int i17) {
        h(i17);
        synchronized (this.f346323c) {
            r45.ia4 ia4Var = this.f346323c;
            if (ia4Var != null) {
                ia4Var.f376877o = false;
            }
        }
    }

    public final void g() {
        mm2.a.b(this.f346335o, false, 1, null);
        mm2.a.b(this.f346336p, false, 1, null);
        mm2.a.b(this.f346333m, false, 1, null);
        mm2.a.b(this.f346332l, false, 1, null);
        mm2.a.b(this.f346334n, false, 1, null);
    }

    public final void h(int i17) {
        java.lang.System.currentTimeMillis();
        if (i17 == 0) {
            this.f346335o.c();
            return;
        }
        if (i17 == 1) {
            this.f346336p.c();
            return;
        }
        if (i17 == 2) {
            this.f346333m.c();
        } else if (i17 == 3) {
            this.f346332l.c();
        } else {
            if (i17 != 4) {
                return;
            }
            this.f346334n.c();
        }
    }

    public final java.lang.String i(int i17) {
        return i17 >= 95 ? "SSS" : i17 >= 90 ? "SS" : i17 >= 85 ? androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH : i17 >= 65 ? androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS : i17 >= 45 ? "B" : "C";
    }

    public final void j(r45.y84 state, r45.yx1 yx1Var) {
        java.lang.String str;
        r45.by1 by1Var;
        r45.ay1 ay1Var;
        kotlin.jvm.internal.o.g(state, "state");
        synchronized (this.f346323c) {
            com.tencent.mars.xlog.Log.i("LiveKTVSingerSEIData", "updateSingState " + state.ordinal() + " nextSongInfo: " + yx1Var);
            r45.y84 y84Var = r45.y84.LIVE_KTV_SING_STATE_ADVANCE;
            if (state != y84Var || yx1Var != null) {
                r45.ia4 ia4Var = this.f346323c;
                if (ia4Var != null) {
                    ia4Var.f376874i = state.ordinal();
                }
                if (state == r45.y84.LIVE_KTV_SING_STATE_END) {
                    r45.ia4 ia4Var2 = this.f346323c;
                    if (ia4Var2 != null) {
                        ia4Var2.f376876n = i(b());
                    }
                    r45.ia4 ia4Var3 = this.f346323c;
                    if (ia4Var3 != null) {
                        if (yx1Var == null || (by1Var = yx1Var.f391466o) == null || (ay1Var = by1Var.f371143d) == null || (str = ay1Var.f370351e) == null) {
                            str = "";
                        }
                        ia4Var3.f376880r = str;
                    }
                }
                if (state == y84Var) {
                    a(yx1Var);
                }
            }
        }
    }

    public final void k(int i17, int i18, float f17, int i19) {
        synchronized (this.f346323c) {
            r45.ia4 ia4Var = this.f346323c;
            if (ia4Var != null) {
                ia4Var.f376875m = i18;
            }
            if (ia4Var != null) {
                ia4Var.f376879q = i17;
            }
            if (ia4Var != null) {
                ia4Var.f376881s = i19;
            }
            boolean z17 = false;
            if (ia4Var != null && ia4Var.f376874i == 3) {
                z17 = true;
            }
            if (z17 && ia4Var != null) {
                ia4Var.f376876n = i(b());
            }
        }
    }

    public final void l(boolean z17) {
        int i17;
        synchronized (this.f346323c) {
            r45.ia4 ia4Var = this.f346323c;
            if (ia4Var != null) {
                if (z17) {
                    int i18 = ia4Var.f376883u;
                    java.util.regex.Pattern pattern = pm0.v.f356802a;
                    i17 = i18 | 1;
                } else {
                    int i19 = ia4Var.f376883u;
                    java.util.regex.Pattern pattern2 = pm0.v.f356802a;
                    i17 = i19 & (-2);
                }
                ia4Var.f376883u = i17;
            }
        }
    }
}
