package io;

/* loaded from: classes12.dex */
public final class h implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.t0 f293407a;

    /* renamed from: b, reason: collision with root package name */
    public fc5.e f293408b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f293407a == null) {
            this.f293407a = new em.t0(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dn6, (android.view.ViewGroup) null));
            c(null, this.f293408b);
        }
        em.t0 t0Var = this.f293407a;
        kotlin.jvm.internal.o.d(t0Var);
        android.view.View view = t0Var.f254798a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        fc5.e eVar = (fc5.e) pVar;
        fc5.e eVar2 = this.f293408b;
        this.f293408b = eVar;
        c(eVar2, eVar);
    }

    public final void c(fc5.e eVar, fc5.e eVar2) {
        em.t0 t0Var;
        java.lang.String str;
        android.graphics.drawable.Drawable e17;
        if (eVar2 == null || (t0Var = this.f293407a) == null) {
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) t0Var.b().findViewById(com.tencent.mm.R.id.bnk);
        android.widget.TextView textView = (android.widget.TextView) t0Var.b().findViewById(com.tencent.mm.R.id.bnp);
        android.widget.ImageView imageView2 = (android.widget.ImageView) t0Var.b().findViewById(com.tencent.mm.R.id.bne);
        com.tencent.mm.plugin.finder.feed.RoundLinearLayout a17 = t0Var.a();
        kotlin.jvm.internal.o.f(a17, "getChattingClickArea(...)");
        android.util.Size size = eVar2.f261215e;
        a17.setOnClickListener(eVar2.f261216f);
        android.view.ViewGroup.LayoutParams layoutParams = a17.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = size.getWidth();
        layoutParams.height = size.getHeight();
        a17.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.finder.feed.RoundLinearLayout a18 = t0Var.a();
        kotlin.jvm.internal.o.f(a18, "getChattingClickArea(...)");
        java.lang.String str2 = eVar2.f261217g;
        if (str2 == null) {
            str2 = "";
        }
        a18.setContentDescription(str2);
        android.widget.ImageView imageView3 = t0Var.f254804g;
        android.view.View view = t0Var.f254798a;
        if (imageView3 == null) {
            t0Var.f254804g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483673bo1);
        }
        android.widget.ImageView imageView4 = t0Var.f254804g;
        kotlin.jvm.internal.o.f(imageView4, "getChattingItemFinderThumb(...)");
        android.util.Size size2 = eVar2.f261220m;
        int i17 = eVar2.f261221n;
        java.lang.String str3 = eVar2.f261218h;
        java.lang.String str4 = eVar2.f261219i;
        if (str3 != null) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            str = "";
            ya2.l.f460502a.h(str3, imageView4, mn2.f1.D);
        } else {
            str = "";
        }
        if (str4 != null) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            ya2.l.f460502a.h(str4, null, mn2.f1.B);
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView4.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.width = size2.getWidth();
        layoutParams3.height = size2.getHeight();
        imageView4.setLayoutParams(layoutParams3);
        imageView4.setVisibility(i17);
        if (imageView4 instanceof com.tencent.mm.view.NinePatchCropImageView) {
            ((com.tencent.mm.view.NinePatchCropImageView) imageView4).setNinePatchId(com.tencent.mm.R.drawable.c0j);
        }
        com.tencent.mm.plugin.finder.feed.RoundLinearLayout a19 = t0Var.a();
        kotlin.jvm.internal.o.f(a19, "getChattingClickArea(...)");
        android.util.Size size3 = eVar2.f261215e;
        a19.setOnClickListener(eVar2.f261216f);
        android.view.ViewGroup.LayoutParams layoutParams4 = a19.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams4.width = size3.getWidth();
        layoutParams4.height = size3.getHeight();
        a19.setLayoutParams(layoutParams4);
        if (t0Var.f254806i == null) {
            t0Var.f254806i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bni);
        }
        android.widget.TextView textView2 = t0Var.f254806i;
        kotlin.jvm.internal.o.f(textView2, "getChattingItemFinderDesc(...)");
        java.lang.CharSequence charSequence = eVar2.f261222o;
        int i18 = eVar2.f261223p;
        if (charSequence == null) {
            charSequence = str;
        }
        textView2.setText(charSequence);
        textView2.setVisibility(i18);
        if (t0Var.f254803f == null) {
            t0Var.f254803f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483672bo0);
        }
        android.widget.TextView textView3 = t0Var.f254803f;
        kotlin.jvm.internal.o.f(textView3, "getChattingItemFinderText(...)");
        java.lang.CharSequence charSequence2 = eVar2.f261224q;
        int i19 = eVar2.f261225r;
        if (charSequence2 == null) {
            charSequence2 = str;
        }
        textView3.setText(charSequence2);
        textView3.setVisibility(i19);
        if (t0Var.f254800c == null) {
            t0Var.f254800c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bno);
        }
        android.widget.ImageView imageView5 = t0Var.f254800c;
        kotlin.jvm.internal.o.f(imageView5, "getChattingItemFinderMediaType(...)");
        imageView5.setVisibility(eVar2.f261226s);
        if (t0Var.f254809l == null) {
            t0Var.f254809l = (com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView) view.findViewById(com.tencent.mm.R.id.bnn);
        }
        com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView imageIndicatorView = t0Var.f254809l;
        kotlin.jvm.internal.o.f(imageIndicatorView, "getChattingItemFinderImageIndicator(...)");
        int i27 = eVar2.f261228u;
        int i28 = eVar2.f261229v;
        int i29 = eVar2.f261227t;
        int i37 = eVar2.f261230w;
        imageIndicatorView.f170651e = i29;
        imageIndicatorView.f170655i = i28;
        imageIndicatorView.f170654h = i27;
        imageIndicatorView.setVisibility(i37);
        if (t0Var.f254801d == null) {
            t0Var.f254801d = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.qz_);
        }
        android.widget.LinearLayout linearLayout = t0Var.f254801d;
        kotlin.jvm.internal.o.f(linearLayout, "getLayoutCoverImageCounter(...)");
        java.lang.CharSequence charSequence3 = eVar2.f261232y;
        int i38 = eVar2.f261231x;
        android.widget.TextView textView4 = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.pth);
        if (textView4 != null) {
            textView4.setText(charSequence3);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i38));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(linearLayout, arrayList.toArray(), "com/tencent/mm/chatting/viewfactory/ChattingFinderFeedView", "updateCoverImageCounter", "(Landroid/view/View;Ljava/lang/CharSequence;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        linearLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(linearLayout, "com/tencent/mm/chatting/viewfactory/ChattingFinderFeedView", "updateCoverImageCounter", "(Landroid/view/View;Ljava/lang/CharSequence;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout b17 = t0Var.b();
        kotlin.jvm.internal.o.f(b17, "getLlCoverBottomMask(...)");
        int i39 = eVar2.f261233z;
        int i47 = eVar2.A;
        int i48 = eVar2.B;
        ho.b.b(b17, i39, i47);
        b17.setVisibility(i48);
        if (imageView != null && (e17 = com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_channel, i65.a.d(imageView.getContext(), com.tencent.mm.R.color.f478526a7))) != null) {
            imageView.setImageDrawable(e17);
        }
        if (textView != null) {
            java.lang.CharSequence charSequence4 = eVar2.C;
            boolean z17 = eVar2.D;
            textView.setText(charSequence4);
            if (z17) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                com.tencent.mm.ui.bk.t0(textView.getPaint());
            }
        }
        if (textView != null && imageView2 != null) {
            int i49 = eVar2.E;
            java.lang.String str5 = eVar2.F;
            int i57 = eVar2.G;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1.f460511a.d(textView, i57, imageView2, i49, str5);
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.fsk);
        if (findViewById != null) {
            int i58 = eVar2.H;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i58));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/chatting/viewfactory/ChattingFinderFeedView", "updateMemberWaterMark", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/chatting/viewfactory/ChattingFinderFeedView", "updateMemberWaterMark", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (t0Var.f254807j == null) {
            t0Var.f254807j = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.r1f);
        }
        android.widget.TextView textView5 = t0Var.f254807j;
        kotlin.jvm.internal.o.f(textView5, "getTvFooterTitle(...)");
        java.lang.CharSequence charSequence5 = eVar2.I;
        int i59 = eVar2.f261213J;
        if (charSequence5 == null) {
            charSequence5 = str;
        }
        textView5.setText(charSequence5);
        textView5.setVisibility(i59);
        if (t0Var.f254805h == null) {
            t0Var.f254805h = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.qzc);
        }
        android.widget.LinearLayout linearLayout2 = t0Var.f254805h;
        kotlin.jvm.internal.o.f(linearLayout2, "getLlFooterContainer(...)");
        int i66 = eVar2.K;
        int i67 = eVar2.L;
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), i66, linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setVisibility(i67);
        if (t0Var.f254810m == null) {
            t0Var.f254810m = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485400qz5);
        }
        android.widget.ImageView imageView6 = t0Var.f254810m;
        kotlin.jvm.internal.o.f(imageView6, "getIvFooterAvatar(...)");
        java.lang.String str6 = eVar2.M;
        android.util.Size size4 = eVar2.N;
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a27 = g1Var.a();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f460502a;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str6 == null) {
            str6 = str;
        }
        a27.c(lVar.e(str6, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView6, g1Var.h(mn2.f1.f329962p));
        android.view.ViewGroup.LayoutParams layoutParams5 = imageView6.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams6 = (android.widget.LinearLayout.LayoutParams) layoutParams5;
        layoutParams6.width = size4.getWidth();
        layoutParams6.height = size4.getHeight();
        imageView6.setLayoutParams(layoutParams6);
        if (t0Var.f254802e == null) {
            t0Var.f254802e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.r1e);
        }
        android.widget.TextView textView6 = t0Var.f254802e;
        kotlin.jvm.internal.o.f(textView6, "getTvFooterNickName(...)");
        java.lang.CharSequence charSequence6 = eVar2.P;
        int i68 = eVar2.Q;
        textView6.setText(charSequence6);
        textView6.setTextSize(0, i68);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f293408b;
    }
}
