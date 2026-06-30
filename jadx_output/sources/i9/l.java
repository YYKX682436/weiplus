package i9;

/* loaded from: classes15.dex */
public final class l extends m8.a implements android.os.Handler.Callback {
    public int A;

    /* renamed from: o, reason: collision with root package name */
    public final android.os.Handler f289673o;

    /* renamed from: p, reason: collision with root package name */
    public final i9.k f289674p;

    /* renamed from: q, reason: collision with root package name */
    public final i9.h f289675q;

    /* renamed from: r, reason: collision with root package name */
    public final m8.s f289676r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f289677s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f289678t;

    /* renamed from: u, reason: collision with root package name */
    public int f289679u;

    /* renamed from: v, reason: collision with root package name */
    public com.google.android.exoplayer2.Format f289680v;

    /* renamed from: w, reason: collision with root package name */
    public i9.e f289681w;

    /* renamed from: x, reason: collision with root package name */
    public i9.i f289682x;

    /* renamed from: y, reason: collision with root package name */
    public i9.j f289683y;

    /* renamed from: z, reason: collision with root package name */
    public i9.j f289684z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i9.k kVar, android.os.Looper looper) {
        super(3);
        i9.h hVar = i9.h.f289669a;
        kVar.getClass();
        this.f289674p = kVar;
        this.f289673o = looper == null ? null : new android.os.Handler(looper, this);
        this.f289675q = hVar;
        this.f289676r = new m8.s();
    }

    @Override // m8.c0
    public int c(com.google.android.exoplayer2.Format format) {
        ((i9.g) this.f289675q).getClass();
        java.lang.String str = format.f44080i;
        if ("text/vtt".equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.TEXT_SSA.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_TTML.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_MP4VTT.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_SUBRIP.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_TX3G.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_CEA608.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_MP4CEA608.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_CEA708.equals(str) || com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 4;
        }
        return com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT.equals(t9.k.b(format.f44080i)) ? 1 : 0;
    }

    @Override // m8.b0
    public boolean h() {
        return this.f289678t;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what != 0) {
            throw new java.lang.IllegalStateException();
        }
        this.f289674p.a((java.util.List) message.obj);
        return true;
    }

    @Override // m8.b0
    public void i(long j17, long j18) {
        boolean z17;
        m8.s sVar = this.f289676r;
        if (this.f289678t) {
            return;
        }
        if (this.f289684z == null) {
            this.f289681w.b(j17);
            try {
                this.f289684z = (i9.j) this.f289681w.dequeueOutputBuffer();
            } catch (i9.f e17) {
                throw m8.e.a(e17, this.f324537f);
            }
        }
        if (this.f324538g != 2) {
            return;
        }
        if (this.f289683y != null) {
            long s17 = s();
            z17 = false;
            while (s17 <= j17) {
                this.A++;
                s17 = s();
                z17 = true;
            }
        } else {
            z17 = false;
        }
        i9.j jVar = this.f289684z;
        if (jVar != null) {
            if (jVar.b(4)) {
                if (!z17 && s() == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                    if (this.f289679u == 2) {
                        t();
                        this.f289681w.release();
                        this.f289681w = null;
                        this.f289679u = 0;
                        this.f289681w = ((i9.g) this.f289675q).a(this.f289680v);
                    } else {
                        t();
                        this.f289678t = true;
                    }
                }
            } else if (this.f289684z.f343613e <= j17) {
                i9.j jVar2 = this.f289683y;
                if (jVar2 != null) {
                    jVar2.l();
                }
                i9.j jVar3 = this.f289684z;
                this.f289683y = jVar3;
                this.f289684z = null;
                this.A = jVar3.i(j17);
                z17 = true;
            }
        }
        if (z17) {
            java.util.List j19 = this.f289683y.j(j17);
            android.os.Handler handler = this.f289673o;
            if (handler != null) {
                handler.obtainMessage(0, j19).sendToTarget();
            } else {
                this.f289674p.a(j19);
            }
        }
        if (this.f289679u == 2) {
            return;
        }
        while (!this.f289677s) {
            try {
                if (this.f289682x == null) {
                    i9.i iVar = (i9.i) this.f289681w.a();
                    this.f289682x = iVar;
                    if (iVar == null) {
                        return;
                    }
                }
                if (this.f289679u == 1) {
                    i9.i iVar2 = this.f289682x;
                    iVar2.f343594d = 4;
                    this.f289681w.c(iVar2);
                    this.f289682x = null;
                    this.f289679u = 2;
                    return;
                }
                int r17 = r(sVar, this.f289682x, false);
                if (r17 == -4) {
                    if (this.f289682x.b(4)) {
                        this.f289677s = true;
                    } else {
                        i9.i iVar3 = this.f289682x;
                        iVar3.f289670i = sVar.f324666a.C;
                        iVar3.f343610f.flip();
                    }
                    this.f289681w.c(this.f289682x);
                    this.f289682x = null;
                } else if (r17 == -3) {
                    return;
                }
            } catch (i9.f e18) {
                throw m8.e.a(e18, this.f324537f);
            }
        }
    }

    @Override // m8.b0
    public boolean isReady() {
        return true;
    }

    @Override // m8.a
    public void l() {
        this.f289680v = null;
        java.util.List emptyList = java.util.Collections.emptyList();
        android.os.Handler handler = this.f289673o;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f289674p.a(emptyList);
        }
        t();
        this.f289681w.release();
        this.f289681w = null;
        this.f289679u = 0;
    }

    @Override // m8.a
    public void n(long j17, boolean z17) {
        java.util.List emptyList = java.util.Collections.emptyList();
        android.os.Handler handler = this.f289673o;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f289674p.a(emptyList);
        }
        this.f289677s = false;
        this.f289678t = false;
        if (this.f289679u == 0) {
            t();
            this.f289681w.flush();
            return;
        }
        t();
        this.f289681w.release();
        this.f289681w = null;
        this.f289679u = 0;
        this.f289681w = ((i9.g) this.f289675q).a(this.f289680v);
    }

    @Override // m8.a
    public void q(com.google.android.exoplayer2.Format[] formatArr, long j17) {
        com.google.android.exoplayer2.Format format = formatArr[0];
        this.f289680v = format;
        if (this.f289681w != null) {
            this.f289679u = 1;
        } else {
            this.f289681w = ((i9.g) this.f289675q).a(format);
        }
    }

    public final long s() {
        int i17 = this.A;
        return (i17 == -1 || i17 >= this.f289683y.h()) ? com.tencent.wcdb.core.Database.DictDefaultMatchValue : this.f289683y.a(this.A);
    }

    public final void t() {
        this.f289682x = null;
        this.A = -1;
        i9.j jVar = this.f289683y;
        if (jVar != null) {
            jVar.l();
            this.f289683y = null;
        }
        i9.j jVar2 = this.f289684z;
        if (jVar2 != null) {
            jVar2.l();
            this.f289684z = null;
        }
    }
}
