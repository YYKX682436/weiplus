package rn2;

/* loaded from: classes15.dex */
public final class t2 implements rn2.g {
    public android.widget.EditText A;
    public android.view.View A1;
    public android.widget.RelativeLayout B;
    public android.animation.ObjectAnimator B1;
    public android.widget.EditText C;
    public android.animation.ObjectAnimator C1;
    public android.view.View D;
    public android.view.View E;
    public android.widget.EditText F;
    public android.widget.TextView G;
    public android.view.View H;
    public android.widget.CheckBox I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f397851J;
    public com.tencent.mm.ui.widget.dialog.z2 K;
    public com.tencent.mm.ui.widget.dialog.z2 L;
    public com.tencent.mm.ui.widget.dialog.z2 M;
    public com.tencent.mm.plugin.finder.live.widget.se N;
    public android.view.View P;
    public android.view.ViewGroup Q;
    public android.widget.ImageView R;
    public android.widget.TextView S;
    public android.widget.TextView T;
    public android.view.View U;
    public android.view.View V;
    public rn2.w W;
    public android.view.View X;
    public android.view.View Y;
    public android.view.View Z;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f397852d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f397853e;

    /* renamed from: f, reason: collision with root package name */
    public final rn2.f f397854f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f397855g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f397856h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f397857i;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f397858l1;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f397859m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f397860n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.EditText f397861o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f397862p;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.TextView f397863p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.TextView f397864p1;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f397865q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f397866r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f397867s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f397868t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f397869u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f397870v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.EditText f397871w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f397872x;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f397873x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.View f397874x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f397875y;

    /* renamed from: y0, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f397876y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.widget.TextView f397877y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.RelativeLayout f397878z;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.TextView f397879z1;

    public t2(android.view.View rootView, com.tencent.mm.ui.MMActivity activity, rn2.f fVar) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f397852d = rootView;
        this.f397853e = activity;
        this.f397854f = fVar;
        this.f397857i = jz5.h.b(new rn2.c2(this));
        this.f397859m = jz5.h.b(new rn2.d2(this));
        this.f397860n = jz5.h.b(new rn2.e2(this));
    }

    public static final void a(rn2.t2 t2Var) {
        r45.k74 k74Var;
        t2Var.getClass();
        gk2.e eVar = gk2.e.f272471n;
        if (eVar == null || (k74Var = ((on2.z2) eVar.a(on2.z2.class)).f347099t) == null) {
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        com.tencent.mm.ui.MMActivity mMActivity = t2Var.f397853e;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        finderJumpInfo.setLite_app_info(k74Var);
        zy2.ta.g(e1Var, mMActivity, finderJumpInfo, new rn2.g2(t2Var), null, false, 24, null);
    }

    public static final void g(rn2.t2 t2Var, android.widget.EditText editText) {
        android.content.Context context;
        t2Var.getClass();
        if (editText != null) {
            editText.requestFocus();
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
    }

    public void destroy() {
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.K;
        if (z2Var != null) {
            z2Var.B();
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var2 = this.L;
        if (z2Var2 != null) {
            z2Var2.B();
        }
        zl2.r4.f473950a.r1(this.f397853e);
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f397853e;
    }

    public final void j(java.lang.String str) {
        android.view.View view = this.f397867s;
        if ((view != null && view.getVisibility() == 0) && kotlin.jvm.internal.o.b(str, this.f397853e.getContext().getResources().getString(com.tencent.mm.R.string.dpk))) {
            android.view.View view2 = this.f397870v;
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkClaimMethodContentVisible", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkClaimMethodContentVisible", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f397870v;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkClaimMethodContentVisible", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkClaimMethodContentVisible", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void l(rn2.b bVar, int i17) {
        if (bVar != null) {
            rn2.f fVar = this.f397854f;
            if (fVar != null) {
                ((rn2.c1) fVar).y(bVar);
            }
            android.widget.TextView textView = this.f397869u;
            if (textView != null) {
                textView.setText(bVar.f397644a);
            }
            j(bVar.f397644a);
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.L;
        if (z2Var != null) {
            z2Var.B();
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryCreateViewCallback", "chooserPrizeType " + bVar + ", pos:" + i17);
    }

    public final android.widget.TextView o() {
        return (android.widget.TextView) ((jz5.n) this.f397860n).getValue();
    }

    public final void q(rn2.b bVar) {
        android.widget.TextView textView = this.f397875y;
        if (textView != null) {
            textView.setText(bVar.f397644a);
        }
        if (kotlin.jvm.internal.o.b(bVar.f397644a, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.dp_))) {
            android.view.View view = this.f397856h;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkCommentContentGroupVisibility", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateConfig$LotteryClaimPrizeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkCommentContentGroupVisibility", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateConfig$LotteryClaimPrizeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view2 = this.f397856h;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkCommentContentGroupVisibility", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateConfig$LotteryClaimPrizeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkCommentContentGroupVisibility", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateConfig$LotteryClaimPrizeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        w();
    }

    public void s(int i17, int i18, java.lang.String str, r45.go1 go1Var) {
        r45.qp1 qp1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showErrMsg errorPage is empty:");
        sb6.append((go1Var != null ? (r45.qp1) go1Var.getCustom(2) : null) == null);
        sb6.append(",type:");
        sb6.append((go1Var == null || (qp1Var = (r45.qp1) go1Var.getCustom(2)) == null) ? null : java.lang.Integer.valueOf(qp1Var.getInteger(0)));
        sb6.append(",errMsg:");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryCreateViewCallback", sb6.toString());
        r45.qp1 qp1Var2 = go1Var != null ? (r45.qp1) go1Var.getCustom(2) : null;
        android.view.View view = this.f397852d;
        if (qp1Var2 == null) {
            if (str == null) {
                str = view.getResources().getString(com.tencent.mm.R.string.dbb);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
            db5.t7.m(this.f397853e, str);
            return;
        }
        r45.qp1 qp1Var3 = (r45.qp1) go1Var.getCustom(2);
        if (qp1Var3 != null) {
            java.lang.String string = view.getResources().getString(com.tencent.mm.R.string.dbb);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            pm0.v.X(new on2.k3(qp1Var3, string, new rn2.k2(this, i18)));
        }
    }

    public final void t() {
        android.view.View view = this.f397852d;
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486417l54)).setText(view.getContext().getString(com.tencent.mm.R.string.drn));
        android.view.View view2 = this.D;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchCustomPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchCustomPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup = this.Q;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        android.view.View view3 = this.X;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchCustomPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchCustomPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.bx9);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchCustomPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchCustomPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f397868t;
        if (view4 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchCustomPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchCustomPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view5 = this.f397868t;
        if (view5 != null) {
            view5.setEnabled(true);
        }
        android.view.View view6 = this.V;
        if (view6 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchCustomPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchCustomPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view7 = this.f397851J;
        if (view7 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchCustomPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchCustomPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view8 = this.f397874x1;
        if (view8 != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchCustomPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchCustomPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.EditText editText = this.C;
        if (editText != null) {
            editText.setText("");
        }
        rn2.f fVar = this.f397854f;
        if (fVar != null) {
            rn2.c1 c1Var = (rn2.c1) fVar;
            c1Var.f397683z = c1Var.f397682y.f397699a;
        }
        l((rn2.b) kz5.n0.X(rn2.e.f397698u), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r4 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(boolean r8, int r9) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.t2.u(boolean, int):void");
    }

    public void v(boolean z17, java.lang.String text) {
        android.animation.ObjectAnimator objectAnimator;
        android.animation.ObjectAnimator objectAnimator2;
        kotlin.jvm.internal.o.g(text, "text");
        android.widget.TextView textView = this.f397855g;
        if (textView != null) {
            textView.setText(text);
        }
        if (z17) {
            android.widget.TextView textView2 = this.f397855g;
            if (textView2 == null || textView2.getVisibility() == 0) {
                return;
            }
            textView2.setVisibility(0);
            if (this.B1 == null) {
                this.B1 = android.animation.ObjectAnimator.ofFloat(textView2, "translationY", -textView2.getLayoutParams().height, 0.0f);
            }
            android.animation.ObjectAnimator objectAnimator3 = this.B1;
            if ((objectAnimator3 != null && objectAnimator3.isRunning()) || (objectAnimator2 = this.B1) == null) {
                return;
            }
            objectAnimator2.start();
            return;
        }
        android.widget.TextView textView3 = this.f397855g;
        if (textView3 == null || textView3.getVisibility() == 8) {
            return;
        }
        if (this.C1 == null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(textView3, "translationY", 0.0f, -textView3.getLayoutParams().height);
            this.C1 = ofFloat;
            if (ofFloat != null) {
                ofFloat.addListener(new rn2.s2(this));
            }
        }
        android.animation.ObjectAnimator objectAnimator4 = this.C1;
        if ((objectAnimator4 != null && objectAnimator4.isRunning()) || (objectAnimator = this.C1) == null) {
            return;
        }
        objectAnimator.start();
    }

    public final void w() {
        rn2.b a17;
        android.view.View view = (android.view.View) ((jz5.n) this.f397857i).getValue();
        boolean z17 = true;
        if (view != null) {
            rn2.f fVar = this.f397854f;
            int i17 = fVar != null && (a17 = ((rn2.c1) fVar).f397682y.a()) != null && a17.f397646c == 6 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "updateNoticeGroup", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "updateNoticeGroup", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = (android.view.View) ((jz5.n) this.f397857i).getValue();
        if (view2 != null && view2.getVisibility() == 8) {
            return;
        }
        rn2.f fVar2 = this.f397854f;
        r45.h32 h32Var = fVar2 != null ? ((rn2.c1) fVar2).f397674q : null;
        if (h32Var == null) {
            android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f397859m).getValue();
            if (textView != null) {
                textView.setText(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f493721os1));
            }
            android.widget.TextView o17 = o();
            if (o17 != null) {
                o17.setText((java.lang.CharSequence) null);
            }
            android.widget.TextView o18 = o();
            if (o18 == null) {
                return;
            }
            o18.setVisibility(8);
            return;
        }
        java.lang.String r17 = zl2.q4.r(zl2.q4.f473933a, h32Var.getInteger(0) * 1000, null, false, false, 14, null);
        java.lang.String string = h32Var.getString(3);
        if (string != null && string.length() > 0) {
            android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) this.f397859m).getValue();
            if (textView2 != null) {
                textView2.setText(h32Var.getString(3));
            }
            android.widget.TextView o19 = o();
            if (o19 != null) {
                o19.setText(r17);
            }
        } else {
            android.widget.TextView textView3 = (android.widget.TextView) ((jz5.n) this.f397859m).getValue();
            if (textView3 != null) {
                textView3.setText(r17);
            }
            android.widget.TextView o27 = o();
            if (o27 != null) {
                java.util.LinkedList list = h32Var.getList(21);
                o27.setText(list != null ? (java.lang.String) kz5.n0.Z(list) : null);
            }
        }
        android.widget.TextView o28 = o();
        if (o28 == null) {
            return;
        }
        android.widget.TextView o29 = o();
        java.lang.CharSequence text = o29 != null ? o29.getText() : null;
        if (text != null && text.length() != 0) {
            z17 = false;
        }
        o28.setVisibility(z17 ? 8 : 0);
    }
}
