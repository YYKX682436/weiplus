package yr3;

/* loaded from: classes11.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.m0 f464920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f464921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f464922f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f464923g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f464924h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(yr3.m0 m0Var, r45.s5 s5Var, wr3.n0 n0Var, boolean z17, int i17) {
        super(1);
        this.f464920d = m0Var;
        this.f464921e = s5Var;
        this.f464922f = n0Var;
        this.f464923g = z17;
        this.f464924h = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        int i18;
        if (((java.lang.Boolean) obj).booleanValue()) {
            wr3.n0 n0Var = this.f464922f;
            boolean z17 = this.f464923g;
            int i19 = this.f464924h;
            yr3.m0 m0Var = this.f464920d;
            java.lang.String str = m0Var.f464933e;
            com.tencent.mars.xlog.Log.i(str, "filling FeaturedMsgThreePicViewHolder");
            android.view.View view = m0Var.f464936h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgThreePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgThreePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = m0Var.f464940o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgThreePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgThreePicViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wr3.n0 n0Var2 = wr3.n0.f448843g;
            android.view.View view3 = m0Var.f464950y;
            if (n0Var == n0Var2) {
                a84.y0.p(view3, true);
            } else {
                a84.y0.p(view3, false);
            }
            r45.s5 s5Var = this.f464921e;
            r45.o5 o5Var = (r45.o5) s5Var.f385514i.f382754e.get(0);
            r45.l5 l5Var = s5Var.f385514i.f382753d;
            yr3.w wVar = yr3.w.f465059a;
            android.content.Context context = m0Var.f464934f;
            android.widget.TextView textView = m0Var.f464941p;
            kotlin.jvm.internal.o.d(textView);
            android.widget.ImageView imageView = m0Var.f464942q;
            kotlin.jvm.internal.o.d(imageView);
            android.view.View view4 = m0Var.f464939n;
            kotlin.jvm.internal.o.d(view4);
            wVar.i(context, textView, imageView, s5Var, n0Var, view4);
            android.content.Context context2 = m0Var.f464934f;
            wr3.t0 t0Var = m0Var.f464932d;
            android.view.View itemView = m0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            kotlin.jvm.internal.o.d(o5Var);
            kotlin.jvm.internal.o.d(l5Var);
            wVar.j(context2, t0Var, itemView, s5Var, o5Var, l5Var, (r29 & 64) != 0 ? 0 : m0Var.getPosition(), n0Var, z17, i19, (r29 & 1024) != 0 ? sr3.a.f411829e : null, (r29 & 2048) != 0 ? false : false);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = o5Var.f381913d;
            ((ke0.e) xVar).getClass();
            m0Var.f464944s.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(m0Var.f464934f, str2));
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(o5Var.A);
            android.widget.TextView textView2 = m0Var.f464943r;
            if (K0) {
                i17 = 8;
                textView2.setVisibility(8);
                i18 = 0;
            } else {
                i17 = 8;
                i18 = 0;
                textView2.setVisibility(0);
                textView2.setText(o5Var.A);
            }
            int i27 = o5Var.H;
            android.widget.TextView textView3 = m0Var.f464949x;
            if (i27 > 0) {
                textView3.setVisibility(i18);
                textView3.setText(java.lang.String.valueOf(o5Var.H));
            } else {
                textView3.setVisibility(i17);
                textView3.setText("");
            }
            m0Var.f464945t.getLayoutParams().height = (int) (((((fq1.e.f265507a.e(r2) - i65.a.b(r2, 16)) - i65.a.b(r2, i17)) / 3.0f) / 3.0f) * 4.0f);
            if (o5Var.K.f374909d.size() >= 3) {
                java.lang.String str3 = ((r45.t5) o5Var.K.f374909d.get(i18)).f386148g;
                java.lang.String str4 = ((r45.t5) o5Var.K.f374909d.get(1)).f386148g;
                java.lang.String str5 = ((r45.t5) o5Var.K.f374909d.get(2)).f386148g;
                o11.f fVar = new o11.f();
                fVar.f342093q = com.tencent.mm.R.drawable.f481001hk;
                fVar.f342079c = true;
                n11.a.b().h(str3, m0Var.f464946u, fVar.a());
                o11.f fVar2 = new o11.f();
                fVar2.f342093q = com.tencent.mm.R.drawable.f481001hk;
                fVar2.f342079c = true;
                n11.a.b().h(str4, m0Var.f464947v, fVar2.a());
                o11.f fVar3 = new o11.f();
                fVar3.f342093q = com.tencent.mm.R.drawable.f481001hk;
                fVar3.f342079c = true;
                n11.a.b().h(str5, m0Var.f464948w, fVar3.a());
            } else {
                com.tencent.mars.xlog.Log.e(str, "PicInfoList size less 3");
            }
        }
        return jz5.f0.f302826a;
    }
}
