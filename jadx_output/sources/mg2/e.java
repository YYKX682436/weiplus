package mg2;

/* loaded from: classes10.dex */
public final class e extends lg2.d {
    public int A;

    /* renamed from: v, reason: collision with root package name */
    public boolean f326223v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f326224w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f326225x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.HashSet f326226y;

    /* renamed from: z, reason: collision with root package name */
    public mn0.b0 f326227z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f326226y = new java.util.HashSet();
    }

    public static final void A(mg2.e eVar, android.os.Bundle bundle) {
        ig2.g b17 = eVar.b();
        b17.f291406e = bundle != null ? bundle.getInt("EVT_PARAM1") : 0;
        b17.f291407f = bundle != null ? bundle.getInt("EVT_PARAM2") : 0;
        b17.f291408g = (eVar.b().f291406e == 0 || eVar.b().f291407f == 0) ? 0.0f : (eVar.b().f291406e * 1.0f) / eVar.b().f291407f;
    }

    public static final void B(mg2.e eVar, int i17) {
        eVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleSwitchError: ");
        sb6.append(i17);
        sb6.append(" set: ");
        java.util.HashSet hashSet = eVar.f326226y;
        sb6.append(hashSet);
        com.tencent.mars.xlog.Log.i(eVar.f318557e, sb6.toString());
        hashSet.add(java.lang.Integer.valueOf(i17));
        qg2.e.f362799a.b(eVar.b().f291376k);
    }

    public final r45.p72 C(long j17, long j18) {
        r45.p72 p72Var = new r45.p72();
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        java.lang.String str = a52.a.f1584l;
        android.content.Context context = this.f318556d;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            context = null;
        }
        if (context == null) {
            context = com.tencent.mm.plugin.finder.assist.v1.f102611a.b();
        }
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            int i17 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).f135380n;
            if (i17 == 0 && (context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI)) {
                i17 = ((com.tencent.mm.plugin.finder.ui.MMFinderUI) context).getD();
            }
            if (i17 != 0) {
                str = java.lang.String.valueOf(i17);
            }
        }
        p72Var.set(0, str);
        p72Var.set(3, java.lang.Long.valueOf(j17));
        p72Var.set(4, java.lang.Long.valueOf(j18));
        p72Var.set(1, "SwitchImage_" + c01.id.c());
        p72Var.set(5, 0);
        return p72Var;
    }

    public final void D(java.lang.String str, yz5.l lVar, yz5.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleSwitchInLiveRoomCallback isStartedLivePlay:");
        sb6.append(this.f326223v);
        sb6.append(" invokeSource: ");
        sb6.append(str);
        sb6.append(" errorSet: ");
        java.util.HashSet hashSet = this.f326226y;
        sb6.append(hashSet);
        sb6.append(" hasCallback: ");
        sb6.append(this.f326225x);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f318557e;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        if (!this.f326223v && hashSet.size() == 0) {
            com.tencent.mars.xlog.Log.w(str2, str + " handleSwitchInLiveRoomCallback return for isStartedLivePlay:" + this.f326223v);
            return;
        }
        if (!this.f326224w) {
            com.tencent.mars.xlog.Log.w(str2, str + " handleSwitchInLiveRoomCallback return for isStartedLivePlay:" + this.f326223v);
            return;
        }
        if (this.f326225x) {
            com.tencent.mars.xlog.Log.w(str2, str + " handleSwitchInLiveRoomCallback hasCallback");
            return;
        }
        com.tencent.mars.xlog.Log.i(str2, str + " handleSwitchInLiveRoomCallback");
        this.f326225x = true;
        lVar.invoke(java.lang.Boolean.valueOf(hashSet.size() > 0));
        if (((java.lang.Boolean) aVar.invoke()).booleanValue()) {
            p();
        }
    }

    @Override // kg2.b
    public void f(com.tencent.mm.live.core.view.LiveVideoView renderView, yz5.l onFirstFrameRenderCallback, yz5.a isDetachInvokeFun) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(renderView, "renderView");
        kotlin.jvm.internal.o.g(onFirstFrameRenderCallback, "onFirstFrameRenderCallback");
        kotlin.jvm.internal.o.g(isDetachInvokeFun, "isDetachInvokeFun");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchInLiveRoom isRunning:");
        android.animation.AnimatorSet animatorSet = this.f318564o;
        sb6.append(animatorSet != null ? java.lang.Boolean.valueOf(animatorSet.isRunning()) : null);
        sb6.append(" livePlayer: ");
        sb6.append(this.f326227z);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f318557e;
        com.tencent.mars.xlog.Log.i(str, sb7);
        kz2.c cVar = ig2.o.f291411a;
        kz2.c cVar2 = ig2.o.f291411a;
        cVar2.c("switchInLiveRoom before");
        mn0.b0 b0Var = this.f326227z;
        boolean z17 = b0Var instanceof nn0.c;
        if (b0Var != null) {
            ((mn0.y) b0Var).J(new mg2.c(this, z17, onFirstFrameRenderCallback, isDetachInvokeFun));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f326223v = true;
            com.tencent.mars.xlog.Log.i(str, "isStartedLivePlay:" + this.f326223v);
        }
        mn0.b0 b0Var2 = this.f326227z;
        if (b0Var2 != null) {
            mn0.b0.B(b0Var2, renderView, null, 2, null);
        }
        android.animation.AnimatorSet animatorSet2 = this.f318564o;
        boolean z18 = false;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            z18 = true;
        }
        if (z18) {
            android.animation.AnimatorSet animatorSet3 = this.f318564o;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new mg2.d(this, onFirstFrameRenderCallback, isDetachInvokeFun));
            }
        } else {
            com.tencent.mars.xlog.Log.i(str, "switchInLiveRoom switch view success.");
            this.f326224w = true;
            D("onAnimationEnd2", onFirstFrameRenderCallback, isDetachInvokeFun);
        }
        cVar2.b("switchInLiveRoom after");
    }

    @Override // lg2.d, ez2.b
    public void g(yz5.a onAnimationEndCallback) {
        long j17;
        long j18;
        r45.ka4 ka4Var;
        mn0.b0 b0Var;
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        java.lang.String str = "start preloadPlayer:" + b().f291377l;
        java.lang.String str2 = this.f318557e;
        com.tencent.mars.xlog.Log.i(str2, str);
        u(onAnimationEndCallback);
        this.f326224w = false;
        if (b().f291377l) {
            ig2.g b17 = b();
            r45.ka4 ka4Var2 = b().f291378m;
            long j19 = b().f291403b;
            long j27 = b().f291404c;
            java.lang.String str3 = b17.f291376k;
            if (android.text.TextUtils.isEmpty(str3)) {
                com.tencent.mars.xlog.Log.w(str2, "preloadStartLivePlayer return for liveUrl:" + str3);
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadStartLivePlayer liveUrl:");
            sb6.append(str3);
            sb6.append(",liveSdkChannelParams is null:");
            sb6.append(ka4Var2 == null);
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            this.f326223v = false;
            int X = nn0.c.X(false);
            mn0.b0 N6 = ((im2.g4) ((vd2.f5) pf5.u.f353936a.e(s40.w0.class).c(vd2.f5.class))).N6(this.f318556d, (X == 5 || X == 6) ? 2 : 0);
            this.f326227z = N6;
            ((mn0.y) N6).K(mn0.d0.f329711g, 2);
            mn0.b0 b0Var2 = this.f326227z;
            if (b0Var2 != null) {
                ((mn0.y) b0Var2).f(true);
            }
            mn0.b0 b0Var3 = this.f326227z;
            if (b0Var3 != null) {
                j17 = j27;
                ((mn0.y) b0Var3).F(com.tencent.mm.plugin.finder.live.util.n2.b(com.tencent.mm.plugin.finder.live.util.n2.f115640a, this.f318557e, true, null, ka4Var2, 0, 0, 52, null));
            } else {
                j17 = j27;
            }
            mn0.b0 b0Var4 = this.f326227z;
            if (b0Var4 != null) {
                ((mn0.y) b0Var4).G(true);
            }
            mn0.b0 b0Var5 = this.f326227z;
            if (b0Var5 != null) {
                ((mn0.y) b0Var5).Q(0);
            }
            mn0.b0 b0Var6 = this.f326227z;
            if (b0Var6 != null) {
                j18 = j19;
                ka4Var = ka4Var2;
                ((mn0.y) b0Var6).J(new mg2.b(this, ka4Var2, j19, j17));
            } else {
                j18 = j19;
                ka4Var = ka4Var2;
            }
            mn0.l0 l0Var = b().f291379n;
            if (l0Var != null && (b0Var = this.f326227z) != null) {
                ((mn0.y) b0Var).N(l0Var);
            }
            mn0.b0 b0Var7 = this.f326227z;
            if (b0Var7 != null) {
                mn0.b0.D(b0Var7, qg2.e.f362799a.a(b().f291376k, b().f291378m), 1, ka4Var, C(j18, j17), false, false, 48, null);
            }
        }
    }

    @Override // lg2.d, ez2.b
    public void h() {
        android.animation.AnimatorSet animatorSet = this.f318564o;
        if (animatorSet != null) {
            animatorSet.pause();
        }
        p();
    }

    @Override // lg2.a
    public android.graphics.Rect m() {
        android.view.View view = this.f318570q;
        if (view != null) {
            int[] iArr = new int[2];
            qg2.d.f362793a.e(view, iArr);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            ig2.g b17 = b();
            int i17 = iArr[0];
            b17.f291410i = new android.graphics.Rect(i17, iArr[1], viewGroup.getWidth() + i17, iArr[1] + viewGroup.getHeight());
        }
        return b().f291410i;
    }

    @Override // lg2.d, lg2.a
    public android.graphics.Rect n() {
        qg2.d dVar = qg2.d.f362793a;
        int g17 = dVar.g();
        int f17 = dVar.f();
        float h17 = dVar.h(z(), null);
        int i17 = (int) (z().f291406e * h17);
        int i18 = (int) (h17 * z().f291407f);
        int i19 = (g17 - i17) / 2;
        int i27 = (f17 - i18) / 2;
        return new android.graphics.Rect(i19, i27, i17 + i19, i18 + i27);
    }

    @Override // lg2.a
    public void p() {
        this.f318571r = true;
        android.widget.FrameLayout frameLayout = this.f318572s;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(null);
        }
        android.view.ViewGroup viewGroup = this.f318574u;
        if (viewGroup != null) {
            android.view.View findViewWithTag = viewGroup.findViewWithTag("fluent_view_tag");
            if (findViewWithTag != null) {
                findViewWithTag.setOnTouchListener(null);
            }
            java.lang.String str = this.f318557e;
            com.tencent.mars.xlog.Log.i(str, "detachFloatView view:" + findViewWithTag);
            ig2.g b17 = b();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("detachMaskView maskView:");
            android.view.View view = b17.f291375j;
            sb6.append(view);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (!(view instanceof android.widget.ImageView)) {
                android.view.ViewParent parent = view.getParent();
                android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(view);
                }
                android.view.View view2 = b().f291405d;
                android.view.ViewGroup viewGroup3 = view2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) view2 : null;
                if (viewGroup3 != null) {
                    int i17 = this.A;
                    int i18 = (i17 <= 0 || i17 >= viewGroup3.getChildCount()) ? 0 : this.A;
                    com.tencent.mars.xlog.Log.i(str, "detachMaskView recover maskView validIndex: " + i18 + " childCount: " + viewGroup3.getChildCount());
                    viewGroup3.addView(view, i18);
                }
            }
            viewGroup.removeView(findViewWithTag);
        }
        this.f318570q = null;
        this.f318574u = null;
    }

    @Override // lg2.a
    public java.lang.String r() {
        return "SwitchOutImageDirector";
    }

    @Override // lg2.d
    public void v() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(q().width(), q().height());
        layoutParams.gravity = 17;
        android.view.View view = b().f291375j;
        if (view instanceof android.widget.ImageView) {
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = this.f318573t;
            if (roundedCornerFrameLayout != null) {
                android.widget.ImageView imageView = new android.widget.ImageView(this.f318556d);
                android.widget.ImageView imageView2 = (android.widget.ImageView) view;
                imageView.setImageDrawable(imageView2.getDrawable());
                imageView.setScaleType(imageView2.getScaleType());
                roundedCornerFrameLayout.addView(imageView, layoutParams);
                return;
            }
            return;
        }
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount) {
                    i17 = viewGroup.getChildCount() - 1;
                    break;
                } else if (kotlin.jvm.internal.o.b(viewGroup.getChildAt(i17), view)) {
                    break;
                } else {
                    i17++;
                }
            }
            this.A = i17;
            com.tencent.mars.xlog.Log.i(this.f318557e, "addMaskView originIndex: " + this.A);
            viewGroup.removeView(view);
        }
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout2 = this.f318573t;
        if (roundedCornerFrameLayout2 != null) {
            roundedCornerFrameLayout2.addView(view, layoutParams);
        }
    }

    @Override // lg2.d
    public int w() {
        return com.tencent.mm.R.drawable.b7w;
    }
}
