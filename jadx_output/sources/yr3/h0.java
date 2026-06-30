package yr3;

/* loaded from: classes11.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.i0 f464833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f464834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f464835f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f464836g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f464837h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(yr3.i0 i0Var, r45.s5 s5Var, wr3.n0 n0Var, boolean z17, int i17) {
        super(1);
        this.f464833d = i0Var;
        this.f464834e = s5Var;
        this.f464835f = n0Var;
        this.f464836g = z17;
        this.f464837h = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        if (((java.lang.Boolean) obj).booleanValue()) {
            wr3.n0 n0Var = this.f464835f;
            boolean z17 = this.f464836g;
            int i18 = this.f464837h;
            yr3.i0 i0Var = this.f464833d;
            com.tencent.mars.xlog.Log.i(i0Var.f464855e, "filling FeaturedMsgSinglePicViewHolder");
            android.view.View view = i0Var.f464858h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = i0Var.f464862o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.s5 s5Var = this.f464834e;
            r45.o5 o5Var = (r45.o5) s5Var.f385514i.f382754e.get(0);
            r45.l5 l5Var = s5Var.f385514i.f382753d;
            yr3.w wVar = yr3.w.f465059a;
            android.content.Context context = i0Var.f464856f;
            android.widget.TextView textView = i0Var.f464863p;
            kotlin.jvm.internal.o.d(textView);
            android.widget.ImageView imageView = i0Var.f464864q;
            kotlin.jvm.internal.o.d(imageView);
            android.view.View view3 = i0Var.f464861n;
            kotlin.jvm.internal.o.d(view3);
            wVar.i(context, textView, imageView, s5Var, n0Var, view3);
            android.content.Context context2 = i0Var.f464856f;
            wr3.t0 t0Var = i0Var.f464854d;
            android.view.View itemView = i0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            kotlin.jvm.internal.o.d(o5Var);
            kotlin.jvm.internal.o.d(l5Var);
            wVar.j(context2, t0Var, itemView, s5Var, o5Var, l5Var, (r29 & 64) != 0 ? 0 : i0Var.getPosition(), n0Var, z17, i18, (r29 & 1024) != 0 ? sr3.a.f411829e : null, (r29 & 2048) != 0 ? false : false);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = o5Var.f381913d;
            ((ke0.e) xVar).getClass();
            i0Var.f464866s.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(i0Var.f464856f, str));
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(o5Var.A);
            android.widget.TextView textView2 = i0Var.f464865r;
            if (K0) {
                textView2.setVisibility(8);
                i17 = 0;
            } else {
                i17 = 0;
                textView2.setVisibility(0);
                textView2.setText(o5Var.A);
            }
            int i19 = o5Var.H;
            android.widget.TextView textView3 = i0Var.f464868u;
            if (i19 > 0) {
                textView3.setVisibility(i17);
                textView3.setText(java.lang.String.valueOf(o5Var.H));
            } else {
                textView3.setVisibility(8);
                textView3.setText("");
            }
            android.widget.ImageView imageView2 = i0Var.f464867t;
            imageView2.getLayoutParams().height = (int) ((fq1.e.f265507a.e(r2) - i65.a.b(r2, 16)) * 0.5625d);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(o5Var.L) ? o5Var.f381920m : o5Var.L;
            o11.f fVar = new o11.f();
            fVar.f342093q = com.tencent.mm.R.drawable.f481001hk;
            fVar.f342079c = true;
            n11.a.b().h(str2, imageView2, fVar.a());
        }
        return jz5.f0.f302826a;
    }
}
