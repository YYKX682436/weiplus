package lm3;

/* loaded from: classes10.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.e1 f319522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm3.e f319523e;

    public y(com.tencent.mm.plugin.mv.ui.uic.e1 e1Var, lm3.e eVar) {
        this.f319522d = e1Var;
        this.f319523e = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fm3.u musicMv = this.f319523e.f319482d;
        com.tencent.mm.plugin.mv.ui.uic.e1 e1Var = this.f319522d;
        e1Var.getClass();
        kotlin.jvm.internal.o.g(musicMv, "musicMv");
        androidx.appcompat.app.AppCompatActivity activity = e1Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC) zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.class)).f150986s.f213605w = true;
        androidx.appcompat.app.AppCompatActivity activity2 = e1Var.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        androidx.lifecycle.c1 a17 = zVar.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        androidx.appcompat.app.AppCompatActivity activity3 = e1Var.getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        androidx.lifecycle.c1 a18 = zVar.a(activity3).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) a18;
        java.util.ArrayList arrayList2 = ((com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC) a17).f150977g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((lm3.e) it.next()).f319482d);
        }
        int i17 = n0Var.C;
        com.tencent.mm.plugin.mv.ui.view.h2 h2Var = e1Var.f151108f;
        h2Var.getClass();
        java.util.ArrayList arrayList4 = h2Var.f151842e;
        arrayList4.clear();
        h2Var.f151846i = musicMv;
        java.util.Iterator it6 = arrayList3.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            fm3.u uVar = (fm3.u) next;
            if (fm3.u.A.e(uVar)) {
                arrayList4.add(new com.tencent.mm.plugin.mv.ui.view.d2(i18, uVar, i17));
            }
            i18 = i19;
        }
        boolean isEmpty = arrayList4.isEmpty();
        jz5.g gVar = h2Var.f151845h;
        if (isEmpty) {
            h2Var.f151848n = in5.n0.P((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) ((jz5.n) gVar).getValue(), h2Var.f151847m, -2, false, 4, null);
        } else {
            in5.w wVar = h2Var.f151848n;
            if (wVar != null) {
                ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) ((jz5.n) gVar).getValue()).g0(((in5.a0) wVar).getItemId(), false);
            }
        }
        android.widget.TextView textView = h2Var.f151844g;
        if (textView != null) {
            textView.setText(h2Var.f151841d.getString(com.tencent.mm.R.string.h5g, java.lang.Integer.valueOf(arrayList4.size())));
        }
        ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) ((jz5.n) gVar).getValue()).notifyDataSetChanged();
        wl3.e eVar = h2Var.f151843f;
        if (!eVar.b()) {
            eVar.f447059g = eVar.a();
            android.content.Context context = eVar.f447056d;
            eVar.f447060h = context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
            if (eVar.f447057e != null) {
                android.view.View view2 = eVar.f447058f;
                kotlin.jvm.internal.o.d(view2);
                android.view.ViewParent parent = view2.getParent();
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).setVisibility(0);
                android.view.View view3 = eVar.f447058f;
                kotlin.jvm.internal.o.d(view3);
                android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                boolean z17 = eVar.f447059g;
                android.view.View view4 = eVar.f447061i;
                if (z17 && view4 != null) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    view4.getWindowVisibleDisplayFrame(rect);
                    layoutParams2.width = rect.right;
                }
                android.view.View view5 = eVar.f447058f;
                kotlin.jvm.internal.o.d(view5);
                view5.setLayoutParams(layoutParams2);
                android.app.Dialog dialog = eVar.f447057e;
                kotlin.jvm.internal.o.d(dialog);
                android.view.Window window = dialog.getWindow();
                kotlin.jvm.internal.o.d(window);
                window.addFlags(Integer.MIN_VALUE);
                android.app.Dialog dialog2 = eVar.f447057e;
                kotlin.jvm.internal.o.d(dialog2);
                android.view.Window window2 = dialog2.getWindow();
                kotlin.jvm.internal.o.d(window2);
                window2.clearFlags(8);
                android.app.Dialog dialog3 = eVar.f447057e;
                kotlin.jvm.internal.o.d(dialog3);
                android.view.Window window3 = dialog3.getWindow();
                kotlin.jvm.internal.o.d(window3);
                window3.clearFlags(131072);
                android.app.Dialog dialog4 = eVar.f447057e;
                kotlin.jvm.internal.o.d(dialog4);
                android.view.Window window4 = dialog4.getWindow();
                kotlin.jvm.internal.o.d(window4);
                window4.clearFlags(128);
                android.app.Dialog dialog5 = eVar.f447057e;
                kotlin.jvm.internal.o.d(dialog5);
                android.view.Window window5 = dialog5.getWindow();
                kotlin.jvm.internal.o.d(window5);
                window5.getDecorView().setSystemUiVisibility(0);
                if (view4 != null) {
                    boolean z18 = eVar.f447062m == null;
                    android.view.ViewTreeObserver viewTreeObserver = view4.getViewTreeObserver();
                    eVar.f447062m = viewTreeObserver;
                    if (z18) {
                        kotlin.jvm.internal.o.d(viewTreeObserver);
                        viewTreeObserver.addOnGlobalLayoutListener(eVar);
                    }
                }
                if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
                    android.app.Dialog dialog6 = eVar.f447057e;
                    kotlin.jvm.internal.o.d(dialog6);
                    dialog6.show();
                }
                com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = eVar.f447063n;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.f44443p = false;
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
