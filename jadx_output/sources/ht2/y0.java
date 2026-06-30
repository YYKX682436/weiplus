package ht2;

@j95.b
/* loaded from: classes2.dex */
public final class y0 extends i95.w implements zy2.s6 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.regex.Pattern f284936g = java.util.regex.Pattern.compile("<_wc_custom_link_.+? (.*?)>(.*?)</_wc_custom_link_>");

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.regex.Pattern f284937h = java.util.regex.Pattern.compile("<_wc_custom_link_\\s+(.*?)>(.*?)</_wc_custom_link_>");

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.regex.Pattern f284938i = java.util.regex.Pattern.compile("<_wc_custom_img_.+? (.*?)/>");

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.regex.Pattern f284939m = java.util.regex.Pattern.compile("<_wc_custom_img_\\s+(.*?)/>");

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f284940d = kz5.c1.k(new jz5.l("FinderObjectDynamicImageKey_FinderAdPoiIcon", java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_location)), new jz5.l("icons_outlined_like_1.5pt.svg", java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_like)), new jz5.l("finder_thank_fireworks_icon.png", java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481803cr1)), new jz5.l("arrow_right_regular.svg", java.lang.Integer.valueOf(com.tencent.mm.R.raw.arrow_regular_right)), new jz5.l("icons_outlined_red_envelope.svg", java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_red_envelope)), new jz5.l("icons_filled_red_envelope.svg", java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_red_envelope_big)), new jz5.l("finder_thank_party_icon.png", java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cwy)), new jz5.l("camera_regular.svg", java.lang.Integer.valueOf(com.tencent.mm.R.raw.camera_regular)), new jz5.l("heart_medium.svg", java.lang.Integer.valueOf(com.tencent.mm.R.raw.heart_medium)), new jz5.l("icons_outlined_channels_like", java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_like)), new jz5.l("icons_outlined_channels_good", java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_star_new)));

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f284941e = "";

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f284942f;

    public static final void Vi(android.widget.LinearLayout linearLayout, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2, android.view.ViewGroup viewGroup) {
        if (c0Var.f310112d && c0Var2.f310112d) {
            linearLayout.animate().alpha(0.0f).setDuration(400L).setListener(new ht2.q0(viewGroup, linearLayout));
        }
    }

    public static java.util.Map nj(ht2.y0 y0Var, java.lang.CharSequence richText, int i17, int i18, int i19, java.lang.Object obj) {
        java.util.Map d17;
        if ((i19 & 2) != 0) {
            i17 = -1;
        }
        if ((i19 & 4) != 0) {
            i18 = -1;
        }
        y0Var.getClass();
        kotlin.jvm.internal.o.g(richText, "richText");
        if (i17 == -1) {
            i17 = r26.n0.K(richText, '<', 0, false, 6, null);
        }
        if (i18 == -1) {
            i18 = r26.n0.K(richText, '>', 0, false, 6, null);
        }
        kz5.q0 q0Var = kz5.q0.f314001d;
        return (i17 < 0 || i18 < 0 || i18 <= i17 || (d17 = com.tencent.mm.sdk.platformtools.aa.d(richText.subSequence(i17, i18 + 1).toString(), "_wc_custom_img_", null)) == null) ? q0Var : d17;
    }

    public static boolean pj(ht2.y0 y0Var, android.widget.TextView view, java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18, java.lang.Object obj) {
        fx2.f fVar;
        java.lang.Object obj2;
        int i19 = (i18 & 16) != 0 ? 0 : i17;
        y0Var.getClass();
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        java.lang.String t17 = r26.i0.t(str2, "$$", str, false);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(t17);
        java.util.Map nj6 = nj(y0Var, t17, 0, 0, 6, null);
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        zy2.k6 ij6 = y0Var.ij(nj6, resources);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new ht2.e(ij6.f477435a, r26.n0.L(t17, "<", 0, false, 6, null), r26.n0.L(t17, ">", 0, false, 6, null)));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ht2.e eVar = (ht2.e) it.next();
            if (eVar.f284819b >= 0 && eVar.f284820c >= 0) {
                kotlin.jvm.internal.o.g(view, "view");
                java.util.Iterator it6 = cu2.f0.f222393c.iterator();
                while (true) {
                    fVar = null;
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (kotlin.jvm.internal.o.b(((r45.rl2) obj2).getString(3), eVar.f284818a)) {
                        break;
                    }
                }
                r45.rl2 rl2Var = (r45.rl2) obj2;
                if (rl2Var != null) {
                    java.lang.String string = z17 ? rl2Var.getString(1) : rl2Var.getString(2);
                    if (!(string == null || string.length() == 0)) {
                        fVar = new fx2.f(string, com.tencent.mm.R.id.f487510ou1, view);
                    }
                }
                if (fVar != null) {
                    fVar.f267132g = mn2.f1.f329953d;
                    int textSize = i19 == 0 ? (int) view.getTextSize() : i19;
                    fVar.setBounds(0, 0, textSize, textSize);
                    fVar.f267131f = 204;
                    spannableStringBuilder.setSpan(new al5.w(fVar, 1), eVar.f284819b, eVar.f284820c + 1, 17);
                }
            }
            return false;
        }
        view.setVisibility(0);
        view.setText(spannableStringBuilder);
        return true;
    }

    public void Ai(android.view.View btnIv, android.view.View view) {
        kotlin.jvm.internal.o.g(btnIv, "btnIv");
        uw2.h0.o(uw2.h0.f431674a, btnIv, 0L, 2, null);
        try {
            com.tencent.mm.view.MMPAGView mMPAGView = view instanceof com.tencent.mm.view.MMPAGView ? (com.tencent.mm.view.MMPAGView) view : null;
            if (mMPAGView != null) {
                mMPAGView.setVisibility(0);
                mMPAGView.setProgress(0.0d);
                mMPAGView.setRepeatCount(1);
                mMPAGView.o(((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Z0().r()).booleanValue());
                if (mMPAGView.getUseRfx()) {
                    mMPAGView.setComposition(com.tencent.mm.rfx.RfxPagFile.Load(btnIv.getContext().getAssets(), "finder_like_animate.pag"));
                } else {
                    mMPAGView.setComposition(org.libpag.PAGFile.Load(btnIv.getContext().getAssets(), "finder_like_animate.pag"));
                }
                mMPAGView.g();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("Finder.DynamicIconResService", "playIconInTimeLineFeedLikeAnimDefault e:" + th6);
        }
    }

    public void Bi(com.tencent.mm.ui.widget.imageview.WeImageView iv6, android.widget.TextView tv6, zy2.o6 iConfig) {
        java.lang.String string;
        boolean z17;
        kotlin.jvm.internal.o.g(iv6, "iv");
        kotlin.jvm.internal.o.g(tv6, "tv");
        kotlin.jvm.internal.o.g(iConfig, "iConfig");
        iv6.setVisibility(8);
        int dimension = iv6.getLayoutParams().width > 0 ? iv6.getLayoutParams().width : (int) iv6.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
        java.lang.String str = "";
        if (iConfig.f477513c) {
            java.lang.String str2 = iConfig.f477512b;
            if (str2 == null || str2.length() == 0) {
                z17 = false;
            } else {
                android.text.SpannableString H3 = zy2.s6.H3(this, r26.i0.t(str2, "$$", "", false), dimension, false, 4, null);
                tv6.setVisibility(0);
                tv6.setText(H3);
                tv6.postInvalidate();
                z17 = true;
            }
            if (z17) {
                return;
            }
        }
        tv6.setVisibility(8);
        iv6.setVisibility(0);
        boolean z18 = iConfig.f477511a;
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (z18) {
            if (iConfig.f477515e) {
                iv6.setImageResource(com.tencent.mm.R.raw.icon_outlined_support);
                iv6.setIconColor(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.FG_0));
                return;
            }
            r45.rl2 a17 = cu2.f0.f222391a.a("FinderObjectDynamicImageKey_FinderFavOffIcon");
            if (com.tencent.mm.ui.bk.C() ? !(a17 == null || (string = a17.getString(1)) == null) : !(a17 == null || (string = a17.getString(2)) == null)) {
                str = string;
            }
            if (str.length() == 0) {
                iv6.setImageDrawable(com.tencent.mm.ui.uk.e(iv6.getContext(), com.tencent.mm.R.raw.icons_outlined_star_new, iv6.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0)));
                iv6.setIconColor(i65.a.d(iv6.getContext(), com.tencent.mm.R.color.FG_0));
                return;
            }
            wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.f329953d));
            ht2.h hVar = new ht2.h(iv6, this);
            b17.getClass();
            b17.f447873d = hVar;
            b17.f();
            return;
        }
        r45.bm2 bm2Var = iConfig.f477514d;
        if (bm2Var != null) {
            java.lang.String str3 = null;
            java.lang.String string2 = bm2Var != null ? bm2Var.getString(10) : null;
            if (string2 != null && string2.length() != 0) {
                r9 = false;
            }
            if (!r9) {
                if (com.tencent.mm.ui.bk.C()) {
                    r45.bm2 bm2Var2 = iConfig.f477514d;
                    if (bm2Var2 != null) {
                        str3 = bm2Var2.getString(9);
                    }
                } else {
                    r45.bm2 bm2Var3 = iConfig.f477514d;
                    if (bm2Var3 != null) {
                        str3 = bm2Var3.getString(10);
                    }
                }
                wo0.c b18 = g1Var.e().b(new mn2.q3(str3, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.f329953d));
                ht2.j jVar = new ht2.j(iv6, this);
                b18.getClass();
                b18.f447873d = jVar;
                b18.f();
                return;
            }
        }
        iv6.setImageDrawable(com.tencent.mm.ui.uk.e(iv6.getContext(), com.tencent.mm.R.raw.icon_outlined_awesome, iv6.getContext().getResources().getColor(com.tencent.mm.R.color.FG_0)));
        iv6.setIconColor(i65.a.d(iv6.getContext(), com.tencent.mm.R.color.FG_0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r2 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if (r7.f477554e == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
    
        if (com.tencent.mm.ui.bk.C() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:
    
        fj(r2, r0, new ht2.v0(r1, r7, r6, r5));
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r2 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        if (r2 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Di(com.tencent.mm.ui.widget.imageview.WeImageView r6, zy2.r6 r7) {
        /*
            r5 = this;
            java.lang.String r0 = "iv"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "iConfig"
            kotlin.jvm.internal.o.g(r7, r0)
            r0 = 0
            r6.setLayerPaint(r0)
            r0 = 0
            r6.setIconColor(r0)
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r7.f477558i
            if (r1 != 0) goto L18
            goto L98
        L18:
            boolean r2 = r7.f477553d
            r3 = 1
            r4 = 27
            if (r2 == 0) goto L40
            r5.vj(r1)
            r45.dm2 r2 = r1.getObject_extend()
            if (r2 == 0) goto L98
            com.tencent.mm.protobuf.f r2 = r2.getCustom(r4)
            r45.vl2 r2 = (r45.vl2) r2
            if (r2 == 0) goto L98
            com.tencent.mm.protobuf.f r2 = r2.getCustom(r0)
            r45.ql2 r2 = (r45.ql2) r2
            if (r2 == 0) goto L98
            r4 = 3
            java.lang.String r2 = r2.getString(r4)
            if (r2 != 0) goto L84
            goto L98
        L40:
            boolean r2 = r7.f477551b
            if (r2 == 0) goto L64
            r5.vj(r1)
            r45.dm2 r2 = r1.getObject_extend()
            if (r2 == 0) goto L98
            com.tencent.mm.protobuf.f r2 = r2.getCustom(r4)
            r45.vl2 r2 = (r45.vl2) r2
            if (r2 == 0) goto L98
            com.tencent.mm.protobuf.f r2 = r2.getCustom(r0)
            r45.ql2 r2 = (r45.ql2) r2
            if (r2 == 0) goto L98
            java.lang.String r2 = r2.getString(r0)
            if (r2 != 0) goto L84
            goto L98
        L64:
            r5.vj(r1)
            r45.dm2 r2 = r1.getObject_extend()
            if (r2 == 0) goto L98
            com.tencent.mm.protobuf.f r2 = r2.getCustom(r4)
            r45.vl2 r2 = (r45.vl2) r2
            if (r2 == 0) goto L98
            com.tencent.mm.protobuf.f r2 = r2.getCustom(r0)
            r45.ql2 r2 = (r45.ql2) r2
            if (r2 == 0) goto L98
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L84
            goto L98
        L84:
            boolean r4 = r7.f477554e
            if (r4 == 0) goto L8e
            boolean r4 = com.tencent.mm.ui.bk.C()
            if (r4 == 0) goto L8f
        L8e:
            r0 = r3
        L8f:
            ht2.v0 r4 = new ht2.v0
            r4.<init>(r1, r7, r6, r5)
            r5.fj(r2, r0, r4)
            r0 = r3
        L98:
            if (r0 != 0) goto L9d
            r5.rj(r6, r7)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ht2.y0.Di(com.tencent.mm.ui.widget.imageview.WeImageView, zy2.r6):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0041, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0086, code lost:
    
        r0 = pj(r35, r36, java.lang.String.valueOf(r37.f477452c), cu2.f0.f222391a.d(r0), com.tencent.mm.ui.bk.C(), 0, 16, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0062, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0083, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ni(android.widget.TextView r36, zy2.l6 r37) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ht2.y0.Ni(android.widget.TextView, zy2.l6):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x003c, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005f, code lost:
    
        r3 = r28.f477472g + ' ' + cu2.f0.f222391a.d(r0);
        r2 = java.lang.String.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        if (r28.f477469d == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0087, code lost:
    
        if (com.tencent.mm.ui.bk.C() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
    
        r0 = pj(r26, r27, r2, r3, r4, 0, 16, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008c, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x005c, code lost:
    
        if (r0 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ri(android.widget.TextView r27, zy2.m6 r28) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ht2.y0.Ri(android.widget.TextView, zy2.m6):void");
    }

    public void Ui(android.widget.TextView tv6, android.view.ViewGroup viewGroup, zy2.r6 iConfig) {
        r45.vl2 vl2Var;
        r45.wl2 wl2Var;
        r45.zz3 zz3Var;
        kotlin.jvm.internal.o.g(tv6, "tv");
        kotlin.jvm.internal.o.g(iConfig, "iConfig");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = iConfig.f477558i;
        if (finderObject == null) {
            return;
        }
        nv2.h1 h1Var = nv2.n1.f340550g;
        nv2.n1 n1Var = nv2.n1.f340551h;
        int l17 = n1Var.l(finderObject);
        boolean booleanValue = ((java.lang.Boolean) n1Var.k(finderObject).f302833d).booleanValue();
        if (viewGroup != null) {
            viewGroup.setTag(com.tencent.mm.R.id.e5w, java.lang.Boolean.valueOf(booleanValue));
        }
        com.tencent.mars.xlog.Log.i("Finder.DynamicIconResService", "_setTextInTimeLineFeedLike feedId:" + pm0.v.u(finderObject.getId()) + " likeCount=" + l17);
        if (iConfig.f477553d) {
            com.tencent.mm.ui.fk.c(tv6);
            java.lang.String i17 = com.tencent.mm.plugin.finder.assist.w2.i(n1Var.l(finderObject));
            if (viewGroup != null) {
                viewGroup.setTag(com.tencent.mm.R.id.f484408e61, i17);
            }
            tv6.setText(i17);
        } else if (l17 > 0) {
            java.lang.String g17 = com.tencent.mm.plugin.finder.assist.w2.g(2, l17);
            com.tencent.mm.ui.fk.a(tv6);
            if (viewGroup != null) {
                viewGroup.setTag(com.tencent.mm.R.id.f484408e61, g17);
            }
            tv6.setText(g17);
        } else {
            vj(finderObject);
            r45.dm2 object_extend = finderObject.getObject_extend();
            java.lang.String string = (object_extend == null || (zz3Var = (r45.zz3) object_extend.getCustom(41)) == null) ? null : zz3Var.getString(4);
            r45.dm2 object_extend2 = finderObject.getObject_extend();
            boolean z17 = true;
            java.lang.String string2 = (object_extend2 == null || (vl2Var = (r45.vl2) object_extend2.getCustom(27)) == null || (wl2Var = (r45.wl2) vl2Var.getCustom(1)) == null) ? null : wl2Var.getString(4);
            if (string == null || string.length() == 0) {
                if (string2 == null || string2.length() == 0) {
                    r45.bm2 bm2Var = iConfig.f477557h;
                    java.lang.String string3 = bm2Var != null ? bm2Var.getString(11) : null;
                    if (string3 != null && string3.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        string = tv6.getContext().getString(com.tencent.mm.R.string.d1d);
                        kotlin.jvm.internal.o.d(string);
                    } else {
                        r45.bm2 bm2Var2 = iConfig.f477557h;
                        if (bm2Var2 == null || (string = bm2Var2.getString(11)) == null) {
                            string = "";
                        }
                    }
                } else {
                    string = string2;
                }
            }
            com.tencent.mm.ui.fk.c(tv6);
            tv6.setText(string);
            if (viewGroup != null) {
                viewGroup.setTag(com.tencent.mm.R.id.f484408e61, "0");
            }
        }
        if (!iConfig.f477560k) {
            tv6.setTextColor(tv6.getContext().getResources().getColor(iConfig.f477554e ? com.tencent.mm.R.color.BW_0_Alpha_0_4 : com.tencent.mm.R.color.f478988mr));
        } else if (iConfig.f477554e) {
            tv6.setTextColor(tv6.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
        } else {
            tv6.setTextColor(tv6.getContext().getResources().getColor(com.tencent.mm.R.color.f479254u6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Zi(android.view.ViewGroup viewGroup, zy2.r6 r6Var, yz5.p pVar) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.content.Context context = viewGroup.getContext();
        java.lang.CharSequence charSequence = r6Var.f477561l;
        boolean z17 = !(charSequence == null || r26.n0.N(charSequence));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(context);
        int dimension = (int) viewGroup.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479725dh);
        int i17 = z17 ? -1 : dimension;
        if (viewGroup instanceof android.widget.RelativeLayout) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(i17, i17);
            layoutParams2.addRule(13);
            layoutParams = layoutParams2;
        } else {
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(i17, i17);
            layoutParams3.gravity = 17;
            layoutParams = layoutParams3;
        }
        weImageView.setVisibility(4);
        if (!z17) {
            weImageView.setLayoutParams(layoutParams);
            viewGroup.addView(weImageView);
            weImageView.post(new ht2.l(pVar, weImageView));
            return;
        }
        weImageView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(dimension, dimension));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.addView(weImageView);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        int f17 = i65.a.f(context, com.tencent.mm.R.dimen.f479704cz);
        textView.setPadding(f17, context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479716d9), f17, 0);
        textView.setGravity(17);
        textView.setVisibility(4);
        textView.setShadowLayer(20.0f, 0.0f, 8.0f, context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
        textView.setText(r6Var.f477561l);
        textView.setTextSize(0, i65.a.h(context, com.tencent.mm.R.dimen.f479674cb));
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
        linearLayout.addView(textView);
        viewGroup.addView(linearLayout);
        linearLayout.post(new ht2.m(pVar, textView, weImageView));
    }

    public final al5.v aj(java.util.Map map, android.content.res.Resources resources, boolean z17, int i17, boolean z18, yz5.a aVar) {
        boolean z19;
        java.lang.String str;
        al5.v vVar;
        java.lang.Integer num;
        zy2.k6 ij6 = ij(map, resources);
        int i18 = z17 ? ij6.f477437c : ij6.f477436b;
        android.util.Size size = ij6.f477438d;
        int width = size.getWidth() == 0 ? i17 : size.getWidth();
        int height = size.getHeight() == 0 ? i17 : size.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/res/FinderDynamicIconResService", "getIconSpan", "(Ljava/util/Map;Landroid/content/res/Resources;ZIZLkotlin/jvm/functions/Function0;)Lcom/tencent/mm/ui/widget/FixAlphaImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/res/FinderDynamicIconResService", "getIconSpan", "(Ljava/util/Map;Landroid/content/res/Resources;ZIZLkotlin/jvm/functions/Function0;)Lcom/tencent/mm/ui/widget/FixAlphaImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        cu2.f0 f0Var = cu2.f0.f222391a;
        java.lang.String str2 = ij6.f477435a;
        r45.rl2 a17 = f0Var.a(str2);
        boolean z27 = r26.i0.y(str2, "http://", false) || r26.i0.y(str2, "https://", false);
        if (a17 == null) {
            z19 = true;
            str = z27 ? str2 : null;
        } else if (z17) {
            str = a17.getString(2);
            z19 = true;
        } else {
            z19 = true;
            str = a17.getString(1);
        }
        boolean z28 = ij6.f477440f;
        boolean z29 = ij6.f477439e;
        boolean z37 = (!z27 || (!z17 && z29) || (z17 && z28)) ? z19 : false;
        com.tencent.mars.xlog.Log.i("Finder.DynamicIconResService", "[getIconSpan] needDye:" + z37 + " isRemoteURL:" + z27 + " isDark:" + z17 + " hasLightColor:" + z29 + " hasDarkColor:" + z28);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, createBitmap);
        if (z37) {
            cj(bitmapDrawable, i18);
            bitmapDrawable.setBounds(0, 0, width, height);
            vVar = new al5.v(bitmapDrawable, 2);
            vVar.f6072f = str2;
        } else {
            bitmapDrawable.setBounds(0, 0, width, height);
            vVar = new al5.v(bitmapDrawable, 2);
        }
        al5.v vVar2 = vVar;
        java.util.Map map2 = this.f284940d;
        if (z18 && str != null && z37 && (num = (java.lang.Integer) map2.get(str2)) != null) {
            android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, num.intValue(), i18);
            e17.setBounds(0, 0, width, height);
            e17.draw(new android.graphics.Canvas(bitmapDrawable.getBitmap()));
        }
        if (str != null) {
            com.tencent.mars.xlog.Log.i("Finder.DynamicIconResService", "[getIconSpan] url=".concat(str));
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.f329953d));
            ht2.x xVar = new ht2.x(bitmapDrawable, z27, i18, this, aVar);
            b17.getClass();
            b17.f447873d = xVar;
            b17.a();
            return vVar2;
        }
        com.tencent.mars.xlog.Log.i("Finder.DynamicIconResService", "[getIconSpan] no server data, use local res, dynamicImage=".concat(str2));
        java.lang.Integer num2 = (java.lang.Integer) map2.get(str2);
        if (num2 == null) {
            return vVar2;
        }
        android.graphics.drawable.Drawable e18 = com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, num2.intValue(), i18);
        e18.setBounds(0, 0, width, height);
        al5.v vVar3 = new al5.v(e18, 2);
        vVar3.f6072f = str2;
        return vVar3;
    }

    public final android.text.style.ForegroundColorSpan bj(java.util.Map map, android.content.res.Resources resources, int i17) {
        java.lang.Object m521constructorimpl;
        java.lang.String str = (java.lang.String) map.get("._wc_custom_link_.$color");
        if (str != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(hj(str)));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                m521constructorimpl = null;
            }
            java.lang.Integer num = (java.lang.Integer) m521constructorimpl;
            if (num != null) {
                i17 = num.intValue();
            }
        }
        return new android.text.style.ForegroundColorSpan(i17);
    }

    public final android.graphics.drawable.Drawable cj(android.graphics.drawable.Drawable drawable, int i17) {
        kotlin.jvm.internal.o.g(drawable, "drawable");
        if (i17 == 0) {
            drawable.mutate().setColorFilter(null);
            return drawable;
        }
        int argb = android.graphics.Color.argb(255, android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17));
        int alpha = android.graphics.Color.alpha(i17);
        drawable.mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(argb, android.graphics.PorterDuff.Mode.SRC_ATOP));
        drawable.setAlpha(alpha);
        return drawable;
    }

    public final void fj(java.lang.String str, boolean z17, yz5.p pVar) {
        r45.rl2 a17 = cu2.f0.f222391a.a(str);
        boolean z18 = true;
        java.lang.String string = a17 != null ? z17 ? a17.getString(1) : a17.getString(2) : null;
        if (string != null && string.length() != 0) {
            z18 = false;
        }
        if (z18) {
            pm0.v.X(new ht2.l0(pVar));
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.f329953d));
        ht2.k0 k0Var = new ht2.k0(pVar, string);
        b17.getClass();
        b17.f447873d = k0Var;
        b17.a();
    }

    public final int hj(java.lang.String colorString) {
        kotlin.jvm.internal.o.g(colorString, "colorString");
        nf5.a a17 = nf5.b.f336884a.a(colorString);
        if (a17 != null) {
            if (com.tencent.mm.ui.bk.C()) {
                java.lang.String str = a17.f336883c;
                if (str.length() > 0) {
                    return hc2.l.l(str);
                }
            }
            return hc2.l.l(a17.f336882b);
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\s");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(colorString).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        java.util.List f07 = r26.n0.f0(replaceAll, new java.lang.String[]{","}, false, 0, 6, null);
        if (f07.size() == 1) {
            return hc2.l.l((java.lang.String) kz5.n0.X(f07));
        }
        if (f07.size() >= 2) {
            return hc2.l.l((java.lang.String) f07.get(com.tencent.mm.ui.bk.C() ? 1 : 0));
        }
        com.tencent.mars.xlog.Log.e("Finder.DynamicIconResService", "fail to parseDynamicColorString: ".concat(colorString));
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zy2.k6 ij(java.util.Map r12, android.content.res.Resources r13) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ht2.y0.ij(java.util.Map, android.content.res.Resources):zy2.k6");
    }

    public android.text.SpannableString mj(java.lang.CharSequence richText, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(richText, "richText");
        com.tencent.mars.xlog.Log.i("Finder.DynamicIconResService", "parseRichText: richText=" + ((java.lang.Object) richText) + " textSize=" + i17);
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        boolean z18 = com.tencent.mm.ui.bk.C() || z17;
        int K = r26.n0.K(richText, '<', 0, false, 6, null);
        int K2 = r26.n0.K(richText, '>', 0, false, 6, null);
        if (K < 0 || K2 < 0 || K2 <= K) {
            return new android.text.SpannableString(richText);
        }
        java.util.Map nj6 = nj(this, richText, 0, 0, 6, null);
        if (nj6.isEmpty()) {
            return new android.text.SpannableString(richText);
        }
        java.lang.CharSequence b07 = r26.n0.b0(richText, K, K2 + 1, "$$");
        kotlin.jvm.internal.o.d(resources);
        al5.v aj6 = aj(nj6, resources, z18, i17, false, null);
        android.text.SpannableString spannableString = new android.text.SpannableString(b07);
        spannableString.setSpan(aj6, K, K + 2, 33);
        return spannableString;
    }

    public final void oj(android.view.ViewGroup viewGroup, r45.tl2 tl2Var, java.lang.String str, zy2.r6 r6Var) {
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(viewGroup.getContext());
        linearLayout.setTag("playLikeFloatPagView");
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(um3.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        pf5.e.launch$default((pf5.e) a17, null, null, new ht2.p0(tl2Var, this, linearLayout, str, viewGroup, c0Var, c0Var2, r6Var, null), 3, null);
    }

    public final void qj(android.widget.ImageView imageView, zy2.q6 q6Var) {
        r45.bm2 bm2Var = q6Var.f477544c;
        imageView.setVisibility(q6Var.f477543b > 0 ? 0 : 8);
        if (bm2Var != null) {
            java.lang.String string = bm2Var.getString(18);
            if (!(string == null || string.length() == 0)) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.e().c(new mn2.q3(bm2Var.getString(18), com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView, g1Var.h(mn2.f1.f329953d));
                imageView.setColorFilter(i65.a.d(imageView.getContext(), com.tencent.mm.R.color.f478553an), android.graphics.PorterDuff.Mode.SRC_ATOP);
                return;
            }
        }
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_little_like, imageView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an)));
        imageView.setEnabled(false);
    }

    public final void rj(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, zy2.r6 r6Var) {
        android.graphics.drawable.Drawable e17;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = r6Var.f477558i;
        com.tencent.mars.xlog.Log.i("Finder.DynamicIconResService", "[setIconInTimeLineFeedLikeDefault] ".concat(pm0.v.u(finderObject != null ? finderObject.getId() : 0L)));
        weImageView.setAlpha(1.0f);
        boolean C = com.tencent.mm.ui.bk.C();
        boolean z17 = r6Var.f477551b;
        int i17 = com.tencent.mm.R.raw.finder_outlined_like_private;
        boolean z18 = true;
        if (z17) {
            weImageView.setTag(1);
            android.content.res.Resources resources = weImageView.getContext().getResources();
            if (!r6Var.f477553d) {
                i17 = com.tencent.mm.R.raw.finder_full_like;
            }
            e17 = m95.a.e(resources, i17, 0.0f);
        } else {
            weImageView.setTag(0);
            android.content.res.Resources resources2 = weImageView.getContext().getResources();
            if (!r6Var.f477553d) {
                i17 = com.tencent.mm.R.raw.finder_full_like_outlined;
            }
            e17 = m95.a.e(resources2, i17, 0.0f);
        }
        r45.bm2 bm2Var = r6Var.f477557h;
        mn2.g1 g1Var = mn2.g1.f329975a;
        int i18 = com.tencent.mm.R.color.BW_0_Alpha_0_9;
        java.lang.String str = null;
        if (bm2Var == null || r6Var.f477555f || r6Var.f477556g || r6Var.f477553d) {
            weImageView.setLayerPaint(null);
            weImageView.setIconColor(0);
            r45.bm2 bm2Var2 = r6Var.f477557h;
            java.lang.String string = bm2Var2 != null ? bm2Var2.getString(14) : null;
            if (string != null && string.length() != 0) {
                z18 = false;
            }
            if (z18 || r6Var.f477553d || r6Var.f477555f) {
                if (!r6Var.f477551b || r6Var.f477553d) {
                    android.content.res.Resources resources3 = weImageView.getContext().getResources();
                    if (!r6Var.f477554e) {
                        i18 = com.tencent.mm.R.color.f479254u6;
                    }
                    weImageView.setIconColor(resources3.getColor(i18));
                } else {
                    weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.Red_100));
                }
                weImageView.setImageDrawable(e17);
            } else {
                yo0.i h17 = g1Var.h(mn2.f1.f329969w);
                h17.f464102g = com.tencent.mm.R.drawable.f481632c44;
                vo0.d e18 = g1Var.e();
                if (!r6Var.f477554e || C) {
                    r45.bm2 bm2Var3 = r6Var.f477557h;
                    if (bm2Var3 != null) {
                        str = bm2Var3.getString(14);
                    }
                } else {
                    r45.bm2 bm2Var4 = r6Var.f477557h;
                    if (bm2Var4 != null) {
                        str = bm2Var4.getString(13);
                    }
                }
                e18.b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), h17).c(weImageView);
            }
        } else {
            java.lang.String string2 = r6Var.f477551b ? (!r6Var.f477554e || C) ? bm2Var.getString(7) : bm2Var.getString(8) : (!r6Var.f477554e || C) ? bm2Var.getString(14) : bm2Var.getString(13);
            weImageView.setLayerPaint(null);
            weImageView.setIconColor(0);
            if (string2 != null && string2.length() != 0) {
                z18 = false;
            }
            if (z18) {
                if (r6Var.f477551b) {
                    weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.Red_100));
                } else {
                    android.content.res.Resources resources4 = weImageView.getContext().getResources();
                    if (!r6Var.f477554e) {
                        i18 = com.tencent.mm.R.color.f479254u6;
                    }
                    weImageView.setIconColor(resources4.getColor(i18));
                }
                weImageView.setImageDrawable(e17);
            } else {
                yo0.i h18 = g1Var.h(mn2.f1.f329969w);
                h18.f464102g = com.tencent.mm.R.drawable.f481632c44;
                g1Var.e().b(new mn2.q3(string2, com.tencent.mm.plugin.finder.storage.y90.f128355e), h18).c(weImageView);
            }
        }
        if (r6Var.f477550a || !r6Var.f477560k) {
            weImageView.setIconColor(i65.a.d(weImageView.getContext(), r6Var.f477554e ? com.tencent.mm.R.color.BW_0_Alpha_0_4 : com.tencent.mm.R.color.f478988mr));
        }
    }

    public void sj(android.widget.ImageView iv6, zy2.r6 iConfig, android.graphics.drawable.Drawable defaultIcon) {
        r45.dm2 object_extend;
        r45.vl2 vl2Var;
        r45.ql2 ql2Var;
        kotlin.jvm.internal.o.g(iv6, "iv");
        kotlin.jvm.internal.o.g(iConfig, "iConfig");
        kotlin.jvm.internal.o.g(defaultIcon, "defaultIcon");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = iConfig.f477558i;
        java.lang.String string = (finderObject == null || (object_extend = finderObject.getObject_extend()) == null || (vl2Var = (r45.vl2) object_extend.getCustom(27)) == null || (ql2Var = (r45.ql2) vl2Var.getCustom(0)) == null) ? null : ql2Var.getString(2);
        if (string == null || string.length() == 0) {
            iv6.setImageDrawable(defaultIcon);
        } else {
            kotlin.jvm.internal.o.d(string);
            fj(string, true, new ht2.w0(iv6, defaultIcon));
        }
    }

    public void tj(com.tencent.mm.view.MMPAGView pagView, zy2.r6 iConfig) {
        kotlin.jvm.internal.o.g(pagView, "pagView");
        kotlin.jvm.internal.o.g(iConfig, "iConfig");
        cq.k1.a();
        pagView.o(((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Z0().r()).booleanValue());
        java.lang.String str = iConfig.f477552c == 1 ? "finder_heart_like_hot.pag" : "finder_heart_like.pag";
        if (pagView.getUseRfx()) {
            pagView.setComposition(com.tencent.mm.rfx.RfxPagFile.Load(pagView.getContext().getAssets(), str));
        } else {
            pagView.setComposition(org.libpag.PAGFile.Load(pagView.getContext().getAssets(), str));
        }
    }

    public final void uj(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, zy2.n6 n6Var) {
        if (n6Var.f477483c) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_eyes_on);
        } else {
            r45.bm2 bm2Var = n6Var.f477482b;
            if (bm2Var != null) {
                java.lang.String string = bm2Var.getString(10);
                if (!(string == null || string.length() == 0)) {
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    vo0.d e17 = g1Var.e();
                    mn2.q3 q3Var = new mn2.q3(bm2Var.getString(10), com.tencent.mm.plugin.finder.storage.y90.f128355e);
                    kotlin.jvm.internal.o.e(weImageView, "null cannot be cast to non-null type android.widget.ImageView");
                    e17.c(q3Var, weImageView, g1Var.h(mn2.f1.B));
                }
            }
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_channels_like_bold);
        }
        weImageView.setLayerPaint(null);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
    }

    public final com.tencent.mm.protocal.protobuf.FinderObject vj(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        r45.zz3 zz3Var;
        r45.zz3 zz3Var2;
        r45.zz3 zz3Var3;
        r45.vl2 vl2Var;
        r45.ul2 ul2Var;
        org.json.JSONObject json;
        r45.vl2 vl2Var2;
        r45.wl2 wl2Var;
        org.json.JSONObject json2;
        r45.vl2 vl2Var3;
        r45.ql2 ql2Var;
        org.json.JSONObject json3;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        java.lang.String str = null;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Nd).getValue()).r()).intValue() == 1) {
            finderObject.setObject_extend(null);
        }
        java.lang.String u17 = pm0.v.u(finderObject.getId());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedId=");
        sb6.append(u17);
        sb6.append(" icon=");
        r45.dm2 object_extend = finderObject.getObject_extend();
        sb6.append((object_extend == null || (vl2Var3 = (r45.vl2) object_extend.getCustom(27)) == null || (ql2Var = (r45.ql2) vl2Var3.getCustom(0)) == null || (json3 = ql2Var.toJSON()) == null) ? null : ht2.z0.a(json3));
        sb6.append("\nwording=");
        r45.dm2 object_extend2 = finderObject.getObject_extend();
        sb6.append((object_extend2 == null || (vl2Var2 = (r45.vl2) object_extend2.getCustom(27)) == null || (wl2Var = (r45.wl2) vl2Var2.getCustom(1)) == null || (json2 = wl2Var.toJSON()) == null) ? null : ht2.z0.a(json2));
        sb6.append("\npag=");
        r45.dm2 object_extend3 = finderObject.getObject_extend();
        sb6.append((object_extend3 == null || (vl2Var = (r45.vl2) object_extend3.getCustom(27)) == null || (ul2Var = (r45.ul2) vl2Var.getCustom(2)) == null || (json = ul2Var.toJSON()) == null) ? null : ht2.z0.a(json));
        sb6.append("\ncarouselWording=");
        r45.dm2 object_extend4 = finderObject.getObject_extend();
        sb6.append((object_extend4 == null || (zz3Var3 = (r45.zz3) object_extend4.getCustom(41)) == null) ? null : zz3Var3.getString(4));
        sb6.append("\ntoastWording=");
        r45.dm2 object_extend5 = finderObject.getObject_extend();
        sb6.append((object_extend5 == null || (zz3Var2 = (r45.zz3) object_extend5.getCustom(41)) == null) ? null : zz3Var2.getString(0));
        sb6.append("\neducationWording=");
        r45.dm2 object_extend6 = finderObject.getObject_extend();
        if (object_extend6 != null && (zz3Var = (r45.zz3) object_extend6.getCustom(41)) != null) {
            str = zz3Var.getString(2);
        }
        sb6.append(str);
        sb6.append('\n');
        com.tencent.mars.xlog.Log.i("Finder.DynamicIconResService", sb6.toString());
        return finderObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wi(android.view.ViewGroup r17, android.view.View r18, android.view.View r19, zy2.r6 r20, yz5.l r21) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ht2.y0.wi(android.view.ViewGroup, android.view.View, android.view.View, zy2.r6, yz5.l):void");
    }
}
