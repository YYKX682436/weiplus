package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes10.dex */
public final class a6 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f116899d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f116900e;

    /* renamed from: f, reason: collision with root package name */
    public final int f116901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f116899d = "FinderLivePostSecurityUIC";
        this.f116901f = com.tencent.thumbplayer.core.common.TPGeneralError.NOT_INIT;
    }

    public final boolean O6(r45.m01 resp, yz5.l afterShowErrPageListener) {
        kotlin.jvm.internal.o.g(resp, "resp");
        kotlin.jvm.internal.o.g(afterShowErrPageListener, "afterShowErrPageListener");
        java.lang.String str = "[checkSecurityResp] type = " + resp.getInteger(0);
        java.lang.String str2 = this.f116899d;
        com.tencent.mars.xlog.Log.i(str2, str);
        int integer = resp.getInteger(0);
        if (integer == 0) {
            return true;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (integer == 1) {
            com.tencent.mm.protobuf.g byteString = resp.getByteString(1);
            if (byteString != null) {
                try {
                    r45.p01 p01Var = new r45.p01();
                    p01Var.parseFrom(byteString.g());
                    Q6(p01Var, afterShowErrPageListener);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.i(str2, "parseFrom Exception = " + e17.getMessage());
                }
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                return false;
            }
            com.tencent.mars.xlog.Log.i(str2, "page_wording_buff is empty");
            return false;
        }
        if (integer == 2 || integer == 3 || integer == 4) {
            com.tencent.mm.protobuf.g byteString2 = resp.getByteString(1);
            if (byteString2 != null) {
                try {
                    r45.n01 n01Var = new r45.n01();
                    n01Var.parseFrom(byteString2.g());
                    this.f116900e = afterShowErrPageListener;
                    ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Ij(getActivity(), null, this.f116901f, n01Var, java.lang.Integer.valueOf(resp.getInteger(0)));
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.i(str2, "parseFrom Exception = " + e18.getMessage());
                }
            } else {
                f0Var = null;
            }
            if (f0Var != null) {
                return false;
            }
            com.tencent.mars.xlog.Log.i(str2, "page_wording_buff is empty");
            return false;
        }
        if (integer != 5) {
            com.tencent.mars.xlog.Log.i(str2, "unknown type");
            return true;
        }
        com.tencent.mm.protobuf.g byteString3 = resp.getByteString(1);
        if (byteString3 != null) {
            try {
                r45.o01 o01Var = new r45.o01();
                o01Var.parseFrom(byteString3.g());
                P6(o01Var, afterShowErrPageListener);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.i(str2, "parseFrom Exception = " + e19.getMessage());
            }
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(str2, "page_wording_buff is empty");
        return false;
    }

    public final void P6(r45.o01 o01Var, yz5.l lVar) {
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(getContext());
        y1Var.i(true);
        y1Var.m(java.lang.Boolean.TRUE);
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.axa, null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
        android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.icv);
        android.widget.TextView textView2 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.icw);
        android.widget.TextView textView3 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.icu);
        android.widget.TextView textView4 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.ict);
        java.lang.String string = o01Var.getString(1);
        textView.setText(string != null ? r26.i0.t(string, "\\n", "\n", false) : null);
        textView4.setText(o01Var.getString(3));
        textView3.setText(o01Var.getString(2));
        textView2.setText(o01Var.getString(0));
        com.tencent.mm.ui.fk.a(textView2);
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        textView4.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.t5(y1Var));
        textView3.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.u5(c0Var, y1Var));
        y1Var.f212037s = new com.tencent.mm.plugin.finder.live.viewmodel.v5(lVar, c0Var);
        y1Var.k(roundedCornerFrameLayout);
        y1Var.s();
    }

    public final void Q6(r45.p01 p01Var, yz5.l lVar) {
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(getContext());
        y1Var.i(true);
        y1Var.m(java.lang.Boolean.TRUE);
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.axc, null);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
        android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.icv);
        android.widget.TextView textView2 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.icu);
        android.widget.TextView textView3 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.ict);
        android.view.View findViewById = roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.ics);
        textView.setText(p01Var.getString(0));
        textView3.setText(p01Var.getString(2));
        textView2.setText(p01Var.getString(1));
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        long c17 = c01.id.c();
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.w5(y1Var));
        textView2.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.x5(this, y1Var));
        textView3.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.y5(this, c0Var, y1Var));
        y1Var.f212037s = new com.tencent.mm.plugin.finder.live.viewmodel.z5(this, c17, lVar, c0Var);
        y1Var.k(roundedCornerFrameLayout);
        y1Var.s();
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Nk("168", R6(java.lang.Boolean.FALSE, 0L));
        i95.m c18 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.I8((zy2.zb) c18, ml2.u1.U1, S6("168"), null, "168", null, null, false, 116, null);
        i95.m c19 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        zy2.zb.I8((zy2.zb) c19, ml2.u1.V1, S6("168"), null, "168", null, null, false, 116, null);
    }

    public final java.lang.String R6(java.lang.Boolean bool, java.lang.Long l17) {
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        int i17 = eVar != null ? ((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) eVar.a(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117047h : 0;
        gk2.e eVar2 = dk2.ef.I;
        long j17 = eVar2 != null ? ((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) eVar2.a(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117048i : 0L;
        try {
            cl0.g gVar = new cl0.g();
            gVar.h("finder_username", xy2.c.e(getContext()));
            gVar.o("entrance_type", i17);
            gVar.p("entrance_id", j17);
            if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
                gVar.h("staytime", l17);
            }
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.d(gVar2);
            return gVar2;
        } catch (java.lang.Exception unused) {
            return "{}";
        }
    }

    public final java.util.HashMap S6(java.lang.String str) {
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        int i17 = eVar != null ? ((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) eVar.a(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117047h : 0;
        gk2.e eVar2 = dk2.ef.I;
        long j17 = eVar2 != null ? ((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) eVar2.a(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117048i : 0L;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", str);
        hashMap.put("fidner_username", xy2.c.e(getContext()));
        hashMap.put("entrance_type", java.lang.String.valueOf(i17));
        hashMap.put("entrance_id", java.lang.String.valueOf(j17));
        return hashMap;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(this.f116899d, "requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == this.f116901f) {
            if (i18 == -1) {
                yz5.l lVar = this.f116900e;
                if (lVar != null) {
                    lVar.invoke(java.lang.Boolean.TRUE);
                    return;
                }
                return;
            }
            yz5.l lVar2 = this.f116900e;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.FALSE);
            }
        }
    }
}
