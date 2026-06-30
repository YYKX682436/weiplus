package yk4;

/* loaded from: classes10.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.comment.view.TingCommentFooter f462833d;

    public b0(com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter) {
        this.f462833d = tingCommentFooter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        m40.k0 finderConfigService;
        m40.k0 finderConfigService2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/comment/view/TingCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462833d;
        finderConfigService = tingCommentFooter.getFinderConfigService();
        if (((c61.p7) finderConfigService).aj() > 0) {
            finderConfigService2 = tingCommentFooter.getFinderConfigService();
            ((c61.p7) finderConfigService2).getClass();
            com.tencent.mm.plugin.finder.storage.t70.f127590a.c3(0);
            android.view.View switchSceneTip = tingCommentFooter.getSwitchSceneTip();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(switchSceneTip, arrayList2.toArray(), "com/tencent/mm/plugin/ting/comment/view/TingCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            switchSceneTip.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(switchSceneTip, "com/tencent/mm/plugin/ting/comment/view/TingCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            uk4.e eVar = new uk4.e(tingCommentFooter.getContext());
            android.view.LayoutInflater.from(eVar.f428532f.getContext()).inflate(com.tencent.mm.R.layout.f489580d16, eVar.f428542s, true);
            com.tencent.mm.ui.bk.r0(((android.widget.TextView) eVar.f428532f.findViewById(com.tencent.mm.R.id.fsz)).getPaint(), 0.8f);
            android.view.View findViewById = eVar.f428532f.findViewById(com.tencent.mm.R.id.fsx);
            kotlin.jvm.internal.o.d(findViewById);
            com.tencent.mm.plugin.ting.comment.view.TingCommentFooter.b(tingCommentFooter, findViewById, 1, new yk4.z(tingCommentFooter, eVar));
            android.view.View findViewById2 = eVar.f428532f.findViewById(com.tencent.mm.R.id.fsy);
            kotlin.jvm.internal.o.d(findViewById2);
            com.tencent.mm.plugin.ting.comment.view.TingCommentFooter.b(tingCommentFooter, findViewById2, 2, new yk4.a0(tingCommentFooter, eVar));
            eVar.f428533g = eVar.a();
            android.content.Context context = eVar.f428531e;
            eVar.f428534h = context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
            if (eVar.f428530d != null) {
                ((android.view.ViewGroup) eVar.f428532f.getParent()).setVisibility(0);
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) eVar.f428532f.getLayoutParams();
                boolean z17 = eVar.f428538o;
                android.view.View view2 = eVar.f428536m;
                if (!z17 && eVar.f428533g && view2 != null) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    view2.getWindowVisibleDisplayFrame(rect);
                    layoutParams.width = java.lang.Math.min(rect.right, rect.bottom);
                    layoutParams.gravity = 1;
                    android.view.ViewParent parent = eVar.f428532f.getParent();
                    if (parent instanceof android.view.View) {
                        ((android.view.View) parent).setOnTouchListener(new uk4.c(eVar, parent));
                    }
                    if (parent instanceof android.view.ViewGroup) {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                        if (viewGroup.getLayoutParams() instanceof androidx.coordinatorlayout.widget.c) {
                            androidx.coordinatorlayout.widget.c cVar = (androidx.coordinatorlayout.widget.c) viewGroup.getLayoutParams();
                            uk4.d dVar = new uk4.d(eVar);
                            cVar.b(dVar);
                            eVar.f428539p = dVar;
                            dVar.D(3);
                        }
                    }
                }
                eVar.f428532f.setLayoutParams(layoutParams);
                eVar.f428530d.getWindow().addFlags(Integer.MIN_VALUE);
                eVar.f428530d.getWindow().clearFlags(8);
                eVar.f428530d.getWindow().clearFlags(131072);
                eVar.f428530d.getWindow().clearFlags(128);
                eVar.f428530d.getWindow().getDecorView().setSystemUiVisibility(0);
                if (view2 != null) {
                    boolean z18 = eVar.f428537n == null;
                    android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                    eVar.f428537n = viewTreeObserver;
                    if (z18) {
                        viewTreeObserver.addOnGlobalLayoutListener(eVar);
                    }
                }
                if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
                    eVar.f428530d.show();
                }
                com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = eVar.f428539p;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.f44443p = false;
                }
            }
        } else {
            com.tencent.mm.plugin.ting.comment.view.TingCommentFooter.c(tingCommentFooter);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ting/comment/view/TingCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
