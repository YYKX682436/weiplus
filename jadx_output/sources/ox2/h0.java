package ox2;

/* loaded from: classes10.dex */
public final class h0 {

    /* renamed from: g, reason: collision with root package name */
    public static final ox2.g0 f349661g = new ox2.g0(null);

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f349662a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f349663b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.y1 f349664c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f349665d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview f349666e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f349667f;

    public h0(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.api.IEmojiInfo iEmojiInfo, java.lang.CharSequence title, java.lang.CharSequence charSequence, yz5.l lVar, yz5.l lVar2, int i17, kotlin.jvm.internal.i iVar) {
        android.view.ViewGroup viewGroup;
        android.view.View view;
        android.view.View view2;
        android.view.ViewGroup.LayoutParams layoutParams = null;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = (i17 & 2) != 0 ? null : iEmojiInfo;
        java.lang.CharSequence charSequence2 = (i17 & 8) != 0 ? null : charSequence;
        yz5.l lVar3 = (i17 & 16) != 0 ? null : lVar;
        yz5.l lVar4 = (i17 & 32) != 0 ? null : lVar2;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(title, "title");
        this.f349662a = lVar3;
        this.f349663b = lVar4;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(activity);
        this.f349664c = y1Var;
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.tencent.mm.R.layout.e5s, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f349665d = inflate;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oqh);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.om7);
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview centerInteractionEasterEggDarkPreview = (com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview) inflate.findViewById(com.tencent.mm.R.id.t2o);
        this.f349666e = centerInteractionEasterEggDarkPreview;
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.smf);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f483446sl2);
        this.f349667f = findViewById;
        com.tencent.mm.plugin.finder.view.FinderDraggableIndicator finderDraggableIndicator = (com.tencent.mm.plugin.finder.view.FinderDraggableIndicator) inflate.findViewById(com.tencent.mm.R.id.tcu);
        if (textView != null) {
            com.tencent.mm.ui.fk.b(textView);
        }
        if (textView != null) {
            textView.setText(title);
        }
        if (!(charSequence2 == null || charSequence2.length() == 0)) {
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
            if (textView2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(textView2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(textView2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(textView2, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(textView2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (textView2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(textView2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(textView2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(textView2, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(textView2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (centerInteractionEasterEggDarkPreview != null) {
            centerInteractionEasterEggDarkPreview.setEmoji(iEmojiInfo2);
        }
        if (lVar3 != null) {
            if (findViewById != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(java.lang.Integer.valueOf(intValue3));
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(findViewById, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (button != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(button, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(java.lang.Integer.valueOf(intValue4));
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(button, arrayList8.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                button.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(button, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(button, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (button != null) {
                button.setOnClickListener(new ox2.d0(this));
            }
        } else {
            if (findViewById != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList9.add(0);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(findViewById, arrayList9.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue5 = ((java.lang.Integer) arrayList9.get(0)).intValue();
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(java.lang.Integer.valueOf(intValue5));
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(findViewById, arrayList10.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(findViewById, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (button != null) {
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList11.add(8);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(button, arrayList11.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue6 = ((java.lang.Integer) arrayList11.get(0)).intValue();
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                arrayList12.add(java.lang.Integer.valueOf(intValue6));
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(button, arrayList12.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                button.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(button, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggPreviewHalfScreen", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/tencent/mm/api/IEmojiInfo;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(button, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        y1Var.f212037s = new ox2.e0(this);
        if (finderDraggableIndicator != null) {
            finderDraggableIndicator.setOnBottomSheetDismiss(new ox2.f0(this));
        }
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = y1Var.f212036r;
        if (bottomSheetBehavior != null && finderDraggableIndicator != null && (viewGroup = finderDraggableIndicator.f130980d) != null && (view = finderDraggableIndicator.f130981e) != null && (view2 = finderDraggableIndicator.f130982f) != null) {
            finderDraggableIndicator.f130984h = bottomSheetBehavior;
            android.content.res.Resources resources = view.getContext().getResources();
            float dimension = resources.getDimension(com.tencent.mm.R.dimen.f479727dj);
            float dimension2 = resources.getDimension(com.tencent.mm.R.dimen.f479688cn);
            float dimension3 = resources.getDimension(com.tencent.mm.R.dimen.f479646bl);
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = (int) (((dimension2 - dimension3) * 1.0f) + dimension3 + com.tencent.mm.ui.kk.b(view));
                layoutParams = layoutParams2;
            }
            viewGroup.setLayoutParams(layoutParams);
            bottomSheetBehavior.f44453z = new com.tencent.mm.plugin.finder.view.y7(finderDraggableIndicator, dimension, view, view2, dimension3, dimension2);
        }
        y1Var.f212044z = true;
        y1Var.l(inflate, new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    public final void a() {
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview centerInteractionEasterEggDarkPreview = this.f349666e;
        if (centerInteractionEasterEggDarkPreview != null && !centerInteractionEasterEggDarkPreview.f132395o) {
            centerInteractionEasterEggDarkPreview.f132395o = true;
            com.tencent.mm.view.MMPAGView mMPAGView = centerInteractionEasterEggDarkPreview.f132390g;
            if (mMPAGView != null) {
                mMPAGView.setVisibility(0);
            }
            com.tencent.mm.view.MMPAGView mMPAGView2 = centerInteractionEasterEggDarkPreview.f132390g;
            if (mMPAGView2 != null) {
                mMPAGView2.post(new ox2.a0(centerInteractionEasterEggDarkPreview));
            }
            com.tencent.mm.view.MMPAGView mMPAGView3 = centerInteractionEasterEggDarkPreview.f132390g;
            if (mMPAGView3 != null) {
                try {
                    java.lang.String str = centerInteractionEasterEggDarkPreview.isThumbLike ? "finder_finger_like_animator_new.pag" : "finder_heart_like.pag";
                    cq.k1.a();
                    mMPAGView3.o(((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Z0().r()).booleanValue());
                    if (mMPAGView3.getUseRfx()) {
                        mMPAGView3.setComposition(com.tencent.mm.rfx.RfxPagFile.Load(mMPAGView3.getContext().getAssets(), str));
                    } else {
                        mMPAGView3.setComposition(org.libpag.PAGFile.Load(mMPAGView3.getContext().getAssets(), str));
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("CenterInteractionEasterEggDarkPreview", "initThumbPag e:" + th6);
                }
            }
            centerInteractionEasterEggDarkPreview.d();
        }
        this.f349664c.s();
    }
}
