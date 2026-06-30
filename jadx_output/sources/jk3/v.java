package jk3;

/* loaded from: classes8.dex */
public abstract class v extends jk3.b implements kk3.e {

    /* renamed from: d, reason: collision with root package name */
    public final ak3.c f300111d;

    /* renamed from: e, reason: collision with root package name */
    public kk3.d f300112e;

    /* renamed from: f, reason: collision with root package name */
    public kk3.d f300113f;

    /* renamed from: g, reason: collision with root package name */
    public kk3.g f300114g;

    /* renamed from: h, reason: collision with root package name */
    public dk3.f f300115h;

    /* renamed from: i, reason: collision with root package name */
    public ek3.a f300116i;

    /* renamed from: j, reason: collision with root package name */
    public kk3.d f300117j;

    /* renamed from: k, reason: collision with root package name */
    public jk3.d f300118k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f300119l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f300120m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f300121n;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f300123p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f300124q;

    /* renamed from: r, reason: collision with root package name */
    public jk3.f f300125r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f300126s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f300127t;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.multitask.m0 f300129v;

    /* renamed from: w, reason: collision with root package name */
    public int f300130w;

    /* renamed from: o, reason: collision with root package name */
    public int f300122o = -1;

    /* renamed from: u, reason: collision with root package name */
    public boolean f300128u = true;

    public v(ak3.c cVar) {
        this.f300111d = cVar;
    }

    public static final void M(jk3.v vVar) {
        android.graphics.Bitmap bitmap;
        ak3.c cVar = vVar.f300111d;
        if ((cVar != null ? ((ak3.i) cVar).f5588m : null) != null) {
            if (cVar != null && (bitmap = ((ak3.i) cVar).f5588m) != null) {
                bitmap.recycle();
            }
            if (cVar == null) {
                return;
            }
            ((ak3.i) cVar).f5588m = null;
        }
    }

    public static final void N(jk3.v vVar, int i17) {
        if (vVar.T()) {
            switch (i17) {
                case 7:
                    vVar.f300130w = 1;
                    break;
                case 8:
                    vVar.f300130w = 2;
                    break;
                case 9:
                    vVar.f300130w = 3;
                    break;
                case 10:
                    vVar.f300130w = 4;
                    break;
                default:
                    vVar.f300130w = 0;
                    break;
            }
            com.tencent.mm.plugin.multitask.m0 m0Var = vVar.f300129v;
            if (m0Var != null) {
                m0Var.e(vVar.f300130w);
            }
        }
    }

    @Override // jk3.b
    public void C(boolean z17, int i17) {
        W(z17, i17, jk3.c.f300080d);
    }

    public void O(jk3.g gVar) {
        if (gVar != null) {
            gVar.a();
        }
    }

    public final android.graphics.Bitmap P(android.graphics.Bitmap bitmap, boolean z17) {
        r45.lr4 v07;
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        ak3.c cVar = this.f300111d;
        android.app.Activity activity = cVar != null ? cVar.getActivity() : null;
        ((com.tencent.mm.plugin.multitask.p1) l0Var).getClass();
        if (activity == null ? false : ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Di(activity)) {
            return null;
        }
        if (!v()) {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
            v07 = multiTaskInfo != null ? multiTaskInfo.v0() : null;
            if (v07 != null) {
                v07.set(9, 0);
            }
            return bitmap;
        }
        if (bitmap != null) {
            if (z17) {
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = this.f300077a;
                r45.lr4 v08 = multiTaskInfo2 != null ? multiTaskInfo2.v0() : null;
                if (v08 != null) {
                    v08.set(9, 90);
                }
                if (cVar == null || al3.a.f5845a.a(((ak3.i) cVar).f5589n)) {
                    return null;
                }
                try {
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    float f17 = 2;
                    matrix.setRotate(90, width / f17, height / f17);
                    zj0.a aVar = new zj0.a();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    aVar.c(java.lang.Boolean.TRUE);
                    aVar.c(matrix);
                    aVar.c(java.lang.Integer.valueOf((int) height));
                    aVar.c(java.lang.Integer.valueOf((int) width));
                    aVar.c(0);
                    aVar.c(0);
                    aVar.c(bitmap);
                    java.lang.Object obj = new java.lang.Object();
                    yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/multitask/adapter/MultiTaskPageAdapter", "getBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                    yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/multitask/adapter/MultiTaskPageAdapter", "getBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                    return createBitmap;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MultiTaskPageAdapter", "get rotate bitmap failed", th6);
                    return null;
                }
            }
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo3 = this.f300077a;
            v07 = multiTaskInfo3 != null ? multiTaskInfo3.v0() : null;
            if (v07 != null) {
                v07.set(9, 0);
            }
        }
        return bitmap;
    }

    public void Q(boolean z17) {
        this.f300112e = new jk3.j(this, z17);
    }

    public final void R() {
        com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView floatMultiTaskIndicatorView;
        android.widget.ImageView imageView;
        java.lang.String string;
        boolean a17 = a();
        ak3.c cVar = this.f300111d;
        if (a17 && s()) {
            if (x() || c(0)) {
                if ((cVar != null ? cVar.getActivity() : null) instanceof com.tencent.mm.ui.MMActivity) {
                    if (this.f300116i == null) {
                        ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
                        fk3.o oVar = new fk3.o();
                        this.f300116i = oVar;
                        if (cVar != null) {
                            oVar.e(cVar, this, this.f300113f);
                        }
                    }
                    this.f300126s = x();
                    return;
                }
                if ((cVar != null ? cVar.getActivity() : null) instanceof com.tencent.mm.ui.MMFragmentActivity) {
                    if (this.f300116i == null) {
                        ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
                        gk3.m mVar = new gk3.m();
                        this.f300116i = mVar;
                        if (cVar != null) {
                            mVar.d(cVar, this, this.f300113f);
                        }
                    }
                    this.f300126s = x();
                    return;
                }
                return;
            }
            return;
        }
        if (x() && this.f300115h == null) {
            if (cVar != null) {
                com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
                kk3.g gVar = this.f300114g;
                ((com.tencent.mm.plugin.multitask.p1) l0Var).getClass();
                this.f300115h = new dk3.e(this, cVar, gVar);
            }
            dk3.f fVar = this.f300115h;
            if (fVar != null) {
                ((dk3.e) fVar).c();
            }
            dk3.f fVar2 = this.f300115h;
            if (fVar2 == null || (floatMultiTaskIndicatorView = ((dk3.e) fVar2).f234452d) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatMultiTaskIndicatorView", "onFloatBallInfoCountChanged");
            android.widget.TextView textView = floatMultiTaskIndicatorView.indicatorTextView;
            if (textView != null) {
                android.content.Context context = floatMultiTaskIndicatorView.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                if (((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai()) {
                    string = b3.l.getString(context, com.tencent.mm.R.string.c0x);
                    kotlin.jvm.internal.o.d(string);
                } else {
                    string = b3.l.getString(context, com.tencent.mm.R.string.h0u);
                    kotlin.jvm.internal.o.d(string);
                }
                textView.setText(string);
            }
            android.widget.TextView textView2 = floatMultiTaskIndicatorView.indicatorTextView;
            if (textView2 != null) {
                textView2.setTextColor(b3.l.getColor(floatMultiTaskIndicatorView.getContext(), floatMultiTaskIndicatorView.a() ? com.tencent.mm.R.color.adh : com.tencent.mm.R.color.f479129qs));
            }
            android.widget.ImageView imageView2 = floatMultiTaskIndicatorView.f150412d;
            if (imageView2 != null) {
                imageView2.setImageResource(com.tencent.mm.R.drawable.f480884en);
            }
            android.widget.ImageView imageView3 = floatMultiTaskIndicatorView.indicatorImageView;
            if (imageView3 != null) {
                imageView3.setImageDrawable(m95.a.e(floatMultiTaskIndicatorView.getResources(), ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? com.tencent.mm.R.raw.icons_multi_task_star_line_regular : com.tencent.mm.R.raw.multitask_indicator_icon, 0.0f));
            }
            if (!floatMultiTaskIndicatorView.a() || (imageView = floatMultiTaskIndicatorView.indicatorImageView) == null) {
                return;
            }
            imageView.setColorFilter(new android.graphics.PorterDuffColorFilter(b3.l.getColor(floatMultiTaskIndicatorView.getContext(), com.tencent.mm.R.color.adh), android.graphics.PorterDuff.Mode.SRC_IN));
        }
    }

    public final void S(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "finishPage");
        if (T() && !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "is not need to finish page");
            return;
        }
        ak3.c cVar = this.f300111d;
        if ((cVar != null ? cVar.getActivity() : null) instanceof com.tencent.mm.ui.MMActivity) {
            com.tencent.mm.sdk.platformtools.u3.i(new jk3.p(this), 200L);
        }
        if (cVar != null) {
            cVar.j(false, this);
        }
    }

    public final boolean T() {
        return ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U(int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jk3.v.U(int, boolean):boolean");
    }

    public void V(boolean z17, int i17, jk3.c animType) {
        kotlin.jvm.internal.o.g(animType, "animType");
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "animType: %s", animType.toString());
        W(z17, i17, animType);
    }

    public final void W(boolean z17, int i17, jk3.c cVar) {
        r45.kr4 kr4Var = this.f300079c;
        r45.er4 er4Var = kr4Var != null ? (r45.er4) kr4Var.getCustom(6) : null;
        if (er4Var != null) {
            er4Var.set(0, java.lang.Long.valueOf(i17));
        }
        if (!a() || !s()) {
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "onMenuMultiTaskSelected, enter multiTask, type: %d", java.lang.Integer.valueOf(i17));
                O(new jk3.r(this, cVar, i17));
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "onMenuMultiTaskSelected, do nothing");
                a0();
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "onMenuMultiTaskSelected, has info, type: %d", java.lang.Integer.valueOf(i17));
        r45.kr4 kr4Var2 = this.f300079c;
        r45.er4 er4Var2 = kr4Var2 != null ? (r45.er4) kr4Var2.getCustom(6) : null;
        if (er4Var2 != null) {
            er4Var2.set(1, 1L);
        }
        if (!z17) {
            a0();
        }
        U(4, false);
    }

    public final void X(android.graphics.Bitmap bitmap, boolean z17, boolean z18, boolean z19, boolean z27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "onMultiTaskAnimDone, forceUpdate:" + z17 + ", needUpdateInfo:" + z18 + ", needShowTip:" + z19);
        if (z18) {
            l(bitmap, z17);
        }
        if (!z19) {
            S(z27);
            return;
        }
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        jk3.s sVar = new jk3.s(this, z27);
        ((com.tencent.mm.plugin.multitask.p1) l0Var).getClass();
        ak3.c cVar = this.f300111d;
        if (cVar != null) {
            cVar.getActivity();
        }
        boolean z28 = com.tencent.mm.sdk.platformtools.o4.M("multitask_tips_config").getBoolean(((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).Di() ? "multitask_new_tips_show" : "multitask_tips_show", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskTipsHelper", "showTips, flag: " + z28);
        if (z28) {
            S(z27);
            return;
        }
        ok3.a aVar = new ok3.a(sVar);
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        com.tencent.mm.sdk.platformtools.u3.i(aVar, 0L);
    }

    public void Y(int i17, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
    }

    public boolean Z() {
        return true;
    }

    @Override // jk3.b, jk3.e
    public boolean a() {
        r45.fr4 fr4Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f300119l)) {
            r45.w60 w60Var = this.f300078b;
            if (com.tencent.mm.sdk.platformtools.t8.K0((w60Var == null || (fr4Var = (r45.fr4) w60Var.getCustom(0)) == null) ? null : fr4Var.getString(0)) && com.tencent.mm.sdk.platformtools.t8.K0(this.f300120m)) {
                return false;
            }
        }
        return true;
    }

    public final void a0() {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
        if (multiTaskInfo != null) {
            if (((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ri(multiTaskInfo) : false) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) c17;
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = this.f300077a;
                kotlin.jvm.internal.o.d(multiTaskInfo2);
                java.lang.String str = multiTaskInfo2.field_id;
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo3 = this.f300077a;
                kotlin.jvm.internal.o.d(multiTaskInfo3);
                com.tencent.mm.plugin.multitask.l0.C7(l0Var, str, multiTaskInfo3.field_type, false, 4, null);
                ak3.c cVar = this.f300111d;
                if ((cVar != null ? cVar.getActivity() : null) != null) {
                    android.app.Activity activity = cVar != null ? cVar.getActivity() : null;
                    int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
                    e4Var.d(com.tencent.mm.R.string.oa8);
                    e4Var.c();
                }
                com.tencent.mm.plugin.multitask.l0 l0Var2 = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo4 = this.f300077a;
                ((com.tencent.mm.plugin.multitask.p1) l0Var2).getClass();
                ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).getClass();
                java.util.Iterator it = com.tencent.mm.plugin.multitask.i1.f150444x.iterator();
                while (it.hasNext()) {
                    ((jk3.d) it.next()).a(0, multiTaskInfo4);
                }
            }
        }
    }

    @Override // jk3.b, jk3.e
    public android.graphics.Bitmap b() {
        android.graphics.Bitmap a17;
        r45.fr4 fr4Var;
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        r45.w60 w60Var = this.f300078b;
        ((com.tencent.mm.plugin.multitask.p1) l0Var).getClass();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            a17 = al3.b.f5849a.a(com.tencent.mm.plugin.multitask.u0.f150506a.b("Home"), null);
        } else {
            a17 = al3.b.f5849a.a((w60Var == null || (fr4Var = (r45.fr4) w60Var.getCustom(0)) == null) ? null : fr4Var.getString(3), null);
        }
        ((ku5.t0) ku5.t0.f312615d).q(new jk3.q(this));
        return a17;
    }

    public void b0(r45.w60 w60Var) {
        r45.kr4 kr4Var;
        r45.fr4 fr4Var;
        r45.fr4 fr4Var2;
        r45.fr4 fr4Var3;
        r45.fr4 fr4Var4;
        r45.fr4 fr4Var5;
        this.f300119l = (w60Var == null || (fr4Var5 = (r45.fr4) w60Var.getCustom(0)) == null) ? null : fr4Var5.getString(1);
        this.f300120m = (w60Var == null || (fr4Var4 = (r45.fr4) w60Var.getCustom(0)) == null) ? null : fr4Var4.getString(4);
        if (w60Var != null && (fr4Var3 = (r45.fr4) w60Var.getCustom(0)) != null) {
            fr4Var3.getBoolean(5);
        }
        if (w60Var != null && (fr4Var2 = (r45.fr4) w60Var.getCustom(0)) != null) {
            fr4Var2.getBoolean(6);
        }
        this.f300122o = (w60Var == null || (fr4Var = (r45.fr4) w60Var.getCustom(0)) == null) ? -1 : fr4Var.getInteger(7);
        this.f300121n = w60Var != null && w60Var.getBoolean(2);
        this.f300078b = w60Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "commoninfo position: " + this.f300119l + ",ori_position: " + this.f300120m + ", itemPos:" + this.f300122o + ", fromTaskBar:" + java.lang.Boolean.valueOf(this.f300121n).booleanValue());
        if (a()) {
            pm0.v.V(n(), new jk3.t(this, w60Var));
            if (v()) {
                ak3.c cVar = this.f300111d;
                android.app.Activity activity = cVar != null ? cVar.getActivity() : null;
                if (activity != null) {
                    activity.setRequestedOrientation(-1);
                }
            }
        }
        if (w60Var == null && (kr4Var = this.f300079c) != null) {
            kr4Var.set(0, "");
        }
        if (w60Var != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(w60Var.getString(1))) {
                r45.kr4 kr4Var2 = this.f300079c;
                if (kr4Var2 != null) {
                    kr4Var2.set(0, w60Var.getString(1));
                }
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
                if (multiTaskInfo != null) {
                    r45.kr4 kr4Var3 = this.f300079c;
                    if (kr4Var3 != null) {
                        kr4Var3.set(3, java.lang.Integer.valueOf(multiTaskInfo.field_type));
                    }
                    r45.kr4 kr4Var4 = this.f300079c;
                    if (kr4Var4 != null) {
                        kr4Var4.set(2, multiTaskInfo.field_id);
                    }
                }
                r45.kr4 kr4Var5 = this.f300079c;
                r45.gr4 gr4Var = kr4Var5 != null ? (r45.gr4) kr4Var5.getCustom(5) : null;
                if (gr4Var != null) {
                    ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
                    gr4Var.set(0, java.lang.Long.valueOf(c01.id.c()));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "secdata multitask scene enter contextId: %s", w60Var.getString(1));
            }
            r45.fr4 fr4Var6 = (r45.fr4) w60Var.getCustom(0);
            if (fr4Var6 != null) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis < fr4Var6.getLong(8) || fr4Var6.getLong(8) == 0) {
                    return;
                }
                r45.kr4 kr4Var6 = this.f300079c;
                r45.jr4 jr4Var = kr4Var6 != null ? (r45.jr4) kr4Var6.getCustom(8) : null;
                if (jr4Var != null) {
                    jr4Var.set(0, java.lang.Long.valueOf(currentTimeMillis - fr4Var6.getLong(8)));
                }
                fr4Var6.set(8, 0L);
            }
        }
    }

    @Override // jk3.b, jk3.e
    public boolean d() {
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        ak3.c cVar = this.f300111d;
        android.app.Activity activity = cVar != null ? cVar.getActivity() : null;
        ((com.tencent.mm.plugin.multitask.p1) l0Var).getClass();
        if ((activity == null ? false : ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Di(activity)) || T()) {
            return false;
        }
        return this.f300126s;
    }

    @Override // jk3.b, jk3.e
    public java.lang.String e() {
        return this.f300120m;
    }

    @Override // jk3.b, jk3.e
    public boolean f() {
        android.app.Activity activity;
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        ak3.c cVar = this.f300111d;
        return (cVar == null || (activity = cVar.getActivity()) == null || (resources = activity.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true;
    }

    @Override // jk3.b, jk3.e
    public java.lang.String getPosition() {
        return this.f300119l;
    }

    @Override // jk3.b, jk3.e
    public android.graphics.Bitmap h(android.graphics.Bitmap bitmap) {
        return P(bitmap, f());
    }

    @Override // jk3.b, jk3.e
    public void k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "showHome");
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.multitask.l0.Bd((com.tencent.mm.plugin.multitask.l0) c17, 1, null, 0, null, 14, null);
        pm0.v.V(50L, new jk3.u(this));
    }

    @Override // kk3.e
    public void onOrientationChange(int i17) {
    }

    @Override // jk3.b
    public int p() {
        return this.f300122o;
    }

    @Override // jk3.b
    public void y(int i17, java.lang.String str) {
        android.app.Activity activity;
        r45.kr4 kr4Var;
        android.content.Intent intent;
        com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView;
        java.lang.String str2;
        boolean z17;
        java.util.Collection collection;
        super.y(i17, str);
        ak3.c cVar = this.f300111d;
        if (cVar != null) {
            ak3.i iVar = (ak3.i) cVar;
            iVar.f5589n = i17;
            try {
                str2 = j62.e.g().f(new com.tencent.mm.repairer.config.multitask.RepairerConfigGlobalExpandEdgeSize());
            } catch (java.lang.Exception unused) {
                str2 = null;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                if (!kotlin.jvm.internal.o.b(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BOTH_PATTERN, str2)) {
                    kotlin.jvm.internal.o.d(str2);
                    java.util.List g17 = new r26.t(",").g(str2, 0);
                    if (!g17.isEmpty()) {
                        java.util.ListIterator listIterator = g17.listIterator(g17.size());
                        while (listIterator.hasPrevious()) {
                            if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                                collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    collection = kz5.p0.f313996d;
                    if (kz5.z.G((java.lang.String[]) collection.toArray(new java.lang.String[0]), java.lang.String.valueOf(i17))) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskPageAdapter", "enable expand edgeSize. type: " + i17);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskPageAdapter", "disable expand edgeSize. type: " + i17);
                    }
                }
                z17 = true;
                iVar.f5591p = z17;
            }
            z17 = false;
            iVar.f5591p = z17;
        }
        Q(false);
        this.f300113f = new jk3.o(this);
        this.f300114g = new jk3.l(this);
        if ((this instanceof pa3.p) && T()) {
            this.f300118k = new jk3.k(this);
            com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
            jk3.d dVar = this.f300118k;
            ((com.tencent.mm.plugin.multitask.p1) l0Var).getClass();
            ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).getClass();
            if (dVar != null) {
                com.tencent.mm.plugin.multitask.i1.f150444x.add(dVar);
            }
        }
        this.f300129v = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ni();
        ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
        pk3.l lVar = new pk3.l();
        lVar.f356459e = cVar;
        pk3.e eVar = lVar.f356458d;
        if ((eVar != null) && eVar != null && (multiTaskFloatBallView = eVar.f356441a) != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) multiTaskFloatBallView.f150511g).add(this);
        }
        this.f300125r = lVar;
        if (cVar != null && (intent = cVar.getIntent()) != null) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("key_multi_task_common_info");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initData: commonDataBytes size ");
            sb6.append(byteArrayExtra != null ? java.lang.Integer.valueOf(byteArrayExtra.length) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", sb6.toString());
            if (byteArrayExtra != null) {
                r45.w60 w60Var = new r45.w60();
                try {
                    w60Var.parseFrom(byteArrayExtra);
                } catch (java.lang.Exception unused2) {
                }
                b0(w60Var);
                r45.fr4 fr4Var = (r45.fr4) w60Var.getCustom(0);
                if (fr4Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(fr4Var.getString(1))) {
                    fr4Var.getString(0);
                }
            }
        }
        if (w() && a() && cVar != null) {
            cVar.k(this);
        }
        R();
        com.tencent.mm.plugin.multitask.l0 l0Var2 = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        r45.kr4 kr4Var2 = this.f300079c;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
        com.tencent.mm.plugin.multitask.p1 p1Var = (com.tencent.mm.plugin.multitask.p1) l0Var2;
        p1Var.getClass();
        if (cVar == null || (activity = cVar.getActivity()) == null || (kr4Var = (r45.kr4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ri(activity, 1, 5, r45.kr4.class)) == null) {
            return;
        }
        if (multiTaskInfo != null) {
            if (kr4Var2 != null) {
                kr4Var2.set(3, java.lang.Integer.valueOf(multiTaskInfo.field_type));
            }
            if (kr4Var2 != null) {
                kr4Var2.set(2, multiTaskInfo.field_id);
            }
        }
        if (kr4Var2 != null) {
            kr4Var2.set(0, kr4Var.getString(0));
        }
        r45.gr4 gr4Var = kr4Var2 != null ? (r45.gr4) kr4Var2.getCustom(5) : null;
        if (gr4Var != null) {
            gr4Var.set(0, java.lang.Long.valueOf(c01.id.c()));
        }
        com.tencent.mars.xlog.Log.i(p1Var.f150479d, "SecData multitask scene enter contextId: %s", kr4Var.getString(0));
    }
}
