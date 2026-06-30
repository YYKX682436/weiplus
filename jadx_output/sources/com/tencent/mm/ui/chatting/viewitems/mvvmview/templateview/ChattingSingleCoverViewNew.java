package com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingSingleCoverViewNew;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lc11/g;", "Landroid/widget/TextView;", "textView", "Ljz5/f0;", "setTagAndTitleTo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingSingleCoverViewNew extends com.tencent.mm.mvvm.MvvmView<c11.g> {

    /* renamed from: f, reason: collision with root package name */
    public em.x f204891f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f204892g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingSingleCoverViewNew(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setTagAndTitleTo(android.widget.TextView r10) {
        /*
            r9 = this;
            q31.p r0 = r9.getViewModel()
            c11.g r0 = (c11.g) r0
            if (r0 == 0) goto Lc
            java.lang.CharSequence r0 = r0.f37845d
            if (r0 != 0) goto Le
        Lc:
            java.lang.String r0 = ""
        Le:
            q31.p r1 = r9.getViewModel()
            c11.g r1 = (c11.g) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L24
            java.lang.String r1 = r1.f37849h
            if (r1 == 0) goto L24
            boolean r4 = r26.n0.N(r1)
            r4 = r4 ^ r2
            if (r4 == 0) goto L24
            goto L25
        L24:
            r1 = r3
        L25:
            if (r1 != 0) goto L2b
            r10.setText(r0)
            return
        L2b:
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            int r5 = r4.length()
            r4.append(r1)
            int r1 = r4.length()
            q31.p r6 = r9.getViewModel()
            c11.g r6 = (c11.g) r6
            if (r6 == 0) goto L59
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            int r8 = r7.intValue()
            if (r8 == 0) goto L4f
            r6 = r2
        L4f:
            if (r6 == 0) goto L52
            r3 = r7
        L52:
            if (r3 == 0) goto L59
            int r3 = r3.intValue()
            goto L64
        L59:
            android.content.Context r3 = r9.getContext()
            r6 = 2131100033(0x7f060181, float:1.7812436E38)
            int r3 = r3.getColor(r6)
        L64:
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            r6.<init>(r3)
            r3 = 33
            r4.setSpan(r6, r5, r1, r3)
            boolean r1 = r26.n0.N(r0)
            r1 = r1 ^ r2
            if (r1 == 0) goto L7d
            r1 = 32
            r4.append(r1)
            r4.append(r0)
        L7d:
            r10.setText(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingSingleCoverViewNew.setTagAndTitleTo(android.widget.TextView):void");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        android.view.ViewGroup viewGroup;
        int indexOfChild;
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e29, (android.view.ViewGroup) this, false);
        em.x xVar = new em.x(inflate);
        this.f204891f = xVar;
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.f204892g = ((ko.a) ((q31.t) ((q31.r) c17)).wi()).b(context);
        if (xVar.f254902e == null) {
            xVar.f254902e = (android.view.ViewStub) inflate.findViewById(com.tencent.mm.R.id.v_2);
        }
        android.view.ViewStub viewStub = xVar.f254902e;
        kotlin.jvm.internal.o.f(viewStub, "getSourceLineViewStub(...)");
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f204892g;
        if (mvvmView == null) {
            kotlin.jvm.internal.o.o("sourceView");
            throw null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        try {
            android.view.ViewParent parent = viewStub.getParent();
            viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            indexOfChild = viewGroup != null ? viewGroup.indexOfChild(viewStub) : -1;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("DSLComponents", "inflateWithView exp=" + e17);
        }
        if (indexOfChild >= 0) {
            if (viewGroup != null) {
                viewGroup.removeViewInLayout(viewStub);
            }
            android.view.ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            if (layoutParams != null) {
                if (viewGroup != null) {
                    viewGroup.addView(mvvmView, indexOfChild, layoutParams);
                }
            } else if (viewGroup != null) {
                viewGroup.addView(mvvmView, indexOfChild);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
            android.view.View view = xVar.f254898a;
            kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
            return view;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        android.view.View view2 = xVar.f254898a;
        kotlin.jvm.internal.o.f(view2, "getInflateRootView(...)");
        return view2;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        c11.g gVar = (c11.g) pVar2;
        if (gVar == null) {
            return;
        }
        em.x xVar = this.f204891f;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (xVar.f254900c == null) {
            xVar.f254900c = (com.tencent.mm.view.StretchFrameLayout) xVar.f254898a.findViewById(com.tencent.mm.R.id.root_view);
        }
        xVar.f254900c.setLayoutConfig(new ym5.a6(5.0d, 0.0d, 3.5d, 0.0d, 0, 26, null));
        em.x xVar2 = this.f204891f;
        if (xVar2 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (xVar2.f254901d == null) {
            xVar2.f254901d = (com.tencent.mm.ui.widget.MMTextView) xVar2.f254898a.findViewById(com.tencent.mm.R.id.odf);
        }
        xVar2.f254901d.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        em.x xVar3 = this.f204891f;
        if (xVar3 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (xVar3.f254901d == null) {
            xVar3.f254901d = (com.tencent.mm.ui.widget.MMTextView) xVar3.f254898a.findViewById(com.tencent.mm.R.id.odf);
        }
        com.tencent.mm.ui.widget.MMTextView mMTextView = xVar3.f254901d;
        kotlin.jvm.internal.o.f(mMTextView, "getTitleTv(...)");
        setTagAndTitleTo(mMTextView);
        em.x xVar4 = this.f204891f;
        if (xVar4 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (xVar4.f254899b == null) {
            xVar4.f254899b = (com.tencent.mm.ui.widget.MMTextView) xVar4.f254898a.findViewById(com.tencent.mm.R.id.cut);
        }
        xVar4.f254899b.setText(gVar.f37846e);
        em.x xVar5 = this.f204891f;
        if (xVar5 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (xVar5.f254899b == null) {
            xVar5.f254899b = (com.tencent.mm.ui.widget.MMTextView) xVar5.f254898a.findViewById(com.tencent.mm.R.id.cut);
        }
        xVar5.f254899b.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.t_));
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f204892g;
        if (mvvmView == null) {
            kotlin.jvm.internal.o.o("sourceView");
            throw null;
        }
        mvvmView.setViewModel(gVar.f37855q);
        em.x xVar6 = this.f204891f;
        if (xVar6 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (xVar6.f254900c == null) {
            xVar6.f254900c = (com.tencent.mm.view.StretchFrameLayout) xVar6.f254898a.findViewById(com.tencent.mm.R.id.root_view);
        }
        com.tencent.mm.view.StretchFrameLayout stretchFrameLayout = xVar6.f254900c;
        kotlin.jvm.internal.o.f(stretchFrameLayout, "getRootView(...)");
        int a17 = (stretchFrameLayout.getLayoutParams().width - ((c44.b.a(6) * 2) + (c44.b.a(4) * 3))) / 4;
        em.x xVar7 = this.f204891f;
        if (xVar7 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        com.tencent.mm.ui.MMImageView a18 = xVar7.a();
        em.x xVar8 = this.f204891f;
        if (xVar8 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = xVar8.a().getLayoutParams();
        layoutParams.width = a17;
        layoutParams.height = a17;
        a18.setLayoutParams(layoutParams);
        gk0.k kVar = new gk0.k(a17, a17);
        kVar.f272434e = 0;
        kVar.f272435f = null;
        kVar.f272436g = gVar.f37850i;
        kVar.f272433d = 0.05f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(gVar.f37847f);
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            setBackgroundResource(valueOf.intValue());
        }
        yz5.l lVar = gVar.f37854p;
        if (lVar != null) {
            em.x xVar9 = this.f204891f;
            if (xVar9 == null) {
                kotlin.jvm.internal.o.o("holder");
                throw null;
            }
            com.tencent.mm.ui.MMImageView a19 = xVar9.a();
            kotlin.jvm.internal.o.f(a19, "getThumbIv(...)");
            lVar.invoke(a19);
        } else {
            if (com.tencent.mm.vfs.w6.j(gVar.f37851m)) {
                gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
                em.x xVar10 = this.f204891f;
                if (xVar10 == null) {
                    kotlin.jvm.internal.o.o("holder");
                    throw null;
                }
                com.tencent.mm.ui.MMImageView a27 = xVar10.a();
                kotlin.jvm.internal.o.f(a27, "getThumbIv(...)");
                java.lang.String str = gVar.f37851m;
                ((h83.g) n0Var).Ai(a27, str != null ? str : "", kVar);
            } else {
                java.lang.String str2 = gVar.f37852n;
                if (str2 == null || r26.n0.N(str2)) {
                    v05.a aVar = gVar.f37853o;
                    if (aVar != null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tempcover_");
                        java.lang.String o17 = aVar.o();
                        if (!java.lang.Boolean.valueOf(o17.length() > 0).booleanValue()) {
                            o17 = null;
                        }
                        if (o17 == null) {
                            o17 = aVar.A();
                        }
                        sb6.append(o17);
                        y01.a aVar2 = new y01.a(sb6.toString());
                        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.A())) {
                            aVar2.a(aVar.j());
                            aVar2.d(aVar.o());
                            aVar2.b(aVar.n());
                            aVar2.f458575d = 3;
                        } else {
                            aVar2.a(aVar.w());
                            aVar2.d(aVar.A());
                            aVar2.b(aVar.z());
                            aVar2.c(aVar.u());
                            aVar2.f458575d = 19;
                        }
                        em.x xVar11 = this.f204891f;
                        if (xVar11 == null) {
                            kotlin.jvm.internal.o.o("holder");
                            throw null;
                        }
                        ho.b.a(aVar2, xVar11.a(), kVar);
                    }
                } else {
                    java.lang.String str3 = gVar.f37852n;
                    gk0.h hVar = new gk0.h(str3 != null ? str3 : "");
                    java.lang.String Bi = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Bi(hVar, kVar);
                    i95.m c17 = i95.n0.c(gk0.n0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    gk0.n0 n0Var2 = (gk0.n0) c17;
                    em.x xVar12 = this.f204891f;
                    if (xVar12 == null) {
                        kotlin.jvm.internal.o.o("holder");
                        throw null;
                    }
                    g75.z x66 = gk0.n0.x6(n0Var2, Bi, kVar, xVar12.a(), null, 8, null);
                    x66.l("Common_HttpParams", hVar);
                    gk0.j.b(((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ri(), x66, null, 2, null);
                }
            }
        }
        em.x xVar13 = this.f204891f;
        if (xVar13 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (xVar13.f254903f == null) {
            xVar13.f254903f = (com.tencent.mm.chatting.widget.MaskVideoIconMvvmView) xVar13.f254898a.findViewById(com.tencent.mm.R.id.ven);
        }
        com.tencent.mm.chatting.widget.MaskVideoIconMvvmView maskVideoIconMvvmView = xVar13.f254903f;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(gVar.f37848g);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(maskVideoIconMvvmView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(maskVideoIconMvvmView, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingSingleCoverViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/SingleCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/SingleCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        maskVideoIconMvvmView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(maskVideoIconMvvmView, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingSingleCoverViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/SingleCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/SingleCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(maskVideoIconMvvmView, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf2, maskVideoIconMvvmView)) == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(maskVideoIconMvvmView, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(maskVideoIconMvvmView, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingSingleCoverViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/SingleCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/SingleCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            maskVideoIconMvvmView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(maskVideoIconMvvmView, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingSingleCoverViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/SingleCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/SingleCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(maskVideoIconMvvmView, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View.OnClickListener onClickListener = gVar.f37856r;
        if (onClickListener != null) {
            setOnClickListener(onClickListener);
        }
    }

    public /* synthetic */ ChattingSingleCoverViewNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingSingleCoverViewNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
