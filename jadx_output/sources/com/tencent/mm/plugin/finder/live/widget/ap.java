package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ap implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hp f117789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f117790e;

    public ap(com.tencent.mm.plugin.finder.live.widget.hp hpVar, java.util.LinkedList linkedList) {
        this.f117789d = hpVar;
        this.f117790e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.f117789d;
        android.view.View view = hpVar.W1;
        android.view.ViewGroup viewGroup = view != null ? (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.f__) : null;
        android.view.View view2 = hpVar.W1;
        android.view.ViewGroup viewGroup2 = view2 != null ? (android.view.ViewGroup) view2.findViewById(com.tencent.mm.R.id.f_6) : null;
        android.view.ViewGroup viewGroup3 = hpVar.E1;
        android.widget.TextView textView = hpVar.f118588z1;
        android.widget.TextView textView2 = hpVar.Y;
        if (viewGroup == null || viewGroup2 == null || viewGroup3 == null || textView == null || textView2 == null) {
            i17 = 0;
        } else {
            int V0 = zl2.r4.f473950a.V0(viewGroup, new int[]{viewGroup2.getId()});
            int id6 = textView.getId();
            int childCount = viewGroup3.getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = viewGroup3.getChildAt(i18);
                kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
                if (childAt.getId() != id6 && childAt.getVisibility() == 0) {
                    int width = childAt.getWidth();
                    android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    int i19 = width + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
                    android.view.ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    V0 -= i19 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
                }
            }
            i17 = V0 + (textView2.getWidth() - textView2.getMinWidth());
            android.widget.TextView textView3 = hpVar.f118588z1;
            if (textView3 != null) {
                textView3.setWidth(i17);
            }
        }
        jz5.l d17 = gm2.c1.d(gm2.c1.f273320a, hpVar.f118588z1, hpVar.f118183e, " ", this.f117790e, new int[]{2, 13, 14, 17, 15, 16, 20}, gm2.c2.f273350i, null, 4, java.lang.Integer.valueOf(i17), null, 576, null);
        java.lang.Object obj = d17.f302834e;
        if (!(!((java.util.Collection) obj).isEmpty())) {
            android.widget.TextView textView4 = hpVar.f118588z1;
            if (textView4 != null) {
                textView4.setText("");
            }
            android.widget.TextView textView5 = hpVar.f118588z1;
            if (textView5 == null) {
                return;
            }
            textView5.setVisibility(8);
            return;
        }
        android.widget.TextView textView6 = hpVar.f118588z1;
        if (textView6 != null) {
            textView6.setText((java.lang.CharSequence) d17.f302833d);
        }
        android.widget.TextView textView7 = hpVar.f118588z1;
        if (textView7 != null) {
            textView7.setVisibility(0);
        }
        android.widget.TextView textView8 = hpVar.f118588z1;
        if (textView8 == null) {
            return;
        }
        int i27 = 0;
        for (android.text.style.UpdateLayout updateLayout : (java.lang.Iterable) obj) {
            gm2.y1 y1Var = updateLayout instanceof gm2.y1 ? (gm2.y1) updateLayout : null;
            i27 += y1Var != null ? y1Var.a() : 0;
        }
        textView8.setWidth(i27);
    }
}
