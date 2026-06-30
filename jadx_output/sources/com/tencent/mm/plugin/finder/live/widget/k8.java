package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class k8 extends com.tencent.mm.plugin.finder.live.widget.t1 implements android.view.View.OnClickListener {
    public final qf2.z3 N;
    public fg2.h P;
    public boolean Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(android.content.Context context, qf2.z3 controller) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.N = controller;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.dqv;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View E(zl2.u4 uiMode) {
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        return android.view.LayoutInflater.from(this.f118183e).inflate(com.tencent.mm.R.layout.dqv, (android.view.ViewGroup) z(), false);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        int i17 = com.tencent.mm.R.id.f483020uh;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(rootView, com.tencent.mm.R.id.f483020uh);
        if (frameLayout != null) {
            i17 = com.tencent.mm.R.id.che;
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) x4.b.a(rootView, com.tencent.mm.R.id.che);
            if (roundCornerRelativeLayout != null) {
                i17 = com.tencent.mm.R.id.rix;
                com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) x4.b.a(rootView, com.tencent.mm.R.id.rix);
                if (weButton != null) {
                    i17 = com.tencent.mm.R.id.qrl;
                    com.tencent.mm.ui.widget.RoundCornerLinearLayout roundCornerLinearLayout = (com.tencent.mm.ui.widget.RoundCornerLinearLayout) x4.b.a(rootView, com.tencent.mm.R.id.qrl);
                    if (roundCornerLinearLayout != null) {
                        i17 = com.tencent.mm.R.id.in7;
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(rootView, com.tencent.mm.R.id.in7);
                        if (weImageView != null) {
                            i17 = com.tencent.mm.R.id.rvy;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.rvy);
                            if (textView != null) {
                                i17 = com.tencent.mm.R.id.mvb;
                                com.tencent.mm.ui.widget.button.WeButton weButton2 = (com.tencent.mm.ui.widget.button.WeButton) x4.b.a(rootView, com.tencent.mm.R.id.mvb);
                                if (weButton2 != null) {
                                    i17 = com.tencent.mm.R.id.o3b;
                                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.tencent.mm.R.id.o3b);
                                    if (textView2 != null) {
                                        this.P = new fg2.h((android.widget.RelativeLayout) rootView, frameLayout, roundCornerRelativeLayout, weButton, roundCornerLinearLayout, weImageView, textView, weButton2, textView2);
                                        weButton2.setOnClickListener(this);
                                        fg2.h hVar = this.P;
                                        if (hVar == null) {
                                            kotlin.jvm.internal.o.o("uiBinding");
                                            throw null;
                                        }
                                        hVar.f262059b.setOnClickListener(this);
                                        fg2.h hVar2 = this.P;
                                        if (hVar2 == null) {
                                            kotlin.jvm.internal.o.o("uiBinding");
                                            throw null;
                                        }
                                        android.widget.TextView text = hVar2.f262061d;
                                        kotlin.jvm.internal.o.f(text, "text");
                                        com.tencent.mm.ui.fk.a(text);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.t1, com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
        if (this.Q) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.f328345b2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("result", k0() ? 1 : 0);
            jSONObject.put("type", 2);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.t1, com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        super.V(e0Var, z17, i17);
        this.Q = true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.t1
    public void l0(boolean z17) {
        com.tencent.mars.xlog.Log.i(i0(), "mmPermissionCallback hadPermission: " + z17);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.f328344a2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", z17 ? 1 : 2);
        jSONObject.put("element", 3);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        if (z17) {
            h0(true);
        } else {
            com.tencent.mm.plugin.finder.live.widget.e0.W(this, null, false, 0, 7, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.t1
    public void m0(r45.ze2 location) {
        kotlin.jvm.internal.o.g(location, "location");
        com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
        java.lang.String str = this.H;
        com.tencent.mars.xlog.Log.i(str, "onGetLocationDone start set cmd");
        qf2.z3 z3Var = this.N;
        if (z3Var != null) {
            java.lang.String string = location.getString(2);
            if (string == null) {
                string = "";
            }
            z3Var.b7(string, str);
        }
        if (z3Var != null) {
            z3Var.a7(134217728, true, new com.tencent.mm.plugin.finder.live.widget.j8(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.t1
    public void n0(boolean z17) {
        com.tencent.mars.xlog.Log.i(i0(), "systemPermissionCallback hadPermission: " + z17);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.f328344a2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", z17 ? 1 : 2);
        jSONObject.put("element", 2);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        if (z17) {
            h0(true);
        } else {
            com.tencent.mm.plugin.finder.live.widget.e0.W(this, null, false, 0, 7, null);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorVoiceLBSGuidePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.h hVar = this.P;
        if (hVar == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        int id6 = hVar.f262060c.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.f328344a2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("element", 1);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            if (!com.tencent.mm.sdk.platformtools.n2.a()) {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                android.content.Context context = this.f118183e;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = context.getString(com.tencent.mm.R.string.mlf);
                e4Var.c();
                com.tencent.mars.xlog.Log.i(this.H, "isGpsEnable false");
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorVoiceLBSGuidePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!k0()) {
                this.K = false;
                com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
            }
            h0(true);
        } else {
            fg2.h hVar2 = this.P;
            if (hVar2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            int id7 = hVar2.f262059b.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                qf2.z3 z3Var = this.N;
                if (z3Var != null) {
                    z3Var.b7("", "DisableShow");
                }
                com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
                i95.m c18 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb zbVar2 = (zy2.zb) c18;
                ml2.z4 z4Var2 = ml2.z4.f328344a2;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("type", 2);
                jSONObject2.put("element", 1);
                zy2.zb.y6(zbVar2, z4Var2, jSONObject2.toString(), null, 4, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorVoiceLBSGuidePanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
