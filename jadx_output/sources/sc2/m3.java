package sc2;

/* loaded from: classes2.dex */
public final class m3 extends ad2.h implements android.view.ViewTreeObserver.OnPreDrawListener {
    public static final sc2.e3 A = new sc2.e3(null);
    public static final int[] B = {-1, -1, -1};
    public static final java.util.HashMap C = new java.util.HashMap();
    public static final java.util.List D = kz5.c0.i(java.lang.Integer.valueOf(com.tencent.mm.R.id.ef_), java.lang.Integer.valueOf(com.tencent.mm.R.id.ef8), java.lang.Integer.valueOf(com.tencent.mm.R.id.f484487ee5));

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f406071w = "Finder.FeedJumperBubbleObserver";

    /* renamed from: x, reason: collision with root package name */
    public boolean f406072x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Runnable f406073y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f406074z;

    public static final void G(sc2.m3 m3Var, in5.s0 s0Var, android.view.View view, java.lang.String str) {
        m3Var.getClass();
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(s0Var.f293121e);
        int i17 = a17.f197135a;
        float f17 = (i17 * 2532.0f) / 1170.0f;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) f17;
        view.setLayoutParams(layoutParams);
        com.tencent.mars.xlog.Log.i(m3Var.f406071w, "[updateRedPacketCoverHeight] translationY, top:" + view.getTop() + " height:" + f17 + " screenWidth:" + i17 + " screenHeight:" + a17.f197136b + " source:" + str);
    }

    @Override // ad2.h
    public void A(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        r45.iw4 iw4Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.A(holder, jumpView, infoEx);
        r45.wf6 wf6Var = this.f3149m;
        java.lang.String string = (wf6Var == null || (iw4Var = (r45.iw4) wf6Var.getCustom(3)) == null) ? null : iw4Var.getString(9);
        if (string == null || string.length() == 0) {
            return;
        }
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        K(jumpView, I(context));
    }

    @Override // ad2.h
    public void C(in5.s0 holder) {
        r45.iw4 iw4Var;
        android.view.ViewTreeObserver viewTreeObserver;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.C(holder);
        android.view.View view = this.f3143d;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        r45.wf6 wf6Var = this.f3149m;
        boolean z17 = false;
        if (wf6Var != null && (iw4Var = (r45.iw4) wf6Var.getCustom(3)) != null && iw4Var.getInteger(11) == 1) {
            z17 = true;
        }
        if (z17) {
            H();
        }
    }

    public final void H() {
        java.lang.Runnable runnable = this.f406073y;
        if (runnable != null) {
            android.widget.TextView textView = this.f406074z;
            if (textView != null) {
                textView.removeCallbacks(runnable);
            }
            this.f406073y = null;
        }
        this.f406074z = null;
    }

    public final int I(android.content.Context context) {
        return (int) ((com.tencent.mm.ui.bh.a(context).f197135a * 0.6d) - context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479725dh));
    }

    public final void J(java.lang.String str, yz5.l lVar) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(java.lang.Integer.valueOf(android.graphics.Color.parseColor(str)));
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }

    public final void K(android.view.View view, int i17) {
        java.lang.String str;
        r45.iw4 iw4Var;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484513tf4);
        if (textView != null) {
            r45.wf6 wf6Var = this.f3149m;
            if (wf6Var == null || (iw4Var = (r45.iw4) wf6Var.getCustom(3)) == null || (str = iw4Var.getString(9)) == null) {
                str = "";
            }
            textView.setText(str);
        }
        if (textView != null && textView.getVisibility() == 8) {
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.edj);
            if (textView2 != null) {
                kotlin.jvm.internal.o.d(textView);
                L(textView, textView2, i17);
            }
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
        }
    }

    public final void L(android.widget.TextView textView, android.widget.TextView textView2, int i17) {
        int i18;
        int measureText = (int) textView.getPaint().measureText(textView.getText().toString());
        int measureText2 = (int) textView2.getPaint().measureText(textView2.getText().toString());
        if (measureText < i17) {
            textView.setWidth(measureText);
            i18 = java.lang.Math.min(measureText2, i17 - measureText);
        } else {
            i18 = i17 / 2;
            textView.setWidth(i18);
        }
        java.lang.CharSequence ellipsize = android.text.TextUtils.ellipsize(textView2.getText(), textView2.getPaint(), i18, android.text.TextUtils.TruncateAt.END);
        kotlin.jvm.internal.o.f(ellipsize, "ellipsize(...)");
        textView2.setWidth((int) textView2.getPaint().measureText(ellipsize.toString()));
        com.tencent.mars.xlog.Log.i(this.f406071w, "updateTitleWidth, maxWidth: " + i17 + ", subtitleWidth: " + textView.getWidth() + ", titleWidth: " + textView2.getWidth());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(in5.s0 r27, android.view.View r28, boolean r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.m3.M(in5.s0, android.view.View, boolean, java.lang.String):void");
    }

    public final int N(android.view.View view) {
        boolean z17 = false;
        int height = (view != null ? view.getHeight() : 0) + 0;
        int b17 = view != null ? com.tencent.mm.ui.kk.b(view) : 0;
        if (view != null && view.getVisibility() == 0) {
            z17 = true;
        }
        return z17 ? height + b17 : height;
    }

    @Override // ad2.h, ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        r45.iw4 iw4Var;
        r45.iw4 iw4Var2;
        r45.iw4 iw4Var3;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.c(holder, jumpView, infoEx, z17, aVar);
        r45.wf6 wf6Var = this.f3149m;
        boolean z18 = false;
        if (wf6Var != null && (iw4Var3 = (r45.iw4) wf6Var.getCustom(3)) != null && iw4Var3.getInteger(11) == 1) {
            z18 = true;
        }
        if (z18) {
            H();
            android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.f484513tf4);
            if (textView == null || textView.getVisibility() == 0) {
                return;
            }
            this.f406074z = textView;
            sc2.h3 h3Var = new sc2.h3(this, jumpView, holder);
            this.f406073y = h3Var;
            r45.wf6 wf6Var2 = this.f3149m;
            textView.postDelayed(h3Var, ((wf6Var2 == null || (iw4Var2 = (r45.iw4) wf6Var2.getCustom(3)) == null) ? 0L : iw4Var2.getLong(10)) * 1000);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("postDelayed, ");
            r45.wf6 wf6Var3 = this.f3149m;
            sb6.append((wf6Var3 == null || (iw4Var = (r45.iw4) wf6Var3.getCustom(3)) == null) ? null : java.lang.Long.valueOf(iw4Var.getLong(10)));
            com.tencent.mars.xlog.Log.i(this.f406071w, sb6.toString());
        }
    }

    @Override // ad2.h, ad2.k
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        r45.iw4 iw4Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.d(holder, jumpView, infoEx, z17, aVar);
        r45.wf6 wf6Var = this.f3149m;
        boolean z18 = false;
        if (wf6Var != null && (iw4Var = (r45.iw4) wf6Var.getCustom(3)) != null && iw4Var.getInteger(11) == 1) {
            z18 = true;
        }
        if (z18) {
            H();
        }
    }

    @Override // ad2.h
    public gs2.a j(com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        int business_type = info.getBusiness_type();
        if (business_type != 2) {
            return business_type != 101 ? super.j(info) : gs2.a.E;
        }
        xc2.p0 p0Var = this.f3147h;
        return p0Var != null && p0Var.f453256r == 2 ? gs2.a.f275053i : gs2.a.f275054m;
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f406071w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        r45.iw4 iw4Var;
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        if (super.m(infoEx)) {
            return true;
        }
        r45.wf6 wf6Var = this.f3149m;
        java.lang.String string = (wf6Var == null || (iw4Var = (r45.iw4) wf6Var.getCustom(3)) == null) ? null : iw4Var.getString(1);
        return !(string == null || string.length() == 0);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        if (!this.f406072x) {
            return true;
        }
        android.view.View view = this.f3143d;
        in5.s0 s0Var = this.f3148i;
        xc2.p0 p0Var = this.f3147h;
        if (view != null && s0Var != null && p0Var != null) {
            view.post(new sc2.g3(s0Var, this, view));
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f406072x = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0413  */
    @Override // ad2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed r28, in5.s0 r29, android.view.View r30, xc2.p0 r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.m3.q(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, java.lang.String):void");
    }

    @Override // ad2.h
    public void s(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        android.view.View view = this.f3143d;
        in5.s0 s0Var = this.f3148i;
        xc2.p0 p0Var = this.f3147h;
        if (view == null || s0Var == null || p0Var == null || this.f3150n != 75) {
            return;
        }
        view.post(new sc2.f3(s0Var, this, view));
    }

    @Override // ad2.h
    public void z(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, int i17) {
        android.widget.TextView textView;
        r45.iw4 iw4Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        r45.iw4 iw4Var2;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.z(holder, jumpView, infoEx, i17);
        r45.wf6 wf6Var = this.f3149m;
        boolean z17 = false;
        if (wf6Var != null && (iw4Var2 = (r45.iw4) wf6Var.getCustom(3)) != null && iw4Var2.getInteger(11) == 2) {
            z17 = true;
        }
        if (!z17 || (textView = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.f484513tf4)) == null || textView.getVisibility() == 0) {
            return;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        long j17 = 0;
        long b17 = ((baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? 0L : bu2.z.b(feedObject2)) / 1000;
        r45.wf6 wf6Var2 = this.f3149m;
        if (wf6Var2 != null && (iw4Var = (r45.iw4) wf6Var2.getCustom(3)) != null) {
            j17 = iw4Var.getLong(10);
        }
        if (b17 <= i17 + j17) {
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            K(jumpView, I(context));
        }
    }
}
