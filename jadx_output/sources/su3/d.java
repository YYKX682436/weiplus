package su3;

/* loaded from: classes3.dex */
public final class d extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f412775d;

    /* renamed from: e, reason: collision with root package name */
    public int f412776e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f412777f;

    public d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f412775d = arrayList;
        ou3.j jVar = ou3.j.f348958a;
        arrayList.add(jVar.b(ou3.h.f348944e));
        arrayList.add(jVar.b(ou3.h.f348945f));
        arrayList.add(jVar.b(ou3.h.f348946g));
        arrayList.add(jVar.b(ou3.h.f348947h));
        arrayList.add(jVar.b(ou3.h.f348948i));
        arrayList.add(jVar.b(ou3.h.f348949m));
        arrayList.add(jVar.b(ou3.h.f348950n));
        arrayList.add(jVar.b(ou3.h.f348951o));
        arrayList.add(jVar.b(ou3.h.f348952p));
        arrayList.add(jVar.b(ou3.h.f348953q));
        arrayList.add(jVar.b(ou3.h.f348954r));
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f412775d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem) this.f412775d.get(i17)).f155703d.f440014d;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder instanceof su3.b) {
            if (this.f412776e == i17) {
                android.view.View view = ((su3.b) holder).f412770d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/adapter/ImproveRecordMaasFilterAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/adapter/ImproveRecordMaasFilterAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = ((su3.b) holder).f412770d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/adapter/ImproveRecordMaasFilterAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/ui/adapter/ImproveRecordMaasFilterAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.lang.Object obj = this.f412775d.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem improveRecordMaasFilterItem = (com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem) obj;
            su3.b bVar = (su3.b) holder;
            bVar.f412772f.setText(improveRecordMaasFilterItem.f155705f);
            android.graphics.drawable.Drawable background = bVar.f412771e.getBackground();
            kotlin.jvm.internal.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((android.graphics.drawable.GradientDrawable) background).setColor(improveRecordMaasFilterItem.f155707h);
        } else if (holder instanceof su3.a) {
            if (this.f412776e == 0) {
                android.view.View view3 = ((su3.a) holder).f412769d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/adapter/ImproveRecordMaasFilterAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/recordvideo/ui/adapter/ImproveRecordMaasFilterAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view4 = ((su3.a) holder).f412769d;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(4);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/ui/adapter/ImproveRecordMaasFilterAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/recordvideo/ui/adapter/ImproveRecordMaasFilterAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        holder.itemView.setOnClickListener(new su3.c(this, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        vt3.m mVar = vt3.m.f440011e;
        if (i17 == 2) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bky, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new su3.b(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bkz, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return new su3.a(inflate2);
    }
}
