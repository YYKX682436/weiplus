package w8;

/* loaded from: classes15.dex */
public final class g implements w8.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f443635a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.o[] f443636b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f443637c;

    /* renamed from: d, reason: collision with root package name */
    public int f443638d;

    /* renamed from: e, reason: collision with root package name */
    public int f443639e;

    /* renamed from: f, reason: collision with root package name */
    public long f443640f;

    public g(java.util.List list) {
        this.f443635a = list;
        this.f443636b = new q8.o[list.size()];
    }

    @Override // w8.h
    public void a(t9.p pVar) {
        boolean z17;
        boolean z18;
        if (this.f443637c) {
            if (this.f443638d == 2) {
                if (pVar.f416542c - pVar.f416541b == 0) {
                    z18 = false;
                } else {
                    if (pVar.m() != 32) {
                        this.f443637c = false;
                    }
                    this.f443638d--;
                    z18 = this.f443637c;
                }
                if (!z18) {
                    return;
                }
            }
            if (this.f443638d == 1) {
                if (pVar.f416542c - pVar.f416541b == 0) {
                    z17 = false;
                } else {
                    if (pVar.m() != 0) {
                        this.f443637c = false;
                    }
                    this.f443638d--;
                    z17 = this.f443637c;
                }
                if (!z17) {
                    return;
                }
            }
            int i17 = pVar.f416541b;
            int i18 = pVar.f416542c - i17;
            for (q8.o oVar : this.f443636b) {
                pVar.w(i17);
                oVar.a(pVar, i18);
            }
            this.f443639e += i18;
        }
    }

    @Override // w8.h
    public void b() {
        this.f443637c = false;
    }

    @Override // w8.h
    public void c() {
        if (this.f443637c) {
            for (q8.o oVar : this.f443636b) {
                oVar.b(this.f443640f, 1, this.f443639e, 0, null);
            }
            this.f443637c = false;
        }
    }

    @Override // w8.h
    public void d(long j17, boolean z17) {
        if (z17) {
            this.f443637c = true;
            this.f443640f = j17;
            this.f443639e = 0;
            this.f443638d = 2;
        }
    }

    @Override // w8.h
    public void e(q8.g gVar, w8.g0 g0Var) {
        int i17 = 0;
        while (true) {
            q8.o[] oVarArr = this.f443636b;
            if (i17 >= oVarArr.length) {
                return;
            }
            w8.d0 d0Var = (w8.d0) this.f443635a.get(i17);
            g0Var.a();
            g0Var.b();
            q8.o l17 = gVar.l(g0Var.f443644d, 3);
            g0Var.b();
            l17.c(com.google.android.exoplayer2.Format.d(g0Var.f443645e, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_DVBSUBS, null, -1, java.util.Collections.singletonList(d0Var.f443618b), d0Var.f443617a, null));
            oVarArr[i17] = l17;
            i17++;
        }
    }
}
