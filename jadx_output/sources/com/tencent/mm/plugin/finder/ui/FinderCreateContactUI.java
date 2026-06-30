package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderCreateContactUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/modelbase/u0;", "Lal5/e0;", "Lkv/e0;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClickEditSex", "onTipsCheckBoxClick", "onClickEditDistrict", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/a3", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderCreateContactUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements com.tencent.mm.modelbase.u0, al5.e0, kv.e0 {
    public static java.lang.String I1 = "";
    public static java.lang.String J1 = "";
    public static java.lang.String K1 = "";
    public static java.lang.String L1 = "";
    public static int M1 = 0;
    public static int N1 = 0;
    public static int O1 = 0;
    public static java.lang.String P1 = "";
    public static java.lang.String Q1 = "";
    public static java.lang.String R1 = "";
    public static boolean S1 = true;
    public static java.lang.String T1 = "";
    public android.view.View A;
    public android.view.View B;
    public android.view.View C;
    public boolean C1;
    public android.view.View D;
    public boolean D1;
    public android.view.View E;
    public java.lang.String F;
    public android.widget.Button G;
    public int G1;
    public android.view.View H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f128539J;
    public com.tencent.mm.ui.widget.InputPanelFrameLayout K;
    public android.view.View L;
    public android.widget.TextView M;
    public android.widget.TextView N;
    public android.view.View P;
    public android.view.View Q;
    public android.view.View R;
    public android.widget.CheckBox S;
    public android.widget.TextView T;
    public android.app.ProgressDialog U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public long Z;

    /* renamed from: p0, reason: collision with root package name */
    public r45.lk2 f128541p0;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f128543t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f128544u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f128545v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.EditText f128546w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f128547x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f128550y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f128553z;
    public static final com.tencent.mm.plugin.finder.ui.a3 H1 = new com.tencent.mm.plugin.finder.ui.a3(null);
    public static final java.util.HashMap U1 = new java.util.HashMap();

    /* renamed from: x0, reason: collision with root package name */
    public int f128548x0 = 20;

    /* renamed from: y0, reason: collision with root package name */
    public final int f128551y0 = 400;

    /* renamed from: l1, reason: collision with root package name */
    public final boolean f128540l1 = true;

    /* renamed from: p1, reason: collision with root package name */
    public final jz5.g f128542p1 = jz5.h.b(new com.tencent.mm.plugin.finder.ui.e4(this));

    /* renamed from: x1, reason: collision with root package name */
    public final jz5.g f128549x1 = jz5.h.b(new com.tencent.mm.plugin.finder.ui.b3(this));

    /* renamed from: y1, reason: collision with root package name */
    public final jz5.g f128552y1 = jz5.h.b(new com.tencent.mm.plugin.finder.ui.c4(this));

    /* renamed from: z1, reason: collision with root package name */
    public final jz5.g f128554z1 = jz5.h.b(new com.tencent.mm.plugin.finder.ui.h4(this));
    public final jz5.g A1 = jz5.h.b(new com.tencent.mm.plugin.finder.ui.i4(this));
    public boolean B1 = true;
    public java.lang.String E1 = "";
    public java.lang.String F1 = "";

    public static final void c7(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI, int i17) {
        finderCreateContactUI.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("CreateScene", finderCreateContactUI.V);
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(finderCreateContactUI).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "create_account", i17, jSONObject, false, null, 48, null);
    }

    public static /* synthetic */ void m7(com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str2 = null;
        }
        if ((i17 & 4) != 0) {
            str3 = null;
        }
        finderCreateContactUI.l7(str, str2, str3);
    }

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        android.view.View view = this.f128543t;
        if (view != null) {
            view.post(new com.tencent.mm.plugin.finder.ui.y3(z17, this, i17));
        } else {
            kotlin.jvm.internal.o.o("scrollContainer");
            throw null;
        }
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        if (kotlin.jvm.internal.o.b(str, c01.z1.r())) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "[notifyChanged] user:" + str + ",avatarPath:" + this.F);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            java.lang.String j17 = com.tencent.mm.modelavatar.d1.Ai().j(c01.z1.r(), false);
            int k17 = (int) com.tencent.mm.vfs.w6.k(j17);
            java.lang.String str2 = this.F;
            if (!(str2 == null || str2.length() == 0) || k17 <= 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "[notifyChanged] filesize:" + k17);
            this.F = j17;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC;
    }

    public final void d7() {
        android.widget.TextView textView = this.M;
        if (textView == null) {
            kotlin.jvm.internal.o.o("topErrorTip");
            throw null;
        }
        textView.setText("");
        android.widget.TextView textView2 = this.M;
        if (textView2 != null) {
            textView2.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("topErrorTip");
            throw null;
        }
    }

    public final void e7(android.widget.EditText editText, android.widget.TextView textView, android.view.View view, java.lang.String str, int i17, yz5.l lVar) {
        editText.setText(str);
        editText.addTextChangedListener(new com.tencent.mm.plugin.finder.ui.u3(this, i17, editText, lVar, textView));
        editText.setOnEditorActionListener(new com.tencent.mm.plugin.finder.ui.q3(editText));
        view.setOnClickListener(new com.tencent.mm.plugin.finder.ui.r3(editText));
        editText.setOnFocusChangeListener(new com.tencent.mm.plugin.finder.ui.s3(view));
    }

    public final boolean f7() {
        if (P1.length() == 0) {
            if (Q1.length() == 0) {
                if (R1.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void g7(java.lang.String str) {
        r45.hz0 hz0Var = new r45.hz0();
        r45.hz0 hz0Var2 = new r45.hz0();
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        java.lang.String str2 = K1;
        if (kotlin.jvm.internal.o.b(str2, "female")) {
            f0Var.f310116d = 0;
            hz0Var.set(3, 2);
        } else if (kotlin.jvm.internal.o.b(str2, "male")) {
            f0Var.f310116d = 0;
            hz0Var.set(3, 1);
        } else {
            f0Var.f310116d = 1;
            hz0Var.set(3, 0);
        }
        if (kotlin.jvm.internal.o.b(P1, "unshow")) {
            f0Var2.f310116d = 1;
        } else {
            f0Var2.f310116d = 0;
            hz0Var.set(0, P1);
            hz0Var.set(1, Q1);
            hz0Var.set(2, R1);
        }
        kotlinx.coroutines.l.d(getLifecycleAsyncScope(), null, null, new com.tencent.mm.plugin.finder.ui.b4(this, str, hz0Var, hz0Var2, f0Var, f0Var2, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.afv;
    }

    public final void h7() {
        int integer = g92.b.f269769e.k2().e().getInteger(4);
        r45.lk2 lk2Var = this.f128541p0;
        if (lk2Var != null) {
            integer = lk2Var.getInteger(6);
        }
        this.f128548x0 = integer > 0 ? integer : 20;
        com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "nicknameMaxLength ： " + integer + ", " + this.f128548x0 + ", prepareResp:" + this.f128541p0);
    }

    public final void i7(int i17) {
        com.tencent.mm.autogen.events.FinderCreateAccountResultEvent finderCreateAccountResultEvent = new com.tencent.mm.autogen.events.FinderCreateAccountResultEvent();
        finderCreateAccountResultEvent.f54268g.f8448a = i17;
        finderCreateAccountResultEvent.e();
    }

    public final void j7(java.lang.String str) {
        android.graphics.Bitmap T;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (T = com.tencent.mm.sdk.platformtools.x.T(str, 256, 256, false)) == null) {
            return;
        }
        android.widget.ImageView imageView = this.f128544u;
        if (imageView != null) {
            imageView.setImageBitmap(T);
        } else {
            kotlin.jvm.internal.o.o("avatarView");
            throw null;
        }
    }

    public final void k7(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String l17 = com.tencent.mm.storage.ha.k().l(str);
        java.lang.String m17 = com.tencent.mm.storage.ha.k().m(str, str2);
        java.lang.String f17 = com.tencent.mm.storage.ha.k().f(str, str2, str3);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            android.widget.TextView textView = this.f128550y;
            if (textView == null) {
                kotlin.jvm.internal.o.o("districtTV");
                throw null;
            }
            textView.setText(((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Di(m17) + ' ' + f17);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(m17)) {
            android.widget.TextView textView2 = this.f128550y;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("districtTV");
                throw null;
            }
            textView2.setText(l17 + ' ' + m17);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            android.widget.TextView textView3 = this.f128550y;
            if (textView3 != null) {
                textView3.setText(l17);
                return;
            } else {
                kotlin.jvm.internal.o.o("districtTV");
                throw null;
            }
        }
        if (kotlin.jvm.internal.o.b(str, "unshow")) {
            android.widget.TextView textView4 = this.f128550y;
            if (textView4 != null) {
                textView4.setText(getString(com.tencent.mm.R.string.f4f));
            } else {
                kotlin.jvm.internal.o.o("districtTV");
                throw null;
            }
        }
    }

    public final void l7(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "showError " + str);
        java.util.regex.Matcher matcher = zy2.v.f477590a.matcher(str);
        if (matcher.find()) {
            java.lang.String group = matcher.group(1);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (matcher.start(0) > 0) {
                java.lang.String substring = str.substring(0, matcher.start(0));
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                sb6.append(substring);
            }
            sb6.append(group);
            if (matcher.end(0) < str.length()) {
                java.lang.String substring2 = str.substring(matcher.end(0), str.length());
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                sb6.append(substring2);
            }
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            int start = matcher.start(0);
            int length = group.length() + start;
            android.text.SpannableString spannableString = new android.text.SpannableString(sb7);
            spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(group, getContext().getResources().getColor(com.tencent.mm.R.color.f478524a5), getContext().getResources().getColor(com.tencent.mm.R.color.Link_Alpha_0_6), false, false, new com.tencent.mm.plugin.finder.ui.d4(str2, str3, this), 16, null), start, length, 17);
            android.widget.TextView textView = this.M;
            if (textView == null) {
                kotlin.jvm.internal.o.o("topErrorTip");
                throw null;
            }
            textView.setText(spannableString);
            android.widget.TextView textView2 = this.M;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("topErrorTip");
                throw null;
            }
            textView2.setOnTouchListener(new com.tencent.mm.plugin.finder.assist.c8(spannableString, textView2));
        } else {
            android.widget.TextView textView3 = this.M;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("topErrorTip");
                throw null;
            }
            textView3.setText(str);
        }
        android.widget.TextView textView4 = this.M;
        if (textView4 != null) {
            textView4.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("topErrorTip");
            throw null;
        }
    }

    public final void n7(boolean z17) {
        jz5.f0 f0Var = null;
        if (z17) {
            r45.ae3 ae3Var = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).f257411e;
            if (ae3Var != null) {
                java.lang.String Country = ae3Var.f369966d;
                kotlin.jvm.internal.o.f(Country, "Country");
                P1 = Country;
                java.lang.String Province = ae3Var.f369967e;
                kotlin.jvm.internal.o.f(Province, "Province");
                Q1 = Province;
                java.lang.String City = ae3Var.f369968f;
                kotlin.jvm.internal.o.f(City, "City");
                R1 = City;
                kotlin.jvm.internal.o.f(ae3Var.f369966d, "Country");
                kotlin.jvm.internal.o.f(ae3Var.f369967e, "Province");
                kotlin.jvm.internal.o.f(ae3Var.f369968f, "City");
                android.view.View view = this.f128553z;
                if (view == null) {
                    kotlin.jvm.internal.o.o("locationIcon");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.A;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("locationArrowIcon");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = this.B;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("locationInfoIcon");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.B;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("locationInfoIcon");
                    throw null;
                }
                view4.setOnClickListener(new com.tencent.mm.plugin.finder.ui.f4(this));
                N1 = 1;
                k7(P1, Q1, R1);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                P1 = "";
                Q1 = "";
                R1 = "";
                N1 = 3;
            }
        } else {
            android.view.View view5 = this.f128553z;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("locationIcon");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "updateDistrict", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            k7(P1, Q1, R1);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "updateDistrict " + P1 + ' ' + Q1 + ' ' + R1);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o7() {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.o7():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        switch (i17) {
            case 1000:
                if (intent != null && i18 == -1) {
                    setIntent(new android.content.Intent());
                    getIntent().putExtra("key_source_img_path", com.tencent.mm.ui.tools.i1.b(getContext(), intent, g83.a.a()));
                    com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                    android.content.Intent intent2 = getIntent();
                    i0Var.getClass();
                    ((w40.e) i95.n0.c(w40.e.class)).getClass();
                    qs2.v.f366327a.b(this, intent2, 1001);
                    break;
                }
                break;
            case 1001:
                if (intent != null && i18 == -1) {
                    java.lang.String stringExtra = intent.getStringExtra("key_result_img_path");
                    this.F = stringExtra;
                    if (stringExtra != null) {
                        I1 = stringExtra;
                    }
                    com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "avatar file length %d KB", java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(stringExtra) / 1024));
                    O1 = 2;
                    j7(this.F);
                    break;
                }
                break;
            case 1002:
                if (intent != null && i18 == -1) {
                    java.lang.String stringExtra2 = intent.getStringExtra("key_output_sex");
                    K1 = stringExtra2 != null ? stringExtra2 : "";
                    o7();
                    M1 = 2;
                    break;
                }
                break;
            case 1003:
                if (intent != null && i18 == -1) {
                    java.lang.String stringExtra3 = intent.getStringExtra("Country");
                    if (stringExtra3 == null) {
                        stringExtra3 = "";
                    }
                    P1 = stringExtra3;
                    java.lang.String stringExtra4 = intent.getStringExtra("Contact_Province");
                    if (stringExtra4 == null) {
                        stringExtra4 = "";
                    }
                    Q1 = stringExtra4;
                    java.lang.String stringExtra5 = intent.getStringExtra("Contact_City");
                    R1 = stringExtra5 != null ? stringExtra5 : "";
                    n7(false);
                    N1 = 2;
                    break;
                }
                break;
        }
        d7();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(2);
        i7(2);
        super.onBackPressed();
        com.tencent.mm.plugin.finder.report.p2.f125237a.C(5, null);
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        int i17 = O1;
        int i18 = N1;
        int i19 = M1;
        int i27 = this.V;
        boolean z17 = S1;
        java.lang.String str = T1;
        android.widget.EditText editText = this.f128546w;
        if (editText == null) {
            kotlin.jvm.internal.o.o("nickEdt");
            throw null;
        }
        boolean z18 = !kotlin.jvm.internal.o.b(str, editText.getText().toString());
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        o3Var.mj(0, 0, i17, false, i18, i19, i27, z17, z18, nyVar != null ? nyVar.V6() : null);
    }

    public final void onClickEditDistrict(android.view.View view) {
        android.widget.EditText editText = this.f128546w;
        if (editText == null) {
            kotlin.jvm.internal.o.o("nickEdt");
            throw null;
        }
        editText.clearFocus();
        hideVKB();
        J2(false, 0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("GetAddress", true);
        intent.putExtra("ShowSelectedLocation", true);
        intent.putExtra("SetSelectLocation", true);
        intent.putExtra("SelectedCountryCode", P1);
        intent.putExtra("SelectedProvinceCode", Q1);
        intent.putExtra("SelectedCityCode", R1);
        intent.putExtra("NeedUnshowItem", true);
        j45.l.v(getContext(), ".ui.tools.MultiStageCitySelectUI", intent, 1003);
    }

    public final void onClickEditSex(android.view.View view) {
        android.widget.EditText editText = this.f128546w;
        if (editText == null) {
            kotlin.jvm.internal.o.o("nickEdt");
            throw null;
        }
        editText.clearFocus();
        hideVKB();
        J2(false, 0);
        if (this.f128540l1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_input_sex", K1);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).getClass();
            intent.setClass(this, com.tencent.mm.plugin.finder.ui.FinderSelectSexUI.class);
            startActivityForResult(intent, 1002);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        java.lang.String f27;
        super.onCreate(bundle);
        this.C1 = getIntent().getBooleanExtra("KEY_OTHER_USER", false);
        this.D1 = getIntent().getBooleanExtra("KEY_CREATE_CLUB_USER", false);
        this.V = getIntent().getIntExtra("key_create_scene", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_WX_USERNAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.E1 = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_CREATE_SOURCE_ID");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.F1 = stringExtra2;
        this.Y = getIntent().getIntExtra("KEY_CREATE_SCENE_USER_TYPE", 0);
        this.Z = getIntent().getLongExtra("KEY_CREATE_SCENE_FEED_ID", 0L);
        this.G1 = getIntent().getIntExtra("KEY_POST_ENTERSCENE", 0);
        com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "[onCreate] createSceneUserType:" + this.Y + " createScene:" + this.V + " sourceId:" + this.F1 + " postEnterScene:" + this.G1);
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.aaw));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mc9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f128543t = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.e_f);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f128544u = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ebg);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f128545v = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.fuu);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f128546w = (android.widget.EditText) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.g2b);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f128547x = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f484462ec4);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f128550y = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.d0s);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.E = findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.in7);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f128553z = findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.a4s);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.A = findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.hcn);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.B = findViewById10;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.mqb);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.C = findViewById11;
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.mqc);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.D = findViewById12;
        android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.eaz);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.G = (android.widget.Button) findViewById13;
        android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.hdq);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.K = (com.tencent.mm.ui.widget.InputPanelFrameLayout) findViewById14;
        android.view.View findViewById15 = findViewById(com.tencent.mm.R.id.f484524ei1);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.L = findViewById15;
        android.view.View findViewById16 = findViewById(com.tencent.mm.R.id.d9h);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.H = findViewById16;
        android.view.View findViewById17 = findViewById(com.tencent.mm.R.id.d9g);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.I = findViewById17;
        android.view.View findViewById18 = findViewById(com.tencent.mm.R.id.d9d);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.f128539J = findViewById18;
        android.view.View findViewById19 = findViewById(com.tencent.mm.R.id.ofn);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        this.M = (android.widget.TextView) findViewById19;
        android.view.View findViewById20 = findViewById(com.tencent.mm.R.id.fuw);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        this.N = (android.widget.TextView) findViewById20;
        android.view.View findViewById21 = findViewById(com.tencent.mm.R.id.bxz);
        kotlin.jvm.internal.o.f(findViewById21, "findViewById(...)");
        this.P = findViewById21;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById21, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById21.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById21, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById22 = findViewById(com.tencent.mm.R.id.oa8);
        kotlin.jvm.internal.o.f(findViewById22, "findViewById(...)");
        this.Q = findViewById22;
        android.view.View findViewById23 = findViewById(com.tencent.mm.R.id.g4a);
        kotlin.jvm.internal.o.f(findViewById23, "findViewById(...)");
        this.R = findViewById23;
        android.view.View findViewById24 = findViewById(com.tencent.mm.R.id.oa7);
        kotlin.jvm.internal.o.f(findViewById24, "findViewById(...)");
        this.S = (android.widget.CheckBox) findViewById24;
        android.view.View findViewById25 = findViewById(com.tencent.mm.R.id.ob7);
        kotlin.jvm.internal.o.f(findViewById25, "findViewById(...)");
        this.T = (android.widget.TextView) findViewById25;
        android.widget.TextView textView = this.f128545v;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.V0).getValue()).r()).intValue();
        jz5.g gVar = this.f128554z1;
        if (intValue != 1 || this.C1) {
            ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setVisibility(8);
        } else {
            ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setVisibility(0);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WXPROFILE_ENTRY_EDU_INT_SYNC, 1);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WXPROFILE_ENTRY_EDU2_INT_SYNC, 1);
            com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "showWxProfileTips set USERINFO_FINDER_WXPROFILE_ENTRY_EDU_INT_SYNC 1");
        }
        if (this.D1) {
            android.view.View findViewById26 = findViewById(com.tencent.mm.R.id.ay_);
            if (findViewById26 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById26, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "initClub", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById26.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById26, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "initClub", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((android.widget.LinearLayout) ((jz5.n) this.f128552y1).getValue()).setVisibility(8);
            android.view.View view = this.E;
            if (view == null) {
                kotlin.jvm.internal.o.o("districtLayout");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "initClub", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderCreateContactUI", "initClub", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.LinearLayout) ((jz5.n) gVar).getValue()).setVisibility(8);
            java.lang.String roomId = this.F1;
            kotlin.jvm.internal.o.g(roomId, "roomId");
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(roomId, true);
            java.lang.String f28 = n17.f2();
            kotlin.jvm.internal.o.f(f28, "getDisplayNick(...)");
            if (r26.i0.n(f28, "@chatroom", false)) {
                f27 = "";
            } else {
                f27 = n17.f2();
                kotlin.jvm.internal.o.d(f27);
            }
            J1 = f27;
            android.widget.EditText editText = (android.widget.EditText) findViewById(com.tencent.mm.R.id.e_t);
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.e_r);
            android.view.View findViewById27 = findViewById(com.tencent.mm.R.id.ay8);
            kotlin.jvm.internal.o.d(editText);
            kotlin.jvm.internal.o.d(textView2);
            kotlin.jvm.internal.o.d(findViewById27);
            e7(editText, textView2, findViewById27, L1, 2, com.tencent.mm.plugin.finder.ui.l3.f129453d);
        }
        if (this.V == 16) {
            android.widget.Button button = this.G;
            if (button == null) {
                kotlin.jvm.internal.o.o("createBtn");
                throw null;
            }
            button.setText(getResources().getText(com.tencent.mm.R.string.crp));
        }
        android.widget.Button button2 = this.G;
        if (button2 == null) {
            kotlin.jvm.internal.o.o("createBtn");
            throw null;
        }
        ym5.a1.h(button2, new com.tencent.mm.plugin.finder.ui.n3(this));
        android.widget.Button button3 = this.G;
        if (button3 == null) {
            kotlin.jvm.internal.o.o("createBtn");
            throw null;
        }
        button3.setOnClickListener(new com.tencent.mm.plugin.finder.ui.p3(this));
        android.widget.EditText editText2 = this.f128546w;
        if (editText2 == null) {
            kotlin.jvm.internal.o.o("nickEdt");
            throw null;
        }
        android.widget.TextView textView3 = this.N;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("editNickNameLimit");
            throw null;
        }
        android.view.View view2 = this.P;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("clearNameBtn");
            throw null;
        }
        e7(editText2, textView3, view2, J1, 1, com.tencent.mm.plugin.finder.ui.v3.f129940d);
        setBackBtn(new com.tencent.mm.plugin.finder.ui.k3(this));
        com.tencent.mm.ui.widget.InputPanelFrameLayout inputPanelFrameLayout = this.K;
        if (inputPanelFrameLayout == null) {
            kotlin.jvm.internal.o.o("inputPanel");
            throw null;
        }
        inputPanelFrameLayout.setExternalListener(this);
        android.view.View view3 = this.f128543t;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("scrollContainer");
            throw null;
        }
        view3.post(new com.tencent.mm.plugin.finder.ui.m3(this));
        ((android.widget.LinearLayout) ((jz5.n) this.f128549x1).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.ui.j3(this));
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.z Ai = com.tencent.mm.modelavatar.d1.Ai();
        java.lang.String j17 = Ai.j(c01.z1.r(), false);
        if (!(I1.length() == 0) || this.D1) {
            java.lang.String str = I1;
            this.F = str;
            j7(str);
        } else {
            kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
            android.widget.ImageView imageView = this.f128544u;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("avatarView");
                throw null;
            }
            ((com.tencent.mm.feature.avatar.w) zVar).Ai(imageView, c01.z1.r(), null);
            this.F = j17;
            if (((int) com.tencent.mm.vfs.w6.k(j17)) == 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "WX avatar file size is zero");
                Ai.d(this);
                this.F = "";
            }
        }
        if (kotlin.jvm.internal.o.b(this.F, j17)) {
            i17 = 1;
        } else {
            java.lang.String str2 = this.F;
            i17 = str2 == null || str2.length() == 0 ? 3 : 2;
        }
        O1 = i17;
        if (K1.length() == 0) {
            int q17 = gm0.j1.u().c().q(12290, 0);
            if (q17 == 0) {
                K1 = "";
                M1 = 3;
            } else if (q17 == 1) {
                K1 = "male";
                M1 = 1;
            } else if (q17 == 2) {
                K1 = "female";
                M1 = 1;
            }
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "lastSelectSex = ".concat(K1));
        }
        jz5.g gVar2 = this.A1;
        ((com.tencent.mm.ui.widget.MMSwitchBtn) ((jz5.n) gVar2).getValue()).setCheck(S1);
        ((com.tencent.mm.ui.widget.MMSwitchBtn) ((jz5.n) gVar2).getValue()).setSwitchListener(com.tencent.mm.plugin.finder.ui.w3.f129973a);
        com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "lastWxProfileChecked = " + S1);
        com.tencent.mm.plugin.finder.assist.d8 d8Var = com.tencent.mm.plugin.finder.assist.d8.f102092a;
        android.widget.TextView textView4 = this.T;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("tipsWarningTV");
            throw null;
        }
        d8Var.e(this, textView4, "Finder.FinderCreateContactUI");
        o7();
        com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "isLastSelectDistrictEmpty = " + f7());
        n7(f7());
        gm0.j1.d().a(7289, this);
        this.W = getIntent().getIntExtra("key_mv_status", 0);
        this.B1 = getIntent().getBooleanExtra("key_router_to_profile", true);
        getIntent().getIntExtra("KEY_GO_TO_AFTER_CREATE_SUCCESS", 0);
        if (getIntent().hasExtra("key_prepare_resp")) {
            this.f128541p0 = new r45.lk2();
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_prepare_resp");
            if (byteArrayExtra != null) {
                try {
                    r45.lk2 lk2Var = this.f128541p0;
                    if (lk2Var != null) {
                        lk2Var.parseFrom(byteArrayExtra);
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        }
        h7();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1279L, 30L, 1L);
        com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Y0).getValue()).r()).intValue() == 1) {
            pq5.g l17 = new db2.v2(0).l();
            l17.f(this);
            l17.K(new com.tencent.mm.plugin.finder.ui.x3(this));
        }
        int i18 = this.W;
        if (i18 == 1) {
            android.widget.TextView textView5 = this.f128545v;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("titleTv");
                throw null;
            }
            textView5.setText(getResources().getText(com.tencent.mm.R.string.crz));
            android.widget.Button button4 = this.G;
            if (button4 == null) {
                kotlin.jvm.internal.o.o("createBtn");
                throw null;
            }
            button4.setText(getResources().getText(com.tencent.mm.R.string.crq));
        } else if (i18 == 2) {
            android.widget.TextView textView6 = this.f128545v;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("titleTv");
                throw null;
            }
            textView6.setText(getResources().getText(com.tencent.mm.R.string.crz));
            android.widget.Button button5 = this.G;
            if (button5 == null) {
                kotlin.jvm.internal.o.o("createBtn");
                throw null;
            }
            button5.setText(getResources().getText(com.tencent.mm.R.string.crp));
        }
        int intExtra = getIntent().getIntExtra("KEY_ENTRANCE_TYPE", 0);
        long longExtra = getIntent().getLongExtra("KEY_ENTRANCE_ID", 0L);
        if (intExtra > 0) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.qd((zy2.zb) c17, 19, intExtra, longExtra, null, 8, null);
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(this).c(zy2.ra.class))).V6();
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderCreateContactUI);
        aVar.Rj(this, iy1.a.Finder);
        aVar.Tj(this, 12, 1, false);
        aVar.gk(this, kz5.c1.k(new jz5.l("ref_commentscene", java.lang.Integer.valueOf(V6.getInteger(7))), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("behaviour_session_id", V6.getString(0)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("enter_scene", java.lang.Integer.valueOf(this.G1))));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(7289, this);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().q(this);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f128541p0 == null) {
            kotlinx.coroutines.l.d(getLifecycleAsyncScope(), null, null, new com.tencent.mm.plugin.finder.ui.z3(null), 3, null);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("Finder.FinderCreateContactUI", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        boolean z17 = false;
        if (m1Var != null && m1Var.getType() == 7289) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.network.v0 reqResp = m1Var.getReqResp();
            com.tencent.mm.modelbase.o oVar = reqResp instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) reqResp : null;
            java.lang.Object obj = oVar != null ? oVar.f70711b.f70700a : null;
            this.f128541p0 = obj instanceof r45.lk2 ? (r45.lk2) obj : null;
            h7();
        }
    }

    public final void onTipsCheckBoxClick(android.view.View view) {
        android.widget.CheckBox checkBox = this.S;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("tipsCheckCB");
            throw null;
        }
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("tipsCheckCB");
            throw null;
        }
        checkBox.setChecked(!checkBox.isChecked());
        android.view.View view2 = this.R;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("tipsCBLayout");
            throw null;
        }
        android.widget.CheckBox checkBox2 = this.S;
        if (checkBox2 != null) {
            view2.setContentDescription(checkBox2.isChecked() ? getContext().getString(com.tencent.mm.R.string.d_) : getContext().getString(com.tencent.mm.R.string.f489843db));
        } else {
            kotlin.jvm.internal.o.o("tipsCheckCB");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(d92.k.class);
    }
}
