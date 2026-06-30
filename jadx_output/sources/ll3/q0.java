package ll3;

/* loaded from: classes10.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ll3.q0 f319210a = new ll3.q0();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f319211b = false;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f319212c = "";

    /* renamed from: d, reason: collision with root package name */
    public static b21.t f319213d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f319214e = true;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f319215f = "";

    /* renamed from: g, reason: collision with root package name */
    public static b21.t f319216g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f319217h;

    public static final void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicFloatBallManager", "removeMusicFloatBall needStopMusic: %s", java.lang.Boolean.valueOf(z17));
        f319214e = z17;
        f319210a.a(z17);
    }

    public static final void d(b21.r rVar) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = rVar != null ? java.lang.Boolean.valueOf(rVar.T) : null;
        objArr[1] = java.lang.Boolean.valueOf(f319211b);
        objArr[2] = rVar != null ? java.lang.Boolean.valueOf(rVar.N) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicFloatBallManager", "resumeMusicFloatBallIfNeed isFromNewMusicPlayer: %s, isMusicMvMode: %s, showMusicFloatBall: %s", objArr);
        if (!(rVar != null && rVar.N)) {
            b(false);
            return;
        }
        if (rVar.T || f319211b) {
            rVar.T = true;
            ll3.b1 b1Var = ll3.b1.f319140a;
            ll3.b1.f319141b.p0(rVar);
        } else {
            ll3.j0 j0Var = ll3.i0.f319181a;
            if (j0Var != null) {
                j0Var.p0(rVar);
            }
        }
    }

    public static final void e(b21.r rVar, b21.t tVar) {
        java.lang.String str;
        r45.xs4 xs4Var;
        java.lang.String string;
        java.lang.String str2;
        r45.xs4 xs4Var2;
        r45.xs4 xs4Var3;
        java.lang.String str3 = "";
        if (rVar == null || (str = rVar.f17346e) == null) {
            str = tVar != null ? tVar.f17365a : null;
            if (str == null) {
                str = "";
            }
        }
        f319212c = str;
        f319213d = tVar;
        boolean z17 = (rVar != null && rVar.T) || !(tVar == null || zy2.qc.a(tVar.f17366b));
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = f319212c;
        objArr[1] = rVar != null ? java.lang.Boolean.valueOf(rVar.T) : null;
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = (tVar == null || (xs4Var3 = tVar.f17366b) == null) ? null : xs4Var3.getString(14);
        objArr[4] = (tVar == null || (xs4Var2 = tVar.f17366b) == null) ? null : xs4Var2.getString(4);
        objArr[5] = rVar != null ? java.lang.Boolean.valueOf(rVar.N) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicFloatBallManager", "updateMusicInfo musicId: %s, isFromNewMusicPlayer: %s, isValid: %s, song: %s, %s, showMusicBall: %s", objArr);
        if (!z17) {
            f319211b = false;
            ll3.b1 b1Var = ll3.b1.f319140a;
            ll3.e1 e1Var = ll3.b1.f319141b;
            e1Var.v0(null, true);
            e1Var.x0(null);
            return;
        }
        f319211b = true;
        java.lang.String str4 = tVar != null ? tVar.f17367c : null;
        if (str4 == null || str4.length() == 0) {
            if (tVar != null && (xs4Var = tVar.f17366b) != null) {
                string = xs4Var.getString(13);
            }
            string = null;
        } else {
            if (tVar != null) {
                string = tVar.f17367c;
            }
            string = null;
        }
        if (string == null || string.length() == 0) {
            if (rVar != null && (str2 = rVar.f17351m) != null) {
                str3 = str2;
            }
            string = str3;
        }
        ll3.b1 b1Var2 = ll3.b1.f319140a;
        ll3.e1 e1Var2 = ll3.b1.f319141b;
        e1Var2.v0(string, rVar != null && rVar.N);
        e1Var2.x0(tVar != null ? tVar.f17366b : null);
    }

    public static final void f(android.os.Bundle bundle) {
        if (bundle != null) {
            f319211b = true;
        }
        ll3.b1.f319140a.getClass();
        ll3.b1.f319141b.w0(bundle);
    }

    public final void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicFloatBallManager", "removeMusicBall reset: " + z17);
        ll3.i0.f319181a.d();
        ll3.b1 b1Var = ll3.b1.f319140a;
        ll3.b1.f319141b.d();
        if (z17) {
            c();
        }
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicFloatBallManager", "resetMusicMvInfo");
        f319211b = false;
        f319213d = null;
        ll3.b1.f319140a.getClass();
        ll3.b1.f319141b.x0(null);
        ll3.b1.f319140a.getClass();
        ll3.b1.f319141b.w0(null);
    }
}
