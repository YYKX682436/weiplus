package xr3;

/* loaded from: classes11.dex */
public final class i extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f456228d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.q f456229e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f456230f;

    public i(java.util.List menuList) {
        kotlin.jvm.internal.o.g(menuList, "menuList");
        this.f456228d = menuList;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f456228d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((r45.mm) this.f456228d.get(i17)).f380636e == 0 ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        int i18;
        int i19;
        java.lang.CharSequence i27;
        bw5.x7 b17;
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z17 = holder instanceof xr3.c;
        java.util.List list = this.f456228d;
        if (!z17) {
            if (!(holder instanceof xr3.b)) {
                if (holder instanceof xr3.a) {
                    com.tencent.mm.ui.tools.d8.a(holder.itemView);
                    holder.itemView.setOnClickListener(new xr3.h(this));
                    return;
                }
                return;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            xr3.b bVar = (xr3.b) holder;
            android.widget.TextView textView = bVar.f456212e;
            android.content.Context context = textView.getContext();
            java.lang.String str = ((r45.mm) list.get(i17)).f380637f;
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i28 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
            android.view.View view = bVar.f456211d;
            i18 = i17 != 0 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setText(i28);
            xr3.e eVar = new xr3.e(this, i17);
            com.tencent.mm.ui.widget.happybubble.LabelsView labelsView = bVar.f456213f;
            labelsView.setOnLabelClickListener(eVar);
            labelsView.g(((r45.mm) list.get(i17)).f380640i, new xr3.g(this, holder, i17));
            return;
        }
        xr3.c cVar = (xr3.c) holder;
        android.widget.TextView textView2 = cVar.f456215e;
        android.content.Context context2 = textView2.getContext();
        r45.mm mmVar = (r45.mm) list.get(i17);
        switch (mmVar.f380643o) {
            case 1:
                i19 = com.tencent.mm.R.raw.biz_link_regular;
                break;
            case 2:
                i19 = com.tencent.mm.R.raw.biz_mini_program_circle_regular;
                break;
            case 3:
                i19 = com.tencent.mm.R.raw.biz_subscriptions_regular;
                break;
            case 4:
                i19 = com.tencent.mm.R.raw.biz_bubble_circle_regular;
                break;
            case 5:
                i19 = com.tencent.mm.R.raw.biz_scan_regular;
                break;
            case 6:
            case 7:
                i19 = com.tencent.mm.R.raw.ecs_regular;
                break;
            case 8:
            default:
                i19 = 0;
                break;
            case 9:
                i19 = com.tencent.mm.R.raw.actionbar_particular_icon;
                break;
        }
        if (i19 != 0) {
            android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context2, i19, context2.getResources().getColor(com.tencent.mm.R.color.FG_2));
            e17.setBounds(0, 0, com.tencent.mm.ui.zk.a(context2, 12), com.tencent.mm.ui.zk.a(context2, 12));
            al5.w wVar = new al5.w(e17, 1);
            android.text.SpannableString spannableString = new android.text.SpannableString("@");
            spannableString.setSpan(wVar, 0, 1, 33);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = mmVar.f380637f;
            ((ke0.e) xVar2).getClass();
            sb6.append(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, str2).toString());
            sb6.append(' ');
            i27 = android.text.TextUtils.concat(sb6.toString(), spannableString);
            kotlin.jvm.internal.o.d(i27);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizProfileMenuAdapter", "get empty res id, username: %s, icon show type: %d", mmVar.f380637f, java.lang.Integer.valueOf(mmVar.f380643o));
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = mmVar.f380637f;
            ((ke0.e) xVar3).getClass();
            i27 = com.tencent.mm.pluginsdk.ui.span.c0.i(context2, str3);
        }
        android.view.View view2 = cVar.f456214d;
        i18 = i17 != 0 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/menu/BizProfileMenuAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView2.setText(i27);
        holder.itemView.setOnClickListener(new xr3.d(this, i17));
        if (this.f456230f) {
            return;
        }
        int i29 = mmVar.f380636e;
        if (i29 != 5) {
            if (i29 != 7) {
                return;
            }
            bw5.nf0 nf0Var = mmVar.f380644p;
            if (((nf0Var == null || (b17 = nf0Var.b()) == null) ? null : b17.f()) == null) {
                return;
            }
        }
        ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Rh(com.tencent.mm.plugin.appbrand.service.x6.W);
        this.f456230f = true;
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488685a22, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new xr3.c(inflate);
        }
        if (i17 != 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488682a16, parent, false);
            kotlin.jvm.internal.o.d(inflate2);
            return new xr3.a(inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488684a21, parent, false);
        kotlin.jvm.internal.o.d(inflate3);
        return new xr3.b(inflate3);
    }
}
