package ku1;

/* loaded from: classes15.dex */
public class e0 extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f312075b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f312076c;

    @Override // ku1.m
    public void c() {
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f312075b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f312076c;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ku1.m
    public void e() {
        int i17;
        int i18;
        com.tencent.mm.plugin.card.ui.b0 b0Var = (com.tencent.mm.plugin.card.ui.b0) this.f312132a;
        tt1.j jVar = b0Var.E;
        hu1.g gVar = b0Var.f94937f;
        if (jVar.i0().f385191q != null && jVar.i0().f385191q.size() > 1) {
            if (this.f312075b == null) {
                this.f312075b = ((android.view.ViewStub) b(com.tencent.mm.R.id.bbv)).inflate();
            }
            android.view.View view = this.f312076c;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.card.ui.b0 b0Var2 = (com.tencent.mm.plugin.card.ui.b0) this.f312132a;
            com.tencent.mm.ui.MMActivity mMActivity = b0Var2.f94936e;
            android.view.View view2 = this.f312075b;
            android.view.View.OnClickListener onClickListener = b0Var2.X;
            java.util.LinkedList linkedList = jVar.i0().f385191q;
            int d17 = lu1.a0.d(jVar.s0().f388555p);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
            viewGroup.removeAllViews();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.w50 w50Var = (r45.w50) it.next();
                android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.f488351qx, viewGroup, false);
                inflate.setId(com.tencent.mm.R.id.bbw);
                inflate.setTag(java.lang.Integer.valueOf(linkedList.indexOf(w50Var)));
                inflate.setOnClickListener(onClickListener);
                if (android.text.TextUtils.isEmpty(w50Var.f388881g) && com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388887p)) {
                    inflate.setEnabled(false);
                }
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mg9)).setText(w50Var.f388878d);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mg6);
                textView.setText(w50Var.f388879e);
                textView.setTextColor(d17);
                viewGroup.addView(inflate);
                if (linkedList.indexOf(w50Var) + 1 != linkedList.size()) {
                    viewGroup.addView(com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.f488352qy, viewGroup, false));
                }
            }
            if (!jVar.o() || jVar.i0().f385198x == null || android.text.TextUtils.isEmpty(jVar.i0().f385198x.f388878d)) {
                i18 = com.tencent.mm.R.drawable.f481981ap3;
            } else {
                android.view.View view3 = this.f312075b;
                i18 = com.tencent.mm.R.drawable.f481981ap3;
                view3.setBackgroundResource(com.tencent.mm.R.drawable.f481981ap3);
            }
            if (jVar.o() || !gVar.a()) {
                return;
            }
            this.f312075b.setBackgroundResource(i18);
            return;
        }
        if (jVar.i0().f385191q == null || jVar.i0().f385191q.size() != 1) {
            android.view.View view4 = this.f312075b;
            if (view4 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view5 = this.f312076c;
            if (view5 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        if (this.f312076c == null) {
            this.f312076c = ((android.view.ViewStub) b(com.tencent.mm.R.id.bbu)).inflate();
        }
        android.view.View view6 = this.f312075b;
        if (view6 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view7 = this.f312076c;
        android.view.View.OnClickListener onClickListener2 = ((com.tencent.mm.plugin.card.ui.b0) this.f312132a).X;
        java.util.LinkedList linkedList2 = jVar.i0().f385191q;
        if (linkedList2.size() == 1) {
            android.view.View findViewById = view7.findViewById(com.tencent.mm.R.id.bbx);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/card/util/CardViewUtil", "updateCardSecondaryFieldSingleView", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/card/util/CardViewUtil", "updateCardSecondaryFieldSingleView", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.w50 w50Var2 = (r45.w50) linkedList2.get(0);
            ((android.widget.TextView) view7.findViewById(com.tencent.mm.R.id.mg_)).setText(w50Var2.f388878d);
            ((android.widget.TextView) view7.findViewById(com.tencent.mm.R.id.mg7)).setText(w50Var2.f388879e);
            ((android.widget.TextView) view7.findViewById(com.tencent.mm.R.id.mg7)).setTextColor(lu1.a0.d(jVar.s0().f388555p));
            view7.findViewById(com.tencent.mm.R.id.bbx).setOnClickListener(onClickListener2);
            if (android.text.TextUtils.isEmpty(w50Var2.f388881g)) {
                view7.findViewById(com.tencent.mm.R.id.bbx).setEnabled(false);
            }
        }
        if (!jVar.o() || jVar.i0().f385198x == null || android.text.TextUtils.isEmpty(jVar.i0().f385198x.f388878d)) {
            i17 = com.tencent.mm.R.drawable.f481981ap3;
        } else {
            android.view.View view8 = this.f312076c;
            i17 = com.tencent.mm.R.drawable.f481981ap3;
            view8.setBackgroundResource(com.tencent.mm.R.drawable.f481981ap3);
        }
        if (jVar.o() || !gVar.a()) {
            return;
        }
        this.f312076c.setBackgroundResource(i17);
    }
}
