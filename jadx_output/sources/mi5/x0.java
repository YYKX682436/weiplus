package mi5;

/* loaded from: classes3.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.y0 f326937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z01.a0 f326938e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(mi5.y0 y0Var, z01.a0 a0Var) {
        super(1);
        this.f326937d = y0Var;
        this.f326938e = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        a11.c it = (a11.c) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View view = it.f504a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/msgviewfactory/view/ForwardPocketMoneyView$onUpdateViewModel$1$1", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/msgviewfactory/view/ForwardPocketMoneyView$onUpdateViewModel$1$1", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = it.f505b;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(weImageView, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(weImageView, arrayList4.toArray(), "com/tencent/mm/ui/msgviewfactory/view/ForwardPocketMoneyView$onUpdateViewModel$1$1", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        weImageView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(weImageView, "com/tencent/mm/ui/msgviewfactory/view/ForwardPocketMoneyView$onUpdateViewModel$1$1", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(weImageView, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        z01.a0 a0Var = this.f326938e;
        java.lang.String str = a0Var.f468940g;
        java.lang.String str2 = a0Var.f468941h;
        mi5.y0 y0Var = this.f326937d;
        y0Var.getClass();
        boolean z17 = !(str == null || str.length() == 0);
        boolean z18 = !(str2 == null || str2.length() == 0);
        if (z17 || z18) {
            android.view.View view2 = it.f504a;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Integer.valueOf(intValue3));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/ui/msgviewfactory/view/ForwardPocketMoneyView", "tryFillSourceView", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/msgviewfactory/view/ForwardPocketMoneyView", "tryFillSourceView", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = it.f506c;
            if (z17) {
                textView.setVisibility(0);
                textView.setText(str);
            } else {
                textView.setText("");
                textView.setVisibility(8);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = it.f505b;
            if (z18) {
                weImageView2.setVisibility(0);
                if (str2 == null || str2.length() == 0) {
                    com.tencent.mars.xlog.Log.w("ForwardPocketMoneyView", "[loadImage] invalid params: url=" + str2 + ", iv=" + weImageView2);
                } else {
                    com.tencent.mars.xlog.Log.i("ForwardPocketMoneyView", "[loadImage] loading image from url: " + str2);
                    android.content.Context context = y0Var.f326945c;
                    if (context != null) {
                        weImageView2.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.a9e));
                    }
                    ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str2, new mi5.w0(weImageView2, y0Var));
                }
            } else {
                weImageView2.setVisibility(8);
                weImageView2.setImageDrawable(null);
            }
            com.tencent.mars.xlog.Log.i("ForwardPocketMoneyView", "[tryFillSourceView] hasDisplayName=" + z17 + ", hasIconUrl=" + z18 + ", displayName=" + str + ", iconUrl=" + str2);
        } else {
            android.view.View view3 = it.f504a;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view3, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(intValue4));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view3, arrayList8.toArray(), "com/tencent/mm/ui/msgviewfactory/view/ForwardPocketMoneyView", "tryFillSourceView", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/msgviewfactory/view/ForwardPocketMoneyView", "tryFillSourceView", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view3, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
