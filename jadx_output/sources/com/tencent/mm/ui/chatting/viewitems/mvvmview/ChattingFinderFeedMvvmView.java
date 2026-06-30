package com.tencent.mm.ui.chatting.viewitems.mvvmview;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderFeedMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/n;", "Lem/m;", "f", "Lem/m;", "getHolder", "()Lem/m;", "setHolder", "(Lem/m;)V", "holder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingFinderFeedMvvmView extends com.tencent.mm.mvvm.MvvmView<z01.n> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public em.m holder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingFinderFeedMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e0w, (android.view.ViewGroup) this, false);
        setHolder(new em.m(inflate));
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        java.lang.String str;
        android.graphics.drawable.Drawable e17;
        z01.n nVar = (z01.n) pVar2;
        if (nVar == null) {
            return;
        }
        em.m holder = getHolder();
        android.widget.ImageView imageView = (android.widget.ImageView) holder.b().findViewById(com.tencent.mm.R.id.bnk);
        android.widget.TextView textView = (android.widget.TextView) holder.b().findViewById(com.tencent.mm.R.id.bnp);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.b().findViewById(com.tencent.mm.R.id.bne);
        com.tencent.mm.plugin.finder.feed.RoundLinearLayout a17 = holder.a();
        kotlin.jvm.internal.o.f(a17, "getChattingClickArea(...)");
        android.util.Size size = nVar.f469115e;
        a17.setOnClickListener(nVar.M);
        android.view.ViewGroup.LayoutParams layoutParams = a17.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = size.getWidth();
        layoutParams.height = size.getHeight();
        a17.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.finder.feed.RoundLinearLayout a18 = holder.a();
        kotlin.jvm.internal.o.f(a18, "getChattingClickArea(...)");
        java.lang.String str2 = nVar.f469116f;
        if (str2 == null) {
            str2 = "";
        }
        a18.setContentDescription(str2);
        android.widget.ImageView imageView3 = holder.f254582g;
        android.view.View view = holder.f254576a;
        if (imageView3 == null) {
            holder.f254582g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483673bo1);
        }
        android.widget.ImageView imageView4 = holder.f254582g;
        kotlin.jvm.internal.o.f(imageView4, "getChattingItemFinderThumb(...)");
        android.util.Size size2 = nVar.f469119i;
        int i17 = nVar.f469120m;
        java.lang.String str3 = nVar.f469117g;
        java.lang.String str4 = nVar.f469118h;
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
        android.widget.FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            layoutParams3.width = size2.getWidth();
            layoutParams3.height = size2.getHeight();
            imageView4.setLayoutParams(layoutParams3);
            imageView4.setVisibility(i17);
            if (imageView4 instanceof com.tencent.mm.view.NinePatchCropImageView) {
                ((com.tencent.mm.view.NinePatchCropImageView) imageView4).setNinePatchId(com.tencent.mm.R.drawable.c0j);
            }
        }
        com.tencent.mm.plugin.finder.feed.RoundLinearLayout a19 = holder.a();
        kotlin.jvm.internal.o.f(a19, "getChattingClickArea(...)");
        android.util.Size size3 = nVar.f469115e;
        a19.setOnClickListener(nVar.M);
        android.view.ViewGroup.LayoutParams layoutParams4 = a19.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams4.width = size3.getWidth();
        layoutParams4.height = size3.getHeight();
        a19.setLayoutParams(layoutParams4);
        if (holder.f254584i == null) {
            holder.f254584i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bni);
        }
        android.widget.TextView textView2 = holder.f254584i;
        kotlin.jvm.internal.o.f(textView2, "getChattingItemFinderDesc(...)");
        java.lang.CharSequence charSequence = nVar.f469121n;
        int i18 = nVar.f469122o;
        if (charSequence == null) {
            charSequence = str;
        }
        textView2.setText(charSequence);
        textView2.setVisibility(i18);
        if (holder.f254581f == null) {
            holder.f254581f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483672bo0);
        }
        android.widget.TextView textView3 = holder.f254581f;
        kotlin.jvm.internal.o.f(textView3, "getChattingItemFinderText(...)");
        java.lang.CharSequence charSequence2 = nVar.f469123p;
        int i19 = nVar.f469124q;
        if (charSequence2 == null) {
            charSequence2 = str;
        }
        textView3.setText(charSequence2);
        textView3.setVisibility(i19);
        if (holder.f254578c == null) {
            holder.f254578c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bno);
        }
        android.widget.ImageView imageView5 = holder.f254578c;
        kotlin.jvm.internal.o.f(imageView5, "getChattingItemFinderMediaType(...)");
        imageView5.setVisibility(nVar.f469125r);
        if (holder.f254587l == null) {
            holder.f254587l = (com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView) view.findViewById(com.tencent.mm.R.id.bnn);
        }
        com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView imageIndicatorView = holder.f254587l;
        kotlin.jvm.internal.o.f(imageIndicatorView, "getChattingItemFinderImageIndicator(...)");
        int i27 = nVar.f469127t;
        int i28 = nVar.f469128u;
        int i29 = nVar.f469126s;
        int i37 = nVar.f469129v;
        imageIndicatorView.f170651e = i29;
        imageIndicatorView.f170655i = i28;
        imageIndicatorView.f170654h = i27;
        imageIndicatorView.setVisibility(i37);
        if (holder.f254579d == null) {
            holder.f254579d = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.qz_);
        }
        android.widget.LinearLayout linearLayout = holder.f254579d;
        kotlin.jvm.internal.o.f(linearLayout, "getLayoutCoverImageCounter(...)");
        java.lang.CharSequence charSequence3 = nVar.f469131x;
        int i38 = nVar.f469130w;
        android.widget.TextView textView4 = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.pth);
        if (textView4 != null) {
            textView4.setText(charSequence3);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i38));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(linearLayout, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderFeedMvvmView", "updateCoverImageCounter", "(Landroid/view/View;Ljava/lang/CharSequence;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        linearLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(linearLayout, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderFeedMvvmView", "updateCoverImageCounter", "(Landroid/view/View;Ljava/lang/CharSequence;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout b17 = holder.b();
        kotlin.jvm.internal.o.f(b17, "getLlCoverBottomMask(...)");
        int i39 = nVar.f469132y;
        int i47 = nVar.f469133z;
        int i48 = nVar.A;
        ho.b.b(b17, i39, i47);
        b17.setVisibility(i48);
        if (imageView != null && (e17 = com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_channel, i65.a.d(imageView.getContext(), com.tencent.mm.R.color.f478553an))) != null) {
            imageView.setImageDrawable(e17);
        }
        if (textView != null) {
            java.lang.CharSequence charSequence4 = nVar.B;
            boolean z17 = nVar.C;
            textView.setText(charSequence4);
            if (z17) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                com.tencent.mm.ui.bk.t0(textView.getPaint());
            }
        }
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = textView != null ? textView.getLayoutParams() : null;
        if (layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).setMarginEnd(0);
            textView.setLayoutParams(layoutParams5);
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.fsk);
        if (findViewById != null) {
            int i49 = nVar.D;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i49));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderFeedMvvmView", "updateMemberWaterMark", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingFinderFeedMvvmView", "updateMemberWaterMark", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (holder.f254585j == null) {
            holder.f254585j = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.r1f);
        }
        android.widget.TextView textView5 = holder.f254585j;
        kotlin.jvm.internal.o.f(textView5, "getTvFooterTitle(...)");
        java.lang.CharSequence charSequence5 = nVar.E;
        int i57 = nVar.F;
        if (charSequence5 == null) {
            charSequence5 = str;
        }
        textView5.setText(charSequence5);
        textView5.setVisibility(i57);
        if (holder.f254583h == null) {
            holder.f254583h = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.qzc);
        }
        android.widget.LinearLayout linearLayout2 = holder.f254583h;
        kotlin.jvm.internal.o.f(linearLayout2, "getLlFooterContainer(...)");
        int i58 = nVar.G;
        int i59 = nVar.H;
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), i58, linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setVisibility(i59);
        if (holder.f254588m == null) {
            holder.f254588m = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485400qz5);
        }
        android.widget.ImageView imageView6 = holder.f254588m;
        kotlin.jvm.internal.o.f(imageView6, "getIvFooterAvatar(...)");
        java.lang.String str5 = nVar.I;
        android.util.Size size4 = nVar.f469113J;
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a27 = g1Var.a();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f460502a;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str5 == null) {
            str5 = str;
        }
        a27.c(lVar.e(str5, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView6, g1Var.h(mn2.f1.f329962p));
        android.view.ViewGroup.LayoutParams layoutParams6 = imageView6.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams6, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams7 = (android.widget.LinearLayout.LayoutParams) layoutParams6;
        layoutParams7.width = size4.getWidth();
        layoutParams7.height = size4.getHeight();
        imageView6.setLayoutParams(layoutParams7);
        if (holder.f254580e == null) {
            holder.f254580e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.r1e);
        }
        android.widget.TextView textView6 = holder.f254580e;
        kotlin.jvm.internal.o.f(textView6, "getTvFooterNickName(...)");
        java.lang.CharSequence charSequence6 = nVar.K;
        int i66 = nVar.L;
        textView6.setText(charSequence6);
        textView6.setTextSize(0, i66);
        setOnClickListener(nVar.M);
        setOnLongClickListener(null);
        setOnTouchListener(null);
    }

    public final em.m getHolder() {
        em.m mVar = this.holder;
        if (mVar != null) {
            return mVar;
        }
        kotlin.jvm.internal.o.o("holder");
        throw null;
    }

    public final void setHolder(em.m mVar) {
        kotlin.jvm.internal.o.g(mVar, "<set-?>");
        this.holder = mVar;
    }

    public /* synthetic */ ChattingFinderFeedMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingFinderFeedMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
