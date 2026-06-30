package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class g4 {

    /* renamed from: a, reason: collision with root package name */
    public final fq.d f200946a;

    /* renamed from: b, reason: collision with root package name */
    public final int f200947b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f200948c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f200949d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.r3 f200950e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f200951f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f200952g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.u f200953h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f200954i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.FrameLayout f200955j;

    public g4(fq.d binding, int i17, android.view.View container, yz5.a currentVertical) {
        kotlin.jvm.internal.o.g(binding, "binding");
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(currentVertical, "currentVertical");
        this.f200946a = binding;
        this.f200947b = i17;
        this.f200948c = container;
        this.f200949d = currentVertical;
        this.f200952g = jz5.h.b(com.tencent.mm.ui.chatting.gallery.s3.f201355d);
        h();
    }

    public final android.view.animation.Animation a(int i17) {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(i17);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setInterpolator(new android.view.animation.AccelerateInterpolator(10.0f));
        return alphaAnimation;
    }

    public final android.content.Context b() {
        return this.f200948c.getContext();
    }

    public final boolean c() {
        return ((java.lang.Boolean) ((jz5.n) this.f200952g).getValue()).booleanValue();
    }

    public final void d(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hideLayer: ");
        com.tencent.mm.ui.chatting.gallery.r3 r3Var = this.f200950e;
        sb6.append(r3Var != null ? java.lang.Integer.valueOf(r3Var.f201320a) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryOPLayer", sb6.toString());
        boolean z18 = false;
        this.f200951f = false;
        fq.d dVar = this.f200946a;
        if (z17) {
            com.tencent.mm.ui.chatting.gallery.view.OperationLayerWrapper operationLayerWrapper = dVar.f265410g;
            operationLayerWrapper.clearAnimation();
            android.view.animation.Animation a17 = a(150);
            a17.setAnimationListener(new com.tencent.mm.ui.chatting.gallery.u3(operationLayerWrapper, this));
            operationLayerWrapper.startAnimation(a17);
            com.tencent.mm.ui.chatting.gallery.r3 r3Var2 = this.f200950e;
            if (r3Var2 != null && r3Var2.f201322c) {
                z18 = true;
            }
            if (z18 || !c()) {
                android.widget.FrameLayout frameLayout = dVar.f265405b;
                frameLayout.clearAnimation();
                frameLayout.startAnimation(a(150));
                return;
            }
            return;
        }
        com.tencent.mm.ui.chatting.gallery.view.OperationLayerWrapper operationLayerWrapper2 = dVar.f265410g;
        operationLayerWrapper2.clearAnimation();
        operationLayerWrapper2.setAlpha(0.0f);
        operationLayerWrapper2.setVisibility(4);
        operationLayerWrapper2.post(new com.tencent.mm.ui.chatting.gallery.v3(this));
        com.tencent.mm.ui.chatting.gallery.r3 r3Var3 = this.f200950e;
        if (r3Var3 != null && r3Var3.f201322c) {
            z18 = true;
        }
        if (z18 || !c()) {
            android.widget.FrameLayout frameLayout2 = dVar.f265405b;
            frameLayout2.clearAnimation();
            frameLayout2.setAlpha(0.0f);
            frameLayout2.setVisibility(4);
        }
    }

    public final void e(java.lang.String str, yz5.l lVar) {
        fq.d dVar = this.f200946a;
        android.widget.LinearLayout linearLayout = dVar.f265415l;
        linearLayout.setElevation(10.0f);
        linearLayout.setVisibility(0);
        linearLayout.setContentDescription(str);
        linearLayout.setOutlineProvider(new com.tencent.mm.ui.chatting.gallery.w3(this));
        dy1.a.i(linearLayout, "img_source_info_btn");
        dy1.a.e(linearLayout, 40, new com.tencent.mm.ui.chatting.gallery.x3(lVar));
        android.widget.Button button = dVar.f265416m;
        button.setGravity(16);
        android.text.TextPaint paint = button.getPaint();
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(0.8f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r0.f201322c == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Void f(boolean r4) {
        /*
            r3 = this;
            com.tencent.mm.ui.chatting.gallery.r3 r0 = r3.f200950e
            r1 = 0
            if (r0 == 0) goto Lb
            r2 = 1
            boolean r0 = r0.f201322c
            if (r0 != r2) goto Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            r0 = 0
            if (r2 == 0) goto L22
            android.widget.FrameLayout r2 = r3.f200955j
            if (r2 == 0) goto L1c
            if (r4 == 0) goto L16
            goto L18
        L16:
            r1 = 8
        L18:
            r2.setVisibility(r1)
            goto L22
        L1c:
            java.lang.String r4 = "errorTipsOnSeekbarContainer"
            kotlin.jvm.internal.o.o(r4)
            throw r0
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.g4.f(boolean):java.lang.Void");
    }

    public final void g() {
        int c17 = com.tencent.mm.ui.bl.c(b());
        int h17 = com.tencent.mm.ui.bl.h(b());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryOPLayer", "setToHorizontal: nav: " + c17 + ", status: " + h17);
        int f17 = i65.a.f(b(), com.tencent.mm.R.dimen.f479738dv);
        int f18 = i65.a.f(b(), com.tencent.mm.R.dimen.f479731dn);
        fq.d dVar = this.f200946a;
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithSeekbarAnimation redesignVideoPlayerSeekBarWithSeekbarAnimation = dVar.f265425v;
        android.view.ViewGroup.LayoutParams layoutParams = redesignVideoPlayerSeekBarWithSeekbarAnimation.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        int max = java.lang.Math.max(c17, h17);
        marginLayoutParams.setMarginStart(max);
        marginLayoutParams.setMarginEnd(max);
        redesignVideoPlayerSeekBarWithSeekbarAnimation.setLayoutParams(marginLayoutParams);
        int i17 = f17 * 2;
        dVar.f265406c.setPadding(f18, i17, f18, i17);
        dVar.f265405b.setPadding(f18, f17, f18, f17);
    }

    public final void h() {
        int e17 = com.tencent.mm.ui.bl.e(b());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryOPLayer", "setToVertical: nav " + e17);
        int f17 = i65.a.f(b(), com.tencent.mm.R.dimen.f479738dv);
        int i17 = f17 * 2;
        fq.d dVar = this.f200946a;
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithSeekbarAnimation redesignVideoPlayerSeekBarWithSeekbarAnimation = dVar.f265425v;
        android.view.ViewGroup.LayoutParams layoutParams = redesignVideoPlayerSeekBarWithSeekbarAnimation.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.setMarginEnd(0);
        redesignVideoPlayerSeekBarWithSeekbarAnimation.setLayoutParams(marginLayoutParams);
        dVar.f265406c.setPadding(0, i17, 0, e17 + i17);
        dVar.f265405b.setPadding(i17, f17, i17, f17);
    }

    public final java.lang.Void i(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryOPLayer", "setTransState: " + z17);
        boolean z18 = false;
        fq.d dVar = this.f200946a;
        if (z17) {
            dVar.f265412i.setEnabled(false);
            dVar.f265426w.setAlpha(0.15f);
            dVar.f265424u.setVisibility(8);
        } else {
            dVar.f265412i.setEnabled(true);
            dVar.f265426w.setAlpha(1.0f);
            dVar.f265424u.setVisibility(0);
            com.tencent.mm.ui.chatting.gallery.r3 r3Var = this.f200950e;
            com.tencent.mm.storage.f9 f9Var = r3Var != null ? r3Var.f201331l : null;
            if (r3Var != null && r3Var.f201322c) {
                z18 = true;
            }
            if (!z18) {
                m11.b0 v17 = com.tencent.mm.ui.chatting.gallery.t2.v(f9Var);
                if (v17 != null) {
                    if (com.tencent.mm.ui.chatting.component.z4.f(f9Var, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.c0.f22550a.d(v17.l()), v17.f322637e, "", ""))) {
                        dVar.f265424u.setVisibility(8);
                    }
                }
            } else if (f9Var != null) {
                if (com.tencent.mm.ui.chatting.gallery.ja.N.b(f9Var, com.tencent.mm.ui.chatting.gallery.j1.s(f9Var))) {
                    dVar.f265424u.setVisibility(8);
                    return null;
                }
            }
        }
        return null;
    }

    public final void j(boolean z17) {
        com.tencent.mm.ui.chatting.gallery.r3 r3Var = this.f200950e;
        boolean z18 = false;
        if (r3Var != null && r3Var.f201329j) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showLayer skip: ");
            com.tencent.mm.ui.chatting.gallery.r3 r3Var2 = this.f200950e;
            sb6.append(r3Var2 != null ? java.lang.Integer.valueOf(r3Var2.f201320a) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryOPLayer", sb6.toString());
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("showLayer: ");
        com.tencent.mm.ui.chatting.gallery.r3 r3Var3 = this.f200950e;
        sb7.append(r3Var3 != null ? java.lang.Integer.valueOf(r3Var3.f201320a) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryOPLayer", sb7.toString());
        fq.d dVar = this.f200946a;
        if (z17) {
            com.tencent.mm.ui.chatting.gallery.view.OperationLayerWrapper operationLayerWrapper = dVar.f265410g;
            operationLayerWrapper.setVisibility(0);
            operationLayerWrapper.clearAnimation();
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150);
            alphaAnimation.setFillAfter(true);
            operationLayerWrapper.startAnimation(alphaAnimation);
            com.tencent.mm.ui.chatting.gallery.r3 r3Var4 = this.f200950e;
            if (r3Var4 != null && r3Var4.f201322c) {
                z18 = true;
            }
            if (z18 || !c()) {
                android.widget.FrameLayout frameLayout = dVar.f265405b;
                frameLayout.clearAnimation();
                android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
                alphaAnimation2.setDuration(150);
                alphaAnimation2.setFillAfter(true);
                frameLayout.startAnimation(alphaAnimation2);
            }
        } else {
            com.tencent.mm.ui.chatting.gallery.view.OperationLayerWrapper operationLayerWrapper2 = dVar.f265410g;
            operationLayerWrapper2.clearAnimation();
            operationLayerWrapper2.setAlpha(1.0f);
            operationLayerWrapper2.setVisibility(0);
            com.tencent.mm.ui.chatting.gallery.r3 r3Var5 = this.f200950e;
            if ((r3Var5 != null && r3Var5.f201322c) || !c()) {
                android.widget.FrameLayout frameLayout2 = dVar.f265405b;
                frameLayout2.clearAnimation();
                frameLayout2.setAlpha(1.0f);
                frameLayout2.setVisibility(0);
            }
        }
        this.f200951f = true;
    }

    public final java.lang.Void k(java.lang.Integer num, boolean z17) {
        com.tencent.mm.ui.chatting.gallery.r3 r3Var = this.f200950e;
        if (r3Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryOPLayer", "upImageDownloadState: config is null");
            return null;
        }
        fq.d dVar = this.f200946a;
        if (num == null) {
            fq.b bVar = dVar.f265419p;
            bVar.f265391b.setVisibility(0);
            bVar.f265392c.setVisibility(8);
            return null;
        }
        if (!r3Var.f201322c) {
            android.widget.TextView textView = dVar.f265419p.f265394e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(num);
            sb6.append('%');
            textView.setText(sb6.toString());
            if (z17) {
                fq.b bVar2 = dVar.f265419p;
                bVar2.f265392c.setVisibility(8);
                android.widget.LinearLayout linearLayout = bVar2.f265393d;
                linearLayout.setVisibility(0);
                android.view.animation.Animation a17 = a(1000);
                a17.setAnimationListener(new com.tencent.mm.ui.chatting.gallery.e4(this));
                linearLayout.startAnimation(a17);
            } else {
                fq.b bVar3 = dVar.f265419p;
                bVar3.f265390a.setVisibility(0);
                bVar3.f265391b.setVisibility(8);
                bVar3.f265392c.setVisibility(0);
                bVar3.f265393d.setVisibility(8);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r0.f201322c == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Void l(java.lang.Integer r7, boolean r8) {
        /*
            r6 = this;
            com.tencent.mm.ui.chatting.gallery.r3 r0 = r6.f200950e
            r1 = 0
            if (r0 == 0) goto Lb
            r2 = 1
            boolean r0 = r0.f201322c
            if (r0 != r2) goto Lb
            goto Lc
        Lb:
            r2 = r1
        Lc:
            r0 = 0
            if (r2 == 0) goto L70
            r2 = 8
            fq.d r3 = r6.f200946a
            if (r7 != 0) goto L22
            fq.c r7 = r3.f265420q
            android.widget.Button r8 = r7.f265400c
            r8.setVisibility(r1)
            android.widget.RelativeLayout r7 = r7.f265403f
            r7.setVisibility(r2)
            return r0
        L22:
            fq.c r4 = r3.f265420q
            android.widget.TextView r4 = r4.f265402e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r7 = 37
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            r4.setText(r7)
            if (r8 == 0) goto L5a
            fq.c r7 = r3.f265420q
            android.widget.RelativeLayout r8 = r7.f265403f
            r8.setVisibility(r2)
            android.widget.LinearLayout r7 = r7.f265401d
            r7.setVisibility(r1)
            r8 = 1000(0x3e8, float:1.401E-42)
            android.view.animation.Animation r8 = r6.a(r8)
            com.tencent.mm.ui.chatting.gallery.f4 r1 = new com.tencent.mm.ui.chatting.gallery.f4
            r1.<init>(r6)
            r8.setAnimationListener(r1)
            r7.startAnimation(r8)
            goto L70
        L5a:
            fq.c r7 = r3.f265420q
            android.widget.FrameLayout r8 = r7.f265398a
            r8.setVisibility(r1)
            android.widget.Button r8 = r7.f265400c
            r8.setVisibility(r2)
            android.widget.RelativeLayout r8 = r7.f265403f
            r8.setVisibility(r1)
            android.widget.LinearLayout r7 = r7.f265401d
            r7.setVisibility(r2)
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.g4.l(java.lang.Integer, boolean):java.lang.Void");
    }
}
