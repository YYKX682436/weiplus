package wr3;

/* loaded from: classes11.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr3.f2 f448771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f448772e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f448773f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f448774g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f448775h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(wr3.f2 f2Var, r45.s5 s5Var, wr3.n0 n0Var, boolean z17, int i17) {
        super(1);
        this.f448771d = f2Var;
        this.f448772e = s5Var;
        this.f448773f = n0Var;
        this.f448774g = z17;
        this.f448775h = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            wr3.n0 n0Var = this.f448773f;
            boolean z17 = this.f448774g;
            int i17 = this.f448775h;
            wr3.f2 f2Var = this.f448771d;
            com.tencent.mars.xlog.Log.i(f2Var.f448791e, "filling FeaturedMsgSingleVideoViewHolder");
            android.view.View view = f2Var.f448796m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/FeaturedMsgSingleVideoViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/list/FeaturedMsgSingleVideoViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = f2Var.f448800q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/FeaturedMsgSingleVideoViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/list/FeaturedMsgSingleVideoViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wr3.n0 n0Var2 = wr3.n0.f448843g;
            android.view.View view3 = f2Var.f448805v;
            if (n0Var == n0Var2) {
                a84.y0.p(view3, true);
            } else {
                a84.y0.p(view3, false);
            }
            r45.s5 s5Var = this.f448772e;
            r45.o5 o5Var = (r45.o5) s5Var.f385514i.f382754e.get(0);
            r45.l5 l5Var = s5Var.f385514i.f382753d;
            yr3.w wVar = yr3.w.f465059a;
            android.content.Context context = f2Var.f448792f;
            android.widget.TextView textView = f2Var.f448793g;
            kotlin.jvm.internal.o.d(textView);
            android.widget.ImageView imageView = f2Var.f448794h;
            kotlin.jvm.internal.o.d(imageView);
            android.view.View view4 = f2Var.f448799p;
            kotlin.jvm.internal.o.d(view4);
            wVar.i(context, textView, imageView, s5Var, n0Var, view4);
            f2Var.f448801r.setText(o5Var.A);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = o5Var.f381913d;
            ((ke0.e) xVar).getClass();
            f2Var.f448803t.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(f2Var.f448792f, str));
            f2Var.f448802s.setText(ot0.g0.d(o5Var.f381939z));
            android.widget.ImageView imageView2 = f2Var.f448804u;
            imageView2.getLayoutParams().height = (int) ((fq1.e.f265507a.e(r2) - i65.a.b(r2, 16)) * 0.5625d);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(o5Var.L) ? o5Var.f381920m : o5Var.L;
            if (!kotlin.jvm.internal.o.b(f2Var.f448806w, str2)) {
                f2Var.f448806w = str2;
                n11.a.b().h(str2, imageView2, wVar.d());
                android.content.Context context2 = f2Var.f448792f;
                wr3.t0 t0Var = f2Var.f448790d;
                android.view.View itemView = f2Var.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                kotlin.jvm.internal.o.d(l5Var);
                wVar.j(context2, t0Var, itemView, s5Var, o5Var, l5Var, (r29 & 64) != 0 ? 0 : f2Var.getPosition(), n0Var, z17, i17, (r29 & 1024) != 0 ? sr3.a.f411829e : null, (r29 & 2048) != 0 ? false : false);
            }
        }
        return jz5.f0.f302826a;
    }
}
