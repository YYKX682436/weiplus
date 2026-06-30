package com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lc11/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingLargeCoverView extends com.tencent.mm.mvvm.MvvmView<c11.e> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f204885h = 0;

    /* renamed from: f, reason: collision with root package name */
    public em.q f204886f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f204887g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingLargeCoverView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        android.view.ViewGroup viewGroup;
        int indexOfChild;
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488573e21, (android.view.ViewGroup) this, false);
        em.q qVar = new em.q(inflate);
        this.f204886f = qVar;
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.f204887g = ((ko.a) ((q31.t) ((q31.r) c17)).wi()).b(context);
        if (qVar.f254712f == null) {
            qVar.f254712f = (android.view.ViewStub) inflate.findViewById(com.tencent.mm.R.id.v_2);
        }
        android.view.ViewStub viewStub = qVar.f254712f;
        kotlin.jvm.internal.o.f(viewStub, "getSourceLineViewStub(...)");
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f204887g;
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
            android.view.View view = qVar.f254707a;
            kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
            return view;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        android.view.View view2 = qVar.f254707a;
        kotlin.jvm.internal.o.f(view2, "getInflateRootView(...)");
        return view2;
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        java.lang.String str;
        java.lang.String str2;
        c11.b bVar;
        java.lang.Number valueOf;
        java.lang.String str3;
        c11.e eVar = (c11.e) pVar2;
        if (eVar == null) {
            return;
        }
        em.q qVar = this.f204886f;
        if (qVar == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        qVar.a().b(eVar.f37828d);
        em.q qVar2 = this.f204886f;
        if (qVar2 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        com.tencent.mm.ui.widget.MMNeat7extView a17 = qVar2.a();
        java.lang.CharSequence charSequence = eVar.f37828d;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(!(charSequence == null || r26.n0.N(charSequence)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(a17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf2, a17)) == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(a17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(a17, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        em.q qVar3 = this.f204886f;
        if (qVar3 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (qVar3.f254708b == null) {
            qVar3.f254708b = (com.tencent.mm.ui.widget.MMNeat7extView) qVar3.f254707a.findViewById(com.tencent.mm.R.id.cut);
        }
        qVar3.f254708b.b(eVar.f37829e);
        em.q qVar4 = this.f204886f;
        if (qVar4 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (qVar4.f254708b == null) {
            qVar4.f254708b = (com.tencent.mm.ui.widget.MMNeat7extView) qVar4.f254707a.findViewById(com.tencent.mm.R.id.cut);
        }
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = qVar4.f254708b;
        java.lang.String str4 = eVar.f37829e;
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(!(str4 == null || r26.n0.N(str4)));
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(mMNeat7extView, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(mMNeat7extView, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mMNeat7extView.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(mMNeat7extView, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(mMNeat7extView, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf3, mMNeat7extView)) == null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(mMNeat7extView, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(intValue4));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(mMNeat7extView, arrayList8.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mMNeat7extView.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(mMNeat7extView, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingLargeCoverView", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;Lcom/tencent/mm/modelchatting/templateview/LargeCoverViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(mMNeat7extView, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        em.q qVar5 = this.f204886f;
        if (qVar5 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        com.tencent.mm.ui.widget.MMNeat7extView a18 = qVar5.a();
        java.lang.String str5 = eVar.f37829e;
        a18.setMaxLines(!(str5 == null || r26.n0.N(str5)) ? 1 : 2);
        int i17 = eVar.f37830f;
        if (i17 != 0) {
            setBackgroundResource(i17);
        }
        em.q qVar6 = this.f204886f;
        if (qVar6 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (qVar6.f254713g == null) {
            qVar6.f254713g = (android.widget.ImageView) qVar6.f254707a.findViewById(com.tencent.mm.R.id.f487295o70);
        }
        android.widget.ImageView imageView = qVar6.f254713g;
        kotlin.jvm.internal.o.f(imageView, "getThumbIv(...)");
        em.q qVar7 = this.f204886f;
        if (qVar7 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (qVar7.f254710d == null) {
            qVar7.f254710d = (android.widget.FrameLayout) qVar7.f254707a.findViewById(com.tencent.mm.R.id.veg);
        }
        android.widget.FrameLayout frameLayout = qVar7.f254710d;
        kotlin.jvm.internal.o.f(frameLayout, "getThumbMaskContainer(...)");
        frameLayout.removeAllViews();
        c11.c cVar = eVar.f37832h;
        int i18 = kf5.c.f307501a;
        gk0.k kVar = new gk0.k(i18, i18);
        java.lang.String str6 = "";
        if (cVar == null || (str = cVar.f37821a) == null) {
            str = "";
        }
        if (com.tencent.mm.vfs.w6.j(str)) {
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            if (cVar != null && (str3 = cVar.f37821a) != null) {
                str6 = str3;
            }
            ((h83.g) n0Var).Ai(imageView, str6, kVar);
            g(frameLayout, eVar);
            str2 = "getThumbMaskContainer(...)";
        } else if (cVar == null || (bVar = cVar.f37822b) == null) {
            str2 = "getThumbMaskContainer(...)";
            yz5.p pVar3 = eVar.f37833i;
            if (pVar3 != null) {
                pVar3.invoke(imageView, new kf5.b(this, frameLayout, eVar));
            }
        } else {
            y01.a c17 = af5.y0.c(bVar);
            java.lang.String wi6 = ((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).wi(kVar, c17);
            i95.m c18 = i95.n0.c(gk0.n0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            str2 = "getThumbMaskContainer(...)";
            g75.z x66 = gk0.n0.x6((gk0.n0) c18, wi6, kVar, imageView, null, 8, null);
            x66.l("KeyCdnParams", c17);
            ((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).Ai().a(x66, new java.lang.ref.WeakReference(new kf5.a(this, frameLayout, eVar, imageView)));
        }
        em.q qVar8 = this.f204886f;
        if (qVar8 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (qVar8.f254709c == null) {
            qVar8.f254709c = (com.tencent.mm.view.StretchFrameLayout) qVar8.f254707a.findViewById(com.tencent.mm.R.id.root_view);
        }
        com.tencent.mm.view.StretchFrameLayout stretchFrameLayout = qVar8.f254709c;
        kotlin.jvm.internal.o.f(stretchFrameLayout, "getRootView(...)");
        em.q qVar9 = this.f204886f;
        if (qVar9 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (qVar9.f254713g == null) {
            qVar9.f254713g = (android.widget.ImageView) qVar9.f254707a.findViewById(com.tencent.mm.R.id.f487295o70);
        }
        android.widget.ImageView imageView2 = qVar9.f254713g;
        kotlin.jvm.internal.o.f(imageView2, "getThumbIv(...)");
        em.q qVar10 = this.f204886f;
        if (qVar10 == null) {
            kotlin.jvm.internal.o.o("holder");
            throw null;
        }
        if (qVar10.f254710d == null) {
            qVar10.f254710d = (android.widget.FrameLayout) qVar10.f254707a.findViewById(com.tencent.mm.R.id.veg);
        }
        android.widget.FrameLayout frameLayout2 = qVar10.f254710d;
        kotlin.jvm.internal.o.f(frameLayout2, str2);
        int ordinal = eVar.f37831g.ordinal();
        stretchFrameLayout.setLayoutConfig(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? new ym5.a6(3.0d, 0.0d, 0.0d, 0.0d, 0, 30, null) : new ym5.a6(3.0d, 0.0d, 0.0d, 0.0d, 0, 30, null) : new ym5.a6(4.0d, 0.0d, 0.0d, 0.0d, 0, 30, null) : new ym5.a6(3.0d, 0.0d, 0.0d, 0.0d, 0, 30, null));
        int a19 = stretchFrameLayout.getLayoutParams().width - c44.b.a(12);
        int ordinal2 = eVar.f37831g.ordinal();
        if (ordinal2 == 0) {
            valueOf = java.lang.Double.valueOf((a19 / 3.0d) * 4.0d);
        } else if (ordinal2 == 1) {
            valueOf = java.lang.Double.valueOf((a19 / 4.0d) * 3.0d);
        } else {
            if (ordinal2 != 2) {
                throw new jz5.j();
            }
            valueOf = java.lang.Integer.valueOf(a19);
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        layoutParams.width = a19;
        layoutParams.height = valueOf.intValue();
        imageView2.setLayoutParams(layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
        layoutParams2.width = a19;
        layoutParams2.height = valueOf.intValue();
        frameLayout2.setLayoutParams(layoutParams2);
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f204887g;
        if (mvvmView != null) {
            mvvmView.setViewModel(eVar.f37834m);
        } else {
            kotlin.jvm.internal.o.o("sourceView");
            throw null;
        }
    }

    public final void g(android.widget.FrameLayout frameLayout, c11.e eVar) {
        java.util.List<android.view.View> list;
        frameLayout.removeAllViews();
        c11.c cVar = eVar.f37832h;
        if (cVar == null || (list = cVar.f37823c) == null) {
            return;
        }
        for (android.view.View view : list) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    public /* synthetic */ ChattingLargeCoverView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingLargeCoverView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
