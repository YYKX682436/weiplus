package di3;

/* loaded from: classes10.dex */
public class d extends android.view.OrientationEventListener implements r90.k {

    /* renamed from: d, reason: collision with root package name */
    public int f232686d;

    /* renamed from: e, reason: collision with root package name */
    public int f232687e;

    /* renamed from: f, reason: collision with root package name */
    public long f232688f;

    /* renamed from: g, reason: collision with root package name */
    public r90.j f232689g;

    /* renamed from: h, reason: collision with root package name */
    public int f232690h;

    public d(android.content.Context context) {
        super(context);
        this.f232686d = -1;
        this.f232687e = -1;
        this.f232688f = 0L;
        this.f232690h = -1;
    }

    public int a() {
        if (di3.w.f232767a) {
            return this.f232687e;
        }
        return 0;
    }

    public int b() {
        int a17 = a();
        if (a17 <= 60 || a17 >= 300) {
            return 0;
        }
        if (a17 <= 120) {
            return 90;
        }
        return a17 <= 210 ? 180 : 270;
    }

    public boolean c() {
        if (!di3.w.f232767a) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOrientationListener", "isLandscape,  orientation: %s", java.lang.Integer.valueOf(this.f232687e));
        int i17 = this.f232687e;
        if (i17 < 0) {
            return false;
        }
        return i17 == 90 || i17 == 270;
    }

    @Override // android.view.OrientationEventListener
    public void enable() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOrientationListener", "enable, config isEnableLandscapeMode: %s", java.lang.Boolean.valueOf(di3.w.f232767a));
        if (di3.w.f232767a) {
            super.enable();
        }
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        if (this.f232690h == -1) {
            this.f232690h = i17;
            if (i17 <= 60 || i17 >= 300) {
                if (i17 <= 30 || i17 >= 330) {
                    this.f232690h = 0;
                }
            } else if (i17 <= 150) {
                if (i17 <= 120) {
                    this.f232690h = 90;
                }
            } else if (i17 > 240) {
                this.f232690h = 270;
            } else if (i17 <= 210) {
                this.f232690h = 180;
            }
            r90.j jVar = this.f232689g;
            if (jVar != null) {
                jVar.onOrientationChange(this.f232690h);
            }
        }
        if (di3.w.f232767a && i17 >= 0 && i17 <= 360) {
            if (java.lang.Math.abs(this.f232686d - i17) < 30) {
                long j17 = this.f232688f;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (android.os.SystemClock.elapsedRealtime() - j17 < 300) {
                    return;
                }
            }
            this.f232686d = i17;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f232688f = android.os.SystemClock.elapsedRealtime();
            if (i17 <= 60 || i17 >= 300) {
                if (i17 <= 30 || i17 >= 330) {
                    this.f232687e = 0;
                }
            } else if (i17 < 30 || i17 > 150) {
                if (i17 < 120 || i17 > 240) {
                    if (i17 >= 210 && i17 <= 330 && i17 >= 240 && i17 <= 300) {
                        this.f232687e = 270;
                    }
                } else if (i17 >= 150 && i17 <= 210) {
                    this.f232687e = 180;
                }
            } else if (i17 >= 60 && i17 <= 120) {
                this.f232687e = 90;
            }
            r90.j jVar2 = this.f232689g;
            if (jVar2 != null) {
                jVar2.onOrientationChange(this.f232687e);
            }
        }
    }

    public d(android.content.Context context, int i17) {
        super(context, i17);
        this.f232686d = -1;
        this.f232687e = -1;
        this.f232688f = 0L;
        this.f232690h = -1;
    }
}
