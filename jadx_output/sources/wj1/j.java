package wj1;

/* loaded from: classes14.dex */
public class j implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wj1.c0 f446594a;

    public j(wj1.c0 c0Var) {
        this.f446594a = c0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(final int i17, final int i18, final java.lang.String str, final com.tencent.mm.modelbase.o oVar) {
        this.f446594a.f446576a.runOnUiThread(new java.lang.Runnable() { // from class: wj1.j$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.protobuf.f fVar;
                boolean z17;
                fl1.c0 c0Var;
                boolean z18;
                fl1.c0 c0Var2;
                wj1.c0 c0Var3 = wj1.j.this.f446594a;
                com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = c0Var3.f446576a;
                com.tencent.mm.ui.widget.dialog.u3 u3Var = appBrandIDCardUI.f89550z;
                if (u3Var != null && u3Var.isShowing()) {
                    appBrandIDCardUI.f89550z.dismiss();
                }
                int i19 = i17;
                int i27 = i18;
                com.tencent.mm.modelbase.o oVar2 = oVar;
                if (i19 != 0 || i27 != 0 || (fVar = oVar2.f70711b.f70700a) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "getIDCardInfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str, oVar2.f70711b.f70700a);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("intent_err_code", com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL);
                    intent.putExtra("intent_err_msg", "network err");
                    appBrandIDCardUI.setResult(1, intent);
                    appBrandIDCardUI.finish();
                    return;
                }
                r45.o56 o56Var = (r45.o56) fVar;
                r45.gc gcVar = o56Var.f381949d;
                if (gcVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response is err");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("intent_err_code", com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL);
                    intent2.putExtra("intent_err_msg", "network err");
                    appBrandIDCardUI.setResult(1, intent2);
                    appBrandIDCardUI.finish();
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response.err_code is %d", java.lang.Integer.valueOf(gcVar.f375078d));
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.show_status:%d", java.lang.Integer.valueOf(o56Var.f381950e));
                int i28 = o56Var.f381950e;
                if (i28 != 0) {
                    if (i28 != 1) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.show_status error");
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "showAlert errCode:%d, errMsg:%s", java.lang.Integer.valueOf(o56Var.f381949d.f375078d), o56Var.f381949d.f375079e);
                    r45.gc gcVar2 = o56Var.f381949d;
                    int i29 = gcVar2.f375078d;
                    java.lang.String str2 = gcVar2.f375079e;
                    r45.fc fcVar = o56Var.f381951f;
                    db5.e1.K(appBrandIDCardUI, false, fcVar.f374193e, fcVar.f374192d, appBrandIDCardUI.getString(com.tencent.mm.R.string.f490159mk), "", new wj1.k(c0Var3, i29, str2), new wj1.l(c0Var3));
                    return;
                }
                if (o56Var.f381949d.f375078d != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response is not ok");
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("intent_err_code", o56Var.f381949d.f375078d);
                    intent3.putExtra("intent_err_msg", o56Var.f381949d.f375079e);
                    appBrandIDCardUI.setResult(1, intent3);
                    appBrandIDCardUI.finish();
                    return;
                }
                appBrandIDCardUI.f89539o = o56Var;
                int i37 = appBrandIDCardUI.f89546v;
                if (i37 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "switchToShowFragment");
                    ((ku5.t0) ku5.t0.f312615d).B(new wj1.g0(appBrandIDCardUI));
                    return;
                }
                l01.q0 q0Var = l01.q0.f314787d;
                if (i37 == 1) {
                    db1.p pVar = appBrandIDCardUI.f89549y;
                    if (pVar != null && (c0Var2 = appBrandIDCardUI.f89548x) != null) {
                        c0Var2.a(pVar);
                    }
                    r45.o56 o56Var2 = appBrandIDCardUI.f89539o;
                    if (o56Var2 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "lost idcard show info");
                        appBrandIDCardUI.setResult(0);
                        appBrandIDCardUI.finish();
                        return;
                    }
                    if (o56Var2.f381965w == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "lost idcard info");
                        appBrandIDCardUI.setResult(0);
                        appBrandIDCardUI.finish();
                        return;
                    }
                    db1.p pVar2 = new db1.p(appBrandIDCardUI.getContext());
                    appBrandIDCardUI.f89549y = pVar2;
                    pVar2.F = new wj1.i0(appBrandIDCardUI);
                    pVar2.E = new wj1.j0(appBrandIDCardUI);
                    pVar2.A = new wj1.k0(appBrandIDCardUI);
                    pVar2.B = new wj1.l0(appBrandIDCardUI);
                    pVar2.C = new wj1.s(appBrandIDCardUI);
                    pVar2.G = new wj1.t(appBrandIDCardUI);
                    pVar2.H = new wj1.u(appBrandIDCardUI);
                    db1.p pVar3 = appBrandIDCardUI.f89549y;
                    java.lang.String str3 = appBrandIDCardUI.f89539o.f381953h;
                    pVar3.getClass();
                    l01.d0.f314761a.b(pVar3.f227851e, str3, l01.a.h(), q0Var);
                    if (android.text.TextUtils.isEmpty(appBrandIDCardUI.f89545u)) {
                        appBrandIDCardUI.f89545u = appBrandIDCardUI.f89539o.f381954i;
                    }
                    db1.p pVar4 = appBrandIDCardUI.f89549y;
                    java.lang.String str4 = appBrandIDCardUI.f89545u;
                    pVar4.getClass();
                    if (str4 == null) {
                        str4 = "";
                    }
                    pVar4.f227852f.setText(str4);
                    db1.p pVar5 = appBrandIDCardUI.f89549y;
                    java.lang.String str5 = appBrandIDCardUI.f89539o.f381965w.f373260f;
                    pVar5.getClass();
                    if (str5 == null) {
                        str5 = "";
                    }
                    pVar5.f227853g.setText(str5);
                    db1.p pVar6 = appBrandIDCardUI.f89549y;
                    java.lang.String str6 = appBrandIDCardUI.f89539o.f381965w.f373261g;
                    pVar6.getClass();
                    if (str6 == null) {
                        str6 = "";
                    }
                    pVar6.f227856m.setText(str6);
                    db1.p pVar7 = appBrandIDCardUI.f89549y;
                    java.lang.String str7 = appBrandIDCardUI.f89539o.f381965w.f373262h;
                    pVar7.getClass();
                    if (str7 == null) {
                        str7 = "";
                    }
                    pVar7.f227859p.setText(str7);
                    db1.p pVar8 = appBrandIDCardUI.f89549y;
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(appBrandIDCardUI.f89539o.f381963u);
                    if (valueOf != null) {
                        pVar8.getClass();
                        z18 = valueOf.booleanValue();
                    } else {
                        z18 = false;
                    }
                    pVar8.f227863t.setChecked(z18);
                    pVar8.f227866w.setEnabled(valueOf != null ? valueOf.booleanValue() : false);
                    db1.p pVar9 = appBrandIDCardUI.f89549y;
                    java.lang.String str8 = appBrandIDCardUI.f89539o.f381958p;
                    pVar9.getClass();
                    boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str8);
                    java.lang.CharSequence charSequence = str8;
                    if (K0) {
                        charSequence = pVar9.getContext().getText(com.tencent.mm.R.string.f490160ml);
                    }
                    pVar9.f227866w.setText(charSequence);
                    db1.p pVar10 = appBrandIDCardUI.f89549y;
                    java.lang.String str9 = appBrandIDCardUI.f89539o.f381964v;
                    pVar10.getClass();
                    boolean K02 = com.tencent.mm.sdk.platformtools.t8.K0(str9);
                    java.lang.CharSequence charSequence2 = str9;
                    if (K02) {
                        charSequence2 = pVar10.getContext().getText(com.tencent.mm.R.string.f490161mm);
                    }
                    pVar10.f227863t.setText(charSequence2);
                    r45.lc lcVar = appBrandIDCardUI.f89539o.f381965w.f373264m;
                    if (lcVar != null) {
                        db1.p pVar11 = appBrandIDCardUI.f89549y;
                        java.lang.String str10 = lcVar.f379295d;
                        if (str10 != null) {
                            android.widget.TextView textView = pVar11.f227864u;
                            textView.setText(str10);
                            textView.setOnClickListener(new db1.o(pVar11));
                        } else {
                            pVar11.getClass();
                        }
                    }
                    if (appBrandIDCardUI.f89539o.f381965w.f373258d != null) {
                        appBrandIDCardUI.f89549y.c(appBrandIDCardUI.f89539o.f381965w.f373258d.f370661d + " " + appBrandIDCardUI.f89539o.f381965w.f373258d.f370662e);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "no id card info");
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    r45.p93 p93Var = appBrandIDCardUI.f89539o.f381965w.f373259e;
                    if (p93Var != null) {
                        r45.a85 a85Var = p93Var.f382874d;
                        if (a85Var != null) {
                            java.lang.String str11 = a85Var.f369818d;
                            java.lang.String str12 = str11 == null ? "" : str11;
                            java.lang.String str13 = a85Var.f369819e;
                            java.lang.String str14 = str13 == null ? "" : str13;
                            java.lang.String str15 = a85Var.f369822h;
                            java.lang.String str16 = str15 == null ? "" : str15;
                            java.lang.String str17 = a85Var.f369823i;
                            java.lang.String str18 = str17 == null ? "" : str17;
                            java.lang.String str19 = a85Var.f369824m;
                            arrayList.add(new com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem(str12, str14, str16, str18, str19 == null ? "" : str19, a85Var.f369820f, a85Var.f369821g, true, false, ""));
                        }
                        java.util.LinkedList linkedList = appBrandIDCardUI.f89539o.f381965w.f373259e.f382875e;
                        if (linkedList != null) {
                            java.util.Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                r45.a85 a85Var2 = (r45.a85) it.next();
                                java.lang.String str20 = a85Var2.f369818d;
                                java.lang.String str21 = str20 == null ? "" : str20;
                                java.lang.String str22 = a85Var2.f369819e;
                                java.lang.String str23 = str22 == null ? "" : str22;
                                java.lang.String str24 = a85Var2.f369822h;
                                java.lang.String str25 = str24 == null ? "" : str24;
                                java.lang.String str26 = a85Var2.f369823i;
                                java.lang.String str27 = str26 == null ? "" : str26;
                                java.lang.String str28 = a85Var2.f369824m;
                                arrayList.add(new com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem(str21, str23, str25, str27, str28 == null ? "" : str28, a85Var2.f369820f, a85Var2.f369821g, false, false, ""));
                            }
                        }
                    }
                    vi1.o0 o0Var = vi1.o0.f437416a;
                    java.util.List c17 = o0Var.c(arrayList, o0Var.b());
                    appBrandIDCardUI.f89549y.e(c17 == null ? new java.util.ArrayList() : (java.util.ArrayList) c17);
                    o0Var.d(c17);
                    fl1.c0 c0Var4 = appBrandIDCardUI.f89548x;
                    if (c0Var4 != null) {
                        c0Var4.c(appBrandIDCardUI.f89549y);
                        return;
                    }
                    return;
                }
                if (i37 == 2) {
                    db1.p pVar12 = appBrandIDCardUI.f89549y;
                    if (pVar12 != null && (c0Var = appBrandIDCardUI.f89548x) != null) {
                        c0Var.a(pVar12);
                    }
                    r45.o56 o56Var3 = appBrandIDCardUI.f89539o;
                    if (o56Var3 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "wecoin lost idcard show info");
                        appBrandIDCardUI.setResult(0);
                        appBrandIDCardUI.finish();
                        return;
                    }
                    if (o56Var3.f381965w == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "wecoin lost idcard info");
                        appBrandIDCardUI.setResult(0);
                        appBrandIDCardUI.finish();
                        return;
                    }
                    db1.p pVar13 = new db1.p(appBrandIDCardUI.getContext());
                    appBrandIDCardUI.f89549y = pVar13;
                    pVar13.f227851e.setVisibility(8);
                    pVar13.f227854h.setVisibility(8);
                    appBrandIDCardUI.f89549y.f227850d.setBackgroundResource(com.tencent.mm.R.drawable.b8p);
                    db1.p pVar14 = appBrandIDCardUI.f89549y;
                    wj1.v vVar = new wj1.v(appBrandIDCardUI);
                    pVar14.getClass();
                    pVar14.E = vVar;
                    db1.p pVar15 = appBrandIDCardUI.f89549y;
                    wj1.w wVar = new wj1.w(appBrandIDCardUI);
                    pVar15.getClass();
                    pVar15.A = wVar;
                    db1.p pVar16 = appBrandIDCardUI.f89549y;
                    wj1.x xVar = new wj1.x(appBrandIDCardUI);
                    pVar16.getClass();
                    pVar16.B = xVar;
                    db1.p pVar17 = appBrandIDCardUI.f89549y;
                    wj1.y yVar = new wj1.y(appBrandIDCardUI);
                    pVar17.getClass();
                    pVar17.D = yVar;
                    db1.p pVar18 = appBrandIDCardUI.f89549y;
                    wj1.z zVar = new wj1.z(appBrandIDCardUI);
                    pVar18.getClass();
                    pVar18.C = zVar;
                    db1.p pVar19 = appBrandIDCardUI.f89549y;
                    wj1.a0 a0Var = new wj1.a0(appBrandIDCardUI);
                    pVar19.getClass();
                    pVar19.G = a0Var;
                    db1.p pVar20 = appBrandIDCardUI.f89549y;
                    wj1.b0 b0Var = new wj1.b0(appBrandIDCardUI);
                    pVar20.getClass();
                    pVar20.H = b0Var;
                    db1.p pVar21 = appBrandIDCardUI.f89549y;
                    java.lang.String str29 = appBrandIDCardUI.f89539o.f381953h;
                    pVar21.getClass();
                    l01.d0.f314761a.b(pVar21.f227851e, str29, l01.a.h(), q0Var);
                    db1.p pVar22 = appBrandIDCardUI.f89549y;
                    java.lang.String str30 = appBrandIDCardUI.f89534g;
                    pVar22.getClass();
                    if (str30 == null) {
                        str30 = "";
                    }
                    pVar22.f227852f.setText(str30);
                    db1.p pVar23 = appBrandIDCardUI.f89549y;
                    java.lang.String str31 = appBrandIDCardUI.f89539o.f381965w.f373260f;
                    pVar23.getClass();
                    if (str31 == null) {
                        str31 = "";
                    }
                    pVar23.f227853g.setText(str31);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(appBrandIDCardUI.f89535h)) {
                        db1.p pVar24 = appBrandIDCardUI.f89549y;
                        java.lang.String str32 = appBrandIDCardUI.f89539o.f381965w.f373261g;
                        pVar24.getClass();
                        if (str32 == null) {
                            str32 = "";
                        }
                        pVar24.f227856m.setText(str32);
                    } else {
                        db1.p pVar25 = appBrandIDCardUI.f89549y;
                        java.lang.String str33 = appBrandIDCardUI.f89535h;
                        pVar25.getClass();
                        if (str33 == null) {
                            str33 = "";
                        }
                        pVar25.f227856m.setText(str33);
                    }
                    db1.p pVar26 = appBrandIDCardUI.f89549y;
                    java.lang.String str34 = appBrandIDCardUI.f89539o.f381965w.f373262h;
                    pVar26.getClass();
                    if (str34 == null) {
                        str34 = "";
                    }
                    pVar26.f227859p.setText(str34);
                    boolean z19 = appBrandIDCardUI.f89539o.f381963u;
                    appBrandIDCardUI.V6(z19 ? 12 : 13);
                    db1.p pVar27 = appBrandIDCardUI.f89549y;
                    java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z19);
                    if (valueOf2 != null) {
                        pVar27.getClass();
                        z17 = valueOf2.booleanValue();
                    } else {
                        z17 = false;
                    }
                    pVar27.f227863t.setChecked(z17);
                    pVar27.f227866w.setEnabled(valueOf2 != null ? valueOf2.booleanValue() : false);
                    db1.p pVar28 = appBrandIDCardUI.f89549y;
                    java.lang.String str35 = appBrandIDCardUI.f89539o.f381958p;
                    pVar28.getClass();
                    boolean K03 = com.tencent.mm.sdk.platformtools.t8.K0(str35);
                    java.lang.CharSequence charSequence3 = str35;
                    if (K03) {
                        charSequence3 = pVar28.getContext().getText(com.tencent.mm.R.string.f490160ml);
                    }
                    pVar28.f227866w.setText(charSequence3);
                    db1.p pVar29 = appBrandIDCardUI.f89549y;
                    java.lang.String str36 = appBrandIDCardUI.f89539o.f381964v;
                    pVar29.getClass();
                    boolean K04 = com.tencent.mm.sdk.platformtools.t8.K0(str36);
                    java.lang.CharSequence charSequence4 = str36;
                    if (K04) {
                        charSequence4 = pVar29.getContext().getText(com.tencent.mm.R.string.f490161mm);
                    }
                    pVar29.f227863t.setText(charSequence4);
                    r45.lc lcVar2 = appBrandIDCardUI.f89539o.f381965w.f373264m;
                    if (lcVar2 != null) {
                        db1.p pVar30 = appBrandIDCardUI.f89549y;
                        java.lang.String str37 = lcVar2.f379295d;
                        if (str37 != null) {
                            android.widget.TextView textView2 = pVar30.f227864u;
                            textView2.setText(str37);
                            textView2.setOnClickListener(new db1.o(pVar30));
                        } else {
                            pVar30.getClass();
                        }
                    }
                    if (appBrandIDCardUI.f89539o.f381965w.f373258d != null) {
                        appBrandIDCardUI.f89549y.c(appBrandIDCardUI.f89539o.f381965w.f373258d.f370661d + " " + appBrandIDCardUI.f89539o.f381965w.f373258d.f370662e);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "wecoin no id card info");
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    r45.p93 p93Var2 = appBrandIDCardUI.f89539o.f381965w.f373259e;
                    if (p93Var2 != null) {
                        r45.a85 a85Var3 = p93Var2.f382874d;
                        if (a85Var3 != null) {
                            java.lang.String str38 = a85Var3.f369818d;
                            java.lang.String str39 = str38 == null ? "" : str38;
                            java.lang.String str40 = a85Var3.f369819e;
                            java.lang.String str41 = str40 == null ? "" : str40;
                            java.lang.String str42 = a85Var3.f369822h;
                            java.lang.String str43 = str42 == null ? "" : str42;
                            java.lang.String str44 = a85Var3.f369823i;
                            java.lang.String str45 = str44 == null ? "" : str44;
                            java.lang.String str46 = a85Var3.f369824m;
                            arrayList2.add(new com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem(str39, str41, str43, str45, str46 == null ? "" : str46, a85Var3.f369820f, a85Var3.f369821g, true, false, ""));
                        }
                        java.util.LinkedList linkedList2 = appBrandIDCardUI.f89539o.f381965w.f373259e.f382875e;
                        if (linkedList2 != null) {
                            java.util.Iterator it6 = linkedList2.iterator();
                            while (it6.hasNext()) {
                                r45.a85 a85Var4 = (r45.a85) it6.next();
                                java.lang.String str47 = a85Var4.f369818d;
                                java.lang.String str48 = str47 == null ? "" : str47;
                                java.lang.String str49 = a85Var4.f369819e;
                                java.lang.String str50 = str49 == null ? "" : str49;
                                java.lang.String str51 = a85Var4.f369822h;
                                java.lang.String str52 = str51 == null ? "" : str51;
                                java.lang.String str53 = a85Var4.f369823i;
                                java.lang.String str54 = str53 == null ? "" : str53;
                                java.lang.String str55 = a85Var4.f369824m;
                                arrayList2.add(new com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem(str48, str50, str52, str54, str55 == null ? "" : str55, a85Var4.f369820f, a85Var4.f369821g, false, false, ""));
                            }
                        }
                    }
                    vi1.o0 o0Var2 = vi1.o0.f437416a;
                    java.util.List c18 = o0Var2.c(arrayList2, o0Var2.b());
                    appBrandIDCardUI.f89549y.e(c18 == null ? new java.util.ArrayList() : (java.util.ArrayList) c18);
                    o0Var2.d(c18);
                    fl1.c0 c0Var5 = appBrandIDCardUI.f89548x;
                    if (c0Var5 != null) {
                        c0Var5.c(appBrandIDCardUI.f89549y);
                    }
                }
            }
        });
    }
}
