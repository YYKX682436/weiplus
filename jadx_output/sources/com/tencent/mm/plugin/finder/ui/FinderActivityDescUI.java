package com.tencent.mm.plugin.finder.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderActivityDescUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/f", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderActivityDescUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements com.tencent.mm.modelbase.u0 {

    /* renamed from: x1, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.ui.f f128488x1 = new com.tencent.mm.plugin.finder.ui.f(null);
    public android.widget.TextView A;
    public android.widget.TextView B;
    public com.tencent.mm.ui.widget.imageview.WeImageView C;
    public int E;
    public long F;

    /* renamed from: J, reason: collision with root package name */
    public int f128489J;
    public r45.e21 L;
    public android.widget.TextView M;
    public com.tencent.mm.ui.widget.imageview.WeImageView N;
    public android.widget.ImageView P;
    public long Q;
    public android.widget.TextView R;
    public android.widget.TextView S;
    public android.widget.ImageView T;
    public android.widget.TextView U;
    public android.view.ViewGroup V;
    public android.widget.ImageView W;
    public android.widget.LinearLayout X;
    public r45.h21 Y;
    public android.view.View Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.TextView f128490l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.LinearLayout f128491p0;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f128493t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f128494u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f128495v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f128496w;

    /* renamed from: x, reason: collision with root package name */
    public y9.i f128497x;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.ImageView f128498x0;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f128499y;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.View f128500y0;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f128501z;
    public final int D = 100;
    public java.lang.String G = "";
    public java.lang.String H = "";
    public java.lang.String I = "";
    public java.lang.String K = "";

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f128492p1 = "";

    public static final java.lang.String c7(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI) {
        java.lang.String str;
        r45.h21 h21Var = finderActivityDescUI.Y;
        if (h21Var != null) {
            str = h21Var.getString(9);
            if (str == null) {
                str = "";
            }
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        java.lang.String string = finderActivityDescUI.getResources().getString(com.tencent.mm.R.string.cip);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public static final void d7(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI, java.lang.String str) {
        finderActivityDescUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", str);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        androidx.appcompat.app.AppCompatActivity context = finderActivityDescUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, 0L, null, 0, 1, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        androidx.appcompat.app.AppCompatActivity context2 = finderActivityDescUI.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        i0Var.mk(context2, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e7(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI r31) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderActivityDescUI.e7(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI):void");
    }

    public final void f7(r45.e21 e21Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        int jumpinfo_type = finderJumpInfo.getJumpinfo_type();
        if (jumpinfo_type != 1) {
            if (jumpinfo_type != 2) {
                return;
            }
            xc2.y2 y2Var = xc2.y2.f453343a;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            y2Var.I(context, new xc2.p0(finderJumpInfo), null);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (e21Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1)) == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(':');
        sb6.append(com.tencent.mm.sdk.platformtools.t8.s0());
        java.lang.String sb7 = sb6.toString();
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        p0Var.f453250l = sb7;
        xc2.y2 y2Var2 = xc2.y2.f453343a;
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        xc2.y2.P(y2Var2, context2, p0Var, com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX, false, null, 0.0f, 56, null);
    }

    public final void g7() {
        jz5.f0 f0Var;
        java.lang.String string;
        java.lang.String sb6;
        r45.d21 d21Var;
        java.lang.String string2;
        r45.d21 d21Var2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.e21 e21Var = this.L;
        if (e21Var == null || (d21Var2 = (r45.d21) e21Var.getCustom(20)) == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) d21Var2.getCustom(0)) == null) {
            f0Var = null;
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderActivityDescUI", "descriptionContactInfo not null");
            android.widget.LinearLayout linearLayout = this.f128491p0;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            android.widget.ImageView imageView = this.f128498x0;
            if (imageView != null) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.a().c(new mn2.n(finderContact.getHeadUrl(), null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
                imageView.setOnClickListener(new com.tencent.mm.plugin.finder.ui.q(this, finderContact));
            }
            android.widget.TextView textView = this.f128490l1;
            if (textView != null) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity context = getContext();
                java.lang.String nickname = finderContact.getNickname();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, nickname));
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderActivityDescUI", "descriptionContactInfo null");
            android.widget.LinearLayout linearLayout2 = this.f128491p0;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
        android.widget.TextView textView2 = this.f128494u;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("activityDesc");
            throw null;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_activity_desc");
        java.lang.String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        r45.h21 h21Var = this.Y;
        boolean z17 = true;
        if (h21Var != null && (string2 = h21Var.getString(1)) != null) {
            str = string2;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            string = textView2.getResources().getString(com.tencent.mm.R.string.cja, stringExtra);
            kotlin.jvm.internal.o.d(string);
        } else {
            string = str.concat(stringExtra);
        }
        if (r26.i0.o(string, "\n", false, 2, null)) {
            string = string.substring(0, string.length() - 1);
            kotlin.jvm.internal.o.f(string, "substring(...)");
        }
        java.lang.String a17 = f128488x1.a(string);
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(this.K);
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "desc " + a17 + ", maxLineNum:2");
            return;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getContext().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int f17 = displayMetrics.widthPixels - i65.a.f(getContext(), com.tencent.mm.R.dimen.f479723df);
        android.text.TextPaint paint = textView2.getPaint();
        int color = z18 ? getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8) : getContext().getResources().getColor(com.tencent.mm.R.color.FG_0);
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(a17, 0, a17.length(), paint, f17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
        if (staticLayout.getLineCount() <= 2) {
            r45.e21 e21Var2 = this.L;
            if ((e21Var2 != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) e21Var2.getCustom(19) : null) == null) {
                r45.e21 e21Var3 = this.L;
                if (((e21Var3 == null || (d21Var = (r45.d21) e21Var3.getCustom(20)) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderContact) d21Var.getCustom(0)) == null) {
                    z17 = false;
                }
            }
            if (z17) {
                h7(textView2, a17.concat(" "), color, (int) (textView2.getPaint().measureText(a17.subSequence(staticLayout.getLineCount() == 2 ? staticLayout.getLineEnd(0) : 0, a17.length()).toString()) + getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480419xe)), new com.tencent.mm.plugin.finder.ui.u(this));
                return;
            }
            textView2.setText(a17);
            android.view.View view = this.Z;
            if (view == null) {
                kotlin.jvm.internal.o.o("descIconView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI", "setSuffixedDesc", "(Ljava/lang/String;ILandroid/widget/TextView;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI", "setSuffixedDesc", "(Ljava/lang/String;ILandroid/widget/TextView;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int lineEnd = staticLayout.getLineEnd(1);
        int lineEnd2 = staticLayout.getLineEnd(0);
        int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480434xt);
        java.lang.String string3 = textView2.getContext().getString(com.tencent.mm.R.string.ctg);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        float f18 = f17;
        android.text.StaticLayout staticLayout2 = new android.text.StaticLayout(a17, lineEnd2, lineEnd, paint, (int) ((f18 - textView2.getPaint().measureText(string3)) - dimension), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
        if (staticLayout2.getLineCount() > 0) {
            int lineEnd3 = staticLayout2.getLineEnd(0);
            int i17 = lineEnd3 - 1;
            if (a17.charAt(i17) == '\n') {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.String substring = a17.substring(0, i17);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                sb7.append(substring);
                sb7.append(string3);
                sb7.append(' ');
                sb6 = sb7.toString();
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                java.lang.String substring2 = a17.substring(0, lineEnd3);
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                sb8.append(substring2);
                sb8.append(string3);
                sb8.append(' ');
                sb6 = sb8.toString();
            }
            h7(textView2, sb6, color, (int) (f18 - getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480435xu)), new com.tencent.mm.plugin.finder.ui.v(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.adn;
    }

    public final void h7(android.widget.TextView textView, java.lang.String str, int i17, int i18, yz5.l lVar) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        android.view.View view = this.Z;
        if (view == null) {
            kotlin.jvm.internal.o.o("descIconView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI", "setSuffixedIcon", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI", "setSuffixedIcon", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) getContext().findViewById(com.tencent.mm.R.id.f482595is)).setIconColor(i17);
        int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        android.widget.TextView textView2 = this.f128494u;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("activityDesc");
            throw null;
        }
        android.graphics.Paint.FontMetricsInt fontMetricsInt = textView2.getPaint().getFontMetricsInt();
        int i19 = ((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - (dimension / 2);
        com.tencent.mars.xlog.Log.i("Finder.FinderActivityDescUI", "gap :" + i19);
        android.view.View view2 = this.Z;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("descIconView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = i19;
            layoutParams2.leftMargin = i18;
            android.view.View view3 = this.Z;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("descIconView");
                throw null;
            }
            view3.setLayoutParams(layoutParams2);
        }
        spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(str, i17, getContext().getResources().getColor(com.tencent.mm.R.color.a9e), false, false, new com.tencent.mm.plugin.finder.ui.t(lVar)), 0, str.length(), 17);
        textView.setText(spannableString);
    }

    public final void i7(int i17) {
        android.widget.TextView textView = this.U;
        if (textView == null) {
            kotlin.jvm.internal.o.o("nickNameText");
            throw null;
        }
        textView.setTextColor(i17);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.C;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("backBtn");
            throw null;
        }
        weImageView.setIconColor(i17);
        android.widget.TextView textView2 = this.R;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            throw null;
        }
        textView2.setTextColor(i17);
        android.widget.TextView textView3 = this.f128490l1;
        if (textView3 != null) {
            textView3.setTextColor(i17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View findViewById = getContext().findViewById(com.tencent.mm.R.id.f482554hm);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f128493t = findViewById;
        android.view.View findViewById2 = getContext().findViewById(com.tencent.mm.R.id.e89);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f128494u = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = getContext().findViewById(com.tencent.mm.R.id.e8y);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.S = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = getContext().findViewById(com.tencent.mm.R.id.a9w);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.X = (android.widget.LinearLayout) findViewById4;
        android.view.View findViewById5 = getContext().findViewById(com.tencent.mm.R.id.f482597iw);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.U = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = getContext().findViewById(com.tencent.mm.R.id.f482576i8);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f128496w = (android.widget.LinearLayout) findViewById6;
        android.view.View findViewById7 = getContext().findViewById(com.tencent.mm.R.id.f482555hn);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f128499y = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = getContext().findViewById(com.tencent.mm.R.id.f482566hy);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f128501z = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = getContext().findViewById(com.tencent.mm.R.id.f486274kq4);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.A = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = getContext().findViewById(com.tencent.mm.R.id.b5e);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.B = (android.widget.TextView) findViewById10;
        android.view.View findViewById11 = getContext().findViewById(com.tencent.mm.R.id.f484430e95);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.C = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById11;
        android.view.View findViewById12 = getContext().findViewById(com.tencent.mm.R.id.f482583ig);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.M = (android.widget.TextView) findViewById12;
        android.view.View findViewById13 = getContext().findViewById(com.tencent.mm.R.id.f482615je);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.N = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById13;
        android.view.View findViewById14 = getContext().findViewById(com.tencent.mm.R.id.f482575i7);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.P = (android.widget.ImageView) findViewById14;
        android.view.View findViewById15 = getContext().findViewById(com.tencent.mm.R.id.it);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.Z = findViewById15;
        this.f128491p0 = (android.widget.LinearLayout) getContext().findViewById(com.tencent.mm.R.id.f482598ix);
        this.f128498x0 = (android.widget.ImageView) getContext().findViewById(com.tencent.mm.R.id.f482599iy);
        this.f128490l1 = (android.widget.TextView) getContext().findViewById(com.tencent.mm.R.id.f482601j0);
        this.f128500y0 = getContext().findViewById(com.tencent.mm.R.id.f482600iz);
        android.view.View findViewById16 = getContext().findViewById(com.tencent.mm.R.id.f482571i3);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.T = (android.widget.ImageView) findViewById16;
        android.view.View findViewById17 = getContext().findViewById(com.tencent.mm.R.id.f482586ij);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.V = (android.view.ViewGroup) findViewById17;
        android.view.View findViewById18 = getContext().findViewById(com.tencent.mm.R.id.f482587ik);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.W = (android.widget.ImageView) findViewById18;
        android.view.View findViewById19 = getContext().findViewById(com.tencent.mm.R.id.e9c);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById19;
        this.R = textView;
        com.tencent.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = this.S;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("activityNameText");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView2);
        android.widget.TextView textView3 = this.f128499y;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("activityDescEndTime");
            throw null;
        }
        textView3.setVisibility(8);
        android.widget.TextView textView4 = this.f128501z;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("activityDescParticipateCount");
            throw null;
        }
        textView4.setVisibility(8);
        android.widget.LinearLayout linearLayout = this.f128496w;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("adContainer");
            throw null;
        }
        linearLayout.setVisibility(8);
        this.f128489J = getResources().getColor(com.tencent.mm.R.color.a9e);
        getController().G0(this.f128489J);
        this.K = getIntent().getStringExtra("key_cover_url");
        java.lang.String stringExtra = getIntent().getStringExtra("key_nick_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.G = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_activity_name");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.H = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_activity_desc");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.I = stringExtra3;
        this.F = getIntent().getLongExtra("key_activity_end_time", 0L);
        this.Q = getIntent().getLongExtra("key_activity_display_mask", 0L);
        android.widget.TextView textView5 = this.U;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("nickNameText");
            throw null;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        java.lang.String str = this.G;
        ((ke0.e) xVar).getClass();
        textView5.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
        android.widget.TextView textView6 = this.S;
        if (textView6 == null) {
            kotlin.jvm.internal.o.o("activityNameText");
            throw null;
        }
        textView6.setText(this.H);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_wording_info");
        if (byteArrayExtra != null) {
            r45.h21 h21Var = new r45.h21();
            try {
                h21Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                h21Var = null;
            }
            this.Y = h21Var;
        }
        java.lang.String stringExtra4 = getIntent().getStringExtra("vst_id");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f128492p1 = stringExtra4;
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        android.view.View decorView2 = getContext().getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView2, "getDecorView(...)");
        decorView2.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.ui.h(decorView2, this));
        getController().G0(getResources().getColor(com.tencent.mm.R.color.a9e));
        pq5.g l17 = new db2.w2(this.G, this.H, null, null, null, null, 60, null).l();
        l17.f(this);
        l17.K(new com.tencent.mm.plugin.finder.ui.i(this));
        boolean booleanExtra = getIntent().getBooleanExtra("key_activity_already_participate", false);
        if (booleanExtra) {
            android.widget.TextView textView7 = this.A;
            if (textView7 == null) {
                kotlin.jvm.internal.o.o("participateBtn");
                throw null;
            }
            textView7.setVisibility(4);
            android.widget.TextView textView8 = this.B;
            if (textView8 == null) {
                kotlin.jvm.internal.o.o("cancelBtn");
                throw null;
            }
            textView8.setVisibility(4);
        } else {
            android.widget.TextView textView9 = this.A;
            if (textView9 == null) {
                kotlin.jvm.internal.o.o("participateBtn");
                throw null;
            }
            textView9.setVisibility(4);
            android.widget.TextView textView10 = this.B;
            if (textView10 == null) {
                kotlin.jvm.internal.o.o("cancelBtn");
                throw null;
            }
            textView10.setVisibility(4);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.C;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("backBtn");
            throw null;
        }
        weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.ui.j(this));
        android.widget.TextView textView11 = this.A;
        if (textView11 == null) {
            kotlin.jvm.internal.o.o("participateBtn");
            throw null;
        }
        textView11.setOnClickListener(new com.tencent.mm.plugin.finder.ui.k(this));
        android.widget.LinearLayout linearLayout2 = this.f128496w;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("adContainer");
            throw null;
        }
        linearLayout2.setOnClickListener(new com.tencent.mm.plugin.finder.ui.l(this));
        android.widget.TextView textView12 = this.B;
        if (textView12 == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        textView12.setOnClickListener(new com.tencent.mm.plugin.finder.ui.o(this));
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(this.K);
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (z17) {
            java.lang.String str2 = this.K;
            wo0.c a17 = g1Var.e().a(new mn2.j0(str2 != null ? str2 : ""));
            a17.g(g1Var.h(mn2.f1.f329966t));
            a17.f447873d = new com.tencent.mm.plugin.finder.ui.s(str2, this);
            android.widget.ImageView imageView = this.T;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("coverImageView");
                throw null;
            }
            a17.c(imageView);
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context2).getController().O0(true);
            i7(getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            int color = getResources().getColor(com.tencent.mm.R.color.f478982ml);
            android.widget.TextView textView13 = this.f128494u;
            if (textView13 == null) {
                kotlin.jvm.internal.o.o("activityDesc");
                throw null;
            }
            textView13.setTextColor(color);
            android.widget.TextView textView14 = this.f128494u;
            if (textView14 == null) {
                kotlin.jvm.internal.o.o("activityDesc");
                throw null;
            }
            textView14.setHintTextColor(getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
            android.widget.TextView textView15 = this.S;
            if (textView15 == null) {
                kotlin.jvm.internal.o.o("activityNameText");
                throw null;
            }
            textView15.setTextColor(color);
            android.widget.ImageView imageView2 = this.T;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("coverImageView");
                throw null;
            }
            imageView2.setVisibility(0);
            android.view.ViewGroup viewGroup = this.V;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("coverMaskContainer");
                throw null;
            }
            viewGroup.setVisibility(0);
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            androidx.appcompat.app.AppCompatActivity context3 = getContext();
            kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
            context3.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f17 = displayMetrics.widthPixels * 1.3333334f;
            android.widget.ImageView imageView3 = this.W;
            if (imageView3 == null) {
                kotlin.jvm.internal.o.o("coverMaskImageView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = (int) f17;
            android.widget.ImageView imageView4 = this.W;
            if (imageView4 == null) {
                kotlin.jvm.internal.o.o("coverMaskImageView");
                throw null;
            }
            imageView4.setLayoutParams(layoutParams);
            android.view.View view = this.f128500y0;
            if (view != null) {
                view.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
            }
            android.widget.ImageView imageView5 = this.T;
            if (imageView5 == null) {
                kotlin.jvm.internal.o.o("coverImageView");
                throw null;
            }
            imageView5.post(new com.tencent.mm.plugin.finder.ui.g(this));
            android.widget.TextView textView16 = this.f128501z;
            if (textView16 == null) {
                kotlin.jvm.internal.o.o("activityDescParticipateCount");
                throw null;
            }
            textView16.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
            android.widget.TextView textView17 = this.f128499y;
            if (textView17 == null) {
                kotlin.jvm.internal.o.o("activityDescEndTime");
                throw null;
            }
            textView17.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            android.widget.TextView textView18 = this.f128494u;
            if (textView18 == null) {
                kotlin.jvm.internal.o.o("activityDesc");
                throw null;
            }
            textView18.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            android.widget.TextView textView19 = this.M;
            if (textView19 == null) {
                kotlin.jvm.internal.o.o("adTextView");
                throw null;
            }
            textView19.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            android.widget.LinearLayout linearLayout3 = this.f128496w;
            if (linearLayout3 == null) {
                kotlin.jvm.internal.o.o("adContainer");
                throw null;
            }
            linearLayout3.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.abl));
        } else {
            androidx.appcompat.app.AppCompatActivity context4 = getContext();
            kotlin.jvm.internal.o.e(context4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context4).getController().O0(com.tencent.mm.ui.bk.C());
            i7(getResources().getColor(com.tencent.mm.R.color.FG_0));
            android.view.View view2 = this.f128500y0;
            if (view2 != null) {
                view2.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
            }
            int color2 = getResources().getColor(com.tencent.mm.R.color.f478714f5);
            android.widget.TextView textView20 = this.f128494u;
            if (textView20 == null) {
                kotlin.jvm.internal.o.o("activityDesc");
                throw null;
            }
            textView20.setTextColor(color2);
            android.widget.TextView textView21 = this.S;
            if (textView21 == null) {
                kotlin.jvm.internal.o.o("activityNameText");
                throw null;
            }
            textView21.setTextColor(color2);
            android.widget.TextView textView22 = this.f128494u;
            if (textView22 == null) {
                kotlin.jvm.internal.o.o("activityDesc");
                throw null;
            }
            textView22.setHintTextColor(getResources().getColor(com.tencent.mm.R.color.FG_2));
            android.widget.ImageView imageView6 = this.T;
            if (imageView6 == null) {
                kotlin.jvm.internal.o.o("coverImageView");
                throw null;
            }
            imageView6.setVisibility(8);
            android.view.ViewGroup viewGroup2 = this.V;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("coverMaskContainer");
                throw null;
            }
            viewGroup2.setVisibility(8);
            android.widget.TextView textView23 = this.f128501z;
            if (textView23 == null) {
                kotlin.jvm.internal.o.o("activityDescParticipateCount");
                throw null;
            }
            textView23.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
            android.widget.TextView textView24 = this.f128499y;
            if (textView24 == null) {
                kotlin.jvm.internal.o.o("activityDescEndTime");
                throw null;
            }
            textView24.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
            android.widget.TextView textView25 = this.f128494u;
            if (textView25 == null) {
                kotlin.jvm.internal.o.o("activityDesc");
                throw null;
            }
            textView25.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
            android.widget.TextView textView26 = this.M;
            if (textView26 == null) {
                kotlin.jvm.internal.o.o("adTextView");
                throw null;
            }
            textView26.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
            android.widget.LinearLayout linearLayout4 = this.f128496w;
            if (linearLayout4 == null) {
                kotlin.jvm.internal.o.o("adContainer");
                throw null;
            }
            linearLayout4.setBackground(getContext().getResources().getDrawable(com.tencent.mm.R.drawable.abp));
        }
        android.view.View findViewById20 = getContext().findViewById(com.tencent.mm.R.id.f482592ip);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        this.f128495v = (android.widget.ImageView) findViewById20;
        java.lang.String stringExtra5 = getIntent().getStringExtra("key_avatar_url");
        vo0.d a18 = g1Var.a();
        mn2.n nVar = new mn2.n(stringExtra5, null, 2, null);
        android.widget.ImageView imageView7 = this.f128495v;
        if (imageView7 == null) {
            kotlin.jvm.internal.o.o("avatarImage");
            throw null;
        }
        a18.c(nVar, imageView7, g1Var.h(mn2.f1.f329957h));
        android.widget.TextView textView27 = this.f128494u;
        if (textView27 == null) {
            kotlin.jvm.internal.o.o("activityDesc");
            throw null;
        }
        textView27.setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
        if (hc2.a0.c(this.Q)) {
            android.widget.LinearLayout linearLayout5 = this.X;
            if (linearLayout5 == null) {
                kotlin.jvm.internal.o.o("avatartContainer");
                throw null;
            }
            linearLayout5.setVisibility(0);
        } else {
            android.widget.LinearLayout linearLayout6 = this.X;
            if (linearLayout6 == null) {
                kotlin.jvm.internal.o.o("avatartContainer");
                throw null;
            }
            linearLayout6.setVisibility(8);
        }
        android.widget.TextView textView28 = this.f128494u;
        if (textView28 == null) {
            kotlin.jvm.internal.o.o("activityDesc");
            throw null;
        }
        textView28.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(getContext()));
        g7();
        android.view.View findViewById21 = findViewById(com.tencent.mm.R.id.f482556ho);
        findViewById21.post(new com.tencent.mm.plugin.finder.ui.p(findViewById21, this, booleanExtra));
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
