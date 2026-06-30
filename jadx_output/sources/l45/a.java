package l45;

/* loaded from: classes10.dex */
public class a implements qk.y7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l45.n f316437a;

    public a(l45.n nVar) {
        this.f316437a = nVar;
    }

    @Override // qk.y7
    public void a(qk.g6 g6Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "[onSelectedFeature] features:%s", g6Var);
        qk.g6 g6Var2 = qk.g6.DEFAULT;
        l45.n nVar = this.f316437a;
        if (g6Var == g6Var2) {
            nVar.f316460a.getBaseFooterView().setCurFeatureType(g6Var);
        }
        dn5.c baseFooterView = nVar.f316460a.getBaseFooterView();
        baseFooterView.f242049s = baseFooterView.f242048r;
        if (nVar.f316460a.getSelectedFeatureListener() != null) {
            nVar.f316460a.getSelectedFeatureListener().a(g6Var);
        }
        if (g6Var == qk.g6.CROP_VIDEO) {
            android.view.View footerBg = nVar.f316460a.getFooterBg();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(footerBg, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter$1", "onSelectedFeature", "(Lcom/tencent/mm/api/FeaturesType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            footerBg.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(footerBg, "com/tencent/mm/presenter/DrawingPresenter$1", "onSelectedFeature", "(Lcom/tencent/mm/api/FeaturesType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        dl.b bVar = (dl.b) nVar.f316462c.get(g6Var);
        if (bVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "onSelectedFeature: baseArtist null");
            return;
        }
        if (bVar.f235044f && !bVar.n()) {
            bVar.t();
        }
        if (bVar.m() != dl.a.DEFAULT) {
            ((l45.n) bVar.f235039a).f316460a.getBaseBoardView().setOneFingerMoveEnable(false);
        }
        bVar.B();
        nVar.f316483x = bVar;
        int ordinal = g6Var.ordinal();
        if (ordinal == 2) {
            nVar.u();
            nVar.f316481v = g6Var;
        } else if (ordinal == 3) {
            nVar.f316460a.setActionBarVisible(false);
            nVar.f316460a.setFooterVisible(false);
            nVar.f316460a.c(false);
            nVar.f316481v = g6Var;
        } else if (ordinal != 5) {
            nVar.f316481v = g6Var;
        } else {
            nVar.f316480u = nVar.f316481v;
        }
        nVar.f316460a.getBaseFooterView().setCurFeatureType(g6Var);
    }

    @Override // qk.y7
    public void b(qk.g6 g6Var, int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "[onSelectedDetailFeature] features:%s index:%s", g6Var, java.lang.Integer.valueOf(i17));
        l45.n nVar = this.f316437a;
        if (nVar.f316460a.getSelectedFeatureListener() != null) {
            nVar.f316460a.getSelectedFeatureListener().b(g6Var, i17, obj);
        }
        nVar.f316483x = (dl.b) nVar.f316462c.get(g6Var);
        if (nVar.f().m() == dl.a.DEFAULT) {
            return;
        }
        if (nVar.f316460a.getFooterBg().getVisibility() == 8) {
            android.view.View footerBg = nVar.f316460a.getFooterBg();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(footerBg, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter$1", "onSelectedDetailFeature", "(Lcom/tencent/mm/api/FeaturesType;ILjava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            footerBg.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(footerBg, "com/tencent/mm/presenter/DrawingPresenter$1", "onSelectedDetailFeature", "(Lcom/tencent/mm/api/FeaturesType;ILjava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int ordinal = g6Var.ordinal();
        if (ordinal == 1) {
            dl.u uVar = (dl.u) nVar.f();
            if (i17 == -4) {
                java.lang.String str = (java.lang.String) obj;
                uVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.DoodleArtist", "undoEraser >> %s", str);
                ((l45.n) uVar.f235039a).f316460a.removeCallbacks(uVar.f235048j);
                ym5.h hVar = ((l45.n) uVar.f235039a).f316460a;
                dl.v vVar = new dl.v(uVar, str);
                uVar.f235048j = vVar;
                hVar.postDelayed(vVar, 66L);
                return;
            }
            if (i17 == -3) {
                uVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.DoodleArtist", "setInEraser %b", java.lang.Boolean.TRUE);
                uVar.A = true;
                return;
            }
            if (i17 == -2) {
                uVar.b((java.lang.String) obj);
                return;
            }
            if (i17 == -1) {
                uVar.D();
                return;
            }
            uVar.getClass();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.tencent.mars.xlog.Log.i("MicroMsg.DoodleArtist", "setInEraser %b", bool);
            uVar.A = false;
            hk0.y yVar = uVar.f235142z;
            if (obj != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DoodleArtist", "setCanEraser %b", java.lang.Boolean.TRUE);
                yVar.getClass();
                uVar.f235139w = ((java.lang.Integer) hk0.b.f281700a.get(i17)).intValue();
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.DoodleArtist", "setCanEraser %b", bool);
                yVar.getClass();
                uVar.f235139w = nVar.f316460a.getBaseFooterView().e(i17);
                return;
            }
        }
        if (ordinal == 2 || ordinal == 3) {
            dl.y yVar2 = (dl.y) nVar.f();
            if (-1 == i17) {
                yVar2.T(false, false, (java.lang.String) obj);
                return;
            }
            if (-2 == i17) {
                yVar2.b((java.lang.String) obj);
                return;
            } else if (-3 == i17) {
                yVar2.T(true, false, (java.lang.String) obj);
                return;
            } else {
                if (-4 == i17) {
                    yVar2.T(false, true, (java.lang.String) obj);
                    return;
                }
                return;
            }
        }
        if (ordinal == 4) {
            dl.d0 d0Var = (dl.d0) nVar.f();
            if (i17 == 0) {
                d0Var.I(false);
                d0Var.f235088z = xk0.i.ONE;
                if (obj != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MosaicArtist", "setCanEraser %b", java.lang.Boolean.TRUE);
                    d0Var.A.getClass();
                    return;
                }
                return;
            }
            if (1 == i17) {
                d0Var.I(false);
                d0Var.f235088z = xk0.i.TWO;
                if (obj != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MosaicArtist", "setCanEraser %b", java.lang.Boolean.TRUE);
                    d0Var.A.getClass();
                    return;
                }
                return;
            }
            if (-2 == i17) {
                d0Var.b((java.lang.String) obj);
                return;
            }
            if (-1 == i17) {
                d0Var.D();
                return;
            }
            if (-3 == i17) {
                d0Var.I(true);
                return;
            }
            if (-4 == i17) {
                java.lang.String str2 = (java.lang.String) obj;
                d0Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.MosaicArtist", "undoMosaicWithEraser >> %s", str2);
                ((l45.n) d0Var.f235039a).f316460a.removeCallbacks(d0Var.f235048j);
                ym5.h hVar2 = ((l45.n) d0Var.f235039a).f316460a;
                dl.e0 e0Var = new dl.e0(d0Var, str2);
                d0Var.f235048j = e0Var;
                hVar2.postDelayed(e0Var, 66L);
                return;
            }
            return;
        }
        if (ordinal != 5) {
            if (ordinal != 7) {
                return;
            }
            dl.z zVar = (dl.z) nVar.f();
            float floatValue = ((java.lang.Float) obj).floatValue();
            um.l lVar = (um.l) zVar.d();
            if (lVar != null) {
                lVar.f428686d = i17;
            }
            um.l lVar2 = (um.l) zVar.d();
            if (lVar2 != null) {
                lVar2.f428687e = floatValue;
            }
            nVar.f316460a.getBaseBoardView().postInvalidate();
            com.tencent.mars.xlog.Log.i("MicroMsg.DrawingPresenter", "lxl postInvalidate");
            return;
        }
        dl.t tVar = (dl.t) nVar.f();
        if (i17 == 0) {
            tVar.Y++;
            tVar.H.a();
            android.animation.ValueAnimator valueAnimator = tVar.W;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (tVar.l() != null) {
                tVar.f235121J.a();
            }
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postRotate(-90, tVar.f235130x.centerX(), tVar.f235130x.centerY());
            android.graphics.Rect rect = tVar.X;
            if (rect.isEmpty()) {
                rect.set(tVar.f235130x);
            }
            android.graphics.RectF rectF = new android.graphics.RectF(rect);
            matrix.mapRect(rectF);
            android.graphics.Rect rect2 = tVar.C;
            float width = (rect2.width() * 1.0f) / rectF.width();
            float height = (rect2.height() * 1.0f) / rectF.height();
            if (width >= height) {
                width = height;
            }
            matrix.postScale(width, width, tVar.f235130x.centerX(), tVar.f235130x.centerY());
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            float centerX = tVar.f235130x.centerX();
            float centerY = tVar.f235130x.centerY();
            android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofInt("rotation", 0, -90), android.animation.PropertyValuesHolder.ofInt("deltaX", 0, rect2.centerX() - ((int) centerX)), android.animation.PropertyValuesHolder.ofInt("deltaY", 0, rect2.centerY() - ((int) centerY)));
            ofPropertyValuesHolder.addUpdateListener(new dl.i(tVar, centerX, centerY, width));
            ofPropertyValuesHolder.addListener(new dl.j(tVar));
            ofPropertyValuesHolder.setDuration(200L);
            ofPropertyValuesHolder.start();
            return;
        }
        if (1 == i17) {
            tVar.I();
            nVar.f316483x = (dl.b) nVar.f316462c.get(nVar.f316480u);
            nVar.f316460a.getBaseFooterView().setCurFeatureType(nVar.f316480u);
            return;
        }
        if (2 == i17) {
            tVar.J();
            nVar.f316483x = (dl.b) nVar.f316462c.get(nVar.f316480u);
            nVar.f316460a.getBaseFooterView().setCurFeatureType(nVar.f316480u);
            return;
        }
        if (3 == i17) {
            tVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.CropArtist", "[reset]");
            tVar.Z = false;
            tVar.H.a();
            android.animation.ValueAnimator valueAnimator2 = tVar.W;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (tVar.l() != null) {
                tVar.f235121J.a();
            }
            tVar.X.setEmpty();
            tVar.N();
            tVar.P = false;
            ((l45.n) tVar.f235039a).f316460a.getBaseBoardView().f22945i = tVar.f235130x;
            ((l45.n) tVar.f235039a).f316460a.getBaseBoardView().b(new dl.s(tVar), tVar.i(), true);
            return;
        }
        qk.g6 g6Var2 = qk.g6.DEFAULT;
        if (-1 == i17) {
            nVar.f316483x = (dl.b) nVar.f316462c.get(g6Var2);
            nVar.f316460a.getBaseFooterView().setCurFeatureType(g6Var2);
            tVar.P();
            return;
        }
        if (-2 == i17) {
            nVar.f316483x = (dl.b) nVar.f316462c.get(g6Var2);
            nVar.f316460a.getBaseFooterView().setCurFeatureType(g6Var2);
            tVar.P();
        } else if (4 == i17) {
            tVar.J();
            nVar.f316483x = (dl.b) nVar.f316462c.get(g6Var2);
            nVar.f316460a.getBaseFooterView().setCurFeatureType(g6Var2);
        } else if (5 == i17) {
            tVar.I();
            nVar.f316483x = (dl.b) nVar.f316462c.get(g6Var2);
            nVar.f316460a.getBaseFooterView().setCurFeatureType(g6Var2);
        }
    }

    @Override // qk.y7
    public void c(boolean z17) {
    }
}
