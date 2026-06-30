package ke0;

@j95.b
/* loaded from: classes12.dex */
public class e extends i95.w implements le0.x, le0.u {
    public java.lang.CharSequence Ai(android.content.Context context, java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, boolean z17) {
        java.util.LinkedList linkedList = com.tencent.mm.pluginsdk.ui.span.c0.f191191a;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        int length = charSequence.length();
        int i17 = length + 1;
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        if (!z17) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        spannableStringBuilder.setSpan(new al5.w(drawable, 1), length, i17, 18);
        return spannableStringBuilder;
    }

    public void Bi() {
        java.util.LinkedList linkedList = com.tencent.mm.pluginsdk.ui.span.c0.f191191a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSpanManager", "clear MMSpanManager cache");
        ((lt0.f) com.tencent.mm.pluginsdk.ui.span.j1.I).clear();
    }

    public com.tencent.mm.pluginsdk.ui.span.z0 Di(java.lang.String str, int i17, int i18, boolean z17, com.tencent.mm.pluginsdk.ui.span.w wVar) {
        return new com.tencent.mm.pluginsdk.ui.span.e0(str, i17, i18, z17, wVar);
    }

    public void Ni(com.tencent.mm.pluginsdk.ui.span.z zVar) {
        com.tencent.mm.pluginsdk.ui.span.c0.f191191a.remove(zVar);
    }

    public void Ri(android.widget.TextView textView, java.lang.String content, java.util.List linkList, java.util.List separatorList) {
        kotlin.jvm.internal.o.g(textView, "textView");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(linkList, "linkList");
        kotlin.jvm.internal.o.g(separatorList, "separatorList");
        android.text.SpannableString spannableString = new android.text.SpannableString(content);
        int i17 = 0;
        int i18 = 0;
        for (java.lang.Object obj : linkList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.pluginsdk.ui.span.u uVar = (com.tencent.mm.pluginsdk.ui.span.u) obj;
            spannableString.setSpan(new com.tencent.mm.pluginsdk.ui.span.v(i18, uVar), uVar.f191288b, uVar.f191289c, 17);
            i18 = i19;
        }
        for (java.lang.Object obj2 : separatorList) {
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.pluginsdk.ui.span.b1 b1Var = (com.tencent.mm.pluginsdk.ui.span.b1) obj2;
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(b1Var.f191190c), b1Var.f191188a, b1Var.f191189b, 17);
            i17 = i27;
        }
        textView.setText(spannableString);
        textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.x(spannableString, textView));
    }

    public android.text.SpannableString Ui(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18) {
        java.util.LinkedList linkedList = com.tencent.mm.pluginsdk.ui.span.c0.f191191a;
        com.tencent.mm.pluginsdk.ui.span.j1 j1Var = new com.tencent.mm.pluginsdk.ui.span.j1(context);
        j1Var.f191230i = false;
        j1Var.f191226e = true;
        j1Var.f191227f = false;
        j1Var.f191229h = com.tencent.mm.pluginsdk.ui.span.c0.d();
        j1Var.f191239r = false;
        j1Var.f191246y = i18;
        j1Var.f191231j = true;
        j1Var.f191234m = false;
        j1Var.B = true;
        j1Var.f191232k = false;
        j1Var.f191235n = false;
        return j1Var.e(charSequence, i17, true);
    }

    public android.text.SpannableString Vi(android.content.Context context, java.lang.CharSequence charSequence) {
        return com.tencent.mm.pluginsdk.ui.span.c0.i(context, charSequence);
    }

    public android.text.SpannableString Zi(android.content.Context context, java.lang.CharSequence charSequence, float f17) {
        return com.tencent.mm.pluginsdk.ui.span.c0.j(context, charSequence, f17);
    }

    public android.text.SpannableString aj(android.content.Context context, java.lang.CharSequence charSequence, float f17, int i17) {
        java.util.LinkedList linkedList = com.tencent.mm.pluginsdk.ui.span.c0.f191191a;
        com.tencent.mm.pluginsdk.ui.span.j1 j1Var = new com.tencent.mm.pluginsdk.ui.span.j1(context);
        j1Var.f191231j = false;
        j1Var.f191232k = false;
        j1Var.f191226e = false;
        j1Var.f191227f = false;
        j1Var.f191234m = false;
        j1Var.f191246y = i17;
        j1Var.f191230i = false;
        j1Var.B = false;
        android.text.SpannableString e17 = j1Var.e(charSequence, 0, true);
        com.tencent.mm.pluginsdk.ui.span.c0.f(e17);
        return e17;
    }

    public android.text.SpannableString bj(android.content.Context context, java.lang.CharSequence charSequence, int i17) {
        return com.tencent.mm.pluginsdk.ui.span.c0.m(context, charSequence, 0, true);
    }

    public android.text.SpannableString cj(android.content.Context context, java.lang.CharSequence charSequence, boolean z17) {
        java.util.LinkedList linkedList = com.tencent.mm.pluginsdk.ui.span.c0.f191191a;
        com.tencent.mm.pluginsdk.ui.span.j1 j1Var = new com.tencent.mm.pluginsdk.ui.span.j1(context);
        j1Var.f191231j = false;
        j1Var.f191232k = false;
        j1Var.f191226e = false;
        j1Var.f191227f = false;
        j1Var.f191234m = false;
        j1Var.f191230i = false;
        j1Var.B = false;
        j1Var.f191241t = z17;
        android.text.SpannableString e17 = j1Var.e(charSequence, 0, true);
        com.tencent.mm.pluginsdk.ui.span.c0.f(e17);
        return e17;
    }

    public android.text.SpannableString fj(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj, le0.r rVar) {
        return com.tencent.mm.pluginsdk.ui.span.c0.k(context, true, charSequence, i17, i18, obj, rVar, -1, true);
    }

    public android.text.SpannableString hj(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj) {
        java.util.LinkedList linkedList = com.tencent.mm.pluginsdk.ui.span.c0.f191191a;
        com.tencent.mm.pluginsdk.ui.span.j1 j1Var = new com.tencent.mm.pluginsdk.ui.span.j1(context);
        j1Var.f191230i = true;
        j1Var.f191226e = true;
        j1Var.f191227f = true;
        j1Var.f191229h = com.tencent.mm.pluginsdk.ui.span.c0.d();
        j1Var.f191239r = true;
        j1Var.f191246y = i18;
        j1Var.f191231j = true;
        j1Var.f191234m = false;
        j1Var.B = true;
        j1Var.H = obj;
        if (i18 == 1) {
            j1Var.f191232k = true;
            j1Var.f191235n = true;
        } else if (i18 == 2) {
            j1Var.f191232k = false;
            j1Var.f191235n = false;
        }
        return j1Var.e(charSequence, i17, true);
    }

    public android.text.SpannableString ij(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj) {
        return com.tencent.mm.pluginsdk.ui.span.c0.l(context, charSequence, i17, i18, obj, false);
    }

    public android.text.SpannableString mj(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj, boolean z17) {
        return com.tencent.mm.pluginsdk.ui.span.c0.l(context, charSequence, i17, i18, obj, z17);
    }

    public android.text.SpannableString nj(android.content.Context context, java.lang.CharSequence charSequence, int i17) {
        java.util.LinkedList linkedList = com.tencent.mm.pluginsdk.ui.span.c0.f191191a;
        com.tencent.mm.pluginsdk.ui.span.j1 j1Var = new com.tencent.mm.pluginsdk.ui.span.j1(context);
        j1Var.f191230i = false;
        j1Var.f191226e = true;
        j1Var.f191227f = true;
        j1Var.f191228g = false;
        j1Var.f191237p = false;
        j1Var.f191238q = false;
        j1Var.f191239r = false;
        j1Var.f191246y = 1;
        j1Var.f191231j = false;
        j1Var.f191234m = false;
        j1Var.f191232k = false;
        j1Var.f191235n = false;
        j1Var.B = true;
        return j1Var.e(charSequence, i17, true);
    }

    public android.text.SpannableString oj(android.widget.TextView textView, int i17) {
        return com.tencent.mm.pluginsdk.ui.span.c0.o(textView, i17, 0, null, null, true, true);
    }

    public android.text.SpannableString pj(android.widget.TextView textView, int i17, int i18, com.tencent.mm.pluginsdk.ui.span.a aVar, int i19, java.lang.Object obj) {
        java.util.LinkedList linkedList = com.tencent.mm.pluginsdk.ui.span.c0.f191191a;
        if (textView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
            return new android.text.SpannableString("");
        }
        android.content.Context context = textView.getContext();
        int textSize = (int) textView.getTextSize();
        com.tencent.mm.pluginsdk.ui.span.j1 j1Var = new com.tencent.mm.pluginsdk.ui.span.j1(context);
        j1Var.f191230i = true;
        j1Var.f191226e = true;
        j1Var.f191227f = true;
        j1Var.f191229h = com.tencent.mm.pluginsdk.ui.span.c0.d();
        j1Var.f191246y = i17;
        j1Var.f191231j = true;
        j1Var.f191234m = false;
        j1Var.f191236o = com.tencent.mm.pluginsdk.ui.span.c0.c(i17);
        j1Var.B = true;
        j1Var.H = obj;
        j1Var.g(textView);
        j1Var.D = i18;
        j1Var.E = aVar;
        j1Var.F = i19;
        if (i17 == 1) {
            j1Var.f191232k = true;
            j1Var.f191235n = true;
        } else if (i17 == 2) {
            j1Var.f191232k = false;
            j1Var.f191235n = false;
        }
        return j1Var.e(textView.getText(), textSize, true);
    }

    public android.text.SpannableString qj(android.content.Context context, java.lang.CharSequence charSequence, int i17, boolean z17, int i18, java.lang.Object obj) {
        java.util.LinkedList linkedList = com.tencent.mm.pluginsdk.ui.span.c0.f191191a;
        com.tencent.mm.pluginsdk.ui.span.j1 j1Var = new com.tencent.mm.pluginsdk.ui.span.j1(context);
        j1Var.f191237p = true;
        j1Var.f191226e = true;
        j1Var.f191239r = true;
        j1Var.f191246y = i18;
        j1Var.f191234m = false;
        j1Var.B = true;
        j1Var.g(null);
        if (i18 == 1) {
            j1Var.f191232k = true;
            j1Var.f191235n = true;
        } else if (i18 == 2) {
            j1Var.f191232k = false;
            j1Var.f191235n = false;
        }
        if (obj != null) {
            j1Var.H = obj;
        }
        return j1Var.e(charSequence, i17, z17);
    }

    public android.text.SpannableString rj(android.content.Context context, java.lang.CharSequence charSequence, int i17, int i18, java.lang.Object obj, java.lang.String str) {
        return com.tencent.mm.pluginsdk.ui.span.c0.u(context, charSequence, i17, i18, obj, str, true);
    }

    public void sj(android.content.Context context, java.util.List list, java.lang.String str, java.util.List list2, android.widget.TextView textView) {
        com.tencent.mm.pluginsdk.ui.span.c0.v(context, list, str, list2, java.lang.Boolean.TRUE, textView, false, null);
    }

    public void wi(com.tencent.mm.pluginsdk.ui.span.z zVar) {
        com.tencent.mm.pluginsdk.ui.span.c0.f191191a.add(zVar);
    }
}
