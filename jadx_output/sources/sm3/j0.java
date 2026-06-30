package sm3;

/* loaded from: classes5.dex */
public final class j0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.LayoutInflater f409881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.widget.TimeSpansView f409882e;

    public j0(com.tencent.mm.plugin.mv.ui.widget.TimeSpansView timeSpansView) {
        this.f409882e = timeSpansView;
        this.f409881d = android.view.LayoutInflater.from(timeSpansView.getContext());
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return (int) java.lang.Math.ceil(r0.getTotalDuration() / this.f409882e.f152052c2);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        sm3.i0 holder = (sm3.i0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        double d17 = i17 * this.f409882e.f152052c2;
        holder.f409876d.setText(y46.b.a((long) d17, d17 >= 3600000.0d ? "H:mm:ss" : "mm:ss", true));
        if (i17 == getItemCount() - 1) {
            android.view.View view = holder.f409877e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpansAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpanViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpansAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpanViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = holder.f409877e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpansAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpanViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpansAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/mv/ui/widget/TimeSpansView$SpanViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = this.f409881d.inflate(com.tencent.mm.R.layout.c4o, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new sm3.i0(inflate);
    }
}
