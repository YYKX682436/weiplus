package nl5;

/* loaded from: classes15.dex */
public class s0 {
    public final boolean A;
    public final boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public final java.util.Map H;
    public final int[] I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f338347J;
    public final nl5.u0 K;
    public android.view.Menu L;
    public boolean M;
    public boolean N;
    public int O;
    public final jz5.g P;
    public final android.view.ActionMode.Callback Q;
    public int R;
    public final java.lang.Runnable S;
    public boolean T;
    public final long U;
    public final boolean V;
    public nl5.l W;
    public final java.lang.Runnable X;
    public final int Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public final nl5.y f338348a;

    /* renamed from: a0, reason: collision with root package name */
    public float f338349a0;

    /* renamed from: b, reason: collision with root package name */
    public nl5.c f338350b;

    /* renamed from: b0, reason: collision with root package name */
    public float f338351b0;

    /* renamed from: c, reason: collision with root package name */
    public nl5.c f338352c;

    /* renamed from: d, reason: collision with root package name */
    public nl5.j f338353d;

    /* renamed from: e, reason: collision with root package name */
    public nl5.s f338354e;

    /* renamed from: f, reason: collision with root package name */
    public final nl5.b0 f338355f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f338356g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f338357h;

    /* renamed from: i, reason: collision with root package name */
    public android.text.Spannable f338358i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnPreDrawListener f338359j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnScrollChangedListener f338360k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View.OnAttachStateChangeListener f338361l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View.OnLayoutChangeListener f338362m;

    /* renamed from: n, reason: collision with root package name */
    public android.text.TextWatcher f338363n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View.OnLongClickListener f338364o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View.OnTouchListener f338365p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f338366q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View.OnClickListener f338367r;

    /* renamed from: s, reason: collision with root package name */
    public nl5.a0 f338368s;

    /* renamed from: t, reason: collision with root package name */
    public final int f338369t;

    /* renamed from: u, reason: collision with root package name */
    public final int f338370u;

    /* renamed from: v, reason: collision with root package name */
    public final int f338371v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f338372w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f338373x;

    /* renamed from: y, reason: collision with root package name */
    public final int f338374y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f338375z;

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(13:3|(2:5|(1:11)(1:9))|12|13|14|15|(2:(4:21|(4:23|24|(3:26|(13:28|29|(1:31)|32|(1:34)|35|(1:37)|38|(1:40)(1:53)|41|42|43|(2:45|46)(2:48|(2:50|51)(1:52)))(1:54)|47)|55)(1:57)|56|19)|58)|60|(3:62|(1:66)|67)|68|(1:70)(1:74)|71|72)|76|13|14|15|(3:17|(1:19)|58)|60|(0)|68|(0)(0)|71|72) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a3, code lost:
    
        if ((!android.text.TextUtils.isEmpty(r2) && r2.equalsIgnoreCase("blackshark")) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca A[Catch: all -> 0x0135, TryCatch #0 {all -> 0x0135, blocks: (B:15:0x00b1, B:17:0x00be, B:19:0x00c4, B:21:0x00ca, B:24:0x00d6, B:26:0x00dd, B:28:0x00e3, B:32:0x00ee, B:35:0x00f7, B:38:0x0100, B:41:0x010a, B:43:0x0111, B:45:0x0117, B:48:0x0126, B:50:0x012e), top: B:14:0x00b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s0(nl5.y r17) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nl5.s0.<init>(nl5.y):void");
    }

    public void a() {
        nl5.h hVar = (nl5.h) ((jz5.n) this.P).getValue();
        if (hVar.f338274c ? hVar.f338282k : false) {
            return;
        }
        l();
        boolean z17 = this.f338373x;
        android.widget.TextView textView = this.f338357h;
        if (!z17) {
            android.text.Selection.setSelection(textView.getEditableText(), textView.getSelectionEnd());
        }
        k();
        textView.setCursorVisible(this.N);
    }

    public final void b() {
        android.text.TextWatcher textWatcher = this.f338363n;
        android.widget.TextView textView = this.f338357h;
        textView.removeTextChangedListener(textWatcher);
        textView.removeOnAttachStateChangeListener(this.f338361l);
        textView.removeOnLayoutChangeListener(this.f338362m);
        textView.getViewTreeObserver().removeOnScrollChangedListener(this.f338360k);
        textView.getViewTreeObserver().removeOnPreDrawListener(this.f338359j);
        nl5.h hVar = (nl5.h) ((jz5.n) this.P).getValue();
        hVar.f338277f = 0L;
        hVar.f338280i = false;
        hVar.f338281j = false;
        hVar.f338284m = true;
        hVar.f338272a.removeCallbacks(hVar.f338289r);
        hVar.a();
        l();
        k();
        this.f338350b = null;
        this.f338352c = null;
        this.f338354e = null;
    }

    public void c(nl5.c cVar) {
        if (cVar != null) {
            cVar.f338251f.dismiss();
        }
    }

    public final void d() {
        android.widget.PopupWindow popupWindow;
        nl5.j jVar = this.f338353d;
        if (jVar == null || (popupWindow = jVar.f338295e) == null) {
            return;
        }
        popupWindow.dismiss();
        android.widget.TextView textView = jVar.f338294d.f338357h;
        kotlin.jvm.internal.o.g(textView, "textView");
        try {
            java.lang.reflect.Field declaredField = android.widget.TextView.class.getDeclaredField("mEditor");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(textView);
            if (obj == null) {
                return;
            }
            java.lang.Class<?> cls = java.lang.Class.forName("android.widget.Editor");
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("resumeBlink", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(obj, new java.lang.Object[0]);
                return;
            }
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mBlink");
            declaredField2.setAccessible(true);
            java.lang.Object obj2 = declaredField2.get(obj);
            java.lang.Runnable runnable = obj2 instanceof java.lang.Runnable ? (java.lang.Runnable) obj2 : null;
            if (runnable != null) {
                textView.removeCallbacks(runnable);
                textView.postDelayed(runnable, 500L);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.ui.yk.b("SelectableEditTextHelper", "resumeBlink err:%s", th6.getMessage());
        }
    }

    public void e(nl5.s sVar) {
        if (sVar != null) {
            sVar.f338340b.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int f() {
        nl5.s sVar = this.f338354e;
        ?? isShowing = sVar == null ? 0 : sVar.f338340b.isShowing();
        int i17 = nl5.c.f338248v;
        nl5.c cVar = this.f338350b;
        if (cVar == null ? false : cVar.f338251f.isShowing()) {
            isShowing = (isShowing == true ? 1 : 0) | 2;
        }
        nl5.c cVar2 = this.f338352c;
        if (cVar2 == null ? false : cVar2.f338251f.isShowing()) {
            isShowing = (isShowing == true ? 1 : 0) | 4;
        }
        int i18 = nl5.j.A;
        nl5.j jVar = this.f338353d;
        return jVar != null ? jVar.getMWindow().isShowing() : false ? isShowing | 8 : isShowing;
    }

    public final nl5.s g() {
        nl5.s sVar = this.f338354e;
        if (sVar != null) {
            return sVar;
        }
        nl5.s sVar2 = new nl5.s(this, this.f338356g);
        this.f338354e = sVar2;
        return sVar2;
    }

    public java.lang.Runnable h() {
        return this.S;
    }

    public final void i(boolean z17) {
        android.content.Context context = this.f338356g;
        if (context.getResources().getConfiguration().orientation != 1) {
            a();
            return;
        }
        if (this.T) {
            return;
        }
        if (!z17) {
            a();
            return;
        }
        if (this.f338353d == null) {
            this.f338353d = new nl5.j(this, context);
        }
        nl5.c cVar = this.f338350b;
        if (cVar != null) {
            cVar.f338251f.dismiss();
        }
        nl5.c cVar2 = this.f338352c;
        if (cVar2 != null) {
            cVar2.f338251f.dismiss();
        }
        android.widget.TextView textView = this.f338357h;
        int selectionStart = textView.getSelectionStart();
        if (!this.f338373x) {
            a();
        } else if (this.R != selectionStart) {
            a();
        } else {
            q(this.E, this.F, false);
            this.R = selectionStart;
        }
        textView.setCursorVisible(true);
        this.R = selectionStart;
        o(this.f338353d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003b, code lost:
    
        if ((r3 != null && r3.f338257o) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r4 = this;
            boolean r0 = r4.A
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r4.f()
            boolean r1 = r4.f338372w
            if (r1 != 0) goto L58
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            if (r3 == 0) goto L58
            nl5.j r3 = r4.f338353d
            if (r3 == 0) goto L20
            boolean r3 = r3.f338305r
            if (r3 != r2) goto L20
            r3 = r2
            goto L21
        L20:
            r3 = r1
        L21:
            if (r3 != 0) goto L3d
            nl5.c r3 = r4.f338350b
            if (r3 == 0) goto L2d
            boolean r3 = r3.f338257o
            if (r3 != r2) goto L2d
            r3 = r2
            goto L2e
        L2d:
            r3 = r1
        L2e:
            if (r3 != 0) goto L3d
            nl5.c r3 = r4.f338352c
            if (r3 == 0) goto L3a
            boolean r3 = r3.f338257o
            if (r3 != r2) goto L3a
            r3 = r2
            goto L3b
        L3a:
            r3 = r1
        L3b:
            if (r3 == 0) goto L3e
        L3d:
            r1 = r2
        L3e:
            if (r1 != 0) goto L58
            r4.O = r0
            r4.f338372w = r2
            nl5.s r0 = r4.g()
            r4.e(r0)
            nl5.c r0 = r4.f338350b
            r4.c(r0)
            nl5.c r0 = r4.f338352c
            r4.c(r0)
            r4.d()
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nl5.s0.j():void");
    }

    public void k() {
        this.f338373x = true;
        c(this.f338350b);
        c(this.f338352c);
        e(this.f338354e);
        d();
    }

    public void l() {
        this.f338355f.f338247c = null;
    }

    public void m(int i17, int i18) {
        int i19;
        android.widget.TextView textView = this.f338357h;
        nl5.b0 b0Var = this.f338355f;
        if (i17 != -1) {
            b0Var.f338245a = i17;
        }
        if (i18 != -1) {
            b0Var.f338246b = i18;
        }
        int i27 = b0Var.f338245a;
        int i28 = b0Var.f338246b;
        if (i27 > i28) {
            b0Var.f338245a = i28;
            b0Var.f338246b = i27;
        }
        android.text.Spannable spannable = this.f338358i;
        if (spannable != null) {
            try {
                int length = textView.getText().length();
                int i29 = b0Var.f338245a;
                if (i29 <= length && (i19 = b0Var.f338246b) <= length) {
                    b0Var.f338247c = spannable.subSequence(i29, i19).toString();
                    textView.setHighlightColor(this.f338369t);
                    android.text.Selection.setSelection(spannable, b0Var.f338245a, b0Var.f338246b);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.ui.yk.d("SelectableEditTextHelper", th6, "select err", new java.lang.Object[0]);
            }
        }
    }

    public void n(nl5.c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            android.text.Layout layout = this.f338357h.getLayout();
            boolean z17 = cVar.f338250e;
            nl5.b0 b0Var = this.f338355f;
            int i17 = z17 ? b0Var.f338245a : b0Var.f338246b;
            cVar.b((int) layout.getPrimaryHorizontal(i17), layout.getLineBottom(layout.getLineForOffset(i17)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.ui.yk.b("SelectableEditTextHelper", "show cursor err：%s", android.util.Log.getStackTraceString(th6));
        }
    }

    public final void o(nl5.j jVar) {
        android.widget.TextView textView = this.f338357h;
        try {
            int selectionStart = textView.getSelectionStart();
            android.text.Layout layout = textView.getLayout();
            int primaryHorizontal = (int) layout.getPrimaryHorizontal(selectionStart);
            int lineBottom = layout.getLineBottom(layout.getLineForOffset(selectionStart));
            if (jVar != null) {
                android.widget.TextView textView2 = jVar.f338294d.f338357h;
                int[] iArr = jVar.f338308u;
                textView2.getLocationInWindow(iArr);
                int extraX = primaryHorizontal + 0 + jVar.getExtraX();
                int extraY = lineBottom + jVar.getExtraY();
                int i17 = iArr[1];
                if (extraY >= i17 && extraY <= ((i17 + textView2.getHeight()) - textView2.getPaddingBottom()) + com.tencent.mm.ui.zk.a(jVar.getContext(), 5)) {
                    jVar.a(extraX, extraY);
                }
            }
            java.lang.Runnable runnable = this.X;
            textView.removeCallbacks(runnable);
            textView.postDelayed(runnable, this.U);
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.ui.yk.d("SelectableEditTextHelper", th6, "showInsertionHandle err", new java.lang.Object[0]);
        }
    }

    public void p(nl5.s sVar) {
        if (sVar != null) {
            try {
                sVar.a();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.ui.yk.b("SelectableEditTextHelper", "show oper err：%s", android.util.Log.getStackTraceString(th6));
            }
        }
    }

    public void q(int i17, int i18, boolean z17) {
        int i19;
        android.widget.TextView textView = this.f338357h;
        if (textView.getLayout() == null || textView.getWidth() == 0) {
            return;
        }
        if (this.f338350b == null) {
            this.f338350b = new nl5.c(this, true);
        }
        if (this.f338352c == null) {
            this.f338352c = new nl5.c(this, false);
        }
        int offsetForPosition = textView.getOffsetForPosition(i17, i18);
        if (!z17) {
            offsetForPosition = textView.getSelectionStart();
        }
        try {
            i19 = textView.getLayout().getOffsetToRightOf(offsetForPosition);
        } catch (java.lang.Throwable unused) {
            i19 = offsetForPosition + 1;
        }
        if (textView.getText() instanceof android.text.Spannable) {
            java.lang.CharSequence text = textView.getText();
            kotlin.jvm.internal.o.e(text, "null cannot be cast to non-null type android.text.Spannable");
            this.f338358i = (android.text.Spannable) text;
        }
        if (this.f338358i == null) {
            return;
        }
        boolean z18 = offsetForPosition < textView.getText().length() && z17;
        if (z18) {
            textView.setCursorVisible(false);
        } else {
            i19 = offsetForPosition;
        }
        if (!this.f338373x) {
            nl5.b0 b0Var = this.f338355f;
            if (b0Var.f338245a == offsetForPosition && b0Var.f338246b == i19) {
                return;
            }
        }
        k();
        l();
        this.f338373x = false;
        m(offsetForPosition, i19);
        if (z18) {
            n(this.f338350b);
            n(this.f338352c);
            d();
        }
        p(g());
    }

    public final void r(int i17) {
        if ((i17 & 1) > 0) {
            p(g());
        }
        if ((i17 & 2) > 0) {
            n(this.f338350b);
        }
        if ((i17 & 4) > 0) {
            n(this.f338352c);
        }
        if ((i17 & 8) > 0) {
            o(this.f338353d);
        }
    }
}
