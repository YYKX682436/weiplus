package yj2;

/* loaded from: classes10.dex */
public class e extends android.widget.RelativeLayout implements xh2.f {

    /* renamed from: d, reason: collision with root package name */
    public final int f462650d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f462651e;

    /* renamed from: f, reason: collision with root package name */
    public final int f462652f;

    /* renamed from: g, reason: collision with root package name */
    public yj2.f f462653g;

    /* renamed from: h, reason: collision with root package name */
    public final fg2.g0 f462654h;

    /* renamed from: i, reason: collision with root package name */
    public km2.q f462655i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f462656m;

    /* renamed from: n, reason: collision with root package name */
    public int f462657n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f462658o;

    /* renamed from: p, reason: collision with root package name */
    public pm2.a f462659p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, int i17, java.lang.String coverUrl, int i18) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        this.f462650d = i17;
        this.f462651e = coverUrl;
        this.f462652f = i18;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.auk, (android.view.ViewGroup) this, false);
        int i19 = com.tencent.mm.R.id.eop;
        android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.eop);
        if (a17 != null) {
            fg2.j1 a18 = fg2.j1.a(a17);
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) inflate;
            int i27 = com.tencent.mm.R.id.gxq;
            androidx.constraintlayout.widget.Guideline guideline = (androidx.constraintlayout.widget.Guideline) x4.b.a(inflate, com.tencent.mm.R.id.gxq);
            if (guideline != null) {
                i27 = com.tencent.mm.R.id.jis;
                com.tencent.mm.plugin.finder.live.mic.view.PotholingImageView potholingImageView = (com.tencent.mm.plugin.finder.live.mic.view.PotholingImageView) x4.b.a(inflate, com.tencent.mm.R.id.jis);
                if (potholingImageView != null) {
                    i27 = com.tencent.mm.R.id.jix;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.jix);
                    if (imageView != null) {
                        i27 = com.tencent.mm.R.id.jj9;
                        android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.jj9);
                        if (imageView2 != null) {
                            i27 = com.tencent.mm.R.id.f486320kw2;
                            android.widget.ImageView imageView3 = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.f486320kw2);
                            if (imageView3 != null) {
                                i27 = com.tencent.mm.R.id.f486321kw3;
                                android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f486321kw3);
                                if (textView != null) {
                                    this.f462654h = new fg2.g0(roundCornerConstraintLayout, a18, roundCornerConstraintLayout, guideline, potholingImageView, imageView, imageView2, imageView3, textView);
                                    this.f462659p = pm2.a.f356853f;
                                    addView(roundCornerConstraintLayout);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            i19 = i27;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i19)));
    }

    private final int getRadius() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yj2.g r8) {
        /*
            r7 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.o.g(r8, r0)
            pm2.a r0 = r8.f462664b
            r7.f462659p = r0
            yj2.f r1 = r8.f462668f
            r7.f462653g = r1
            pm2.a r1 = pm2.a.f356855h
            r2 = 0
            r3 = 0
            r4 = 1
            xh2.a r5 = r8.f462663a
            if (r0 != r1) goto L30
            if (r5 == 0) goto L23
            xh2.i r0 = r5.f454521b
            if (r0 == 0) goto L23
            int r0 = r0.f454555g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L24
        L23:
            r0 = r2
        L24:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r0 = kotlin.jvm.internal.o.b(r0, r6)
            if (r0 == 0) goto L30
            r0 = r4
            goto L31
        L30:
            r0 = r3
        L31:
            r7.f462656m = r0
            int r0 = r8.f462666d
            r7.f462657n = r0
            java.util.ArrayList r0 = r8.f462667e
            r7.f462658o = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "start bindData isAudioMode: "
            r0.<init>(r6)
            boolean r8 = r8.f462665c
            r0.append(r8)
            java.lang.String r6 = " isNormalFocusMode: "
            r0.append(r6)
            boolean r6 = r7.f462656m
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r7.e(r0)
            if (r5 == 0) goto L5d
            km2.q r2 = r5.f454520a
        L5d:
            r7.f462655i = r2
            pm2.a r0 = r7.f462659p
            if (r0 == r1) goto L65
            r0 = r4
            goto L66
        L65:
            r0 = r3
        L66:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            fg2.g0 r2 = r7.f462654h
            if (r0 != 0) goto L82
            android.widget.ImageView r0 = r2.f262047e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            kotlin.jvm.internal.o.e(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            boolean r5 = r7.f462656m
            if (r5 == 0) goto L7e
            r5 = 1048576000(0x3e800000, float:0.25)
            goto L80
        L7e:
            r5 = 1056964608(0x3f000000, float:0.5)
        L80:
            r0.N = r5
        L82:
            r7.setCorner(r3)
            int r0 = r7.f462650d
            if (r0 == r4) goto La8
            r5 = 2
            if (r0 == r5) goto L97
            r5 = 3
            if (r0 == r5) goto L93
            r5 = 4
            if (r0 == r5) goto L93
            goto Lab
        L93:
            r7.c(r8)
            goto Lab
        L97:
            km2.q r8 = r7.f462655i
            if (r8 == 0) goto Lab
            android.widget.ImageView r8 = r2.f262047e
            r5 = 8
            r8.setVisibility(r5)
            android.widget.ImageView r8 = r2.f262048f
            r8.setVisibility(r5)
            goto Lab
        La8:
            r7.d()
        Lab:
            androidx.constraintlayout.widget.Guideline r8 = r2.f262045c
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            kotlin.jvm.internal.o.e(r8, r1)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8
            boolean r1 = r7.f462656m
            if (r1 == 0) goto Lbe
            if (r0 != r4) goto Lbe
            int r3 = r7.f462657n
        Lbe:
            r8.f10881b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yj2.e.a(yj2.g):void");
    }

    public final void b(boolean z17) {
        jz5.f0 f0Var;
        fg2.g0 g0Var = this.f462654h;
        if (!z17) {
            g0Var.f262046d.n();
            return;
        }
        java.util.ArrayList arrayList = this.f462658o;
        if (arrayList != null) {
            g0Var.f262046d.r(getRadius(), arrayList);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            g0Var.f262046d.n();
        }
    }

    public void c(boolean z17) {
        this.f462654h.f262047e.setVisibility(8);
        this.f462654h.f262048f.setVisibility(8);
        com.tencent.mars.xlog.Log.i("MicCommonFocusWidget", "fillAnchorContent: " + z17 + " coverUrl: " + this.f462651e + " drawable: " + this.f462654h.f262046d.getDrawable() + " micType: " + this.f462650d);
        if (!z17) {
            yj2.f fVar = this.f462653g;
            if (fVar != null && fVar.f462662c >= fVar.f462660a) {
                fVar.f462661b.invoke();
            }
            this.f462654h.f262046d.setVisibility(4);
            return;
        }
        this.f462654h.f262046d.setVisibility(0);
        if (this.f462654h.f262046d.getDrawable() == null || this.f462654h.f262046d.getVisibility() == 8) {
            com.tencent.mars.xlog.Log.i("MicCommonFocusWidget", "fillAnchorContent load anchorBitmap");
            java.lang.String str = this.f462651e;
            if (str == null || str.length() == 0) {
                return;
            }
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
            java.lang.String str2 = this.f462651e;
            if (str2 == null) {
                str2 = "";
            }
            wo0.c a17 = d1Var.a(new mn2.j0(str2));
            yj2.c cVar = new yj2.c(this, z17);
            a17.getClass();
            a17.f447873d = cVar;
            a17.f();
        }
    }

    public void d() {
        km2.q qVar = this.f462655i;
        if (qVar != null) {
            boolean z17 = true;
            if (this.f462659p != pm2.a.f356855h) {
                this.f462654h.f262047e.setVisibility(8);
                android.widget.ImageView micNormalHead = this.f462654h.f262048f;
                kotlin.jvm.internal.o.f(micNormalHead, "micNormalHead");
                g(qVar, micNormalHead);
            } else {
                this.f462654h.f262048f.setVisibility(8);
                android.widget.ImageView micFocusHead = this.f462654h.f262047e;
                kotlin.jvm.internal.o.f(micFocusHead, "micFocusHead");
                g(qVar, micFocusHead);
            }
            com.tencent.mm.plugin.finder.live.mic.view.PotholingImageView micBg = this.f462654h.f262046d;
            kotlin.jvm.internal.o.f(micBg, "micBg");
            java.lang.String str = qVar.f309171b;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                ((ku5.t0) ku5.t0.f312615d).g(new po0.d(bp.b.decodeResource(getContext().getResources(), com.tencent.mm.R.raw.default_avatar, null), new yj2.d(micBg), 20.0f, getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_4)));
            } else {
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.c().c(new mn2.e0(qVar.f309171b, com.tencent.mm.plugin.finder.storage.y90.f128356f), micBg, g1Var.h(mn2.f1.f329957h));
            }
            b(this.f462656m);
        }
    }

    public final void e(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveMicMiniFocusWidget_");
        sb6.append(this.f462650d);
        sb6.append('_');
        km2.q qVar = this.f462655i;
        sb6.append(qVar != null ? qVar.f309170a : null);
        com.tencent.mars.xlog.Log.i(sb6.toString(), str);
    }

    public final void f(boolean z17) {
        int i17 = this.f462650d;
        if (i17 == 3 || i17 == 4) {
            e("onAnchorAudioChange: " + z17);
            c(z17);
        }
    }

    public final void g(km2.q userData, android.widget.ImageView imgView) {
        kotlin.jvm.internal.o.g(userData, "userData");
        kotlin.jvm.internal.o.g(imgView, "imgView");
        imgView.setVisibility(0);
        boolean S3 = com.tencent.mm.storage.z3.S3(userData.f309172c);
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (S3) {
            g1Var.a().c(new mn2.n(userData.f309171b, null, 2, null), imgView, g1Var.h(mn2.f1.f329957h));
        } else {
            g1Var.l().c(new mn2.n(userData.f309171b, null, 2, null), imgView, g1Var.h(mn2.f1.f329961o));
        }
    }

    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidgetCallback() {
        return null;
    }

    public final km2.q getBindLinkMicUser() {
        return this.f462655i;
    }

    public final java.lang.String getBindSdkUserId() {
        java.lang.String str;
        km2.q qVar = this.f462655i;
        return (qVar == null || (str = qVar.f309170a) == null) ? "" : str;
    }

    public final java.lang.String getCoverUrl() {
        return this.f462651e;
    }

    public final int getMicType() {
        return this.f462650d;
    }

    public final pm2.a getMicWidgetMode() {
        return this.f462659p;
    }

    public final java.util.ArrayList<android.graphics.RectF> getPotholingRectList() {
        return this.f462658o;
    }

    public final int getRightOffestSize() {
        return this.f462657n;
    }

    public final int getScene() {
        return this.f462652f;
    }

    public final fg2.g0 getViewBinding() {
        return this.f462654h;
    }

    public final void setBindLinkMicUser(km2.q qVar) {
        this.f462655i = qVar;
    }

    public final void setCorner(int i17) {
        this.f462654h.f262043a.setRadius(i17);
    }

    public final void setMicWidgetMode(pm2.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.f462659p = aVar;
    }

    public final void setNormalFocusMode(boolean z17) {
        this.f462656m = z17;
    }

    public final void setPotholingRectList(java.util.ArrayList<android.graphics.RectF> arrayList) {
        this.f462658o = arrayList;
    }

    public final void setRightOffestSize(int i17) {
        this.f462657n = i17;
    }
}
