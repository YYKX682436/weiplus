package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class i5 extends xt2.m6 implements jf2.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f118636d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f118637e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f118638f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f118639g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f118640h;

    public i5(android.view.ViewGroup root, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f118636d = root;
        this.f118637e = "Finder.FinderLiveAnchorFlipCameraWidget";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.tzr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f118638f = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.tzt);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f118639g = imageView;
        this.f118640h = true;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.h5(this));
        android.graphics.drawable.Drawable drawable = root.getContext().getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_perspective);
        com.tencent.mm.ui.uk.f(drawable, root.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        imageView.setImageDrawable(drawable);
    }

    @Override // jf2.h
    public void b() {
        android.view.ViewGroup viewGroup = this.f118636d;
        if (viewGroup.getVisibility() != 0 || this.f118640h) {
            this.f118640h = false;
        }
        viewGroup.setVisibility(0);
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_perspective), java.lang.Integer.valueOf(com.tencent.mm.R.string.mir));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f118638f.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f118636d.findViewById(com.tencent.mm.R.id.tzr);
    }

    @Override // jf2.h
    public void g() {
        this.f118636d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f118636d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if ((r2 != null && r2.f7()) == false) goto L31;
     */
    @Override // jf2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i() {
        /*
            r6 = this;
            dk2.ef r0 = dk2.ef.f233372a
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            androidx.lifecycle.c1 r2 = r0.i(r1)
            mm2.c1 r2 = (mm2.c1) r2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L14
            boolean r2 = r2.X2
            if (r2 != r3) goto L14
            r2 = r3
            goto L15
        L14:
            r2 = r4
        L15:
            r5 = 0
            if (r2 == 0) goto L4d
            androidx.lifecycle.c1 r2 = r0.i(r1)
            mm2.c1 r2 = (mm2.c1) r2
            if (r2 == 0) goto L23
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r2.W2
            goto L24
        L23:
            r2 = r5
        L24:
            if (r2 == 0) goto L4d
            androidx.lifecycle.c1 r2 = r0.i(r1)
            mm2.c1 r2 = (mm2.c1) r2
            if (r2 == 0) goto L34
            boolean r2 = r2.f328778a5
            if (r2 != r3) goto L34
            r2 = r3
            goto L35
        L34:
            r2 = r4
        L35:
            if (r2 == 0) goto L4d
            java.lang.Class<mm2.e1> r2 = mm2.e1.class
            androidx.lifecycle.c1 r2 = r0.i(r2)
            mm2.e1 r2 = (mm2.e1) r2
            if (r2 == 0) goto L49
            boolean r2 = r2.f7()
            if (r2 != r3) goto L49
            r2 = r3
            goto L4a
        L49:
            r2 = r4
        L4a:
            if (r2 != 0) goto L4d
            goto L4e
        L4d:
            r3 = r4
        L4e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "canshow3d: "
            r2.<init>(r4)
            androidx.lifecycle.c1 r4 = r0.i(r1)
            mm2.c1 r4 = (mm2.c1) r4
            if (r4 == 0) goto L64
            boolean r4 = r4.X2
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L65
        L64:
            r4 = r5
        L65:
            r2.append(r4)
            java.lang.String r4 = ", info: "
            r2.append(r4)
            androidx.lifecycle.c1 r0 = r0.i(r1)
            mm2.c1 r0 = (mm2.c1) r0
            if (r0 == 0) goto L77
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r5 = r0.W2
        L77:
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = r6.f118637e
            com.tencent.mars.xlog.Log.i(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.i5.i():boolean");
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        return this.f118639g;
    }

    @Override // jf2.h
    public int type() {
        return 25;
    }
}
