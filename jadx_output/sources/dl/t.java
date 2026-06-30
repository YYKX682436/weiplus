package dl;

/* loaded from: classes10.dex */
public class t extends dl.b {
    public android.graphics.RectF A;
    public android.graphics.RectF B;
    public final android.graphics.Rect C;
    public xk0.c D;
    public boolean E;
    public boolean F;
    public boolean G;
    public ok.c H;
    public dl.c0 I;

    /* renamed from: J, reason: collision with root package name */
    public final hk0.v f235121J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public android.animation.ValueAnimator W;
    public final android.graphics.Rect X;
    public int Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f235122a0;

    /* renamed from: q, reason: collision with root package name */
    public final int f235123q;

    /* renamed from: r, reason: collision with root package name */
    public int f235124r;

    /* renamed from: s, reason: collision with root package name */
    public final int f235125s;

    /* renamed from: t, reason: collision with root package name */
    public final int f235126t;

    /* renamed from: u, reason: collision with root package name */
    public final int f235127u;

    /* renamed from: v, reason: collision with root package name */
    public final int f235128v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Matrix f235129w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Rect f235130x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.RectF f235131y;

    /* renamed from: z, reason: collision with root package name */
    public android.graphics.RectF f235132z;

    public t() {
        int dimension = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480149po);
        this.f235123q = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.afj);
        this.f235124r = dimension;
        this.f235125s = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.aqh);
        this.f235126t = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.apd);
        this.f235127u = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480413x8);
        this.f235128v = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480258sr);
        this.f235129w = new android.graphics.Matrix();
        this.C = new android.graphics.Rect();
        this.E = false;
        this.F = true;
        this.G = false;
        this.f235121J = new hk0.v();
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = true;
        this.X = new android.graphics.Rect();
        this.Y = 0;
        this.Z = false;
        this.f235122a0 = false;
    }

    public static void G(dl.t tVar, long j17, boolean z17, boolean z18) {
        android.animation.ValueAnimator valueAnimator = tVar.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofInt("alpha", 0, 255), z17 ? android.animation.PropertyValuesHolder.ofInt("bg_alpha", 282, 255) : z18 ? android.animation.PropertyValuesHolder.ofInt("bg_alpha", 255, 255) : android.animation.PropertyValuesHolder.ofInt("bg_alpha", 0, 255));
        tVar.W = ofPropertyValuesHolder;
        ofPropertyValuesHolder.addUpdateListener(new dl.o(tVar));
        tVar.W.addListener(new dl.p(tVar));
        tVar.W.setStartDelay(j17);
        tVar.W.setDuration(300L);
        tVar.W.start();
    }

    public static void H(dl.t tVar) {
        dl.c0 c0Var = tVar.I;
        if (c0Var != null) {
            c0Var.f235064e.E = true;
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "resetBoxClipRect");
            android.graphics.Rect rect = c0Var.f235063d;
            float width = (rect.width() * 1.0f) / rect.height();
            if (((l45.n) c0Var.f235064e.f235039a).f316465f == null) {
                com.tencent.mars.xlog.Log.w("FixRatioCropHelper", "[resetBoxRect] getImageBitmap is null!");
            } else {
                float f17 = c0Var.f235062c;
                if (width > f17) {
                    float height = (rect.height() * f17) / 2.0f;
                    rect.set((int) (rect.centerX() - height), rect.top, (int) (rect.centerX() + height), rect.bottom);
                } else {
                    float width2 = (rect.width() / f17) / 2.0f;
                    rect.set(rect.left, (int) (rect.centerY() - width2), rect.right, (int) (rect.centerY() + width2));
                }
            }
            float min = java.lang.Math.min((c0Var.f235061b.width() * 1.0f) / c0Var.f235063d.width(), (c0Var.f235061b.height() * 1.0f) / c0Var.f235063d.height());
            float centerX = c0Var.f235061b.centerX();
            float centerY = c0Var.f235061b.centerY() - c0Var.f235063d.centerY();
            ku5.u0 u0Var = ku5.t0.f312615d;
            dl.a0 a0Var = new dl.a0(c0Var, min, centerX - c0Var.f235063d.centerX(), centerY);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(a0Var, 0L, false);
        }
    }

    @Override // dl.b
    public void A(java.lang.String str) {
    }

    @Override // dl.b
    public void B() {
        super.B();
        android.view.View actionBar = ((l45.n) this.f235039a).f316460a.getActionBar();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(actionBar, arrayList.toArray(), "com/tencent/mm/artists/CropArtist", "onSelected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        actionBar.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(actionBar, "com/tencent/mm/artists/CropArtist", "onSelected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.X.setEmpty();
        if (d() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CropArtist", "[onSelected] getCache is null!");
            return;
        }
        if (((um.d) d()).A3(true) <= 0) {
            xk0.c cVar = new xk0.c();
            cVar.f454933f.set(h());
            ((um.d) d()).add(cVar);
            N();
            ((l45.n) this.f235039a).f316460a.getBaseBoardView().f22945i = this.f235130x;
            ((l45.n) this.f235039a).f316460a.getBaseBoardView().b(new dl.k(this), 0.0f, false);
        } else {
            um.d dVar = (um.d) d();
            java.util.Stack stack = dVar.f428672d;
            xk0.c cVar2 = (stack == null || stack.size() <= 0) ? null : (xk0.c) dVar.f428672d.peek();
            if (cVar2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CropArtist", "item is null!!!");
                return;
            }
            this.f235130x.set(new android.graphics.Rect(cVar2.f454931d));
            ((l45.n) this.f235039a).f316460a.getBaseBoardView().f22945i = cVar2.f454931d;
            try {
                ((um.d) d()).add((xk0.c) cVar2.clone());
            } catch (java.lang.CloneNotSupportedException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CropArtist", e17, "", new java.lang.Object[0]);
            }
            ((l45.n) this.f235039a).f316460a.getBaseBoardView().b(new dl.l(this), 0.0f, false);
        }
        if (this.f235122a0) {
            this.H.f345921l = new dl.m(this);
        }
        ((l45.n) this.f235039a).f316460a.getBaseBoardView().setOneFingerMoveEnable(true);
    }

    @Override // dl.b
    public void C() {
    }

    public void I() {
        float f17;
        xk0.c cVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.CropArtist", "[cancel]");
        this.H.a();
        android.animation.ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ((l45.n) this.f235039a).f316460a.getBaseBoardView().f22945i = ((l45.n) this.f235039a).f316460a.getBaseBoardView().getRawBoardRect();
        if (d() != null) {
            um.d dVar = (um.d) d();
            if (dVar.f428672d.size() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CropCache", "[pop]");
                cVar = null;
            } else {
                cVar = (xk0.c) dVar.f428672d.pop();
            }
            if (cVar != null) {
                f17 = i() - j(cVar.f454933f);
                android.graphics.Rect rect = cVar.f454932e;
                if (!rect.isEmpty()) {
                    ((l45.n) this.f235039a).f316460a.getBaseBoardView().k(rect);
                }
                ((l45.n) this.f235039a).f316460a.getBaseBoardView().b(null, f17, true);
                android.view.View actionBar = ((l45.n) this.f235039a).f316460a.getActionBar();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(actionBar, arrayList.toArray(), "com/tencent/mm/artists/CropArtist", "cancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                actionBar.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(actionBar, "com/tencent/mm/artists/CropArtist", "cancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        f17 = 0.0f;
        ((l45.n) this.f235039a).f316460a.getBaseBoardView().b(null, f17, true);
        android.view.View actionBar2 = ((l45.n) this.f235039a).f316460a.getActionBar();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(actionBar2, arrayList2.toArray(), "com/tencent/mm/artists/CropArtist", "cancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        actionBar2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(actionBar2, "com/tencent/mm/artists/CropArtist", "cancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void J() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CropArtist", "[doCrop]");
        android.animation.ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (l() != null) {
            this.f235121J.a();
            this.H.f345921l = null;
        }
        ok.c cVar = this.H;
        if (cVar.f345927a) {
            cVar.f345921l = null;
            K();
            return;
        }
        if (!cVar.f345928b) {
            cVar.a();
            this.H.b();
        }
        this.H.f345921l = new dl.q(this);
    }

    public void K() {
        ((l45.n) this.f235039a).f316460a.getBaseBoardView().f22945i = ((l45.n) this.f235039a).f316460a.getBaseBoardView().getRawBoardRect();
        android.graphics.RectF rectF = new android.graphics.RectF(this.f235130x);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        h().invert(matrix);
        matrix.mapRect(rectF);
        android.graphics.Rect rect = new android.graphics.Rect();
        rectF.round(rect);
        ((l45.n) this.f235039a).f316460a.getBaseBoardView().k(rect);
        xk0.c cVar = new xk0.c();
        cVar.f454931d = new android.graphics.Rect(this.f235130x);
        cVar.f454932e.set(rect);
        if (this.I != null) {
            h().reset();
            ((l45.n) this.f235039a).f316460a.getBaseBoardView().a();
            cVar.f454933f.set(h());
            if (d() != null) {
                ((um.d) d()).clear();
                ((um.d) d()).add(cVar);
            }
            this.E = false;
            this.P = false;
            r();
        } else {
            ((l45.n) this.f235039a).f316460a.getBaseBoardView().b(new dl.r(this, cVar), 0.0f, true);
        }
        android.view.View actionBar = ((l45.n) this.f235039a).f316460a.getActionBar();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(actionBar, arrayList.toArray(), "com/tencent/mm/artists/CropArtist", "innerCrop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        actionBar.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(actionBar, "com/tencent/mm/artists/CropArtist", "innerCrop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final boolean L() {
        return this.N || this.L || this.M || this.O;
    }

    public void M() {
        if (l() == null || this.D == null) {
            return;
        }
        dl.g gVar = new dl.g(this);
        hk0.v vVar = this.f235121J;
        vVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCropAniLineHelper", "launchDelayJob");
        vVar.a();
        vVar.f281828b = kotlinx.coroutines.l.d(vVar.f281827a, null, null, new hk0.u(vVar, gVar, null), 3, null);
    }

    public final void N() {
        if (((l45.n) this.f235039a).f316465f == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CropArtist", "[resetBoxRect] getImageBitmap is null!");
            return;
        }
        float width = (((l45.n) r0).f316465f.getWidth() * 1.0f) / ((l45.n) this.f235039a).f316465f.getHeight();
        android.graphics.Rect rect = this.C;
        if (width < (rect.width() * 1.0f) / rect.height()) {
            int width2 = (int) ((rect.width() - (rect.height() * width)) / 2.0f);
            this.f235130x.set(rect.left + width2, rect.top, rect.right - width2, rect.bottom);
        } else {
            int height = (int) ((rect.height() - (rect.width() / width)) / 2.0f);
            this.f235130x.set(rect.left, rect.top + height, rect.right, rect.bottom - height);
        }
        O();
    }

    public void O() {
        int i17 = this.f235125s / 2;
        android.graphics.RectF rectF = this.A;
        int i18 = this.f235130x.left;
        rectF.set(i18 - i17, r2.top - i17, i18 + i17, r2.bottom + i17);
        android.graphics.RectF rectF2 = this.f235131y;
        android.graphics.Rect rect = this.f235130x;
        float f17 = rect.left - i17;
        int i19 = rect.top;
        rectF2.set(f17, i19 - i17, rect.right + i17, i19 + i17);
        android.graphics.RectF rectF3 = this.B;
        int i27 = this.f235130x.right;
        rectF3.set(i27 - i17, r2.top - i17, i27 + i17, r2.bottom + i17);
        android.graphics.RectF rectF4 = this.f235132z;
        android.graphics.Rect rect2 = this.f235130x;
        float f18 = rect2.left - i17;
        int i28 = rect2.bottom;
        rectF4.set(f18, i28 - i17, rect2.right + i17, i28 + i17);
    }

    public void P() {
        float f17;
        com.tencent.mars.xlog.Log.i("MicroMsg.CropArtist", "setCropItemByOutSideEdit");
        if (l() == null) {
            return;
        }
        ((l45.n) this.f235039a).f316460a.getBaseBoardView().f22945i = ((l45.n) this.f235039a).f316460a.getBaseBoardView().getRawBoardRect();
        if (d() != null) {
            hk0.z zVar = l().f281818i;
            java.util.LinkedList linkedList = zVar.f281856h;
            hk0.d dVar = linkedList.isEmpty() ? null : (hk0.d) zVar.f281851c.get(linkedList.getLast());
            if (dVar != null) {
                float f18 = l().f281818i.f281858j;
                xk0.c cVar = dVar.f281714c;
                f17 = f18 - j(cVar.f454933f);
                android.graphics.Rect rect = cVar.f454932e;
                if (!rect.isEmpty()) {
                    ((l45.n) this.f235039a).f316460a.getBaseBoardView().k(rect);
                }
                ((um.d) d()).clear();
                ((um.d) d()).add(cVar);
                ((l45.n) this.f235039a).f316460a.getBaseBoardView().b(null, f17, true);
            }
            h().set(((um.d) d()).f428674f);
            N();
            android.graphics.RectF rectF = new android.graphics.RectF(this.f235130x);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            h().invert(matrix);
            matrix.mapRect(rectF);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            rectF.round(rect2);
            ((l45.n) this.f235039a).f316460a.getBaseBoardView().k(rect2);
            ((um.d) d()).clear();
        }
        f17 = 0.0f;
        ((l45.n) this.f235039a).f316460a.getBaseBoardView().b(null, f17, true);
    }

    @Override // dl.b
    public dl.a m() {
        return dl.a.CROP_PHOTO;
    }

    @Override // dl.b
    public boolean o() {
        if (d() == null) {
            return false;
        }
        return !((um.d) d()).f428674f.equals(h());
    }

    @Override // dl.b
    public void t() {
        super.t();
        if (l() != null) {
            this.f235124r = this.f235123q;
        }
        android.graphics.Rect rect = this.C;
        if (rect.isEmpty()) {
            if (l() == null || l().f281818i.f281861m == 0) {
                int i17 = this.f235124r;
                rect.set(i17, i17 * 2, c().width() - this.f235124r, ((c().height() - this.f235127u) - this.f235128v) - (this.f235124r * 2));
            } else {
                int i18 = this.f235124r;
                rect.set(i18, (int) (i18 * 1.5d), c().width() - this.f235124r, (c().height() - l().f281818i.f281861m) - ((int) (this.f235124r * 1.5d)));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CropArtist", "[onAlive] CROP_MAX_RECT:%s", rect);
        if (d() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CropArtist", "[onAlive] getCache is null");
            return;
        }
        um.d dVar = (um.d) d();
        java.util.Stack stack = dVar.f428672d;
        xk0.c cVar = (stack == null || stack.size() <= 0) ? null : (xk0.c) dVar.f428672d.peek();
        if (cVar != null) {
            android.graphics.Rect rect2 = cVar.f454932e;
            if (!rect2.isEmpty()) {
                ((l45.n) this.f235039a).f316460a.getBaseBoardView().k(rect2);
                float j17 = j(cVar.f454933f);
                com.tencent.mars.xlog.Log.i("MicroMsg.CropArtist", "[onAlive] rotation:%s", java.lang.Float.valueOf(j17));
                h().postRotate(-j17, rect2.centerX(), rect2.centerY());
            }
        }
        l45.q qVar = this.f235039a;
        if (qVar != null) {
            float f17 = ((l45.n) qVar).f316468i;
            if (f17 <= 0.0f || this.I != null) {
                return;
            }
            this.I = new dl.c0(this, f17, this.f235130x);
        }
    }

    @Override // dl.b
    public void u(l45.q qVar, android.graphics.Matrix matrix, android.graphics.Rect rect) {
        super.u(qVar, matrix, rect);
        this.f235130x = new android.graphics.Rect();
        this.f235132z = new android.graphics.RectF();
        this.f235131y = new android.graphics.RectF();
        this.A = new android.graphics.RectF();
        this.B = new android.graphics.RectF();
        this.D = new xk0.c(this.f235130x);
        this.H = new ok.c(this);
    }

    @Override // dl.b
    public void w() {
        super.w();
        this.I = null;
        if (l() != null) {
            this.f235121J.a();
        }
    }

    @Override // dl.b
    public boolean x(android.view.MotionEvent motionEvent) {
        android.graphics.Rect rect;
        int i17;
        android.graphics.Rect rect2;
        int i18;
        int i19;
        if (!q()) {
            return false;
        }
        dl.c0 c0Var = this.I;
        if (c0Var != null) {
            android.graphics.RectF curImageRect = ((l45.n) c0Var.f235064e.f235039a).f316460a.getBaseBoardView().getCurImageRect();
            float f17 = curImageRect.top;
            float f18 = curImageRect.bottom;
            android.graphics.Rect rect3 = c0Var.f235063d;
            float f19 = f17 - (f18 - rect3.bottom);
            c0Var.f235070k = f19;
            float f27 = f18 + (rect3.top - f17);
            c0Var.f235071l = f27;
            float f28 = curImageRect.left;
            float f29 = curImageRect.right;
            float f37 = f28 - (f29 - rect3.right);
            c0Var.f235072m = f37;
            float f38 = f29 + (rect3.left - f28);
            c0Var.f235073n = f38;
            android.graphics.Rect rect4 = c0Var.f235061b;
            float f39 = rect4.right;
            if (f38 > f39) {
                c0Var.f235073n = f39;
            }
            float f47 = c0Var.f235060a;
            if (f37 < f47) {
                c0Var.f235072m = f47;
            }
            float f48 = rect4.bottom;
            if (f27 > f48) {
                c0Var.f235071l = f48;
            }
            if (f19 < f47) {
                c0Var.f235070k = f47;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "ACTION_DOWN moveDirection :" + c0Var.f235065f);
                c0Var.f235066g = false;
                ok.c cVar = c0Var.f235064e.H;
                if (cVar != null) {
                    cVar.a();
                }
                if (c0Var.f235064e.f235132z.contains(motionEvent.getX(), motionEvent.getY())) {
                    c0Var.f235065f |= 8;
                }
                if (c0Var.f235064e.f235131y.contains(motionEvent.getX(), motionEvent.getY())) {
                    c0Var.f235065f |= 2;
                }
                if (c0Var.f235064e.A.contains(motionEvent.getX(), motionEvent.getY())) {
                    c0Var.f235065f |= 1;
                }
                if (c0Var.f235064e.B.contains(motionEvent.getX(), motionEvent.getY())) {
                    c0Var.f235065f = 4 | c0Var.f235065f;
                }
                c0Var.f235064e.P = false;
                if (c0Var.f235065f > 0) {
                    c0Var.f235066g = true;
                    c0Var.f235067h = motionEvent.getX();
                    c0Var.f235068i = motionEvent.getY();
                }
            } else if (actionMasked == 1) {
                float width = (c0Var.f235061b.width() * 1.0f) / c0Var.f235063d.width();
                float height = (c0Var.f235061b.height() * 1.0f) / c0Var.f235063d.height();
                if (width >= height) {
                    width = height;
                }
                float centerX = c0Var.f235061b.centerX();
                float centerY = c0Var.f235061b.centerY() - c0Var.f235063d.centerY();
                ku5.u0 u0Var = ku5.t0.f312615d;
                dl.b0 b0Var = new dl.b0(c0Var, width, centerX - c0Var.f235063d.centerX(), centerY);
                long j17 = c0Var.f235066g ? 0L : 100L;
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(b0Var, j17, false);
                if (c0Var.f235065f > 0) {
                    c0Var.f235066g = true;
                } else {
                    c0Var.f235066g = false;
                }
                c0Var.f235065f = 0;
                c0Var.f235064e.s();
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    c0Var.f235065f = 0;
                    c0Var.f235066g = false;
                }
            } else if (c0Var.f235066g) {
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "ACTION_MOVE moveDirection :" + c0Var.f235065f + "mBoxRect：" + c0Var.f235063d + " originRect:" + c0Var.f235069j);
                c0Var.f235069j = new android.graphics.Rect(c0Var.f235063d);
                if (motionEvent.getPointerCount() != 1 || (i19 = c0Var.f235065f) <= 0) {
                    c0Var.f235066g = false;
                } else {
                    if (i19 == 1) {
                        com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "moveDirection: LEFT xDelta:" + (c0Var.f235067h - motionEvent.getX()));
                        android.graphics.Rect rect5 = c0Var.f235063d;
                        if (rect5.right >= rect5.left) {
                            c0Var.f((int) (c0Var.f235067h - motionEvent.getX()), c0Var.f235065f, c0Var.f235069j);
                        }
                    } else if (i19 == 2) {
                        android.graphics.Rect rect6 = c0Var.f235063d;
                        if (rect6.bottom >= rect6.top) {
                            c0Var.h((int) (c0Var.f235068i - motionEvent.getY()), c0Var.f235065f, c0Var.f235069j);
                        }
                    } else if (i19 == 3) {
                        android.graphics.Rect rect7 = c0Var.f235063d;
                        if (rect7.right >= rect7.left && rect7.bottom >= rect7.top) {
                            float y17 = c0Var.f235068i - motionEvent.getY();
                            float x17 = c0Var.f235067h - motionEvent.getX();
                            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "moveDirection: " + c0Var.f235065f + " xDelta:" + x17 + " yDelta:" + y17);
                            if (java.lang.Math.abs(y17) >= java.lang.Math.abs(x17)) {
                                c0Var.h((int) y17, c0Var.f235065f, c0Var.f235069j);
                            } else {
                                c0Var.h((int) x17, c0Var.f235065f, c0Var.f235069j);
                            }
                        }
                    } else if (i19 == 4) {
                        android.graphics.Rect rect8 = c0Var.f235063d;
                        if (rect8.right >= rect8.left) {
                            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "moveDirection: RIGHT xDelta:" + (motionEvent.getX() - c0Var.f235067h));
                            c0Var.g((int) (motionEvent.getX() - c0Var.f235067h), c0Var.f235065f, c0Var.f235069j);
                        }
                    } else if (i19 == 6) {
                        android.graphics.Rect rect9 = c0Var.f235063d;
                        if (rect9.right >= rect9.left && rect9.bottom >= rect9.top) {
                            float y18 = c0Var.f235068i - motionEvent.getY();
                            float x18 = motionEvent.getX() - c0Var.f235067h;
                            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "moveDirection: " + c0Var.f235065f + " xDelta:" + x18 + " yDelta:" + y18);
                            if (java.lang.Math.abs(y18) >= java.lang.Math.abs(x18)) {
                                c0Var.g((int) y18, c0Var.f235065f, c0Var.f235069j);
                            } else {
                                c0Var.g((int) x18, c0Var.f235065f, c0Var.f235069j);
                            }
                        }
                    } else if (i19 == 12) {
                        android.graphics.Rect rect10 = c0Var.f235063d;
                        if (rect10.right >= rect10.left && rect10.bottom >= rect10.top) {
                            float y19 = motionEvent.getY() - c0Var.f235068i;
                            float x19 = motionEvent.getX() - c0Var.f235067h;
                            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "moveDirection: " + c0Var.f235065f + " xDelta:" + x19 + " yDelta:" + y19);
                            if (java.lang.Math.abs(y19) >= java.lang.Math.abs(x19 / c0Var.f235062c)) {
                                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "moveDirection: " + c0Var.f235065f + " yDelta:" + y19);
                                c0Var.e((int) y19, c0Var.f235065f, c0Var.f235069j);
                            } else {
                                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "moveDirection: " + c0Var.f235065f + " xDelta:" + (x19 / c0Var.f235062c));
                                c0Var.e((int) (x19 / c0Var.f235062c), c0Var.f235065f, c0Var.f235069j);
                            }
                        }
                    } else if (i19 == 8) {
                        android.graphics.Rect rect11 = c0Var.f235063d;
                        if (rect11.bottom >= rect11.top) {
                            c0Var.e((int) (motionEvent.getY() - c0Var.f235068i), c0Var.f235065f, c0Var.f235069j);
                        }
                    } else if (i19 == 9) {
                        android.graphics.Rect rect12 = c0Var.f235063d;
                        if (rect12.right >= rect12.left && rect12.bottom >= rect12.top) {
                            float y27 = motionEvent.getY() - c0Var.f235068i;
                            float x27 = c0Var.f235067h - motionEvent.getX();
                            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "moveDirection: " + c0Var.f235065f + " xDelta:" + x27 + " yDelta:" + y27);
                            if (java.lang.Math.abs(y27) >= java.lang.Math.abs(x27)) {
                                c0Var.f((int) y27, c0Var.f235065f, c0Var.f235069j);
                            } else {
                                c0Var.f((int) x27, c0Var.f235065f, c0Var.f235069j);
                            }
                        }
                    }
                    c0Var.f235064e.O();
                    c0Var.f235066g = true;
                    c0Var.f235064e.r();
                    c0Var.f235067h = motionEvent.getX();
                    c0Var.f235068i = motionEvent.getY();
                }
                c0Var.f235064e.F(motionEvent);
                if (c0Var.f235064e.l() != null) {
                    c0Var.f235064e.l().X6();
                }
            }
            return c0Var.f235066g;
        }
        android.graphics.RectF curImageRect2 = ((l45.n) this.f235039a).f316460a.getBaseBoardView().getCurImageRect();
        float f49 = curImageRect2.top;
        float f57 = curImageRect2.bottom;
        android.graphics.Rect rect13 = this.f235130x;
        this.S = f49 - (f57 - rect13.bottom);
        this.T = f57 + (rect13.top - f49);
        float f58 = curImageRect2.left;
        float f59 = curImageRect2.right;
        this.U = f58 - (f59 - rect13.right);
        this.V = f59 + (rect13.left - f58);
        float f66 = this.V;
        android.graphics.Rect rect14 = this.C;
        int i27 = rect14.right;
        if (f66 > i27) {
            this.V = i27;
        }
        float f67 = this.U;
        int i28 = this.f235124r;
        if (f67 < i28) {
            this.U = i28;
        }
        float f68 = this.T;
        int i29 = rect14.bottom;
        if (f68 > i29) {
            this.T = i29;
        }
        if (this.S < i28) {
            this.S = i28;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.K = false;
            ok.c cVar2 = this.H;
            if (cVar2 != null) {
                cVar2.a();
            }
            if (this.f235132z.contains(motionEvent.getX(), motionEvent.getY())) {
                this.N = true;
            }
            if (this.f235131y.contains(motionEvent.getX(), motionEvent.getY())) {
                this.M = true;
            }
            if (this.A.contains(motionEvent.getX(), motionEvent.getY())) {
                this.L = true;
            }
            if (this.B.contains(motionEvent.getX(), motionEvent.getY())) {
                this.O = true;
            }
            this.P = false;
            if (L()) {
                this.K = true;
                boolean z17 = this.N;
                if (z17 && this.L) {
                    this.N = true;
                    this.L = true;
                    this.M = false;
                    this.O = false;
                } else if (z17 && this.O) {
                    this.N = true;
                    this.L = false;
                    this.M = false;
                    this.O = true;
                } else {
                    boolean z18 = this.M;
                    if (z18 && this.O) {
                        this.N = false;
                        this.L = false;
                        this.M = true;
                        this.O = true;
                    } else if (z18 && this.O) {
                        this.N = false;
                        this.L = false;
                        this.M = true;
                        this.O = true;
                    }
                }
                this.Q = motionEvent.getX();
                this.R = motionEvent.getY();
            }
            if (l() != null) {
                dl.h hVar = new dl.h(this);
                hk0.v vVar = this.f235121J;
                vVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCropAniLineHelper", "doShowAni");
                vVar.a();
                if (!vVar.f281830d) {
                    android.animation.ValueAnimator valueAnimator = vVar.f281829c;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    vVar.f281830d = true;
                    android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
                    vVar.f281829c = ofPropertyValuesHolder;
                    if (ofPropertyValuesHolder != null) {
                        ofPropertyValuesHolder.addUpdateListener(new hk0.q(hVar));
                    }
                    android.animation.ValueAnimator valueAnimator2 = vVar.f281829c;
                    if (valueAnimator2 != null) {
                        valueAnimator2.setDuration(200L);
                    }
                    android.animation.ValueAnimator valueAnimator3 = vVar.f281829c;
                    if (valueAnimator3 != null) {
                        valueAnimator3.start();
                    }
                }
            }
        } else if (actionMasked2 == 1) {
            float width2 = (this.C.width() * 1.0f) / this.f235130x.width();
            float height2 = (this.C.height() * 1.0f) / this.f235130x.height();
            if (width2 >= height2) {
                width2 = height2;
            }
            float centerX2 = this.C.centerX();
            float centerY2 = this.C.centerY() - this.f235130x.centerY();
            ku5.u0 u0Var2 = ku5.t0.f312615d;
            dl.n nVar = new dl.n(this, width2, centerX2 - this.f235130x.centerX(), centerY2);
            long j18 = this.K ? 0L : 100L;
            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
            t0Var2.getClass();
            t0Var2.z(nVar, j18, false);
            if (L()) {
                this.K = true;
            } else {
                this.K = false;
            }
            this.N = false;
            this.L = false;
            this.M = false;
            this.O = false;
            s();
        } else if (actionMasked2 == 2) {
            if (l() != null) {
                this.f235121J.a();
            }
            if (this.K) {
                if (motionEvent.getPointerCount() == 1 && L()) {
                    if (this.O && (i18 = (rect2 = this.f235130x).right) >= rect2.left) {
                        if (i18 <= this.C.right) {
                            float x28 = motionEvent.getX() - this.Q;
                            int i37 = this.C.right;
                            android.graphics.Rect rect15 = this.f235130x;
                            int i38 = rect15.right;
                            if (x28 > i37 - i38) {
                                rect15.right = i37;
                            } else {
                                rect15.right = (int) (i38 + (motionEvent.getX() - this.Q));
                            }
                        }
                        android.graphics.Rect rect16 = this.f235130x;
                        int i39 = rect16.right;
                        int i47 = rect16.left;
                        int i48 = this.f235126t;
                        if (i39 < i47 + i48) {
                            rect16.right = i47 + i48;
                        }
                        int i49 = rect16.right;
                        int i57 = this.C.right;
                        if (i49 > i57) {
                            rect16.right = i57;
                        }
                        rect16.right = (int) java.lang.Math.min(rect16.right, curImageRect2.right);
                    }
                    if (this.L) {
                        android.graphics.Rect rect17 = this.f235130x;
                        int i58 = rect17.right;
                        int i59 = rect17.left;
                        if (i58 >= i59) {
                            if (i59 >= this.C.left) {
                                float x29 = this.Q - motionEvent.getX();
                                android.graphics.Rect rect18 = this.f235130x;
                                int i66 = rect18.left;
                                int i67 = this.C.left;
                                if (x29 > i66 - i67) {
                                    rect18.left = i67;
                                } else {
                                    rect18.left = (int) (i66 - (this.Q - motionEvent.getX()));
                                }
                            }
                            android.graphics.Rect rect19 = this.f235130x;
                            int i68 = rect19.left;
                            int i69 = rect19.right;
                            int i76 = this.f235126t;
                            if (i68 > i69 - i76) {
                                rect19.left = i69 - i76;
                            }
                            int i77 = rect19.left;
                            int i78 = this.C.left;
                            if (i77 < i78) {
                                rect19.left = i78;
                            }
                            rect19.left = (int) java.lang.Math.max(rect19.left, curImageRect2.left);
                        }
                    }
                    if (this.M) {
                        android.graphics.Rect rect20 = this.f235130x;
                        int i79 = rect20.bottom;
                        int i86 = rect20.top;
                        if (i79 >= i86) {
                            if (i86 >= this.C.top) {
                                float y28 = this.R - motionEvent.getY();
                                android.graphics.Rect rect21 = this.f235130x;
                                int i87 = rect21.top;
                                int i88 = this.C.top;
                                if (y28 > i87 - i88) {
                                    rect21.top = i88;
                                } else {
                                    rect21.top = (int) (i87 - (this.R - motionEvent.getY()));
                                }
                            }
                            android.graphics.Rect rect22 = this.f235130x;
                            int i89 = rect22.top;
                            int i96 = rect22.bottom;
                            int i97 = this.f235126t;
                            if (i89 > i96 - i97) {
                                rect22.top = i96 - i97;
                            }
                            int i98 = rect22.top;
                            int i99 = this.C.top;
                            if (i98 < i99) {
                                rect22.top = i99;
                            }
                            rect22.top = (int) java.lang.Math.max(rect22.top, curImageRect2.top);
                        }
                    }
                    if (this.N && (i17 = (rect = this.f235130x).bottom) >= rect.top) {
                        if (i17 <= this.C.bottom) {
                            float y29 = motionEvent.getY() - this.R;
                            int i100 = this.C.bottom;
                            android.graphics.Rect rect23 = this.f235130x;
                            int i101 = rect23.bottom;
                            if (y29 > i100 - i101) {
                                rect23.bottom = i100;
                            } else {
                                rect23.bottom = (int) (i101 + (motionEvent.getY() - this.R));
                            }
                        }
                        android.graphics.Rect rect24 = this.f235130x;
                        int i102 = rect24.bottom;
                        int i103 = rect24.top;
                        int i104 = this.f235126t;
                        if (i102 < i103 + i104) {
                            rect24.bottom = i103 + i104;
                        }
                        int i105 = rect24.bottom;
                        int i106 = this.C.bottom;
                        if (i105 > i106) {
                            rect24.bottom = i106;
                        }
                        rect24.bottom = (int) java.lang.Math.min(rect24.bottom, curImageRect2.bottom);
                    }
                    O();
                    this.K = true;
                    r();
                    this.Q = motionEvent.getX();
                    this.R = motionEvent.getY();
                } else {
                    this.K = false;
                }
                F(motionEvent);
                if (l() != null) {
                    l().X6();
                }
            }
        } else if (actionMasked2 == 5) {
            this.N = false;
            this.L = false;
            this.M = false;
            this.O = false;
            this.K = false;
        }
        return this.K;
    }

    @Override // dl.b
    public void y(android.graphics.Canvas canvas) {
        if (this.G) {
            canvas.setMatrix(this.f235129w);
        } else {
            canvas.setMatrix(null);
        }
        xk0.c cVar = this.D;
        boolean z17 = this.P;
        boolean z18 = this.E;
        boolean z19 = this.F;
        boolean z27 = ((l45.n) this.f235039a).f316469j;
        if (cVar.f454931d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CropItem", "[draw] mBoxRect is null!");
            return;
        }
        if (z17) {
            canvas.save();
            canvas.clipRect(cVar.f454931d, android.graphics.Region.Op.DIFFERENCE);
            canvas.drawPaint(xk0.c.f454927r);
            canvas.restore();
        }
        if (z18) {
            android.graphics.Rect rect = cVar.f454931d;
            android.graphics.Rect rect2 = xk0.c.f454930u;
            boolean equals = rect2.equals(rect);
            android.graphics.Path path = xk0.c.f454924o;
            android.graphics.Path path2 = xk0.c.f454923n;
            android.graphics.Paint paint = xk0.c.f454928s;
            if (!equals || z27) {
                path.reset();
                android.graphics.Rect rect3 = cVar.f454931d;
                path.moveTo(rect3.left, rect3.top);
                android.graphics.Rect rect4 = cVar.f454931d;
                path.lineTo(rect4.right, rect4.top);
                android.graphics.Rect rect5 = cVar.f454931d;
                path.lineTo(rect5.right, rect5.bottom);
                android.graphics.Rect rect6 = cVar.f454931d;
                path.lineTo(rect6.left, rect6.bottom);
                path.close();
                if (z19) {
                    paint.setAlpha(cVar.f454934g);
                } else {
                    paint.setAlpha(0);
                }
                path2.reset();
                for (int i17 = 1; i17 < 3; i17++) {
                    android.graphics.Rect rect7 = cVar.f454931d;
                    path2.moveTo(rect7.left + ((rect7.width() / 3) * i17), cVar.f454931d.top);
                    android.graphics.Rect rect8 = cVar.f454931d;
                    path2.lineTo(rect8.left + ((rect8.width() / 3) * i17), cVar.f454931d.bottom);
                    android.graphics.Rect rect9 = cVar.f454931d;
                    path2.moveTo(rect9.left, rect9.top + ((rect9.height() / 3) * i17));
                    android.graphics.Rect rect10 = cVar.f454931d;
                    path2.lineTo(rect10.right, rect10.top + ((rect10.height() / 3) * i17));
                }
            }
            android.graphics.Rect rect11 = cVar.f454931d;
            canvas.drawRect(rect11.left, rect11.top, rect11.right, rect11.bottom, xk0.c.f454926q);
            canvas.drawPath(path2, paint);
            canvas.drawPath(path, xk0.c.f454925p);
            float f17 = cVar.f454931d.left;
            float f18 = xk0.c.f454921i;
            float f19 = f17 - f18;
            float f27 = f18 / 2.0f;
            float f28 = r1.top - f27;
            float f29 = xk0.c.f454922m;
            android.graphics.Paint paint2 = xk0.c.f454929t;
            canvas.drawLine(f19, f28, f19 + f29, f28, paint2);
            android.graphics.Rect rect12 = cVar.f454931d;
            float f37 = rect12.right + f18;
            float f38 = rect12.top - f27;
            canvas.drawLine(f37 - f29, f38, f37, f38, paint2);
            android.graphics.Rect rect13 = cVar.f454931d;
            float f39 = rect13.left - f27;
            float f47 = rect13.top - f18;
            canvas.drawLine(f39, f47, f39, f47 + f29, paint2);
            android.graphics.Rect rect14 = cVar.f454931d;
            float f48 = rect14.left - f27;
            float f49 = rect14.bottom + f18;
            canvas.drawLine(f48, f49 - f29, f48, f49, paint2);
            android.graphics.Rect rect15 = cVar.f454931d;
            float f57 = rect15.right + f27;
            float f58 = rect15.top - f18;
            canvas.drawLine(f57, f58, f57, f58 + f29, paint2);
            android.graphics.Rect rect16 = cVar.f454931d;
            float f59 = rect16.right + f27;
            float f66 = rect16.bottom + f18;
            canvas.drawLine(f59, f66 - f29, f59, f66, paint2);
            android.graphics.Rect rect17 = cVar.f454931d;
            float f67 = rect17.left - f18;
            float f68 = rect17.bottom + f27;
            canvas.drawLine(f67, f68, f67 + f29, f68, paint2);
            android.graphics.Rect rect18 = cVar.f454931d;
            float f69 = rect18.right + f18;
            float f76 = rect18.bottom + f27;
            canvas.drawLine(f69 - f29, f76, f69, f76, paint2);
            android.graphics.Rect rect19 = cVar.f454931d;
            float f77 = rect19.left - f27;
            float f78 = f29 / 2.0f;
            float centerY = rect19.centerY() - f78;
            android.graphics.Rect rect20 = cVar.f454931d;
            canvas.drawLine(f77, centerY, rect20.left - f27, rect20.centerY() + f78, paint2);
            android.graphics.Rect rect21 = cVar.f454931d;
            canvas.drawLine(cVar.f454931d.centerX() - f78, rect21.top - f27, rect21.centerX() + f78, cVar.f454931d.top - f27, paint2);
            android.graphics.Rect rect22 = cVar.f454931d;
            float f79 = rect22.right + f27;
            float centerY2 = rect22.centerY() - f78;
            android.graphics.Rect rect23 = cVar.f454931d;
            canvas.drawLine(f79, centerY2, rect23.right + f27, rect23.centerY() + f78, paint2);
            android.graphics.Rect rect24 = cVar.f454931d;
            canvas.drawLine(cVar.f454931d.centerX() - f78, rect24.bottom + f27, rect24.centerX() + f78, cVar.f454931d.bottom + f27, paint2);
            if (rect2.equals(cVar.f454931d)) {
                return;
            }
            rect2.set(cVar.f454931d);
        }
    }
}
