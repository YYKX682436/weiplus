package yr3;

/* loaded from: classes11.dex */
public final class t0 extends yr3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f465036f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f465037g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f465038h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(android.view.View itemView, wr3.i outAdapter, r45.l5 baseInfo) {
        super(itemView, outAdapter, baseInfo);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(outAdapter, "outAdapter");
        kotlin.jvm.internal.o.g(baseInfo, "baseInfo");
        this.f465036f = itemView.getContext();
        this.f465037g = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.cbl);
        this.f465038h = itemView.findViewById(com.tencent.mm.R.id.f486223uo2);
    }

    @Override // yr3.a
    public void i(yr3.c dataModel, int i17, wr3.n0 itemStatus, boolean z17, int i18) {
        int i19;
        int i27;
        android.view.View view;
        kotlin.jvm.internal.o.g(dataModel, "dataModel");
        kotlin.jvm.internal.o.g(itemStatus, "itemStatus");
        r45.s5 s5Var = dataModel.f464735c;
        r45.o5 o5Var = dataModel.f464734b;
        wr3.n0 n0Var = wr3.n0.f448843g;
        android.view.View view2 = this.f465038h;
        if (itemStatus == n0Var) {
            a84.y0.p(view2, true);
        } else {
            a84.y0.p(view2, false);
        }
        yr3.w wVar = yr3.w.f465059a;
        android.content.Context context = this.f465036f;
        kotlin.jvm.internal.o.d(context);
        wr3.i iVar = this.f464715d;
        android.view.View itemView = this.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        wVar.j(context, iVar, itemView, s5Var, o5Var, this.f464716e, (r29 & 64) != 0 ? 0 : i17, itemStatus, z17, i18, (r29 & 1024) != 0 ? sr3.a.f411829e : null, (r29 & 2048) != 0 ? false : false);
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.dyf);
        android.view.View findViewById2 = this.itemView.findViewById(com.tencent.mm.R.id.dye);
        if (x51.t1.b(o5Var.A)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            i19 = 8;
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view = findViewById2.findViewById(com.tencent.mm.R.id.cbj);
            kotlin.jvm.internal.o.f(view, "findViewById(...)");
            android.widget.TextView textView = (android.widget.TextView) findViewById2.findViewById(com.tencent.mm.R.id.dyg);
            textView.setText(o5Var.f381913d);
            android.text.TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint2 = textView.getPaint();
            if (paint2 != null) {
                paint2.setStrokeWidth(0.8f);
            }
            i27 = 0;
        } else {
            i19 = 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            i27 = 0;
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = findViewById.findViewById(com.tencent.mm.R.id.cbj);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            android.widget.TextView textView2 = (android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.dyh);
            textView2.setText(o5Var.f381913d);
            android.text.TextPaint paint3 = textView2.getPaint();
            if (paint3 != null) {
                paint3.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint4 = textView2.getPaint();
            if (paint4 != null) {
                paint4.setStrokeWidth(0.8f);
            }
            ((android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.dyd)).setText(o5Var.A);
            view = findViewById3;
        }
        if (o5Var.H > 0) {
            ((android.widget.TextView) view).setVisibility(i27);
            ((android.widget.TextView) view).setText(java.lang.String.valueOf(o5Var.H));
        } else {
            ((android.widget.TextView) view).setVisibility(i19);
            ((android.widget.TextView) view).setText("");
        }
        java.lang.String str = x51.t1.b(o5Var.L) ? o5Var.f381920m : o5Var.L;
        n11.a b17 = n11.a.b();
        o11.g d17 = wVar.d();
        android.widget.ImageView imageView = this.f465037g;
        b17.h(str, imageView, d17);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        fq1.e eVar = fq1.e.f265507a;
        kotlin.jvm.internal.o.d(context);
        layoutParams.height = (int) ((eVar.e(context) - i65.a.b(context, 16)) * 0.5625d);
    }
}
