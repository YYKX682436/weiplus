package cp4;

/* loaded from: classes8.dex */
public final class k0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f221041d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f221042e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f221043f;

    /* renamed from: g, reason: collision with root package name */
    public int f221044g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cp4.g1 f221045h;

    public k0(cp4.g1 g1Var, int i17, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f221045h = g1Var;
        this.f221041d = i17;
        this.f221042e = context;
        this.f221043f = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f221043f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        android.view.View itemView = viewHolder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        java.util.ArrayList arrayList = this.f221043f;
        com.tencent.mm.protobuf.g gVar = ((r45.is) arrayList.get(i17)).f377297d;
        if (android.text.TextUtils.isEmpty(gVar == null ? "" : gVar.h(com.tencent.mapsdk.internal.rv.f51270c)) || ((r45.is) arrayList.get(i17)).f377300g) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(itemView, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            itemView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(itemView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(itemView, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            itemView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(itemView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f221044g == i17) {
                x(itemView, (r45.is) arrayList.get(i17));
            } else {
                y(itemView);
            }
            android.widget.TextView textView = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.f483544b62);
            com.tencent.mm.protobuf.g gVar2 = ((r45.is) arrayList.get(i17)).f377297d;
            textView.setText(gVar2 == null ? "" : gVar2.h(com.tencent.mapsdk.internal.rv.f51270c));
        }
        viewHolder.itemView.setOnClickListener(new cp4.i0(this, i17, this.f221045h));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f221042e).inflate(com.tencent.mm.R.layout.a5r, parent, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new cp4.j0((android.view.ViewGroup) inflate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005a, code lost:
    
        if (r12.f377300g == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(android.view.View r11, r45.is r12) {
        /*
            r10 = this;
            if (r11 != 0) goto L3
            return
        L3:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.ThreadLocal r1 = zj0.c.f473285a
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.add(r1)
            java.util.Collections.reverse(r0)
            java.lang.Object[] r3 = r0.toArray()
            java.lang.String r4 = "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter"
            java.lang.String r5 = "selectView"
            java.lang.String r6 = "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/CCTransResult;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setAlpha"
            java.lang.String r9 = "(F)V"
            r2 = r11
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r11.setAlpha(r0)
            java.lang.String r3 = "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter"
            java.lang.String r4 = "selectView"
            java.lang.String r5 = "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/CCTransResult;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r8 = "(F)V"
            r2 = r11
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
            r0 = 2131299492(0x7f090ca4, float:1.8216987E38)
            android.view.View r11 = r11.findViewById(r0)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            if (r12 == 0) goto L5d
            boolean r12 = r12.f377300g
            r0 = 1
            if (r12 != r0) goto L5d
            goto L5e
        L5d:
            r0 = r1
        L5e:
            if (r0 == 0) goto L65
            r12 = 4
            r11.setVisibility(r12)
            goto L77
        L65:
            android.content.Context r12 = r11.getContext()
            r0 = 2131690997(0x7f0f05f5, float:1.9011053E38)
            r2 = -1
            android.graphics.drawable.Drawable r12 = com.tencent.mm.ui.uk.e(r12, r0, r2)
            r11.setImageDrawable(r12)
            r11.setVisibility(r1)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cp4.k0.x(android.view.View, r45.is):void");
    }

    public final void y(android.view.View view) {
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.5f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter", "unSelectView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$EditorCaptionAdapter", "unSelectView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483546b64)).setVisibility(4);
    }
}
