package ku3;

/* loaded from: classes10.dex */
public final class s implements yt3.r2, android.view.View.OnClickListener {
    public android.util.Range A;
    public android.view.View B;
    public android.widget.TextView C;
    public int D;
    public boolean E;
    public boolean F;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f312384d;

    /* renamed from: e, reason: collision with root package name */
    public final zt3.a f312385e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f312386f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f312387g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f312388h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f312389i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f312390m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f312391n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f312392o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f312393p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f312394q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f312395r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f312396s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f312397t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f312398u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f312399v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f312400w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.HashMap f312401x;

    /* renamed from: y, reason: collision with root package name */
    public float f312402y;

    /* renamed from: z, reason: collision with root package name */
    public float f312403z;

    public s(android.view.ViewGroup parent, ju3.d0 status, zt3.a kitContext) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(kitContext, "kitContext");
        this.f312384d = parent;
        this.f312385e = kitContext;
        this.f312386f = jz5.h.b(new ku3.c(this));
        this.f312387g = jz5.h.b(new ku3.d(this));
        this.f312388h = jz5.h.b(new ku3.e(this));
        this.f312389i = jz5.h.b(new ku3.f(this));
        this.f312390m = jz5.h.b(new ku3.q(this));
        this.f312391n = jz5.h.b(new ku3.r(this));
        this.f312392o = jz5.h.b(new ku3.k(this));
        this.f312393p = jz5.h.b(new ku3.l(this));
        this.f312394q = jz5.h.b(new ku3.m(this));
        this.f312395r = jz5.h.b(new ku3.n(this));
        this.f312396s = jz5.h.b(new ku3.o(this));
        this.f312397t = jz5.h.b(new ku3.p(this));
        this.f312398u = jz5.h.b(new ku3.i(this));
        this.f312399v = jz5.h.b(new ku3.j(this));
        this.f312400w = i65.a.i(parent.getContext(), com.tencent.mm.R.drawable.f480925fj);
        this.f312401x = new java.util.HashMap();
    }

    public static final void a(ku3.s sVar, android.view.View view) {
        sVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "showIndicator", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "showIndicator", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.animate().alpha(1.0f).start();
    }

    public final android.view.View b() {
        java.lang.Object value = ((jz5.n) this.f312386f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View c() {
        java.lang.Object value = ((jz5.n) this.f312387g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View d() {
        java.lang.Object value = ((jz5.n) this.f312389i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final java.lang.String e() {
        if (this.f312403z % ((float) 1) == 0.0f) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((int) this.f312403z);
            sb6.append('x');
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(this.f312403z);
        sb7.append('x');
        return sb7.toString();
    }

    public final android.view.View f() {
        java.lang.Object value = ((jz5.n) this.f312398u).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View g() {
        java.lang.Object value = ((jz5.n) this.f312392o).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View h() {
        java.lang.Object value = ((jz5.n) this.f312394q).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View i() {
        java.lang.Object value = ((jz5.n) this.f312396s).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View j() {
        java.lang.Object value = ((jz5.n) this.f312390m).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void k() {
        android.view.View view = this.B;
        if (view != null) {
            view.setBackground(null);
        }
        java.lang.Float f17 = (java.lang.Float) this.f312401x.get(java.lang.Integer.valueOf(this.D));
        if (f17 != null) {
            android.widget.TextView textView = this.C;
            if (textView != null) {
                float floatValue = f17.floatValue();
                textView.setText(floatValue < 1.0f ? java.lang.String.valueOf(floatValue) : java.lang.String.valueOf((int) floatValue));
            }
            android.widget.TextView textView2 = this.C;
            if (textView2 == null) {
                return;
            }
            textView2.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r1.contains((android.util.Range) java.lang.Float.valueOf(r18.f312403z)) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r18 = this;
            r0 = r18
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "showIndicatorFoldCenter >> "
            r1.<init>(r2)
            float r2 = r0.f312403z
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.CameraKitIndicatorPlugin"
            com.tencent.mars.xlog.Log.i(r2, r1)
            android.util.Range r1 = r0.A
            r2 = 0
            if (r1 == 0) goto L2b
            float r3 = r0.f312403z
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            boolean r1 = r1.contains(r3)
            r3 = 1
            if (r1 != r3) goto L2b
            goto L2c
        L2b:
            r3 = r2
        L2c:
            if (r3 == 0) goto Ld3
            jz5.g r1 = r0.f312388h
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.String r3 = "getValue(...)"
            kotlin.jvm.internal.o.f(r1, r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.n(r1)
            android.view.View r1 = r18.c()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
            r3 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r11.add(r3)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r4 = r11.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin"
            java.lang.String r6 = "showIndicatorFoldCenter"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setAlpha"
            java.lang.String r10 = "(F)V"
            r3 = r1
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r3 = r11.get(r2)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r1.setAlpha(r3)
            java.lang.String r4 = "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin"
            java.lang.String r5 = "showIndicatorFoldCenter"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setAlpha"
            java.lang.String r9 = "(F)V"
            r3 = r1
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
            android.view.View r1 = r18.c()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3.add(r4)
            java.util.Collections.reverse(r3)
            java.lang.Object[] r11 = r3.toArray()
            java.lang.String r12 = "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin"
            java.lang.String r13 = "showIndicatorFoldCenter"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r1
            yj0.a.d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r2 = r3.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r11 = "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin"
            java.lang.String r12 = "showIndicatorFoldCenter"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            yj0.a.f(r10, r11, r12, r13, r14, r15, r16)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ku3.s.m():void");
    }

    public final void n(android.widget.TextView textView) {
        if (textView != null) {
            textView.setText(e());
            textView.setTypeface(android.graphics.Typeface.defaultFromStyle(this.f312403z >= 100.0f ? 0 : 1));
        }
    }

    public final void o() {
        int i17;
        java.util.HashMap hashMap = this.f312401x;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (((java.lang.Number) entry.getValue()).floatValue() >= this.f312403z) {
                i17 = ((java.lang.Number) entry.getKey()).intValue();
                break;
            }
        }
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraKitIndicatorPlugin", "no find select type");
            return;
        }
        if (i17 == this.D) {
            n(this.C);
            return;
        }
        android.view.View view = this.B;
        if (view != null) {
            view.setBackground(null);
        }
        java.lang.Float f17 = (java.lang.Float) hashMap.get(java.lang.Integer.valueOf(this.D));
        if (f17 != null) {
            android.widget.TextView textView = this.C;
            if (textView != null) {
                float floatValue = f17.floatValue();
                textView.setText(floatValue < 1.0f ? java.lang.String.valueOf(floatValue) : java.lang.String.valueOf((int) floatValue));
            }
            android.widget.TextView textView2 = this.C;
            if (textView2 != null) {
                textView2.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
            }
        }
        this.D = i17;
        if (i17 == 1) {
            java.lang.Object value = ((jz5.n) this.f312391n).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            this.C = (android.widget.TextView) value;
            this.B = j();
        } else if (i17 == 2) {
            java.lang.Object value2 = ((jz5.n) this.f312393p).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            this.C = (android.widget.TextView) value2;
            this.B = g();
        } else if (i17 == 3) {
            this.B = h();
            java.lang.Object value3 = ((jz5.n) this.f312395r).getValue();
            kotlin.jvm.internal.o.f(value3, "getValue(...)");
            this.C = (android.widget.TextView) value3;
        } else if (i17 == 4) {
            this.B = i();
            java.lang.Object value4 = ((jz5.n) this.f312397t).getValue();
            kotlin.jvm.internal.o.f(value4, "getValue(...)");
            this.C = (android.widget.TextView) value4;
        } else if (i17 == 5) {
            this.B = f();
            java.lang.Object value5 = ((jz5.n) this.f312399v).getValue();
            kotlin.jvm.internal.o.f(value5, "getValue(...)");
            this.C = (android.widget.TextView) value5;
        }
        android.view.View view2 = this.B;
        if (view2 != null) {
            view2.setBackground(this.f312400w);
        }
        n(this.C);
    }

    @Override // yt3.r2
    public void onAttach() {
        if (d().getVisibility() == 0 && this.E) {
            android.view.View d17 = d();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "resetIndicator", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(d17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "resetIndicator", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.F = false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        int id6 = v17.getId();
        if (id6 == com.tencent.mm.R.id.hca) {
            o();
            android.view.View c17 = c();
            c17.animate().alpha(0.0f).withEndAction(new ku3.a(c17)).start();
            android.view.View d17 = d();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(d17, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "showUnFoldIndicatorWithAni", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(d17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "showUnFoldIndicatorWithAni", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(d(), "scaleX", 0.0f, 1.0f);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(d(), "alpha", 0.0f, 1.0f);
            this.f312402y = d().getWidth() / 2.0f;
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitIndicatorPlugin", "showUnFoldIndicatorWithAni >> " + this.f312402y);
            d().setPivotX(this.f312402y);
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
        } else {
            java.util.HashMap hashMap = this.f312401x;
            android.graphics.drawable.Drawable drawable = this.f312400w;
            zt3.a aVar = this.f312385e;
            android.view.ViewGroup viewGroup = this.f312384d;
            if (id6 == com.tencent.mm.R.id.mkb) {
                if (this.D != 1) {
                    java.lang.Float f17 = (java.lang.Float) hashMap.get(1);
                    if (f17 == null || !aVar.f475577e.g(f17.floatValue())) {
                        db5.t7.m(viewGroup.getContext(), i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hmk));
                    } else {
                        j().setBackground(drawable);
                        k();
                        this.D = 1;
                        java.lang.Object value = ((jz5.n) this.f312391n).getValue();
                        kotlin.jvm.internal.o.f(value, "getValue(...)");
                        this.C = (android.widget.TextView) value;
                        this.B = j();
                        this.f312403z = f17.floatValue();
                        n(this.C);
                    }
                }
            } else if (id6 == com.tencent.mm.R.id.mjm) {
                if (this.D != 2) {
                    java.lang.Float f18 = (java.lang.Float) hashMap.get(2);
                    if (f18 == null || !aVar.f475577e.g(f18.floatValue())) {
                        db5.t7.m(viewGroup.getContext(), i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hmk));
                    } else {
                        g().setBackground(drawable);
                        k();
                        this.D = 2;
                        java.lang.Object value2 = ((jz5.n) this.f312393p).getValue();
                        kotlin.jvm.internal.o.f(value2, "getValue(...)");
                        this.C = (android.widget.TextView) value2;
                        this.B = g();
                        this.f312403z = f18.floatValue();
                        n(this.C);
                    }
                }
            } else if (id6 == com.tencent.mm.R.id.f486826mk5) {
                if (this.D != 3) {
                    java.lang.Float f19 = (java.lang.Float) hashMap.get(3);
                    if (f19 == null || !aVar.f475577e.g(f19.floatValue())) {
                        db5.t7.m(viewGroup.getContext(), i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hmk));
                    } else {
                        h().setBackground(drawable);
                        k();
                        this.D = 3;
                        java.lang.Object value3 = ((jz5.n) this.f312395r).getValue();
                        kotlin.jvm.internal.o.f(value3, "getValue(...)");
                        this.C = (android.widget.TextView) value3;
                        this.B = h();
                        this.f312403z = f19.floatValue();
                        n(this.C);
                    }
                }
            } else if (id6 == com.tencent.mm.R.id.mk8) {
                if (this.D != 4) {
                    java.lang.Float f27 = (java.lang.Float) hashMap.get(4);
                    if (f27 == null || !aVar.f475577e.g(f27.floatValue())) {
                        db5.t7.m(viewGroup.getContext(), i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hmk));
                    } else {
                        i().setBackground(drawable);
                        k();
                        this.D = 4;
                        java.lang.Object value4 = ((jz5.n) this.f312397t).getValue();
                        kotlin.jvm.internal.o.f(value4, "getValue(...)");
                        this.C = (android.widget.TextView) value4;
                        this.B = i();
                        this.f312403z = f27.floatValue();
                        n(this.C);
                    }
                }
            } else if (id6 == com.tencent.mm.R.id.f486814mj3 && this.D != 5) {
                java.lang.Float f28 = (java.lang.Float) hashMap.get(5);
                if (f28 == null || !aVar.f475577e.g(f28.floatValue())) {
                    db5.t7.m(viewGroup.getContext(), i65.a.r(viewGroup.getContext(), com.tencent.mm.R.string.hmk));
                } else {
                    f().setBackground(drawable);
                    k();
                    this.D = 5;
                    java.lang.Object value5 = ((jz5.n) this.f312399v).getValue();
                    kotlin.jvm.internal.o.f(value5, "getValue(...)");
                    this.C = (android.widget.TextView) value5;
                    this.B = f();
                    this.f312403z = f28.floatValue();
                    n(this.C);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void onDetach() {
        this.F = true;
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (this.E) {
            android.view.View b17 = b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i17 == 0) {
                android.view.View b18 = b();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(b18, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                b18.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(b18, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.View d17 = d();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(d17, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                d17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(d17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m();
            }
        }
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        c().setOnClickListener(this);
        this.f312385e.Q6(10, new ku3.g(this));
        d().setOnClickListener(ku3.h.f312241d);
    }
}
