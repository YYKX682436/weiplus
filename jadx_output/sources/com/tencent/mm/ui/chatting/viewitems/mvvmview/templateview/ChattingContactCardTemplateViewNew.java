package com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lc11/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ChattingContactCardTemplateViewNew extends com.tencent.mm.mvvm.MvvmView<c11.a> {

    /* renamed from: f, reason: collision with root package name */
    public em.i f204883f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f204884g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChattingContactCardTemplateViewNew(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.mvvm.MvvmView
    public android.view.View c(android.content.Context context) {
        android.view.ViewGroup viewGroup;
        int indexOfChild;
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e0s, (android.view.ViewGroup) this, false);
        em.i iVar = new em.i(inflate);
        this.f204883f = iVar;
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.f204884g = ((ko.a) ((q31.t) ((q31.r) c17)).wi()).b(context);
        if (iVar.f254408d == null) {
            iVar.f254408d = (android.view.ViewStub) inflate.findViewById(com.tencent.mm.R.id.szi);
        }
        android.view.ViewStub viewStub = iVar.f254408d;
        kotlin.jvm.internal.o.f(viewStub, "getContactSourceViewStub(...)");
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f204884g;
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
            return iVar.f254405a;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        return iVar.f254405a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.View] */
    @Override // com.tencent.mm.mvvm.MvvmView
    public void e(q31.p pVar, q31.p pVar2) {
        c11.a aVar = (c11.a) pVar2;
        if (aVar == null) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(aVar.f37800d);
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            em.i iVar = this.f204883f;
            if (iVar == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            if (iVar.f254407c == null) {
                iVar.f254407c = (com.tencent.mm.view.StretchFrameLayout) iVar.f254405a.findViewById(com.tencent.mm.R.id.f483649sq2);
            }
            iVar.f254407c.setBackgroundResource(intValue);
        }
        int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479718db);
        gk0.k kVar = new gk0.k(h17, h17);
        kVar.f272432c = 2.0f;
        kVar.f272436g = i65.a.i(getContext(), com.tencent.mm.R.drawable.bhm);
        yz5.l lVar = aVar.f37801e;
        if (lVar != null) {
            em.i iVar2 = this.f204883f;
            if (iVar2 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            if (iVar2.f254406b == null) {
                iVar2.f254406b = (android.widget.ImageView) iVar2.f254405a.findViewById(com.tencent.mm.R.id.ca7);
            }
            android.widget.ImageView imageView = iVar2.f254406b;
            kotlin.jvm.internal.o.f(imageView, "getContactAvatarIv(...)");
            lVar.invoke(imageView);
        } else if (com.tencent.mm.vfs.w6.j(null)) {
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            em.i iVar3 = this.f204883f;
            if (iVar3 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            if (iVar3.f254406b == null) {
                iVar3.f254406b = (android.widget.ImageView) iVar3.f254405a.findViewById(com.tencent.mm.R.id.ca7);
            }
            android.widget.ImageView imageView2 = iVar3.f254406b;
            kotlin.jvm.internal.o.f(imageView2, "getContactAvatarIv(...)");
            ((h83.g) n0Var).Ai(imageView2, "", kVar);
        }
        em.i iVar4 = this.f204883f;
        if (iVar4 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (iVar4.f254411g == null) {
            iVar4.f254411g = (com.tencent.mm.ui.widget.MMTextView) iVar4.f254405a.findViewById(com.tencent.mm.R.id.sza);
        }
        iVar4.f254411g.setText(aVar.f37802f);
        em.i iVar5 = this.f204883f;
        if (iVar5 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        iVar5.b().setText(aVar.f37806m);
        java.lang.Integer num = aVar.f37807n;
        if (num != null) {
            int intValue2 = num.intValue();
            em.i iVar6 = this.f204883f;
            if (iVar6 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            iVar6.b().setTextColor(intValue2);
        }
        em.i iVar7 = this.f204883f;
        if (iVar7 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        com.tencent.mm.ui.widget.MMTextView b17 = iVar7.b();
        java.lang.CharSequence charSequence = aVar.f37806m;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(!(charSequence == null || charSequence.length() == 0));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf2, b17)) == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(b17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue4 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue4));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(b17, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        em.i iVar8 = this.f204883f;
        if (iVar8 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (iVar8.f254410f == null) {
            iVar8.f254410f = (com.tencent.mm.ui.widget.imageview.WeImageView) iVar8.f254405a.findViewById(com.tencent.mm.R.id.sxu);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = iVar8.f254410f;
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(aVar.f37809p);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(weImageView, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue5 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue5));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(weImageView, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        weImageView.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(weImageView, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(weImageView, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (((android.view.View) pm0.v.E(valueOf3, weImageView)) == null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(weImageView, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue6 = ((java.lang.Integer) arrayList7.get(0)).intValue();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(intValue6));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(weImageView, arrayList8.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            weImageView.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(weImageView, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(weImageView, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yz5.l lVar2 = aVar.f37803g;
        if (lVar2 != null) {
            em.i iVar9 = this.f204883f;
            if (iVar9 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            com.tencent.mm.ui.widget.imageview.WeImageView a17 = iVar9.a();
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(a17, arrayList9.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue7 = ((java.lang.Integer) arrayList9.get(0)).intValue();
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(java.lang.Integer.valueOf(intValue7));
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(a17, arrayList10.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            em.i iVar10 = this.f204883f;
            if (iVar10 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            com.tencent.mm.ui.widget.imageview.WeImageView a18 = iVar10.a();
            kotlin.jvm.internal.o.f(a18, "getContactAuthIconIv(...)");
            lVar2.invoke(a18);
        } else {
            em.i iVar11 = this.f204883f;
            if (iVar11 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            iVar11.a().setImageResource(aVar.f37804h);
            em.i iVar12 = this.f204883f;
            if (iVar12 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            iVar12.a().setIconColor(aVar.f37805i);
            em.i iVar13 = this.f204883f;
            if (iVar13 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            com.tencent.mm.ui.widget.imageview.WeImageView a19 = iVar13.a();
            java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(aVar.f37804h != 0);
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(0);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(a19, arrayList11.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue8 = ((java.lang.Integer) arrayList11.get(0)).intValue();
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(java.lang.Integer.valueOf(intValue8));
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(a19, arrayList12.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a19.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(a19, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(a19, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ?? r37 = (android.view.View) pm0.v.E(valueOf4, a19);
            if (r37 == 0) {
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                arrayList13.add(8);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(a19, arrayList13.toArray(), "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue9 = ((java.lang.Integer) arrayList13.get(0)).intValue();
                java.util.ArrayList arrayList14 = new java.util.ArrayList();
                arrayList14.add(java.lang.Integer.valueOf(intValue9));
                java.util.Collections.reverse(arrayList14);
                yj0.a.d(a19, arrayList14.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a19.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                yj0.a.f(a19, "com/tencent/mm/ui/chatting/viewitems/mvvmview/templateview/ChattingContactCardTemplateViewNew", "onUpdateViewModel", "(Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;Lcom/tencent/mm/modelchatting/templateview/ContactCardTemplateViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(a19, "com/tencent/mm/kt/CommonKt", "visibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                a19 = r37;
            }
        }
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f204884g;
        if (mvvmView == null) {
            kotlin.jvm.internal.o.o("sourceView");
            throw null;
        }
        a11.b bVar = new a11.b();
        java.lang.String str = aVar.f37808o;
        bVar.f501e = str != null ? str : "";
        mvvmView.setViewModel(bVar);
        em.i iVar14 = this.f204883f;
        if (iVar14 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (iVar14.f254407c == null) {
            iVar14.f254407c = (com.tencent.mm.view.StretchFrameLayout) iVar14.f254405a.findViewById(com.tencent.mm.R.id.f483649sq2);
        }
        iVar14.f254407c.setLayoutConfig(new ym5.a6(5.0d, 0.0d, 3.5d, 0.0d, 0, 26, null));
    }

    public /* synthetic */ ChattingContactCardTemplateViewNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChattingContactCardTemplateViewNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
