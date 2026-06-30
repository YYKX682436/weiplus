package du3;

/* loaded from: classes10.dex */
public final class t3 extends yt3.a {
    public boolean A;
    public final int B;
    public boolean C;
    public boolean D;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f243719f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f243720g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f243721h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f243722i;

    /* renamed from: m, reason: collision with root package name */
    public final int f243723m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f243724n;

    /* renamed from: o, reason: collision with root package name */
    public ct0.b f243725o;

    /* renamed from: p, reason: collision with root package name */
    public l45.q f243726p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f243727q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f243728r;

    /* renamed from: s, reason: collision with root package name */
    public qk.o9 f243729s;

    /* renamed from: t, reason: collision with root package name */
    public ym5.x2 f243730t;

    /* renamed from: u, reason: collision with root package name */
    public float f243731u;

    /* renamed from: v, reason: collision with root package name */
    public int f243732v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f243733w;

    /* renamed from: x, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f243734x;

    /* renamed from: y, reason: collision with root package name */
    public kotlinx.coroutines.r2 f243735y;

    /* renamed from: z, reason: collision with root package name */
    public kotlinx.coroutines.r2 f243736z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f243719f = parent;
        this.f243720g = jz5.h.b(new du3.r3(this));
        this.f243721h = jz5.h.b(new du3.q3(this));
        this.f243722i = jz5.h.b(new du3.w2(this));
        this.f243723m = i65.a.b(parent.getContext(), 24);
        this.f243727q = jz5.h.b(du3.p3.f243678d);
        this.f243728r = jz5.h.b(du3.x2.f243766d);
        this.f243731u = 1.0f;
        this.f243732v = -1;
        this.f243734x = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.B = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_photo_edit_improve_min_safe_rotate, 5);
    }

    public static final void z(du3.t3 t3Var, android.view.MotionEvent motionEvent) {
        t3Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int i17 = t3Var.f243723m;
        if (actionMasked == 0) {
            t3Var.D = false;
            if (t3Var.B() && t3Var.A(motionEvent.getX(), motionEvent.getY())) {
                float f17 = i17;
                t3Var.C().setX(motionEvent.getX() - f17);
                t3Var.C().setY(motionEvent.getY() - f17);
                android.view.View C = t3Var.C();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(C, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(C, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                t3Var.D = true;
                t3Var.E().h7(1, false);
                if (t3Var.B()) {
                    if (!t3Var.A(motionEvent.getX(), motionEvent.getY())) {
                        if (t3Var.C().getVisibility() == 0) {
                            android.view.View C2 = t3Var.C();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(4);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(C2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            C2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(C2, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        return;
                    }
                    float f18 = i17;
                    t3Var.C().setX(motionEvent.getX() - f18);
                    t3Var.C().setY(motionEvent.getY() - f18);
                    if (t3Var.C().getVisibility() == 4) {
                        android.view.View C3 = t3Var.C();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(C3, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(C3, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    return;
                }
                return;
            }
            if (actionMasked != 5 && actionMasked != 6) {
                return;
            }
        }
        if (t3Var.B()) {
            android.view.View C4 = t3Var.C();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(4);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(C4, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(C4, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoPreviewPlugin", "handleDispatch", "(Landroid/view/MotionEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (t3Var.D) {
            t3Var.E().h7(1, true);
        }
    }

    public final boolean A(float f17, float f18) {
        android.graphics.Rect rect;
        l45.q qVar = this.f243726p;
        if (qVar != null && qVar != null && (rect = ((l45.n) qVar).f316483x.f235041c) != null) {
            kotlin.jvm.internal.o.d(qVar);
            float[] a17 = ((l45.n) qVar).f316483x.a(f17, f18);
            if (rect.contains((int) a17[0], (int) a17[1])) {
                return true;
            }
        }
        return false;
    }

    public final boolean B() {
        if (E().R6(1)) {
            if (E().T6().f281724a == hk0.h.f281741f) {
                return true;
            }
        }
        return E().R6(5) && E().S6() == hk0.z0.f281865g;
    }

    public final android.view.View C() {
        return (android.view.View) ((jz5.n) this.f243722i).getValue();
    }

    public final android.widget.FrameLayout D() {
        return (android.widget.FrameLayout) this.f243721h.getValue();
    }

    public final hk0.u0 E() {
        return (hk0.u0) this.f243720g.getValue();
    }

    public final void F(java.lang.String path, boolean z17) {
        qk.o9 o9Var;
        android.os.Bundle bundle;
        float[] floatArray;
        bn5.f baseBoardView;
        boolean z18;
        ct0.b bVar;
        kotlin.jvm.internal.o.g(path, "path");
        this.C = z17;
        boolean z19 = false;
        D().setVisibility(0);
        ct0.b bVar2 = this.f243725o;
        if (bVar2 != null && bVar2.f222216m) {
            java.lang.Object value = ((jz5.n) this.f243728r).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            o9Var = (qk.o9) value;
        } else {
            java.lang.Object value2 = ((jz5.n) this.f243727q).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            o9Var = (qk.o9) value2;
        }
        this.f243729s = o9Var;
        com.tencent.mm.cache.ArtistCacheManager.a().g(path);
        qk.o9 o9Var2 = this.f243729s;
        if (o9Var2 != null) {
            qk.l9 l9Var = new qk.l9();
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f243724n;
            if (!(recordConfigProvider != null && recordConfigProvider.F == 291)) {
                if (!(recordConfigProvider != null && recordConfigProvider.F == 293)) {
                    if (!(recordConfigProvider != null && recordConfigProvider.F == 294)) {
                        z18 = true;
                        l9Var.f364232b = z18;
                        l9Var.f364233c = false;
                        l9Var.f364236f = new android.graphics.Rect(D().getLeft(), D().getTop(), D().getRight(), D().getBottom());
                        l9Var.f364231a = qk.n9.PHOTO;
                        bVar = this.f243725o;
                        if (bVar != null && bVar.f222206c) {
                            z19 = true;
                        }
                        l9Var.f364237g = z19;
                        l9Var.f364234d = path;
                        l9Var.f364235e = qk.m9.ImproveEditPhotoPreviewPlugin;
                        l9Var.f364242l = this.f243732v;
                        l9Var.f364243m = this.f243731u;
                        l9Var.f364244n = new du3.y2();
                        o9Var2.d(l9Var);
                    }
                }
            }
            z18 = false;
            l9Var.f364232b = z18;
            l9Var.f364233c = false;
            l9Var.f364236f = new android.graphics.Rect(D().getLeft(), D().getTop(), D().getRight(), D().getBottom());
            l9Var.f364231a = qk.n9.PHOTO;
            bVar = this.f243725o;
            if (bVar != null) {
                z19 = true;
            }
            l9Var.f364237g = z19;
            l9Var.f364234d = path;
            l9Var.f364235e = qk.m9.ImproveEditPhotoPreviewPlugin;
            l9Var.f364242l = this.f243732v;
            l9Var.f364243m = this.f243731u;
            l9Var.f364244n = new du3.y2();
            o9Var2.d(l9Var);
        }
        qk.o9 o9Var3 = this.f243729s;
        qk.s c17 = o9Var3 != null ? o9Var3.c(this.f243719f.getContext()) : null;
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
        this.f243730t = (ym5.x2) c17;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.f243724n;
        if (recordConfigProvider2 != null && (bundle = recordConfigProvider2.M) != null && (floatArray = bundle.getFloatArray("matrix")) != null) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setValues(floatArray);
            ym5.x2 x2Var = this.f243730t;
            if (x2Var != null && (baseBoardView = x2Var.getBaseBoardView()) != null) {
                baseBoardView.setForceMatrix(matrix);
            }
        }
        ym5.x2 x2Var2 = this.f243730t;
        dn5.e eVar = x2Var2 != null ? (dn5.e) x2Var2.getBaseFooterView() : null;
        if (eVar != null) {
            eVar.setHideFooter(true);
        }
        ym5.x2 x2Var3 = this.f243730t;
        kotlin.jvm.internal.o.e(x2Var3, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
        l45.q presenter = x2Var3.getPresenter();
        this.f243726p = presenter;
        if (presenter != null) {
            ((l45.n) presenter).f316484y = E();
        }
        l45.q qVar = this.f243726p;
        kotlin.jvm.internal.o.e(qVar, "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter");
        ((l45.n) qVar).f316479t = new du3.z2(this);
        D().addView(this.f243730t, new android.widget.FrameLayout.LayoutParams(-1, -1));
        ym5.x2 x2Var4 = this.f243730t;
        if (x2Var4 != null) {
            x2Var4.setSelectedFeatureListener(new du3.a3(this));
        }
        l45.q qVar2 = this.f243726p;
        if (qVar2 != null) {
            dl.u uVar = (dl.u) ((l45.n) qVar2).d(qk.g6.DOODLE);
            if (uVar != null) {
                uVar.f235053o = new du3.b3(this);
            }
        }
        l45.q qVar3 = this.f243726p;
        if (qVar3 != null) {
            dl.d0 d0Var = (dl.d0) ((l45.n) qVar3).d(qk.g6.MOSAIC);
            if (d0Var != null) {
                d0Var.f235053o = new du3.c3(this);
            }
        }
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(path);
        if (n07 != null) {
            nu3.i iVar = nu3.i.f340218a;
            iVar.n("KEY_ORIGIN_MEDIA_WIDTH_INT", java.lang.Integer.valueOf(n07.outWidth));
            iVar.n("KEY_ORIGIN_MEDIA_HEIGHT_INT", java.lang.Integer.valueOf(n07.outHeight));
        }
    }

    public final void G() {
        l45.q qVar = this.f243726p;
        qk.g6 g6Var = qk.g6.DEFAULT;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f243726p;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, -1, null);
        }
    }

    public final void H() {
        nu3.i iVar = nu3.i.f340218a;
        qk.o9 o9Var = this.f243729s;
        qk.v7 b17 = o9Var != null ? o9Var.b() : null;
        kotlin.jvm.internal.o.d(b17);
        iVar.n("KEY_ADD_EMOJI_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b17).b()));
        qk.o9 o9Var2 = this.f243729s;
        qk.v7 b18 = o9Var2 != null ? o9Var2.b() : null;
        kotlin.jvm.internal.o.d(b18);
        iVar.n("KEY_ADD_TEXT_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b18).e()));
        qk.o9 o9Var3 = this.f243729s;
        qk.v7 b19 = o9Var3 != null ? o9Var3.b() : null;
        kotlin.jvm.internal.o.d(b19);
        iVar.n("KEY_ADD_DOODLE_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b19).a()));
        qk.o9 o9Var4 = this.f243729s;
        qk.v7 b27 = o9Var4 != null ? o9Var4.b() : null;
        kotlin.jvm.internal.o.d(b27);
        iVar.n("KEY_ADD_DOODLE_COLOR_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b27).d()));
        qk.o9 o9Var5 = this.f243729s;
        qk.v7 b28 = o9Var5 != null ? o9Var5.b() : null;
        kotlin.jvm.internal.o.d(b28);
        iVar.n("KEY_ADD_MOSAIC_COUNT_INT", java.lang.Integer.valueOf(((f65.r) b28).c()));
        qk.o9 o9Var6 = this.f243729s;
        qk.v7 b29 = o9Var6 != null ? o9Var6.b() : null;
        kotlin.jvm.internal.o.d(b29);
        iVar.n("KEY_ROTATE_INT", java.lang.Integer.valueOf(((f65.r) b29).h() ? 1 : 0));
        l45.q qVar = this.f243726p;
        iVar.n("KEY_ZOOM_IN_OUT_COUNT", java.lang.Integer.valueOf(qVar != null ? ((l45.n) qVar).f316476q : 0));
        iVar.n("KEY_AFTER_EDIT_INT", 1);
        iVar.n("KEY_PEN_ERASER_WIDGET_COUNT", java.lang.Integer.valueOf(E().f281823q));
        iVar.n("KEY_PEN_ERASER_TRACE_COUNT", java.lang.Integer.valueOf(E().f281824r));
        iVar.n("KEY_MOSAIC_ERASER_WIDGET_COUNT", java.lang.Integer.valueOf(E().f281825s));
        iVar.n("KEY_MOSAIC_ERASER_TRACE_COUNT", java.lang.Integer.valueOf(E().f281826t));
    }

    @Override // yt3.r2
    public void onAttach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "onAttach");
        kotlinx.coroutines.y0 y0Var = this.f243734x;
        this.f243735y = kotlinx.coroutines.l.d(y0Var, null, null, new du3.f3(this, null), 3, null);
        this.f243736z = kotlinx.coroutines.l.d(y0Var, null, null, new du3.i3(this, null), 3, null);
        hk0.u0 E = E();
        du3.j3 j3Var = new du3.j3(this);
        E.getClass();
        E.f281816g.observe(E.f281813d, j3Var);
        hk0.u0 E2 = E();
        du3.k3 k3Var = new du3.k3(this);
        E2.getClass();
        E2.f281817h.observe(E2.f281813d, k3Var);
        E().Z6(10, new du3.l3(this));
        E().Z6(1, new du3.m3(this));
        E().Z6(5, new du3.n3(this));
        E().Z6(4, new du3.o3(this));
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        hk0.o oVar = E().f281821o;
        boolean z17 = false;
        if ((oVar != null ? oVar.f281782a : 0) == 4) {
            l45.q qVar = this.f243726p;
            z17 = true;
            if (qVar != null) {
                new l45.a((l45.n) qVar).b(qk.g6.CROP_PHOTO, 1, null);
            }
            hk0.u0.e7(E(), 4, null, 2, null);
        }
        return z17;
    }

    @Override // yt3.r2
    public void onDetach() {
        kotlinx.coroutines.r2 r2Var = this.f243735y;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.f243736z;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        G();
    }

    @Override // yt3.r2
    public void release() {
        kotlinx.coroutines.z0.e(this.f243734x, null, 1, null);
        l45.q qVar = this.f243726p;
        if (qVar != null) {
            l45.n nVar = (l45.n) qVar;
            try {
                java.util.Iterator it = nVar.f316463d.iterator();
                while (it.hasNext()) {
                    ((dl.b) it.next()).z();
                }
                nVar.p();
            } catch (java.lang.Exception unused) {
            }
        }
        java.lang.Object value = ((jz5.n) this.f243727q).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((qk.o9) value).f();
        java.lang.Object value2 = ((jz5.n) this.f243728r).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((qk.o9) value2).f();
        D().removeAllViews();
        D().setVisibility(8);
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "initLogic");
    }
}
