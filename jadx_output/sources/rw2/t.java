package rw2;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public int f400624a;

    /* renamed from: b, reason: collision with root package name */
    public int f400625b;

    /* renamed from: d, reason: collision with root package name */
    public rs0.h f400627d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f400628e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f400629f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f400630g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f400631h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.SurfaceTexture f400632i;

    /* renamed from: j, reason: collision with root package name */
    public is0.c f400633j;

    /* renamed from: l, reason: collision with root package name */
    public dk4.a f400635l;

    /* renamed from: m, reason: collision with root package name */
    public is0.c f400636m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f400637n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.p f400638o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f400639p;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f400626c = "MicroMsg.TPTrackThumbRenderer@" + hashCode();

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.xeffect.VLogDirector f400634k = new com.tencent.mm.xeffect.VLogDirector();

    static {
        p05.l4.R.b();
    }

    public t(int i17, int i18) {
        this.f400624a = i17;
        this.f400625b = i18;
    }

    public static final void a(rw2.t tVar, long j17) {
        int i17;
        int i18;
        tVar.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j18 = j17 / 1000000;
        if (java.lang.Math.abs(j18 - tVar.f400639p) > 100) {
            return;
        }
        com.tencent.mars.xlog.Log.i(tVar.f400626c, "renderFrame " + j18 + ' ' + j17);
        is0.c cVar = tVar.f400633j;
        int i19 = cVar != null ? cVar.f294395e : 0;
        if (i19 <= 0) {
            return;
        }
        dk4.a aVar = tVar.f400635l;
        int i27 = aVar != null ? aVar.f234485v : 0;
        int i28 = aVar != null ? aVar.f234486w : 0;
        java.lang.Integer valueOf = aVar != null ? java.lang.Integer.valueOf(aVar.f234474k) : null;
        if (valueOf == null || valueOf.intValue() != 0) {
            if (valueOf != null && valueOf.intValue() == 90) {
                i17 = 1;
            } else if (valueOf != null && valueOf.intValue() == 180) {
                i17 = 2;
            } else if (valueOf != null && valueOf.intValue() == 270) {
                i17 = 3;
            }
            i18 = i17;
            if (i27 > 0 || i28 <= 0) {
            }
            tq5.f fVar = new tq5.f(i19, i27, i28, true, i18);
            fVar.f421262g.setEmpty();
            fVar.f421263h.set(0, 0, i27, i28);
            rm5.o.a(fVar.f421263h, new android.graphics.Rect(0, 0, tVar.f400624a, tVar.f400625b));
            java.util.List c17 = kz5.b0.c(fVar);
            is0.c cVar2 = tVar.f400636m;
            int i29 = cVar2 != null ? cVar2.f294395e : 0;
            if (i29 <= 0) {
                return;
            }
            if (tVar.f400637n) {
                android.opengl.GLES20.glBindTexture(3553, i29);
                android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, tVar.f400624a, tVar.f400625b, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
                android.opengl.GLES20.glBindTexture(3553, 0);
            }
            tVar.f400634k.d(c17, i29, j18);
            if (tVar.f400638o != null) {
                android.graphics.Bitmap v17 = rs0.i.f399296a.v(i29, tVar.f400624a, tVar.f400625b);
                yz5.p pVar = tVar.f400638o;
                if (pVar != null) {
                    pVar.invoke(v17, java.lang.Long.valueOf(tVar.f400639p));
                }
            }
            rs0.h hVar = tVar.f400627d;
            if (hVar != null) {
                rs0.i.f399296a.x(hVar.f399292a, hVar.f399293b);
            }
            tVar.f400637n = false;
            com.tencent.mars.xlog.Log.i(tVar.f400626c, "renderFrame cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return;
        }
        i18 = 0;
        if (i27 > 0) {
        }
    }

    public final void b(final yz5.a call) {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        kotlin.jvm.internal.o.g(call, "call");
        android.os.HandlerThread handlerThread = this.f400628e;
        boolean z17 = false;
        if (handlerThread != null && handlerThread.isAlive()) {
            z17 = true;
        }
        if (!z17 || (n3Var = this.f400629f) == null) {
            return;
        }
        n3Var.post(new java.lang.Runnable(call) { // from class: rw2.r

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f400622d;

            {
                kotlin.jvm.internal.o.g(call, "function");
                this.f400622d = call;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f400622d.invoke();
            }
        });
    }
}
