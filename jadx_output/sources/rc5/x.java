package rc5;

/* loaded from: classes11.dex */
public class x extends com.tencent.mm.ui.chatting.db {
    public static final jz5.g D = jz5.h.b(rc5.d.f394151d);
    public java.lang.ref.WeakReference A;
    public int B;
    public boolean C;

    /* renamed from: z, reason: collision with root package name */
    public final float f394196z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f394196z = 0.9f;
    }

    public static void q7(rc5.x xVar, android.view.Window window, java.lang.Integer num, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: adjustWindow");
        }
        if ((i17 & 2) != 0) {
            num = null;
        }
        xVar.getClass();
        if (window != null) {
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -1;
            attributes.gravity = 80;
            attributes.dimAmount = 0.5f;
            window.setAttributes(attributes);
            window.addFlags(2);
            window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            if (window.getStatusBarColor() != 0) {
                xVar.B = window.getStatusBarColor();
                window.setStatusBarColor(0);
            }
            window.getDecorView().setBackgroundColor(0);
            window.getDecorView().setPadding(0, 0, 0, 0);
            xVar.getActivity().setFinishOnTouchOutside(xVar instanceof com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC);
            rc5.m mVar = new rc5.m(xVar, num != null ? num.intValue() : xVar.u7(), xVar.s7(), 0.3f, new rc5.o(xVar), new rc5.p(xVar), new rc5.q(xVar));
            android.view.Window window2 = mVar.f394170f.getActivity().getWindow();
            android.view.View decorView = window2.getDecorView();
            kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView;
            android.view.View childAt = viewGroup.getChildAt(0);
            kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
            mVar.f394179r = childAt;
            viewGroup.removeView(childAt);
            android.view.View view = mVar.f394179r;
            if (view == null) {
                kotlin.jvm.internal.o.o("mUIRootView");
                throw null;
            }
            mVar.addView(view);
            viewGroup.addView(mVar);
            android.view.ViewGroup.LayoutParams layoutParams = mVar.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = mVar.f394173i;
            if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
                ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = 80;
            }
            mVar.setLayoutParams(layoutParams);
            mVar.setBackgroundColor(0);
            mVar.setPadding(0, 0, 0, 0);
            mVar.f394180s = window2.findViewById(com.tencent.mm.R.id.f482435ei);
            mVar.a();
            xVar.A = new java.lang.ref.WeakReference(mVar);
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) xVar.W6().f198152f.f460708c.a(sb5.z0.class))).E0();
        }
    }

    private final int u7() {
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b17.x;
        int i18 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            return i18;
        }
        if (i18 >= i17) {
            i17 = i18;
        }
        return i17;
    }

    public final void A7() {
        java.lang.ref.WeakReference weakReference;
        rc5.m mVar;
        if (y7() || (weakReference = this.A) == null || (mVar = (rc5.m) weakReference.get()) == null) {
            return;
        }
        int u76 = u7();
        mVar.f394171g = u76;
        mVar.f394172h = u76 - i65.a.h(mVar.getContext(), com.tencent.mm.R.dimen.f479727dj);
        int i17 = (int) (mVar.f394171g * mVar.f394168d);
        mVar.f394173i = i17;
        mVar.f394174m = (int) (i17 * mVar.f394169e);
    }

    @Override // com.tencent.mm.ui.chatting.db
    public boolean T6() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.db
    public void V6(android.view.View view) {
        if (view == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExpandableHalfScreenChattingUIC", "[!] view is null.");
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExpandableHalfScreenChattingUIC", "[!] view " + view + " has no parent so far, skip fixing.");
            return;
        }
        if (viewGroup instanceof rc5.m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExpandableHalfScreenChattingUIC", "[+] view " + view + " was already fixed for fullscreen issue.");
            return;
        }
        boolean z17 = false;
        java.util.Iterator it = new e06.k(0, viewGroup.getChildCount()).iterator();
        while (it.hasNext()) {
            android.view.View childAt = viewGroup.getChildAt(((kz5.x0) it).b());
            if (childAt instanceof rc5.m) {
                viewGroup.removeView(view);
                ((rc5.m) childAt).addView(view);
                com.tencent.mars.xlog.Log.i("MicroMsg.ExpandableHalfScreenChattingUIC", "[+] view " + view + " was fixed by adding it to " + childAt);
                z17 = true;
            }
        }
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ExpandableHalfScreenChattingUIC", "[!] view " + view + " was not fixed since InteractAuxLayout was not found.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r0 == null) goto L14;
     */
    @Override // com.tencent.mm.ui.chatting.db
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int X6() {
        /*
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.A
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.get()
            rc5.m r0 = (rc5.m) r0
            if (r0 == 0) goto L23
            int r0 = r0.getHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            if (r1 <= 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 == 0) goto L20
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 != 0) goto L31
        L23:
            int r0 = r2.u7()
            float r0 = (float) r0
            float r1 = r2.s7()
            float r0 = r0 * r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L31:
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rc5.x.X6():int");
    }

    @Override // com.tencent.mm.ui.chatting.db
    public float Y6() {
        return 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[Catch: Exception -> 0x0062, TryCatch #0 {Exception -> 0x0062, blocks: (B:3:0x0005, B:5:0x000b, B:7:0x0015, B:9:0x001b, B:11:0x0021, B:13:0x003e, B:14:0x004a, B:21:0x0026, B:23:0x0030, B:25:0x0036), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @Override // com.tencent.mm.ui.chatting.db
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d7() {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.ExpandableHalfScreenChattingUIC"
            java.lang.String r1 = "getCurrentWindowHeight tmpWindowHeight:"
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L62
            r4 = 30
            if (r3 < r4) goto L26
            androidx.appcompat.app.AppCompatActivity r3 = r6.getActivity()     // Catch: java.lang.Exception -> L62
            android.view.WindowManager r3 = r3.getWindowManager()     // Catch: java.lang.Exception -> L62
            if (r3 == 0) goto L3b
            android.view.WindowMetrics r3 = r3.getCurrentWindowMetrics()     // Catch: java.lang.Exception -> L62
            if (r3 == 0) goto L3b
            android.graphics.Rect r3 = r3.getBounds()     // Catch: java.lang.Exception -> L62
            if (r3 == 0) goto L3b
            int r3 = r3.height()     // Catch: java.lang.Exception -> L62
            goto L3c
        L26:
            androidx.appcompat.app.AppCompatActivity r3 = r6.getActivity()     // Catch: java.lang.Exception -> L62
            android.view.WindowManager r3 = r3.getWindowManager()     // Catch: java.lang.Exception -> L62
            if (r3 == 0) goto L3b
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch: java.lang.Exception -> L62
            if (r3 == 0) goto L3b
            int r3 = r3.getHeight()     // Catch: java.lang.Exception -> L62
            goto L3c
        L3b:
            r3 = r2
        L3c:
            if (r3 > 0) goto L49
            android.app.Activity r4 = r6.getContext()     // Catch: java.lang.Exception -> L62
            android.graphics.Point r4 = com.tencent.mm.ui.bl.b(r4)     // Catch: java.lang.Exception -> L62
            int r4 = r4.y     // Catch: java.lang.Exception -> L62
            goto L4a
        L49:
            r4 = r3
        L4a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L62
            r5.<init>(r1)     // Catch: java.lang.Exception -> L62
            r5.append(r3)     // Catch: java.lang.Exception -> L62
            java.lang.String r1 = "  finalWindowHeight:"
            r5.append(r1)     // Catch: java.lang.Exception -> L62
            r5.append(r4)     // Catch: java.lang.Exception -> L62
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L62
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L62
            goto L74
        L62:
            r1 = move-exception
            java.lang.String r3 = "getCurrentWindowHeight"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r1, r3, r2)
            android.app.Activity r1 = r6.getContext()
            android.graphics.Point r1 = com.tencent.mm.ui.bl.b(r1)
            int r4 = r1.y
        L74:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getCurrentWindowHeight height:"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            ku5.u0 r0 = ku5.t0.f312615d
            rc5.r r1 = new rc5.r
            r1.<init>(r6, r4)
            ku5.t0 r0 = (ku5.t0) r0
            r0.D(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc5.x.d7():void");
    }

    @Override // com.tencent.mm.ui.chatting.db
    public boolean f7(com.tencent.mm.ui.chatting.component.pe headerComponent, android.view.View.OnClickListener listener) {
        kotlin.jvm.internal.o.g(headerComponent, "headerComponent");
        kotlin.jvm.internal.o.g(listener, "listener");
        rc5.b bVar = new rc5.b(this, listener);
        boolean y76 = y7();
        int i17 = com.tencent.mm.R.drawable.bu9;
        if (y76) {
            com.tencent.mm.ui.chatting.component.y2 y2Var = (com.tencent.mm.ui.chatting.component.y2) ((sb5.p) W6().f198152f.f460708c.a(sb5.p.class));
            y2Var.m0();
            if (!y2Var.f200268e.booleanValue()) {
                i17 = 0;
            } else if (!y2Var.f200273m) {
                i17 = com.tencent.mm.R.drawable.f481878ah0;
            }
            if (i17 < 0) {
                i17 = 0;
            }
        } else if (com.tencent.mm.ui.bk.C()) {
            i17 = com.tencent.mm.R.drawable.buc;
        }
        headerComponent.f199692p.a(i17);
        headerComponent.f199692p.c(bVar);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.db
    public boolean g7(com.tencent.mm.ui.chatting.component.pe headerComponent, yb5.d chattingContext) {
        kotlin.jvm.internal.o.g(headerComponent, "headerComponent");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.db
    public boolean h7(com.tencent.mm.ui.chatting.component.pe headerComponent, com.tencent.mm.ui.bc optionListener, yb5.d chattingContext) {
        kotlin.jvm.internal.o.g(headerComponent, "headerComponent");
        kotlin.jvm.internal.o.g(optionListener, "optionListener");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        if (y7()) {
            headerComponent.K0(t7(), 0, 0, null);
            return false;
        }
        w7(headerComponent, optionListener, chattingContext);
        headerComponent.K0(t7(), 0, com.tencent.mm.R.raw.chatting_halfscreen_expand, v7());
        chattingContext.f460717l.showOptionMenu(t7(), true);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.db
    public boolean i7() {
        return this instanceof com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.db, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        if (x7()) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            ((com.tencent.mm.ui.MMFragmentActivity) activity).addDispatchedTouchListener(new rc5.s(this));
            ((ku5.t0) ku5.t0.f312615d).D(new rc5.u(this));
        }
    }

    @Override // com.tencent.mm.ui.chatting.db, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        if (!x7()) {
            getIntent().putExtra("KIsHalfScreen", false);
            return;
        }
        getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477855dd);
        getIntent().putExtra("finish_direct", true);
        getIntent().putExtra("KIsHalfScreen", true);
    }

    @Override // com.tencent.mm.ui.chatting.db, com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        if (getIntent().getBooleanExtra("KIsHalfScreen", false)) {
            getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477857df, y7() ? com.tencent.mm.R.anim.f477889ed : com.tencent.mm.R.anim.f477855dd);
            getIntent().putExtra(com.tencent.mm.ui.MMFragmentActivity.EXTRA_USE_SYSTEM_DEFAULT_ENTER_EXIT_ANIM, true);
        }
        if (W6().getIntent().getBooleanExtra("deeplink_handled", false)) {
            return;
        }
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        android.os.Bundle extras = getActivity().getIntent().getExtras();
        ((vh0.f3) n1Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        android.os.IBinder binder = extras != null ? extras.getBinder("chatting_ui_callback_binder") : null;
        if (binder != null) {
            try {
                int i17 = vh0.x0.f436996d;
                android.os.IInterface queryLocalInterface = binder.queryLocalInterface("com.tencent.mm.feature.yuanbao.IPCChattingUICallback");
                ((queryLocalInterface == null || !(queryLocalInterface instanceof vh0.y0)) ? new vh0.w0(binder) : (vh0.y0) queryLocalInterface).onCancel();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatBotRoutineService", th6, "[-] Fail to notify onCancel.", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.db, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (!(W6().f198152f.l() != null) || y7()) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).D(new rc5.v(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
    }

    public void r7() {
        rc5.m mVar;
        java.lang.ref.WeakReference weakReference = this.A;
        if (weakReference == null || (mVar = (rc5.m) weakReference.get()) == null || mVar.f394182u) {
            return;
        }
        android.animation.Animator animator = mVar.A;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ValueAnimator ofArgb = android.animation.ValueAnimator.ofArgb(0, mVar.f394170f.B);
        ofArgb.setInterpolator(mVar.f394184w);
        ofArgb.addUpdateListener(new rc5.w(mVar.f394186y));
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(mVar.getLayoutParams().height, mVar.f394171g);
        ofInt.setInterpolator(mVar.f394185x);
        ofInt.addUpdateListener(new rc5.w(mVar.f394187z));
        animatorSet.playTogether(ofArgb, ofInt);
        animatorSet.addListener(new rc5.f(mVar));
        android.animation.AnimatorSet duration = animatorSet.setDuration(200L);
        kotlin.jvm.internal.o.f(duration, "setDuration(...)");
        duration.start();
        mVar.A = duration;
    }

    public float s7() {
        return this.f394196z;
    }

    public int t7() {
        return 0;
    }

    public com.tencent.mm.ui.bc v7() {
        return new rc5.c(this);
    }

    public void w7(com.tencent.mm.ui.chatting.component.pe headerComponent, com.tencent.mm.ui.bc optionListener, yb5.d chattingContext) {
        kotlin.jvm.internal.o.g(headerComponent, "headerComponent");
        kotlin.jvm.internal.o.g(optionListener, "optionListener");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
    }

    public boolean x7() {
        return true;
    }

    public final boolean y7() {
        rc5.m mVar;
        java.lang.ref.WeakReference weakReference = this.A;
        return (weakReference == null || (mVar = (rc5.m) weakReference.get()) == null) ? !getIntent().getBooleanExtra("KIsHalfScreen", false) : mVar.f394182u;
    }

    public boolean z7(com.tencent.mm.ui.chatting.component.pe headerComponent, yb5.d chattingContext) {
        kotlin.jvm.internal.o.g(headerComponent, "headerComponent");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        super.g7(headerComponent, chattingContext);
        return true;
    }
}
