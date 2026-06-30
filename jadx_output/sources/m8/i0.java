package m8;

/* loaded from: classes15.dex */
public class i0 implements m8.i {

    /* renamed from: a, reason: collision with root package name */
    public final m8.b0[] f324560a;

    /* renamed from: b, reason: collision with root package name */
    public final m8.i f324561b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f324562c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f324563d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f324564e;

    /* renamed from: f, reason: collision with root package name */
    public final int f324565f;

    /* renamed from: g, reason: collision with root package name */
    public final int f324566g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.exoplayer2.Format f324567h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.android.exoplayer2.Format f324568i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.Surface f324569j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f324570k;

    /* renamed from: l, reason: collision with root package name */
    public float f324571l;

    public i0(m8.e0 e0Var, q9.o oVar, m8.u uVar) {
        m8.g0 g0Var = new m8.g0(this, null);
        this.f324562c = new java.util.concurrent.CopyOnWriteArraySet();
        this.f324563d = new java.util.concurrent.CopyOnWriteArraySet();
        this.f324564e = new java.util.concurrent.CopyOnWriteArraySet();
        android.os.Handler handler = new android.os.Handler(android.os.Looper.myLooper() != null ? android.os.Looper.myLooper() : android.os.Looper.getMainLooper());
        m8.d dVar = (m8.d) e0Var;
        dVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.content.Context context = dVar.f324552a;
        y8.e eVar = y8.e.f459813a;
        arrayList.add(new u9.i(context, eVar, 5000L, null, false, handler, g0Var, 50));
        arrayList.add(new n8.b0(eVar, null, true, handler, g0Var, n8.d.a(dVar.f324552a), new n8.f[0]));
        arrayList.add(new i9.l(g0Var, handler.getLooper()));
        arrayList.add(new z8.g(g0Var, handler.getLooper()));
        m8.b0[] b0VarArr = (m8.b0[]) arrayList.toArray(new m8.b0[arrayList.size()]);
        this.f324560a = b0VarArr;
        int i17 = 0;
        int i18 = 0;
        for (m8.b0 b0Var : b0VarArr) {
            int i19 = ((m8.a) b0Var).f324535d;
            if (i19 == 1) {
                i18++;
            } else if (i19 == 2) {
                i17++;
            }
        }
        this.f324565f = i17;
        this.f324566g = i18;
        this.f324571l = 1.0f;
        this.f324561b = new m8.k(this.f324560a, oVar, uVar);
    }

    @Override // m8.a0
    public void a(m8.y yVar) {
        ((m8.k) this.f324561b).a(yVar);
    }

    @Override // m8.i
    public void b(m8.h... hVarArr) {
        ((m8.k) this.f324561b).b(hVarArr);
    }

    @Override // m8.a0
    public boolean c() {
        return ((m8.k) this.f324561b).f324581i;
    }

    @Override // m8.a0
    public void d(m8.z zVar) {
        ((m8.k) this.f324561b).d(zVar);
    }

    @Override // m8.a0
    public void e(boolean z17) {
        ((m8.k) this.f324561b).e(z17);
    }

    @Override // m8.i
    public void f(m8.h... hVarArr) {
        ((m8.k) this.f324561b).f(hVarArr);
    }

    public void g(m8.z zVar) {
        ((m8.k) this.f324561b).f324577e.add(zVar);
    }

    @Override // m8.a0
    public long getCurrentPosition() {
        return ((m8.k) this.f324561b).getCurrentPosition();
    }

    @Override // m8.a0
    public long getDuration() {
        return ((m8.k) this.f324561b).getDuration();
    }

    public int h() {
        return ((m8.k) this.f324561b).g();
    }

    public final void i() {
    }

    public void j(int i17) {
        int i18 = t9.d0.f416498a;
        int i19 = 4;
        int i27 = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 4 ? i17 != 5 ? i17 != 8 ? 1 : 3 : 5 : 4 : 6 : 13 : 2;
        if (i17 == 0) {
            i19 = 1;
        } else if (i17 != 1 && i17 != 2 && i17 != 4 && i17 != 5 && i17 != 8) {
            i19 = 2;
        }
        n8.c cVar = new n8.c(i19, 0, i27, null);
        m8.h[] hVarArr = new m8.h[this.f324566g];
        int i28 = 0;
        for (m8.b0 b0Var : this.f324560a) {
            if (((m8.a) b0Var).f324535d == 1) {
                hVarArr[i28] = new m8.h(b0Var, 3, cVar);
                i28++;
            }
        }
        ((m8.k) this.f324561b).f(hVarArr);
    }

    public void k(int i17) {
        m8.k kVar = (m8.k) this.f324561b;
        if (kVar.f324582j != i17) {
            kVar.f324582j = i17;
            kVar.f324576d.f324649i.obtainMessage(12, i17, 0).sendToTarget();
            java.util.Iterator it = kVar.f324577e.iterator();
            while (it.hasNext()) {
                ((m8.z) it.next()).z(i17);
            }
        }
    }

    public final void l(android.view.Surface surface, boolean z17) {
        m8.h[] hVarArr = new m8.h[this.f324565f];
        int i17 = 0;
        for (m8.b0 b0Var : this.f324560a) {
            if (((m8.a) b0Var).f324535d == 2) {
                hVarArr[i17] = new m8.h(b0Var, 1, surface);
                i17++;
            }
        }
        android.view.Surface surface2 = this.f324569j;
        m8.i iVar = this.f324561b;
        if (surface2 == null || surface2 == surface) {
            ((m8.k) iVar).f(hVarArr);
        } else {
            ((m8.k) iVar).b(hVarArr);
            if (this.f324570k) {
                this.f324569j.release();
            }
        }
        this.f324569j = surface;
        this.f324570k = z17;
    }

    public void m(float f17) {
        this.f324571l = f17;
        m8.h[] hVarArr = new m8.h[this.f324566g];
        int i17 = 0;
        for (m8.b0 b0Var : this.f324560a) {
            if (((m8.a) b0Var).f324535d == 1) {
                hVarArr[i17] = new m8.h(b0Var, 2, java.lang.Float.valueOf(f17));
                i17++;
            }
        }
        ((m8.k) this.f324561b).f(hVarArr);
    }

    public void n() {
        ((m8.k) this.f324561b).f324576d.f324649i.sendEmptyMessage(5);
    }

    @Override // m8.a0
    public void release() {
        ((m8.k) this.f324561b).release();
        i();
        android.view.Surface surface = this.f324569j;
        if (surface != null) {
            if (this.f324570k) {
                surface.release();
            }
            this.f324569j = null;
        }
    }

    @Override // m8.a0
    public void seekTo(long j17) {
        ((m8.k) this.f324561b).seekTo(j17);
    }

    @Override // m8.a0
    public int t() {
        return ((m8.k) this.f324561b).f324583k;
    }
}
