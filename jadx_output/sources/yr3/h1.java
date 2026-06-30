package yr3;

/* loaded from: classes11.dex */
public final class h1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.i f464838d;

    /* renamed from: e, reason: collision with root package name */
    public final int f464839e;

    /* renamed from: f, reason: collision with root package name */
    public final sr3.a f464840f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f464841g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f464842h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f464843i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f464844m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464845n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f464846o;

    /* renamed from: p, reason: collision with root package name */
    public final yr3.e1 f464847p;

    /* renamed from: q, reason: collision with root package name */
    public final yr3.e1 f464848q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(wr3.i adapter, android.view.View itemView, int i17, sr3.a accountType) {
        super(itemView);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(accountType, "accountType");
        this.f464838d = adapter;
        this.f464839e = i17;
        this.f464840f = accountType;
        this.f464841g = "MsgSlidePicViewHolder";
        this.f464842h = adapter.B();
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.t_p);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f464843i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.t_h);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f464844m = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.syd);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.sye);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.twl);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.syg);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.tencent.mm.R.id.syi);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        android.view.View findViewById8 = itemView.findViewById(com.tencent.mm.R.id.syh);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f464847p = new yr3.e1(findViewById3, imageView, imageView2, textView, (android.widget.TextView) findViewById7, findViewById8);
        android.view.View findViewById9 = itemView.findViewById(com.tencent.mm.R.id.syj);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.view.View findViewById10 = itemView.findViewById(com.tencent.mm.R.id.syk);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById10;
        android.view.View findViewById11 = itemView.findViewById(com.tencent.mm.R.id.v1m);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById11;
        android.view.View findViewById12 = itemView.findViewById(com.tencent.mm.R.id.sym);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById12;
        android.view.View findViewById13 = itemView.findViewById(com.tencent.mm.R.id.syo);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        android.view.View findViewById14 = itemView.findViewById(com.tencent.mm.R.id.syn);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f464848q = new yr3.e1(findViewById9, imageView3, imageView4, textView2, (android.widget.TextView) findViewById13, findViewById14);
    }

    public final void i(r45.s5 s5Var, r45.o5 o5Var, boolean z17, int i17, int i18, yr3.e1 e1Var) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        if (o5Var == null) {
            android.view.View view = e1Var.f464796a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder", "fillGroup", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/protocal/protobuf/AffBizAppMsgDetailInfo;ZIILcom/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder$PicViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder", "fillGroup", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/protocal/protobuf/AffBizAppMsgDetailInfo;ZIILcom/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder$PicViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f464841g, "fillMain: msgId=" + s5Var.f385509d.f390790d);
        android.view.View view2 = e1Var.f464796a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder", "fillGroup", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/protocal/protobuf/AffBizAppMsgDetailInfo;ZIILcom/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder$PicViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder", "fillGroup", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/protocal/protobuf/AffBizAppMsgDetailInfo;ZIILcom/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder$PicViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup.LayoutParams layoutParams = e1Var.f464796a.getLayoutParams();
        int i19 = this.f464839e;
        layoutParams.width = i19;
        fq1.e eVar = fq1.e.f265507a;
        android.view.View view3 = e1Var.f464796a;
        android.content.Context context = this.f464842h;
        fq1.e.h(eVar, view3, i65.a.b(context, 8), false, false, 12, null);
        r45.z5 z5Var = o5Var.R;
        e1Var.f464798c.setVisibility(z5Var != null && z5Var.f391720g == 1 ? 0 : 8);
        r45.l5 l5Var = s5Var.f385514i.f382753d;
        yr3.w wVar = yr3.w.f465059a;
        android.content.Context context2 = this.f464842h;
        wr3.i iVar = this.f464838d;
        android.view.View view4 = e1Var.f464796a;
        kotlin.jvm.internal.o.d(l5Var);
        wVar.j(context2, iVar, view4, s5Var, o5Var, l5Var, i18, wr3.n0.f448842f, z17, i17, this.f464840f, true);
        e1Var.f464799d.setText(((le0.x) i95.n0.c(le0.x.class)) != null ? com.tencent.mm.pluginsdk.ui.span.c0.i(context, o5Var.f381913d) : "");
        java.lang.String str2 = o5Var.A;
        android.widget.TextView textView = e1Var.f464800e;
        textView.setText(str2);
        java.lang.CharSequence text = textView.getText();
        textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        boolean b17 = kotlin.jvm.internal.o.b(e1Var, this.f464847p);
        r45.g6 g6Var = o5Var.K;
        if (g6Var == null || (linkedList = g6Var.f374910e) == null || (str = (java.lang.String) kz5.n0.Z(linkedList)) == null) {
            java.lang.String str3 = o5Var.f381920m;
            str = str3 != null ? str3 : "";
        }
        android.widget.ImageView imageView = e1Var.f464797b;
        imageView.getLayoutParams().height = (int) (i19 * 1.3333334f);
        if (kotlin.jvm.internal.o.b(b17 ? this.f464845n : this.f464846o, str)) {
            return;
        }
        if (b17) {
            this.f464845n = str;
        } else {
            this.f464846o = str;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            imageView.setImageResource(com.tencent.mm.R.drawable.f481001hk);
            return;
        }
        n11.a b18 = n11.a.b();
        o11.f fVar = new o11.f();
        fVar.f342093q = com.tencent.mm.R.drawable.f481001hk;
        fVar.f342091o = com.tencent.mm.R.drawable.f481001hk;
        fVar.f342077a = true;
        fVar.f342078b = true;
        fVar.f342079c = true;
        b18.h(str, imageView, fVar.a());
    }
}
