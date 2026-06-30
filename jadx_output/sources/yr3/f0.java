package yr3;

/* loaded from: classes11.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.g0 f464807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f464808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f464809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f464810g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f464811h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(yr3.g0 g0Var, r45.s5 s5Var, wr3.n0 n0Var, boolean z17, int i17) {
        super(1);
        this.f464807d = g0Var;
        this.f464808e = s5Var;
        this.f464809f = n0Var;
        this.f464810g = z17;
        this.f464811h = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            wr3.n0 n0Var = this.f464809f;
            boolean z17 = this.f464810g;
            int i17 = this.f464811h;
            yr3.g0 g0Var = this.f464807d;
            com.tencent.mars.xlog.Log.i(g0Var.f464816e, "filling FeaturedMsgSinglePicArticleViewHolder");
            android.view.View view = g0Var.f464819h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicArticleViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicArticleViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = g0Var.f464823o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicArticleViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSinglePicArticleViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wr3.n0 n0Var2 = wr3.n0.f448843g;
            android.view.View view3 = g0Var.f464829u;
            if (n0Var == n0Var2) {
                a84.y0.p(view3, true);
            } else {
                a84.y0.p(view3, false);
            }
            r45.s5 s5Var = this.f464808e;
            r45.o5 o5Var = (r45.o5) s5Var.f385514i.f382754e.get(0);
            r45.l5 l5Var = s5Var.f385514i.f382753d;
            yr3.w wVar = yr3.w.f465059a;
            android.content.Context context = g0Var.f464817f;
            android.widget.TextView textView = g0Var.f464824p;
            kotlin.jvm.internal.o.d(textView);
            android.widget.ImageView imageView = g0Var.f464825q;
            kotlin.jvm.internal.o.d(imageView);
            android.view.View view4 = g0Var.f464822n;
            kotlin.jvm.internal.o.d(view4);
            wVar.i(context, textView, imageView, s5Var, n0Var, view4);
            android.content.Context context2 = g0Var.f464817f;
            wr3.i iVar = g0Var.f464815d;
            android.view.View itemView = g0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            kotlin.jvm.internal.o.d(o5Var);
            kotlin.jvm.internal.o.d(l5Var);
            wVar.j(context2, iVar, itemView, s5Var, o5Var, l5Var, (r29 & 64) != 0 ? 0 : g0Var.getPosition(), n0Var, z17, i17, (r29 & 1024) != 0 ? sr3.a.f411829e : null, (r29 & 2048) != 0 ? false : false);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = o5Var.f381913d;
            ((ke0.e) xVar).getClass();
            g0Var.f464827s.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(g0Var.f464817f, str));
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(o5Var.A);
            android.widget.TextView textView2 = g0Var.f464826r;
            if (K0) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(o5Var.A);
            }
            android.widget.ImageView imageView2 = g0Var.f464828t;
            imageView2.getLayoutParams().height = (int) ((fq1.e.f265507a.e(r2) - i65.a.b(r2, 16)) * 0.428f);
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(o5Var.f381922o) ? o5Var.f381920m : o5Var.f381922o;
            if (!kotlin.jvm.internal.o.b(g0Var.f464830v, str2)) {
                g0Var.f464830v = str2;
                n11.a.b().h(str2, imageView2, wVar.d());
            }
        }
        return jz5.f0.f302826a;
    }
}
