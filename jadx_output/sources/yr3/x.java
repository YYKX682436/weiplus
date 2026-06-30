package yr3;

/* loaded from: classes11.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.y f465065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s5 f465066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wr3.n0 f465067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f465068g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f465069h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f465070i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(yr3.y yVar, r45.s5 s5Var, wr3.n0 n0Var, int i17, boolean z17, int i18) {
        super(1);
        this.f465065d = yVar;
        this.f465066e = s5Var;
        this.f465067f = n0Var;
        this.f465068g = i17;
        this.f465069h = z17;
        this.f465070i = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yr3.j1 j1Var;
        java.util.LinkedList linkedList;
        if (((java.lang.Boolean) obj).booleanValue()) {
            r45.s5 s5Var = this.f465066e;
            wr3.n0 n0Var = this.f465067f;
            int i17 = this.f465068g;
            boolean z17 = this.f465069h;
            int i18 = this.f465070i;
            yr3.y yVar = this.f465065d;
            android.view.View view = yVar.f465084o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgCompoundViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;IZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgCompoundViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;IZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = yVar.f465087r;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgCompoundViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;IZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/FeaturedMsgCompoundViewHolder", "fillingMain", "(Lcom/tencent/mm/protocal/protobuf/AffBizMessage;Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabFeaturedMsgAdapter$ItemStatus;IZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yr3.w wVar = yr3.w.f465059a;
            android.content.Context context = yVar.f465077e;
            android.widget.TextView textView = yVar.f465079g;
            kotlin.jvm.internal.o.d(textView);
            android.widget.ImageView imageView = yVar.f465081i;
            kotlin.jvm.internal.o.d(imageView);
            android.view.View view3 = yVar.f465080h;
            kotlin.jvm.internal.o.d(view3);
            wVar.i(context, textView, imageView, s5Var, n0Var, view3);
            if (s5Var.f385514i.f382754e.size() > 0) {
                int i19 = ((r45.o5) s5Var.f385514i.f382754e.get(0)).f381923p;
                android.view.View view4 = yVar.f465078f;
                if (i19 == 0) {
                    view4.setPadding(i65.a.b(view4.getContext(), 12), i65.a.b(view4.getContext(), 16), 0, i65.a.b(view4.getContext(), 12));
                } else {
                    view4.setPadding(i65.a.b(view4.getContext(), 12), i65.a.b(view4.getContext(), 12), 0, i65.a.b(view4.getContext(), 12));
                }
            }
            r45.l5 l5Var = s5Var.f385514i.f382753d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.LinkedList DetailInfo = s5Var.f385514i.f382754e;
            kotlin.jvm.internal.o.f(DetailInfo, "DetailInfo");
            int i27 = 0;
            for (java.lang.Object obj2 : DetailInfo) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.o5 o5Var = (r45.o5) obj2;
                int i29 = o5Var.f381923p;
                yr3.j1 j1Var2 = yr3.j1.f464879e;
                if (i27 == 0 && i29 == 5) {
                    j1Var = yr3.j1.f464879e;
                } else {
                    if (i27 == 0 && i29 == 8) {
                        r45.l5 l5Var2 = s5Var.f385514i.f382753d;
                        if ((l5Var2 != null ? l5Var2.f379142h : 0) == 1) {
                            r45.g6 g6Var = o5Var.K;
                            if (((g6Var == null || (linkedList = g6Var.f374909d) == null) ? 0 : linkedList.size()) >= 3 && !com.tencent.mm.sdk.platformtools.t8.K0(((r45.t5) o5Var.K.f374909d.get(0)).f386148g)) {
                                j1Var = yr3.j1.f464888q;
                            }
                        }
                    }
                    j1Var = (i27 == 0 && i29 == 8) ? yr3.j1.f464880f : (i27 == 0 && i29 == 19) ? yr3.j1.f464885n : i29 == 5 ? yr3.j1.f464882h : i29 == 8 ? yr3.j1.f464883i : i29 == 7 ? yr3.j1.f464884m : i29 == 19 ? yr3.j1.f464886o : (i27 == 0 && i29 == 0 && s5Var.f385514i.f382753d.f379142h == 1) ? yr3.j1.f464887p : yr3.j1.f464881g;
                }
                yr3.c cVar = new yr3.c(j1Var, o5Var);
                cVar.f464735c = s5Var;
                arrayList3.add(cVar);
                i27 = i28;
            }
            if (arrayList3.size() > 3 && !s5Var.f385514i.f382753d.f379143i) {
                int i37 = s5Var.f385516n;
                yr3.o0[] o0VarArr = yr3.o0.f464965d;
                if (i37 == 0) {
                    arrayList4.addAll(arrayList3.subList(0, 3));
                    yr3.c cVar2 = new yr3.c(yr3.j1.f464889r, new r45.o5());
                    cVar2.f464735c = s5Var;
                    arrayList4.add(cVar2);
                    com.tencent.mm.plugin.profile.ui.tab.msg.holder.FeaturedMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$1 featuredMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$1 = new com.tencent.mm.plugin.profile.ui.tab.msg.holder.FeaturedMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$1(yVar.f465077e);
                    featuredMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$1.Q(1);
                    androidx.recyclerview.widget.RecyclerView recyclerView = yVar.f465082m;
                    recyclerView.setLayoutManager(featuredMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$1);
                    recyclerView.setNestedScrollingEnabled(false);
                    kotlin.jvm.internal.o.d(l5Var);
                    recyclerView.setAdapter(new yr3.b(l5Var, arrayList4, yVar.f465076d, i17, n0Var, z17, i18));
                }
            }
            arrayList4.addAll(arrayList3);
            com.tencent.mm.plugin.profile.ui.tab.msg.holder.FeaturedMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$1 featuredMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$12 = new com.tencent.mm.plugin.profile.ui.tab.msg.holder.FeaturedMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$1(yVar.f465077e);
            featuredMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$12.Q(1);
            androidx.recyclerview.widget.RecyclerView recyclerView2 = yVar.f465082m;
            recyclerView2.setLayoutManager(featuredMsgCompoundViewHolder$fillingMain$mLinearLayoutManager$12);
            recyclerView2.setNestedScrollingEnabled(false);
            kotlin.jvm.internal.o.d(l5Var);
            recyclerView2.setAdapter(new yr3.b(l5Var, arrayList4, yVar.f465076d, i17, n0Var, z17, i18));
        }
        return jz5.f0.f302826a;
    }
}
