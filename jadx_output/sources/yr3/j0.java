package yr3;

/* loaded from: classes11.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.k0 f464874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f464875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f464876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f464877g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f464878h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(yr3.k0 k0Var, r45.s5 s5Var, wr3.n0 n0Var, boolean z17, int i17) {
        super(1);
        this.f464874d = k0Var;
        this.f464875e = s5Var;
        this.f464876f = n0Var;
        this.f464877g = z17;
        this.f464878h = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            r45.s5 s5Var = this.f464875e;
            wr3.n0 n0Var = this.f464876f;
            boolean z17 = this.f464877g;
            int i17 = this.f464878h;
            yr3.k0 k0Var = this.f464874d;
            java.lang.String str = k0Var.f464895e;
            com.tencent.mars.xlog.Log.i(str, "filling FeaturedMsgSingleTextViewHolder");
            android.view.View view = k0Var.f464901n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleTextViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleTextViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = k0Var.f464905r;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleTextViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgSingleTextViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wr3.n0 n0Var2 = wr3.n0.f448843g;
            android.view.View view3 = k0Var.f464910w;
            if (n0Var == n0Var2) {
                a84.y0.p(view3, true);
            } else {
                a84.y0.p(view3, false);
            }
            yr3.w wVar = yr3.w.f465059a;
            android.content.Context context = k0Var.f464896f;
            android.widget.TextView textView = k0Var.f464898h;
            kotlin.jvm.internal.o.d(textView);
            android.widget.ImageView imageView = k0Var.f464899i;
            kotlin.jvm.internal.o.d(imageView);
            android.view.View view4 = k0Var.f464904q;
            kotlin.jvm.internal.o.d(view4);
            wVar.i(context, textView, imageView, s5Var, n0Var, view4);
            view4.setPadding(i65.a.b(view4.getContext(), 12), i65.a.b(view4.getContext(), 16), 0, i65.a.b(view4.getContext(), 12));
            if (s5Var.f385509d.f390791e == 1) {
                com.tencent.mars.xlog.Log.i(str, "filling old text");
                k0Var.i(s5Var.f385510e.f387892d.toString(), s5Var, null, n0Var, z17, i17);
            } else {
                r45.o5 o5Var = (r45.o5) s5Var.f385514i.f382754e.get(0);
                r45.l5 l5Var = s5Var.f385514i.f382753d;
                android.content.Context context2 = k0Var.f464896f;
                wr3.t0 t0Var = k0Var.f464894d;
                android.view.View itemView = k0Var.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                kotlin.jvm.internal.o.d(o5Var);
                kotlin.jvm.internal.o.d(l5Var);
                wVar.j(context2, t0Var, itemView, s5Var, o5Var, l5Var, (r29 & 64) != 0 ? 0 : k0Var.getPosition(), n0Var, z17, i17, (r29 & 1024) != 0 ? sr3.a.f411829e : null, (r29 & 2048) != 0 ? false : false);
                boolean b17 = x51.t1.b(o5Var.A);
                android.widget.TextView textView2 = k0Var.f464906s;
                if (b17) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    textView2.setText(o5Var.A);
                }
                k0Var.i(o5Var.f381913d.toString(), s5Var, o5Var.Y, n0Var, z17, i17);
            }
        }
        return jz5.f0.f302826a;
    }
}
