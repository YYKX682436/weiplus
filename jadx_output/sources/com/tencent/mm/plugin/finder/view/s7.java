package com.tencent.mm.plugin.finder.view;

/* loaded from: classes9.dex */
public final class s7 implements fb5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderContactSortView f133026a;

    public s7(com.tencent.mm.plugin.finder.view.FinderContactSortView finderContactSortView) {
        this.f133026a = finderContactSortView;
    }

    @Override // fb5.l
    public final android.view.View a(fb5.n nVar, android.view.View view, android.view.ViewGroup viewGroup, int i17, int i18, boolean z17, boolean z18) {
        com.tencent.mm.plugin.finder.view.r7 r7Var;
        com.tencent.mm.plugin.finder.view.FinderContactSortView finderContactSortView = this.f133026a;
        if (view == null) {
            view = android.view.View.inflate(finderContactSortView.getContext(), com.tencent.mm.R.layout.afm, null);
            r7Var = new com.tencent.mm.plugin.finder.view.r7();
            r7Var.f132932a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a_4);
            r7Var.f132933b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kbq);
            r7Var.f132934c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bdd);
            r7Var.f132935d = view.findViewById(com.tencent.mm.R.id.hhc);
            view.setTag(r7Var);
        } else {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.FinderContactSortView.ViewHolder");
            r7Var = (com.tencent.mm.plugin.finder.view.r7) tag;
        }
        java.lang.Object obj = nVar.f260898b;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.api.LocalFinderContact");
        ya2.b2 b2Var = (ya2.b2) obj;
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        mn2.n nVar2 = new mn2.n(b2Var.getAvatarUrl(), null, 2, null);
        android.widget.ImageView imageView = r7Var.f132932a;
        kotlin.jvm.internal.o.d(imageView);
        a17.c(nVar2, imageView, g1Var.h(mn2.f1.f329957h));
        android.widget.TextView textView = r7Var.f132933b;
        if (textView != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = finderContactSortView.getContext();
            java.lang.String w07 = b2Var.w0();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, w07));
        }
        if (finderContactSortView.f197872p && z17) {
            android.widget.TextView textView2 = r7Var.f132934c;
            if (textView2 != null) {
                textView2.setText(nVar.f260897a);
            }
            android.widget.TextView textView3 = r7Var.f132934c;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        } else {
            android.widget.TextView textView4 = r7Var.f132934c;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        }
        if (finderContactSortView.getMode() == 0 && z18) {
            android.view.View view2 = r7Var.f132935d;
            if (view2 != null) {
                view2.setBackgroundResource(com.tencent.mm.R.drawable.f481310q6);
            }
        } else {
            android.view.View view3 = r7Var.f132935d;
            if (view3 != null) {
                view3.setBackgroundResource(com.tencent.mm.R.drawable.bfj);
            }
        }
        return view;
    }
}
