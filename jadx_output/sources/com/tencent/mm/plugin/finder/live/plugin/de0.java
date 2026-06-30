package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class de0 extends com.tencent.mm.plugin.finder.live.plugin.l {
    public final jz5.g A;
    public final jz5.g B;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f112275p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f112276q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f112277r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f112278s;

    /* renamed from: t, reason: collision with root package name */
    public final int f112279t;

    /* renamed from: u, reason: collision with root package name */
    public final int f112280u;

    /* renamed from: v, reason: collision with root package name */
    public final int f112281v;

    /* renamed from: w, reason: collision with root package name */
    public final int f112282w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f112283x;

    /* renamed from: y, reason: collision with root package name */
    public final long f112284y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f112285z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112275p = "FinderLiveTopCommentPlugin";
        this.f112276q = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.ae0(root));
        this.f112277r = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.od0(root));
        this.f112278s = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.pd0(root));
        this.f112279t = 1;
        this.f112280u = 2;
        this.f112281v = 3;
        this.f112282w = 4;
        long b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderLiveTopCommentDisplayTimeSec", 10) * 1000;
        this.f112284y = b17;
        if (!x0()) {
            int dimensionPixelSize = root.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479732dp);
            root.setPadding(dimensionPixelSize, root.getPaddingTop(), dimensionPixelSize, root.getPaddingBottom());
        }
        com.tencent.mars.xlog.Log.i("FinderLiveTopCommentPlugin", "STAY_DURATION:" + b17);
        ((com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout) root.findViewById(com.tencent.mm.R.id.fnp)).setInterceptTouch(true);
        v1().getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        v1().getPaint().setStrokeWidth(1.0f);
        this.f112285z = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.ud0(this));
        this.A = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.wd0(root, this));
        this.B = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.ce0(root, this));
    }

    public static final android.widget.TextView t1(com.tencent.mm.plugin.finder.live.plugin.de0 de0Var) {
        return (android.widget.TextView) ((jz5.n) de0Var.f112276q).getValue();
    }

    public static final java.lang.String u1(com.tencent.mm.plugin.finder.live.plugin.de0 de0Var, java.lang.String str, android.text.style.ImageSpan imageSpan, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("createTopCommentMsg:");
        if (str.length() > 0) {
            sb6.append(str);
            sb7.append("anchorTag:" + str + ',');
        }
        if (imageSpan != null) {
            sb6.append(" ");
            sb7.append("globalBadgeSpan:true,");
        }
        sb6.append(str2 == null ? "" : str2);
        sb7.append("content:" + str2 + '!');
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.lang.String str3 = de0Var.f112275p;
        java.lang.String sb8 = sb7.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        r4Var.M2(str3, sb8);
        java.lang.String sb9 = sb6.toString();
        kotlin.jvm.internal.o.f(sb9, "toString(...)");
        return sb9;
    }

    public static final java.lang.String y1(boolean z17, boolean z18, boolean z19, boolean z27) {
        if (z17) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491469d60);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        if (z18) {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dtf);
            kotlin.jvm.internal.o.d(string2);
            return string2;
        }
        if (z19) {
            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ouc);
            kotlin.jvm.internal.o.d(string3);
            return string3;
        }
        if (z27) {
            java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.npz);
            kotlin.jvm.internal.o.d(string4);
            return string4;
        }
        java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d5o);
        kotlin.jvm.internal.o.d(string5);
        return string5;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        w1().removeMessages(this.f112279t);
        w1().removeMessages(this.f112280u);
        w1().removeMessages(this.f112281v);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void c1(boolean z17) {
        if (z17) {
            this.f365323d.setVisibility(8);
        } else {
            K0(this.f113327i);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final android.widget.TextView v1() {
        return (android.widget.TextView) this.f112277r.getValue();
    }

    public final com.tencent.mm.sdk.platformtools.n3 w1() {
        return (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f112285z).getValue();
    }

    public final void x1(android.view.View view) {
        int[] iArr = new int[2];
        qg2.d.f362793a.e(view, iArr);
        int dimensionPixelOffset = iArr[1] + (x0() ? view.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479725dh) : view.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479714d7));
        android.view.ViewGroup viewGroup = this.f365323d;
        if (viewGroup.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, dimensionPixelOffset, layoutParams2.rightMargin, layoutParams2.bottomMargin);
            if (x0()) {
                layoutParams2.width = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
            }
            viewGroup.setLayoutParams(layoutParams2);
        }
    }

    public final void z1(java.util.List msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        android.os.Message obtainMessage = w1().obtainMessage();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(msgList);
        obtainMessage.obj = arrayList;
        obtainMessage.what = this.f112282w;
        w1().sendMessage(obtainMessage);
    }
}
