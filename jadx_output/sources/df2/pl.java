package df2;

/* loaded from: classes3.dex */
public final class pl extends if2.b implements if2.e {
    public final java.util.LinkedList A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public com.tencent.mm.ui.tools.f5 F;
    public boolean G;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231087m;

    /* renamed from: n, reason: collision with root package name */
    public ce2.i f231088n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.RelativeLayout f231089o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.LiveBottomSheetPanel f231090p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f231091q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f231092r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f231093s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f231094t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f231095u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f231096v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f231097w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f231098x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f231099y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FakeEditText f231100z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        r45.yi6 Q0;
        kotlin.jvm.internal.o.g(store, "store");
        this.f231087m = "LiveGiftCustomTextController";
        ce2.i iVar = this.f231088n;
        if (iVar != null && (Q0 = iVar.Q0()) != null) {
            Q0.getInteger(12);
        }
        this.A = new java.util.LinkedList();
        this.B = jz5.h.b(new df2.ll(this));
        this.C = jz5.h.b(new df2.jl(this));
        this.D = jz5.h.b(new df2.kl(this));
        this.E = jz5.h.b(new df2.il(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        if (r6 == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Z6(df2.pl r6) {
        /*
            java.util.LinkedList r0 = r6.A
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r5 = r1.getText()
            if (r5 == 0) goto L24
            int r5 = r5.length()
            if (r5 != 0) goto L22
            goto L24
        L22:
            r5 = r4
            goto L25
        L24:
            r5 = r3
        L25:
            if (r5 != 0) goto L44
            r5 = 2131306272(0x7f092720, float:1.8230738E38)
            java.lang.Object r1 = r1.getTag(r5)
            boolean r5 = r1 instanceof java.lang.Boolean
            if (r5 == 0) goto L35
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L36
        L35:
            r1 = r2
        L36:
            if (r1 == 0) goto L41
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L3f
            goto L41
        L3f:
            r1 = r4
            goto L42
        L41:
            r1 = r3
        L42:
            if (r1 != 0) goto L6
        L44:
            r0 = r4
            goto L47
        L46:
            r0 = r3
        L47:
            android.view.View r1 = r6.f231092r
            if (r1 != 0) goto L4c
            goto L7d
        L4c:
            if (r0 == 0) goto L79
            ce2.i r0 = r6.f231088n
            if (r0 == 0) goto L75
            r45.xi6 r0 = r0.field_switchSkinInfo
            if (r0 == 0) goto L75
            r5 = 3
            java.lang.String r0 = r0.getString(r5)
            if (r0 == 0) goto L75
            int r5 = r0.length()
            if (r5 <= 0) goto L65
            r5 = r3
            goto L66
        L65:
            r5 = r4
        L66:
            if (r5 == 0) goto L69
            r2 = r0
        L69:
            if (r2 == 0) goto L75
            java.lang.String r6 = r6.b7()
            boolean r6 = kotlin.jvm.internal.o.b(r2, r6)
            r6 = r6 ^ r3
            goto L76
        L75:
            r6 = r3
        L76:
            if (r6 == 0) goto L79
            goto L7a
        L79:
            r3 = r4
        L7a:
            r1.setEnabled(r3)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.pl.Z6(df2.pl):void");
    }

    public static final boolean a7(df2.pl plVar) {
        android.widget.TextView textView;
        boolean z17;
        jz5.l lVar;
        java.util.LinkedList linkedList = plVar.A;
        int size = linkedList.size();
        boolean z18 = true;
        int i17 = Integer.MAX_VALUE;
        boolean z19 = true;
        int i18 = 0;
        while (true) {
            int i19 = 2;
            if (i18 >= size) {
                break;
            }
            int i27 = 0 + i18;
            java.lang.CharSequence text = ((android.widget.TextView) linkedList.get(i18)).getText();
            kotlin.jvm.internal.o.f(text, "getText(...)");
            java.lang.Character C0 = r26.p0.C0(text, 0);
            if (C0 == null) {
                lVar = new jz5.l(java.lang.Boolean.TRUE, 0);
            } else {
                boolean z27 = i27 == 0 ? z18 : false;
                r45.wi6 wi6Var = dk2.u7.f234196p;
                if (!((wi6Var == null || wi6Var.getBoolean(0) != z18) ? false : z18)) {
                    char charValue = C0.charValue();
                    if (!(19968 <= charValue && charValue < 40892)) {
                        if (!java.util.regex.Pattern.compile("[a-zA-Z]").matcher(java.lang.String.valueOf(C0.charValue())).matches()) {
                            if (!java.util.regex.Pattern.compile("[0-9]").matcher(java.lang.String.valueOf(C0.charValue())).matches()) {
                                z17 = false;
                                i19 = 4;
                                lVar = new jz5.l(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i19));
                            }
                        }
                    }
                    i19 = 4;
                    z17 = true;
                    lVar = new jz5.l(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i19));
                } else if (z27) {
                    char charValue2 = C0.charValue();
                    if (19968 > charValue2 || charValue2 >= 40892) {
                        z17 = false;
                        lVar = new jz5.l(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i19));
                    }
                    z17 = true;
                    lVar = new jz5.l(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i19));
                } else {
                    if (!java.util.regex.Pattern.compile("[a-zA-Z]").matcher(java.lang.String.valueOf(C0.charValue())).matches()) {
                        if (!java.util.regex.Pattern.compile("[0-9]").matcher(java.lang.String.valueOf(C0.charValue())).matches()) {
                            z17 = false;
                            i19 = 3;
                            lVar = new jz5.l(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i19));
                        }
                    }
                    i19 = 3;
                    z17 = true;
                    lVar = new jz5.l(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i19));
                }
            }
            java.lang.Boolean bool = (java.lang.Boolean) lVar.f302833d;
            if (bool.booleanValue()) {
                android.widget.TextView textView2 = (android.widget.TextView) kz5.n0.a0(linkedList, i27);
                if (textView2 != null) {
                    textView2.setTag(com.tencent.mm.R.id.f484641f01, java.lang.Boolean.FALSE);
                    if (plVar.d7(textView2)) {
                        textView2.setBackground(textView2.getContext().getDrawable(com.tencent.mm.R.drawable.a3q));
                    } else {
                        textView2.setBackground(textView2.getContext().getDrawable(com.tencent.mm.R.drawable.a3p));
                    }
                }
            } else {
                int intValue = ((java.lang.Number) lVar.f302834e).intValue();
                if (intValue <= i17) {
                    i17 = intValue;
                }
                android.widget.TextView textView3 = (android.widget.TextView) kz5.n0.a0(linkedList, i27);
                if (textView3 != null) {
                    textView3.setTag(com.tencent.mm.R.id.f484641f01, java.lang.Boolean.TRUE);
                    textView3.setBackground(textView3.getContext().getDrawable(com.tencent.mm.R.drawable.a3o));
                }
            }
            z19 = z19 && bool.booleanValue();
            i18++;
            z18 = true;
        }
        if (!z19) {
            if (i17 == 2) {
                android.widget.TextView textView4 = plVar.f231099y;
                if (textView4 != null) {
                    textView4.setText(plVar.O6().getString(com.tencent.mm.R.string.dhl));
                }
            } else if (i17 == 3) {
                android.widget.TextView textView5 = plVar.f231099y;
                if (textView5 != null) {
                    textView5.setText(plVar.O6().getString(com.tencent.mm.R.string.dhk));
                }
            } else if (i17 == 4 && (textView = plVar.f231099y) != null) {
                textView.setText(plVar.O6().getString(com.tencent.mm.R.string.dhj));
            }
            android.widget.TextView textView6 = plVar.f231099y;
            if (textView6 != null) {
                textView6.setTextColor(plVar.O6().getResources().getColor(com.tencent.mm.R.color.f478532ac));
            }
            android.widget.TextView textView7 = plVar.f231099y;
            if (textView7 != null) {
                textView7.setVisibility(0);
            }
        } else if (plVar.b7().length() < linkedList.size()) {
            android.widget.TextView textView8 = plVar.f231099y;
            if (textView8 != null) {
                textView8.setTextColor(plVar.O6().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
            }
            android.widget.TextView textView9 = plVar.f231099y;
            if (textView9 != null) {
                textView9.setText(plVar.O6().getString(com.tencent.mm.R.string.dhm));
            }
            android.widget.TextView textView10 = plVar.f231099y;
            if (textView10 != null) {
                textView10.setVisibility(0);
            }
        } else {
            android.widget.TextView textView11 = plVar.f231099y;
            if (textView11 != null) {
                textView11.setTextColor(plVar.O6().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
            }
            android.widget.TextView textView12 = plVar.f231099y;
            if (textView12 != null) {
                textView12.setVisibility(4);
            }
        }
        return z19;
    }

    public final java.lang.String b7() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            sb6.append(((android.widget.TextView) it.next()).getText());
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final int c7() {
        int i17 = 0;
        for (java.lang.Object obj : this.A) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (d7((android.widget.TextView) obj)) {
                return i17;
            }
            i17 = i18;
        }
        return 0;
    }

    public final boolean d7(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<this>");
        java.lang.Object tag = textView.getTag(com.tencent.mm.R.id.f484642f02);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void e7(android.widget.TextView textView) {
        for (android.widget.TextView textView2 : this.A) {
            kotlin.jvm.internal.o.g(textView2, "<this>");
            textView2.setTag(com.tencent.mm.R.id.f484642f02, java.lang.Boolean.FALSE);
            java.lang.Object tag = textView2.getTag(com.tencent.mm.R.id.f484641f01);
            java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
            if (!(bool == null || !bool.booleanValue())) {
                java.lang.CharSequence text = textView2.getText();
                if (!(text == null || text.length() == 0)) {
                    textView2.setBackground(textView2.getContext().getDrawable(com.tencent.mm.R.drawable.a3o));
                }
            }
            textView2.setBackground(textView2.getContext().getDrawable(com.tencent.mm.R.drawable.a3p));
        }
        kotlin.jvm.internal.o.g(textView, "<this>");
        textView.setTag(com.tencent.mm.R.id.f484642f02, java.lang.Boolean.TRUE);
        textView.setBackground(textView.getContext().getDrawable(com.tencent.mm.R.drawable.a3q));
        com.tencent.mm.plugin.finder.view.FakeEditText fakeEditText = this.f231100z;
        if (fakeEditText != null) {
            fakeEditText.post(new df2.xk(this, fakeEditText));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x036a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f7(ce2.i r14) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.pl.f7(ce2.i):void");
    }

    public final void g7() {
        java.lang.String b76 = b7();
        com.tencent.mm.view.MMPAGView mMPAGView = this.f231093s;
        if (mMPAGView != null) {
            mMPAGView.l("customText", b76);
        }
    }

    @Override // if2.e
    public boolean onBackPress() {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f231090p;
        if (!(liveBottomSheetPanel != null && liveBottomSheetPanel.isShowing)) {
            return false;
        }
        if (liveBottomSheetPanel != null) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        android.view.View view = this.f231091q;
        if (view != null) {
            view.performClick();
        }
        com.tencent.mm.ui.tools.f5 f5Var = this.F;
        if (f5Var != null) {
            f5Var.d();
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.F;
        if (f5Var2 != null) {
            f5Var2.f210400e = null;
        }
        this.F = null;
        this.f231089o = null;
        this.f231090p = null;
        this.f231091q = null;
        this.f231092r = null;
        this.f231093s = null;
        this.f231094t = null;
        this.f231095u = null;
        this.f231096v = null;
        this.f231097w = null;
        this.f231098x = null;
        this.f231099y = null;
        this.f231100z = null;
        this.A.clear();
    }
}
