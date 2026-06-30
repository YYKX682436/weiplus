package yr3;

/* loaded from: classes11.dex */
public final class t1 extends yr3.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f465039f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f465040g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f465041h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f465042i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f465043m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f465044n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f465045o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(android.view.View itemView, wr3.i outAdapter, r45.l5 baseInfo) {
        super(itemView, outAdapter, baseInfo);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(outAdapter, "outAdapter");
        kotlin.jvm.internal.o.g(baseInfo, "baseInfo");
        this.f465039f = "ThreePicViewHolder";
        this.f465040g = itemView.getContext();
        this.f465041h = itemView.findViewById(com.tencent.mm.R.id.rgn);
        this.f465042i = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.rgo);
        this.f465043m = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.rgp);
        this.f465044n = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.rgq);
        this.f465045o = itemView.findViewById(com.tencent.mm.R.id.f486223uo2);
    }

    @Override // yr3.a
    public void i(yr3.c dataModel, int i17, wr3.n0 itemStatus, boolean z17, int i18) {
        int i19;
        int i27;
        android.view.View findViewById;
        int i28;
        kotlin.jvm.internal.o.g(dataModel, "dataModel");
        kotlin.jvm.internal.o.g(itemStatus, "itemStatus");
        r45.s5 s5Var = dataModel.f464735c;
        r45.o5 o5Var = dataModel.f464734b;
        yr3.w wVar = yr3.w.f465059a;
        android.content.Context context = this.f465040g;
        kotlin.jvm.internal.o.d(context);
        wr3.i iVar = this.f464715d;
        android.view.View itemView = this.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        wVar.j(context, iVar, itemView, s5Var, o5Var, this.f464716e, (r29 & 64) != 0 ? 0 : i17, itemStatus, z17, i18, (r29 & 1024) != 0 ? sr3.a.f411829e : null, (r29 & 2048) != 0 ? false : false);
        android.view.View findViewById2 = this.itemView.findViewById(com.tencent.mm.R.id.dyf);
        android.view.View findViewById3 = this.itemView.findViewById(com.tencent.mm.R.id.dye);
        if (x51.t1.b(o5Var.A)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            i19 = 0;
            i27 = 8;
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById = this.itemView.findViewById(com.tencent.mm.R.id.cbj);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            android.widget.TextView textView = (android.widget.TextView) this.itemView.findViewById(com.tencent.mm.R.id.dyg);
            textView.setText(o5Var.f381913d);
            android.text.TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint2 = textView.getPaint();
            if (paint2 != null) {
                paint2.setStrokeWidth(0.8f);
            }
        } else {
            i19 = 0;
            i27 = 8;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/ThreePicViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;ILcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById = this.itemView.findViewById(com.tencent.mm.R.id.cbj);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            android.widget.TextView textView2 = (android.widget.TextView) this.itemView.findViewById(com.tencent.mm.R.id.dyh);
            textView2.setText(o5Var.f381913d);
            android.text.TextPaint paint3 = textView2.getPaint();
            if (paint3 != null) {
                paint3.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint4 = textView2.getPaint();
            if (paint4 != null) {
                paint4.setStrokeWidth(0.8f);
            }
            ((android.widget.TextView) this.itemView.findViewById(com.tencent.mm.R.id.dyd)).setText(o5Var.A);
        }
        if (o5Var.H > 1) {
            ((android.widget.TextView) findViewById).setVisibility(i19);
            ((android.widget.TextView) findViewById).setText(java.lang.String.valueOf(o5Var.H));
            i28 = i27;
        } else {
            i28 = i27;
            ((android.widget.TextView) findViewById).setVisibility(i28);
            ((android.widget.TextView) findViewById).setText("");
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f465041h.getLayoutParams();
        fq1.e eVar = fq1.e.f265507a;
        kotlin.jvm.internal.o.d(context);
        layoutParams.height = (int) (((((eVar.e(context) - i65.a.b(context, 16)) - i65.a.b(context, i28)) / 3.0f) / 3.0f) * 4.0f);
        if (o5Var.K.f374909d.size() < 3) {
            com.tencent.mars.xlog.Log.e(this.f465039f, "PicInfoList size less 3");
            return;
        }
        java.lang.String str = ((r45.t5) o5Var.K.f374909d.get(i19)).f386148g;
        java.lang.String str2 = ((r45.t5) o5Var.K.f374909d.get(1)).f386148g;
        java.lang.String str3 = ((r45.t5) o5Var.K.f374909d.get(2)).f386148g;
        o11.f fVar = new o11.f();
        fVar.f342093q = com.tencent.mm.R.drawable.f481001hk;
        fVar.f342079c = true;
        n11.a.b().h(str, this.f465042i, fVar.a());
        o11.f fVar2 = new o11.f();
        fVar2.f342093q = com.tencent.mm.R.drawable.f481001hk;
        fVar2.f342079c = true;
        n11.a.b().h(str2, this.f465043m, fVar2.a());
        o11.f fVar3 = new o11.f();
        fVar3.f342093q = com.tencent.mm.R.drawable.f481001hk;
        fVar3.f342079c = true;
        n11.a.b().h(str3, this.f465044n, fVar3.a());
    }
}
