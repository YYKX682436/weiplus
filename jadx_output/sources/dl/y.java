package dl;

/* loaded from: classes10.dex */
public class y extends dl.b {
    public android.graphics.Paint D;
    public an0.a I;
    public int L;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Runnable f235154s;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Handler f235152q = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f235153r = false;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Rect f235155t = new android.graphics.Rect();

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Rect f235156u = new android.graphics.Rect();

    /* renamed from: v, reason: collision with root package name */
    public boolean f235157v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f235158w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f235159x = false;

    /* renamed from: y, reason: collision with root package name */
    public float f235160y = 0.0f;

    /* renamed from: z, reason: collision with root package name */
    public float f235161z = 0.0f;
    public int A = 0;
    public int B = 0;
    public boolean C = false;
    public boolean E = false;
    public boolean G = false;
    public final ok.m H = new ok.m(this);

    /* renamed from: J, reason: collision with root package name */
    public boolean f235151J = false;
    public boolean K = false;
    public final hk0.v0 M = new hk0.v0();
    public final android.graphics.Matrix N = new android.graphics.Matrix();
    public boolean O = false;

    @Override // dl.b
    public void A(java.lang.String str) {
        boolean z17;
        hk0.n g17;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextArtist", "onForwardUndo editId: %s", str);
        if (l() == null && android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiAndTextArtist", "forwardUndo but model is null or editId is empty");
            return;
        }
        hk0.n g18 = l().f281818i.g(str);
        boolean z18 = false;
        if (g18 != null && g18.a() != null) {
            if (g18.b() == hk0.p.f281786d || (g17 = l().f281818i.g(str)) == null) {
                z17 = false;
            } else {
                ((um.g) d()).h(g17.c());
                z17 = true;
            }
            if (g18.b() != hk0.p.f281787e) {
                g18.a().w(false);
                ((um.g) d()).add(g18.a());
            }
            z18 = z17;
        }
        E(z18);
    }

    @Override // dl.b
    public void C() {
        E(true);
    }

    public final int G(int i17, int i18, int[] iArr, int i19, int i27) {
        if (i17 <= 0 || i17 > 90 || i27 == 0) {
            return -1;
        }
        int max = java.lang.Math.max(iArr[0], iArr[1]);
        if (i18 >= java.lang.Math.min(iArr[0], iArr[1]) && i18 <= max) {
            return (iArr[0] + iArr[1]) / 2;
        }
        iArr[0] = iArr[0] + i19;
        iArr[1] = iArr[1] + i19;
        return G(i17, i18, iArr, i19, i27 - i19);
    }

    public float[] H() {
        android.graphics.Rect c17 = c();
        return a(c17.centerX(), c17.centerY());
    }

    public void I(c01.s2 s2Var) {
        l45.p pVar = ((l45.n) this.f235039a).f316475p;
        if (pVar != null) {
            ((aw3.e) pVar).a(s2Var, ((um.g) d()).g());
        }
    }

    public void J(xk0.h hVar) {
        an0.a aVar = this.I;
        if (aVar != null) {
            final l45.h hVar2 = (l45.h) aVar;
            l45.n nVar = hVar2.f316447d;
            android.widget.EditText editText = (android.widget.EditText) nVar.f316460a.getTextEditView().findViewById(com.tencent.mm.R.id.o4a);
            editText.setTag(hVar);
            l45.m mVar = nVar.f316479t;
            if (mVar != null && (hVar instanceof xk0.p) && mVar.a((xk0.p) hVar)) {
                return;
            }
            xk0.q a17 = hVar.a();
            editText.setText(a17.f455003e);
            com.tencent.mm.view.TextModeSelectView textModeSelectView = (com.tencent.mm.view.TextModeSelectView) nVar.f316460a.findViewById(com.tencent.mm.R.id.agw);
            com.tencent.mm.view.footer.SelectColorBar selectColorBar = (com.tencent.mm.view.footer.SelectColorBar) nVar.f316460a.findViewById(com.tencent.mm.R.id.mii);
            int i17 = a17.f455000b;
            if (i17 != 0) {
                textModeSelectView.setTag(java.lang.Integer.valueOf(i17));
                textModeSelectView.setMode(3);
            } else if (a17.f455001c) {
                textModeSelectView.setMode(2);
            } else {
                textModeSelectView.setMode(1);
            }
            int curMode = textModeSelectView.getCurMode();
            int i18 = a17.f454999a;
            if (curMode == 3) {
                selectColorBar.setSelectColor(i17);
            } else {
                selectColorBar.setSelectColor(i18);
            }
            editText.setTextColor(i18);
            editText.setTag(hVar);
            nVar.y(true);
            if (nVar.f316461b.f364231a == qk.n9.VIDEO_COVER && (nVar.e() instanceof com.tencent.mm.ui.MMActivity)) {
                nVar.f316460a.getTextEditView().post(new java.lang.Runnable() { // from class: l45.h$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        l45.n nVar2 = l45.h.this.f316447d;
                        nVar2.f316460a.getTextEditView().requestFocus();
                        ((com.tencent.mm.ui.MMActivity) nVar2.e()).showVKB();
                    }
                });
            }
            if (nVar.f316461b.f364231a == qk.n9.LIVE_STICKER && (nVar.e() instanceof com.tencent.mm.ui.MMActivity)) {
                nVar.f316460a.getTextEditView().requestFocus();
                nVar.f316460a.getTextEditView().postDelayed(new java.lang.Runnable() { // from class: l45.h$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        l45.h hVar3 = l45.h.this;
                        hVar3.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "onTextChange: showVKB");
                        ((com.tencent.mm.ui.MMActivity) hVar3.f316447d.e()).showVKB();
                    }
                }, 350L);
            }
        }
    }

    public boolean K(xk0.f fVar, android.view.MotionEvent motionEvent, android.graphics.Rect rect, float f17) {
        if (fVar == null || !fVar.s()) {
            return false;
        }
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public xk0.f L(android.content.Context context, android.graphics.Matrix matrix, java.lang.String str, android.graphics.Rect rect, android.graphics.Rect rect2, android.text.SpannableString spannableString, int i17, int i18, java.lang.String str2) {
        return new xk0.p(context, matrix, str, rect, rect2, spannableString, i17, i18, str2);
    }

    public xk0.f M(java.lang.String str) {
        um.g gVar = (um.g) d();
        if (gVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiAndTextArtist", "cache is null!");
            return null;
        }
        java.util.ListIterator f17 = gVar.f();
        while (f17.hasPrevious()) {
            xk0.f fVar = (xk0.f) f17.previous();
            if (fVar.q().equals(str)) {
                return fVar;
            }
        }
        return null;
    }

    public final void N() {
        if (this.D == null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.D = paint;
            paint.setColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f479222ta));
            this.D.setStrokeWidth(5.0f);
            this.D.setStyle(android.graphics.Paint.Style.STROKE);
            this.D.setPathEffect(new android.graphics.DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        }
    }

    public final xk0.f O(float f17, float f18) {
        if (d() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiAndTextArtist", "[isContainsItem] getCache is null!");
            return null;
        }
        java.util.ListIterator f19 = ((um.g) d()).f();
        float[] a17 = a(f17, f18);
        while (f19.hasPrevious()) {
            xk0.f fVar = (xk0.f) f19.previous();
            if (fVar.f454960r) {
                float f27 = a17[0];
                float f28 = a17[1];
                boolean z17 = this.K;
                fVar.r(new android.graphics.Rect(), z17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new android.graphics.PointF(r10.left, r10.top));
                arrayList.add(new android.graphics.PointF(r10.right, r10.top));
                arrayList.add(new android.graphics.PointF(r10.right, r10.bottom));
                arrayList.add(new android.graphics.PointF(r10.left, r10.bottom));
                xk0.e eVar = new xk0.e(fVar, arrayList);
                int i17 = eVar.f454948c;
                int i18 = i17 - 1;
                boolean z18 = false;
                for (int i19 = 0; i19 < i17; i19++) {
                    float[] fArr = eVar.f454947b;
                    float f29 = fArr[i19];
                    if ((f29 < f28 && fArr[i18] >= f28) || (fArr[i18] < f28 && f29 >= f28)) {
                        float[] fArr2 = eVar.f454946a;
                        float f37 = fArr2[i19];
                        if (f37 + (((f28 - f29) / (fArr[i18] - f29)) * (fArr2[i18] - f37)) < f27) {
                            z18 = !z18;
                        }
                    }
                    i18 = i19;
                }
                if (z18) {
                    return fVar;
                }
            }
        }
        return null;
    }

    public void P() {
        if (this.f235154s != null) {
            this.f235152q.removeCallbacksAndMessages(null);
        }
        if (this.f235153r) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiAndTextArtist", "[registerFocusTask] isTimerCancel=true");
            return;
        }
        dl.x xVar = new dl.x(this);
        this.f235154s = xVar;
        this.f235152q.postDelayed(xVar, 1500L);
    }

    public xk0.f Q() {
        um.g gVar = (um.g) d();
        xk0.f fVar = null;
        if (gVar == null) {
            return null;
        }
        java.util.ListIterator f17 = gVar.f();
        while (f17.hasPrevious()) {
            xk0.f fVar2 = (xk0.f) f17.previous();
            if (fVar2.s()) {
                fVar = fVar2;
            }
            fVar2.w(false);
        }
        return fVar;
    }

    public void R(xk0.f fVar, float f17) {
        fVar.f454957o = f17;
    }

    public void S() {
        if (this.f235154s != null) {
            this.f235152q.removeCallbacksAndMessages(null);
            this.f235154s = null;
        }
    }

    public void T(boolean z17, boolean z18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextArtist", "undoAndShowByEditId lastEditId:%s isRemove: %b，isEdit: %b", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (!z17) {
            ((um.g) d()).h(str);
            ((um.g) d()).o5();
        }
        ((l45.n) this.f235039a).f316460a.removeCallbacks(this.f235048j);
        ym5.h hVar = ((l45.n) this.f235039a).f316460a;
        dl.w wVar = new dl.w(this, z18, z17, str);
        this.f235048j = wVar;
        hVar.postDelayed(wVar, 66L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void U(xk0.f fVar, boolean z17, float f17, boolean z18, int i17) {
        if (fVar instanceof xk0.h) {
            xk0.h hVar = (xk0.h) fVar;
            hVar.c(z17);
            hVar.d(z18);
            hVar.b(i17);
            if (f17 != 0.0f) {
                hVar.setTextSize(f17);
            }
        }
    }

    @Override // dl.b
    public dl.a m() {
        return dl.a.EMOJI_AND_TEXT;
    }

    @Override // dl.b
    public void t() {
        super.t();
        int dimension = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480592a94);
        int dimension2 = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480593a95);
        int c17 = com.tencent.mm.ui.bl.c(((l45.n) this.f235039a).f316460a.getContext());
        this.f235155t.set((c().width() - dimension2) / 2, (c().height() - dimension) - c17, (c().width() + dimension2) / 2, c().height() - c17);
        if (this.f235153r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextArtist", "onAlive: isTimerCancel=%s", java.lang.Boolean.valueOf(this.f235153r));
            this.f235152q.removeCallbacksAndMessages(null);
        }
        N();
        if (l() != null) {
            this.M.f281832b = l();
        }
    }

    @Override // dl.b
    public void w() {
        super.w();
        this.f235153r = true;
        S();
        this.f235152q.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dl.b
    public boolean x(android.view.MotionEvent motionEvent) {
        xk0.f g17;
        an0.a aVar;
        boolean contains;
        int i17;
        int i18;
        java.lang.String str;
        int i19;
        float f17;
        hk0.v0 v0Var;
        xk0.f g18;
        an0.a aVar2;
        if (motionEvent.getAction() == 3) {
            super.x(motionEvent);
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            android.graphics.Rect rect = this.f235155t;
            hk0.v0 v0Var2 = this.M;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 5) {
                        if (this.f235157v) {
                            this.f235160y = f(motionEvent);
                            this.A = (int) java.lang.Math.toDegrees(java.lang.Math.atan2(g(motionEvent)[0], g(motionEvent)[1]));
                            xk0.f g19 = ((um.g) d()).g();
                            if (g19 != null && g19.s()) {
                                int i27 = g19.f454956n;
                                this.B = i27;
                                this.f235161z = g19.f454957o;
                                v0Var2.getClass();
                                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditRotateHelper", "setCurrentRotation >> " + i27);
                                v0Var2.f281831a = i27;
                                v0Var2.f281833c = i27;
                            }
                        } else {
                            int[] iArr = new int[2];
                            if (motionEvent.getPointerCount() > 1) {
                                iArr[0] = ((int) (motionEvent.getX(0) + motionEvent.getX(1))) / 2;
                                iArr[1] = ((int) (motionEvent.getY(0) + motionEvent.getY(1))) / 2;
                            }
                            xk0.f O = O(iArr[0], iArr[1]);
                            if (O != null) {
                                boolean z17 = O.f454964v;
                                Q();
                                O.f454964v = z17;
                                this.f235157v = true;
                                O.w(true);
                                ((um.g) d()).i(O);
                                this.f235160y = f(motionEvent);
                                this.A = (int) java.lang.Math.toDegrees(java.lang.Math.atan2(g(motionEvent)[0], g(motionEvent)[1]));
                                if (O.s()) {
                                    int i28 = O.f454956n;
                                    this.B = i28;
                                    v0Var2.getClass();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditRotateHelper", "setCurrentRotation >> " + i28);
                                    v0Var2.f281831a = i28;
                                    v0Var2.f281833c = i28;
                                    this.f235161z = O.f454957o;
                                }
                                E(true);
                                r();
                            }
                        }
                    }
                } else if (this.f235157v && p(motionEvent)) {
                    if (!this.f235158w && (aVar2 = this.I) != null) {
                        l45.n nVar = ((l45.h) aVar2).f316447d;
                        l45.n.a(nVar, true);
                        l45.m mVar = nVar.f316479t;
                        if (mVar != null) {
                            mVar.c(java.lang.Boolean.TRUE);
                        }
                    }
                    float x17 = motionEvent.getX(0);
                    android.graphics.PointF pointF = this.f235050l;
                    int[] iArr2 = {(int) (x17 - pointF.x), (int) (motionEvent.getY(0) - pointF.y)};
                    if (motionEvent.getPointerCount() > 1) {
                        float f18 = 0.0f != this.f235160y ? f(motionEvent) / this.f235160y : 1.0f;
                        str = "MicroMsg.ImproveEditRotateHelper";
                        i19 = this.A - ((int) java.lang.Math.toDegrees(java.lang.Math.atan2(g(motionEvent)[0], g(motionEvent)[1])));
                        if (v0Var2.f281832b == null || !v0Var2.a(v0Var2.f281831a) || java.lang.Math.abs(i19) > 5) {
                            this.f235159x = true;
                        } else {
                            i19 = 0;
                        }
                        xk0.f g27 = ((um.g) d()).g();
                        if (g27 != null) {
                            f17 = !g27.l() ? 1.0f : f18;
                            if (!g27.k()) {
                                this.f235159x = false;
                                i19 = 0;
                            }
                        } else {
                            f17 = f18;
                        }
                    } else {
                        str = "MicroMsg.ImproveEditRotateHelper";
                        this.f235159x = false;
                        i19 = 0;
                        f17 = 1.0f;
                    }
                    float f19 = iArr2[0];
                    float f27 = iArr2[1];
                    float f28 = this.f235161z;
                    int i29 = this.B;
                    int pointerCount = motionEvent.getPointerCount();
                    motionEvent.getX();
                    motionEvent.getY();
                    xk0.f g28 = ((um.g) d()).g();
                    if (g28 != null) {
                        android.graphics.Matrix matrix = this.N;
                        matrix.reset();
                        matrix.postRotate(-i());
                        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                        matrix.invert(matrix2);
                        v0Var = v0Var2;
                        float[] fArr = {f19, f27};
                        matrix2.mapPoints(fArr);
                        if (pointerCount > 1) {
                            g28.y(0.0f, 0.0f, f17 * f28, (i29 + i19) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1);
                        } else {
                            g28.y(fArr[0] / k(), fArr[1] / k(), 0.0f, g28.f454956n);
                        }
                        g28.u();
                        android.graphics.PointF pointF2 = g28.f454955m;
                        float[] fArr2 = {pointF2.x, pointF2.y};
                        this.f235040b.mapPoints(fArr2);
                        int i37 = rect.top;
                        if (K(g28, motionEvent, rect, fArr2[1])) {
                            an0.a aVar3 = this.I;
                            if (aVar3 != null) {
                                l45.h hVar = (l45.h) aVar3;
                                com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "[onReach] distance:%s", java.lang.Float.valueOf((fArr2[1] - rect.top) / rect.height()));
                                hVar.f316444a.setActivated(true);
                                l45.n nVar2 = hVar.f316447d;
                                hVar.f316445b.setText(nVar2.e().getString(com.tencent.mm.R.string.i7_));
                                hVar.f316446c.setImageDrawable(com.tencent.mm.ui.uk.e(nVar2.e(), com.tencent.mm.R.raw.icons_filled_delete_on, -1));
                            }
                            this.O = true;
                        } else {
                            an0.a aVar4 = this.I;
                            if (aVar4 != null && this.O) {
                                l45.h hVar2 = (l45.h) aVar4;
                                com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "[onUnReach]");
                                hVar2.f316444a.setActivated(false);
                                l45.n nVar3 = hVar2.f316447d;
                                hVar2.f316446c.setImageDrawable(com.tencent.mm.ui.uk.e(nVar3.e(), com.tencent.mm.R.raw.icons_filled_delete, -1));
                                hVar2.f316445b.setText(nVar3.e().getString(com.tencent.mm.R.string.i7a));
                            }
                            this.O = false;
                        }
                        if (g28 instanceof xk0.h) {
                            g28.f454964v = false;
                        }
                    } else {
                        v0Var = v0Var2;
                    }
                    this.f235158w = true;
                    r();
                    if (this.f235159x) {
                        um.g cache = (um.g) d();
                        v0Var.getClass();
                        kotlin.jvm.internal.o.g(cache, "cache");
                        hk0.v0 v0Var3 = v0Var;
                        if (v0Var3.f281832b != null && (g18 = cache.g()) != null && g18.s()) {
                            int i38 = v0Var3.f281833c;
                            int i39 = g18.f454956n;
                            if (i38 != i39) {
                                v0Var3.f281833c = i39;
                                if (v0Var3.a(v0Var3.f281831a + i19)) {
                                    com.tencent.mars.xlog.Log.i(str, "checkRotateToStandard is in standard");
                                    hk0.u0 u0Var = v0Var3.f281832b;
                                    if (u0Var != null) {
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        arrayList.add(new hk0.j(7, new android.os.Bundle()));
                                        kotlinx.coroutines.l.d(u0Var.f281822p, null, null, new hk0.n0(u0Var, arrayList, null), 3, null);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (!n()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EmojiAndTextArtist", "[ACTION_UP] is not alive!");
                    return false;
                }
                if (d() == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EmojiAndTextArtist", "[getCache] is null!");
                    return false;
                }
                xk0.f g29 = ((um.g) d()).g();
                if (g29 != 0) {
                    if (this.G) {
                        android.graphics.Rect rect2 = this.f235156u;
                        g29.r(rect2, false);
                        contains = this.f235042d.contains(rect2);
                    } else {
                        android.graphics.Rect rect3 = this.f235042d;
                        android.graphics.PointF pointF3 = g29.f454955m;
                        contains = rect3.contains((int) pointF3.x, (int) pointF3.y);
                    }
                    boolean z18 = !contains;
                    if (!this.f235158w) {
                        I(c01.s2.f37445u);
                    }
                    if (z18) {
                        ok.m mVar2 = this.H;
                        mVar2.f345927a = true;
                        android.graphics.PointF pointF4 = g29.f454961s;
                        float f29 = pointF4.x;
                        android.graphics.PointF pointF5 = g29.f454955m;
                        mVar2.f345944f = f29 - pointF5.x;
                        mVar2.f345945g = pointF4.y - pointF5.y;
                        mVar2.f345943e = g29.q();
                        if (mVar2.f345927a) {
                            android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("deltaY", 0.0f, mVar2.f345945g), android.animation.PropertyValuesHolder.ofFloat("deltaX", 0.0f, mVar2.f345944f));
                            mVar2.f345942d = ofPropertyValuesHolder;
                            ofPropertyValuesHolder.addUpdateListener(new ok.k(mVar2));
                            mVar2.f345942d.addListener(new ok.l(mVar2));
                            mVar2.f345942d.setInterpolator(new android.view.animation.LinearInterpolator());
                            mVar2.f345942d.setDuration(100L);
                            mVar2.f345942d.start();
                        }
                    }
                    float f37 = g29.f454957o;
                    float f38 = this.f235161z;
                    if (f37 != f38 && f38 != 0.0f) {
                        I(c01.s2.f37437m);
                    }
                    if (g29.f454956n != this.B) {
                        I(c01.s2.f37436i);
                    }
                    int i47 = this.L;
                    int[] iArr3 = {-i47, i47};
                    int i48 = g29.f454956n;
                    if (i48 < 0) {
                        i18 = -360;
                        i17 = -90;
                    } else {
                        i17 = 90;
                        i18 = 360;
                    }
                    int G = G(i47, i48, iArr3, i17, i18);
                    if (G != -1) {
                        ok.e eVar = new ok.e(this);
                        eVar.f345927a = true;
                        float f39 = g29.f454956n;
                        float f47 = G;
                        java.lang.String itemId = g29.q();
                        kotlin.jvm.internal.o.g(itemId, "itemId");
                        float[] fArr3 = eVar.f345926f;
                        fArr3[0] = f39;
                        fArr3[1] = f47;
                        eVar.f345925e = itemId;
                        if (eVar.f345927a) {
                            android.animation.ValueAnimator ofPropertyValuesHolder2 = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("rotation", f39, f47));
                            eVar.f345924d = ofPropertyValuesHolder2;
                            if (ofPropertyValuesHolder2 != null) {
                                ofPropertyValuesHolder2.addUpdateListener(new ok.d(eVar));
                            }
                            android.animation.ValueAnimator valueAnimator = eVar.f345924d;
                            if (valueAnimator != null) {
                                valueAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
                            }
                            android.animation.ValueAnimator valueAnimator2 = eVar.f345924d;
                            if (valueAnimator2 != null) {
                                valueAnimator2.setDuration(100L);
                            }
                            android.animation.ValueAnimator valueAnimator3 = eVar.f345924d;
                            if (valueAnimator3 != null) {
                                valueAnimator3.start();
                            }
                        }
                    }
                    if (g29 instanceof xk0.h) {
                        xk0.h hVar3 = (xk0.h) g29;
                        if (hVar3.e()) {
                            if (g29.s() && g29.f454964v) {
                                J(hVar3);
                            } else if (g29.s()) {
                                g29.f454964v = true;
                            }
                        }
                    }
                    android.graphics.PointF pointF6 = g29.f454955m;
                    float[] fArr4 = {pointF6.x, pointF6.y};
                    this.f235040b.mapPoints(fArr4);
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextArtist", "mRubbishRect:%s pointF:%s isHasMove: %b isHasRotate: %b", rect, java.lang.Float.valueOf(fArr4[1]), java.lang.Boolean.valueOf(this.f235158w), java.lang.Boolean.valueOf(this.f235159x));
                    if (K(g29, motionEvent, rect, fArr4[1])) {
                        if (this.f235157v && this.I != null) {
                            xk0.f fVar = (xk0.f) ((um.g) d()).f428681d.pop();
                            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextCache", "pop item %s", fVar);
                            I(c01.s2.f37435h);
                            if (l() != null) {
                                l().c7(fVar, hk0.p.f281787e);
                            }
                        }
                    } else if (this.f235158w || this.f235159x) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextArtist", "isChange to add new editData");
                        if (this.f235159x) {
                            int b17 = v0Var2.b();
                            if (v0Var2.b() != -1) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAndTextArtist", "is need to fix rotation %d", java.lang.Integer.valueOf(b17));
                                g29.f454956n = b17;
                                r();
                            }
                        }
                        if (l() != null) {
                            g29.f454966x = l().c7(g29.clone(), hk0.p.f281788f);
                        }
                    }
                }
                P();
                if (this.f235158w && (aVar = this.I) != null) {
                    l45.n nVar4 = ((l45.h) aVar).f316447d;
                    l45.n.a(nVar4, false);
                    l45.m mVar3 = nVar4.f316479t;
                    if (mVar3 != null) {
                        mVar3.b();
                    }
                }
                this.f235158w = false;
                this.f235159x = false;
                r();
            }
        } else {
            S();
            xk0.f O2 = O(motionEvent.getX(), motionEvent.getY());
            motionEvent.getX();
            motionEvent.getY();
            if (O2 == null) {
                this.f235157v = false;
                if (((d() == null || (g17 = ((um.g) d()).g()) == null) ? false : g17.s()) && !this.f235151J) {
                    Q();
                    E(false);
                    r();
                }
            } else {
                boolean z19 = O2.f454964v;
                Q();
                this.f235157v = true;
                O2.w(true);
                O2.f454964v = z19;
                O2.f454961s.set(O2.f454955m);
                ((um.g) d()).i(O2);
                E(true);
                r();
                xk0.f g37 = ((um.g) d()).g();
                if (g37 != null && g37.s()) {
                    this.B = g37.f454956n;
                    this.f235161z = g37.f454957o;
                }
            }
        }
        super.x(motionEvent);
        return this.f235157v;
    }

    @Override // dl.b
    public void y(android.graphics.Canvas canvas) {
        um.g gVar = (um.g) d();
        xk0.f g17 = gVar != null ? gVar.g() : null;
        if (this.C && this.f235158w) {
            android.graphics.Rect rect = this.f235041c;
            xk0.f g18 = ((um.g) d()).g();
            if (g18 != null) {
                android.graphics.Rect rect2 = this.f235156u;
                g18.r(rect2, false);
                if (!rect.contains(rect2)) {
                    canvas.drawRoundRect(rect.left, rect.top, rect.right, rect.bottom, 5.0f, 5.0f, this.D);
                }
                if (g18.f454956n % 90 == 0 && this.f235159x) {
                    canvas.drawLine(rect.left, rect.top + (rect.height() / 2), rect.right, rect.top + (rect.height() / 2), this.D);
                    canvas.drawLine(rect.left + (rect.width() / 2), rect.top, rect.left + (rect.width() / 2), rect.bottom, this.D);
                }
            }
        }
        if (this.E && this.f235158w && ((um.g) d()).g() != null) {
            android.graphics.Rect rect3 = this.f235041c;
            int a17 = com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f479222ta);
            if (this.D == null) {
                N();
            }
            this.D.setColor(a17);
            canvas.drawLine(rect3.left, rect3.top + (rect3.height() / 2), rect3.right, rect3.top + (rect3.height() / 2), this.D);
            canvas.drawLine(rect3.left + (rect3.width() / 2), rect3.top, rect3.left + (rect3.width() / 2), rect3.bottom, this.D);
            android.graphics.Rect rect4 = this.f235042d;
            int a18 = com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f479210sy);
            if (this.D == null) {
                N();
            }
            this.D.setColor(a18);
            canvas.drawRoundRect(rect4.left, rect4.top, rect4.right, rect4.bottom, 5.0f, 5.0f, this.D);
            canvas.drawLine(rect4.left, rect4.top + (rect4.height() / 2), rect4.right, rect4.top + (rect4.height() / 2), this.D);
            canvas.drawLine(rect4.left + (rect4.width() / 2), rect4.top, rect4.left + (rect4.width() / 2), rect4.bottom, this.D);
        }
        v(canvas);
        if (g17 == null || !g17.s()) {
            return;
        }
        g17.i(canvas);
    }
}
