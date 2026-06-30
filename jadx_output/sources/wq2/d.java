package wq2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wq2.h f448520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vz2 f448521e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wq2.h hVar, r45.vz2 vz2Var) {
        super(0);
        this.f448520d = hVar;
        this.f448521e = vz2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        int i18;
        pf5.u uVar = pf5.u.f353936a;
        wq2.h hVar = this.f448520d;
        fr2.x xVar = (fr2.x) uVar.b(hVar.f448529a).e(fr2.x.class);
        r45.vz2 data = this.f448521e;
        if (xVar != null) {
            xVar.P6(data);
        }
        android.app.Activity activity = hVar.f448529a;
        fr2.x xVar2 = (fr2.x) uVar.b(activity).e(fr2.x.class);
        if (xVar2 != null) {
            xVar2.R6(data);
        }
        fr2.z zVar = (fr2.z) uVar.b(activity).e(fr2.z.class);
        if (zVar != null) {
            kotlin.jvm.internal.o.g(data, "data");
            android.widget.TextView textView = zVar.f265775d;
            if (textView == null) {
                kotlin.jvm.internal.o.o("contentTitleTextView");
                throw null;
            }
            textView.setText(data.f388690e);
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            com.tencent.mm.plugin.finder.live.util.a3 a3Var = com.tencent.mm.plugin.finder.live.util.a3.f115443a;
            java.util.LinkedList main_title_color = data.f388691f;
            kotlin.jvm.internal.o.f(main_title_color, "main_title_color");
            com.tencent.mm.plugin.finder.live.util.a3.e(a3Var, textView, main_title_color, com.tencent.mm.plugin.finder.live.util.u2.f115715d, null, 4, null);
            android.widget.TextView textView2 = zVar.f265776e;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("contentSubTitleTextView");
                throw null;
            }
            textView2.setText(data.f388692g);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            java.lang.String str = data.f388694i;
            if (str == null) {
                str = "";
            }
            boolean z17 = str.length() == 0;
            java.util.LinkedList sub_title_color = data.f388693h;
            if (z17) {
                java.lang.String str2 = data.f388692g;
                java.lang.String str3 = str2 == null ? "" : str2;
                android.text.StaticLayout staticLayout = new android.text.StaticLayout(str3, 0, str3.length(), textView2.getPaint(), zVar.f265779h, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                if (staticLayout.getLineCount() <= 2) {
                    i17 = 0;
                } else {
                    i17 = 0;
                    java.lang.String substring = str3.substring(0, staticLayout.getLineEnd(1));
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    str3 = substring.concat("...");
                }
                android.text.SpannableString spannableString = new android.text.SpannableString(str3);
                kotlin.jvm.internal.o.f(sub_title_color, "sub_title_color");
                spannableString.setSpan(new gr2.a(sub_title_color), i17, spannableString.length(), 33);
                spannableStringBuilder.append((java.lang.CharSequence) spannableString);
            } else {
                android.graphics.drawable.Drawable e17 = m95.a.e(zVar.getContext().getResources(), com.tencent.mm.R.raw.finder_live_theme_detail_arrow, 0.0f);
                e17.setBounds(0, 0, zVar.f265777f, zVar.f265778g);
                e17.setAlpha(127);
                al5.w wVar = new al5.w(e17, 1);
                java.lang.String str4 = zVar.getContext().getResources().getString(com.tencent.mm.R.string.f491631dq5) + "  ";
                android.text.SpannableString spannableString2 = new android.text.SpannableString(str4);
                spannableString2.setSpan(wVar, str4.length() - 1, str4.length(), 33);
                spannableString2.setSpan(new fr2.y(zVar, str, e17), 0, str4.length(), 33);
                java.lang.String str5 = data.f388692g;
                java.lang.String str6 = str5 == null ? "" : str5;
                java.lang.String str7 = str6 + ((java.lang.Object) spannableString2);
                android.text.StaticLayout staticLayout2 = new android.text.StaticLayout(str7, 0, str7.length(), textView2.getPaint(), zVar.f265779h, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                android.text.StaticLayout staticLayout3 = new android.text.StaticLayout(str6, 0, str6.length(), textView2.getPaint(), zVar.f265779h, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                if (staticLayout2.getLineCount() <= 2) {
                    i18 = 0;
                } else if (staticLayout3.getLineCount() <= 2) {
                    i18 = 0;
                    java.lang.String substring2 = str6.substring(0, str6.length() - 1);
                    kotlin.jvm.internal.o.f(substring2, "substring(...)");
                    str6 = substring2.concat("...");
                } else {
                    i18 = 0;
                    java.lang.String substring3 = str6.substring(0, staticLayout3.getLineEnd(1) - spannableString2.length());
                    kotlin.jvm.internal.o.f(substring3, "substring(...)");
                    str6 = substring3.concat("...");
                }
                android.text.SpannableString spannableString3 = new android.text.SpannableString(str6);
                kotlin.jvm.internal.o.f(sub_title_color, "sub_title_color");
                spannableString3.setSpan(new gr2.a(sub_title_color), i18, spannableString3.length(), 33);
                spannableStringBuilder.append((java.lang.CharSequence) spannableString3);
                spannableStringBuilder.append((java.lang.CharSequence) spannableString2);
                textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
            textView2.setText(spannableStringBuilder);
        }
        return jz5.f0.f302826a;
    }
}
